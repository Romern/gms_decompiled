package p000;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Logger;

/* renamed from: chsc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chsc {

    /* renamed from: a */
    public static final Logger f189081a = Logger.getLogger(chsc.class.getName());

    /* renamed from: b */
    public static final chsc f189082b = new chsc();

    /* renamed from: c */
    public final ConcurrentNavigableMap f189083c = new ConcurrentSkipListMap();

    /* renamed from: d */
    public final ConcurrentMap f189084d = new ConcurrentHashMap();

    /* renamed from: e */
    public final ConcurrentMap f189085e = new ConcurrentHashMap();

    public chsc() {
        new ConcurrentSkipListMap();
        new ConcurrentHashMap();
    }

    /* renamed from: a */
    public static void m149477a(Map map, chsd chsd) {
        chsd chsd2 = (chsd) map.put(Long.valueOf(chsd.mo85595b().f189087a), chsd);
    }

    /* renamed from: b */
    public static void m149478b(Map map, chsd chsd) {
        chsd chsd2 = (chsd) map.remove(Long.valueOf(chsd.mo85595b().f189087a));
    }
}
