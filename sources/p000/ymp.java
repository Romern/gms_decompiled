package p000;

/* renamed from: ymp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ymp extends ylm {

    /* renamed from: a */
    public String f54099a;

    /* renamed from: b */
    public String f54100b;

    /* renamed from: c */
    public String f54101c;

    /* renamed from: d */
    public String f54102d;

    /* renamed from: e */
    public ymt f54103e;

    /* renamed from: f */
    public long f54104f;

    /* renamed from: g */
    public boolean f54105g;

    public ymp() {
    }

    public ymp(char[] cArr) {
        this();
        this.f54099a = "user_input";
        this.f54101c = "overlay_explicit_input";
    }

    /* renamed from: a */
    protected static final ygd m44373a(String str) {
        ygd b = ygv.m44057b(str);
        if ("user_input".equals(str)) {
            return b;
        }
        return ygv.m44053a(b, ygv.f53771a);
    }

    /* renamed from: a */
    public final yha mo30553a() {
        ygy ygy = new ygy("com.google.calories.bmr");
        ygy.f53795j = 1;
        ygy ygy2 = new ygy("com.google.weight");
        ygy2.f53795j = 1;
        yha yha = new yha(bngx.m109359a(ygy, ygy2, new ygy("com.google.activity.segment"), new ygy("com.google.distance.delta")));
        yha.mo30484a("com.google.calories.bmr", yhc.m44077a(m44373a(this.f54100b), this.f54040r));
        yha.mo30484a("com.google.weight", yhc.m44077a(m44373a(this.f54102d), ynn.LOCAL_AND_REMOTE));
        yha.mo30484a("com.google.activity.segment", yhc.m44077a(m44373a(this.f54099a), this.f54040r));
        yha.mo30484a("com.google.distance.delta", yhc.m44077a(m44373a(this.f54101c), this.f54040r));
        return yha;
    }

    public ymp(byte[] bArr) {
        this();
        this.f54099a = "merge_activity_segments";
        this.f54101c = "merge_distance_delta";
    }
}
