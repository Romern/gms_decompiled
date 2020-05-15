package p000;

import android.content.DialogInterface;
import android.view.View;
import com.felicanetworks.mfc.C0126R;

/* renamed from: wtg */
final /* synthetic */ class wtg implements View.OnClickListener {

    /* renamed from: a */
    private final wts f51294a;

    public wtg(wts wts) {
        this.f51294a = wts;
    }

    public void onClick(View view) {
        wts wts = this.f51294a;
        C1349sg sgVar = new C1349sg(wts.getContext());
        sgVar.mo15906b(17039370, new wtl(wts));
        sgVar.mo15892a(17039360, (DialogInterface.OnClickListener) null);
        sgVar.mo15900a(wts.getContext().getString(C0126R.string.bluetooth_unpair_dialog_body, wts.f51319f.getText().toString()));
        sgVar.mo15904b().show();
    }
}
