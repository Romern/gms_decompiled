package p000;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: adtn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class adtn extends auh {

    /* renamed from: b */
    final /* synthetic */ adto f62719b;

    public adtn(adto adto) {
        this.f62719b = adto;
    }

    /* renamed from: a */
    public final void mo2525a(Drawable drawable) {
        if (this.f62719b.f62720a.mo33823a()) {
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
