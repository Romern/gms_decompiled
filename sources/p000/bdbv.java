package p000;

import java.io.File;
import java.util.Arrays;

/* renamed from: bdbv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdbv {

    /* renamed from: a */
    public final String f105294a;

    /* renamed from: b */
    public final File f105295b;

    /* renamed from: c */
    public final String f105296c;

    /* renamed from: d */
    public final bdbt f105297d;

    /* renamed from: e */
    public final bdch f105298e;

    /* renamed from: f */
    public final bnkd f105299f = bndu.m109109r();

    /* renamed from: g */
    final boolean f105300g;

    /* renamed from: h */
    final boolean f105301h;

    /* renamed from: i */
    int f105302i = 0;

    /* renamed from: j */
    public int f105303j;

    /* renamed from: k */
    public baxr f105304k = null;

    /* renamed from: l */
    private final bdce f105305l;

    /* renamed from: m */
    private boolean f105306m = false;

    /* renamed from: n */
    private bdbu f105307n = bdbu.WIFI_ONLY;

    public bdbv(bdce bdce, String str, File file, String str2, bdbt bdbt, bdch bdch) {
        this.f105294a = str;
        this.f105295b = file;
        this.f105296c = str2;
        this.f105297d = bdbt;
        this.f105305l = bdce;
        this.f105298e = bdch;
        this.f105300g = bdbp.m90542a(str);
        boolean a = m90550a(str);
        this.f105301h = a;
        if (a || this.f105300g) {
            this.f105307n = bdbu.NONE;
        }
    }

    /* renamed from: a */
    public static boolean m90550a(String str) {
        return str.startsWith("file:");
    }

    /* renamed from: a */
    public final synchronized bdbu mo57854a() {
        return this.f105307n;
    }

    /* renamed from: a */
    public final void mo57855a(bdbu bdbu) {
        if (!this.f105301h && !this.f105300g) {
            this.f105307n = bdbu;
        }
    }

    /* renamed from: b */
    public final synchronized boolean mo57856b() {
        return this.f105306m;
    }

    /* renamed from: c */
    public final void mo57857c() {
        this.f105305l.mo57868a(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo57858d() {
        this.f105306m = true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bdbv) {
            bdbv bdbv = (bdbv) obj;
            if (!bmxi.m108538a(this.f105294a, bdbv.f105294a) || !bmxi.m108538a(this.f105295b, bdbv.f105295b) || !bmxi.m108538a(this.f105296c, bdbv.f105296c) || !bmxi.m108538a(this.f105307n, bdbv.f105307n) || this.f105306m != bdbv.f105306m) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f105294a, this.f105295b, this.f105296c, this.f105307n, Boolean.valueOf(this.f105306m)});
    }

    public final String toString() {
        bmxt a = bmxu.m108562a(bdbv.class);
        a.mo66885a("", this.f105294a);
        a.mo66885a("targetDirectory", this.f105295b);
        a.mo66885a("fileName", this.f105296c);
        a.mo66885a("requiredConnectivity", this.f105307n);
        a.mo66886a("canceled", this.f105306m);
        return a.toString();
    }
}
