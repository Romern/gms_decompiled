package p000;

import android.text.style.ClickableSpan;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.sharing.ConsentsChimeraActivity;

/* renamed from: ajic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajic extends ClickableSpan {

    /* renamed from: a */
    final /* synthetic */ ajvr f70684a;

    /* renamed from: b */
    final /* synthetic */ ConsentsChimeraActivity f70685b;

    public ajic(ConsentsChimeraActivity consentsChimeraActivity, ajvr ajvr) {
        this.f70685b = consentsChimeraActivity;
        this.f70684a = ajvr;
    }

    public void onClick(View view) {
        ConsentsChimeraActivity consentsChimeraActivity = this.f70685b;
        ajvr ajvr = this.f70684a;
        bhia bhia = new bhia(consentsChimeraActivity);
        bhia.mo63788d(ajvr.f71375a);
        bhia.mo63783c(ajvr.f71378d);
        bhia.mo63784c(consentsChimeraActivity.getString(C0126R.string.sharing_consents_dismiss_learn_more), ajhs.f70674a);
        bhia.mo15910c();
    }
}
