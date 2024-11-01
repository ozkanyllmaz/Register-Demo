
# Register Demo

Bu proje, kullanıcıların bir kayıt sistemi aracılığıyla kaydolmasını ve giriş yapmasını sağlayan basit bir Java tabanlı uygulamadır. Proje, kullanıcı verilerini güvenli bir şekilde depolamak ve yönetmek için veritabanı bağlantısı içerir.

## Özellikler

- Kullanıcı kaydı (ad, e-posta, şifre vb.)
- Kullanıcı girişi
- Kullanıcı doğrulama ve yetkilendirme
- Basit ve kullanıcı dostu arayüz
- Veritabanı bağlantısı ile kullanıcı verilerinin saklanması

## Kullanılan Teknolojiler

- **Programlama Dili**: Java
- **Veritabanı**: PostgreSQL
- **IDE**: IntelliJ IDEA, Eclipse, NetBeans vb.
- **Kütüphaneler ve Araçlar**:
    - JDBC (Java Database Connectivity)
    - Java Swing (veya JavaFX)

## Kurulum

1. **Projeyi Kopyalayın**:
   ```bash
   git clone https://github.com/ozkanyllmaz/Register-Demo.git
   cd Register-Demo
   ```

2. **Veritabanı Yapılandırması**:
   PostgreSQL kullanarak aşağıdaki SQL kodlarını çalıştırarak veritabanı tablolarınızı oluşturun:

   ```sql
   CREATE DATABASE register_demo;

   CREATE TABLE users (
       userid SERIAL PRIMARY KEY,
       username_first VARCHAR(50),
       username_first VARCHAR(50),
       useremail VARCHAR(100) ,
       userpassword VARCHAR(32) ,
   );
   ```

3. **Bağlantı Bilgileri**:
   `application.properties` dosyanızda veya yapılandırma dosyanızda veritabanı bağlantı bilgilerinizi güncelleyin:

   ```properties
   db.url=jdbc:postgresql://localhost:5432/your_database
   db.username=your_username
   db.password=your_password
   ```

4. **JDBC**:
   Java jdbc driver kurulumunu yapın ve projenize dahil ediniz.
   jdbc driver [yüklemek](https://jdbc.postgresql.org/download/) için tıklayınız.

5. **Uygulamayı Çalıştırın**:
   ```bash
   App.java
   ```

## Kullanım

1. Uygulamayı başlattıktan sonra, açılış ekranında "Kayıt Ol" veya "Giriş Yap" seçeneklerini göreceksiniz.
2. Kayıt formunu doldurarak yeni bir kullanıcı kaydı oluşturabilirsiniz.
3. Mevcut kullanıcı bilgilerinizle giriş yaparak sisteme erişebilirsiniz.

## Katkıda Bulunma

Bu projeye katkıda bulunmak istiyorsanız:

1. Projeyi forklayın.
2. Yeni bir özellik üzerinde çalışmak için branch oluşturun:
   ```bash
   git checkout -b yeni-ozellik
   ```
3. Değişikliklerinizi commitleyin:
   ```bash
   git commit -m 'Yeni özellik eklendi'
   ```
4. Branch'i push edin:
   ```bash
   git push origin yeni-ozellik
   ```
5. Bir pull request oluşturun.


## İletişim

Proje ile ilgili sorularınız için [Özkan Yılmaz](https://github.com/ozkanyllmaz) ile iletişime geçebilirsiniz.
