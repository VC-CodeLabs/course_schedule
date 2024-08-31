# Course Schedule

## Description
There are a total of <code>numCourses</code> courses you have to take, labeled from 0 to <code>numCourses - 1</code>. You are given an array <code>prerequisites</code> where <code>prerequisites[i] = [a<sub>i</sub>, b<sub>i</sub>]</code> indicates that you must take course <code>b<sub>I</sub></code> first if you want to take course <code>a<sub>i</sub></code>.

For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1. Return true if you can finish all courses. Otherwise, return false.

**Evaluation**: The problem will be evaluated by speed, the fastest 3 solutions win (independent of a language).

## Examples
**Example 1**:<br>
**Input**: numCourses = 2, prerequisites = [[1,0]]<br>
**Output**: true <br>
**Explanation**: There are a total of 2 courses to take. To take course 1 you should have finished course 0. So it is possible.<br>

**Example 2**:<br>
**Input**: numCourses = 2, prerequisites = [[1,0],[0,1]] <br>
**Output**: false <br>
**Explanation**: There are a total of 2 courses to take. To take course 1 you should have finished course 0, and to take course 0 you should also have finished course 1. So it is impossible.<br>

## Constraints
- 1 <= numCourses <= 2000
- 0 <= prerequisites.length <= 5000
- prerequisites[i].length == 2
- 0 <= a<sub>i</sub>, b<sub>i</sub> < numCourses
- All the pairs prerequisites[i] are unique.

## Reference  
**Leetcode URL**: https://leetcode.com/problems/course-schedule/description/
