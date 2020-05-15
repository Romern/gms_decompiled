package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.folsom.SharedKey;
import com.google.android.gms.common.api.Status;

/* renamed from: jag */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jag extends dcj implements jai {
    public jag(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.folsom.internal.ISharedKeyCallback");
    }

    /* renamed from: a */
    public final void mo13556a(Status status, SharedKey[] sharedKeyArr) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeTypedArray(sharedKeyArr, 0);
        mo8530c(1, bj);
    }
}
