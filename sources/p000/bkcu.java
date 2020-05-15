package p000;

import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: bkcu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkcu implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Bundle f124024a;

    /* renamed from: b */
    final /* synthetic */ bkcz f124025b;

    public bkcu(bkcz bkcz, Bundle bundle) {
        this.f124025b = bkcz;
        this.f124024a = bundle;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        bkcy bkcy = this.f124025b.f124032a;
        if (bkcy != null) {
            bkcy.mo52044a(0, this.f124024a.getInt("errorCode"));
        }
    }
}
