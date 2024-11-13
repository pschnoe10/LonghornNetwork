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
   git clone https://github.com/ayushroychowdhury/LonghornNetwork.git

---

### Step 2: Generate UML Diagram and Javadoc, DUE DATE: Nov 22nd, 2024 11:59pm

- **Generate UML Diagram**:
  - Create a UML diagram based on the class and method signatures.
  - Include core relationships between classes, such as inheritance, aggregation, and associations.
  
- **Write Javadoc**:
  - Generate Javadoc comments for each class and method based on the provided signatures.
  - Include descriptions of parameters and return types.

---

### Step 3: Implement Core Components

- **Data Parsing (DataParser.java)**:
  - Implement `parseStudents` to read from an input file and create `UniversityStudent` objects.
  - Validate input and handle exceptions as needed.

- **Student Class and Subclass**:
  - Implement the `Student` class with required attributes and the abstract method `calculateConnectionStrength`.
  - Extend `Student` to create `UniversityStudent` with methods specific to calculating connection strengths.

- **Roommate Matching (GaleShapley.java)**:
  - Use the provided Gale-Shapley method signature to match roommates based on preferences.
  - Implement and verify stable pairing results.

- **Pod Formation (PodFormation.java)**:
  - Implement Prim’s algorithm to form pods with minimized total connection weights.
  - Update each student’s pod attribute.

- **Referral Path Finding (ReferralPathFinder.java)**:
  - Use Dijkstra’s algorithm to find the shortest path to a student who interned at a specific company.
  - Include functionality for user input to specify the target company.

- **Multithreading for Interactions (FriendRequestThread.java and ChatThread.java)**:
  - Implement multithreading to simulate friend requests and chatting between students.
  - Use Java’s synchronization mechanisms to ensure thread-safe operations on shared resources.

---

### Step 4: Testing and Validation

- **Sample Input**: Run the provided sample input file (`input_sample.txt`) through the program.
- **Verify Output**: Check that the roommate matching, pod formation, and referral path results align with the expected output in `output_sample.txt`.
- **Edge Cases**: Test additional edge cases, such as students with no roommate preferences, missing data, and multithreading interaction.

