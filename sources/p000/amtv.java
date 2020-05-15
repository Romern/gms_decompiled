package p000;

import android.content.Intent;
import android.view.View;
import com.felicanetworks.mfc.C0126R;

/* renamed from: amtv */
final /* synthetic */ class amtv implements View.OnClickListener {

    /* renamed from: a */
    private final amub f75924a;

    public amtv(amub amub) {
        this.f75924a = amub;
    }

    public void onClick(View view) {
        amub amub = this.f75924a;
        Intent a = amup.m63313a(amub.f75930a, amub.getActivity().getResources().getString(C0126R.string.common_choose_account_label));
        amub.mo41338a(4);
        amub.startActivityForResult(a, 1);
    }
}
