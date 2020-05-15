package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity;

/* renamed from: atoe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atoe extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ TapUiChimeraActivity f90585a;

    public atoe(TapUiChimeraActivity tapUiChimeraActivity) {
        this.f90585a = tapUiChimeraActivity;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f90585a.mo59423j();
        TapUiChimeraActivity tapUiChimeraActivity = this.f90585a;
        srn srn = TapUiChimeraActivity.f108685b;
        tapUiChimeraActivity.f108731x.mo4054b(this);
    }
}
