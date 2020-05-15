package p000;

import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: bkcx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkcx implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Bundle f124030a;

    /* renamed from: b */
    final /* synthetic */ bkcz f124031b;

    public bkcx(bkcz bkcz, Bundle bundle) {
        this.f124031b = bkcz;
        this.f124030a = bundle;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        bkcy bkcy = this.f124031b.f124032a;
        if (bkcy != null) {
            bkcy.mo52044a(2, this.f124030a.getInt("errorCode"));
        }
    }
}
