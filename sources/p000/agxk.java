package p000;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: agxk */
final /* synthetic */ class agxk implements DialogInterface.OnShowListener {

    /* renamed from: a */
    private final AlertDialog f66778a;

    /* renamed from: b */
    private final Context f66779b;

    public agxk(AlertDialog alertDialog, Context context) {
        this.f66778a = alertDialog;
        this.f66779b = context;
    }

    public final void onShow(DialogInterface dialogInterface) {
        AlertDialog alertDialog = this.f66778a;
        Context context = this.f66779b;
        int i = agxl.f66781w;
        ((TextView) alertDialog.findViewById(16908299)).setTextColor(context.getResources().getColor(C0126R.color.secondary_text_default_material_light));
    }
}
