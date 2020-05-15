package p000;

import android.util.Log;

/* renamed from: aeai */
final /* synthetic */ class aeai implements aubt {

    /* renamed from: a */
    private final aeat f62987a;

    /* renamed from: b */
    private final aic f62988b;

    /* renamed from: c */
    private final int f62989c;

    /* renamed from: d */
    private final int f62990d;

    public aeai(aeat aeat, aic aic, int i, int i2) {
        this.f62987a = aeat;
        this.f62988b = aic;
        this.f62989c = i;
        this.f62990d = i2;
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        aeat aeat = this.f62987a;
        aic aic = this.f62988b;
        int i = this.f62989c;
        int i2 = this.f62990d;
        Log.e("GmsTaskScheduler", "API unavailable, fallback to SchedulerClientBroadcastStrategy", exc);
        aic.mo749a(new aebr(aeat.f63009a, i, i2));
    }
}
