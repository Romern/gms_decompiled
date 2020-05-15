package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: aonc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aonc extends aoni {

    /* renamed from: b */
    private static PropertyValuesHolder f78563b;

    /* renamed from: a */
    public boolean f78564a;

    /* renamed from: a */
    private static Animator m66131a(View view, long j) {
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, f78563b);
        ofPropertyValuesHolder.setDuration(467L);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.SCALE_X, 0.0f, 1.0f);
        ofFloat.setDuration(500L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.SCALE_Y, 0.0f, 1.0f);
        ofFloat2.setDuration(500L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofPropertyValuesHolder, ofFloat, ofFloat2);
        animatorSet.setStartDelay(j);
        return animatorSet;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = Build.VERSION.SDK_INT;
        setStyle(1, getTheme());
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        int i = Build.VERSION.SDK_INT;
        return super.mo43091a(bundle);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = Build.VERSION.SDK_INT;
        View inflate = LayoutInflater.from(getActivity()).inflate((int) C0126R.C0128layout.animated_progress_dialog_fragment, (ViewGroup) null);
        ((TextView) inflate.findViewById(C0126R.C0129id.animated_progress_message)).setText(getArguments().getString("message"));
        View findViewById = inflate.findViewById(C0126R.C0129id.animated_progress_circle_1);
        View findViewById2 = inflate.findViewById(C0126R.C0129id.animated_progress_circle_2);
        View findViewById3 = inflate.findViewById(C0126R.C0129id.animated_progress_circle_3);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(m66131a(findViewById, 0), m66131a(findViewById2, 267), m66131a(findViewById3, 534));
        animatorSet.addListener(new aonb(this));
        animatorSet.start();
        return inflate;
    }

    /* renamed from: a */
    public static aoni m66132a(String str) {
        int i = Build.VERSION.SDK_INT;
        if (f78563b == null) {
            f78563b = PropertyValuesHolder.ofKeyframe(View.ALPHA, Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.36f, 1.0f), Keyframe.ofFloat(0.57f, 1.0f), Keyframe.ofFloat(1.0f, 0.0f));
        }
        Bundle bundle = new Bundle();
        bundle.putString("message", str);
        bundle.putBoolean("cancelable", true);
        aonc aonc = new aonc();
        aonc.setArguments(bundle);
        return aonc;
    }
}
