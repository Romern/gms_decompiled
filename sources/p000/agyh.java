package p000;

import android.view.View;
import com.felicanetworks.mfc.C0126R;

/* renamed from: agyh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agyh implements agya {

    /* renamed from: a */
    private final View.OnClickListener f66857a;

    public agyh(View.OnClickListener onClickListener) {
        this.f66857a = onClickListener;
    }

    /* renamed from: a */
    public final int mo36175a() {
        return C0126R.C0128layout.revoke_consent_item;
    }

    /* renamed from: a */
    public final void mo36176a(acm acm) {
        ((agwy) acm).f201a.findViewById(C0126R.C0129id.revoke_consent_button).setOnClickListener(this.f66857a);
    }
}
