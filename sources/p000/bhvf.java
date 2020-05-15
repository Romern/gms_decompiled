package p000;

import java.util.Collections;
import java.util.List;

/* renamed from: bhvf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhvf implements bhve {

    /* renamed from: a */
    public static final C1245ok f119680a;

    static {
        C1245ok okVar = new C1245ok(49);
        f119680a = okVar;
        okVar.put(bvnm.CALENDAR_EVENT, 37);
        f119680a.put(bvnm.CAR_RENTAL_PICKUP, 38);
        f119680a.put(bvnm.CAR_RENTAL_RETURN, 39);
        f119680a.put(bvnm.CONTACT_HOME, 40);
        f119680a.put(bvnm.CONTACT_OTHER, 41);
        f119680a.put(bvnm.CONTACT_WORK, 42);
        f119680a.put(bvnm.EMAIL_PIVOTAL_SIGNAL, 43);
        f119680a.put(bvnm.FLIGHT_ARRIVAL, 44);
        f119680a.put(bvnm.FLIGHT_DEPARTURE, 45);
        f119680a.put(bvnm.FLIGHT_LAYOVER, 46);
        f119680a.put(bvnm.HOTEL_RESERVATION, 47);
        f119680a.put(bvnm.LOW_CONFIDENCE_EVENT_RESERVATION, 48);
        f119680a.put(bvnm.MAPS_CLICKS_CLICK_TO_CALL, 49);
        f119680a.put(bvnm.MAPS_CLICKS_LOCALSEARCH_DETAIL, 50);
        f119680a.put(bvnm.MAPS_CLICKS_LOCALSEARCH_MARKER, 51);
        f119680a.put(bvnm.MAPS_CLICKS_LOCALSEARCH_TRUFFLE, 52);
        f119680a.put(bvnm.MAPS_CLICKS_NAVIGATION, 53);
        f119680a.put(bvnm.MAPS_CLICKS_NOT_INTERESTED, 54);
        f119680a.put(bvnm.MAPS_CLICKS_SMARTMAPS, 56);
        f119680a.put(bvnm.MAPS_CLICKS_START_DIRECTIONS, 57);
        f119680a.put(bvnm.MAPS_CLICKS, 55);
        f119680a.put(bvnm.MAPS_DIRECTIONS, 58);
        f119680a.put(bvnm.MAPS_EMBED_LOAD_DIRECTION_RESULTS, 60);
        f119680a.put(bvnm.MAPS_EMBED_LOAD_DIRECTIONS, 59);
        f119680a.put(bvnm.MAPS_EMBED_LOAD_ENTITY, 61);
        f119680a.put(bvnm.MAPS_EMBED_LOAD_RESULTS, 62);
        f119680a.put(bvnm.MAPS_EMBED_LOAD_SEARCH, 63);
        f119680a.put(bvnm.MAPS_NAV_RESULTS, 64);
        f119680a.put(bvnm.MAPS_QUERIES_START_NAVIGATION, 66);
        f119680a.put(bvnm.MAPS_QUERIES, 65);
        f119680a.put(bvnm.MAPS_RESULTS, 67);
        f119680a.put(bvnm.PERSONAL_RECOMMENDATION_EVENT, 68);
        f119680a.put(bvnm.PERSONAL_RECOMMENDATION_PLACE, 69);
        f119680a.put(bvnm.PLACE_RATING, 70);
        f119680a.put(bvnm.PLACE_REVIEW, 71);
        f119680a.put(bvnm.PLACE_STAR, 72);
        f119680a.put(bvnm.PLACE_VISIT_USER_EDIT, 73);
        f119680a.put(bvnm.PLUS_ONE, 74);
        f119680a.put(bvnm.RECOMMENDED_EVENT_RESERVATION, 75);
        f119680a.put(bvnm.RESTAURANT_RESERVATION, 76);
        f119680a.put(bvnm.SEARCH_CLICKS, 77);
        f119680a.put(bvnm.SEARCH_NAV_RESULTS, 78);
        f119680a.put(bvnm.SEARCH_QUERIES, 80);
        f119680a.put(bvnm.SEARCH_RESULTS, 79);
        f119680a.put(bvnm.SHIPMENT, 81);
        f119680a.put(bvnm.SOCIAL_EVENT_RESERVATION, 82);
        f119680a.put(bvnm.TRAVEL_LOCATION_INTENT, 84);
        f119680a.put(bvnm.TRIP, 83);
        f119680a.put(bvnm.CHECKIN_EDIT, 89);
    }

    /* renamed from: a */
    public final bhvi mo64339a(bhtx bhtx, List list) {
        List<bvnn> list2;
        bvnw bvnw;
        List list3 = list;
        bhuj.m101555a();
        List a = bhvc.m101600a(list.size());
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            bhsu bhsu = (bhsu) list3.get(i2);
            bhue bhue = (bhue) a.get(i2);
            if (!bhsu.mo64229d() && !bhsu.mo64230e() && (bvnw = bhsu.f119499b) != null && bvnw.f156976d.size() != 0) {
                bxwc bxwc = bvnw.f156976d;
                int size = bxwc.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size) {
                        bvnm a2 = bvnm.m121290a(((bvnn) bxwc.get(i3)).f156950b);
                        if (a2 == null) {
                            a2 = bvnm.INVALID;
                        }
                        if (!(a2 == bvnm.MAPS_CLICKS || a2 == bvnm.MAPS_CLICKS_CLICK_TO_CALL || a2 == bvnm.MAPS_CLICKS_HERE || a2 == bvnm.MAPS_CLICKS_LOCALSEARCH_DETAIL || a2 == bvnm.MAPS_CLICKS_LOCALSEARCH_MARKER || a2 == bvnm.MAPS_CLICKS_LOCALSEARCH_TRUFFLE || a2 == bvnm.MAPS_CLICKS_NAVIGATION || a2 == bvnm.MAPS_CLICKS_NOT_INTERESTED || a2 == bvnm.MAPS_CLICKS_SMARTMAPS || a2 == bvnm.MAPS_CLICKS_START_DIRECTIONS || a2 == bvnm.MAPS_DIRECTIONS || a2 == bvnm.MAPS_EMBED_LOAD_DIRECTIONS || a2 == bvnm.MAPS_EMBED_LOAD_DIRECTION_RESULTS || a2 == bvnm.MAPS_EMBED_LOAD_ENTITY || a2 == bvnm.MAPS_EMBED_LOAD_RESULTS || a2 == bvnm.MAPS_EMBED_LOAD_SEARCH || a2 == bvnm.MAPS_NAV_RESULTS || a2 == bvnm.MAPS_QUERIES || a2 == bvnm.MAPS_QUERIES_START_NAVIGATION || a2 == bvnm.MAPS_RESULTS || a2 == bvnm.SEARCH_CLICKS || a2 == bvnm.SEARCH_NAV_RESULTS || a2 == bvnm.SEARCH_QUERIES)) {
                            i3++;
                            if (a2 == bvnm.SEARCH_RESULTS) {
                                break;
                            }
                        }
                    } else {
                        break;
                    }
                }
                bhue.mo64306a(11, Float.valueOf(1.0f));
            }
            if (!bhsu.mo64229d() && !bhsu.mo64230e() && !bhsu.mo64232f() && !bhsu.mo64233g()) {
                long currentTimeMillis = System.currentTimeMillis();
                bvnw bvnw2 = bhsu.f119499b;
                if (bvnw2 != null) {
                    list2 = bvnw2.f156976d;
                } else {
                    list2 = Collections.emptyList();
                }
                float f = 0.0f;
                for (bvnn bvnn : list2) {
                    if ((bvnn.f156949a & 1) != 0 && bvnn.f156952d.size() > 0) {
                        long a3 = bvnn.f156952d.mo74160a(0) / 1000;
                        if (a3 < currentTimeMillis) {
                            C1245ok okVar = f119680a;
                            bvnm a4 = bvnm.m121290a(bvnn.f156950b);
                            if (a4 == null) {
                                a4 = bvnm.INVALID;
                            }
                            Integer num = (Integer) okVar.get(a4);
                            float f2 = ((float) (currentTimeMillis - a3)) / 3600000.0f;
                            if (num != null) {
                                bhue.mo64306a(num, Float.valueOf(bhvd.m101601a(f2, 0.1f, -1.0f)));
                            }
                            f = 1.0f;
                        }
                    }
                }
                bhue.mo64306a(26, Float.valueOf(f));
            }
            if (bhue.mo64305a() != 0) {
                i++;
            }
        }
        bhuj.m101555a();
        StringBuilder sb = new StringBuilder(52);
        sb.append("Added GeoJournal features for ");
        sb.append(i);
        sb.append(" candidates");
        sb.toString();
        return new bhvi(list3, a);
    }

    /* renamed from: a */
    public final String mo64340a() {
        return "GeoJournal";
    }
}
