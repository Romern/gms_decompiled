package p000;

import android.content.Context;
import android.location.Location;
import android.os.Looper;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: zjv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zjv {

    /* renamed from: a */
    public static final srn f55250a = zvt.m46581a();

    /* renamed from: i */
    private static final AtomicReference f55251i = new AtomicReference();

    /* renamed from: b */
    public final bnhe f55252b;

    /* renamed from: c */
    public final AtomicReference f55253c = new AtomicReference();

    /* renamed from: d */
    public final aehy f55254d;

    /* renamed from: e */
    public final Looper f55255e;

    /* renamed from: f */
    public final aesh f55256f;

    /* renamed from: g */
    public final caaq f55257g;

    /* renamed from: h */
    public long f55258h = 0;

    /* renamed from: j */
    private final ConcurrentMap f55259j = new ConcurrentHashMap();

    /* renamed from: a */
    static synchronized zjv m45616a(Context context, Looper looper, aesh aesh, ytp ytp) {
        zjv zjv;
        synchronized (zjv.class) {
            while (true) {
                zjv = (zjv) f55251i.get();
                if (zjv == null) {
                    f55251i.compareAndSet(null, new zjv(context, looper, aesh, ytp));
                }
            }
        }
        return zjv;
    }

    /* renamed from: b */
    private final synchronized zju m45617b(zgh zgh) {
        zju zju;
        zju = new zju(this, zgh);
        aesj aesj = zju.f55248b;
        zgh zgh2 = zju.f55247a;
        zju.f55249c.f55256f.mo34501a();
        long millis = TimeUnit.MICROSECONDS.toMillis(zgh2.f55013c);
        long millis2 = TimeUnit.MICROSECONDS.toMillis(zgh2.f55015e);
        long millis3 = TimeUnit.MICROSECONDS.toMillis(zgh2.f55014d);
        LocationRequest a = LocationRequest.m66854a();
        zjv zjv = zju.f55249c;
        int i = zgh2.f55016f;
        int i2 = 102;
        if (i == 1) {
            i2 = ErrorInfo.TYPE_SDU_FAILED;
        } else if (i == 2) {
            caap caap = caap.WATCH;
            caap a2 = caap.m126421a(zjv.f55257g.f172360c);
            if (a2 == null) {
                a2 = caap.UNKNOWN;
            }
            if (caap.equals(a2)) {
                i2 = ErrorInfo.TYPE_SDU_MEMORY_FULL;
            }
        } else if (i == 3) {
            i2 = 100;
        }
        a.mo43553c(i2);
        a.mo43554c(millis);
        a.mo43552b(millis2);
        a.mo43556d(millis3);
        LocationRequestInternal a3 = LocationRequestInternal.m66889a("fitness", a);
        a3.mo43613a(zgh2.f55018h);
        aesj.mo34511a(bngx.m109356a(a3), true);
        return zju;
    }

    private zjv(Context context, Looper looper, aesh aesh, ytp ytp) {
        bnha a = bnhe.m109406a(zjw.f55262c.size());
        bnrd a2 = zjw.f55262c.iterator();
        while (a2.hasNext()) {
            caah caah = (caah) a2.next();
            bmxy.m108596a(zjw.f55260a.containsKey(caah), "Unsupported data type specified: %s", caah);
            yyc a3 = yyd.m44987a();
            a3.mo30856a((caad) zjw.f55260a.get(caah));
            a3.mo30857a(caah);
            a3.mo30855a(yxy.f54800b);
            a3.mo30858a(zvn.m46574a(context));
            a3.mo30859a((String) zjw.f55261b.get(caah));
            a.mo67695b(caah, a3.mo30854a());
        }
        this.f55252b = a.mo67618b();
        this.f55254d = new zka(this, ytp);
        this.f55255e = looper;
        this.f55256f = aesh;
        this.f55257g = zvn.m46574a(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Location mo31179a() {
        return (Location) this.f55253c.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized bqgg mo31180a(zgh zgh) {
        TimeUnit.MICROSECONDS.toMillis(zgh.f55013c);
        caah caah = zgh.f55011a.f172330f;
        if (caah == null) {
            caah = caah.f172333d;
        }
        zju zju = (zju) this.f55259j.put(caah, m45617b(zgh));
        if (zju != null) {
            zju.mo31178a();
        }
        return bqga.m112775a((Object) true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final zgg mo31181a(caah caah) {
        zju zju = (zju) this.f55259j.get(caah);
        if (zju != null) {
            return zju.f55247a.f55012b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo31182a(zgg zgg) {
        Iterator it = this.f55259j.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zju zju = (zju) it.next();
            if (zgg.equals(zju.f55247a.f55012b)) {
                it.remove();
                zju.mo31178a();
                break;
            }
        }
        if (this.f55259j.isEmpty()) {
            this.f55253c.set(null);
            this.f55256f.mo34507b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized bqgg mo31184b() {
        bqgy c;
        c = bqgy.m112818c();
        this.f55256f.mo34503a(new zjt(c));
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final caae mo31185b(caah caah) {
        return (caae) this.f55252b.get(caah);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo31183a(Location location) {
        Location location2;
        do {
            location2 = (Location) this.f55253c.get();
            if (location2 != null && zkb.m45638a(location2) > zkb.m45638a(location)) {
                bnsl bnsl = (bnsl) f55250a.mo68388c();
                bnsl.mo68432a("zjv", "a", 170, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68424a("Out of order location: %s is before %s", location, location2);
                return false;
            }
        } while (!this.f55253c.compareAndSet(location2, location));
        return true;
    }
}
