package p000;

import android.content.ClipData;
import android.view.View;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;

/* renamed from: tob */
final /* synthetic */ class tob implements View.OnClickListener {

    /* renamed from: a */
    private final tof f46374a;

    /* renamed from: b */
    private final bskf f46375b;

    public tob(tof tof, bskf bskf) {
        this.f46374a = tof;
        this.f46375b = bskf;
    }

    public void onClick(View view) {
        tof tof = this.f46374a;
        bskf bskf = this.f46375b;
        tnx tnx = tof.f46394e;
        tnx.f46368d.setPrimaryClip(ClipData.newPlainText(tnx.f46366b.getResources().getText(C0126R.string.pwm_clipboard_label_copied_username), bskf.mo70660f()));
        Toast.makeText(tnx.f46366b.getContext(), tnx.f46366b.getResources().getText(C0126R.string.pwm_copied_to_clipboard_message), 0).show();
        tnx.f46367c.mo26715a(47024);
    }
}
