package p000;

import android.animation.Animator;
import android.content.Intent;
import com.google.android.gms.plus.audience.UpdateCirclesChimeraActivity;

/* renamed from: anra */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anra extends anqc {

    /* renamed from: b */
    final /* synthetic */ Intent f77485b;

    /* renamed from: c */
    final /* synthetic */ UpdateCirclesChimeraActivity f77486c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public anra(UpdateCirclesChimeraActivity updateCirclesChimeraActivity, Intent intent) {
        super(updateCirclesChimeraActivity);
        this.f77486c = updateCirclesChimeraActivity;
        this.f77485b = intent;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f77486c.startActivityForResult(this.f77485b, 1);
    }
}
