package p000;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: agxd */
final /* synthetic */ class agxd implements DialogInterface.OnShowListener {

    /* renamed from: a */
    private final agxe f66765a;

    /* renamed from: b */
    private final AlertDialog f66766b;

    public agxd(agxe agxe, AlertDialog alertDialog) {
        this.f66765a = agxe;
        this.f66766b = alertDialog;
    }

    public final void onShow(DialogInterface dialogInterface) {
        ((TextView) this.f66766b.findViewById(16908299)).setTextColor(this.f66765a.f66771v.getResources().getColor(C0126R.color.secondary_text_default_material_light));
    }
}
