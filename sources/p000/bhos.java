package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: bhos */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhos extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ bhou f119206a;

    public bhos(bhou bhou) {
        this.f119206a = bhou;
    }

    public final void onAnimationEnd(Animator animator) {
        bhou bhou = this.f119206a;
        CheckableImageButton checkableImageButton = bhou.f119222m;
        int i = bhou.f119208j;
        checkableImageButton.setChecked(bhou.f119212d);
        this.f119206a.f119217i.start();
    }
}
