package p000;

import android.content.Intent;
import android.view.View;
import com.felicanetworks.mfc.C0126R;

/* renamed from: amsk */
final /* synthetic */ class amsk implements View.OnClickListener {

    /* renamed from: a */
    private final amsq f75857a;

    public amsk(amsq amsq) {
        this.f75857a = amsq;
    }

    public void onClick(View view) {
        amsq amsq = this.f75857a;
        Intent a = amup.m63313a(amsq.f75863a, amsq.getActivity().getResources().getString(C0126R.string.common_choose_account_label));
        amsq.mo41309a(4);
        amsq.startActivityForResult(a, 1);
    }
}
