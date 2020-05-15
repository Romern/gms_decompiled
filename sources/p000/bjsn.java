package p000;

import android.content.DialogInterface;
import android.os.Build;

/* renamed from: bjsn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjsn implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ bjsq f123241a;

    public bjsn(bjsq bjsq) {
        this.f123241a = bjsq;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -2) {
            int i2 = Build.VERSION.SDK_INT;
            bjsl.m104501a("FingerprintDialogFrag", this.f123241a.getActivity(), this.f123241a.f123243a, new bjsm(this, dialogInterface));
        }
    }
}
