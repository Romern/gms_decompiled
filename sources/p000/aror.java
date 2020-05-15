package p000;

import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: aror */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aror implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ aros f88022a;

    public aror(aros aros) {
        this.f88022a = aros;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -2) {
            arok arok = this.f88022a.f88023b;
            int i2 = 117;
            if ("OK_GOOGLE".equals(cgqv.m146717b()) && cgqv.m146718c()) {
                i2 = 118;
            }
            arok.mo48707b(i2, new Bundle());
            this.f88022a.f88024c.mo48632b();
        }
    }
}
