# WinterDash
LeetCode intensified Dec 16 - Jan.1

#### Day 1 - Dec 15
116-129 (14)

#### Day 2 - Dec 16
130 - 138, 581 (10) 1:26勉强完成 <br>
130 我觉得自己写的还可以，贴了：[130 bfs super concise](https://leetcode.com/problems/surrounded-regions/discuss/453448/java-concise-bfs)<br>
137这种 deep copy, HashMap通吃不要太爽

#### Day 3 - Dec 17
```
12:28 199 Finished. 佛了 做完第一题就不想做了
12:54 198 Finished. 这个答案写的好，带着一步步分析dp
13:27 197,151 Finished. gg 吃了没文化的亏
13:55 152 Finished. 大佬是真的np
14:25 153 Finished. 做过等于白做 gg
14:38 154 Finished. 153变体。大佬真的np
15:34 156 Finished. reverseList 的BST版。【重做】
16:02 159 Finished. 滑窗经典，大佬np。[大佬链接](http://www.noteanddata.com/leetcode-159-Longest-Substring-with-At-Most-Two-Distinct-Characters-java-sliding-windows-solution-note.html)
21:47 164 Failed. 弃坑.这题也太坑了
受不了了 这过了150之后一个个都啥破题。。复习trello 
0:00 Search Lv0 (507,50,704,475) Finished.
```

#### Day 4 - Dec 18
```
要被lc垃圾题折磨疯了 浪费时间
13:58 Review:215 好好学习了一下quickselect 太姜了。。
14:10 Review:1046 pq 秒了
14:19 我佛了 怎么突然学不进去了
14:54 Review:969 翻饼 老江湖了
15:13 Review:702 扩展边界Binarysearch 太不细心了
[Search Lv1 Finished.]
15:21 Review:15 3Sum, 老题了，第二遍才AC，长点心吧。。
```

#### Day 5 - Dec 19
```
今天决定刷sliding window..
~10.30： #3 秒
12:06 #76 不愧是hard..真tm难。答案用array的 吊打自己用的双hashmap，【#76】重点题
12:20 #159 Review. 前天刚做完 
12:49 #239 sliding window maximum. 可以 单调队列 继续背诵并默写。
13:21 #340 k different , 2 different 升级版，不过方法都一样的。。
15:14 #424 这题可是真的不容易想，可能明天就忘了咋做的了。核心思想是:
           1.假设没有 k limit， 则return s.length() - maxFreq of the chars in s
           2.有k limit, 当滑窗 (right-left+1) - maxFreq of chars in sub_s > k时 (最多改k个)
             缩小范围，left++; else right++,同时更新最大频率。
           3. 边界条件 right < n 即可，因为max一定会被记录，之后当right 到边界之后，left只会不断缩小范围，不可能再更新max
16:14 #480 Sliding Window Media. 这个tag是真的难，每道看答案都得看半天才看懂，哭了。

```
