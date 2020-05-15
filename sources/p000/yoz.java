package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: yoz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yoz extends ylm {

    /* renamed from: a */
    public float f54310a;

    /* renamed from: b */
    public float f54311b;

    /* renamed from: c */
    public long f54312c;

    /* renamed from: d */
    public long f54313d;

    /* renamed from: e */
    public yoy f54314e;

    /* renamed from: a */
    public final yha mo30553a() {
        ygy ygy = new ygy("com.google.heart_rate.bpm");
        ygy.mo30480c(this.f54312c, TimeUnit.MINUTES);
        yha yha = new yha(bngx.m109356a(ygy));
        yha.mo30484a("com.google.heart_rate.bpm", yhc.m44077a(ygv.m44057b("merge_heart_rate_bpm"), this.f54040r));
        return yha;
    }
}
