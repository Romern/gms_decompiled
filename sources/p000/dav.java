package p000;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: dav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dav {

    /* renamed from: a */
    public final Context f12704a;

    /* renamed from: b */
    public final aaib f12705b;

    /* renamed from: c */
    public final aaih f12706c;

    /* renamed from: d */
    public final aagb f12707d;

    /* renamed from: e */
    public final dcg f12708e;

    /* renamed from: f */
    public final aaif f12709f;

    /* renamed from: g */
    volatile long f12710g = 0;

    /* renamed from: h */
    public final Object f12711h = new Object();

    /* renamed from: i */
    public volatile boolean f12712i;

    /* renamed from: j */
    private final Executor f12713j;

    public dav(Context context, aagb aagb, aaib aaib, aaih aaih, Executor executor, vyu vyu, dcg dcg) {
        this.f12704a = context;
        this.f12707d = aagb;
        this.f12705b = aaib;
        this.f12706c = aaih;
        this.f12713j = executor;
        this.f12708e = dcg;
        this.f12709f = new dat(vyu);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo8476a() {
        long currentTimeMillis = System.currentTimeMillis();
        aaia a = this.f12705b.mo16890a();
        if (a != null) {
            if (!a.mo16889b()) {
                this.f12706c.mo16897a(a);
                return;
            }
        }
        this.f12707d.mo16842a(4013, System.currentTimeMillis() - currentTimeMillis);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo8477b() {
        this.f12713j.execute(new dau(this));
    }
}
