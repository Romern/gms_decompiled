package p000;

import android.animation.Animator;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.sharing.animation.FadeTransition;

/* renamed from: ajvn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajvn extends ajvi {

    /* renamed from: a */
    final /* synthetic */ View f71369a;

    /* renamed from: b */
    final /* synthetic */ FadeTransition f71370b;

    public ajvn(FadeTransition fadeTransition, View view) {
        this.f71370b = fadeTransition;
        this.f71369a = view;
    }

    public final void onAnimationEnd(Animator animator) {
        View view = this.f71369a;
        int i = FadeTransition.f81065b;
        view.setTag(C0126R.C0129id.root, Boolean.valueOf(this.f71370b.f81067a == 2));
    }

    public final void onAnimationStart(Animator animator) {
        View view = this.f71369a;
        int i = FadeTransition.f81065b;
        view.setTag(C0126R.C0129id.root, true);
    }
}
