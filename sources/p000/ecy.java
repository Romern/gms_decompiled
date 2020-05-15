package p000;

import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;

/* renamed from: ecy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ecy implements Runnable {

    /* renamed from: a */
    public final dqd f14709a = new dqd();

    /* renamed from: b */
    public final String f14710b;

    /* renamed from: c */
    private final ContextManagerClientInfo f14711c;

    public ecy(ContextManagerClientInfo contextManagerClientInfo, String str) {
        this.f14711c = contextManagerClientInfo;
        this.f14710b = str;
    }

    public final void run() {
        try {
            eda.m10144a(this.f14711c, this.f14710b);
        } catch (SecurityException e) {
            new Object[1][0] = this.f14710b;
            dxm j = dwq.m9666j();
            j.f14362a.edit().remove(this.f14710b).apply();
        }
        dqd dqd = this.f14709a;
        if (dqd.mo9437a()) {
            dqd.f13808a.quit();
            dqd.f13808a = null;
            dqd.f13809b = null;
        }
    }
}
