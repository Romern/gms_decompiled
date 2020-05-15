package p000;

import android.view.View;
import android.widget.RadioButton;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.tapandpay.tokenization.SelectUntokenizedCardChimeraActivity;

/* renamed from: atqr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atqr implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ SelectUntokenizedCardChimeraActivity f90685a;

    public atqr(SelectUntokenizedCardChimeraActivity selectUntokenizedCardChimeraActivity) {
        this.f90685a = selectUntokenizedCardChimeraActivity;
    }

    public void onClick(View view) {
        if (view.getTag() instanceof btjq) {
            this.f90685a.f108833b = (btjq) view.getTag();
            this.f90685a.f108834c = false;
        } else {
            SelectUntokenizedCardChimeraActivity selectUntokenizedCardChimeraActivity = this.f90685a;
            selectUntokenizedCardChimeraActivity.f108834c = true;
            selectUntokenizedCardChimeraActivity.f108833b = null;
            selectUntokenizedCardChimeraActivity.mo59453a(-1, selectUntokenizedCardChimeraActivity.f108833b);
        }
        ((RadioButton) view.findViewById(C0126R.C0129id.left_icon_radio)).setChecked(true);
        this.f90685a.f108842k.notifyDataSetChanged();
        this.f90685a.findViewById(C0126R.C0129id.ConfirmButton).setEnabled(true);
    }
}
