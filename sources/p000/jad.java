package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: jad */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jad extends dcj implements jaf {
    public jad(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.folsom.internal.IKeyRetrievalSyncStatusCallback");
    }

    /* renamed from: a */
    public final void mo13555a(Status status, int i) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeInt(i);
        mo8530c(1, bj);
    }
}
