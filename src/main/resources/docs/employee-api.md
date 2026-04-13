# 👨‍💼 Employee API

## 🔹 Base URL

```
http://localhost:8080/api/employees
```

---

## 📍 1. Get All Employees

**Endpoint:**

```
GET /api/employees
```

**Description:**
Retrieve all employees from the system.

**Response:**

```json
[
  {
    "id": 1,
    "fullName": "John Doe",
    "email": "john.doe@example.com",
    "phoneNumber": "9876543210",
    "status": "ACTIVE"
  }
]
```

---

## 📍 2. Create Employee

**Endpoint:**

```
POST /api/employees
```

**Description:**
Create a new employee.

**Request Body:**

```json
{
  "fullName": "John Doe",
  "email": "john.doe@example.com",
  "phoneNumber": "9876543210",
  "status": "ACTIVE"
}
```

**Response:**

```json
{
  "id": 1,
  "fullName": "John Doe",
  "email": "john.doe@example.com",
  "phoneNumber": "9876543210",
  "status": "ACTIVE"
}
```

---

## 📍 3. Get Employee By ID

**Endpoint:**

```
GET /api/employees/{id}
```

**Example:**

```
GET /api/employees/1
```

**Description:**
Retrieve employee details by ID.

**Response:**

```json
{
  "id": 1,
  "fullName": "John Doe",
  "email": "john.doe@example.com",
  "phoneNumber": "9876543210",
  "status": "ACTIVE"
}
```

---

## 📍 4. Delete Employee

**Endpoint:**

```
DELETE /api/employees/{id}
```

**Example:**

```
DELETE /api/employees/1
```

**Description:**
Delete an employee by ID.

**Response:**

```
204 No Content
```

---

## ❗ Error Responses

| Status Code | Description           |
| ----------- | --------------------- |
| 400         | Bad Request           |
| 404         | Employee Not Found    |
| 500         | Internal Server Error |

---

## 🧾 Notes

* All responses are in JSON format
* `id` is auto-generated
* Ensure valid request body when creating employee
* `status` field is optional depending on implementation
