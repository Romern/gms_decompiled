package p000;

import android.app.AlertDialog;
import android.view.View;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: ycp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ycp implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ TextView f53605a;

    /* renamed from: b */
    final /* synthetic */ ycs f53606b;

    public ycp(ycs ycs, TextView textView) {
        this.f53606b = ycs;
        this.f53605a = textView;
    }

    public void onClick(View view) {
        if (this.f53606b.f53617f.isFinishing() || this.f53606b.f53617f.isDestroyed()) {
            ycs.f53612c.mo25418e("Dialog is not shown, as ChimeraActivity is or will be destroyed!", new Object[0]);
            return;
        }
        this.f53605a.setVisibility(4);
        ycs ycs = this.f53606b;
        if (ycs.f53613a == null) {
            ycs.f53613a = new AlertDialog.Builder(ycs.f53617f).create();
        }
        ycs ycs2 = this.f53606b;
        ycs2.f53613a.setTitle(ycs2.f53617f.getResources().getString(C0126R.string.common_something_went_wrong));
        ycs ycs3 = this.f53606b;
        ycs3.f53613a.setMessage(ycs3.f53617f.getResources().getString(C0126R.string.fido_ble_dont_see_your_key_dialog_message));
        ycs ycs4 = this.f53606b;
        ycs4.f53613a.setButton(-1, ycs4.f53617f.getResources().getString(C0126R.string.common_ok), new ycn(this));
        this.f53606b.f53613a.setOnShowListener(new yco(this));
        this.f53606b.f53613a.show();
    }
}
