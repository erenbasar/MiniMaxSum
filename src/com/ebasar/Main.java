package com.ebasar;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static com.ebasar.Main.Result.*;
import static java.util.stream.Collectors.toList;


import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        miniMaxSum(list);
    }



    class Result {

        /*
         * Complete the 'miniMaxSum' function below.
         *
         * The function accepts INTEGER_ARRAY arr as parameter.
         */

        public static void miniMaxSum(List<Integer> arr) {
            long maxSum = -Long.MAX_VALUE;
            long minSum = Long.MAX_VALUE;
            long totalSum= 0;

            for(int i = 0;i<arr.size();i++)
                totalSum = totalSum+arr.get(i);

            for(int i = 0;i<arr.size();i++){
                if (totalSum-arr.get(i) >= maxSum)
                    maxSum = totalSum-arr.get(i);

                if(totalSum - arr.get(i) <= minSum)
                    minSum = totalSum-arr.get(i);
            }

            System.out.print(minSum);
            System.out.print(" ");
            System.out.print(maxSum);

        }

    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            Result.miniMaxSum(arr);

            bufferedReader.close();
        }
    }

}
