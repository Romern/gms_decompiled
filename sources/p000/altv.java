package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.util.Log;
import java.lang.Character;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: altv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class altv {

    /* renamed from: c */
    public static final Pattern f74261c = Pattern.compile("[^a-zA-Z0-9-￿]+");

    /* renamed from: a */
    public final Context f74262a;

    /* renamed from: b */
    public final altq f74263b;

    /* renamed from: d */
    public final altt f74264d;

    /* renamed from: e */
    private final ContentValues f74265e = new ContentValues();

    /* renamed from: f */
    private final boolean f74266f;

    /* renamed from: g */
    private boolean f74267g;

    /* renamed from: h */
    private boolean f74268h;

    /* renamed from: i */
    private bmza f74269i;

    /* renamed from: j */
    private final Set f74270j = new HashSet();

    /* renamed from: k */
    private final String[] f74271k = new String[3];

    /* renamed from: a */
    private static String m61846a(String[] strArr) {
        return TextUtils.join("", strArr);
    }

    /* renamed from: b */
    public static String[] m61850b(String str) {
        return ancm.m64010a(f74261c.split(str));
    }

    /* renamed from: c */
    public static String m61851c(String str) {
        return f74261c.matcher(alts.m61839a(str)).replaceAll("");
    }

    /* renamed from: d */
    private final String[] m61852d(String str) {
        int codePointAt;
        String str2 = str;
        if (!this.f74267g && !this.f74268h) {
            return ancm.f76631b;
        }
        char c = 4;
        if (str2 != null) {
            int length = str.length();
            int i = 0;
            char c2 = 0;
            while (true) {
                if (i >= length) {
                    c = c2;
                    break;
                }
                codePointAt = Character.codePointAt(str2, i);
                if (Character.isLetter(codePointAt)) {
                    Character.UnicodeBlock of = Character.UnicodeBlock.of(codePointAt);
                    if (!Character.UnicodeBlock.BASIC_LATIN.equals(of) && !Character.UnicodeBlock.LATIN_1_SUPPLEMENT.equals(of) && !Character.UnicodeBlock.LATIN_EXTENDED_A.equals(of) && !Character.UnicodeBlock.LATIN_EXTENDED_B.equals(of) && !Character.UnicodeBlock.LATIN_EXTENDED_ADDITIONAL.equals(of)) {
                        if (!Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS.equals(of) && !Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A.equals(of) && !Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B.equals(of) && !Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION.equals(of) && !Character.UnicodeBlock.CJK_RADICALS_SUPPLEMENT.equals(of) && !Character.UnicodeBlock.CJK_COMPATIBILITY.equals(of) && !Character.UnicodeBlock.CJK_COMPATIBILITY_FORMS.equals(of) && !Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS.equals(of) && !Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT.equals(of)) {
                            if (!alts.m61841b(of)) {
                                if (alts.m61840a(of)) {
                                    c = 5;
                                    break;
                                }
                                c2 = 1;
                            } else {
                                break;
                            }
                        } else {
                            int charCount = i + Character.charCount(codePointAt);
                            int length2 = str.length();
                        }
                    } else {
                        c2 = 1;
                    }
                }
                i += Character.charCount(codePointAt);
            }
            int charCount2 = i + Character.charCount(codePointAt);
            int length22 = str.length();
            while (true) {
                if (charCount2 >= length22) {
                    c = 2;
                    break;
                }
                int codePointAt2 = Character.codePointAt(str2, charCount2);
                if (Character.isLetter(codePointAt2)) {
                    Character.UnicodeBlock of2 = Character.UnicodeBlock.of(codePointAt2);
                    if (!alts.m61841b(of2)) {
                        if (alts.m61840a(of2)) {
                            c = 5;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                charCount2 += Character.charCount(codePointAt2);
            }
        } else {
            c = 0;
        }
        if (c == 2) {
            if (this.f74267g) {
                altk a = altk.m61768a(this.f74262a);
                ArrayList arrayList = new ArrayList();
                if (!a.f74221c || TextUtils.isEmpty(str)) {
                    return ancm.f76631b;
                }
                int length3 = str.length();
                StringBuilder sb = new StringBuilder();
                int i2 = 1;
                for (int i3 = 0; i3 < length3; i3++) {
                    char charAt = str2.charAt(i3);
                    if (ancm.m64007a(charAt)) {
                        if (sb.length() > 0) {
                            altk.m61769a(sb, arrayList, i2);
                        }
                    } else if (charAt >= 256) {
                        altj altj = new altj();
                        String ch = Character.toString(charAt);
                        altj.f74216b = ch;
                        if (charAt <= 40959 && charAt >= 19968) {
                            altj.f74215a = 2;
                            altj.f74217c = a.f74219a[a.f74220b[charAt - 19968]];
                            if (TextUtils.isEmpty(altj.f74217c)) {
                                altj.f74215a = 3;
                                altj.f74217c = altj.f74216b;
                            }
                        } else {
                            altj.f74215a = 3;
                            altj.f74217c = ch;
                        }
                        int i4 = altj.f74215a;
                        if (i4 == 2) {
                            if (sb.length() > 0) {
                                altk.m61769a(sb, arrayList, i2);
                            }
                            arrayList.add(altj);
                            i2 = 2;
                        } else {
                            if (i2 != i4 && sb.length() > 0) {
                                altk.m61769a(sb, arrayList, i2);
                            }
                            i2 = altj.f74215a;
                            sb.append(charAt);
                        }
                    } else {
                        if (i2 != 1 && sb.length() > 0) {
                            altk.m61769a(sb, arrayList, i2);
                        }
                        sb.append(charAt);
                        i2 = 1;
                    }
                }
                if (sb.length() > 0) {
                    altk.m61769a(sb, arrayList, i2);
                }
                String[] strArr = new String[arrayList.size()];
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    strArr[i5] = ((altj) arrayList.get(i5)).f74217c;
                }
                return strArr;
            }
        } else if (c == 5 && this.f74268h) {
            String[] strArr2 = new String[1];
            alti.f74214b.setLength(0);
            int length4 = str.length();
            int i6 = 0;
            while (true) {
                int i7 = i6 + 1;
                int codePointAt3 = str2.codePointAt(i6);
                if (!(codePointAt3 == 32 || codePointAt3 == 44 || codePointAt3 == 46)) {
                    if (codePointAt3 < 4352 || ((codePointAt3 > 4370 && codePointAt3 < 12593) || ((codePointAt3 > 12622 && codePointAt3 < 44032) || codePointAt3 > 55203))) {
                        break;
                    }
                    if (codePointAt3 < 44032) {
                        if (codePointAt3 >= 12593) {
                            int i8 = codePointAt3 - 12593;
                            if (i8 >= alti.f74213a.length) {
                                break;
                            }
                            codePointAt3 = alti.f74213a[i8];
                            if (codePointAt3 == 0) {
                                break;
                            }
                        }
                    } else {
                        codePointAt3 = ((codePointAt3 - 44032) / 588) + 4352;
                    }
                    alti.f74214b.appendCodePoint(codePointAt3);
                }
                if (i7 >= length4) {
                    break;
                }
                i6 = i7;
            }
            strArr2[0] = alti.f74214b.toString();
            return strArr2;
        }
        return ancm.f76631b;
    }

    public altv(altq altq, Context context) {
        this.f74262a = context;
        this.f74263b = altq;
        this.f74264d = new altt();
        mo40778a(Locale.getDefault());
        amig.m62939a();
        boolean booleanValue = Boolean.valueOf(cgbe.f186279a.mo6606a().mo83328bE()).booleanValue();
        this.f74266f = booleanValue;
        if (booleanValue) {
            this.f74269i = bmza.m108658b();
        }
    }

    /* renamed from: a */
    private final void m61847a(alto alto, long j, int i, String str) {
        this.f74265e.clear();
        this.f74265e.put("person_id", Long.valueOf(j));
        this.f74265e.put("kind", Integer.valueOf(i));
        this.f74265e.put("value", str);
        alto.mo40742a("search_index", this.f74265e);
    }

    /* renamed from: a */
    private final void m61848a(alto alto, long j, Set set, String str) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).startsWith(str)) {
                return;
            }
        }
        set.add(str);
        m61847a(alto, j, 1, alts.m61839a(str));
    }

    /* renamed from: a */
    public static String[] m61849a(String str) {
        return ancm.m64010a(ancm.f76633d.split(str));
    }

    /* renamed from: a */
    public final void mo40776a(int i) {
        this.f74263b.mo40764b("searchIndexVersion", String.valueOf(i));
    }

    /* JADX WARNING: Removed duplicated region for block: B:149:0x038b  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x038d  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0390  */
    /* JADX WARNING: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    public final void mo40777a(alto alto) {
        long j;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        String[] strArr;
        String[] strArr2;
        int i7;
        int i8;
        Cursor a;
        alto alto2 = alto;
        Log.i("PeopleSearchIndexManage", "Rebuilding index...");
        aluj.m61898a(this.f74262a, "PeopleSearchIndexManage", "Rebuilding index...");
        if (this.f74266f) {
            j = this.f74269i.mo66928a(TimeUnit.MILLISECONDS);
        } else {
            j = 0;
        }
        sdo.m34970a(alto.mo40756g());
        int i9 = 3;
        int i10 = 1;
        try {
            bngx<String> a2 = bngx.m109357a("search_index", "ac_index");
            bngs j2 = bngx.m109377j();
            j2.mo67668c("ac_people_v2_id");
            j2.mo67668c("ac_item_container_person_id");
            j2.mo67668c("ac_item_container");
            j2.mo67668c("ac_index_1");
            j2.mo67668c("search_person_id_index");
            j2.mo67668c("search_value");
            j2.mo67668c("ac_index_item_id");
            amig.m62939a();
            if (((Boolean) amhf.f74908a.mo41191a()).booleanValue()) {
                if (!((Boolean) amhg.f74909a.mo41191a()).booleanValue()) {
                    j2.mo67668c("ac_item_affinity_1");
                }
            }
            bngx<String> a3 = j2.mo67664a();
            for (String str : a3) {
                alto2.mo40747a(alth.m61764b(str));
            }
            for (String str2 : a2) {
                alto2.mo40747a(alth.m61758a(str2));
            }
            bnhe a4 = altg.m61755a();
            for (String str3 : a2) {
                if (a4.containsKey(str3)) {
                    a4.get(str3);
                    alto2.f74233b.execSQL((String) a4.get(str3));
                }
            }
            bnhe b = altg.m61756b();
            for (String str4 : a3) {
                if (b.containsKey(str4)) {
                    b.get(str4);
                    alto2.f74233b.execSQL((String) b.get(str4));
                }
            }
            if (((Boolean) amhg.f74909a.mo41191a()).booleanValue()) {
                alto2.mo40747a(alth.m61764b("ac_item_affinity_1"));
            }
            altp.m61801e(alto2.f74233b);
            String[] strArr3 = null;
            Cursor a5 = alto2.mo40745a("people", altu.f74260a, (String) null, (String[]) null);
            while (true) {
                try {
                    int i11 = 50;
                    int i12 = 2;
                    int i13 = 0;
                    if (a5.isAfterLast()) {
                        break;
                    }
                    int i14 = 0;
                    while (true) {
                        if (i14 < i11) {
                            if (!a5.moveToNext()) {
                                break;
                            }
                            long j3 = (long) a5.getInt(i4);
                            String valueOf = String.valueOf(a5.getString(i3));
                            String[] strArr4 = new String[i3];
                            strArr4[i4] = a5.getString(i);
                            strArr4[i] = valueOf;
                            Cursor a6 = alto2.mo40744a("SELECT name as data, given_name as data2,family_name as data3,middle_name as data4,1 as kind FROM people WHERE owner_id=?1 AND qualified_id=?2 AND name IS NOT NULL UNION SELECT phone as data, NULL as data2,NULL as data3,NULL as data4,3 as kind FROM phones WHERE owner_id=?1 AND qualified_id=?2 UNION SELECT email as data,NULL as data2,NULL as data3,NULL as data4,2 as kind FROM emails WHERE owner_id=?1 AND qualified_id=?2;", strArr4);
                            while (a6.moveToNext()) {
                                try {
                                    String string = a6.getString(i4);
                                    int i15 = a6.getInt(4);
                                    if (i15 == i) {
                                        String string2 = a6.getString(i);
                                        String string3 = a6.getString(i3);
                                        String string4 = a6.getString(i2);
                                        String[] strArr5 = this.f74271k;
                                        strArr5[i4] = string2;
                                        strArr5[i] = string3;
                                        strArr5[i3] = string4;
                                        String a7 = ancm.m64002a(string.toLowerCase(Locale.US));
                                        if (a7.length() != 0) {
                                            this.f74270j.clear();
                                            String a8 = m61846a(f74261c.split(a7));
                                            long j4 = j3;
                                            int i16 = i14;
                                            m61848a(alto, j4, this.f74270j, a8);
                                            String[] d = m61852d(a8);
                                            if (d.length > 0) {
                                                m61848a(alto, j4, this.f74270j, m61846a(d));
                                            }
                                            int length = strArr5.length;
                                            int i17 = 0;
                                            while (i17 < length) {
                                                String str5 = strArr5[i17];
                                                if (!TextUtils.isEmpty(str5)) {
                                                    String a9 = ancm.m64002a(ancm.m64002a(str5.toLowerCase(Locale.US)));
                                                    if (!TextUtils.isEmpty(a9)) {
                                                        String[] d2 = m61852d(a9);
                                                        if (d2.length <= 0) {
                                                            i6 = i17;
                                                            strArr = f74261c.split(a9);
                                                        } else {
                                                            i6 = i17;
                                                            m61848a(alto, j4, this.f74270j, a9);
                                                            strArr = d2;
                                                        }
                                                        int length2 = strArr.length;
                                                        if (length2 > i) {
                                                            i7 = length2;
                                                            strArr2 = strArr;
                                                            m61848a(alto, j4, this.f74270j, m61846a(strArr));
                                                            i8 = 0;
                                                        } else {
                                                            i7 = length2;
                                                            strArr2 = strArr;
                                                            i8 = 0;
                                                        }
                                                        while (i8 < i7) {
                                                            m61848a(alto, j4, this.f74270j, strArr2[i8]);
                                                            i8++;
                                                        }
                                                    } else {
                                                        i6 = i17;
                                                    }
                                                } else {
                                                    i6 = i17;
                                                }
                                                i17 = i6 + 1;
                                                i = 1;
                                            }
                                            j3 = j4;
                                            i14 = i16;
                                            i4 = 0;
                                            i3 = 2;
                                            i2 = 3;
                                            i = 1;
                                        } else {
                                            i4 = 0;
                                            i3 = 2;
                                            i2 = 3;
                                            i = 1;
                                        }
                                    } else {
                                        long j5 = j3;
                                        int i18 = i14;
                                        if (i15 == 2) {
                                            String[] b2 = m61850b(string);
                                            int length3 = b2.length;
                                            int i19 = 0;
                                            while (i19 < length3) {
                                                String str6 = b2[i19];
                                                if (!TextUtils.isEmpty(str6)) {
                                                    i5 = i19;
                                                    m61847a(alto, j5, 2, str6.toLowerCase(Locale.US));
                                                } else {
                                                    i5 = i19;
                                                }
                                                i19 = i5 + 1;
                                            }
                                            j3 = j5;
                                            i14 = i18;
                                            i4 = 0;
                                            i3 = 2;
                                            i2 = 3;
                                            i = 1;
                                        } else if (i15 == 3) {
                                            try {
                                                if (!TextUtils.isEmpty(string)) {
                                                    if (string.charAt(0) == '+') {
                                                        string = string.substring(1);
                                                    }
                                                    m61847a(alto, j5, 3, PhoneNumberUtils.stripSeparators(string));
                                                    j3 = j5;
                                                    i14 = i18;
                                                    i4 = 0;
                                                    i3 = 2;
                                                    i2 = 3;
                                                    i = 1;
                                                } else {
                                                    j3 = j5;
                                                    i14 = i18;
                                                    i4 = 0;
                                                    i3 = 2;
                                                    i2 = 3;
                                                    i = 1;
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                a6.close();
                                                throw th;
                                            }
                                        } else {
                                            j3 = j5;
                                            i14 = i18;
                                            i4 = 0;
                                            i3 = 2;
                                            i2 = 3;
                                            i = 1;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    try {
                                        a5.close();
                                        throw th;
                                    } catch (SQLException e) {
                                        e = e;
                                        try {
                                            aluj.m61903a(this.f74262a, "PeopleSearchIndexManage", "Error rebuilding search index.", e);
                                            Log.w("PeopleSearchIndexManage", "Error rebuilding search index.", e);
                                            int i20 = z ? 1 : 3;
                                            if (!z) {
                                                almk.m61263a().mo40511a(i20, this.f74269i.mo66928a(TimeUnit.MILLISECONDS) - j);
                                                return;
                                            }
                                            return;
                                        } finally {
                                            if (this.f74266f) {
                                                almk.m61263a().mo40511a(1, this.f74269i.mo66928a(TimeUnit.MILLISECONDS) - j);
                                            }
                                        }
                                    }
                                }
                            }
                            int i21 = i14;
                            a6.close();
                            i14 = i21 + 1;
                            i13 = 0;
                            i12 = 2;
                            i9 = 3;
                            i10 = 1;
                            i11 = 50;
                        } else {
                            break;
                        }
                    }
                    alto.mo40757i();
                    i9 = 3;
                    i10 = 1;
                    strArr3 = null;
                } catch (Throwable th3) {
                    th = th3;
                    a5.close();
                    throw th;
                }
            }
            a5.close();
            altt altt = this.f74264d;
            alto.mo40754e();
            Log.i("PeopleASM", "Rebuilding autocomplete index...");
            a = alto2.mo40744a("SELECT _id FROM ac_people", strArr3);
            int i22 = 0;
            while (a.moveToNext()) {
                altt.mo40775a(alto2, a.getLong(0));
                i22 += i10;
                if (i22 > 50) {
                    alto.mo40757i();
                    i22 = 0;
                }
            }
            a.close();
            aluj.m61898a(this.f74262a, "PeopleSearchIndexManage", "Rebuilding index done.");
            Log.i("PeopleSearchIndexManage", "Rebuilding index done.");
            boolean z2 = this.f74266f;
            if (z2) {
                i10 = 2;
            }
            if (z2) {
                almk.m61263a().mo40511a(i10, this.f74269i.mo66928a(TimeUnit.MILLISECONDS) - j);
            }
        } catch (SQLException e2) {
            e = e2;
            aluj.m61903a(this.f74262a, "PeopleSearchIndexManage", "Error rebuilding search index.", e);
            Log.w("PeopleSearchIndexManage", "Error rebuilding search index.", e);
            if (z) {
            }
            if (!z) {
            }
        } catch (Throwable th4) {
            a.close();
            throw th4;
        }
    }

    /* renamed from: a */
    public final void mo40778a(Locale locale) {
        String lowerCase = locale.getLanguage().toLowerCase(Locale.US);
        String lowerCase2 = locale.getCountry().toLowerCase(Locale.US);
        boolean z = false;
        if (!Locale.JAPANESE.getLanguage().toLowerCase(Locale.US).equals(lowerCase) && !Locale.KOREAN.getLanguage().toLowerCase(Locale.US).equals(lowerCase) && !Locale.TAIWAN.getCountry().toLowerCase(Locale.US).equals(lowerCase2)) {
            z = true;
        }
        this.f74267g = z;
        this.f74268h = Locale.KOREAN.getLanguage().toLowerCase(Locale.US).equals(lowerCase);
    }
}
