package com.google.android.gms.ads.signalsdk;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.C0633h;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.ads.signalsdk.g */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0898g implements bqfp {

    /* renamed from: a */
    final /* synthetic */ C0892a f9451a;

    public C0898g(C0892a aVar) {
        this.f9451a = aVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        Bundle bundle = (Bundle) obj;
        try {
            C0892a aVar = this.f9451a;
            Parcel bj = aVar.mo8529bj();
            dcl.m8165a(bj, bundle);
            aVar.mo8530c(1, bj);
        } catch (RemoteException e) {
            C0633h.m5669b("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        int i;
        if (!(th instanceof TimeoutException)) {
            C0633h.m5669b("signal sdk error", th);
            i = 5;
        } else {
            i = 4;
        }
        try {
            this.f9451a.mo7121a(i);
        } catch (RemoteException e) {
            C0633h.m5669b("#007 Could not call remote method.", e);
        }
    }
}
