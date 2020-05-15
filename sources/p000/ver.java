package p000;

import java.util.Set;

/* renamed from: ver */
final /* synthetic */ class ver implements vfa {

    /* renamed from: a */
    private final veq f49140a;

    /* renamed from: b */
    private final boolean f49141b;

    /* renamed from: c */
    private final uey f49142c;

    /* renamed from: d */
    private final vfd f49143d;

    public ver(vfd vfd, veq veq, boolean z, uey uey) {
        this.f49143d = vfd;
        this.f49140a = veq;
        this.f49141b = z;
        this.f49142c = uey;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0064, code lost:
        if (r4.remove(r1) == false) goto L_0x0066;
     */
    /* renamed from: a */
    public final void mo28362a() {
        vfd vfd = this.f49143d;
        veq veq = this.f49140a;
        boolean z = this.f49141b;
        uey uey = this.f49142c;
        ves ves = vfd.f49161b;
        vem vem = veq.f49138g;
        synchronized (((vev) ves).f49148c) {
            if (!((vev) ves).f49150e.remove(vem)) {
                vev.f49146a.mo25377c("NetworkStoreImpl", "Attempt to remove listener that has not been added.");
            }
        }
        vfd.f49162c.mo18283b(veq.f49136e);
        vel vel = veq.f49137f;
        if (z) {
            Set set = ((vfg) vfd.f49164e).f49168b;
            sdo.m34959a(vel);
            if (!set.remove(vel)) {
                vfg.f49167a.mo25377c("PreferencesImpl", "Attempt to remove sync preferences listener which was not added.");
                return;
            }
            return;
        }
        uce uce = vfd.f49163d;
        synchronized (((ucf) uce).f47236c) {
            Set set2 = (Set) ((ucf) uce).f47236c.get(uey);
            if (set2 == null) {
            }
            ucf.f47234a.mo25377c("AppPreferencesStoreImpl", "The listener was not added.");
            if (set2 != null && set2.isEmpty()) {
                ((ucf) uce).f47236c.remove(uey);
            }
        }
    }
}
