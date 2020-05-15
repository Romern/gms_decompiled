package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bhdp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhdp {

    /* renamed from: a */
    private final C1245ok f118336a = new C1245ok();

    /* renamed from: b */
    private final C1245ok f118337b = new C1245ok();

    /* renamed from: a */
    public static bhdp m100679a(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return m100681a(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m100681a(arrayList);
        } catch (Exception e) {
            String valueOf = String.valueOf(Integer.toHexString(i));
            Log.w("MotionSpec", valueOf.length() == 0 ? new String("Can't load animation resource ID #0x") : "Can't load animation resource ID #0x".concat(valueOf), e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bhdp) {
            return this.f118336a.equals(((bhdp) obj).f118336a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f118336a.hashCode();
    }

    public final String toString() {
        return 10 + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f118336a + "}\n";
    }

    /* renamed from: a */
    public static bhdp m100680a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return m100679a(context, resourceId);
    }

    /* renamed from: a */
    private static bhdp m100681a(List list) {
        bhdp bhdp = new bhdp();
        int size = list.size();
        int i = 0;
        while (i < size) {
            Animator animator = (Animator) list.get(i);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                bhdp.f118337b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                    interpolator = bhdl.f118328b;
                } else if (interpolator instanceof AccelerateInterpolator) {
                    interpolator = bhdl.f118329c;
                } else if (interpolator instanceof DecelerateInterpolator) {
                    interpolator = bhdl.f118330d;
                }
                bhdq bhdq = new bhdq(startDelay, duration, interpolator);
                bhdq.f118338a = objectAnimator.getRepeatCount();
                bhdq.f118339b = objectAnimator.getRepeatMode();
                bhdp.f118336a.put(propertyName, bhdq);
                i++;
            } else {
                String valueOf = String.valueOf(animator);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                sb.append("Animator must be an ObjectAnimator: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return bhdp;
    }

    /* renamed from: a */
    public final bhdq mo63572a(String str) {
        if (this.f118336a.get(str) != null) {
            return (bhdq) this.f118336a.get(str);
        }
        throw new IllegalArgumentException();
    }
}
