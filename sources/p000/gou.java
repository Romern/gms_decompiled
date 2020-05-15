package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: gou */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gou extends dcj implements IInterface {
    public gou(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.data.IGetAccountIdCallback");
    }

    /* renamed from: a */
    public final void mo12116a(Status status, String str) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeString(str);
        mo8530c(2, bj);
    }
}
