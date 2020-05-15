package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.p097ui.expander.SummaryExpanderWrapper;

/* renamed from: bkit */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkit extends auc {
    /* renamed from: a */
    private static final void m105861a(View view, Animator animator) {
        animator.addListener(new bkis(view));
    }

    /* renamed from: b */
    public final Animator mo2520b(ViewGroup viewGroup, atq atq, int i, atq atq2, int i2) {
        View b;
        int visibility;
        int i3 = Build.VERSION.SDK_INT;
        Animator b2 = super.mo2520b(viewGroup, atq, i, atq2, i2);
        if (!(b2 == null || atq2 == null)) {
            View view = atq2.f2216b;
            if (!(!(view instanceof bkdd) || (b = ((bkdd) view).mo65860b()) == null || (visibility = b.getVisibility()) == 0)) {
                b.setVisibility(0);
                b2.addListener(new bkir(b, visibility));
            }
        }
        return b2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004f A[ADDED_TO_REGION] */
    /* renamed from: a */
    public final Animator mo2385a(ViewGroup viewGroup, View view, atq atq) {
        char c;
        String str = (String) view.getTag(C0126R.C0129id.summary_expander_transition_name);
        if (str == null) {
            return null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        int hashCode = str.hashCode();
        if (hashCode != 1069289409) {
            if (hashCode != 1271870320) {
                if (hashCode == 1662640372 && str.equals("summaryField")) {
                    c = 1;
                    if (c != 0 || c == 1) {
                        m105861a(view, ofFloat);
                        return ofFloat;
                    } else if (c != 2) {
                        return null;
                    } else {
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(view, "y", (float) view.getTop(), 0.0f));
                        animatorSet.setInterpolator(this.f2175c);
                        animatorSet.setDuration(this.f2174b);
                        m105861a(view, animatorSet);
                        return animatorSet;
                    }
                }
            } else if (str.equals("optionViewComponents")) {
                c = 0;
                if (c != 0) {
                }
                m105861a(view, ofFloat);
                return ofFloat;
            }
        } else if (str.equals("expandedField")) {
            c = 2;
            if (c != 0) {
            }
            m105861a(view, ofFloat);
            return ofFloat;
        }
        c = 65535;
        if (c != 0) {
        }
        m105861a(view, ofFloat);
        return ofFloat;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004f A[ADDED_TO_REGION] */
    /* renamed from: a */
    public final Animator mo2386a(ViewGroup viewGroup, View view, atq atq, atq atq2) {
        char c;
        String str = (String) view.getTag(C0126R.C0129id.summary_expander_transition_name);
        if (str == null) {
            return null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        int hashCode = str.hashCode();
        if (hashCode != 1069289409) {
            if (hashCode != 1271870320) {
                if (hashCode == 1662640372 && str.equals("summaryField")) {
                    c = 1;
                    if (c != 0 || c == 1) {
                        return ofFloat;
                    }
                    if (c != 2) {
                        return null;
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    float[] fArr = new float[2];
                    ViewParent parent = view.getParent();
                    int i = 0;
                    while (true) {
                        if (parent instanceof View) {
                            if (parent instanceof SummaryExpanderWrapper) {
                                break;
                            }
                            i -= ((View) parent).getTop();
                            parent = parent.getParent();
                        } else {
                            i = 0;
                            break;
                        }
                    }
                    fArr[0] = (float) i;
                    fArr[1] = (float) view.getTop();
                    animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(view, "y", fArr));
                    animatorSet.setInterpolator(this.f2175c);
                    animatorSet.setDuration(this.f2174b);
                    return animatorSet;
                }
            } else if (str.equals("optionViewComponents")) {
                c = 0;
                if (c != 0) {
                }
                return ofFloat;
            }
        } else if (str.equals("expandedField")) {
            c = 2;
            if (c != 0) {
            }
            return ofFloat;
        }
        c = 65535;
        if (c != 0) {
        }
        return ofFloat;
    }

    /* renamed from: a */
    public final Animator mo2519a(ViewGroup viewGroup, atq atq, int i, atq atq2, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        return super.mo2519a(viewGroup, atq, i, atq2, i2);
    }
}
