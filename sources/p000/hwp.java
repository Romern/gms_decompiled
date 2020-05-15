package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult;
import com.google.android.gms.common.api.Status;

/* renamed from: hwp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hwp extends dcj implements IInterface {
    public hwp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISaveAccountLinkingTokenCallback");
    }

    /* renamed from: a */
    public final void mo12785a(Status status, SaveAccountLinkingTokenResult saveAccountLinkingTokenResult) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, saveAccountLinkingTokenResult);
        mo8530c(1, bj);
    }
}
