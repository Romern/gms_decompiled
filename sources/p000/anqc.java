package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.gms.plus.audience.AudienceSelectionScrollView;

/* renamed from: anqc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class anqc extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ anqe f77430a;

    protected anqc(anqe anqe) {
        this.f77430a = anqe;
    }

    public void onAnimationEnd(Animator animator) {
        anqe anqe = this.f77430a;
        AudienceSelectionScrollView audienceSelectionScrollView = anqe.f77435h;
        audienceSelectionScrollView.f82292a = anqe;
        audienceSelectionScrollView.setVisibility(8);
        anqe.f77443p = false;
    }
}
