package p000;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: agxc */
final /* synthetic */ class agxc implements DialogInterface.OnShowListener {

    /* renamed from: a */
    private final agxe f66763a;

    /* renamed from: b */
    private final AlertDialog f66764b;

    public agxc(agxe agxe, AlertDialog alertDialog) {
        this.f66763a = agxe;
        this.f66764b = alertDialog;
    }

    public final void onShow(DialogInterface dialogInterface) {
        ((TextView) this.f66764b.findViewById(16908299)).setTextColor(this.f66763a.f66771v.getResources().getColor(C0126R.color.secondary_text_default));
    }
}
