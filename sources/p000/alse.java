package p000;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.Log;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: alse */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alse {

    /* renamed from: a */
    public static final alse f74192a = new alse();

    /* renamed from: b */
    private static final bnhe f74193b = bnhe.m109410a("home", 1, "work", 2, "other", 3);

    /* renamed from: c */
    private final Map f74194c;

    private alse() {
        bnha h = bnhe.m109414h();
        h.mo67695b(bldg.class, new alrg());
        h.mo67695b(bldh.class, new alrh());
        h.mo67695b(bldi.class, new alri());
        h.mo67695b(bldj.class, new alrj());
        h.mo67695b(bldu.class, new alrn());
        h.mo67695b(bldv.class, new alro());
        h.mo67695b(bldw.class, new alrp());
        h.mo67695b(blea.class, new alrq());
        h.mo67695b(bled.class, new alrr());
        h.mo67695b(blee.class, new alrs());
        h.mo67695b(blef.class, new alrt());
        h.mo67695b(bleg.class, new alru());
        h.mo67695b(bldl.class, new alrk());
        h.mo67695b(bleh.class, new alrv());
        h.mo67695b(blek.class, new alrw());
        h.mo67695b(bleo.class, new alrx());
        h.mo67695b(blex.class, new alry());
        h.mo67695b(bley.class, new alrz());
        h.mo67695b(blfb.class, new alsa());
        h.mo67695b(blfc.class, new alsb());
        h.mo67695b(blfe.class, new alsc());
        h.mo67695b(blff.class, new alsd());
        this.f74194c = new HashMap(h.mo67618b());
    }

    /* renamed from: a */
    public static long m61617a(long j) {
        if (j == 0) {
            return 1;
        }
        return j;
    }

    /* renamed from: b */
    static String m61630b(long j) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        gregorianCalendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        gregorianCalendar.setTimeInMillis(j);
        int i = 0;
        int i2 = gregorianCalendar.get(0);
        int i3 = gregorianCalendar.get(1);
        if (i2 != 0) {
            i = i3;
        }
        int i4 = gregorianCalendar.get(2);
        int i5 = gregorianCalendar.get(5);
        DecimalFormat decimalFormat = new DecimalFormat("0000");
        DecimalFormat decimalFormat2 = new DecimalFormat("00");
        String format = decimalFormat.format((long) i);
        String format2 = decimalFormat2.format((long) (i4 + 1));
        String format3 = decimalFormat2.format((long) i5);
        int length = String.valueOf(format).length();
        StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(format2).length() + String.valueOf(format3).length());
        sb.append(format);
        sb.append("-");
        sb.append(format2);
        sb.append("-");
        sb.append(format3);
        return sb.toString();
    }

    /* renamed from: c */
    public static String m61633c(String str) {
        if (str != null) {
            return str.matches("--[0-2][0-9]-[0-3][0-9]") ? str.replace("--", "0000-") : str;
        }
        return null;
    }

    /* renamed from: d */
    public static String m61634d(String str) {
        if (str == null) {
            return null;
        }
        if (!str.matches("0000-[0-2][0-9]-[0-3][0-9]")) {
            return str;
        }
        String valueOf = String.valueOf(str.substring(5));
        return valueOf.length() == 0 ? new String("--") : "--".concat(valueOf);
    }

    /* renamed from: e */
    public static Long m61635e(String str) {
        int i;
        List c = bmyx.m108640a('-').mo66925c((CharSequence) str);
        if (c.size() != 3) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt((String) c.get(0));
            int parseInt2 = Integer.parseInt((String) c.get(1)) - 1;
            int parseInt3 = Integer.parseInt((String) c.get(2));
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
            gregorianCalendar.setTimeZone(TimeZone.getTimeZone("UTC"));
            if (parseInt == 0) {
                gregorianCalendar.set(0, 0);
                i = 1;
            } else {
                i = parseInt;
            }
            gregorianCalendar.set(i, parseInt2, parseInt3, 0, 0, 0);
            gregorianCalendar.set(14, 0);
            return Long.valueOf(gregorianCalendar.getTimeInMillis());
        } catch (NumberFormatException e) {
            amdk.m62659b("FSA2_DataTypeConverters", "NumberFormatException when converting date %s to ms", str);
            return null;
        }
    }

    /* renamed from: f */
    public static bleu m61636f(String str) {
        bxvd da = bleu.f126278h.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bleu bleu = (bleu) da.f164949b;
        bleu.f126282c = 2;
        int i = bleu.f126280a | 4;
        bleu.f126280a = i;
        if (str != null) {
            str.getClass();
            bleu.f126280a = i | 16;
            bleu.f126283d = str;
        }
        return (bleu) da.mo74062i();
    }

    /* renamed from: a */
    public static alrm m61618a(String str, Map map, Integer num) {
        Integer num2 = (Integer) map.get(str);
        if (num2 != null) {
            str = "";
        }
        if (num2 != null) {
            num = num2;
        }
        return new alrm(num, str);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x011b, code lost:
        if (r1.equals("vnd.android.cursor.item/email_v2") != false) goto L_0x012a;
     */
    /* renamed from: c */
    public final List mo40676c(List list, String str) {
        if (!ancm.m64008a((Collection) list)) {
            char c = 0;
            String asString = ((ContentValues) list.get(0)).getAsString("mimetype");
            switch (asString.hashCode()) {
                case -1729791444:
                    if (asString.equals("vnd.com.google.cursor.item/contact_file_as")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case -1569536764:
                    break;
                case -1328682538:
                    if (asString.equals("vnd.android.cursor.item/contact_event")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1207225626:
                    if (asString.equals("vnd.com.google.cursor.item/contact_external_id")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case -1079224304:
                    if (asString.equals("vnd.android.cursor.item/name")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -1079210633:
                    if (asString.equals("vnd.android.cursor.item/note")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -828105739:
                    if (asString.equals("vnd.com.google.cursor.item/contact_misc")) {
                        c = 23;
                        break;
                    }
                    c = 65535;
                    break;
                case -601229436:
                    if (asString.equals("vnd.android.cursor.item/postal-address_v2")) {
                        c = 12;
                        break;
                    }
                    c = 65535;
                    break;
                case -335220302:
                    if (asString.equals("vnd.com.google.cursor.item/contact_extended_property")) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case 3430506:
                    if (asString.equals("vnd.android.cursor.item/sip_address")) {
                        c = 10;
                        break;
                    }
                    c = 65535;
                    break;
                case 94070761:
                    if (asString.equals("vnd.com.google.cursor.item/contact_hobby")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 456415478:
                    if (asString.equals("vnd.android.cursor.item/website")) {
                        c = 13;
                        break;
                    }
                    c = 65535;
                    break;
                case 684173810:
                    if (asString.equals("vnd.android.cursor.item/phone_v2")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 689862072:
                    if (asString.equals("vnd.android.cursor.item/organization")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 905843021:
                    if (asString.equals("vnd.android.cursor.item/photo")) {
                        c = 8;
                        break;
                    }
                    c = 65535;
                    break;
                case 950831081:
                    if (asString.equals("vnd.android.cursor.item/im")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1238509849:
                    if (asString.equals("vnd.com.google.cursor.item/contact_user_defined_field")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 1332665825:
                    if (asString.equals("vnd.com.google.cursor.item/contact_language")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case 1409846529:
                    if (asString.equals("vnd.android.cursor.item/relation")) {
                        c = 9;
                        break;
                    }
                    c = 65535;
                    break;
                case 1464444786:
                    if (asString.equals("vnd.com.google.cursor.item/contact_calendar_link")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 1464725403:
                    if (asString.equals("vnd.android.cursor.item/group_membership")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1635852198:
                    if (asString.equals("vnd.com.google.cursor.item/contact_jot")) {
                        c = 22;
                        break;
                    }
                    c = 65535;
                    break;
                case 1828520899:
                    if (asString.equals("vnd.android.cursor.item/identity")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case 2034973555:
                    if (asString.equals("vnd.android.cursor.item/nickname")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            Class cls = null;
            switch (c) {
                case 0:
                    cls = bldu.class;
                    break;
                case 1:
                    Log.w("FSA2_DataTypeConverters", "@getDataType: Use either fromCp2Events or fromCp2Birthdays");
                    break;
                case 2:
                    cls = bleg.class;
                    break;
                case 3:
                    cls = bled.class;
                    break;
                case 4:
                    cls = blek.class;
                    break;
                case 5:
                    cls = bldg.class;
                    break;
                case 6:
                    cls = bleo.class;
                    break;
                case 7:
                    cls = blex.class;
                    break;
                case 8:
                    cls = bley.class;
                    break;
                case 9:
                    cls = blfb.class;
                    break;
                case 10:
                    cls = blfc.class;
                    break;
                case 11:
                    cls = bleh.class;
                    break;
                case 12:
                    cls = bldh.class;
                    break;
                case 13:
                    cls = blff.class;
                    break;
                case 14:
                    cls = bldj.class;
                    break;
                case 15:
                    cls = blee.class;
                    break;
                case 16:
                    cls = blfe.class;
                    break;
                case 17:
                    cls = blea.class;
                    break;
                case 18:
                    cls = bldw.class;
                    break;
                case 19:
                    cls = blef.class;
                    break;
            }
            if (cls != null) {
                return m61623a(list, str, mo40674a(cls));
            }
        }
        return new ArrayList();
    }

    /* renamed from: a */
    public static bleu m61619a(String str, boolean z) {
        bleu f = m61636f(str);
        bxvd bxvd = (bxvd) f.mo74142c(5);
        bxvd.mo73625a((bxvk) f);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bleu bleu = (bleu) bxvd.f164949b;
        bleu bleu2 = bleu.f126278h;
        bleu.f126280a |= 2048;
        bleu.f126286g = z;
        return (bleu) bxvd.mo74062i();
    }

    /* renamed from: a */
    public static Integer m61620a(ContentValues contentValues, String str) {
        String asString = contentValues.getAsString(str);
        if (asString == null) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(asString));
        } catch (NumberFormatException e) {
            amdk.m62656a("FSA2_DataTypeConverters", "Failed to parse {rawType=%s}", asString);
            return null;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: alse.a(java.lang.String, java.util.Map, java.lang.Integer):alrm
     arg types: [java.lang.String, bnhe, int]
     candidates:
      alse.a(java.util.List, java.lang.String, alrl):java.util.List
      alse.a(bleu, java.lang.String, int):boolean
      alse.a(java.lang.String, java.util.Map, java.lang.Integer):alrm */
    /* renamed from: b */
    public static List m61631b(List list, String str) {
        ContentValues contentValues;
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            bldu bldu = (bldu) list.get(i);
            if (bldu != null) {
                bleu bleu = bldu.f126134b;
                if (bleu == null) {
                    bleu = bleu.f126278h;
                }
                if (m61628a(bleu, str, 2)) {
                    boolean z = bleu.f126286g;
                    alrm a = m61618a(bldu.f126136d, (Map) f74193b, (Integer) 0);
                    contentValues = alsf.m61641a(a.f74170a.intValue(), bldu.f126135c, bldu.f126137e, a.f74171b, z);
                } else {
                    contentValues = null;
                }
                if (contentValues != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(contentValues);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static String m61621a(Integer num, String str, Map map, Integer num2) {
        if (num != null) {
            return !num.equals(num2) ? (String) map.get(num) : str;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0088, code lost:
        if (r8.equals("vnd.android.cursor.item/phone_v2") == false) goto L_0x009f;
     */
    /* renamed from: a */
    public static List m61622a(bleu bleu, String str, String str2, List list) {
        int a;
        if (bleu != null) {
            bxwc bxwc = bleu.f126285f;
            if (!bxwc.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                int size = bxwc.size();
                char c = 0;
                for (int i = 0; i < size; i++) {
                    bldt bldt = (bldt) bxwc.get(i);
                    if (!(bldt == null || (a = bldn.m107047a(bldt.f126129b)) == 0 || a != 2 || (bldt.f126128a & 8) == 0)) {
                        blfg blfg = bldt.f126130c;
                        if (blfg == null) {
                            blfg = blfg.f126357b;
                        }
                        String valueOf = String.valueOf(ancm.m64024m(blfg.f126359a));
                        arrayList.add(valueOf.length() == 0 ? new String("gprofile:") : "gprofile:".concat(valueOf));
                    }
                }
                if (!arrayList.isEmpty()) {
                    String join = TextUtils.join(",", arrayList);
                    ContentValues contentValues = null;
                    if (!TextUtils.isEmpty(str)) {
                        int hashCode = str.hashCode();
                        if (hashCode != -1569536764) {
                            if (hashCode != 456415478) {
                                if (hashCode == 684173810) {
                                }
                            } else if (str.equals("vnd.android.cursor.item/website")) {
                                c = 2;
                                if (c == 0 || c == 1 || c == 2) {
                                    contentValues = new ContentValues();
                                    contentValues.put("mimetype", "vnd.android.cursor.item/identity");
                                    contentValues.put("data1", join);
                                    contentValues.put("data2", "com.google");
                                    StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
                                    sb.append(str);
                                    sb.append(" ");
                                    sb.append(str2);
                                    contentValues.put("data_sync3", sb.toString());
                                }
                            }
                        } else if (str.equals("vnd.android.cursor.item/email_v2")) {
                            c = 1;
                            contentValues = new ContentValues();
                            contentValues.put("mimetype", "vnd.android.cursor.item/identity");
                            contentValues.put("data1", join);
                            contentValues.put("data2", "com.google");
                            StringBuilder sb2 = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
                            sb2.append(str);
                            sb2.append(" ");
                            sb2.append(str2);
                            contentValues.put("data_sync3", sb2.toString());
                        }
                        c = 65535;
                        contentValues = new ContentValues();
                        contentValues.put("mimetype", "vnd.android.cursor.item/identity");
                        contentValues.put("data1", join);
                        contentValues.put("data2", "com.google");
                        StringBuilder sb22 = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
                        sb22.append(str);
                        sb22.append(" ");
                        sb22.append(str2);
                        contentValues.put("data_sync3", sb22.toString());
                    }
                    if (contentValues != null) {
                        if (list == null) {
                            list = new ArrayList();
                        }
                        list.add(contentValues);
                    }
                }
            }
        }
        return list;
    }

    /* renamed from: b */
    public static boolean m61632b(String str) {
        if (str != null) {
            return str.startsWith("--");
        }
        return false;
    }

    /* renamed from: a */
    public static List m61623a(List list, String str, alrl alrl) {
        ArrayList arrayList = new ArrayList();
        if (alrl != null && !ancm.m64008a((Collection) list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Object a = alrl.mo40673a((ContentValues) it.next(), str);
                if (a != null) {
                    arrayList.add(a);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0006 A[SYNTHETIC] */
    /* renamed from: a */
    public static List m61624a(List list, String str, alrl alrl, int i) {
        ContentValues contentValues;
        ArrayList arrayList = null;
        for (Object obj : list) {
            if (obj != null) {
                bleu a = alrl.mo40672a(obj);
                if (a != null) {
                    try {
                        if (m61628a(a, str, i)) {
                            contentValues = alrl.mo40671a(obj, a.f126286g);
                            if (contentValues != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(contentValues);
                            }
                        }
                    } catch (Throwable th) {
                        Log.e("FSA2_DataTypeConverters", "Failed to convert People-API data item", th);
                    }
                }
                contentValues = null;
                if (contentValues != null) {
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Map m61625a(Map map) {
        HashMap hashMap = new HashMap();
        for (Object obj : map.keySet()) {
            hashMap.put(map.get(obj), obj);
        }
        return hashMap;
    }

    /* renamed from: a */
    public static boolean m61626a(ContentValues contentValues) {
        Long asLong = contentValues.getAsLong("is_primary");
        return asLong != null && asLong.longValue() > 0;
    }

    /* renamed from: a */
    public static boolean m61627a(bleu bleu, String str) {
        int a;
        return bleu != null && (a = bldn.m107047a(bleu.f126282c)) != 0 && a == 3 && str.equals(bleu.f126283d);
    }

    /* renamed from: a */
    private static boolean m61628a(bleu bleu, String str, int i) {
        int a;
        int a2;
        if (i != 3) {
            return !((bleu == null || (a2 = bldn.m107047a(bleu.f126282c)) == 0 || a2 != 2) && (bleu == null || (a = bldn.m107047a(bleu.f126282c)) == 0 || a != 8)) && str.equals(bleu.f126283d);
        }
        return m61627a(bleu, str);
    }

    /* renamed from: a */
    public static boolean m61629a(String str) {
        if (str != null) {
            return str.startsWith("0000-");
        }
        return false;
    }

    /* renamed from: a */
    public final alrl mo40674a(Class cls) {
        alrl alrl = (alrl) this.f74194c.get(cls);
        if (alrl == null) {
            Log.e("FSA2_DataTypeConverters", "Missing converter, bailing out", new UnsupportedOperationException());
        }
        return alrl;
    }

    /* renamed from: a */
    public final List mo40675a(List list, String str) {
        alrl a = mo40674a(list.get(0).getClass());
        if (a != null) {
            return m61624a(list, str, a, 2);
        }
        return null;
    }
}
