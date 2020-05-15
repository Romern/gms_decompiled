package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: acrl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acrl implements acro {

    /* renamed from: h */
    private static final int f60618h = ((int) TimeUnit.HOURS.toSeconds(4));

    /* renamed from: a */
    public final Context f60619a;

    /* renamed from: b */
    public final SharedPreferences f60620b;

    /* renamed from: c */
    public Map f60621c;

    /* renamed from: d */
    public abuk f60622d;

    /* renamed from: e */
    public Map f60623e;

    /* renamed from: f */
    public int f60624f;

    /* renamed from: g */
    public final Object f60625g = new Object();

    /* renamed from: i */
    private final String f60626i;

    /* renamed from: a */
    static SharedPreferences m49739a(Context context, String str) {
        StringBuilder sb = new StringBuilder(str.length() + 15);
        sb.append(str);
        sb.append("-icing-settings");
        return context.getSharedPreferences(sb.toString(), 4);
    }

    /* renamed from: b */
    public static boolean m49741b(Context context, String str) {
        if (cemj.f182986a.mo6606a().mo79354g().f165797a.contains(str)) {
            return true;
        }
        if (cemj.f182986a.mo6606a().mo79350c()) {
            return rfz.m33557a(context).mo24610b(str);
        }
        return false;
    }

    /* renamed from: k */
    private final void m49742k() {
        String string = this.f60620b.getString("app-params", null);
        if (string != null) {
            acqn acqn = (acqn) acky.m49358a(string, (bxxk) acqn.f60505c.mo74142c(7));
            int i = acqn.f60508b;
            if (i == 0) {
                i = f60618h;
            }
            this.f60624f = i;
            if (acqn.f60507a.size() != 0) {
                this.f60623e = bnmt.m109795a(acqn.f60507a.size());
                bxwc bxwc = acqn.f60507a;
                int size = bxwc.size();
                for (int i2 = 0; i2 < size; i2++) {
                    acqm acqm = (acqm) bxwc.get(i2);
                    this.f60623e.put(acqm.f60498a, acqm);
                }
                return;
            }
            this.f60623e = Collections.emptyMap();
        }
    }

    /* renamed from: c */
    public final long mo33024c() {
        return this.f60620b.getLong("last-maintenance", 0);
    }

    /* renamed from: d */
    public final abul mo33026d(String str) {
        abul abul = (abul) this.f60621c.get(str);
        if (abul != null) {
            return abul;
        }
        abul abul2 = abul.f58412n;
        this.f60621c.put(str, abul2);
        return abul2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        return null;
     */
    /* renamed from: e */
    public final String mo33028e(String str) {
        synchronized (this.f60625g) {
            abul c = mo33025c(str);
            if (c != null && !c.f58415b.isEmpty()) {
                String str2 = c.f58415b;
                return str2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        return null;
     */
    /* renamed from: f */
    public final String mo33030f(String str) {
        synchronized (this.f60625g) {
            abul c = mo33025c(str);
            if (c != null && !c.f58419f.isEmpty()) {
                String str2 = c.f58419f;
                return str2;
            }
        }
    }

    /* renamed from: g */
    public final void mo33032g() {
        synchronized (this.f60625g) {
            this.f60620b.edit().putString("current-os-build-id", Build.ID).apply();
        }
    }

    /* renamed from: h */
    public final Set mo33034h() {
        abpe abpe = (abpe) acky.m49358a(this.f60620b.getString("known-accounts", null), (bxxk) abpe.f57836b.mo74142c(7));
        HashSet hashSet = new HashSet(abpe.f57838a.size());
        bxwc bxwc = abpe.f57838a;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            abpd abpd = (abpd) bxwc.get(i);
            try {
                hashSet.add(new Account(abpd.f57834b, abpd.f57835c));
            } catch (IllegalArgumentException e) {
                absg.m48200c(e, "Skipping invalid account %s", abpd);
            }
        }
        return hashSet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        return null;
     */
    /* renamed from: i */
    public final GlobalSearchApplicationInfo mo33036i(String str) {
        synchronized (this.f60625g) {
            abul c = mo33025c(str);
            if (c != null && (c.f58414a & 4) != 0) {
                abtd abtd = c.f58417d;
                if (abtd == null) {
                    abtd = abtd.f58201j;
                }
                GlobalSearchApplicationInfo a = acky.m49359a(abtd);
                return a;
            }
        }
    }

    /* renamed from: j */
    public final int mo33038j(String str) {
        int i;
        synchronized (this.f60625g) {
            abul c = mo33025c(str);
            i = c != null ? c.f58418e : 0;
        }
        return i;
    }

    /* renamed from: l */
    public final abtf mo33041l(String str) {
        abtf abtf;
        synchronized (this.f60625g) {
            abul c = mo33025c(str);
            if (c != null) {
                abtf = abtf.m48246a(c.f58422i);
                if (abtf == null) {
                    abtf = abtf.UNSET;
                }
            } else {
                abtf = abtf.UNSET;
            }
        }
        return abtf;
    }

    /* renamed from: m */
    public final abtf mo33042m(String str) {
        synchronized (this.f60625g) {
            if (this.f60622d != null) {
                int i = 0;
                while (i < this.f60622d.f58411b.size()) {
                    if (!acky.m49359a((abtd) this.f60622d.f58410a.get(i)).f9563b.equals(str)) {
                        i++;
                    } else {
                        abtf abtf = (abtf) abuk.f58407c.mo14948a(Integer.valueOf(this.f60622d.f58411b.mo74151b(i)));
                        return abtf;
                    }
                }
            }
            abtf abtf2 = abtf.UNSET;
            return abtf2;
        }
    }

    /* renamed from: n */
    public final C1240of mo33043n(String str) {
        C1240of ofVar;
        synchronized (this.f60625g) {
            abul c = mo33025c(str);
            if (c == null) {
                ofVar = new C1240of(0, "");
            } else {
                ofVar = new C1240of(Integer.valueOf(c.f58423j), c.f58424k);
            }
        }
        return ofVar;
    }

    /* renamed from: o */
    public final void mo33044o(String str) {
        synchronized (this.f60625g) {
            abul d = mo33026d(str);
            bxvd bxvd = (bxvd) d.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) d);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            abul abul = (abul) bxvd.f164949b;
            abul abul2 = abul.f58412n;
            int i = abul.f58414a & -257;
            abul.f58414a = i;
            abul.f58423j = 0;
            abul.f58414a = i & -513;
            abul.f58424k = abul.f58412n.f58424k;
            mo33020a(str, (abul) bxvd.mo74062i());
        }
    }

    /* renamed from: p */
    public final long mo33045p(String str) {
        long j;
        synchronized (this.f60625g) {
            abul c = mo33025c(str);
            j = c != null ? c.f58426m : 0;
        }
        return j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x03b8  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0428  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0495  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x050c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0136  */
    public acrl(Context context, String str) {
        SharedPreferences sharedPreferences;
        String str2;
        int i;
        Parcel parcel;
        this.f60619a = context;
        this.f60626i = str;
        SharedPreferences b = mo33023b("-icing-settings");
        String str3 = "settings-version";
        int i2 = b.getInt(str3, 0);
        if (i2 != 7) {
            acrp acrp = new acrp(this.f60619a, this, b, i2, this.f60626i);
            switch (acrp.f60632d) {
                case 0:
                    SharedPreferences b2 = acrp.f60630b.mo33023b("-version");
                    SharedPreferences b3 = acrp.f60630b.mo33023b("-appauth");
                    SharedPreferences b4 = acrp.f60630b.mo33023b("-blockedpackages");
                    SharedPreferences b5 = acrp.f60630b.mo33023b("-universalsearch");
                    SharedPreferences b6 = acrp.f60630b.mo33023b("-resourceparse");
                    if (!acrp.m49775a(b2) || !acrp.m49775a(b3) || !acrp.m49775a(b4) || !acrp.m49775a(b5) || !acrp.m49775a(b6)) {
                        absg.m48196c("Upgrading settings");
                        int i3 = b2.getInt("version", -1);
                        Map<String, ?> all = b3.getAll();
                        String string = b4.getString("blockedpackages", null);
                        HashSet<String> hashSet = new HashSet();
                        if (string != null) {
                            try {
                                JSONArray jSONArray = new JSONArray(string);
                                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                                    hashSet.add(jSONArray.getString(i4));
                                }
                            } catch (JSONException e) {
                                absg.m48191b("Upgrade: blocked packages list corrupted");
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        Iterator<?> it = b5.getAll().values().iterator();
                        while (it.hasNext()) {
                            String str4 = (String) it.next();
                            if (str4 != null) {
                                try {
                                    Parcel obtain = Parcel.obtain();
                                    Iterator<?> it2 = it;
                                    try {
                                        byte[] decode = Base64.decode(str4, 0);
                                        String str5 = str3;
                                        obtain.unmarshall(decode, 0, decode.length);
                                        obtain.setDataPosition(0);
                                        GlobalSearchApplicationInfo globalSearchApplicationInfo = (GlobalSearchApplicationInfo) GlobalSearchApplicationInfo.CREATOR.createFromParcel(obtain);
                                        if (obtain != null) {
                                            obtain.recycle();
                                        }
                                        arrayList.add(globalSearchApplicationInfo);
                                        it = it2;
                                        str3 = str5;
                                    } catch (Throwable th) {
                                        th = th;
                                        parcel = obtain;
                                        if (parcel != null) {
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    parcel = null;
                                    if (parcel != null) {
                                        parcel.recycle();
                                    }
                                    throw th;
                                }
                            }
                        }
                        str2 = str3;
                        HashMap hashMap = new HashMap();
                        HashMap hashMap2 = new HashMap();
                        Iterator<String> it3 = b6.getAll().keySet().iterator();
                        while (it3.hasNext()) {
                            String next = it3.next();
                            Iterator<String> it4 = it3;
                            if (next.startsWith("gsai-src-")) {
                                hashMap.put(next.substring(9), Integer.valueOf(b6.getInt(next, 0)));
                                it3 = it4;
                                b = b;
                            } else {
                                SharedPreferences sharedPreferences2 = b;
                                if (next.startsWith("fp-")) {
                                    String substring = next.substring(3);
                                    String string2 = b6.getString(next, null);
                                    if (string2 != null) {
                                        hashMap2.put(substring, string2);
                                        it3 = it4;
                                        b = sharedPreferences2;
                                    } else {
                                        it3 = it4;
                                        b = sharedPreferences2;
                                    }
                                } else {
                                    it3 = it4;
                                    b = sharedPreferences2;
                                }
                            }
                        }
                        sharedPreferences = b;
                        acrp.f60633e = new HashMap();
                        Iterator<Map.Entry<String, ?>> it5 = all.entrySet().iterator();
                        while (it5.hasNext()) {
                            Map.Entry<String, ?> next2 = it5.next();
                            String str6 = (String) next2.getValue();
                            if (str6 != null) {
                                abul a = acrp.mo33046a(next2.getKey());
                                bxvd bxvd = (bxvd) a.mo74142c(5);
                                bxvd.mo73625a((GeneratedMessageLite) a);
                                if (bxvd.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd.f164950c = false;
                                }
                                abul abul = (abul) bxvd.f164949b;
                                abul abul2 = abul.f58412n;
                                str6.getClass();
                                abul.f58414a |= 1;
                                abul.f58415b = str6;
                                acrp.mo33047a(next2.getKey(), (abul) bxvd.mo74062i());
                                it5 = it5;
                            }
                        }
                        for (String str7 : hashSet) {
                            abul a2 = acrp.mo33046a(str7);
                            bxvd bxvd2 = (bxvd) a2.mo74142c(5);
                            bxvd2.mo73625a((GeneratedMessageLite) a2);
                            if (bxvd2.f164950c) {
                                bxvd2.mo74035c();
                                bxvd2.f164950c = false;
                            }
                            abul.m48284a((abul) bxvd2.f164949b);
                            acrp.mo33047a(str7, (abul) bxvd2.mo74062i());
                        }
                        int size = arrayList.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            GlobalSearchApplicationInfo globalSearchApplicationInfo2 = (GlobalSearchApplicationInfo) arrayList.get(i5);
                            abul a3 = acrp.mo33046a(globalSearchApplicationInfo2.f9562a);
                            bxvd bxvd3 = (bxvd) a3.mo74142c(5);
                            bxvd3.mo73625a((GeneratedMessageLite) a3);
                            abtd a4 = acky.m49356a(globalSearchApplicationInfo2);
                            if (bxvd3.f164950c) {
                                bxvd3.mo74035c();
                                bxvd3.f164950c = false;
                            }
                            abul abul3 = (abul) bxvd3.f164949b;
                            abul abul4 = abul.f58412n;
                            a4.getClass();
                            abul3.f58417d = a4;
                            abul3.f58414a |= 4;
                            acrp.mo33047a(globalSearchApplicationInfo2.f9562a, (abul) bxvd3.mo74062i());
                        }
                        for (Map.Entry entry : hashMap.entrySet()) {
                            abul a5 = acrp.mo33046a((String) entry.getKey());
                            bxvd bxvd4 = (bxvd) a5.mo74142c(5);
                            bxvd4.mo73625a((GeneratedMessageLite) a5);
                            int intValue = ((Integer) entry.getValue()).intValue();
                            if (bxvd4.f164950c) {
                                bxvd4.mo74035c();
                                bxvd4.f164950c = false;
                            }
                            abul abul5 = (abul) bxvd4.f164949b;
                            abul abul6 = abul.f58412n;
                            abul5.f58414a |= 8;
                            abul5.f58418e = intValue;
                            acrp.mo33047a((String) entry.getKey(), (abul) bxvd4.mo74062i());
                        }
                        for (Map.Entry entry2 : hashMap2.entrySet()) {
                            abul a6 = acrp.mo33046a((String) entry2.getKey());
                            bxvd bxvd5 = (bxvd) a6.mo74142c(5);
                            bxvd5.mo73625a((GeneratedMessageLite) a6);
                            String str8 = (String) entry2.getValue();
                            if (bxvd5.f164950c) {
                                bxvd5.mo74035c();
                                bxvd5.f164950c = false;
                            }
                            abul abul7 = (abul) bxvd5.f164949b;
                            abul abul8 = abul.f58412n;
                            str8.getClass();
                            abul7.f58414a |= 16;
                            abul7.f58419f = str8;
                            acrp.mo33047a((String) entry2.getKey(), (abul) bxvd5.mo74062i());
                        }
                        SharedPreferences.Editor edit = acrp.f60631c.edit();
                        edit.putInt("index-version", i3);
                        for (Map.Entry entry3 : acrp.f60633e.entrySet()) {
                            acrn.m49773a(edit, (String) entry3.getKey(), (abul) entry3.getValue());
                        }
                        edit.commit();
                        acrp.mo33048b("-version");
                        acrp.mo33048b("-appauth");
                        acrp.mo33048b("-blockedpackages");
                        acrp.mo33048b("-universalsearch");
                        acrp.mo33048b("-resourceparse");
                        HashMap hashMap3 = new HashMap();
                        acrn.m49772a(acrp.f60631c, hashMap3);
                        SharedPreferences.Editor edit2 = acrp.f60631c.edit();
                        for (Map.Entry entry4 : hashMap3.entrySet()) {
                            abul abul9 = (abul) entry4.getValue();
                            bxvd bxvd6 = (bxvd) abul9.mo74142c(5);
                            bxvd6.mo73625a((GeneratedMessageLite) abul9);
                            if (bxvd6.f164950c) {
                                bxvd6.mo74035c();
                                bxvd6.f164950c = false;
                            }
                            abul.m48285b((abul) bxvd6.f164949b);
                            acrn.m49773a(edit2, (String) entry4.getKey(), (abul) bxvd6.mo74062i());
                        }
                        edit2.commit();
                        acrp.f60631c.edit().putLong("last-maintenance", System.currentTimeMillis()).commit();
                        long currentTimeMillis = System.currentTimeMillis();
                        HashMap hashMap4 = new HashMap();
                        acrn.m49772a(acrp.f60631c, hashMap4);
                        SharedPreferences.Editor edit3 = acrp.f60631c.edit();
                        for (Map.Entry entry5 : hashMap4.entrySet()) {
                            abul abul10 = (abul) entry5.getValue();
                            bxvd bxvd7 = (bxvd) abul10.mo74142c(5);
                            bxvd7.mo73625a((GeneratedMessageLite) abul10);
                            if (((abul) bxvd7.f164949b).f58421h == 0) {
                                if (bxvd7.f164950c) {
                                    bxvd7.mo74035c();
                                    bxvd7.f164950c = false;
                                }
                                abul abul11 = (abul) bxvd7.f164949b;
                                abul abul12 = abul.f58412n;
                                abul11.f58414a |= 64;
                                abul11.f58421h = currentTimeMillis;
                            }
                            acrn.m49773a(edit3, (String) entry5.getKey(), (abul) bxvd7.mo74062i());
                        }
                        edit3.commit();
                        HashMap hashMap5 = new HashMap();
                        acrn.m49772a(acrp.f60631c, hashMap5);
                        SharedPreferences.Editor edit4 = acrp.f60631c.edit();
                        for (Map.Entry entry6 : hashMap5.entrySet()) {
                            abul abul13 = (abul) entry6.getValue();
                            bxvd bxvd8 = (bxvd) abul13.mo74142c(5);
                            bxvd8.mo73625a((GeneratedMessageLite) abul13);
                            try {
                                i = acrp.f60629a.getPackageManager().getPackageInfo((String) entry6.getKey(), 0).versionCode;
                            } catch (PackageManager.NameNotFoundException e2) {
                                i = 0;
                            }
                            if (bxvd8.f164950c) {
                                bxvd8.mo74035c();
                                bxvd8.f164950c = false;
                            }
                            abul abul14 = (abul) bxvd8.f164949b;
                            abul abul15 = abul.f58412n;
                            abul14.f58414a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            abul14.f58423j = i;
                            acrn.m49773a(edit4, (String) entry6.getKey(), (abul) bxvd8.mo74062i());
                        }
                        edit4.commit();
                        HashMap hashMap6 = new HashMap();
                        acrn.m49772a(acrp.f60631c, hashMap6);
                        SharedPreferences.Editor edit5 = acrp.f60631c.edit();
                        for (Map.Entry entry7 : hashMap6.entrySet()) {
                            abul abul16 = (abul) entry7.getValue();
                            bxvd bxvd9 = (bxvd) abul16.mo74142c(5);
                            bxvd9.mo73625a((GeneratedMessageLite) abul16);
                            try {
                                String e3 = spn.m35882e(acrp.f60629a, (String) entry7.getKey());
                                if (e3 != null) {
                                    if (bxvd9.f164950c) {
                                        bxvd9.mo74035c();
                                        bxvd9.f164950c = false;
                                    }
                                    abul abul17 = (abul) bxvd9.f164949b;
                                    abul abul18 = abul.f58412n;
                                    e3.getClass();
                                    abul17.f58414a |= 512;
                                    abul17.f58424k = e3;
                                }
                            } catch (PackageManager.NameNotFoundException e4) {
                                if (bxvd9.f164950c) {
                                    bxvd9.mo74035c();
                                    bxvd9.f164950c = false;
                                }
                                abul abul19 = (abul) bxvd9.f164949b;
                                abul abul20 = abul.f58412n;
                                abul19.f58414a &= -513;
                                abul19.f58424k = abul.f58412n.f58424k;
                            }
                            acrn.m49773a(edit5, (String) entry7.getKey(), (abul) bxvd9.mo74062i());
                        }
                        edit5.commit();
                        break;
                    } else {
                        sharedPreferences = b;
                        str2 = str3;
                        HashMap hashMap32 = new HashMap();
                        acrn.m49772a(acrp.f60631c, hashMap32);
                        SharedPreferences.Editor edit22 = acrp.f60631c.edit();
                        while (r0.hasNext()) {
                        }
                        edit22.commit();
                        acrp.f60631c.edit().putLong("last-maintenance", System.currentTimeMillis()).commit();
                        long currentTimeMillis2 = System.currentTimeMillis();
                        HashMap hashMap42 = new HashMap();
                        acrn.m49772a(acrp.f60631c, hashMap42);
                        SharedPreferences.Editor edit32 = acrp.f60631c.edit();
                        while (r2.hasNext()) {
                        }
                        edit32.commit();
                        HashMap hashMap52 = new HashMap();
                        acrn.m49772a(acrp.f60631c, hashMap52);
                        SharedPreferences.Editor edit42 = acrp.f60631c.edit();
                        while (r2.hasNext()) {
                        }
                        edit42.commit();
                        HashMap hashMap62 = new HashMap();
                        acrn.m49772a(acrp.f60631c, hashMap62);
                        SharedPreferences.Editor edit52 = acrp.f60631c.edit();
                        while (r2.hasNext()) {
                        }
                        edit52.commit();
                    }
                    break;
                case 1:
                    sharedPreferences = b;
                    str2 = str3;
                    HashMap hashMap322 = new HashMap();
                    acrn.m49772a(acrp.f60631c, hashMap322);
                    SharedPreferences.Editor edit222 = acrp.f60631c.edit();
                    while (r0.hasNext()) {
                    }
                    edit222.commit();
                    acrp.f60631c.edit().putLong("last-maintenance", System.currentTimeMillis()).commit();
                    long currentTimeMillis22 = System.currentTimeMillis();
                    HashMap hashMap422 = new HashMap();
                    acrn.m49772a(acrp.f60631c, hashMap422);
                    SharedPreferences.Editor edit322 = acrp.f60631c.edit();
                    while (r2.hasNext()) {
                    }
                    edit322.commit();
                    HashMap hashMap522 = new HashMap();
                    acrn.m49772a(acrp.f60631c, hashMap522);
                    SharedPreferences.Editor edit422 = acrp.f60631c.edit();
                    while (r2.hasNext()) {
                    }
                    edit422.commit();
                    HashMap hashMap622 = new HashMap();
                    acrn.m49772a(acrp.f60631c, hashMap622);
                    SharedPreferences.Editor edit522 = acrp.f60631c.edit();
                    while (r2.hasNext()) {
                    }
                    edit522.commit();
                    break;
                case 2:
                    sharedPreferences = b;
                    str2 = str3;
                    acrp.f60631c.edit().putLong("last-maintenance", System.currentTimeMillis()).commit();
                    long currentTimeMillis222 = System.currentTimeMillis();
                    HashMap hashMap4222 = new HashMap();
                    acrn.m49772a(acrp.f60631c, hashMap4222);
                    SharedPreferences.Editor edit3222 = acrp.f60631c.edit();
                    while (r2.hasNext()) {
                    }
                    edit3222.commit();
                    HashMap hashMap5222 = new HashMap();
                    acrn.m49772a(acrp.f60631c, hashMap5222);
                    SharedPreferences.Editor edit4222 = acrp.f60631c.edit();
                    while (r2.hasNext()) {
                    }
                    edit4222.commit();
                    HashMap hashMap6222 = new HashMap();
                    acrn.m49772a(acrp.f60631c, hashMap6222);
                    SharedPreferences.Editor edit5222 = acrp.f60631c.edit();
                    while (r2.hasNext()) {
                    }
                    edit5222.commit();
                    break;
                case 3:
                    sharedPreferences = b;
                    str2 = str3;
                    long currentTimeMillis2222 = System.currentTimeMillis();
                    HashMap hashMap42222 = new HashMap();
                    acrn.m49772a(acrp.f60631c, hashMap42222);
                    SharedPreferences.Editor edit32222 = acrp.f60631c.edit();
                    while (r2.hasNext()) {
                    }
                    edit32222.commit();
                    HashMap hashMap52222 = new HashMap();
                    acrn.m49772a(acrp.f60631c, hashMap52222);
                    SharedPreferences.Editor edit42222 = acrp.f60631c.edit();
                    while (r2.hasNext()) {
                    }
                    edit42222.commit();
                    HashMap hashMap62222 = new HashMap();
                    acrn.m49772a(acrp.f60631c, hashMap62222);
                    SharedPreferences.Editor edit52222 = acrp.f60631c.edit();
                    while (r2.hasNext()) {
                    }
                    edit52222.commit();
                    break;
                case 4:
                    sharedPreferences = b;
                    str2 = str3;
                    HashMap hashMap522222 = new HashMap();
                    acrn.m49772a(acrp.f60631c, hashMap522222);
                    SharedPreferences.Editor edit422222 = acrp.f60631c.edit();
                    while (r2.hasNext()) {
                    }
                    edit422222.commit();
                    HashMap hashMap622222 = new HashMap();
                    acrn.m49772a(acrp.f60631c, hashMap622222);
                    SharedPreferences.Editor edit522222 = acrp.f60631c.edit();
                    while (r2.hasNext()) {
                    }
                    edit522222.commit();
                    break;
                case 5:
                case 6:
                    sharedPreferences = b;
                    str2 = str3;
                    HashMap hashMap6222222 = new HashMap();
                    acrn.m49772a(acrp.f60631c, hashMap6222222);
                    SharedPreferences.Editor edit5222222 = acrp.f60631c.edit();
                    while (r2.hasNext()) {
                    }
                    edit5222222.commit();
                    break;
                default:
                    sharedPreferences = b;
                    str2 = str3;
                    break;
            }
            sharedPreferences.edit().putInt(str2, 7).commit();
        } else {
            sharedPreferences = b;
        }
        this.f60620b = sharedPreferences;
        mo33017a();
    }

    /* renamed from: a */
    public static String m49740a(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("app-params-recent-context-blacklist-") : "app-params-recent-context-blacklist-".concat(valueOf);
    }

    /* renamed from: c */
    public final abul mo33025c(String str) {
        return (abul) this.f60621c.get(str);
    }

    /* renamed from: g */
    public final void mo33033g(String str) {
        synchronized (this.f60625g) {
            abul d = mo33026d(str);
            bxvd bxvd = (bxvd) d.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) d);
            if (bxvd != null) {
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                abul abul = (abul) bxvd.f164949b;
                abul abul2 = abul.f58412n;
                abul.f58414a &= -17;
                abul.f58419f = abul.f58412n.f58419f;
                mo33020a(str, (abul) bxvd.mo74062i());
            }
        }
    }

    /* renamed from: j */
    public final void mo33039j() {
        this.f60620b.edit().putInt("index-version", 63).commit();
    }

    /* renamed from: a */
    public final void mo33017a() {
        synchronized (this.f60625g) {
            this.f60621c = new HashMap();
            String string = this.f60620b.getString("gmscore-info", null);
            if (string != null) {
                this.f60622d = (abuk) acky.m49358a(string, (bxxk) abuk.f58408d.mo74142c(7));
            }
            acrn.m49772a(this.f60620b, this.f60621c);
            this.f60623e = Collections.emptyMap();
            this.f60624f = f60618h;
            m49742k();
        }
    }

    /* renamed from: d */
    public final acrk mo33027d() {
        acrk acrk;
        synchronized (this.f60625g) {
            acrk = new acrk(this);
        }
        return acrk;
    }

    /* renamed from: b */
    public final int mo33022b() {
        return this.f60620b.getInt("index-version", -1);
    }

    /* renamed from: e */
    public final boolean mo33029e() {
        boolean contains;
        synchronized (this.f60625g) {
            contains = this.f60620b.contains("app-params-last-update-sched");
        }
        return contains;
    }

    /* renamed from: f */
    public final boolean mo33031f() {
        boolean z;
        synchronized (this.f60625g) {
            z = this.f60620b.getBoolean("app-history-upload-pending", false);
        }
        return z;
    }

    /* renamed from: b */
    public final SharedPreferences mo33023b(String str) {
        Context context = this.f60619a;
        String valueOf = String.valueOf(this.f60626i);
        return context.getSharedPreferences(str.length() == 0 ? new String(valueOf) : valueOf.concat(str), 4);
    }

    /* renamed from: i */
    public final Set mo33037i() {
        HashSet hashSet = new HashSet();
        synchronized (this.f60625g) {
            abuk abuk = this.f60622d;
            if (abuk != null) {
                for (abtd abtd : abuk.f58410a) {
                    hashSet.add(acky.m49359a(abtd));
                }
            }
        }
        return hashSet;
    }

    /* renamed from: h */
    public final boolean mo33035h(String str) {
        boolean z;
        synchronized (this.f60625g) {
            abul c = mo33025c(str);
            z = false;
            if (c != null && c.f58416c) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: k */
    public final long mo33040k(String str) {
        long j;
        synchronized (this.f60625g) {
            abul c = mo33025c(str);
            j = c != null ? c.f58421h : 0;
        }
        return j;
    }

    /* renamed from: a */
    public final void mo33018a(abuk abuk) {
        SharedPreferences.Editor edit = this.f60620b.edit();
        if (abuk == null || abuk.f58410a.size() == 0) {
            edit.remove("gmscore-info").commit();
        } else {
            edit.putString("gmscore-info", acky.m49362a(abuk)).commit();
        }
    }

    /* renamed from: a */
    public final void mo33019a(acqn acqn) {
        synchronized (this.f60625g) {
            SharedPreferences.Editor edit = this.f60620b.edit();
            for (String str : this.f60620b.getAll().keySet()) {
                if (str.startsWith("app-params-recent-context-blacklist-")) {
                    edit.remove(str);
                }
            }
            for (acqm acqm : acqn.f60507a) {
                if (acqm.f60500c) {
                    String valueOf = String.valueOf(acqm.f60498a);
                    edit.putBoolean(valueOf.length() == 0 ? new String("app-params-recent-context-blacklist-") : "app-params-recent-context-blacklist-".concat(valueOf), true);
                }
            }
            edit.putString("app-params", acky.m49362a(acqn)).putLong("app-params-last-update", System.currentTimeMillis()).remove("app-params-last-update-sched").apply();
            m49742k();
        }
    }

    /* renamed from: a */
    public final void mo33020a(String str, abul abul) {
        this.f60621c.put(str, abul);
        SharedPreferences.Editor edit = this.f60620b.edit();
        boolean a = acrn.m49773a(edit, str, abul);
        edit.commit();
        if (!a) {
            this.f60621c.remove(str);
        }
    }

    /* renamed from: a */
    public final void mo33021a(boolean z) {
        this.f60620b.edit().putBoolean("predefined-typeconfigs-update-in-progress", z).commit();
    }
}
