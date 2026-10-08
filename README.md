# Sistem Manajemen Fasilitas Taman Kota 🌞🐝🌸🌿

Program **Sistem Manajemen Fasilitas Taman Kota** adalah program berbasis Java yang digunakan untuk mengelola data fasilitas yang terdapat pada taman kota. Program ini dikembangkan dari Mini Project 2 dengan menggunakan konsep **Object-Oriented Programming (OOP)** dan struktur **Model-View-Controller (MVC)**.
  
Program Sistem Manajemen Fasilitas Taman Kota dapat mengelola dua kategori fasilitas, yaitu **Fasilitas Umum** dan **Fasilitas Olahraga**. Pada program ini, disediakan fitur untuk menampilkan, menambahkan, menghapus, dan memperbarui data fasilitas.
  
Pada Mini Project 3, program dikembangkan dengan menerapkan:

- polymorphism (overriding dan overloading)
- abstraction (abstract class dan abstract method)
- interface

---

## 1. Fitur Program 🌱

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

## 2. Struktur Package 📗

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

### 2.5 Main

Package `main` berisi class `Main` sebagai **entry point** untuk menjalankan program dan menghubungkan View dengan Controller. Entry point (titik masuk) adalah metode `main()` yang kode tempat pertama kali program Java mulai dieksekusi.

---

## 3. Alur Program 🛝

Ketika program dijalankan, pengguna akan melihat menu utama:

<img width="546" height="338" alt="image" src="https://github.com/user-attachments/assets/f7259e26-1afb-470a-935a-c7bf9b0690aa" />

Alur penggunaan program adalah sebagai berikut:

1. Program menampilkan menu utama.
2. Pengguna memilih menu 1-5.
3. Menu **Tampilkan Fasilitas** menampilkan seluruh data fasilitas yang tersimpan.
4. Menu **Tambah Fasilitas** meminta pengguna memilih kategori Fasilitas Umum atau Fasilitas Olahraga. ID fasilitas dibuat secara otomatis oleh program.
5. Menu **Hapus Fasilitas** menghapus fasilitas berdasarkan ID.
6. Menu **Update Fasilitas** memperbarui nama, kondisi, dan jumlah fasilitas berdasarkan ID.
7. Menu **Keluar** menghentikan program.
8. Program akan terus menampilkan menu sampai pengguna memilih menu keluar.

Program memiliki dua dummy data awal, yaitu **Gazebo** sebagai Fasilitas Umum dan **Lapangan Basket** sebagai Fasilitas Olahraga.

---

## 4. Encapsulation

Penerapan **encapsulation** terdapat pada class `Fasilitas`, `FasilitasUmum`, dan `FasilitasOlahraga`.

Atribut pada class dibuat menggunakan access modifier `private`, contohnya:

<img width="382" height="146" alt="image" src="https://github.com/user-attachments/assets/618d8c65-a355-4f44-90e2-fcabbdb981dd" />

Data tersebut diakses dan diubah melalui **getter dan setter**.

Setter juga memiliki validasi untuk menjaga agar data yang disimpan tetap sesuai, seperti:

- ID harus lebih dari `0`.
- Nama tidak boleh kosong.
- Kondisi hanya dapat berupa `Baik`, `Cukup`, atau `Rusak`.
- Jumlah tidak boleh negatif.
- Jenis fasilitas tidak boleh kosong.

Dengan encapsulation, atribut tidak dapat diakses atau diubah secara langsung dari luar class.

---

## 5. Inheritance

Program menerapkan **inheritance** dengan class `Fasilitas` sebagai superclass dan dua subclass:

<img width="1448" height="928" alt="Untitled Diagram drawio (1)" src="https://github.com/user-attachments/assets/06c4b5db-468c-4fcb-aa6d-76babbf46043" />

Class `FasilitasUmum` dan `FasilitasOlahraga` menggunakan:

- <img width="726" height="38" alt="image" src="https://github.com/user-attachments/assets/73e51dbc-ae6a-4bc1-b391-090ac4af6e39" />

- <img width="788" height="38" alt="image" src="https://github.com/user-attachments/assets/f98d1cc3-867b-497f-8476-b9ff1f8ba7df" />

Kedua subclass mewarisi atribut dan method umum dari `Fasilitas`, seperti:

