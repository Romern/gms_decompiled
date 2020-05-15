package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.proxy.ProxyResponse;

/* renamed from: hxo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hxo extends dcj implements hxq {
    public hxo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    /* renamed from: a */
    public final void mo12788a(ProxyResponse proxyResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, proxyResponse);
        mo8528b(1, bj);
    }

    /* renamed from: a */
    public final void mo12789a(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        mo8528b(2, bj);
    }
}
