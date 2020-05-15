package p000;

import com.google.android.gms.auth.proximity.RemoteDevice;

/* renamed from: jmb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jmb {
    /* renamed from: a */
    protected static final synchronized jmc m16907a(RemoteDevice remoteDevice) {
        jmc jmc;
        synchronized (jmb.class) {
            jmc = new jmc(remoteDevice);
        }
        return jmc;
    }

    /* renamed from: b */
    public static synchronized jmc m16908b(RemoteDevice remoteDevice) {
        jmc a;
        synchronized (jmb.class) {
            a = m16907a(remoteDevice);
        }
        return a;
    }
}
