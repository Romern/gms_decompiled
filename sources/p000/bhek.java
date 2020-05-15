package p000;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;
import com.felicanetworks.mfc.C0126R;

/* renamed from: bhek */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhek {

    /* renamed from: a */
    public static final int[] f118387a = {16843848};

    /* renamed from: a */
    public static void m100715a(View view, float f) {
        int integer = view.getResources().getInteger(C0126R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = (long) integer;
        stateListAnimator.addState(new int[]{16842766, C0126R.attr.state_liftable, -2130970269}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(view, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }
}
