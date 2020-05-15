package p000;

import android.app.AlertDialog;
import android.content.DialogInterface;

/* renamed from: asax */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class asax implements DialogInterface.OnShowListener {

    /* renamed from: a */
    final /* synthetic */ AlertDialog f88634a;

    /* renamed from: b */
    final /* synthetic */ asbb f88635b;

    public asax(asbb asbb, AlertDialog alertDialog) {
        this.f88635b = asbb;
        this.f88634a = alertDialog;
    }

    public final void onShow(DialogInterface dialogInterface) {
        this.f88635b.mo9306a();
        this.f88635b.mo49019a(this.f88634a);
    }
}
