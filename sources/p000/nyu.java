package p000;

import android.util.Pair;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: nyu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nyu {

    /* renamed from: f */
    private static final bdyw f36985f = new bdyw(bdyj.m91581a("com.google.android.gms.car")).mo58445a("gearhead:");

    /* renamed from: g */
    private static volatile nyu f36986g;

    /* renamed from: a */
    public final bdyw f36987a;

    /* renamed from: b */
    public final ConcurrentHashMap f36988b = new ConcurrentHashMap();

    /* renamed from: c */
    public final ConcurrentHashMap f36989c = new ConcurrentHashMap();

    /* renamed from: d */
    public final ConcurrentHashMap f36990d = new ConcurrentHashMap();

    /* renamed from: e */
    public final ConcurrentHashMap f36991e = new ConcurrentHashMap();

    public nyu(bdyw bdyw) {
        this.f36987a = bdyw;
    }

    /* renamed from: a */
    public static Pair m28207a(String str, Object obj) {
        return new Pair(str, obj);
    }

    /* renamed from: a */
    public static nyu m28208a() {
        if (f36986g == null) {
            synchronized (nyu.class) {
                if (f36986g == null) {
                    f36986g = new nyu(f36985f);
                }
            }
        }
        return f36986g;
    }
}
