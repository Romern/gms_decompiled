package p000;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: ply */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ply {

    /* renamed from: e */
    public final qav f39640e;

    /* renamed from: f */
    protected final Context f39641f;

    /* renamed from: g */
    public final ScheduledExecutorService f39642g;

    /* renamed from: h */
    protected final phy f39643h;

    /* renamed from: i */
    protected final poj f39644i;

    /* renamed from: j */
    public boolean f39645j;

    protected ply(Context context, ScheduledExecutorService scheduledExecutorService, phy phy, String str, poj poj) {
        qav qav = new qav("DeviceScanner");
        this.f39640e = qav;
        qav.mo23669a(str);
        this.f39641f = context;
        this.f39642g = scheduledExecutorService;
        this.f39643h = phy;
        this.f39644i = poj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo23382a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo23384a(Set set, int i);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo23386b(Set set, int i);

    /* renamed from: d */
    public final void mo23394d() {
        mo23382a();
        this.f39645j = false;
    }
}
