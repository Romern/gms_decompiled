package p000;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

/* renamed from: ayrp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayrp {

    /* renamed from: a */
    public static final String f98371a = ayrp.class.getSimpleName();

    /* renamed from: b */
    final ayso f98372b = new ayrm(this);

    /* renamed from: c */
    final ConcurrentMap f98373c = new ConcurrentHashMap();

    /* renamed from: d */
    public final Context f98374d;

    /* renamed from: e */
    public final aytb f98375e;

    static {
        TimeUnit.SECONDS.toMillis(5);
    }

    public ayrp(Context context, aysk aysk) {
        bmxy.m108581a(context);
        bmxy.m108581a(aysk);
        aytb aytb = new aytb(5);
        new ayrn(this);
        this.f98374d = context;
        this.f98375e = aytb;
    }

    /* renamed from: a */
    public final ayri mo54335a(aysl aysl, ayrl ayrl) {
        ayri ayri;
        new Object[1][0] = aysl;
        long currentTimeMillis = System.currentTimeMillis();
        ayrj ayrj = new ayrj(this, new Object[]{ayro.CONNECT, aysl}, aysl, ayrl);
        if (ayrl.mo54300a()) {
            ayri = (ayri) this.f98375e.mo54409a(ayrj);
        } else {
            ayri = (ayri) this.f98375e.mo54410a(ayrj, ayrl.mo54301b());
        }
        new Object[1][0] = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
        return ayri;
    }
}
