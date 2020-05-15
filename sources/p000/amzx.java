package p000;

import android.content.ContentValues;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: amzx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amzx implements Comparator {

    /* renamed from: a */
    static final Set f76449a = new HashSet();

    /* renamed from: b */
    static final String[] f76450b = new String[0];

    /* renamed from: c */
    static final String[] f76451c = {"data1", "data2", "data3", "data4", "data5", "data6", "data7", "data8", "data9", "data10", "data11", "data12", "data13", "data14", "data15", "group_sourceid", "data_sync1", "data_sync2", "data_sync3", "is_primary"};

    /* renamed from: d */
    static final bnhe f76452d;

    /* renamed from: e */
    private static final amzx f76453e = new amzx(true);

    /* renamed from: f */
    private static final amzx f76454f = new amzx(false);

    /* renamed from: g */
    private static final Map f76455g = new HashMap();

    /* renamed from: h */
    private final boolean f76456h;

    static {
        bnha h = bnhe.m109414h();
        h.mo67695b("data1", amjx.DATA1);
        h.mo67695b("data2", amjx.DATA2);
        h.mo67695b("data3", amjx.DATA3);
        h.mo67695b("data4", amjx.DATA4);
        h.mo67695b("data5", amjx.DATA5);
        h.mo67695b("data6", amjx.DATA6);
        h.mo67695b("data7", amjx.DATA7);
        h.mo67695b("data8", amjx.DATA8);
        h.mo67695b("data9", amjx.DATA9);
        h.mo67695b("data10", amjx.DATA10);
        h.mo67695b("data11", amjx.DATA11);
        h.mo67695b("data12", amjx.DATA12);
        h.mo67695b("data13", amjx.DATA13);
        h.mo67695b("data14", amjx.DATA14);
        h.mo67695b("data15", amjx.DATA15);
        h.mo67695b("data_sync1", amjx.SYNC1);
        h.mo67695b("data_sync2", amjx.SYNC2);
        h.mo67695b("data_sync3", amjx.SYNC3);
        h.mo67695b("group_sourceid", amjx.GROUP_SOURCE_ID);
        h.mo67695b("is_primary", amjx.IS_PRIMARY);
        f76452d = h.mo67618b();
    }

    private amzx(boolean z) {
        this.f76456h = z;
    }

    /* renamed from: a */
    private static int m63792a(ContentValues contentValues, ContentValues contentValues2, String[] strArr, Set set) {
        int a;
        for (String str : strArr) {
            if (m63798a(str, set) && (a = m63794a(str, contentValues, contentValues2)) != 0) {
                return a;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static amzx m63795a(boolean z) {
        return !z ? f76454f : f76453e;
    }

    /* renamed from: a */
    private static int m63793a(Long l, Long l2) {
        if (l2 != null) {
            return !anau.m63868a(l, l2) ? 3 : 2;
        }
        return 4;
    }

    /* renamed from: a */
    private static int m63794a(String str, ContentValues contentValues, ContentValues contentValues2) {
        String asString = contentValues.getAsString(str);
        String asString2 = contentValues2.getAsString(str);
        if ("null".equals(asString)) {
            asString = null;
        }
        if ("null".equals(asString2)) {
            asString2 = null;
        }
        if (asString == null && asString2 == null) {
            return 0;
        }
        if (asString == null) {
            return -1;
        }
        if (asString2 != null) {
            return asString.compareToIgnoreCase(asString2);
        }
        return 1;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    private static amzy m63796a(String str) {
        char c;
        String str2;
        switch (str.hashCode()) {
            case -1729791444:
                if (str.equals("vnd.com.google.cursor.item/contact_file_as")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -1569536764:
                if (str.equals("vnd.android.cursor.item/email_v2")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1328682538:
                if (str.equals("vnd.android.cursor.item/contact_event")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1207225626:
                if (str.equals("vnd.com.google.cursor.item/contact_external_id")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -1079224304:
                if (str.equals("vnd.android.cursor.item/name")) {
                    c = 12;
                    break;
                }
                c = 65535;
                break;
            case -1079210633:
                if (str.equals("vnd.android.cursor.item/note")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -828105739:
                if (str.equals("vnd.com.google.cursor.item/contact_misc")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case -601229436:
                if (str.equals("vnd.android.cursor.item/postal-address_v2")) {
                    c = 13;
                    break;
                }
                c = 65535;
                break;
            case -335220302:
                if (str.equals("vnd.com.google.cursor.item/contact_extended_property")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 3430506:
                if (str.equals("vnd.android.cursor.item/sip_address")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 94070761:
                if (str.equals("vnd.com.google.cursor.item/contact_hobby")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 456415478:
                if (str.equals("vnd.android.cursor.item/website")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 684173810:
                if (str.equals("vnd.android.cursor.item/phone_v2")) {
                    c = 8;
                    break;
                }
                c = 65535;
                break;
            case 689862072:
                if (str.equals("vnd.android.cursor.item/organization")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 905843021:
                if (str.equals("vnd.android.cursor.item/photo")) {
                    c = 9;
                    break;
                }
                c = 65535;
                break;
            case 950831081:
                if (str.equals("vnd.android.cursor.item/im")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1238509849:
                if (str.equals("vnd.com.google.cursor.item/contact_user_defined_field")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 1332665825:
                if (str.equals("vnd.com.google.cursor.item/contact_language")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 1409846529:
                if (str.equals("vnd.android.cursor.item/relation")) {
                    c = 10;
                    break;
                }
                c = 65535;
                break;
            case 1464444786:
                if (str.equals("vnd.com.google.cursor.item/contact_calendar_link")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 1464725403:
                if (str.equals("vnd.android.cursor.item/group_membership")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1635852198:
                if (str.equals("vnd.com.google.cursor.item/contact_jot")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 1828520899:
                if (str.equals("vnd.android.cursor.item/identity")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 2034973555:
                if (str.equals("vnd.android.cursor.item/nickname")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return new amza();
            case 1:
                return new amzb();
            case 2:
                return new amzf();
            case 3:
                return new amzh();
            case 4:
                return new amzi();
            case 5:
                return new amzn();
            case 6:
                return new amzo();
            case 7:
                return new amzp();
            case 8:
                return new amzq();
            case 9:
                return new amzr();
            case 10:
                return new amzt();
            case 11:
                return new amzu();
            case 12:
                return new amzm();
            case 13:
                return new amzs();
            case 14:
                return new amzw();
            case 15:
                return new amyz();
            case 16:
                return new amzc();
            case 17:
                return new amzd();
            case 18:
                return new amzg();
            case 19:
                return new amzj();
            case 20:
                return new amzk();
            case 21:
                return new amzl();
            case 22:
                return new amzv();
            case 23:
                return new amze();
            default:
                String valueOf = String.valueOf(str);
                if (valueOf.length() == 0) {
                    str2 = new String("No matcher found for ");
                } else {
                    str2 = "No matcher found for ".concat(valueOf);
                }
                throw new IllegalStateException(str2);
        }
    }

    /* renamed from: a */
    public static bmxv m63797a(List list, List list2) {
        bmxv bmxv;
        bmxv bmxv2;
        Collections.sort(list, f76453e);
        Collections.sort(list2, f76453e);
        Iterator it = list.iterator();
        Iterator it2 = list2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            ContentValues contentValues = (ContentValues) it.next();
            ContentValues contentValues2 = (ContentValues) it2.next();
            if (contentValues == null || contentValues2 == null) {
                throw new IllegalStateException("Either apiDataItem or localDataItem cannot be null");
            }
            int a = m63794a("mimetype", contentValues, contentValues2);
            if (a != 0) {
                contentValues.getAsString("mimetype");
                contentValues2.getAsString("mimetype");
                bmxv = a < 0 ? bmxv.m108566b(anay.m63875a(alsg.m61645a(contentValues), amjx.ONLY_EXIST_IN_SERVER, 1)) : bmxv.m108566b(anay.m63875a(alsg.m61645a(contentValues2), amjx.ONLY_EXIST_IN_LOCAL, m63793a(contentValues2.getAsLong("data_version"), contentValues2.getAsLong("data_sync4"))));
            } else {
                String asString = contentValues.getAsString("mimetype");
                amzy amzy = (amzy) f76455g.get(asString);
                if (amzy == null) {
                    amzy = m63796a(asString);
                    f76455g.put(asString, amzy);
                }
                Set a2 = amzy.mo41579a();
                String[] c = amzy.mo41581c();
                int length = c.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        bmxv2 = bmvz.f131120a;
                        break;
                    }
                    String str = c[i];
                    if (m63798a(str, a2) && m63794a(str, contentValues, contentValues2) != 0) {
                        bmxv2 = bmxv.m108566b((amjx) f76452d.getOrDefault(str, amjx.UNKNOWN));
                        break;
                    }
                    i++;
                }
                if (bmxv2.mo66813a()) {
                    ((amjx) bmxv2.mo66814b()).name();
                }
                bmxv = bmxv2.mo66813a() ? bmxv.m108566b(anay.m63875a(alsg.m61645a(contentValues2), (amjx) bmxv2.mo66814b(), m63793a(contentValues2.getAsLong("data_version"), contentValues2.getAsLong("data_sync4")))) : bmvz.f131120a;
            }
            if (bmxv.mo66813a()) {
                return bmxv;
            }
        }
        if (it.hasNext()) {
            return bmxv.m108566b(anay.m63875a(alsg.m61645a((ContentValues) it.next()), amjx.ONLY_EXIST_IN_SERVER, 1));
        }
        if (!it2.hasNext()) {
            return bmvz.f131120a;
        }
        ContentValues contentValues3 = (ContentValues) it2.next();
        return bmxv.m108566b(anay.m63875a(alsg.m61645a(contentValues3), amjx.ONLY_EXIST_IN_LOCAL, m63793a(contentValues3.getAsLong("data_version"), contentValues3.getAsLong("data_sync4"))));
    }

    /* renamed from: a */
    private static boolean m63798a(String str, Set set) {
        return !set.contains(str);
    }

    /* renamed from: a */
    public final int compare(ContentValues contentValues, ContentValues contentValues2) {
        if (contentValues == null || contentValues2 == null) {
            throw new IllegalStateException("Either apiDataItem or localDataItem cannot be null");
        }
        int a = m63794a("mimetype", contentValues, contentValues2);
        if (a != 0) {
            contentValues.getAsString("mimetype");
            contentValues2.getAsString("mimetype");
            return a;
        }
        String asString = contentValues.getAsString("mimetype");
        amzy amzy = (amzy) f76455g.get(asString);
        if (amzy == null) {
            amzy = m63796a(asString);
            f76455g.put(asString, amzy);
        }
        if (!this.f76456h) {
            return m63792a(contentValues, contentValues2, amzy.mo41580b(), f76449a);
        }
        return m63792a(contentValues, contentValues2, amzy.mo41581c(), amzy.mo41579a());
    }
}
