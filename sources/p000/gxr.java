package p000;

import android.os.CountDownTimer;

/* renamed from: gxr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class gxr extends CountDownTimer {

    /* renamed from: a */
    final /* synthetic */ gxt f19184a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gxr(gxt gxt, long j) {
        super(j, 100);
        this.f19184a = gxt;
    }

    public final void onFinish() {
        this.f19184a.f19191f.mo12357a(1);
    }

    public final void onTick(long j) {
    }
}
