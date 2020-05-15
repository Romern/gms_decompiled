package p000;

import com.google.android.gms.tapandpay.tap.TapKeyguardChimeraActivity;

/* renamed from: atmy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atmy implements Runnable {

    /* renamed from: a */
    final /* synthetic */ TapKeyguardChimeraActivity f90521a;

    public atmy(TapKeyguardChimeraActivity tapKeyguardChimeraActivity) {
        this.f90521a = tapKeyguardChimeraActivity;
    }

    public final void run() {
        if (!this.f90521a.isFinishing()) {
            this.f90521a.finish();
        }
    }
}
