package hackerrank.greedyalgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Difficulty: Easy
https://www.hackerrank.com/challenges/luck-balance/problem

Input:
k = 3

contests =
5 1
2 1
1 1
8 1
10 0
5 0

Output:
29

*/
public class LuckBalance {
    public int luckBalance(int k, int[][] contests) {
        List<Integer> important = new ArrayList<>();

        int maxLuck = 0;

        for (int i = 0; i < contests.length; i++) {
            int luck = contests[i][0];
            int type = contests[i][1];

            if (type == 1) {
                important.add(luck);
            } else {
                maxLuck += luck;
            }
        }

        Collections.sort(important, Collections.reverseOrder());

        for (int i = 0; i < important.size(); i++) {
            maxLuck = i < k ? maxLuck + important.get(i) : maxLuck - important.get(i);
        }

        return maxLuck;
    }
}
