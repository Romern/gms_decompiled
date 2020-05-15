package p000;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: agxi */
final /* synthetic */ class agxi implements DialogInterface.OnShowListener {

    /* renamed from: a */
    private final AlertDialog f66775a;

    /* renamed from: b */
    private final Context f66776b;

    public agxi(AlertDialog alertDialog, Context context) {
        this.f66775a = alertDialog;
        this.f66776b = context;
    }

    public final void onShow(DialogInterface dialogInterface) {
        AlertDialog alertDialog = this.f66775a;
        Context context = this.f66776b;
        int i = agxl.f66781w;
        ((TextView) alertDialog.findViewById(16908299)).setTextColor(context.getResources().getColor(C0126R.color.secondary_text_default));
    }
}
