package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: yqc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yqc extends ylm {

    /* renamed from: a */
    public String f54374a;

    /* renamed from: b */
    public String f54375b;

    /* renamed from: c */
    public ypv f54376c;

    /* renamed from: a */
    public final yha mo30553a() {
        ygy ygy = new ygy("com.google.step_count.delta");
        ygy.mo30478b(1, TimeUnit.HOURS);
        ygy.mo30480c(1, TimeUnit.HOURS);
        ygy ygy2 = new ygy("com.google.activity.segment");
        ygy2.mo30478b(1, TimeUnit.HOURS);
        ygy2.mo30480c(1, TimeUnit.HOURS);
        yha yha = new yha(bngx.m109357a(ygy, ygy2));
        yha.mo30484a("com.google.step_count.delta", yhc.m44077a(ygv.m44052a(this.f54374a), this.f54040r));
        yha.mo30484a("com.google.activity.segment", yhc.m44077a(ygv.m44052a(this.f54375b), this.f54040r));
        return yha;
    }
}
