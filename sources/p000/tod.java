package p000;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import com.felicanetworks.mfc.C0126R;

/* renamed from: tod */
final /* synthetic */ class tod implements View.OnClickListener {

    /* renamed from: a */
    private final tof f46378a;

    /* renamed from: b */
    private final bskf f46379b;

    public tod(tof tof, bskf bskf) {
        this.f46378a = tof;
        this.f46379b = bskf;
    }

    public void onClick(View view) {
        tof tof = this.f46378a;
        bskf bskf = this.f46379b;
        tnx tnx = tof.f46394e;
        bmxy.m108581a((bsjx) tnx.f46365a.f46572d.mo2448b());
        bhia bhia = new bhia(tnx.f46366b.getActivity());
        bhia.mo63788d(tnx.f46366b.getResources().getText(C0126R.string.pwm_credential_group_delete_confirmation_dialog_title));
        bhia.mo63783c(TextUtils.expandTemplate(tnx.f46366b.getResources().getText(C0126R.string.pwm_credential_group_delete_confirmation_dialog_content), ((bsjx) tnx.f46365a.f46572d.mo2448b()).mo70637b().f167739b));
        bhia.mo63780b(true);
        bhia.mo63784c(tnx.f46366b.getResources().getText(C0126R.string.common_cancel), (DialogInterface.OnClickListener) null);
        bhia.mo63789d(tnx.f46366b.getResources().getText(C0126R.string.common_ui_confirm_deleting_button), new tnv(tnx, bskf));
        bhia.mo15904b().show();
    }
}
