package p000;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: agwf */
final /* synthetic */ class agwf implements DialogInterface.OnShowListener {

    /* renamed from: a */
    private final agwi f66704a;

    /* renamed from: b */
    private final AlertDialog f66705b;

    public agwf(agwi agwi, AlertDialog alertDialog) {
        this.f66704a = agwi;
        this.f66705b = alertDialog;
    }

    public final void onShow(DialogInterface dialogInterface) {
        ((TextView) this.f66705b.findViewById(16908299)).setTextColor(this.f66704a.f66713u.getResources().getColor(C0126R.color.secondary_text_default));
    }
}
