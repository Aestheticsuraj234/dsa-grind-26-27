# DSA Grind 2026–27 — Instructor Guide

Welcome to the **DSA Grind** repository. This repo is the single source of truth for notes, solved problems, and reference implementations across our Data Structures & Algorithms curriculum.

---

## Who this repo is for

- **Students** — follow along topic by topic, read the notes, and study solutions in your preferred language.
- **Instructor (me)** — all original content (notes, walkthroughs, and solutions) is authored in **Java only**. Solutions in other languages are provided for accessibility; Java remains the canonical reference.

---

## Languages

Solutions are provided in four languages. Java lives in the Maven source tree; the other three stay under each topic folder.

| Language   | Location |
|------------|----------|
| Java       | `src/main/java/topics/<topic>/solutions/` |
| Python     | `topics/<topic>/solutions/python/` |
| C++        | `topics/<topic>/solutions/cpp/` |
| JavaScript | `topics/<topic>/solutions/javascript/` |

> **Note:** I write and maintain everything in **Java**. The other three language folders exist so students can compare approaches in a language they are comfortable with. Those versions may be contributed or translated over time — always treat the Java solution as the primary reference.

---

## Repository structure

This is a **Maven** project (Java 21). All Java code follows standard Maven layout while mirroring the same topic folder names.

```
dsa-grind-26-27/
├── pom.xml
├── instructors.md
├── src/main/java/topics/       ← all Java (practice + solutions)
│   └── arrays/
│       ├── practice/           ← package: topics.arrays.practice
│       │   └── Arrays.java
│       └── solutions/          ← package: topics.arrays.solutions
│           └── TwoSum.java
└── topics/                     ← notes + non-Java solutions
    └── arrays/
        ├── notes/
        └── solutions/
            ├── python/
            ├── cpp/
            └── javascript/
```

### Per-topic layout

| Path | Contents |
|------|----------|
| `topics/<topic>/notes/` | Markdown notes — definitions, patterns, time/space complexity, Java code snippets |
| `src/main/java/topics/<topic>/practice/` | Java practice files (`package topics.<topic>.practice`) |
| `src/main/java/topics/<topic>/solutions/` | Java solution files (`package topics.<topic>.solutions`) |
| `topics/<topic>/solutions/<lang>/` | Python, C++, or JavaScript solutions (one file per problem) |

### Package naming

The package must match the folder path under `src/main/java/`:

| File path | Package |
|-----------|---------|
| `src/main/java/topics/arrays/practice/Arrays.java` | `topics.arrays.practice` |
| `src/main/java/topics/arrays/solutions/TwoSum.java` | `topics.arrays.solutions` |

---

## Build & run (Java)

Uses **Java 21** and the Maven Wrapper (`./mvnw`) — no global Maven install required.

```bash
# Compile all Java sources
./mvnw compile

# Run a practice class
./mvnw exec:java -Dexec.mainClass="topics.arrays.practice.Arrays"
```

---

## Topics covered

| # | Topic | Folder |
|---|-------|--------|
| 1 | Arrays | `topics/arrays/` |
| 2 | Strings | `topics/strings/` |
| 3 | Hashing | `topics/hashing/` |
| 4 | Two Pointers | `topics/two-pointers/` |
| 5 | Sliding Window | `topics/sliding-window/` |
| 6 | Sorting | `topics/sorting/` |
| 7 | Binary Search | `topics/binary-search/` |
| 8 | Recursion | `topics/recursion/` |
| 9 | Backtracking | `topics/backtracking/` |
| 10 | Linked Lists | `topics/linked-lists/` |
| 11 | Stacks | `topics/stacks/` |
| 12 | Queues | `topics/queues/` |
| 13 | Trees | `topics/trees/` |
| 14 | Heaps | `topics/heaps/` |
| 15 | Graphs | `topics/graphs/` |
| 16 | Dynamic Programming | `topics/dynamic-programming/` |
| 17 | Greedy | `topics/greedy/` |
| 18 | Bit Manipulation | `topics/bit-manipulation/` |
| 19 | Math | `topics/math/` |
| 20 | Matrix | `topics/matrix/` |
| 21 | Tries | `topics/tries/` |
| 22 | Union Find | `topics/union-find/` |

---

## How to use this repo (students)

1. **Pick a topic** from the table above and open its folder.
2. **Read the notes first** — understand the pattern before jumping to code.
3. **Try the problem yourself** before peeking at the solution.
4. **Compare solutions** — start with `java/`, then check your language folder if you need a different syntax.
5. **Practice consistently** — one topic at a time beats random grinding.

---

## Naming conventions

### Notes
- Use descriptive filenames: `basics.md`, `patterns.md`, `faq.md`
- Code snippets inside notes should be **Java**

### Solutions
- **Java:** one public class per file, PascalCase (e.g. `TwoSum.java` in `src/main/java/topics/arrays/solutions/`)
- **Other languages:** one file per problem, kebab-case slug
  - `two-sum.py`, `two-sum.cpp`, `two-sum.js`

### Problem slug rules
- Lowercase, hyphen-separated
- Match the common problem name (LeetCode-style slugs work well)

---

## Instructor workflow

1. Create or update notes under `topics/<topic>/notes/` (Java examples only).
2. Add Java practice code under `src/main/java/topics/<topic>/practice/`.
3. Add Java solutions under `src/main/java/topics/<topic>/solutions/`.
4. Optionally add Python, C++, or JavaScript versions under `topics/<topic>/solutions/<lang>/`.
5. Run `mvn compile` to verify before committing.
6. Keep commits focused — one topic or one problem per commit when possible.

---

## Contributing (students)

- Found a bug in a solution? Open an issue or submit a fix.
- Want to add a Python/C++/JS translation? Place it in the correct language folder and match the Java solution’s logic.
- Do **not** change the Java reference solution without discussing it first.

---

## Resources

- [LeetCode](https://leetcode.com/)
- [NeetCode](https://neetcode.io/)
- [Visualgo](https://visualgo.net/) — algorithm visualizations

---

*Last updated: September 2026 · DSA Grind 2026–27*
