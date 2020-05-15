package com.google.android.gms.nearby.sharing.animation;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FadeTransition extends Transition {

    /* renamed from: b */
    public static final /* synthetic */ int f81065b = 0;

    /* renamed from: c */
    private static final String[] f81066c = {"com.google.android.gms.nearby.sharing.animation:FadeTransition:alpha"};

    /* renamed from: a */
    public int f81067a;

    public FadeTransition(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public static boolean m67605a(View view) {
        Boolean bool = (Boolean) view.getTag(C0126R.C0129id.root);
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        boolean z = false;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            z = z || m67605a(viewGroup.getChildAt(i));
        }
        return z;
    }

    /* renamed from: b */
    private static boolean m67606b(View view) {
        if (view.getParent() == null || !(view.getParent() instanceof View)) {
            return false;
        }
        View view2 = (View) view.getParent();
        if (view2.getId() != C0126R.C0129id.root) {
            return m67606b(view2);
        }
        return true;
    }

    public final void captureEndValues(TransitionValues transitionValues) {
        int i = this.f81067a;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            transitionValues.values.put("com.google.android.gms.nearby.sharing.animation:FadeTransition:alpha", Float.valueOf(1.0f));
        } else if (i2 == 1) {
            transitionValues.values.put("com.google.android.gms.nearby.sharing.animation:FadeTransition:alpha", Float.valueOf(0.0f));
        }
    }

    public final void captureStartValues(TransitionValues transitionValues) {
        int i = this.f81067a;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            transitionValues.values.put("com.google.android.gms.nearby.sharing.animation:FadeTransition:alpha", Float.valueOf(0.0f));
        } else if (i2 == 1) {
            transitionValues.values.put("com.google.android.gms.nearby.sharing.animation:FadeTransition:alpha", Float.valueOf(1.0f));
        }
    }

    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        View view = transitionValues.view;
        if (view.getTransitionName() != null || !m67606b(view)) {
            return null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", ((Float) transitionValues.values.get("com.google.android.gms.nearby.sharing.animation:FadeTransition:alpha")).floatValue(), ((Float) transitionValues2.values.get("com.google.android.gms.nearby.sharing.animation:FadeTransition:alpha")).floatValue());
        ofFloat.addListener(new ajvn(this, view));
        return ofFloat;
    }

    public final String[] getTransitionProperties() {
        return f81066c;
    }

    public FadeTransition(Context context, AttributeSet attributeSet) {
        this.f81067a = 2;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eoi.f15394f, 0, 0);
            if (obtainStyledAttributes.hasValue(0)) {
                this.f81067a = new int[]{1, 2}[obtainStyledAttributes.getInt(0, 0)];
            }
            obtainStyledAttributes.recycle();
        }
    }
}
