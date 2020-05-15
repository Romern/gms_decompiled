package p000;

import android.animation.AnimatorSet;
import com.google.android.libraries.material.internal.ClippableRoundedCornerLayout;

/* renamed from: azyf */
public final /* synthetic */ class azyf implements Runnable {

    /* renamed from: a */
    private final azyn f100192a;

    public azyf(azyn azyn) {
        this.f100192a = azyn;
    }

    public final void run() {
        azyn azyn = this.f100192a;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = azyn.f100204c;
        clippableRoundedCornerLayout.setTranslationY((float) clippableRoundedCornerLayout.getHeight());
        AnimatorSet a = azyn.mo55407a(true);
        a.addListener(new azyk(azyn));
        a.start();
    }
}
