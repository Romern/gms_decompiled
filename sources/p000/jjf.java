package p000;

import android.os.Handler;
import com.google.android.gms.auth.proximity.RemoteDevice;
import java.util.concurrent.Future;

/* renamed from: jjf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jjf {
    /* renamed from: a */
    public static synchronized jjg m16790a(jns jns, RemoteDevice remoteDevice, Future future, String str, jkh jkh, Handler handler, jjc jjc, jta jta, qxo qxo) {
        jjg b;
        synchronized (jjf.class) {
            b = m16791b(jns, remoteDevice, future, str, jkh, handler, jjc, jta, qxo);
        }
        return b;
    }

    /* renamed from: b */
    protected static final synchronized jjg m16791b(jns jns, RemoteDevice remoteDevice, Future future, String str, jkh jkh, Handler handler, jjc jjc, jta jta, qxo qxo) {
        jjg jjg;
        synchronized (jjf.class) {
            jjg = new jjg(jns, remoteDevice, future, str, jkh, handler, jjc, jta, qxo);
        }
        return jjg;
    }
}
