

A Machine Learning powered Android application that helps pharmacies predict revenue, manage inventory, and scan prescriptions using Computer Vision.

---

# 📌 Project Overview

The Smart Pharmacy Management System is an intelligent pharmacy management solution developed using Machine Learning, FastAPI, Android Studio, and Google ML Kit.

The system predicts future pharmacy revenue, identifies medicines that require reordering, and extracts text from prescription images using OCR technology.

This project was developed for the **Machine Learning Module** at **NIBM**.

---

# 🚀 Features

## 📈 Revenue Forecasting
- Predict pharmacy revenue using Machine Learning.
- Uses the trained XGBoost model.
- FastAPI backend integration.
- Real-time prediction.

---

## 💊 Inventory Reorder Prediction
- Predict whether medicines need reordering.
- Helps reduce stock shortages.
- Machine Learning based prediction.

---

## 📷 Prescription Scanner
- Upload prescription image.
- Extract medicine names using Google ML Kit OCR.
- Supports printed prescriptions.

---

## 📊 Reports
- View prediction results.
- Display application outputs.

---

## ℹ About
- Project information
- Technologies used

---

# 🛠 Technologies Used

## Mobile Application

- Java
- XML
- Android Studio

## Backend

- FastAPI
- Python
- Uvicorn

## Machine Learning

- XGBoost
- Random Forest
- Linear Regression
- Scikit-learn
- Pandas
- NumPy

## Computer Vision

- Google ML Kit OCR

---

# 🧠 Machine Learning Models

| Model            |           Purpose |
|------------------|-------------------|
| XGBoost          | Revenue Prediction |
| Random Forest    | Revenue Comparison |
| Linear Regression| Baseline Model     |
| Inventory Model  | Reorder Prediction |

---

# 📂 Project Structure

```
Smart Pharmacy Management System

│
├── Android App
│   ├── Java Files
│   ├── XML Layouts
│   ├── Activities
│   └── Retrofit API
│
├── FastAPI Backend
│   ├── app.py
│   ├── pharmacy_sales_model.pkl
│   ├── inventory_reorder_model.pkl
│   └── requirements.txt
│
├── Machine Learning
│   ├── Google Colab Notebook
│   ├── Dataset
│   ├── Training Code
│   └── Model Files
│
└── README.md
```

---

# 📊 Dataset

Dataset Source:

Kaggle Pharmacy Sales Dataset

Dataset contains:

- Medicine Name
- Category
- Quantity Sold
- Unit Price
- Revenue
- Month
- Year

---

# ⚙ Installation

## Clone Repository

```bash
git clone https://github.com/yourusername/Smart-Pharmacy-Management-System.git
```

---

## Android Application

Open the project using Android Studio.

Build the project.

Run on Emulator or Android Device.

---

## Backend

Install dependencies

```bash
pip install -r requirements.txt
```

Run FastAPI

```bash
uvicorn app:app --host 0.0.0.0 --port 8000
```

Open browser

```
http://127.0.0.1:8000/docs
```

---

# 📱 Application Screens

## Dashboard

(Add Screenshot)

---

## Revenue Prediction

(Add Screenshot)

---

## Inventory Prediction

(Add Screenshot)

---

## Prescription Scanner

(Add Screenshot)

---

## Reports

(Add Screenshot)

---

# 📈 Machine Learning Results

| Model | MAE | RMSE | R² Score |
|--------|------|--------|----------|
| Linear Regression | 645.327 | 875.975 | 0.922 |
| Random Forest | 66.317 | 96.788 | 0.999 |
| XGBoost | 55.987 | 95.273 | 0.999 |

XGBoost was selected as the final deployed model.

---

# 🔄 System Workflow

```
User

↓

Android App

↓

FastAPI API

↓

Machine Learning Model

↓

Prediction

↓

Display Result
```

---

# 📷 Prescription Scanner Workflow

```
Prescription Image

↓

Google ML Kit OCR

↓

Extract Text

↓

Display Medicines
```

---

# 🎯 Future Improvements

- Handwritten Prescription Recognition
- Firebase Database Integration
- Online Medicine Ordering
- AI Health Assistant
- Medicine Recommendation System
- Barcode Scanner
- Sales Analytics Dashboard

---

# 📚 References

- https://scikit-learn.org
- https://fastapi.tiangolo.com
- https://developer.android.com
- https://developers.google.com/ml-kit
- https://xgboost.readthedocs.io

---

# 👩‍💻 Developer

**Lakmali**

Higher National Diploma in Software Engineering (HNDSE)

NIBM Kandy

Machine Learning Module

2026

---

# ⭐ Project Status

✅ Revenue Forecasting

✅ Inventory Prediction

✅ Android Application

✅ FastAPI Backend

✅ Google ML Kit OCR

✅ Machine Learning Integration

---

If you like this project, don't forget to ⭐ Star this repository!
