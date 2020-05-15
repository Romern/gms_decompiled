package p000;

import android.content.ServiceConnection;

/* renamed from: sbu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sbu {

    /* renamed from: a */
    public static aabi f44037a = null;

    /* renamed from: a */
    public static ServiceConnection m34868a(ServiceConnection serviceConnection) {
        if (f44037a == null) {
            return serviceConnection;
        }
        if (serviceConnection instanceof aabz) {
            return (aabz) serviceConnection;
        }
        return new aabz(serviceConnection, sni.m35697a(), new sni(snc.m35691a("onServiceDisconnected")));
    }
}
