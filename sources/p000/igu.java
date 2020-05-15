package p000;

import android.content.Context;
import android.net.ConnectivityManager;

/* renamed from: igu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class igu {

    /* renamed from: g */
    public static final sek f20977g = new sek("DeviceStateSyncManager");

    /* renamed from: h */
    private static igu f20978h;

    /* renamed from: a */
    public final igh f20979a;

    /* renamed from: b */
    public final ihe f20980b;

    /* renamed from: c */
    public final ConnectivityManager f20981c;

    /* renamed from: d */
    public final igd f20982d;

    /* renamed from: e */
    public final ige f20983e;

    /* renamed from: f */
    public final ihc f20984f;

    private igu(Context context) {
        srb srb = srb.f45012a;
        igh igh = new igh(context);
        ihe a = ihe.m15438a(context);
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        igd igd = new igd(context);
        ige ige = new ige(context);
        ihc ihc = new ihc(context);
        sdo.m34959a(srb);
        sdo.m34959a(igh);
        this.f20979a = igh;
        sdo.m34959a(a);
        this.f20980b = a;
        sdo.m34959a(connectivityManager);
        this.f20981c = connectivityManager;
        sdo.m34959a(igd);
        this.f20982d = igd;
        sdo.m34959a(ige);
        this.f20983e = ige;
        this.f20984f = ihc;
    }

    /* renamed from: a */
    public static synchronized igu m15430a(Context context) {
        igu igu;
        synchronized (igu.class) {
            if (f20978h == null) {
                f20978h = new igu(context.getApplicationContext());
            }
            igu = f20978h;
        }
        return igu;
    }
}
