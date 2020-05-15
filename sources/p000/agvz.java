package p000;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: agvz */
final /* synthetic */ class agvz implements DialogInterface.OnShowListener {

    /* renamed from: a */
    private final AlertDialog f66693a;

    /* renamed from: b */
    private final Context f66694b;

    public agvz(AlertDialog alertDialog, Context context) {
        this.f66693a = alertDialog;
        this.f66694b = context;
    }

    public final void onShow(DialogInterface dialogInterface) {
        AlertDialog alertDialog = this.f66693a;
        Context context = this.f66694b;
        srn srn = agwc.f66698u;
        ((TextView) alertDialog.findViewById(16908299)).setTextColor(context.getResources().getColor(C0126R.color.secondary_text_default));
    }
}
