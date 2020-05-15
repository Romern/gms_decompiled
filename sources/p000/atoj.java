package p000;

import com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity;

/* renamed from: atoj */
final /* synthetic */ class atoj implements Runnable {

    /* renamed from: a */
    private final atok f90590a;

    public atoj(atok atok) {
        this.f90590a = atok;
    }

    public final void run() {
        atok atok = this.f90590a;
        TapUiChimeraActivity tapUiChimeraActivity = atok.f90591a;
        srn srn = TapUiChimeraActivity.f108685b;
        tapUiChimeraActivity.m93146a(true, tapUiChimeraActivity.f108721n).start();
        TapUiChimeraActivity tapUiChimeraActivity2 = atok.f90591a;
        tapUiChimeraActivity2.f108717i = true;
        tapUiChimeraActivity2.mo59424l();
    }
}
