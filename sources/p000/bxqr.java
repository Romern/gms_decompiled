package p000;

/* renamed from: bxqr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxqr implements bruo {

    /* renamed from: a */
    public static final bdgg f164411a = bdgg.m90734a("footprints.oneplatform.FootprintsService.");

    /* renamed from: b */
    public static final brum f164412b = new bxql();

    /* renamed from: c */
    public static final brum f164413c = new bxqm();

    /* renamed from: d */
    public static final brum f164414d = new bxqn();

    /* renamed from: e */
    public static final brum f164415e = new bxqo();

    /* renamed from: f */
    public static final brum f164416f = new bxqp();

    /* renamed from: g */
    public static final brum f164417g = new bxqq();

    /* renamed from: h */
    public static final bxqr f164418h = new bxqr();

    /* renamed from: j */
    private static final bdgg f164419j = bdgg.m90734a("footprints.oneplatform.FootprintsService/");

    /* renamed from: l */
    private static final bdgg f164420l = bdgg.m90734a("footprints-pa.googleapis.com");

    /* renamed from: i */
    public final bnic f164421i = bnic.m109500j().mo67751a();

    /* renamed from: k */
    private final bnhe f164422k;

    static {
        bdgg.m90734a("footprints.oneplatform.FootprintsService");
    }

    private bxqr() {
        bngs j = bngx.m109377j();
        j.mo67668c("autopush-footprints-pa.sandbox.googleapis.com");
        j.mo67668c("autopushsearchqual-footprints-pa.sandbox.googleapis.com");
        j.mo67668c("staging-footprints-pa.sandbox.googleapis.com");
        j.mo67668c("footprints-pa.googleapis.com");
        j.mo67664a();
        bnic.m109494a(f164412b, f164413c, f164414d, f164415e, f164416f, f164417g, new brum[0]);
        bnha h = bnhe.m109414h();
        h.mo67695b("Read", f164412b);
        h.mo67695b("Write", f164413c);
        h.mo67695b("GetActivityControlsSettings", f164414d);
        h.mo67695b("UpdateActivityControlsSettings", f164415e);
        h.mo67695b("GetSettingText", f164416f);
        h.mo67695b("GetDeletions", f164417g);
        this.f164422k = h.mo67618b();
        bnhe.m109414h().mo67618b();
    }

    /* renamed from: a */
    public final bdgg mo69987a() {
        return f164420l;
    }

    /* renamed from: b */
    public final String mo69989b() {
        return null;
    }

    /* renamed from: a */
    public final brum mo69988a(String str) {
        String str2 = f164419j.f105583a;
        if (!str.startsWith(str2)) {
            return null;
        }
        String substring = str.substring(str2.length());
        if (this.f164422k.containsKey(substring)) {
            return (brum) this.f164422k.get(substring);
        }
        return null;
    }
}
