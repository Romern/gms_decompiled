package p000;

/* renamed from: bgdw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgdw {

    /* renamed from: a */
    public final bgmk f116185a;

    /* renamed from: b */
    public bube f116186b = null;

    /* renamed from: c */
    private final bgmm f116187c;

    /* renamed from: d */
    private final bgns f116188d;

    /* renamed from: e */
    private final bgml f116189e;

    /* renamed from: f */
    private boolean f116190f = false;

    /* renamed from: g */
    private final bfdd f116191g;

    public bgdw(bfdd bfdd, bgmk bgmk, bgmm bgmm, bgns bgns, bgml bgml) {
        this.f116191g = bfdd;
        this.f116185a = bgmk;
        this.f116187c = bgmm;
        this.f116188d = bgns;
        this.f116189e = bgml;
        if (bgmk != null && bgmm != null && bgns != null && bgml != null && m98676b()) {
            this.f116186b = new bube(bubi.m119293a(bgmk, bgml.mo63006b()));
            this.f116190f = true;
        }
    }

    /* renamed from: b */
    private static boolean m98676b() {
        return (cetv.f183429a.mo80018b().cellFingerprintConfig() & 1) != 0;
    }

    /* renamed from: a */
    public final bfni mo62692a(bfmn bfmn, long j) {
        return this.f116191g.mo61455a(bfmn.mo61934a(), j);
    }

    /* renamed from: a */
    public final boolean mo62693a() {
        bgmk bgmk;
        bgml bgml;
        if (m98676b() && this.f116186b == null && (bgmk = this.f116185a) != null && this.f116187c != null && this.f116188d != null && (bgml = this.f116189e) != null) {
            this.f116186b = new bube(bubi.m119293a(bgmk, bgml.mo63006b()));
        } else if (!m98676b() && this.f116186b != null) {
            this.f116186b = null;
        }
        return this.f116186b != null && m98676b() && this.f116190f;
    }
}
