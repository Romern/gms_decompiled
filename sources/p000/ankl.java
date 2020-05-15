package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.Flag;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ankl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ankl {

    /* renamed from: a */
    public static final Object f77015a = new Object();

    /* renamed from: b */
    private static final srn f77016b = srn.m36127a(sgj.PLATFORM_CONFIGURATOR);

    /* renamed from: c */
    private final aney f77017c;

    /* renamed from: d */
    private final ContentResolver f77018d;

    /* renamed from: e */
    private final Context f77019e;

    /* renamed from: f */
    private final anko f77020f;

    public ankl(aney aney, Context context, anko anko) {
        this.f77017c = aney;
        this.f77019e = context;
        this.f77018d = context.getContentResolver();
        this.f77020f = anko;
    }

    /* renamed from: a */
    private static int m64654a(int i) {
        return (i >> 27) ^ (i << 5);
    }

    /* renamed from: b */
    private final void m64660b(int i, Configurations configurations, String str, String str2) {
        String str3;
        int i2 = i;
        Configurations configurations2 = configurations;
        String str4 = str;
        String str5 = str2;
        String str6 = "hash";
        String str7 = "snapshotToken1";
        String str8 = "implement non-default system storage";
        if (!ankj.m64650b()) {
            TreeSet a = anko.m64679a(m64657a(this.f77018d, str4, str5));
            TreeSet treeSet = new TreeSet((SortedSet) a);
            TreeSet<String> treeSet2 = !configurations2.f82079f ? new TreeSet((SortedSet) a) : new TreeSet();
            Iterator it = configurations2.f82078e.entrySet().iterator();
            boolean z = false;
            while (true) {
                str3 = "c";
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Integer) entry.getKey()).intValue() != 0) {
                    bnsl bnsl = (bnsl) f77016b.mo68387b();
                    bnsl.mo68432a("ankl", str3, 173, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a(str8);
                    it = it;
                } else {
                    Iterator it2 = it;
                    String[] strArr = ((Configuration) entry.getValue()).f82072c;
                    int length = strArr.length;
                    int i3 = 0;
                    while (i3 < length) {
                        String str9 = strArr[i3];
                        a.remove(str9);
                        treeSet2.add(str9);
                        i3++;
                        length = length;
                        z = true;
                    }
                    Flag[] flagArr = ((Configuration) entry.getValue()).f82071b;
                    int length2 = flagArr.length;
                    int i4 = 0;
                    while (i4 < length2) {
                        int i5 = length2;
                        Flag flag = flagArr[i4];
                        Flag[] flagArr2 = flagArr;
                        treeSet2.remove(flag.f82099a);
                        if (a.add(flag.f82099a)) {
                            treeSet.add(flag.f82099a);
                            z = true;
                        }
                        i4++;
                        length2 = i5;
                        flagArr = flagArr2;
                    }
                    it = it2;
                }
            }
            if (z) {
                m64659a(this.f77018d, str4, anko.m64678a(treeSet), str5);
            }
            if (!configurations2.f82079f) {
                a.clear();
                z = true;
            }
            Iterator it3 = configurations2.f82078e.entrySet().iterator();
            while (it3.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it3.next();
                if (((Integer) entry2.getKey()).intValue() != 0) {
                    bnsl bnsl2 = (bnsl) f77016b.mo68390d();
                    bnsl2.mo68432a("ankl", str3, 204, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a(str8);
                } else {
                    Flag[] flagArr3 = ((Configuration) entry2.getValue()).f82071b;
                    int length3 = flagArr3.length;
                    Iterator it4 = it3;
                    int i6 = 0;
                    while (i6 < length3) {
                        String str10 = str3;
                        Flag flag2 = flagArr3[i6];
                        Flag[] flagArr4 = flagArr3;
                        int i7 = length3;
                        String str11 = str8;
                        m64659a(this.f77018d, flag2.f82099a, flag2.mo46505f(), str5);
                        if (!configurations2.f82079f) {
                            a.add(flag2.f82099a);
                        }
                        i6++;
                        str3 = str10;
                        flagArr3 = flagArr4;
                        length3 = i7;
                        str8 = str11;
                    }
                    it3 = it4;
                }
            }
            for (String str12 : treeSet2) {
                m64659a(this.f77018d, str12, (String) null, str5);
            }
            if (z) {
                m64659a(this.f77018d, str4, anko.m64678a(a), str5);
            }
            this.f77020f.mo41914a(i2, str5, str7, configurations2.f82074a);
            this.f77020f.mo41914a(i2, str5, str6, m64663c(str4, str5));
            return;
        }
        String str13 = str8;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TreeSet a2 = anko.m64679a(m64657a(this.f77018d, str4, str5));
        TreeSet treeSet3 = new TreeSet((SortedSet) a2);
        TreeSet<String> treeSet4 = !configurations2.f82079f ? new TreeSet((SortedSet) a2) : new TreeSet();
        Iterator it5 = configurations2.f82078e.entrySet().iterator();
        boolean z2 = false;
        while (it5.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it5.next();
            if (((Integer) entry3.getKey()).intValue() != 0) {
                bnsl bnsl3 = (bnsl) f77016b.mo68387b();
                bnsl3.mo68432a("ankl", "d", 247, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a(str13);
                it5 = it5;
                str6 = str6;
            } else {
                String str14 = str6;
                Iterator it6 = it5;
                String str15 = str13;
                String[] strArr2 = ((Configuration) entry3.getValue()).f82072c;
                int length4 = strArr2.length;
                boolean z3 = z2;
                int i8 = 0;
                while (i8 < length4) {
                    String str16 = strArr2[i8];
                    a2.remove(str16);
                    treeSet4.add(str16);
                    i8++;
                    length4 = length4;
                    z3 = true;
                }
                Flag[] flagArr5 = ((Configuration) entry3.getValue()).f82071b;
                int length5 = flagArr5.length;
                int i9 = 0;
                while (i9 < length5) {
                    int i10 = length5;
                    Flag flag3 = flagArr5[i9];
                    Flag[] flagArr6 = flagArr5;
                    treeSet4.remove(flag3.f82099a);
                    if (a2.add(flag3.f82099a)) {
                        treeSet3.add(flag3.f82099a);
                        z3 = true;
                    }
                    i9++;
                    length5 = i10;
                    flagArr5 = flagArr6;
                }
                str13 = str15;
                it5 = it6;
                str6 = str14;
                z2 = z3;
            }
        }
        String str17 = str6;
        String str18 = str13;
        if (z2) {
            m64659a(this.f77018d, str4, anko.m64678a(treeSet3), str5);
        }
        if (!configurations2.f82079f) {
            a2.clear();
            z2 = true;
        }
        Iterator it7 = configurations2.f82078e.entrySet().iterator();
        while (it7.hasNext()) {
            Map.Entry entry4 = (Map.Entry) it7.next();
            if (((Integer) entry4.getKey()).intValue() != 0) {
                bnsl bnsl4 = (bnsl) f77016b.mo68390d();
                bnsl4.mo68432a("ankl", "d", 284, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68405a(str18);
                it7 = it7;
            } else {
                Iterator it8 = it7;
                Flag[] flagArr7 = ((Configuration) entry4.getValue()).f82071b;
                int length6 = flagArr7.length;
                String str19 = str18;
                int i11 = 0;
                while (i11 < length6) {
                    int i12 = length6;
                    Flag flag4 = flagArr7[i11];
                    Flag[] flagArr8 = flagArr7;
                    String str20 = str7;
                    linkedHashMap.put(flag4.f82099a, flag4.mo46505f());
                    if (!configurations2.f82079f) {
                        a2.add(flag4.f82099a);
                    }
                    i11++;
                    length6 = i12;
                    flagArr7 = flagArr8;
                    str7 = str20;
                }
                it7 = it8;
                str18 = str19;
            }
        }
        String str21 = str7;
        for (String str22 : treeSet4) {
            linkedHashMap.put(str22, null);
        }
        if (z2) {
            linkedHashMap.put(str4, anko.m64678a(a2));
        }
        int i13 = 247715873;
        for (String str23 : anko.m64679a(m64657a(this.f77018d, str4, str5))) {
            String str24 = (String) linkedHashMap.get(str23);
            if (str24 == null) {
                str24 = m64657a(this.f77018d, str23, str5);
            }
            if ("null".equals(str24)) {
                str24 = null;
            }
            i13 = m64654a(m64654a(i13) ^ str23.hashCode()) ^ Arrays.hashCode(new Object[]{str24});
        }
        int i14 = 0;
        String num = Integer.toString(i13);
        String a3 = this.f77020f.mo41913a(i2, str5, "banned_integrity_hash");
        if (num == null || !num.equals(a3)) {
            for (String str25 : linkedHashMap.keySet()) {
                m64659a(this.f77018d, str25, (String) linkedHashMap.get(str25), str5);
            }
            if (ankj.m64648a() && str5 != null) {
                int i15 = ankk.f77014a + 1;
                if (i15 != 50) {
                    i14 = i15;
                }
                ankk.f77014a = i14;
                int i16 = ankk.f77014a;
                StringBuilder sb = new StringBuilder(37);
                sb.append("recently_updated_namespace");
                sb.append(i16);
                ankj.m64646a("rescue_party_namespace", sb.toString(), str5, true);
                TreeSet a4 = anko.m64679a(ankj.m64645a("rescue_party_namespace", "all_known_namespaces"));
                if (!a4.contains(str5)) {
                    a4.add(str5);
                    ankj.m64646a("rescue_party_namespace", "all_known_namespaces", anko.m64678a(a4), true);
                }
            }
            bnsl bnsl5 = (bnsl) f77016b.mo68390d();
            bnsl5.mo68432a("ankl", "d", 319, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl5.mo68405a("Successfully applied the new configuration without tag");
            this.f77020f.mo41914a(i2, str5, str21, configurations2.f82074a);
            this.f77020f.mo41914a(i2, str5, str17, num);
            return;
        }
        bnsl bnsl6 = (bnsl) f77016b.mo68390d();
        bnsl6.mo68432a("ankl", "d", 309, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl6.mo68405a("New flag configuration is banned, exiting without applying config changes");
    }

    /* renamed from: c */
    private final String m64663c(String str, String str2) {
        int i = 247715873;
        for (String str3 : anko.m64679a(m64657a(this.f77018d, str, str2))) {
            i = m64654a(m64654a(i) ^ str3.hashCode()) ^ Arrays.hashCode(new Object[]{m64657a(this.f77018d, str3, str2)});
        }
        return Integer.toString(i);
    }

    /* renamed from: d */
    private final void m64665d(int i, Configurations configurations, String str, String str2) {
        String str3;
        int i2;
        Configurations configurations2 = configurations;
        String str4 = str;
        String str5 = str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TreeSet a = anko.m64679a(m64657a(this.f77018d, str4, str5));
        TreeSet treeSet = new TreeSet((SortedSet) a);
        TreeSet<String> treeSet2 = !configurations2.f82079f ? new TreeSet((SortedSet) a) : new TreeSet();
        Iterator it = configurations2.f82078e.entrySet().iterator();
        boolean z = false;
        while (true) {
            str3 = "implement non-default system storage";
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (((Integer) entry.getKey()).intValue() != 0) {
                bnsl bnsl = (bnsl) f77016b.mo68387b();
                bnsl.mo68432a("ankl", "d", 247, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a(str3);
            } else {
                String[] strArr = ((Configuration) entry.getValue()).f82072c;
                int length = strArr.length;
                int i3 = 0;
                while (i3 < length) {
                    String str6 = strArr[i3];
                    a.remove(str6);
                    treeSet2.add(str6);
                    i3++;
                    z = true;
                }
                Flag[] flagArr = ((Configuration) entry.getValue()).f82071b;
                for (Flag flag : flagArr) {
                    treeSet2.remove(flag.f82099a);
                    if (a.add(flag.f82099a)) {
                        treeSet.add(flag.f82099a);
                        z = true;
                    }
                }
            }
        }
        if (z) {
            m64659a(this.f77018d, str4, anko.m64678a(treeSet), str5);
        }
        if (!configurations2.f82079f) {
            a.clear();
            z = true;
        }
        Iterator it2 = configurations2.f82078e.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            if (((Integer) entry2.getKey()).intValue() != 0) {
                bnsl bnsl2 = (bnsl) f77016b.mo68390d();
                bnsl2.mo68432a("ankl", "d", 284, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a(str3);
            } else {
                Flag[] flagArr2 = ((Configuration) entry2.getValue()).f82071b;
                int length2 = flagArr2.length;
                int i4 = 0;
                while (i4 < length2) {
                    Iterator it3 = it2;
                    Flag flag2 = flagArr2[i4];
                    Flag[] flagArr3 = flagArr2;
                    String str7 = str3;
                    linkedHashMap.put(flag2.f82099a, flag2.mo46505f());
                    if (!configurations2.f82079f) {
                        a.add(flag2.f82099a);
                    }
                    i4++;
                    it2 = it3;
                    flagArr2 = flagArr3;
                    str3 = str7;
                }
            }
        }
        for (String str8 : treeSet2) {
            linkedHashMap.put(str8, null);
        }
        if (z) {
            linkedHashMap.put(str4, anko.m64678a(a));
        }
        int i5 = 247715873;
        for (String str9 : anko.m64679a(m64657a(this.f77018d, str4, str5))) {
            String str10 = (String) linkedHashMap.get(str9);
            if (str10 == null) {
                str10 = m64657a(this.f77018d, str9, str5);
            }
            if ("null".equals(str10)) {
                str10 = null;
            }
            i5 = m64654a(m64654a(i5) ^ str9.hashCode()) ^ Arrays.hashCode(new Object[]{str10});
        }
        String num = Integer.toString(i5);
        int i6 = i;
        String a2 = this.f77020f.mo41913a(i6, str5, "banned_integrity_hash");
        if (num == null || !num.equals(a2)) {
            for (String str11 : linkedHashMap.keySet()) {
                m64659a(this.f77018d, str11, (String) linkedHashMap.get(str11), str5);
            }
            if (ankj.m64648a() && str5 != null) {
                int i7 = ankk.f77014a + 1;
                if (i7 != 50) {
                    i2 = i7;
                } else {
                    i2 = 0;
                }
                ankk.f77014a = i2;
                int i8 = ankk.f77014a;
                StringBuilder sb = new StringBuilder(37);
                sb.append("recently_updated_namespace");
                sb.append(i8);
                ankj.m64646a("rescue_party_namespace", sb.toString(), str5, true);
                TreeSet a3 = anko.m64679a(ankj.m64645a("rescue_party_namespace", "all_known_namespaces"));
                if (!a3.contains(str5)) {
                    a3.add(str5);
                    ankj.m64646a("rescue_party_namespace", "all_known_namespaces", anko.m64678a(a3), true);
                }
            }
            bnsl bnsl3 = (bnsl) f77016b.mo68390d();
            bnsl3.mo68432a("ankl", "d", 319, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Successfully applied the new configuration without tag");
            this.f77020f.mo41914a(i6, str5, "snapshotToken1", configurations2.f82074a);
            this.f77020f.mo41914a(i6, str5, "hash", num);
            return;
        }
        bnsl bnsl4 = (bnsl) f77016b.mo68390d();
        bnsl4.mo68432a("ankl", "d", 309, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl4.mo68405a("New flag configuration is banned, exiting without applying config changes");
    }

    /* renamed from: e */
    private final boolean m64666e(String str) {
        String str2;
        if (!ankj.m64651c() || str == null) {
            if (str != null) {
                str2 = ankk.m64652a(str);
            } else {
                str2 = "com.google.android.gms.settings.platform.boot";
            }
            Configurations a = m64655a(str2, mo41904a(2, str));
            if (a == null) {
                return false;
            }
            boolean a2 = mo41906a(2, a, "_boot_Phenotype_flags", "_boot_phenotype_platform_flags", str);
            if (!a2) {
                this.f77020f.mo41914a(2, str, "snapshotToken1", null);
            }
            return a2;
        }
        String g = m64668g(str);
        if (g == null) {
            return false;
        }
        this.f77020f.mo41914a(2, str, "snapshotToken1", g);
        if (cghk.m145454f()) {
            return true;
        }
        this.f77020f.mo41914a(2, str, "hash", m64663c("_boot_Phenotype_flags", str));
        return true;
    }

    /* renamed from: f */
    private final boolean m64667f(String str) {
        String str2;
        if (!ankj.m64651c() || str == null) {
            if (str != null) {
                str2 = ankk.m64652a(str);
            } else {
                str2 = "com.google.android.gms.settings.platform";
            }
            Configurations a = m64655a(str2, mo41904a(1, str));
            if (a == null || !mo41906a(1, a, "Phenotype_flags", "phenotype_platform_flags", str)) {
                return false;
            }
            return m64661b(1, str);
        }
        String g = m64668g(str);
        return g != null && m64662b(str, g);
    }

    /* renamed from: g */
    private final String m64668g(String str) {
        Configurations a = m64655a(ankk.m64652a(str), (String) null);
        if (a == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : a.f82078e.entrySet()) {
            Flag[] flagArr = ((Configuration) entry.getValue()).f82071b;
            for (Flag flag : flagArr) {
                hashMap.put(flag.f82099a, flag.mo46505f());
            }
        }
        try {
            if (ankj.m64649a(str, hashMap)) {
                return a.f82074a;
            }
            return null;
        } catch (SecurityException e) {
            bnsl bnsl = (bnsl) f77016b.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("ankl", "g", 563, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("setProperties failed with SecurityException");
            return null;
        }
    }

    /* renamed from: a */
    private final Configurations m64655a(String str, String str2) {
        try {
            return (Configurations) aucu.m76783a(this.f77017c.mo25236a(str, "", str2), 2000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            bnsl bnsl = (bnsl) f77016b.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("ankl", "a", 576, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Retrieving snapshot for %s failed", str);
            return null;
        }
    }

    /* renamed from: c */
    private final void m64664c(int i, Configurations configurations, String str, String str2) {
        String str3;
        int i2 = i;
        Configurations configurations2 = configurations;
        String str4 = str;
        String str5 = str2;
        TreeSet a = anko.m64679a(m64657a(this.f77018d, str4, str5));
        TreeSet treeSet = new TreeSet((SortedSet) a);
        TreeSet<String> treeSet2 = !configurations2.f82079f ? new TreeSet((SortedSet) a) : new TreeSet();
        Iterator it = configurations2.f82078e.entrySet().iterator();
        boolean z = false;
        while (true) {
            str3 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (((Integer) entry.getKey()).intValue() != 0) {
                bnsl bnsl = (bnsl) f77016b.mo68387b();
                bnsl.mo68432a("ankl", "c", 173, str3);
                bnsl.mo68405a("implement non-default system storage");
            } else {
                String[] strArr = ((Configuration) entry.getValue()).f82072c;
                int length = strArr.length;
                int i3 = 0;
                while (i3 < length) {
                    String str6 = strArr[i3];
                    a.remove(str6);
                    treeSet2.add(str6);
                    i3++;
                    z = true;
                }
                Flag[] flagArr = ((Configuration) entry.getValue()).f82071b;
                for (Flag flag : flagArr) {
                    treeSet2.remove(flag.f82099a);
                    if (a.add(flag.f82099a)) {
                        treeSet.add(flag.f82099a);
                        z = true;
                    }
                }
            }
        }
        if (z) {
            m64659a(this.f77018d, str4, anko.m64678a(treeSet), str5);
        }
        if (!configurations2.f82079f) {
            a.clear();
            z = true;
        }
        Iterator it2 = configurations2.f82078e.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            if (((Integer) entry2.getKey()).intValue() != 0) {
                bnsl bnsl2 = (bnsl) f77016b.mo68390d();
                bnsl2.mo68432a("ankl", "c", 204, str3);
                bnsl2.mo68405a("implement non-default system storage");
            } else {
                Flag[] flagArr2 = ((Configuration) entry2.getValue()).f82071b;
                int length2 = flagArr2.length;
                int i4 = 0;
                while (i4 < length2) {
                    Iterator it3 = it2;
                    Flag flag2 = flagArr2[i4];
                    Flag[] flagArr3 = flagArr2;
                    int i5 = length2;
                    String str7 = str3;
                    m64659a(this.f77018d, flag2.f82099a, flag2.mo46505f(), str5);
                    if (!configurations2.f82079f) {
                        a.add(flag2.f82099a);
                    }
                    i4++;
                    it2 = it3;
                    flagArr2 = flagArr3;
                    length2 = i5;
                    str3 = str7;
                }
            }
        }
        for (String str8 : treeSet2) {
            m64659a(this.f77018d, str8, (String) null, str5);
        }
        if (z) {
            m64659a(this.f77018d, str4, anko.m64678a(a), str5);
        }
        this.f77020f.mo41914a(i2, str5, "snapshotToken1", configurations2.f82074a);
        this.f77020f.mo41914a(i2, str5, "hash", m64663c(str4, str5));
    }

    /* renamed from: a */
    private final Integer m64656a(Context context) {
        int i = Build.VERSION.SDK_INT;
        try {
            return Integer.valueOf(Settings.Global.getInt(context.getContentResolver(), "boot_count"));
        } catch (Settings.SettingNotFoundException e) {
            bnsl bnsl = (bnsl) f77016b.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("ankl", "a", 667, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to retrieve boot count");
            return null;
        }
    }

    /* renamed from: a */
    private static String m64657a(ContentResolver contentResolver, String str, String str2) {
        if (str2 != null) {
            return ankj.m64645a(str2, str);
        }
        return Settings.Global.getString(contentResolver, str);
    }

    /* renamed from: a */
    private final void m64658a(int i, Configurations configurations, String str, String str2) {
        int i2 = Build.VERSION.SDK_INT;
        TreeSet<String> a = anko.m64679a(Settings.Global.getString(this.f77018d, str));
        if (!configurations.f82079f) {
            Settings.Global.resetToDefaults(this.f77018d, str2);
            for (String str3 : a) {
                Settings.Global.putString(this.f77018d, str3, null);
            }
            a.clear();
        }
        for (Map.Entry entry : configurations.f82078e.entrySet()) {
            if (((Integer) entry.getKey()).intValue() != 0) {
                bnsl bnsl = (bnsl) f77016b.mo68387b();
                bnsl.mo68432a("ankl", "a", 128, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("implement non-default system storage");
            } else {
                String[] strArr = ((Configuration) entry.getValue()).f82072c;
                for (String str4 : strArr) {
                    Settings.Global.putString(this.f77018d, str4, null, str2, false);
                    a.remove(str4);
                }
                Flag[] flagArr = ((Configuration) entry.getValue()).f82071b;
                for (Flag flag : flagArr) {
                    Settings.Global.putString(this.f77018d, flag.f82099a, flag.mo46505f(), str2, false);
                    a.add(flag.f82099a);
                }
            }
        }
        Settings.Global.putString(this.f77018d, str, anko.m64678a(a));
        this.f77020f.mo41914a(i, null, "snapshotToken1", configurations.f82074a);
        this.f77020f.mo41914a(i, null, "hash", m64663c(str, null));
    }

    /* renamed from: c */
    public final boolean mo41909c(String str) {
        boolean f;
        synchronized (f77015a) {
            f = m64667f(str);
        }
        return f;
    }

    /* renamed from: a */
    private static void m64659a(ContentResolver contentResolver, String str, String str2, String str3) {
        if (str3 != null) {
            ankj.m64646a(str3, str, ankj.m64645a(str3, str), true);
            ankj.m64646a(str3, str, str2, false);
            return;
        }
        int i = Build.VERSION.SDK_INT;
        Settings.Global.putString(contentResolver, str, str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo41904a(int i, String str) {
        String str2;
        boolean equals;
        if (!ankj.m64651c() || !cghk.m145454f()) {
            synchronized (f77015a) {
                if (i != 1) {
                    str2 = "_boot_Phenotype_flags";
                } else {
                    str2 = "Phenotype_flags";
                }
                equals = m64663c(str2, str).equals(this.f77020f.mo41913a(i, str, "hash"));
            }
            if (!equals) {
                if (this.f77020f.mo41913a(i, str, "snapshotToken1") != null) {
                    this.f77020f.mo41914a(i, str, "snapshotToken1", null);
                }
                return null;
            }
        }
        return this.f77020f.mo41913a(i, str, "snapshotToken1");
    }

    /* renamed from: d */
    public final boolean mo41910d(String str) {
        try {
            return m64667f(str);
        } catch (anki e) {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo41905a() {
        int i = Settings.Global.getInt(this.f77018d, "Phenotype_boot_count", -1);
        Integer a = m64656a(this.f77019e);
        if (a != null && !a.equals(Integer.valueOf(i))) {
            synchronized (f77015a) {
                if (ankj.m64648a()) {
                    for (String str : cghk.m145450b().f165797a) {
                        m64661b(2, str);
                    }
                }
                m64661b(2, (String) null);
                Integer a2 = m64656a(this.f77019e);
                if (a2 != null) {
                    try {
                        Settings.Global.putInt(this.f77018d, "Phenotype_boot_count", a2.intValue());
                    } catch (SecurityException e) {
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo41906a(int i, Configurations configurations, String str, String str2, String str3) {
        int i2 = i;
        Configurations configurations2 = configurations;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (str6 != null) {
            try {
                bnsl bnsl = (bnsl) f77016b.mo68390d();
                bnsl.mo68432a("ankl", "a", 91, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("updateFromConfigurations DeviceConfig for namespace %s", str6);
                m64660b(i2, configurations2, str4, str6);
                return true;
            } catch (SecurityException e) {
                bnsl bnsl2 = (bnsl) f77016b.mo68388c();
                bnsl2.mo68437a(e);
                bnsl2.mo68432a("ankl", "a", (int) ErrorInfo.TYPE_SDU_MEMORY_FULL, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("updateFromConfigurations failed with SecurityException");
                return false;
            }
        } else {
            String str7 = null;
            if (cghk.f186943a.mo6606a().mo83800e()) {
                int i3 = Build.VERSION.SDK_INT;
                bnsl bnsl3 = (bnsl) f77016b.mo68390d();
                bnsl3.mo68432a("ankl", "a", 95, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("updateFromConfigurations using the tag API methods");
                int i4 = Build.VERSION.SDK_INT;
                TreeSet<String> a = anko.m64679a(Settings.Global.getString(this.f77018d, str4));
                if (!configurations2.f82079f) {
                    Settings.Global.resetToDefaults(this.f77018d, str5);
                    for (String str8 : a) {
                        Settings.Global.putString(this.f77018d, str8, null);
                    }
                    a.clear();
                }
                Iterator it = configurations2.f82078e.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((Integer) entry.getKey()).intValue() != 0) {
                        bnsl bnsl4 = (bnsl) f77016b.mo68387b();
                        bnsl4.mo68432a("ankl", "a", 128, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl4.mo68405a("implement non-default system storage");
                    } else {
                        String[] strArr = ((Configuration) entry.getValue()).f82072c;
                        int length = strArr.length;
                        int i5 = 0;
                        while (i5 < length) {
                            String str9 = strArr[i5];
                            Settings.Global.putString(this.f77018d, str9, null, str5, false);
                            a.remove(str9);
                            i5++;
                            it = it;
                            strArr = strArr;
                        }
                        Iterator it2 = it;
                        Flag[] flagArr = ((Configuration) entry.getValue()).f82071b;
                        int length2 = flagArr.length;
                        int i6 = 0;
                        while (i6 < length2) {
                            Flag flag = flagArr[i6];
                            Settings.Global.putString(this.f77018d, flag.f82099a, flag.mo46505f(), str5, false);
                            a.add(flag.f82099a);
                            i6++;
                            flagArr = flagArr;
                        }
                        it = it2;
                        str7 = null;
                    }
                }
                Settings.Global.putString(this.f77018d, str4, anko.m64678a(a));
                this.f77020f.mo41914a(i2, str7, "snapshotToken1", configurations2.f82074a);
                this.f77020f.mo41914a(i2, str7, "hash", m64663c(str4, str7));
                return true;
            }
            bnsl bnsl5 = (bnsl) f77016b.mo68390d();
            bnsl5.mo68432a("ankl", "a", 98, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl5.mo68405a("updateFromConfigurations using legacy put method");
            m64660b(i2, configurations2, str4, null);
            return true;
        }
    }

    /* renamed from: b */
    private final boolean m64661b(int i, String str) {
        String str2;
        synchronized (f77015a) {
            String a = mo41904a(i, str);
            if (a == null) {
                return false;
            }
            if (str != null) {
                str2 = ankk.m64652a(str);
            } else {
                str2 = i != 1 ? "com.google.android.gms.settings.platform.boot" : "com.google.android.gms.settings.platform";
            }
            boolean b = m64662b(str2, a);
            return b;
        }
    }

    /* renamed from: b */
    private final boolean m64662b(String str, String str2) {
        try {
            aucu.m76783a(this.f77017c.mo25233a(str2), 2000, TimeUnit.MILLISECONDS);
            return true;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            bnsl bnsl = (bnsl) f77016b.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("ankl", "b", 606, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Committing snapshot for %s failed", str);
            return false;
        }
    }

    /* renamed from: b */
    public final boolean mo41908b(String str) {
        try {
            return m64666e(str);
        } catch (anki e) {
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo41907a(String str) {
        boolean e;
        synchronized (f77015a) {
            mo41905a();
            e = m64666e(str);
        }
        return e;
    }
}
