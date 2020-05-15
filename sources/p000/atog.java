package p000;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity;

/* renamed from: atog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atog extends auh {

    /* renamed from: b */
    final /* synthetic */ TapUiChimeraActivity f90587b;

    public atog(TapUiChimeraActivity tapUiChimeraActivity) {
        this.f90587b = tapUiChimeraActivity;
    }

    /* renamed from: a */
    public final void mo2525a(Drawable drawable) {
        Animatable animatable = (Animatable) drawable;
        adzt adzt = this.f90587b.f108693D;
        animatable.getClass();
        adzt.post(new atof(animatable));
    }
}
