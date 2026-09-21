# DSA Grind 2026–27 — Instructor Guide

Welcome to the **DSA Grind** repository. This repo is the single source of truth for notes, solved problems, and reference implementations across our Data Structures & Algorithms curriculum.

---

## Who this repo is for

- **Students** — follow along topic by topic, read the notes, and study solutions in your preferred language.
- **Instructor (me)** — all original content (notes, walkthroughs, and solutions) is authored in **Java only**. Solutions in other languages are provided for accessibility; Java remains the canonical reference.

---

## Languages

Every problem solution is organized under four language folders:

| Folder        | Language   |
|---------------|------------|
| `java/`       | Java       |
| `python/`     | Python     |
| `cpp/`        | C++        |
| `javascript/` | JavaScript |

> **Note:** I write and maintain everything in **Java**. The other three language folders exist so students can compare approaches in a language they are comfortable with. Those versions may be contributed or translated over time — always treat the Java solution as the primary reference.

---

## Repository structure

```
dsa-grind-26-27/
├── instructors.md          ← you are here
└── topics/
    ├── arrays/
    │   ├── notes/          ← concept notes, patterns, complexity (Java examples)
    │   └── solutions/
    │       ├── java/
    │       ├── python/
    │       ├── cpp/
    │       └── javascript/
    ├── strings/
    │   ├── notes/
    │   └── solutions/
    │       ├── java/
    │       ├── python/
    │       ├── cpp/
    │       └── javascript/
    └── ... (one folder per topic)
```

### Per-topic layout

| Path | Contents |
|------|----------|
| `topics/<topic>/notes/` | Markdown or Java-based notes — definitions, patterns, time/space complexity, worked examples |
| `topics/<topic>/solutions/<lang>/` | One file per problem, named clearly (e.g. `two-sum.java`, `two-sum.py`) |

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
- One file per problem: `<problem-slug>.<ext>`
- Examples:
  - `two-sum.java`
  - `two-sum.py`
  - `two-sum.cpp`
  - `two-sum.js`

### Problem slug rules
- Lowercase, hyphen-separated
- Match the common problem name (LeetCode-style slugs work well)

---

## Instructor workflow

1. Create or update notes under `topics/<topic>/notes/` (Java examples only).
2. Add the Java solution under `topics/<topic>/solutions/java/`.
3. Optionally add Python, C++, or JavaScript versions under the respective folders.
4. Keep commits focused — one topic or one problem per commit when possible.

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
