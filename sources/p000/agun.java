package p000;

import android.app.AlertDialog;
import android.content.DialogInterface;

/* renamed from: agun */
final /* synthetic */ class agun implements DialogInterface.OnShowListener {

    /* renamed from: a */
    private final agup f66583a;

    /* renamed from: b */
    private final AlertDialog f66584b;

    public agun(agup agup, AlertDialog alertDialog) {
        this.f66583a = agup;
        this.f66584b = alertDialog;
    }

    public final void onShow(DialogInterface dialogInterface) {
        agup agup = this.f66583a;
        AlertDialog alertDialog = this.f66584b;
        agup.f66595g = alertDialog.getButton(-1);
        agup.f66595g.setOnClickListener(new aguo(agup, alertDialog));
        agup.f66596h = alertDialog.getButton(-2);
        agup.f66596h.setOnClickListener(agup.f66590b);
    }
}
