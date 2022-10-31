# bharali_anamika_002776402
<img width="468" alt="image" src="https://user-images.githubusercontent.com/114001023/198928031-370f87eb-bbe3-4646-8d79-e4f4258aa3ff.png">
Find my diagram here  Class Diagram link

I have used inheritance in patient and doctor classes where they inherit all person attributes from person class.
I have created doctor directory, patient directory, city directory, community directory, appointment directory, hospital directory, house directory, person directory as static classes as all login types will require to use these directories.
Project Description: 
•	Doctor ID, Patient ID, Appointment ID are unique. 
•	Hospital names are unique, and hospitals can be searched with their names.
•	Phone numbers must be of 10 digits and are unique for each individual or business entity.
•	Each community has only a community code like a pin code but doesn’t have a name.
•	There are 5 login types:
1.	System Admin: Can CRUD person, doctors, patients, appointments, hospitals, cities, communities, houses etc.
2.	Community Admin: Can CRUD hospitals in and out of their community.
3.	Hospital Admin: Can CRUD doctors in and out of their hospital.
4.	Doctor: Can log vital signs and give a diagnosis to a patient while also searching the patients’ past appointments.
5.	Patient: 
5.1.	Patient can search hospitals and doctors and their respective phone numbers according to community code or city name.
5.2.	Patients can also access their appointments-future or past with their patient ID.
![image](https://user-images.githubusercontent.com/114001023/198928046-891df87f-ef49-4c59-90e7-aff1c0523e23.png)
