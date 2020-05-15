package p000;

import android.os.Handler;
import com.google.android.gms.auth.proximity.firstparty.Subscription;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;

/* renamed from: jqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jqw {

    /* renamed from: e */
    public static final /* synthetic */ int f23083e = 0;

    /* renamed from: f */
    private static final Logger f23084f = jsy.m17256a("SubscriptionCache");

    /* renamed from: h */
    private static jqw f23085h;

    /* renamed from: a */
    public final rsk f23086a = rsk.m34333a(rpr.m34216b(), "com.google.android.gms.auth.proximity.firstparty.SystemMemoryCacheService", 0, this.f23090g);

    /* renamed from: b */
    public final Handler f23087b = new snr(new sns("SubscriptionCache", 10));

    /* renamed from: c */
    public final List f23088c = new ArrayList();

    /* renamed from: d */
    public volatile boolean f23089d = false;

    /* renamed from: g */
    private final rsg f23090g = jqo.f23071a;

    /* renamed from: a */
    public static synchronized jqw m17133a() {
        jqw jqw;
        synchronized (jqw.class) {
            if (f23085h == null) {
                f23085h = new jqw();
            }
            jqw = f23085h;
        }
        return jqw;
    }

    /* renamed from: b */
    public final bqgg mo14004b() {
        bqgh a = bqgh.m112796a(new jqt(this));
        mo14003a(a);
        return a;
    }

    /* renamed from: a */
    public final bqgg mo14002a(Subscription subscription) {
        f23084f.mo25412b("Adding subscription: %s", subscription);
        bqgh a = bqgh.m112795a(new jqq(this, subscription), Status.f30107a);
        mo14003a(a);
        return a;
    }

    /* renamed from: a */
    public final void mo14003a(Runnable runnable) {
        this.f23087b.post(new jqs(this, runnable));
    }

    /* renamed from: b */
    public final bqgg mo14005b(Subscription subscription) {
        f23084f.mo25412b("Removing subscription: %s", subscription);
        bqgh a = bqgh.m112795a(new jqr(this, subscription), Status.f30107a);
        mo14003a(a);
        return a;
    }
}
