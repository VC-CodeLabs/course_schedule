import java.util.*;

public class Courses {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> prereqMap = new HashMap<>();
        for (int i = 0; i < numCourses; i++) {
            prereqMap.put(i, new ArrayList<>());
        }
        for (int[] pair : prerequisites) {
            int course = pair[0];
            int prereq = pair[1];

            if (course == prereq) {
                return false;
            }

            prereqMap.get(course).add(prereq);
        }

        Set<Integer> takenCourses = new HashSet<>();

        for (int course = 0; course < numCourses; course++) {
            if (prereqMap.get(course).isEmpty()) {
                takenCourses.add(course);
            }
        }

        while (true) {
            boolean courseTaken = false;

            for (int course = 0; course < numCourses; course++) {
                if (!takenCourses.contains(course)) {
                    if (takenCourses.containsAll(prereqMap.get(course))) {
                        takenCourses.add(course);
                        courseTaken = true;
                        break;
                    }
                }
            }

            if (!courseTaken) {
                break;
            }
        }


        return takenCourses.size() == numCourses;
    }

    public static void main(String[] args) {
        Courses courseSchedule = new Courses();

        int numCourses1 = 2;
        int[][] prerequisites1 = {{1, 0}};
        System.out.println(courseSchedule.canFinish(numCourses1, prerequisites1));
    }
}

