package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;

/* renamed from: art */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class art {
    /* renamed from: a */
    static void m1916a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        int i = Build.VERSION.SDK_INT;
        animator.addPauseListener(animatorListenerAdapter);
    }
}
