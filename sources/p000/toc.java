package p000;

import android.content.ClipData;
import android.view.View;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;

/* renamed from: toc */
final /* synthetic */ class toc implements View.OnClickListener {

    /* renamed from: a */
    private final tof f46376a;

    /* renamed from: b */
    private final bskf f46377b;

    public toc(tof tof, bskf bskf) {
        this.f46376a = tof;
        this.f46377b = bskf;
    }

    public void onClick(View view) {
        tof tof = this.f46376a;
        bskf bskf = this.f46377b;
        tnx tnx = tof.f46394e;
        tnx.f46368d.setPrimaryClip(ClipData.newPlainText(tnx.f46366b.getResources().getText(C0126R.string.common_password), ((bsqg) ((tqk) bskf.mo70661g()).mo26727b().mo66814b()).mo70699a()));
        Toast.makeText(tnx.f46366b.getContext(), tnx.f46366b.getResources().getText(C0126R.string.pwm_copied_to_clipboard_message), 0).show();
        tnx.f46367c.mo26715a(47006);
    }
}
