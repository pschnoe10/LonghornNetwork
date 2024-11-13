# LonghornNetwork
## ECE 422C Lab 5: Networking with Fellow Longhorns!

### Longhorn Network

### Overview
This project simulates a social network called **Longhorn Network**, where students are matched with roommates, assigned to pods, and find referral paths for internships.

### Key Objectives
1. Implement the **Gale-Shapley** algorithm for roommate assignment.
2. Form pods using **Prim’s algorithm** based on connection strengths.
3. Find internship referral paths using **Dijkstra’s algorithm**.
4. Use **multithreading** to simulate real-time actions like friend requests and chatting.

---

### Getting Started

#### Folder Structure
- `src/`: Contains the main code files.
- `input_sample.txt`: Sample input file format.
- `README.md`: Project instructions.

#### Prerequisites
- **Java** (version X.X)
- Basic knowledge of graph algorithms, threading, and file I/O.

---

### Instructions

#### Step 1: Setting Up
1. **Fork** this repository to start working on your own copy.
2. **Clone** the repository to your local machine:
   ```bash
   git clone https://github.com/yourusername/LonghornNetwork.git

### Step 2: Implementing Core Components

- **Data Parsing**: Implement `parseStudents` in `DataParser.java` to read from `input.txt` and create `UniversityStudent` objects.
- **Student and UniversityStudent Classes**: Extend `Student.java` to create a `UniversityStudent` class that calculates connection strengths.
- **Roommate Matching with Gale-Shapley**: Use the provided `GaleShapley.java` to complete roommate matching.
- **Pod Formation**: Implement `PodFormation.java` to use Prim’s algorithm to form pods.
- **Referral Path Finding**: Implement `ReferralPathFinder.java` to use Dijkstra’s algorithm for referral path finding.
- **Multithreading**: Complete `FriendRequestThread.java` and `ChatThread.java` to simulate real-time student interactions.

