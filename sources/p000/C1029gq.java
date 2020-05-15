package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.felicanetworks.mfc.C0126R;

/* renamed from: gq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1029gq {
    /* renamed from: a */
    static C1027go m13697a(Context context, C1018gh ghVar, boolean z) {
        int i;
        C1015ge geVar = ghVar.f18177N;
        int i2 = geVar != null ? geVar.f17995d : 0;
        int e = ghVar.mo11821e();
        ghVar.mo11811a(0);
        ViewGroup viewGroup = ghVar.f18173J;
        if (!(viewGroup == null || viewGroup.getTag(C0126R.C0129id.visible_removing_fragment_view_tag) == null)) {
            ghVar.f18173J.setTag(C0126R.C0129id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = ghVar.f18173J;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = ghVar.onCreateAnimation(i2, z, e);
        if (onCreateAnimation != null) {
            return new C1027go(onCreateAnimation);
        }
        Animator onCreateAnimator = ghVar.onCreateAnimator(i2, z, e);
        if (onCreateAnimator != null) {
            return new C1027go(onCreateAnimator);
        }
        if (e != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(e));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, e);
                    if (loadAnimation != null) {
                        return new C1027go(loadAnimation);
                    }
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException e3) {
                }
            }
            try {
                Animator loadAnimator = AnimatorInflater.loadAnimator(context, e);
                if (loadAnimator != null) {
                    return new C1027go(loadAnimator);
                }
            } catch (RuntimeException e4) {
                if (!equals) {
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(context, e);
                    if (loadAnimation2 != null) {
                        return new C1027go(loadAnimation2);
                    }
                } else {
                    throw e4;
                }
            }
        }
        if (i2 != 0) {
            if (i2 != 4097) {
                i = i2 != 4099 ? i2 != 8194 ? -1 : z ? C0126R.anim.fragment_close_enter : C0126R.anim.fragment_close_exit : z ? C0126R.anim.fragment_fade_enter : C0126R.anim.fragment_fade_exit;
            } else {
                i = z ? C0126R.anim.fragment_open_enter : C0126R.anim.fragment_open_exit;
            }
            if (i >= 0) {
                return new C1027go(AnimationUtils.loadAnimation(context, i));
            }
        }
        return null;
    }
}
