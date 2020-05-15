package p000;

import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.HashMap;

/* renamed from: baqe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baqe {
    /* renamed from: a */
    public static Exception m87387a(Exception exc, babr babr) {
        HashMap hashMap = new HashMap();
        for (Throwable th : bmzo.m108691c(exc)) {
            hashMap.put(th.getClass(), th);
        }
        if (babr.mo32673E() && hashMap.containsKey(chux.class)) {
            chus chus = ((chux) hashMap.get(chux.class)).f189238a.f189233s;
            if (chus.equals(chuv.f189223j.f189233s)) {
                return new baqd(exc, 5);
            }
            if (chus.equals(chuv.f189229p.f189233s)) {
                return new baqd(exc, 6);
            }
            if (chus.equals(chuv.f189219f.f189233s)) {
                return new baqd(exc, 7);
            }
        }
        if (hashMap.containsKey(UnknownHostException.class)) {
            return new baqd(exc, 2);
        }
        return hashMap.containsKey(ConnectException.class) ? new baqd(exc, 4) : exc;
    }
}
