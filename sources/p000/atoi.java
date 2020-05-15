package p000;

import android.view.View;
import com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity;

/* renamed from: atoi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atoi implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ TapUiChimeraActivity f90589a;

    public atoi(TapUiChimeraActivity tapUiChimeraActivity) {
        this.f90589a = tapUiChimeraActivity;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f90589a.f108724q.removeOnLayoutChangeListener(this);
        TapUiChimeraActivity tapUiChimeraActivity = this.f90589a;
        tapUiChimeraActivity.m93146a(true, tapUiChimeraActivity.f108721n).start();
    }
}
