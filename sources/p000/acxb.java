package p000;

import android.content.Context;
import android.os.Build;
import android.provider.CalendarContract;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: acxb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acxb {

    /* renamed from: b */
    private static final bmyx f60997b = bmyx.m108640a(';').mo66920b().mo66917a();

    /* renamed from: c */
    private static final bmyx f60998c = bmyx.m108640a('=').mo66920b().mo66917a();

    /* renamed from: d */
    private static final bmyx f60999d = bmyx.m108640a(',').mo66920b().mo66917a();

    /* renamed from: e */
    private static volatile Pair f61000e;

    /* renamed from: a */
    public final Context f61001a;

    public acxb(Context context) {
        this.f61001a = context;
    }

    /* renamed from: a */
    public static abpr m49918a() {
        bxvd da = abpr.f57891d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abpr abpr = (abpr) da.f164949b;
        abpr.f57893a |= 1;
        abpr.f57895c = 1;
        bxvd da2 = abpy.f57922f.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        abpy abpy = (abpy) da2.f164949b;
        abpy.f57928e = 2;
        abpy.f57924a |= 1;
        bxvd da3 = abpx.f57916e.mo74144da();
        da3.mo73975a(m49921c());
        da3.mo74028b((abpy) da2.mo74062i());
        da3.mo73978a(m49922d());
        da3.mo73978a(m49924f());
        da3.mo73978a(m49923e());
        da3.mo73976a(abpw.READ);
        da.mo73977a((abpx) da3.mo74062i());
        abpu c = m49921c();
        bxvd bxvd = (bxvd) c.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) c);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        abpu abpu = abpu.f57904c;
        ((abpu) bxvd.f164949b).f57907b = GeneratedMessageLite.m124030de();
        bxvd da4 = abpt.f57900c.mo74144da();
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        abpt abpt = (abpt) da4.f164949b;
        "android.permission.READ_SMS".getClass();
        abpt.f57902a |= 1;
        abpt.f57903b = "android.permission.READ_SMS";
        bxvd.mo73974a((abpt) da4.mo74062i());
        bxvd da5 = abpx.f57916e.mo74144da();
        da5.mo74088n(bxvd);
        da5.mo74028b(m49924f());
        da5.mo74028b(m49923e());
        da5.mo73976a(abpw.READ);
        da.mo73977a((abpx) da5.mo74062i());
        if (cemq.m137366c()) {
            abpu c2 = m49921c();
            bxvd bxvd2 = (bxvd) c2.mo74142c(5);
            bxvd2.mo73625a((GeneratedMessageLite) c2);
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            ((abpu) bxvd2.f164949b).f57907b = GeneratedMessageLite.m124030de();
            bxvd da6 = abpt.f57900c.mo74144da();
            if (da6.f164950c) {
                da6.mo74035c();
                da6.f164950c = false;
            }
            abpt abpt2 = (abpt) da6.f164949b;
            "android.permission.READ_CALENDAR".getClass();
            abpt2.f57902a |= 1;
            abpt2.f57903b = "android.permission.READ_CALENDAR";
            bxvd2.mo73974a((abpt) da6.mo74062i());
            bxvd da7 = abpx.f57916e.mo74144da();
            da7.mo74088n(bxvd2);
            da7.mo74028b(m49922d());
            da7.mo73976a(abpw.READ);
            da.mo73977a((abpx) da7.mo74062i());
        }
        if (((Boolean) abzt.f58838F.mo58455c()).booleanValue()) {
            bxvd da8 = abpu.f57904c.mo74144da();
            if (da8.f164950c) {
                da8.mo74035c();
                da8.f164950c = false;
            }
            abpu.m48051a((abpu) da8.f164949b);
            for (String str : abzt.m48725a()) {
                bxvd da9 = abps.f57896c.mo74144da();
                if (da9.f164950c) {
                    da9.mo74035c();
                    da9.f164950c = false;
                }
                abps abps = (abps) da9.f164949b;
                str.getClass();
                abps.f57898a |= 1;
                abps.f57899b = str;
                da8.mo74074k(da9);
            }
            bxvd da10 = abpy.f57922f.mo74144da();
            List asList = Arrays.asList(((String) abzt.f58841I.mo58455c()).split(","));
            if (da10.f164950c) {
                da10.mo74035c();
                da10.f164950c = false;
            }
            abpy abpy2 = (abpy) da10.f164949b;
            abpy2.mo32282a();
            bxsy.m123078a(asList, abpy2.f57925b);
            if (da10.f164950c) {
                da10.mo74035c();
                da10.f164950c = false;
            }
            abpy abpy3 = (abpy) da10.f164949b;
            abpy3.f57928e = 2;
            abpy3.f57924a |= 1;
            bxvd da11 = abpx.f57916e.mo74144da();
            da11.mo74088n(da8);
            da11.mo74028b((abpy) da10.mo74062i());
            da11.mo73976a(abpw.READ);
            da.mo73977a((abpx) da11.mo74062i());
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : m49920b().entrySet()) {
            bxvd da12 = abpu.f57904c.mo74144da();
            if (da12.f164950c) {
                da12.mo74035c();
                da12.f164950c = false;
            }
            abpu.m48051a((abpu) da12.f164949b);
            bxvd da13 = abps.f57896c.mo74144da();
            String str2 = (String) entry.getKey();
            if (da13.f164950c) {
                da13.mo74035c();
                da13.f164950c = false;
            }
            abps abps2 = (abps) da13.f164949b;
            str2.getClass();
            abps2.f57898a |= 1;
            abps2.f57899b = str2;
            da12.mo74074k(da13);
            abpu abpu2 = (abpu) da12.mo74062i();
            bxvd da14 = abpy.f57922f.mo74144da();
            if (da14.f164950c) {
                da14.mo74035c();
                da14.f164950c = false;
            }
            abpy abpy4 = (abpy) da14.f164949b;
            abpy4.f57928e = 2;
            abpy4.f57924a |= 1;
            for (String str3 : (Set) entry.getValue()) {
                if (da14.f164950c) {
                    da14.mo74035c();
                    da14.f164950c = false;
                }
                abpy abpy5 = (abpy) da14.f164949b;
                str3.getClass();
                if (!abpy5.f57927d.mo73666a()) {
                    abpy5.f57927d = GeneratedMessageLite.m124021a(abpy5.f57927d);
                }
                abpy5.f57927d.add(str3);
            }
            bxvd da15 = abpx.f57916e.mo74144da();
            da15.mo73975a(abpu2);
            if (da15.f164950c) {
                da15.mo74035c();
                da15.f164950c = false;
            }
            abpx abpx = (abpx) da15.f164949b;
            abpy abpy6 = (abpy) da14.mo74062i();
            abpy6.getClass();
            abpx.mo32281b();
            abpx.f57919b.add(abpy6);
            da15.mo73976a(abpw.READ);
            arrayList.add((abpx) da15.mo74062i());
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abpr abpr2 = (abpr) da.f164949b;
        abpr2.mo32277a();
        bxsy.m123078a(arrayList, abpr2.f57894b);
        return (abpr) da.mo74062i();
    }

    /* renamed from: b */
    public static Map m49920b() {
        Pair pair;
        String str = (String) abzt.f58964bz.mo58455c();
        absg.m48202d("Checking AppIndexing type access whitelist: %s", str);
        if (str == null || str.isEmpty()) {
            return Collections.emptyMap();
        }
        Pair pair2 = f61000e;
        if (pair2 == null || !((String) pair2.first).equals(str)) {
            synchronized (acxb.class) {
                if (f61000e == null || !((String) f61000e.first).equals(str)) {
                    HashMap hashMap = new HashMap();
                    for (String str2 : f60997b.mo66918a((CharSequence) str)) {
                        List c = f60998c.mo66925c((CharSequence) str2);
                        if (c.size() != 2) {
                            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 28);
                            sb.append("Invalid whitelist segment \"");
                            sb.append(str2);
                            sb.append("\"");
                            absg.m48191b(sb.toString());
                        } else {
                            String str3 = (String) c.get(0);
                            Set set = (Set) hashMap.get(str3);
                            if (set == null) {
                                set = new LinkedHashSet();
                                hashMap.put(str3, set);
                            }
                            for (String str4 : f60999d.mo66918a((CharSequence) c.get(1))) {
                                set.add(str4);
                            }
                        }
                    }
                    f61000e = new Pair(str, hashMap);
                }
                pair = f61000e;
            }
            pair2 = pair;
        }
        return (Map) pair2.second;
    }

    /* renamed from: c */
    private static abpu m49921c() {
        bxvd da = abpu.f57904c.mo74144da();
        String[] split = TextUtils.split((String) abzt.f58844L.mo58455c(), ",");
        for (String str : split) {
            bxvd da2 = abps.f57896c.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            abps abps = (abps) da2.f164949b;
            str.getClass();
            abps.f57898a |= 1;
            abps.f57899b = str;
            abps abps2 = (abps) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            abpu abpu = (abpu) da.f164949b;
            abps2.getClass();
            abpu.mo32278a();
            abpu.f57906a.add(abps2);
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abpu.m48051a((abpu) da.f164949b);
        return (abpu) da.mo74062i();
    }

    /* renamed from: d */
    private static abpy m49922d() {
        bxvd da = abpy.f57922f.mo74144da();
        da.mo74086m("internal.3p:Event");
        da.mo74090n("com.google.android.gms");
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abpy abpy = (abpy) da.f164949b;
        abpy.f57928e = 2;
        abpy.f57924a |= 1;
        return (abpy) da.mo74062i();
    }

    /* renamed from: e */
    private static abpy m49923e() {
        bxvd da = abpy.f57922f.mo74144da();
        da.mo74086m("internal.3p:Message");
        da.mo74090n("com.google.android.gms");
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abpy abpy = (abpy) da.f164949b;
        abpy.f57928e = 2;
        abpy.f57924a |= 1;
        return (abpy) da.mo74062i();
    }

    /* renamed from: f */
    private static abpy m49924f() {
        bxvd da = abpy.f57922f.mo74144da();
        da.mo74086m("sms");
        da.mo74090n("com.google.android.gms");
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abpy abpy = (abpy) da.f164949b;
        abpy.f57928e = 2;
        abpy.f57924a |= 1;
        return (abpy) da.mo74062i();
    }

    /* renamed from: a */
    public static String m49919a(String str) {
        int i = Build.VERSION.SDK_INT;
        if (str.startsWith(acok.f60336a.toString()) || str.startsWith(acok.f60337b.toString())) {
            return "sms";
        }
        if (str.startsWith(CalendarContract.Events.CONTENT_URI.toString())) {
            return "internal.3p:Event";
        }
        return null;
    }

    /* renamed from: a */
    public final void mo33184a(String str, String str2) {
        String str3;
        if (str2.equals("sms") || str2.equals("internal.3p:Message")) {
            str3 = "android.permission.READ_SMS";
        } else if (str2.equals("internal.3p:Event")) {
            str3 = "android.permission.READ_CALENDAR";
        } else {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 47);
            sb.append("Checking READ permission to: ");
            sb.append(str2);
            sb.append(" is not supported.");
            throw new acxa(sb.toString());
        }
        if (!rfz.m33557a(this.f61001a).mo24610b(str) || this.f61001a.getPackageManager().checkPermission(str3, str) != 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 45 + String.valueOf(str2).length());
            sb2.append(str);
            sb2.append(" doesn't have permission to report usage to: ");
            sb2.append(str2);
            throw new acxa(sb2.toString());
        }
    }
}
