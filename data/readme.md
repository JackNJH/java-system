# File Formats

The structure of each `.txt` file used in the system:

## user.txt
- Contains user information.
    - `{userID, username, password, role}`

## customer.txt
- Contains customer information.
    - `{customerID, customerName, customerRoom}`

## manager.txt
- Contains manager information.
    - `{managerID, managerName}`

## technician.txt
- Contains technician information.
    - `{technicianID, technicianName, specialty}`

## appointment.txt
- Contains appointment information.
    - `{appointmentID, managerID, customerID, technicianID, customerRequest, requestDate, requestStatus, requestCompletionDate, customerComment, customerFeedback, paymentStatus, paymentDate, paymentAmount}`

For columns that store data with comments, encapsulate the user remarks in quotes. For example: "Likes apples, oranges". Parsing data this way, we can ignore the commas that occur within quotes. Data structure can be changed if met with any difficulties during implementation.
