package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.proxy.ProxyGrpcRequest;
import com.google.android.gms.auth.api.proxy.ProxyRequest;

/* renamed from: hxr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hxr extends dcj implements hxt {
    public hxr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.internal.IAuthService");
    }

    /* renamed from: a */
    public final void mo12790a(hxq hxq) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, hxq);
        mo8528b(3, bj);
    }

    /* renamed from: a */
    public final void mo12791a(hxq hxq, ProxyGrpcRequest proxyGrpcRequest) {
        throw null;
    }

    /* renamed from: a */
    public final void mo12792a(hxq hxq, ProxyRequest proxyRequest) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, hxq);
        dcl.m8165a(bj, proxyRequest);
        mo8528b(1, bj);
    }
}
