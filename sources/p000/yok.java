package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: yok */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yok extends ylm {

    /* renamed from: a */
    public String f54273a;

    /* renamed from: b */
    public boolean f54274b;

    public yok() {
        this.f54040r = ynn.LOCAL_AND_REMOTE;
    }

    /* renamed from: a */
    public final yha mo30553a() {
        ygy ygy = new ygy("com.google.internal.goal");
        ygy.mo30476a(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        ygy.f53795j = 1;
        yha yha = new yha(bngx.m109356a(ygy));
        yha.mo30484a("com.google.internal.goal", yhc.m44077a(new yoj(this), ynn.LOCAL_AND_REMOTE));
        return yha;
    }
}
