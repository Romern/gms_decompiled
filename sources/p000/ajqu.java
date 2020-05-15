package p000;

import android.view.View;
import com.google.android.gms.nearby.sharing.SetupChimeraActivity;

/* renamed from: ajqu */
public final /* synthetic */ class ajqu implements View.OnClickListener {

    /* renamed from: a */
    private final SetupChimeraActivity f71165a;

    public ajqu(SetupChimeraActivity setupChimeraActivity) {
        this.f71165a = setupChimeraActivity;
    }

    public void onClick(View view) {
        SetupChimeraActivity setupChimeraActivity = this.f71165a;
        if (setupChimeraActivity.f80982m == 0) {
            setupChimeraActivity.mo44475h();
        } else if (!cfov.m142031G()) {
            setupChimeraActivity.mo44475h();
        } else {
            setupChimeraActivity.f70615c.mo38893G().mo50382b(new ajqv(setupChimeraActivity)).mo50371a(new ajqr(setupChimeraActivity));
        }
    }
}
