package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.credentialstore.KeyData;

/* renamed from: xmw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xmw extends dcj implements xmy {
    public xmw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.credentialstore.internal.IKeyDataCallbacks");
    }

    /* renamed from: a */
    public final void mo29955a(Status status, KeyData keyData) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, keyData);
        mo8530c(1, bj);
    }
}
