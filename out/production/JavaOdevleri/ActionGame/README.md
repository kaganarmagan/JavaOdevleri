## Macera Oyunu
Java ile metin tabanlı bir macera oyunu yapıyoruz.

### KARAKTERLER
|Karakter  |   ID |  Hasar | Sağlık  | Para  |
|---|---|---|---|---|
| Samuray  |  1 | 5  |  21 | 15  |
|   Okçu |2   |  7 | 18  | 20  |
|  Şovalye |   3|  8 | 24  |  5 |

### CANAVARLAR
|CANAVAR |   ID |  Hasar | Sağlık  | Ödül  |
|---|---|---|---|---|
| Zombi  |  1 | 3 |  10 | 4  para|
|  Vampir|2   |  4 | 14  | 7 para |
|  Ayı|   3|  7 | 20  |  12 para|
|Yılan|4|3-6|12|Silah/Zırh/Para|

### SİLAHLAR
|SİLAH|   ID |  Hasar |  Para  |
|---|---|---|---|
| Tabanca  |  1 | 2 |  25  |
|  Kılıç|2 |  3 |  35 |
|  Tüfek|   3|  7 |  45 |

### ZIRHLAR
|ZIRH|   ID |  Engelleme |  Para  |
|---|---|---|---|
| Hafif  |  1 | 1 |  15  |
|  Orta|2 |  3 |  25 |
|  Ağır|   3|  5 |  40 |
		
### MEKANLAR
* #### Güvenli Ev
     * Özellik : Can Yenileniyor
     * Oyunu sonlandırmak için en son gelinmesi gereken yer
* #### Mağara
    * Canavar : Zombi (1-3 Adet)
    
    * Özellik : Savaş + Ganimet
    
    * Eşya : Yemek (Food)

* #### Orman
    * Canavar : Vampir (1-3 Adet)
    
    * Özellik : Savaş + Ganimet

    * Eşya : Odun (Firewood)

* #### Nehir
    * Canavar : Ayı (1-3 Adet)

    * Özellik : Savaş + Ganimet

    * Eşya : Su (Water)

* #### Maden
    * Canavar : Yılan (1-5 Adet)

    * Özellik : Savaş + Ganimet

    * Eşya : Silah/Zırh/Para

* #### Mağaza
    * Özellik : Destekleyici Eşyalar Satın Almak

    * Silah : Tabanca,Kılıç,Tüfek

    * Zırh : Hafif,Orta,Ağır
