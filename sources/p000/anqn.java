package p000;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.felicanetworks.mfc.C0126R;

/* renamed from: anqn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anqn implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ anqt f77457a;

    /* renamed from: b */
    private final boolean f77458b;

    public anqn(anqt anqt, boolean z) {
        this.f77457a = anqt;
        this.f77458b = z;
    }

    public void onClick(View view) {
        String str;
        anqt anqt = this.f77457a;
        if (this.f77458b) {
            str = anqt.f77468c.getText().toString();
        } else {
            str = null;
        }
        anqt.getActivity().overridePendingTransition(0, 0);
        Animation loadAnimation = AnimationUtils.loadAnimation(anqt.getActivity().getApplicationContext(), C0126R.anim.circle_creation_dialog_slide_down);
        loadAnimation.setAnimationListener(new anqp(anqt, str));
        anqt.f77466a.startAnimation(loadAnimation);
    }
}
