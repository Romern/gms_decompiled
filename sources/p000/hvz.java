package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.api.Status;

/* renamed from: hvz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hvz extends dcj implements hwb {
    public hvz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.IGetCachedSaveAccountLinkingTokenRequestCallback");
    }

    /* renamed from: a */
    public final void mo12780a(Status status, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, saveAccountLinkingTokenRequest);
        mo8530c(1, bj);
    }
}
