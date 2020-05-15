package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.cryptauth.PlainText;
import com.google.android.gms.common.api.Status;

/* renamed from: isj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class isj extends dcj implements isl {
    public isj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.cryptauth.internal.IVerifyDecryptCallback");
    }

    /* renamed from: a */
    public final void mo13314a(PlainText plainText) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, plainText);
        mo8530c(1, bj);
    }

    /* renamed from: a */
    public final void mo13315a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(2, bj);
    }
}
