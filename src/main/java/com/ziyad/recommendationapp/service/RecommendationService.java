package com.ziyad.recommendationapp.service;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class RecommendationService {

    static class Place {
        String name;
        double rating;
        int reviews;

        Place(String name, double rating, int reviews) {
            this.name = name;
            this.rating = rating;
            this.reviews = reviews;
        }
    }

    public Map<String, Object> getRecommendation(int age, int budget, String type, String category, String city, String language) {

        Map<String, List<Place>> data = new HashMap<>();

        // ================= HAIL =================
        data.put("Hail_specialty coffee", Arrays.asList(
                new Place("HAO Coffee", 4.7, 1200),
                new Place("WHB Coffee", 4.6, 950),
                new Place("Sakura Coffee", 4.6, 870),
                new Place("IV Coffee", 4.5, 760),
                new Place("Naf Coffee", 4.5, 640)
        ));

        data.put("Hail_roastery coffee", Arrays.asList(
                new Place("HAO Coffee", 4.7, 1200),
                new Place("WHB Coffee", 4.6, 950),
                new Place("Sakura Coffee", 4.6, 870),
                new Place("IV Coffee", 4.5, 760),
                new Place("Naf Coffee", 4.5, 640)
        ));

        data.put("Hail_italian restaurant", Arrays.asList(
                new Place("Roca Roco", 4.6, 900),
                new Place("Pizza Roma", 4.5, 700),
                new Place("La Casa Italian", 4.3, 400),
                new Place("Italian Taste", 4.2, 300),
                new Place("Roma Kitchen", 4.1, 200)
        ));

        data.put("Hail_american restaurant", Arrays.asList(
                new Place("Burgerizzr Hail", 4.5, 740),
                new Place("Route Burger", 4.4, 610),
                new Place("Fire Grill Burger", 4.3, 480),
                new Place("Burger Castle", 4.2, 360),
                new Place("Hamburgini Hail", 4.1, 290)
        ));

        data.put("Hail_japanese restaurant", Arrays.asList(
                new Place("Sushi Yoshi", 4.4, 300),
                new Place("Tokyo House", 4.3, 260),
                new Place("Sakura Sushi", 4.2, 210),
                new Place("Osaka Japanese", 4.1, 180),
                new Place("Nippon Kitchen", 4.0, 120)
        ));

        data.put("Hail_mexican restaurant", Arrays.asList(
                new Place("Taco Fiesta", 4.4, 280),
                new Place("Amigos Mexican Grill", 4.3, 230),
                new Place("Burrito House", 4.2, 200),
                new Place("Nacho Spot", 4.1, 150),
                new Place("Casa Mexicana", 4.0, 100)
        ));

        data.put("Hail_saudi restaurant", Arrays.asList(
                new Place("Kabsa House", 4.6, 830),
                new Place("Jareesh House", 4.4, 520),
                new Place("Saudi Taste", 4.3, 430),
                new Place("Najd Food", 4.2, 350),
                new Place("Heritage Saudi Restaurant", 4.1, 300)
        ));

        data.put("Hail_arabic restaurant", Arrays.asList(
                new Place("Al Romansiah", 4.6, 1100),
                new Place("Shawaya House", 4.5, 900),
                new Place("Bab Al Yemen", 4.4, 650),
                new Place("Layali Al Arab", 4.3, 520),
                new Place("Arabian Majlis", 4.2, 430)
        ));

        // ================= RIYADH =================
        data.put("Riyadh_specialty coffee", Arrays.asList(
                new Place("Brew92", 4.7, 3500),
                new Place("Camel Step Coffee", 4.6, 2900),
                new Place("Sulalat Coffee", 4.5, 2400),
                new Place("Elixir Bunn", 4.5, 1800),
                new Place("Ashjar Cafe", 4.4, 1500)
        ));

        data.put("Riyadh_roastery coffee", Arrays.asList(
                new Place("Roasting House", 4.7, 2100),
                new Place("Black Knight Roastery", 4.6, 1700),
                new Place("Bean Roastery", 4.5, 1400),
                new Place("Coffee Roasters Riyadh", 4.4, 1200),
                new Place("Roast Master", 4.3, 950)
        ));

        data.put("Riyadh_italian restaurant", Arrays.asList(
                new Place("Il Baretto", 4.7, 3200),
                new Place("Piatto", 4.6, 2800),
                new Place("Cipriani", 4.6, 2400),
                new Place("Mamo Michelangelo", 4.5, 2000),
                new Place("Azzurro", 4.4, 1500)
        ));

        data.put("Riyadh_american restaurant", Arrays.asList(
                new Place("Section-B", 4.6, 2600),
                new Place("Five Guys", 4.5, 2300),
                new Place("Shake Shack", 4.5, 2100),
                new Place("Johnny Rockets", 4.4, 1800),
                new Place("TGI Fridays", 4.3, 1500)
        ));

        data.put("Riyadh_japanese restaurant", Arrays.asList(
                new Place("Nozomi", 4.7, 2100),
                new Place("Myazu", 4.6, 1900),
                new Place("Tokyo", 4.5, 1600),
                new Place("Benihana", 4.4, 1300),
                new Place("Sushi Yoshi Riyadh", 4.3, 1100)
        ));

        data.put("Riyadh_mexican restaurant", Arrays.asList(
                new Place("La Mesa", 4.5, 1400),
                new Place("Burro Blanco", 4.5, 1300),
                new Place("Taco Bell", 4.3, 1100),
                new Place("Maria Bonita", 4.2, 900),
                new Place("Muchachas", 4.1, 750)
        ));

        data.put("Riyadh_saudi restaurant", Arrays.asList(
                new Place("Najd Village", 4.7, 4000),
                new Place("Takya", 4.6, 3200),
                new Place("Saudi Kitchen", 4.5, 2600),
                new Place("Kabsa Time", 4.3, 2100),
                new Place("Heritage Najdi", 4.2, 1800)
        ));

        data.put("Riyadh_arabic restaurant", Arrays.asList(
                new Place("Al Romansiah", 4.6, 5000),
                new Place("Shawaya House", 4.5, 4200),
                new Place("Bab Tuma", 4.4, 3100),
                new Place("Layali Beirut", 4.3, 2500),
                new Place("Arabesque", 4.2, 2000)
        ));

        // ================= JEDDAH =================
        data.put("Jeddah_specialty coffee", Arrays.asList(
                new Place("Brew92 Jeddah", 4.7, 2600),
                new Place("Camel Step Jeddah", 4.6, 2200),
                new Place("Medd Cafe", 4.6, 1800),
                new Place("12 Cups", 4.5, 1500),
                new Place("Half Million", 4.4, 1300)
        ));

        data.put("Jeddah_roastery coffee", Arrays.asList(
                new Place("Roast Maestro", 4.6, 1200),
                new Place("Jeddah Roastery", 4.5, 980),
                new Place("Bean Roasters", 4.4, 860),
                new Place("Coffee Lab Roastery", 4.3, 720),
                new Place("Roast Corner", 4.2, 600)
        ));

        data.put("Jeddah_italian restaurant", Arrays.asList(
                new Place("Piatto Jeddah", 4.6, 2200),
                new Place("Biella", 4.5, 1800),
                new Place("Il Gabbiano", 4.5, 1500),
                new Place("Cipriani Jeddah", 4.4, 1300),
                new Place("Sapori di Roma", 4.3, 1000)
        ));

        data.put("Jeddah_american restaurant", Arrays.asList(
                new Place("Section-B Jeddah", 4.6, 1900),
                new Place("Five Guys Jeddah", 4.5, 1700),
                new Place("Shake Shack Jeddah", 4.4, 1500),
                new Place("TGI Fridays Jeddah", 4.3, 1300),
                new Place("Johnny Rockets Jeddah", 4.2, 1100)
        ));

        data.put("Jeddah_japanese restaurant", Arrays.asList(
                new Place("Sakura Japanese", 4.6, 1500),
                new Place("Benihana Jeddah", 4.5, 1300),
                new Place("Nozomi Jeddah", 4.4, 1100),
                new Place("Sushi Library", 4.3, 900),
                new Place("Tokyo House Jeddah", 4.2, 800)
        ));

        data.put("Jeddah_mexican restaurant", Arrays.asList(
                new Place("La Mesa Jeddah", 4.5, 1200),
                new Place("Taco House", 4.4, 1000),
                new Place("Burrito Loco", 4.3, 850),
                new Place("Casa Mexicana Jeddah", 4.2, 700),
                new Place("Mucho Mexico", 4.1, 600)
        ));

        data.put("Jeddah_saudi restaurant", Arrays.asList(
                new Place("Saudi Taste Jeddah", 4.5, 1300),
                new Place("Kabsa House Jeddah", 4.4, 1100),
                new Place("Traditional Saudi Food", 4.3, 900),
                new Place("Heritage Saudi Kitchen", 4.2, 750),
                new Place("Najd Village Jeddah", 4.1, 650)
        ));

        data.put("Jeddah_arabic restaurant", Arrays.asList(
                new Place("Bab Al Yemen", 4.6, 1700),
                new Place("Al Romansiah Jeddah", 4.5, 1500),
                new Place("Layali Al Arab", 4.4, 1200),
                new Place("Shawaya House Jeddah", 4.3, 1000),
                new Place("Arabian Nights Restaurant", 4.2, 850)
        ));

        // ================= DAMMAM =================
        data.put("Dammam_specialty coffee", Arrays.asList(
                new Place("Camel Step Dammam", 4.6, 1600),
                new Place("Brew Crew", 4.5, 1300),
                new Place("Dose Cafe", 4.4, 1100),
                new Place("The Barn", 4.3, 900),
                new Place("Cup & Bean", 4.2, 750)
        ));

        data.put("Dammam_roastery coffee", Arrays.asList(
                new Place("Dammam Roastery", 4.6, 1000),
                new Place("Roast Nation", 4.5, 850),
                new Place("Bean District", 4.4, 700),
                new Place("Roastery House", 4.3, 580),
                new Place("Coffee Bean Roasters", 4.2, 470)
        ));

        data.put("Dammam_italian restaurant", Arrays.asList(
                new Place("Piatto Dammam", 4.5, 1500),
                new Place("Biella Dammam", 4.4, 1200),
                new Place("Roma Way", 4.3, 980),
                new Place("Pasta Vista", 4.2, 760),
                new Place("Italiano", 4.1, 620)
        ));

        data.put("Dammam_american restaurant", Arrays.asList(
                new Place("Five Guys Dammam", 4.5, 1400),
                new Place("Shake Shack Dammam", 4.4, 1200),
                new Place("Section-B Dammam", 4.3, 1000),
                new Place("Steak House", 4.2, 820),
                new Place("Johnny Rockets Dammam", 4.1, 700)
        ));

        data.put("Dammam_japanese restaurant", Arrays.asList(
                new Place("Sushi Box", 4.5, 1100),
                new Place("Tokyo Dammam", 4.4, 950),
                new Place("Sakura Sushi Dammam", 4.3, 800),
                new Place("Nippon Taste", 4.2, 650),
                new Place("Osaka Grill", 4.1, 520)
        ));

        data.put("Dammam_mexican restaurant", Arrays.asList(
                new Place("Taco Spot", 4.4, 900),
                new Place("Casa Burrito", 4.3, 780),
                new Place("Mexican House", 4.2, 650),
                new Place("Nacho Time", 4.1, 520),
                new Place("Fiesta Grill", 4.0, 430)
        ));

        data.put("Dammam_saudi restaurant", Arrays.asList(
                new Place("Najd Village Dammam", 4.5, 1400),
                new Place("Kabsa Time Dammam", 4.4, 1150),
                new Place("Saudi Kitchen Dammam", 4.3, 980),
                new Place("Jareesh House", 4.2, 760),
                new Place("Traditional Saudi Table", 4.1, 630)
        ));

        data.put("Dammam_arabic restaurant", Arrays.asList(
                new Place("Al Romansiah Dammam", 4.5, 1800),
                new Place("Shawaya House Dammam", 4.4, 1500),
                new Place("Layali Beirut Dammam", 4.3, 1200),
                new Place("Bab Al Hara", 4.2, 960),
                new Place("Arabian Taste", 4.1, 800)
        ));

        // ================= ABHA =================
        data.put("Abha_specialty coffee", Arrays.asList(
                new Place("Camel Step Abha", 4.6, 1400),
                new Place("Dose Cafe Abha", 4.5, 1200),
                new Place("Coffee Waves", 4.4, 950),
                new Place("Brew Lab", 4.3, 760),
                new Place("Dr.Cafe Abha", 4.2, 620)
        ));

        data.put("Abha_roastery coffee", Arrays.asList(
                new Place("Abha Roastery", 4.6, 900),
                new Place("Roast Hill", 4.5, 760),
                new Place("Bean Peak", 4.4, 640),
                new Place("Roastery Lab", 4.3, 520),
                new Place("Coffee Roast Abha", 4.2, 430)
        ));

        data.put("Abha_italian restaurant", Arrays.asList(
                new Place("Pasta House Abha", 4.5, 1000),
                new Place("Roma Abha", 4.4, 820),
                new Place("Italian Corner", 4.3, 690),
                new Place("Bella Italia", 4.2, 560),
                new Place("Piatto Abha", 4.1, 450)
        ));

        data.put("Abha_american restaurant", Arrays.asList(
                new Place("Burger Boutique Abha", 4.5, 1200),
                new Place("Five Guys Abha", 4.4, 950),
                new Place("Steak House Abha", 4.3, 810),
                new Place("Route 66 Burger", 4.2, 640),
                new Place("American Grill", 4.1, 500)
        ));

        data.put("Abha_japanese restaurant", Arrays.asList(
                new Place("Sushi Peak", 4.4, 760),
                new Place("Tokyo Abha", 4.3, 620),
                new Place("Sakura Abha", 4.2, 500),
                new Place("Nippon House", 4.1, 410),
                new Place("Japan Kitchen", 4.0, 320)
        ));

        data.put("Abha_mexican restaurant", Arrays.asList(
                new Place("Taco Hills", 4.4, 700),
                new Place("Fiesta Abha", 4.3, 590),
                new Place("Mexican Grill Abha", 4.2, 480),
                new Place("Burrito Box", 4.1, 390),
                new Place("Casa Abha", 4.0, 300)
        ));

        data.put("Abha_saudi restaurant", Arrays.asList(
                new Place("Saudi Taste Abha", 4.5, 1200),
                new Place("Kabsa House Abha", 4.4, 980),
                new Place("Najdi Food Abha", 4.3, 810),
                new Place("Traditional Saudi Restaurant", 4.2, 650),
                new Place("Saudi Heritage Abha", 4.1, 520)
        ));

        data.put("Abha_arabic restaurant", Arrays.asList(
                new Place("Arabian Majlis Abha", 4.5, 1300),
                new Place("Layali Al Arab Abha", 4.4, 1050),
                new Place("Al Romansiah Abha", 4.3, 900),
                new Place("Shawaya House Abha", 4.2, 720),
                new Place("Bab Al Arab", 4.1, 600)
        ));

        // ================= TABUK =================
        data.put("Tabuk_specialty coffee", Arrays.asList(
                new Place("Camel Step Tabuk", 4.6, 1300),
                new Place("Barn's", 4.5, 1100),
                new Place("Bean Spot", 4.4, 880),
                new Place("Cup Roasters", 4.3, 700),
                new Place("Coffee Route", 4.2, 560)
        ));

        data.put("Tabuk_roastery coffee", Arrays.asList(
                new Place("Tabuk Roastery", 4.6, 850),
                new Place("Roast Factory", 4.5, 720),
                new Place("Bean Master", 4.4, 610),
                new Place("Roastery District", 4.3, 500),
                new Place("Coffee Lab Tabuk", 4.2, 410)
        ));

        data.put("Tabuk_italian restaurant", Arrays.asList(
                new Place("Piatto Tabuk", 4.5, 1200),
                new Place("Roma Pasta", 4.4, 960),
                new Place("Italian Taste Tabuk", 4.3, 780),
                new Place("Bella Roma", 4.2, 620),
                new Place("Pasta Villa", 4.1, 500)
        ));

        data.put("Tabuk_american restaurant", Arrays.asList(
                new Place("Burgerizzr Tabuk", 4.5, 1300),
                new Place("Five Guys Tabuk", 4.4, 1050),
                new Place("American Burger House", 4.3, 860),
                new Place("Steak Grill Tabuk", 4.2, 700),
                new Place("Route Burger Tabuk", 4.1, 560)
        ));

        data.put("Tabuk_japanese restaurant", Arrays.asList(
                new Place("Sushi Tabuk", 4.4, 740),
                new Place("Tokyo Taste", 4.3, 620),
                new Place("Sakura House Tabuk", 4.2, 510),
                new Place("Japan Table", 4.1, 420),
                new Place("Nippon Sushi", 4.0, 330)
        ));

        data.put("Tabuk_mexican restaurant", Arrays.asList(
                new Place("Taco Tabuk", 4.4, 690),
                new Place("Fiesta Mexicana", 4.3, 580),
                new Place("Burrito Tabuk", 4.2, 470),
                new Place("Casa Taco", 4.1, 380),
                new Place("Mexican Bite", 4.0, 300)
        ));

        data.put("Tabuk_saudi restaurant", Arrays.asList(
                new Place("Saudi House Tabuk", 4.5, 1250),
                new Place("Kabsa Village", 4.4, 1020),
                new Place("Traditional Saudi Food Tabuk", 4.3, 840),
                new Place("Najdi Flavors", 4.2, 680),
                new Place("Saudi Majlis", 4.1, 550)
        ));

        data.put("Tabuk_arabic restaurant", Arrays.asList(
                new Place("Arabian Table Tabuk", 4.5, 1350),
                new Place("Layali Tabuk", 4.4, 1120),
                new Place("Shawaya House Tabuk", 4.3, 920),
                new Place("Bab Al Sham", 4.2, 760),
                new Place("Arab Taste Tabuk", 4.1, 620)
        ));

        String key = city + "_" + category;
        List<Place> places = data.getOrDefault(key, new ArrayList<>());

        places.sort((a, b) -> {
            double scoreA = a.rating + Math.min(a.reviews / 1000.0, 1.0);
            double scoreB = b.rating + Math.min(b.reviews / 1000.0, 1.0);
            return Double.compare(scoreB, scoreA);
        });

        List<Map<String, Object>> resultPlaces = new ArrayList<>();
        for (Place p : places) {
            Map<String, Object> item = new HashMap<>();
            item.put("name", p.name);
            item.put("rating", p.rating);
            item.put("reviews", p.reviews);
            resultPlaces.add(item);
        }

        Map<String, Object> result = new HashMap<>();
        result.put("places", resultPlaces);
        return result;
    }
}