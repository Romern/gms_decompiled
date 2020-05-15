package p000;

import android.os.CountDownTimer;

/* renamed from: bjmg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjmg extends CountDownTimer {

    /* renamed from: a */
    final /* synthetic */ bjmh f122963a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bjmg(bjmh bjmh, long j) {
        super(j, 1000);
        this.f122963a = bjmh;
    }

    public final void onFinish() {
        ((bjmi) ((bjhy) this.f122963a).f122754m).mo65377a(0L);
        this.f122963a.mo65121g();
        this.f122963a.mo65255r();
    }

    public final void onTick(long j) {
        ((bjmi) ((bjhy) this.f122963a).f122754m).mo65377a(j);
        this.f122963a.mo65121g();
        this.f122963a.mo65105a(bwpv.f160605c, 1);
    }
}