- `id`
- `nama`
- `kondisi`
- `jumlah`
- getter dan setter
- `tampilkanInfo()`

Selain atribut yang diwariskan, masing-masing subclass memiliki atribut khusus:

- `FasilitasUmum` memiliki `jenis`.
- `FasilitasOlahraga` memiliki `jenisOlahraga`.

Constructor subclass menggunakan `super(...)` untuk memanggil constructor dari superclass seperti ini:

<img width="1356" height="146" alt="image" src="https://github.com/user-attachments/assets/719d5969-b67c-46e5-aea4-d8dc87b7bbfe" />

---

## 6. Polymorphism

Program menerapkan dua bentuk polymorphism, yaitu **method overriding** dan **method overloading**.

### 6.1 Method Overriding

Overriding adalah penulisan ulang metode di kelas anak (subclass) dengan nama dan parameter yang sama persis seperti di kelas induk (superclass).

Method overriding diterapkan pada method `tampilkanInfo()`.

Superclass `Fasilitas` memiliki method:

<img width="782" height="220" alt="image" src="https://github.com/user-attachments/assets/5f5643bd-b3d3-4785-9f13-1417ad3b38c9" />

Kemudian method tersebut di-override pada `FasilitasUmum` dan `FasilitasOlahraga`.

- <img width="962" height="260" alt="image" src="https://github.com/user-attachments/assets/a0796ba0-723c-4842-91b5-110f74fac5b2" />

- <img width="962" height="256" alt="image" src="https://github.com/user-attachments/assets/318b4d39-2e87-40be-ad2c-d15ac13b1bac" />

Dengan overriding, setiap subclass dapat menampilkan informasi tambahan sesuai dengan karakteristik masing-masing fasilitas.

Objek `FasilitasUmum` dan `FasilitasOlahraga` disimpan menggunakan referensi bertipe `Fasilitas`. Ketika `tampilkanInfo()` dipanggil, Java menjalankan method sesuai dengan tipe objek sebenarnya.

### 6.2 Method Overloading

Method overloading diterapkan pada class `FasilitasView` melalui method `tampilkanPesan()`.

<img width="898" height="284" alt="image" src="https://github.com/user-attachments/assets/38a538c0-b106-4967-b2f1-9696215da412" />

Kedua method memiliki **nama yang sama**, tetapi jumlah parameter yang berbeda.

Method dengan satu parameter digunakan untuk menampilkan pesan biasa, sedangkan method dengan dua parameter dapat menampilkan judul dan isi pesan.

---

## 7. Abstraction

Program menerapkan **abstraction** menggunakan abstract class dan abstract method. **abstraction** (abstraksi) adalah konsep untuk menyembunyikan detail implementasi yang rumit dan hanya menampilkan fungsi-fungsi penting dari suatu objek.

### 7.1 Abstract Class

Class `Fasilitas` dibuat sebagai abstract class:

<img width="556" height="44" alt="image" src="https://github.com/user-attachments/assets/c90b70b1-3f7a-4338-b4e9-85dc3b46db20" />

Class tersebut digunakan sebagai dasar untuk menyimpan atribut dan method umum yang dimiliki oleh seluruh jenis fasilitas.

Karena bersifat abstract, class `Fasilitas` tidak digunakan untuk membuat objek secara langsung. Objek dibuat melalui subclass `FasilitasUmum` atau `FasilitasOlahraga`.

### 7.2 Abstract Method

Pada class `Fasilitas` terdapat abstract method:

<img width="614" height="40" alt="image" src="https://github.com/user-attachments/assets/6c6b486a-5a5a-49cb-857d-6ce6c3fe32ae" />

Method tersebut tidak memiliki implementasi pada superclass sehingga setiap subclass harus memberikan implementasinya sendiri.

Pada `FasilitasUmum`:

<img width="458" height="146" alt="image" src="https://github.com/user-attachments/assets/e3e05ee2-c832-4d90-8eeb-145ed0a1ee78" />

Pada `FasilitasOlahraga`:

<img width="522" height="150" alt="image" src="https://github.com/user-attachments/assets/1e0ce73a-553a-479f-a2d2-0828524c997c" />

Dengan begitu, setiap subclass menentukan kategori sesuai dengan jenis fasilitasnya.

---

## 8. Nilai Tambah — Interface
