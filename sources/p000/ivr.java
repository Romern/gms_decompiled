package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import java.util.LinkedList;
import java.util.List;

/* renamed from: ivr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ivr {

    /* renamed from: f */
    public static final Logger f21878f = new Logger(new String[]{"TrustStateTracker"}, (char[]) null);

    /* renamed from: g */
    private static ivr f21879g;

    /* renamed from: a */
    public final Object f21880a = new Object();

    /* renamed from: b */
    public final Context f21881b;

    /* renamed from: c */
    public final ivo f21882c;

    /* renamed from: d */
    public final List f21883d = new LinkedList();

    /* renamed from: e */
    public BroadcastReceiver f21884e;

    private ivr(Context context) {
        ivo ivo = new ivo(context);
        sdo.m34959a(context);
        this.f21881b = context;
        this.f21882c = ivo;
    }

    /* renamed from: a */
    public static synchronized ivr m16222a(Context context) {
        ivr ivr;
        synchronized (ivr.class) {
            if (f21879g == null) {
                f21879g = new ivr(context.getApplicationContext());
            }
            ivr = f21879g;
        }
        return ivr;
    }
}
