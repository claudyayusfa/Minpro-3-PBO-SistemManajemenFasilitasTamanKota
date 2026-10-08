# Sistem Manajemen Fasilitas Taman Kota 🌞🐝🌸🌿

Program **Sistem Manajemen Fasilitas Taman Kota** adalah program berbasis Java yang digunakan untuk mengelola data fasilitas yang terdapat pada taman kota. Program ini dikembangkan dari Mini Project 2 dengan menggunakan konsep **Object-Oriented Programming (OOP)** dan struktur **Model-View-Controller (MVC)**.
  
Program Sistem Manajemen Fasilitas Taman Kota dapat mengelola dua kategori fasilitas, yaitu **Fasilitas Umum** dan **Fasilitas Olahraga**. Pada program ini, disediakan fitur untuk menampilkan, menambahkan, menghapus, dan memperbarui data fasilitas.
  
Pada Mini Project 3, program dikembangkan dengan menerapkan:

- polymorphism (overriding dan overloading)
- abstraction (abstract class dan abstract method)
- interface

---

## 1. Fitur Program

Program memiliki beberapa fitur utama, yaitu:

- Menampilkan seluruh data fasilitas taman kota.
- Menambahkan fasilitas umum atau fasilitas olahraga.
- Membuat ID fasilitas secara otomatis.
- Memperbarui data fasilitas berdasarkan ID fasilitas.
- Menghapus data fasilitas berdasarkan ID fasilitas.
- Memvalidasi input pengguna.
- Menampilkan kategori fasilitas.
- Mengevaluasi kelayakan fasilitas berdasarkan kondisi secara otomatis.

Evaluasi kelayakan fasilitas terdiri dari:

| Kondisi | Hasil Evaluasi |
|---|---|
| Baik | Fasilitas layak digunakan |
| Cukup | Fasilitas perlu dipantau |
| Rusak | Fasilitas perlu perbaikan |

---

## 2. Struktur Package

Program ini menggunakan **Model-View-Controller (MVC)** dengan tambahan package `helper`.

<img width="746" height="582" alt="image" src="https://github.com/user-attachments/assets/7b06fd07-4741-4832-ac72-253166182f78" />

### 2.1 Model

Package `models` menyimpan class dan interface yang berhubungan dengan data dan karakteristik fasilitas.

- `Fasilitas` adalah **abstract superclass** yang menyimpan atribut umum fasilitas.
- `FasilitasUmum` adalah subclass untuk fasilitas umum.
- `FasilitasOlahraga` adalah subclass untuk fasilitas olahraga.
- `Evalutable` adalah interface untuk mengevaluasi kelayakan fasilitas.

### 2.2 View

Package `view` berisi class `FasilitasView` yang menangani tampilan program dan interaksi pengguna seperti menampilkan menu, data fasilitas, pesan, dan menerima input.

### 2.3 Controller

Package `controller` berisi class `FasilitasController` yang mengatur proses pengolahan data seperti **Create, Read, Update, dan Delete (CRUD)**.

Controller juga mengelola `ArrrayList<Fasilitas>` sebagai tempat penyimpanan data selama program berjalan.

### 2.4 Helper

Package `helper` berisi class `InputHelper` yang digunakan untuk menangani dan memvalidasi input pengguna.

