package p000;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

/* renamed from: bedj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bedj {

    /* renamed from: a */
    static final long f106966a = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: f */
    public static final /* synthetic */ int f106967f = 0;

    /* renamed from: b */
    final aytb f106968b;

    /* renamed from: c */
    final ayso f106969c = new bedg(this);

    /* renamed from: d */
    final ConcurrentMap f106970d = new ConcurrentHashMap();

    /* renamed from: e */
    public final Context f106971e;

    static {
        TimeUnit.SECONDS.toMillis(5);
    }

    public bedj(Context context, aysk aysk) {
        bmxy.m108581a(context);
        bmxy.m108581a(aysk);
        aytb aytb = new aytb(5);
        new bedh(this);
        this.f106971e = context;
        this.f106968b = aytb;
    }

    /* renamed from: a */
    public final bede mo58573a(aysl aysl) {
        new Object[1][0] = aysl;
        long currentTimeMillis = System.currentTimeMillis();
        bede bede = (bede) this.f106968b.mo54410a(new bedf(this, new Object[]{bedi.CONNECT, aysl}, aysl), f106966a);
        new Object[1][0] = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
        return bede;
    }
}
