# WinterDash
LeetCode intensified 

#### Day 1 - Dec 15
116-129 (14)

#### Day 2 - Dec 16
```
130 - 138, 581 (10) 1:26勉强完成 <br>
130 我觉得自己写的还可以，贴了：[130 bfs super concise](https://leetcode.com/problems/surrounded-regions/discuss/453448/java-concise-bfs)<br>
137这种 deep copy, HashMap通吃不要太爽
```

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
10.30 #3  直接秒
12:06 #76 不愧是hard..真tm难。答案用array的 吊打自己用的双hashmap，【#76】重点题
12:20 #159 Review. 前天刚做完 
12:49 #239 sliding window maximum. 可以 单调队列 继续背诵并默写。
13:21 #340 k different , 2 different 升级版，不过方法都一样的。。
15:14 #424 这题可是真的不容易想，可能明天就忘了咋做的了。核心思想是:
           1.假设没有 k limit， 则return s.length() - maxFreq of the chars in s
           2.有k limit, 当滑窗 (right-left+1) - maxFreq of chars in sub_s > k时 (最多改k个)
             缩小范围，left++; else right++,同时更新最大频率。
           3. 边界条件 right < n 即可，因为max一定会被记录，之后当right 到边界之后，left只会不断缩小范围，不可能再更新max
16:14 #480 Sliding Window Media. 这个tag是真的难，每道看答案都得看半天才看懂,唉

```
#### Day 6 - Dec 21
垃圾ups毁我一天 不等了 md AMAZON MDZZ..
```
13:45 #567 随手一个26 array 就92%了？ 这题8太行啊。。
15:30 #727 真滴难。最初方法用sliding window只9%. 后来参考[解答链接](https://leetcode.com/problems/minimum-window-subsequence/discuss/109356/JAVA-two-pointer-solution-(12ms-beat-100)-with-explaination)才67%. 核心思想是two pointers, right pointer 一直向右移动知道最后一个t的所有char全被匹配，然后再从right往前check
15:43 #979 最长波动数列。这个答案非常巧，O(1) space，keep inc, dec variable即可。
16:19 #200 Number of Islands Review.
17:00 #168 这么个菜鸡题我竟然做了这么长时间。。DISHONORED.....
17:17 #169 O(1)space的就不看了 摩尔投票法，会写了也不会解释
17:24 #171 秒了
```
#### Day 7 - Dec 22
```
12:40 #1004, #424升级版，跟424比起来简直菜啊
13:28 #1100, 大佬的code是真的简洁精炼 自己写了半天也没写对
14:00 #1151, 思路还是有卡顿，不过AC了
```

#### Day 8 - Dec 26
ok 假期结束 继续干活
```
Facebook TAG: 23,31,34,56,67,71,76,98,124,125
```

#### Day 9 - Dec 28
```
Facebook TAG:
12:30 133
13:00 139(dp可秒)
13:59 157 👀看在fb份上做了
14:54 158 _(:з」∠)_ 明天再做一遍吧。。
15:46 208 解锁新结构prefix Trie！
16:25 211 和208 类似。。过几天再做一遍。。
16:49 79 被虐哭了 还是那句话：别以为自己稳了。_(:з」∠)_
17:29 212 Trie + DFS 真的难。

22:30 复习开始
133,139,157
```

#### Day 10 - Dec 29
```
14:00 #173 把inorder-traversal分解到function中。。
14:20 #199 复习 1种是recursion, 每个深度只取最右值，第二种是level-order traversal, 每次只取每层最后一个TreeNode加入result list即可
14:49 #215 ok 复习了一边quickselect. 关于i,j理解问题，只要考虑i就好了，j就是个遍历指针，检测到nums[j]比pivot小，就把它与nums[i]交换，i++, 形象点就是把nums[j]丢到i左边
15:13 #238 两遍遍历，记录除自己外的左乘积和右成绩，最后把二者相乘
15:57 #253 会议室allocate 这是个经典题。高妙的咱也不求了，就简单的minHeap了
17:20 #269 Alien Dictionary 这题可太难了。。可能是我要背的题里最难背的了。【现已加入每日默写套餐】
```

#### Day 11 - Dec 30
```
14:00 #270 二叉树查找
14:58 #273 Integer to English Words
15:30 #278 二分
17:11 #282 硬仗啊。。Expression Add Operators 【现已加入每日默写套餐】
17:44 #297 老题 iterative seralize*deserialize tree in level-order.
```

#### Day 12 - Dec 31
```
14:40 #301 Remove Invalid Parentheses. 看的huahua的视频解答。DFS
15:53 #221 Maximal Square. DP tricks 极致
16:15 #304 Square Sum. 还是看的花花的解答，221解法
16:58 #340 Review. 滑窗的一道题
17:11 #349 简单hashset
17:20 #415 string加法，跟linkedlist 加法一个意思，秒了

```

#### Day 13 - Jan 3
```
12:00 438. Find All Anagrams in a String. 滑窗，用的76的套路，简化了一下
13:30 523. Continuous Subarray Sum. 这个题坑挺多的，但参考的
https://buptwc.com/2018/07/10/Leetcode-523-Continuous-Subarray-Sum/ 写的很好
13:41 543. Review: Diameter of Binary Tree, 递归，iterative都写了
15:36 560. 这题和523有相似之处，只不过因为要count,把hashset换成map
```