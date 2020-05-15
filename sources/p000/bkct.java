package p000;

import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: bkct */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkct implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Bundle f124022a;

    /* renamed from: b */
    final /* synthetic */ bkcz f124023b;

    public bkct(bkcz bkcz, Bundle bundle) {
        this.f124023b = bkcz;
        this.f124022a = bundle;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        bkcy bkcy = this.f124023b.f124032a;
        if (bkcy != null) {
            bkcy.mo52044a(0, this.f124022a.getInt("errorCode"));
        }
    }
}
