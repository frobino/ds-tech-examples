package com.javacodegeeks.examples.wordcount;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

/**
 * Map tasks (Spilts & Mapping)
 * 
 * Mapper doing the following 2 things:
 *  - create a list of words by tokenizing the input text based on "space" 
 *  - traverse over all the tokens and emit a key-value pair of each word with a count of one
 */
public class MapClass extends Mapper<LongWritable, Text, Text, IntWritable>{
	 
    private final static IntWritable one = new IntWritable(1);
    private Text word = new Text();
    
    @Override
    protected void map(LongWritable key, Text value,
			Context context)
			throws IOException, InterruptedException {
		
		String line = value.toString();
		StringTokenizer st = new StringTokenizer(line," ");
		
		while(st.hasMoreTokens()){
			word.set(st.nextToken());
			context.write(word,one);
		}
		
	}
}
