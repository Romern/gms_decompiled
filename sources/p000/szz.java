package p000;

import android.view.View;
import com.google.android.gms.constellation.p038ui.ApiConsentChimeraActivity;

/* renamed from: szz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class szz implements View.OnClickListener {

    /* renamed from: a */
    public final boolean f45539a;

    /* renamed from: b */
    public final int f45540b;

    /* renamed from: c */
    final /* synthetic */ ApiConsentChimeraActivity f45541c;

    public szz(ApiConsentChimeraActivity apiConsentChimeraActivity, boolean z) {
        this.f45541c = apiConsentChimeraActivity;
        this.f45539a = z;
        this.f45540b = !z ? 2 : 1;
    }

    public void onClick(View view) {
        if (this.f45541c.mo17975b()) {
            this.f45541c.f30515g.setVisibility(0);
            new szy(this).start();
            return;
        }
        this.f45541c.f30512d = 6;
    }
}
