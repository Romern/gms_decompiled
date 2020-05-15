package p000;

import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: bkcv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkcv implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Bundle f124026a;

    /* renamed from: b */
    final /* synthetic */ bkcz f124027b;

    public bkcv(bkcz bkcz, Bundle bundle) {
        this.f124027b = bkcz;
        this.f124026a = bundle;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        bkcy bkcy = this.f124027b.f124032a;
        if (bkcy != null) {
            bkcy.mo52044a(2, this.f124026a.getInt("errorCode"));
        }
    }
}
