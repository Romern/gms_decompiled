package p000;

import android.os.Bundle;
import android.view.View;

/* renamed from: bhfn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhfn extends C1251oq {

    /* renamed from: b */
    final /* synthetic */ bhfq f118477b;

    public bhfn(bhfq bhfq) {
        this.f118477b = bhfq;
    }

    /* renamed from: a */
    public final void mo345a(View view, C1301qm qmVar) {
        super.mo345a(view, qmVar);
        if (this.f118477b.f118479a) {
            qmVar.mo15752a(1048576);
            qmVar.mo15785i(true);
            return;
        }
        qmVar.mo15785i(false);
    }

    /* renamed from: a */
    public final boolean mo346a(View view, int i, Bundle bundle) {
        if (i == 1048576) {
            bhfq bhfq = this.f118477b;
            if (bhfq.f118479a) {
                bhfq.cancel();
                return true;
            }
        }
        return super.mo346a(view, i, bundle);
    }
}
