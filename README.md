# 🏫 Akıllı Kampüs Ders Programı Yönetim Sistemi

Nesneye Yönelik Programlama (OOP) ilkeleri ve Tasarım Kalıpları (Design Patterns) kullanılarak geliştirilmiş otomatik ders programı ve çakışma kontrol sistemi.

## 👥 Proje Grubu
* **Ad Soyad:** Halime Hilal Öztürk - 1250505050
* **Ad Soyad:** Pelin Kuzey - 1250505040

## 🚀 Proje Özellikleri ve Mimari
* **Sınıf Hiyerarşisi:** 8 temel Java sınıfı (`User`, `Student`, `Instructor`, `Classroom`, `Course`, `SchedulerManager`, `TimeSlot`, `Department`, `UserFactory`) ile OOP yapısı.
* **Tasarım Kalıpları (Design Patterns):**
  * **Singleton Pattern:** `SchedulerManager` sınıfı ile tekil yönetici örneği güvence altına alınmıştır.
  * **Factory Pattern:** `UserFactory` sınıfı ile kullanıcı nesneleri (Öğrenci ve Öğretim Elemanı) esnek bir şekilde üretilmektedir.
* **Çakışma Kontrolü:** Derslik, zaman dilimi ve öğretim elemanı çakışmalarını denetleyen algoritma yapısı.

## ⚙️ Nasıl Çalıştırılır?
1. Projeyi bilgisayarınıza klonlayın veya indirin.
2. Projeyi **VS Code** içerisinde açın.
3. `Main.java` dosyasını çalıştırarak konsol çıktısını ve tasarım kalıbı testlerini gözlemleyin.
