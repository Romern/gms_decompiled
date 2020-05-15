package p000;

import android.app.AlertDialog;
import android.view.View;
import com.felicanetworks.mfc.C0126R;

/* renamed from: amrc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amrc implements View.OnClickListener {

    /* renamed from: a */
    public final alud f75795a;

    /* renamed from: b */
    public final rkb f75796b;

    public amrc(rkb rkb, alud alud) {
        this.f75795a = alud;
        this.f75796b = rkb;
    }

    public void onClick(View view) {
        new AlertDialog.Builder(view.getContext()).setMessage(this.f75795a.f74293b).setPositiveButton((int) C0126R.string.people_settings_apdl_i_agree, new amqz(this, view)).setNegativeButton(17039360, new amqy()).show();
    }
}
