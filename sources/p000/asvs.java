package p000;

import android.app.AlertDialog;
import android.content.DialogInterface;

/* renamed from: asvs */
final /* synthetic */ class asvs implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final aswe f89822a;

    /* renamed from: b */
    private final AlertDialog.Builder f89823b;

    public asvs(aswe aswe, AlertDialog.Builder builder) {
        this.f89822a = aswe;
        this.f89823b = builder;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f89822a.startActivity(atvg.m76454a(this.f89823b.getContext(), "com.felicanetworks.mfm.main", null, false));
    }
}
