package p000;

/* renamed from: ymr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ymr extends ylm {

    /* renamed from: a */
    public String f54107a;

    /* renamed from: b */
    public String f54108b;

    /* renamed from: c */
    public ymt f54109c;

    /* renamed from: d */
    public float f54110d;

    /* renamed from: a */
    public final yha mo30553a() {
        ygy ygy = new ygy("com.google.height");
        ygy.f53795j = 1;
        ygy ygy2 = new ygy("com.google.weight");
        ygy2.f53795j = 1;
        yha yha = new yha(bngx.m109357a(ygy, ygy2));
        String str = this.f54107a;
        if (str != null) {
            yha.mo30484a("com.google.height", yhc.m44077a(ygv.m44052a(str), ynn.LOCAL_AND_REMOTE));
        }
        String str2 = this.f54108b;
        if (str2 != null) {
            yha.mo30484a("com.google.weight", yhc.m44077a(ygv.m44052a(str2), ynn.LOCAL_AND_REMOTE));
        }
        return yha;
    }
}
