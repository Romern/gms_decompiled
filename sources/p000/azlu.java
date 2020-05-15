package p000;

import android.app.AlertDialog;
import android.content.DialogInterface;

/* renamed from: azlu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azlu implements DialogInterface.OnShowListener {

    /* renamed from: a */
    final /* synthetic */ AlertDialog f99595a;

    /* renamed from: b */
    final /* synthetic */ azlx f99596b;

    public azlu(azlx azlx, AlertDialog alertDialog) {
        this.f99596b = azlx;
        this.f99595a = alertDialog;
    }

    public final void onShow(DialogInterface dialogInterface) {
        this.f99596b.f99603f = this.f99595a.getButton(-1);
        this.f99596b.f99603f.setEnabled(false);
    }
}
