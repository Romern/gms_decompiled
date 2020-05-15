package p000;

import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: bkcw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkcw implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Bundle f124028a;

    /* renamed from: b */
    final /* synthetic */ bkcz f124029b;

    public bkcw(bkcz bkcz, Bundle bundle) {
        this.f124029b = bkcz;
        this.f124028a = bundle;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        bkcy bkcy = this.f124029b.f124032a;
        if (bkcy != null) {
            bkcy.mo52044a(1, this.f124028a.getInt("errorCode"));
        }
    }
}
