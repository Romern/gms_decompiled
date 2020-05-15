package p000;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: agwb */
final /* synthetic */ class agwb implements DialogInterface.OnShowListener {

    /* renamed from: a */
    private final AlertDialog f66696a;

    /* renamed from: b */
    private final Context f66697b;

    public agwb(AlertDialog alertDialog, Context context) {
        this.f66696a = alertDialog;
        this.f66697b = context;
    }

    public final void onShow(DialogInterface dialogInterface) {
        AlertDialog alertDialog = this.f66696a;
        Context context = this.f66697b;
        srn srn = agwc.f66698u;
        ((TextView) alertDialog.findViewById(16908299)).setTextColor(context.getResources().getColor(C0126R.color.secondary_text_default_material_light));
    }
}
