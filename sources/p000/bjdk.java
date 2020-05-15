package p000;

import android.os.SystemClock;
import com.felicanetworks.mfc.FelicaException;
import com.google.android.gms.userlocation.PlaceEstimate;
import com.google.android.gms.userlocation.Position;
import com.google.android.gms.userlocation.SemanticLocation;
import com.google.android.gms.userlocation.TransitEstimate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: bjdk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjdk {

    /* renamed from: a */
    static final long f122553a = (System.currentTimeMillis() - SystemClock.elapsedRealtime());

    /* renamed from: b */
    private static final List f122554b = new ArrayList(0);

    /* renamed from: c */
    private static final TransitEstimate f122555c = new TransitEstimate(0, 1.0f);

    /* renamed from: a */
    public static int m103237a(int i) {
        return i != 2 ? 0 : 2;
    }

    /* renamed from: a */
    public static bhub m103238a(Position position) {
        if (position != null) {
            return new bhub((int) (position.f109570a * 1.0E7d), (int) (position.f109571b * 1.0E7d), 0, Float.NaN, "unknown", 0, -1.0f);
        }
        return null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: a */
    private static PlaceEstimate m103239a(bhqh bhqh) {
        boolean z;
        String str;
        avwa avwa = new avwa();
        avwa.f94000a = bhqh.f119308b;
        avwa.f94001b = bhqh.f119312f;
        avwa.f94002c = bhqh.f119310d;
        avwa.f94003d = bhqh.f119314h;
        avwa.f94005f = bhqh.f119311e;
        avwa.f94006g = bhqh.f119316j;
        int a = bvnh.m121285a(bhqh.f119309c);
        if (a != 0) {
            switch (a) {
                case 1:
                    str = "OTHER";
                    break;
                case 2:
                    str = "AIRPORT";
                    break;
                case 3:
                    str = "ASSOCIATION_OR_ORGANIZATION";
                    break;
                case 4:
                    str = "ATM";
                    break;
                case 5:
                    str = "ATTRACTION";
                    break;
                case 6:
                    str = "BANK";
                    break;
                case 7:
                    str = "BAR";
                    break;
                case 8:
                    str = "BEAUTY";
                    break;
                case 9:
                    str = "BUS_STOP";
                    break;
                case 10:
                    str = "CAFE";
                    break;
                case 11:
                    str = "CLOTHING_STORE";
                    break;
                case 12:
                    str = "CULTURE";
                    break;
                case 13:
                    str = "EDUCATION";
                    break;
                case 14:
                    str = "EMERGENCY_SERVICES";
                    break;
                case 15:
                    str = "ENTERTAINMENT_AND_RECREATION";
                    break;
                case 16:
                    str = "EVENT_VENUE";
                    break;
                case 17:
                    str = "FOOD_STORE";
                    break;
                case 18:
                    str = "GAS_STATION";
                    break;
                case 19:
                    str = "GYM";
                    break;
                case 20:
                    str = "HEALTH";
                    break;
                case 21:
                    str = "HOSPITAL";
                    break;
                case 22:
                    str = "INDOOR_LODGING";
                    break;
                case 23:
                    str = "MOVIE_THEATER";
                    break;
                case 24:
                    str = "NIGHTLIFE";
                    break;
                case 25:
                    str = "PARK";
                    break;
                case 26:
                    str = "PHARMACY";
                    break;
                case 27:
                    str = "PLACE_OF_WORSHIP";
                    break;
                case 28:
                    str = "PRODUCTION";
                    break;
                case 29:
                    str = "PROFESSIONAL_SERVICES";
                    break;
                case 30:
                    str = "PUBLIC_SERVICES";
                    break;
                case 31:
                    str = "REAL_ESTATE";
                    break;
                case 32:
                    str = "RESTAURANT";
                    break;
                case 33:
                    str = "SERVICES";
                    break;
                case 34:
                    str = "SHOPPING_CENTER";
                    break;
                case 35:
                    str = "STORE";
                    break;
                case 36:
                    str = "TRANSIT_STATION";
                    break;
                case FelicaException.TYPE_NOT_CLOSED:
                    str = "CAR_REPAIR";
                    break;
                case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                    str = "WHOLESALE_GROCER";
                    break;
                case FelicaException.TYPE_USED_BY_OTHER_APP:
                    str = "BAKERY";
                    break;
                case FelicaException.TYPE_PUSH_FAILED:
                    str = "OUTLET_MALL";
                    break;
                case 41:
                    str = "LANDMARK";
                    break;
                case FelicaException.TYPE_ALREADY_ACTIVATED:
                    str = "NATURE_PRESERVE";
                    break;
                case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                    str = "MONUMENT";
                    break;
                case FelicaException.TYPE_RESET_FAILED:
                default:
                    str = "FORTRESS";
                    break;
                case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                    str = "HISTORICAL_LANDMARK";
                    break;
                case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                    str = "HISTORIC_SITE";
                    break;
                case 47:
                    str = "ARENA";
                    break;
                case 48:
                    str = "STADIUM";
                    break;
                case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                    str = "AMUSEMENT_PARK";
                    break;
                case 50:
                    str = "MUSEUM";
                    break;
                case 51:
                    str = "FAST_FOOD_RESTAURANT";
                    break;
            }
            avwa.f94004e = str.toLowerCase(Locale.US);
        }
        sdo.m34969a(avwa.f94000a, (Object) "Place Id cannot be empty");
        float f = avwa.f94001b;
        boolean z2 = true;
        if (f < 0.0f || f > 1.0f) {
            z = false;
        } else {
            z = true;
        }
        sdo.m34975b(z, "Invalid likelihood");
        float f2 = avwa.f94005f;
        if (f2 < 0.0f || f2 > 1.0f) {
            z2 = false;
        }
        sdo.m34975b(z2, "Invalid flatLikelihood");
        return new PlaceEstimate(avwa.f94000a, avwa.f94001b, avwa.f94002c, avwa.f94003d, avwa.f94004e, avwa.f94005f, avwa.f94006g);
    }

    /* renamed from: a */
    public static SemanticLocation m103240a(bhqz bhqz) {
        if (bhqz != null) {
            return m103241a(bhqz, bhqz.f119360b, true);
        }
        return null;
    }

    /* renamed from: a */
    public static SemanticLocation m103241a(bhqz bhqz, long j, boolean z) {
        return m103243a(bhqz, z, false, j);
    }

    /* renamed from: a */
    public static SemanticLocation m103242a(bhqz bhqz, boolean z) {
        return m103243a(bhqz, z, true, bhqz.f119360b);
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:52:0x00fe */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.List, java.lang.Object], assign insn: PHI: (r12v3 ?) = (r12v8 ?), (r12v10 ?) binds: [B:52:0x00fe, B:40:0x00fc] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.util.ArrayList], assign insn: 0x00e0: CONSTRUCTOR  (r12v8 ? I:java.util.ArrayList) =  call: java.util.ArrayList.<init>():void type: CONSTRUCTOR */
    /* JADX WARN: Type inference failed for: r12v10, assign insn: ?: MOVE  (r12v10 ?) = (r12v6 java.util.List) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0116  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    static SemanticLocation m103243a(bhqz bhqz, boolean z, boolean z2, long j) {
        int i;
        ArrayList arrayList;
        ? r12;
        Position position = null;
        if (bhqz == null) {
            return null;
        }
        avwd avwd = new avwd();
        int i2 = 2;
        boolean z3 = true;
        if (bhqz.f119359a != 1) {
            i = 2;
        } else {
            i = 1;
        }
        if (i == 1) {
            i2 = i;
        }
        sdo.m34975b(true, "Invalid state");
        avwd.f94007a = i2;
        avwd.f94013g = true;
        avwd.f94008b = j + f122553a;
        avwd.f94009c = f122555c;
        List list = bhqz.f119361c.f119318b;
        if (!list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(3);
            arrayList2.add(m103239a((bhqh) list.get(0)));
            int i3 = ((bhqh) list.get(0)).f119314h - 1;
            List list2 = ((bhqh) list.get(0)).f119313g;
            bhqh bhqh = null;
            int i4 = 1;
            while (i4 < list.size()) {
                bhqh bhqh2 = (bhqh) list.get(i4);
                if (list2.contains(bhqh2.f119308b) && (bhqh == null || bhqh2.f119312f > bhqh.f119312f)) {
                    bhqh = bhqh2;
                }
                i4++;
                if (i4 == list.size() || ((bhqh) list.get(i4)).f119314h < i3) {
                    if (bhqh == null) {
                        break;
                    }
                    arrayList2.add(m103239a(bhqh));
                    list2 = bhqh.f119313g;
                    i3--;
                    bhqh = null;
                }
            }
            Collections.reverse(arrayList2);
            arrayList = arrayList2;
            if (!z) {
                arrayList = arrayList2.subList(0, 1);
            }
        } else {
            arrayList = f122554b;
        }
        sdo.m34966a(arrayList, "PlaceHierarchy must not be null");
        avwd.f94010d = arrayList;
        bhub bhub = bhqz.f119363e;
        if (bhub != null) {
            int i5 = bhub.f119605a;
            int i6 = bhub.f119606b;
            double d = (double) i5;
            Double.isNaN(d);
            double d2 = (double) i6;
            Double.isNaN(d2);
            position = new Position(d / 1.0E7d, d2 / 1.0E7d);
        }
        avwd.f94012f = position;
        if (z2) {
            List<bhqh> list3 = bhqz.f119361c.f119318b;
            if (!list3.isEmpty()) {
                r12 = new ArrayList();
                for (bhqh bhqh3 : list3) {
                    r12.add(m103239a(bhqh3));
                }
                sdo.m34966a((Object) r12, "PlaceEstimates must not be null");
                avwd.f94011e = r12;
                sdo.m34975b(avwd.f94013g, "State not set");
                if (avwd.f94008b <= 0) {
                    z3 = false;
                }
                sdo.m34975b(z3, "Invalid timestamp");
                sdo.m34966a(avwd.f94009c, "Transit estimate must not be null");
                return new SemanticLocation(avwd.f94007a, avwd.f94008b, avwd.f94009c, avwd.f94010d, avwd.f94011e, avwd.f94012f);
            }
        }
        r12 = f122554b;
        sdo.m34966a((Object) r12, "PlaceEstimates must not be null");
        avwd.f94011e = r12;
        sdo.m34975b(avwd.f94013g, "State not set");
        if (avwd.f94008b <= 0) {
        }
        sdo.m34975b(z3, "Invalid timestamp");
        sdo.m34966a(avwd.f94009c, "Transit estimate must not be null");
        return new SemanticLocation(avwd.f94007a, avwd.f94008b, avwd.f94009c, avwd.f94010d, avwd.f94011e, avwd.f94012f);
    }
}
