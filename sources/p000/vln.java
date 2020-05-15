package p000;

import android.view.View;
import com.felicanetworks.mfc.C0126R;

/* renamed from: vln */
final /* synthetic */ class vln implements View.OnClickListener {

    /* renamed from: a */
    private final vlr f49453a;

    public vln(vlr vlr) {
        this.f49453a = vlr;
    }

    public void onClick(View view) {
        vlr vlr = this.f49453a;
        int id = view.getId();
        if (id == C0126R.C0129id.drive_button_bar_button_right) {
            if (!vlr.f49467k) {
                vlr.f49467k = true;
                vlr.f49459c.mo18273b(uzm.f48741Q, vlr.f49466j.getText().toString());
                new vlq(vlr).execute(new Void[0]);
            }
        } else if (id != C0126R.C0129id.drive_button_bar_button_left) {
            vlr.f49457a.mo25374b("CreateFileDialogFragmen", "Unknown view clicked: %s, %s.", Integer.valueOf(id), view);
        } else {
            vlr.getActivity().setResult(0);
            vlr.getActivity().finish();
            vlr.mo28620a(1);
        }
    }
}
