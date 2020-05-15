package p000;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: adtt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class adtt extends auh {

    /* renamed from: b */
    final /* synthetic */ adtu f62725b;

    public adtt(adtu adtu) {
        this.f62725b = adtu;
    }

    /* renamed from: a */
    public final void mo2525a(Drawable drawable) {
        if (this.f62725b.f62726a.mo33823a()) {
            Animatable animatable = (Animatable) drawable;
            if (!ceqp.m137998b()) {
                animatable.start();
                return;
            }
            int i = Build.VERSION.SDK_INT;
            animatable.start();
        }
    }
}
