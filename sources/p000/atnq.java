package p000;

import android.view.View;
import com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity;

/* renamed from: atnq */
public final /* synthetic */ class atnq implements View.OnClickListener {

    /* renamed from: a */
    private final Runnable f90566a;

    public atnq(Runnable runnable) {
        this.f90566a = runnable;
    }

    public void onClick(View view) {
        Runnable runnable = this.f90566a;
        srn srn = TapUiChimeraActivity.f108685b;
        runnable.run();
    }
}
