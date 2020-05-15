package p000;

import android.content.Intent;
import com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity;

/* renamed from: atnj */
public final /* synthetic */ class atnj implements Runnable {

    /* renamed from: a */
    private final TapUiChimeraActivity f90556a;

    /* renamed from: b */
    private final Intent f90557b;

    public atnj(TapUiChimeraActivity tapUiChimeraActivity, Intent intent) {
        this.f90556a = tapUiChimeraActivity;
        this.f90557b = intent;
    }

    public final void run() {
        TapUiChimeraActivity tapUiChimeraActivity = this.f90556a;
        tapUiChimeraActivity.startActivity(this.f90557b);
        tapUiChimeraActivity.finish();
    }
}
