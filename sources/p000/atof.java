package p000;

import android.graphics.drawable.Animatable;

/* renamed from: atof */
final /* synthetic */ class atof implements Runnable {

    /* renamed from: a */
    private final Animatable f90586a;

    public atof(Animatable animatable) {
        this.f90586a = animatable;
    }

    public final void run() {
        this.f90586a.start();
    }
}
