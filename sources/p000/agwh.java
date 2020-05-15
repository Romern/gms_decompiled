package p000;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: agwh */
final /* synthetic */ class agwh implements DialogInterface.OnShowListener {

    /* renamed from: a */
    private final agwi f66707a;

    /* renamed from: b */
    private final AlertDialog f66708b;

    public agwh(agwi agwi, AlertDialog alertDialog) {
        this.f66707a = agwi;
        this.f66708b = alertDialog;
    }

    public final void onShow(DialogInterface dialogInterface) {
        ((TextView) this.f66708b.findViewById(16908299)).setTextColor(this.f66707a.f66713u.getResources().getColor(C0126R.color.secondary_text_default_material_light));
    }
}
