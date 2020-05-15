package p000;

import android.view.MenuItem;
import com.felicanetworks.mfc.C0126R;
import com.google.android.libraries.matchstick.p091ui.CardChimeraActivity;

/* renamed from: azkz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azkz implements aaz {

    /* renamed from: a */
    final /* synthetic */ CardChimeraActivity f99573a;

    public azkz(CardChimeraActivity cardChimeraActivity) {
        this.f99573a = cardChimeraActivity;
    }

    /* renamed from: a */
    public final boolean mo135a(MenuItem menuItem) {
        int i = ((C1446vw) menuItem).f27454a;
        if (i == C0126R.C0129id.ms_block) {
            this.f99573a.mo60404a(264);
            return true;
        } else if (i == C0126R.C0129id.ms_add_to_contacts) {
            this.f99573a.mo60410b(266);
            this.f99573a.mo60422y();
            this.f99573a.finish();
            return true;
        } else if (i == C0126R.C0129id.ms_settings) {
            this.f99573a.mo60410b(268);
            this.f99573a.mo60421x();
            return true;
        } else {
            azoj.m85933c("CardChimeraActivity", "Illegal option chosen from the menu", new Object[0]);
            return true;
        }
    }
}
