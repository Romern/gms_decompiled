package p000;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.appdatasearch.GlobalSearchApplication;
import com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: abyv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abyv {

    /* renamed from: a */
    public static final bnhe f58760a;

    /* renamed from: b */
    public final String f58761b;

    /* renamed from: c */
    public final abyw f58762c;

    /* renamed from: d */
    public final acrl f58763d;

    /* renamed from: e */
    public final Object f58764e = new Object();

    /* renamed from: f */
    public final Set f58765f = new HashSet();

    /* renamed from: g */
    public String f58766g;

    static {
        bnha bnha = new bnha();
        bnha.mo67695b("internal.3p:MusicPlaylist", "internal.3p:MusicRecording");
        bnha.mo67695b("internal.3p:MusicGroup", "internal.3p:MusicRecording");
        bnha.mo67695b("internal.3p:MusicAlbum", "internal.3p:MusicRecording");
        f58760a = bnha.mo67618b();
    }

    public abyv(String str, abyw abyw) {
        sdo.m34959a((Object) str);
        this.f58761b = str;
        sdo.m34959a(abyw);
        this.f58762c = abyw;
        this.f58763d = abyw.f58767a;
    }

    /* renamed from: a */
    static Intent m48583a(String str, GlobalSearchApplication globalSearchApplication) {
        Intent intent = new Intent(str);
        Parcel obtain = Parcel.obtain();
        try {
            fri.m12223a(globalSearchApplication, obtain, 0);
            intent.putExtra("App", obtain.marshall());
            return intent;
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: a */
    public static final String m48584a(int i) {
        return i != 1 ? i != 2 ? "App unknown" : "Has different fingerprint" : "App not allowed";
    }

    /* renamed from: b */
    private final void m48585b(abzr abzr) {
        GlobalSearchApplicationInfo globalSearchApplicationInfo = (GlobalSearchApplicationInfo) abzr.mo32560c();
        if (globalSearchApplicationInfo != null) {
            acrl acrl = this.f58763d;
            int a = abzr.mo32553a();
            long b = abzr.mo32559b();
            String str = globalSearchApplicationInfo.f9562a;
            synchronized (acrl.f60625g) {
                abul d = acrl.mo33026d(str);
                bxvd bxvd = (bxvd) d.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) d);
                abtd a2 = acky.m49356a(globalSearchApplicationInfo);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                abul abul = (abul) bxvd.f164949b;
                abul abul2 = abul.f58412n;
                a2.getClass();
                abul.f58417d = a2;
                int i = abul.f58414a | 4;
                abul.f58414a = i;
                int i2 = i | 8;
                abul.f58414a = i2;
                abul.f58418e = a;
                abul.f58414a = i2 | 64;
                abul.f58421h = b;
                acrl.mo33020a(str, (abul) bxvd.mo74062i());
            }
            return;
        }
        acrl acrl2 = this.f58763d;
        String str2 = this.f58761b;
        synchronized (acrl2.f60625g) {
            abul c = acrl2.mo33025c(str2);
            if (c != null) {
                bxvd bxvd2 = (bxvd) c.mo74142c(5);
                bxvd2.mo73625a((GeneratedMessageLite) c);
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                abul abul3 = (abul) bxvd2.f164949b;
                abul3.f58417d = null;
                int i3 = abul3.f58414a & -5;
                abul3.f58414a = i3;
                int i4 = i3 & -9;
                abul3.f58414a = i4;
                abul3.f58418e = 0;
                abul3.f58414a = i4 & -65;
                abul3.f58421h = 0;
                acrl2.mo33020a(str2, (abul) bxvd2.mo74062i());
            }
        }
    }

    /* renamed from: r */
    private final boolean m48586r() {
        return rfz.m33557a(this.f58762c.f58768b).mo24610b(this.f58761b);
    }

    /* renamed from: c */
    public final boolean mo32474c() {
        return this.f58763d.mo33035h(this.f58761b);
    }

    /* renamed from: d */
    public final void mo32475d() {
        acrl acrl = this.f58763d;
        String str = this.f58761b;
        synchronized (acrl.f60625g) {
            abul d = acrl.mo33026d(str);
            bxvd bxvd = (bxvd) d.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) d);
            if (!((abul) bxvd.f164949b).f58420g) {
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                abul.m48285b((abul) bxvd.f164949b);
                acrl.mo33020a(str, (abul) bxvd.mo74062i());
            }
        }
    }

    /* renamed from: e */
    public final boolean mo32476e() {
        boolean z;
        acrl acrl = this.f58763d;
        String str = this.f58761b;
        synchronized (acrl.f60625g) {
            abul c = acrl.mo33025c(str);
            z = false;
            if (c != null && c.f58420g) {
                z = true;
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final Map mo32477f() {
        abzo a = this.f58762c.f58771e.f58043a.mo32298a();
        HashMap hashMap = new HashMap();
        synchronized (((abzm) a).mo32525a()) {
            for (acak acak : mo32462a()) {
                abss abss = (abss) ((abzm) a).f58817f.get(acak);
                if (abss != null) {
                    absy absy = abss.f58158c;
                    if (absy == null) {
                        absy = absy.f58176h;
                    }
                    int a2 = absx.m48236a(absy.f58180c);
                    if (a2 != 0) {
                        if (a2 != 1) {
                        }
                    }
                    absr absr = abss.f58157b;
                    if (absr == null) {
                        absr = absr.f58134s;
                    }
                    String str = absr.f58138c;
                    absr absr2 = abss.f58157b;
                    if (absr2 == null) {
                        absr2 = absr.f58134s;
                    }
                    hashMap.put(str, abzm.m48659g(absr2));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: g */
    public final abzr mo32478g() {
        abzr abzr;
        synchronized (this.f58763d.f60625g) {
            abzr = new abzr(this.f58763d.mo33036i(this.f58761b), this.f58763d.mo33038j(this.f58761b), this.f58763d.mo33040k(this.f58761b));
        }
        return abzr;
    }

    /* renamed from: h */
    public final Set mo32479h() {
        Set i;
        synchronized (this.f58763d.f60625g) {
            i = this.f58763d.mo33037i();
        }
        return i;
    }

    /* renamed from: i */
    public final boolean mo32480i() {
        String e = this.f58763d.mo33028e(this.f58761b);
        if (e != null) {
            return !e.endsWith("-3p");
        }
        return m48586r();
    }

    /* renamed from: j */
    public final String mo32481j() {
        try {
            PackageInfo packageInfo = this.f58762c.f58769c.getPackageInfo(this.f58761b, 64);
            if (rfz.m33557a(this.f58762c.f58768b).mo24606a(packageInfo)) {
                String valueOf = String.valueOf(Long.toString(packageInfo.firstInstallTime));
                return valueOf.length() == 0 ? new String("install-time-") : "install-time-".concat(valueOf);
            }
            String l = Long.toString(packageInfo.firstInstallTime);
            StringBuilder sb = new StringBuilder(String.valueOf(l).length() + 16);
            sb.append("install-time-");
            sb.append(l);
            sb.append("-3p");
            return sb.toString();
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    /* renamed from: k */
    public final void mo32482k() {
        synchronized (this.f58763d.f60625g) {
            absg.m48185a("Unregistering package %s", this.f58761b);
            acrl acrl = this.f58763d;
            String str = this.f58761b;
            synchronized (acrl.f60625g) {
                abul c = acrl.mo33025c(str);
                if (c != null) {
                    bxvd bxvd = (bxvd) c.mo74142c(5);
                    bxvd.mo73625a((GeneratedMessageLite) c);
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    abul abul = (abul) bxvd.f164949b;
                    abul.f58414a &= -2;
                    abul.f58415b = abul.f58412n.f58415b;
                    acrl.mo33020a(str, (abul) bxvd.mo74062i());
                }
            }
            acrl acrl2 = this.f58763d;
            String str2 = this.f58761b;
            synchronized (acrl2.f60625g) {
                abul d = acrl2.mo33026d(str2);
                bxvd bxvd2 = (bxvd) d.mo74142c(5);
                bxvd2.mo73625a((GeneratedMessageLite) d);
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                abul abul2 = (abul) bxvd2.f164949b;
                abul abul3 = abul.f58412n;
                abul2.f58414a &= -33;
                abul2.f58420g = false;
                acrl2.mo33020a(str2, (abul) bxvd2.mo74062i());
            }
            this.f58763d.mo33033g(this.f58761b);
            acrl acrl3 = this.f58763d;
            String str3 = this.f58761b;
            synchronized (acrl3.f60625g) {
                abul d2 = acrl3.mo33026d(str3);
                bxvd bxvd3 = (bxvd) d2.mo74142c(5);
                bxvd3.mo73625a((GeneratedMessageLite) d2);
                if (bxvd3.f164950c) {
                    bxvd3.mo74035c();
                    bxvd3.f164950c = false;
                }
                abul abul4 = (abul) bxvd3.f164949b;
                abul4.f58414a &= -129;
                abul4.f58422i = 0;
                acrl3.mo33020a(str3, (abul) bxvd3.mo74062i());
            }
            this.f58763d.mo33044o(this.f58761b);
            acrl acrl4 = this.f58763d;
            String str4 = this.f58761b;
            synchronized (acrl4.f60625g) {
                abul d3 = acrl4.mo33026d(str4);
                bxvd bxvd4 = (bxvd) d3.mo74142c(5);
                bxvd4.mo73625a((GeneratedMessageLite) d3);
                if (bxvd4.f164950c) {
                    bxvd4.mo74035c();
                    bxvd4.f164950c = false;
                }
                abul abul5 = (abul) bxvd4.f164949b;
                abul5.f58414a &= -2049;
                abul5.f58426m = 0;
                acrl4.mo33020a(str4, (abul) bxvd4.mo74062i());
            }
        }
    }

    /* renamed from: l */
    public final Resources mo32483l() {
        try {
            if (!"com.google.android.gms".equals(this.f58761b)) {
                return this.f58762c.f58769c.getResourcesForApplication(this.f58761b);
            }
            return this.f58762c.f58768b.getResources();
        } catch (PackageManager.NameNotFoundException e) {
            String str = this.f58761b;
            absg.m48191b(str.length() == 0 ? new String("Failed to get resources for client ") : "Failed to get resources for client ".concat(str));
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo32484m() {
        int i;
        C1240of b = this.f58762c.mo32492b(this.f58761b);
        Object obj = b.f26798a;
        if (obj != null) {
            i = ((Integer) obj).intValue();
        } else {
            i = 0;
        }
        if (i == 0 || TextUtils.isEmpty((CharSequence) b.f26799b)) {
            this.f58763d.mo33044o(this.f58761b);
            return;
        }
        acrl acrl = this.f58763d;
        String str = this.f58761b;
        String str2 = (String) b.f26799b;
        synchronized (acrl.f60625g) {
            abul d = acrl.mo33026d(str);
            bxvd bxvd = (bxvd) d.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) d);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            abul abul = (abul) bxvd.f164949b;
            abul abul2 = abul.f58412n;
            int i2 = abul.f58414a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            abul.f58414a = i2;
            abul.f58423j = i;
            str2.getClass();
            abul.f58414a = i2 | 512;
            abul.f58424k = str2;
            acrl.mo33020a(str, (abul) bxvd.mo74062i());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo32485n() {
        String p = mo32487p();
        if (p == null) {
            this.f58763d.mo33033g(this.f58761b);
        } else {
            acrl acrl = this.f58763d;
            String str = this.f58761b;
            synchronized (acrl.f60625g) {
                abul d = acrl.mo33026d(str);
                bxvd bxvd = (bxvd) d.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) d);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                abul abul = (abul) bxvd.f164949b;
                abul abul2 = abul.f58412n;
                p.getClass();
                abul.f58414a |= 16;
                abul.f58419f = p;
                acrl.mo33020a(str, (abul) bxvd.mo74062i());
            }
        }
        mo32484m();
    }

    /* renamed from: o */
    public final boolean mo32486o() {
        String f = this.f58763d.mo33030f(this.f58761b);
        return f == null || !TextUtils.equals(mo32487p(), f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final String mo32487p() {
        try {
            PackageInfo packageInfo = this.f58762c.f58769c.getPackageInfo(this.f58761b, 0);
            if (!((Boolean) acaw.f59320ax.mo58455c()).booleanValue()) {
                long j = packageInfo.lastUpdateTime;
                StringBuilder sb = new StringBuilder(32);
                sb.append("last-update-");
                sb.append(j);
                return sb.toString();
            }
            long j2 = packageInfo.lastUpdateTime;
            StringBuilder sb2 = new StringBuilder(42);
            sb2.append("last-update-");
            sb2.append(j2);
            sb2.append("-version-3");
            return sb2.toString();
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    /* renamed from: q */
    public final boolean mo32488q() {
        boolean z;
        acrl acrl = this.f58763d;
        String str = this.f58761b;
        synchronized (acrl.f60625g) {
            abul c = acrl.mo33025c(str);
            z = false;
            if (c != null && c.f58425l) {
                z = true;
            }
        }
        return z;
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        String str = this.f58761b;
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + str.length());
        sb.append(simpleName);
        sb.append("{");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public final Set mo32462a() {
        Set unmodifiableSet;
        synchronized (this.f58764e) {
            unmodifiableSet = Collections.unmodifiableSet(new HashSet(this.f58765f));
        }
        return unmodifiableSet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006f, code lost:
        r8 = new java.util.ArrayList(2);
        r0 = (com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo) r2.mo32560c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007b, code lost:
        if (r0 == null) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007d, code lost:
        r2 = mo32469a(r7.f58762c.mo32490a());
        r3 = new com.google.android.gms.appdatasearch.GlobalSearchApplication(r0, r2, mo32477f());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0090, code lost:
        if (r2 == false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0092, code lost:
        r0 = r3.f9559a;
        r2 = new android.content.Intent("com.google.android.gms.icing.GlobalSearchAppRegistered");
        r2.putExtra("AppInfo", r0);
        r8.add(r2);
        r8.add(m48583a("com.google.android.gms.icing.GlobalSearchAppRegistered2", r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00ac, code lost:
        r8.add(m48583a("com.google.android.gms.icing.GlobalSearchAppRegistered3", r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b7, code lost:
        r0 = new android.content.Intent("com.google.android.gms.icing.GlobalSearchableAppUnRegistered");
        r0.putExtra("AppPackageName", r7.f58761b);
        r8.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00c8, code lost:
        r0 = r7.f58762c.mo32493b();
        r2 = new java.lang.StringBuilder(16);
        r2.append("gsaSigned= ");
        r2.append(r0);
        p000.absg.m48184a(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00e4, code lost:
        if (r0 == false) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00e6, code lost:
        r0 = r8.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ea, code lost:
        if (r1 >= r0) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ec, code lost:
        r2 = (android.content.Intent) r8.get(r1);
        r2.setPackage("com.google.android.googlequicksearchbox");
        r4 = java.lang.String.valueOf(r2);
        r6 = new java.lang.StringBuilder(java.lang.String.valueOf(r4).length() + 16);
        r6.append("Sending intent: ");
        r6.append(r4);
        p000.absg.m48184a(r6.toString());
        r7.f58762c.f58768b.sendBroadcast(r2);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0122, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0123, code lost:
        p000.absg.m48196c("Not sending global search app notification. Search app not installed or not signed properly.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0129, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo32463a(abzr abzr) {
        GlobalSearchApplicationInfo globalSearchApplicationInfo = (GlobalSearchApplicationInfo) abzr.mo32560c();
        int i = 0;
        boolean z = true;
        if (globalSearchApplicationInfo != null && !this.f58761b.equals(globalSearchApplicationInfo.f9562a)) {
            z = false;
        }
        sdo.m34974b(z);
        absg.m48184a("setGlobalSearchInfo");
        synchronized (this.f58763d.f60625g) {
            abzr abzr2 = new abzr(this.f58763d.mo33036i(this.f58761b), this.f58763d.mo33038j(this.f58761b), this.f58763d.mo33040k(this.f58761b));
            if (!abzr2.mo32558a(abzr)) {
                String d = abzr.mo32561d();
                String d2 = abzr2.mo32561d();
                StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 53 + String.valueOf(d2).length());
                sb.append("GlobalSearchApplicationInfo: cannot ");
                sb.append(d);
                sb.append(" when previously ");
                sb.append(d2);
                throw new acaq(sb.toString());
            } else if (!sdg.m34949a(abzr2.mo32560c(), abzr.mo32560c())) {
                absg.m48185a("setGlobalSearchInfo info changed for %s", this.f58761b);
                abzr2.mo32556a(abzr.mo32560c(), abzr.mo32553a(), abzr.mo32559b());
                m48585b(abzr2);
            } else {
                absg.m48186a("setGlobalSearchInfo info unchanged for %s; updating timestamp to %d", this.f58761b, Long.valueOf(abzr.mo32559b()));
                abzr2.mo32555a(abzr.mo32559b());
                m48585b(abzr2);
            }
        }
    }

    /* renamed from: b */
    public final int mo32470b() {
        int size;
        synchronized (this.f58764e) {
            size = this.f58765f.size();
        }
        return size;
    }

    /* renamed from: b */
    public final int mo32471b(boolean z) {
        synchronized (this.f58763d.f60625g) {
            String e = this.f58763d.mo33028e(this.f58761b);
            String j = mo32481j();
            if (j == null) {
                return 3;
            }
            if (TextUtils.isEmpty(e)) {
                if (z) {
                    if (!m48586r()) {
                        return 1;
                    }
                }
                acrl acrl = this.f58763d;
                String str = this.f58761b;
                synchronized (acrl.f60625g) {
                    abul d = acrl.mo33026d(str);
                    bxvd bxvd = (bxvd) d.mo74142c(5);
                    bxvd.mo73625a((GeneratedMessageLite) d);
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    abul abul = (abul) bxvd.f164949b;
                    abul abul2 = abul.f58412n;
                    j.getClass();
                    abul.f58414a = 1 | abul.f58414a;
                    abul.f58415b = j;
                    acrl.mo33020a(str, (abul) bxvd.mo74062i());
                }
            } else if (!TextUtils.equals(e, j)) {
                return 2;
            }
            return 0;
        }
    }

    /* renamed from: a */
    public final void mo32464a(acak acak) {
        synchronized (this.f58764e) {
            this.f58765f.remove(acak);
        }
    }

    /* renamed from: b */
    public final void mo32472b(String str) {
        synchronized (this.f58764e) {
            this.f58766g = str;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00aa, code lost:
        r0 = r9.f58762c.mo32493b();
        r1 = new java.lang.StringBuilder(16);
        r1.append("gsaSigned= ");
        r1.append(r0);
        p000.absg.m48184a(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c6, code lost:
        if (r0 != false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c8, code lost:
        p000.absg.m48196c("Not sending global search app notification. Search app not installed or not signed properly.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00cd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ce, code lost:
        r0 = new java.util.ArrayList(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d8, code lost:
        if (r10.isEmpty() != false) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00da, code lost:
        r10 = r10.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e2, code lost:
        if (r10.hasNext() == false) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e4, code lost:
        r1 = (com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo) r10.next();
        r0.add(m48583a("com.google.android.gms.icing.GlobalSearchAppRegistered3", new com.google.android.gms.appdatasearch.GlobalSearchApplication(r1, mo32467a(r1.f9563b), mo32477f())));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0103, code lost:
        r10 = new android.content.Intent("com.google.android.gms.icing.GlobalSearchableAppUnRegistered");
        r10.setPackage("com.google.android.googlequicksearchbox");
        r10.putExtra("AppPackageName", r9.f58761b);
        r0.add(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0119, code lost:
        r10 = r0.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x011d, code lost:
        if (r2 >= r10) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x011f, code lost:
        r1 = (android.content.Intent) r0.get(r2);
        r1.setPackage("com.google.android.googlequicksearchbox");
        r4 = java.lang.String.valueOf(r1);
        r6 = new java.lang.StringBuilder(java.lang.String.valueOf(r4).length() + 16);
        r6.append("Sending intent: ");
        r6.append(r4);
        p000.absg.m48184a(r6.toString());
        r9.f58762c.f58768b.sendBroadcast(r1);
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0155, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo32465a(Set set) {
        absg.m48185a("setGlobalSearchInfoForGmsCore gsaiSet of size:%d", Integer.valueOf(set.size()));
        synchronized (this.f58763d.f60625g) {
            if (!sdg.m34949a(this.f58763d.mo33037i(), set)) {
                absg.m48184a("setGlobalSearchInfoForGmsCore gsai changed");
                int i = 0;
                if (!set.isEmpty()) {
                    acrl acrl = this.f58763d;
                    synchronized (acrl.f60625g) {
                        bxvd da = abuk.f58408d.mo74144da();
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            abtd a = acky.m49356a((GlobalSearchApplicationInfo) it.next());
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            abuk abuk = (abuk) da.f164949b;
                            a.getClass();
                            if (!abuk.f58410a.mo73666a()) {
                                abuk.f58410a = GeneratedMessageLite.m124021a(abuk.f58410a);
                            }
                            abuk.f58410a.add(a);
                            abtf abtf = abtf.UNSET;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            abuk abuk2 = (abuk) da.f164949b;
                            abtf.getClass();
                            abuk2.mo32348a();
                            abuk2.f58411b.mo74153d(abtf.f58217d);
                        }
                        abuk abuk3 = (abuk) da.mo74062i();
                        acrl.mo33018a(abuk3);
                        acrl.f60622d = abuk3;
                    }
                } else {
                    acrl acrl2 = this.f58763d;
                    synchronized (acrl2.f60625g) {
                        acrl2.mo33018a((abuk) null);
                        acrl2.f60622d = null;
                    }
                }
            } else {
                absg.m48184a("setGlobalSearchInfoForGmsCore gsai unchanged");
            }
        }
    }

    /* renamed from: b */
    public final boolean mo32473b(acak acak) {
        boolean contains;
        synchronized (this.f58764e) {
            contains = this.f58765f.contains(acak);
        }
        return contains;
    }

    /* renamed from: a */
    public final boolean mo32466a(long j) {
        boolean z;
        acrl acrl = this.f58763d;
        String str = this.f58761b;
        synchronized (acrl.f60625g) {
            abul c = acrl.mo33025c(str);
            if (c != null) {
                z = (c.f58414a & 4) != 0;
            } else {
                z = false;
            }
        }
        if (z) {
            return true;
        }
        try {
            ApplicationInfo applicationInfo = this.f58762c.f58769c.getApplicationInfo(this.f58761b, 0);
            try {
                mo32463a(abzr.m48712a(new GlobalSearchApplicationInfo(this.f58761b, null, applicationInfo.labelRes, 0, applicationInfo.icon, null, null, null), j));
            } catch (acaq e) {
                absg.m48206e("Implicit gsai conflict with explicit for %s", this.f58761b);
            }
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            absg.m48206e("Could not find app %s", this.f58761b);
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo32467a(String str) {
        return this.f58763d.mo33042m(str) != abtf.DISABLED;
    }

    /* renamed from: a */
    public final boolean mo32468a(String str, boolean z) {
        if (!"com.google.android.gms".equals(this.f58761b)) {
            return mo32469a(z);
        }
        if (f58760a.containsKey(str)) {
            str = (String) f58760a.get(str);
        }
        return mo32467a(str);
    }

    /* renamed from: a */
    public final boolean mo32469a(boolean z) {
        abtf l = this.f58763d.mo33041l(this.f58761b);
        return (z || mo32480i()) ? l != abtf.DISABLED : l == abtf.ENABLED;
    }
}
