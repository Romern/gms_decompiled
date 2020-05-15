package p000;

import android.view.ViewGroup;
import com.google.android.gms.nearby.sharing.animation.FadeTransition;

/* renamed from: ajgz */
final /* synthetic */ class ajgz implements Runnable {

    /* renamed from: a */
    private final ajhe f70608a;

    public ajgz(ajhe ajhe) {
        this.f70608a = ajhe;
    }

    public final void run() {
        ajhe ajhe = this.f70608a;
        ajhe.f70619g = false;
        if (FadeTransition.m67605a(ajhe.f70616d)) {
            ajhe.f70616d.setVisibility(0);
            ajhe.f70617e.getLayoutParams().height = -2;
            ajhe.getWindow().getDecorView().setSystemUiVisibility(1280);
            FadeTransition fadeTransition = new FadeTransition(ajhe);
            fadeTransition.f81067a = 1;
            fadeTransition.setDuration(1);
            ViewGroup viewGroup = (ViewGroup) ajhe.findViewById(16908290);
            ajhe.m58699a(viewGroup, viewGroup, fadeTransition);
        }
        ajhe.mo38633e();
        ajhe.f70620h = null;
    }
}
