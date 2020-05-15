package p000;

import com.google.android.gms.contextmanager.internal.KeyFilterImpl;
import com.google.android.gms.contextmanager.internal.TimeFilterImpl;
import java.util.ArrayList;

/* renamed from: tjr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tjr {

    /* renamed from: a */
    private final doh f46208a;

    /* renamed from: b */
    private final int f46209b;

    /* renamed from: c */
    private final tmy f46210c;

    /* renamed from: d */
    private ArrayList f46211d;

    public tjr() {
        this.f46208a = null;
        this.f46209b = 2;
        this.f46210c = new tmy();
    }

    /* renamed from: c */
    private final void m37097c() {
        if (this.f46211d == null) {
            this.f46211d = new ArrayList();
        }
    }

    /* renamed from: a */
    public final tjt mo26595a() {
        return new tjt(this.f46208a, this.f46209b, this.f46211d, this.f46210c.mo26664a());
    }

    /* renamed from: b */
    public final void mo26598b() {
        sdo.m34974b(true);
        this.f46210c.mo26666b();
        this.f46210c.mo26665a(1);
    }

    public tjr(doh doh) {
        int i;
        this.f46208a = doh;
        if (doh == null) {
            i = 0;
        } else {
            i = 1;
        }
        this.f46209b = i;
        this.f46210c = new tmy();
    }

    /* renamed from: a */
    public final void mo26596a(int i, TimeFilterImpl timeFilterImpl) {
        m37097c();
        this.f46211d.add(new tjs(i, timeFilterImpl, null));
    }

    /* renamed from: a */
    public final void mo26597a(int i, TimeFilterImpl timeFilterImpl, KeyFilterImpl keyFilterImpl) {
        sdo.m34959a(keyFilterImpl);
        m37097c();
        this.f46211d.add(new tjs(i, timeFilterImpl, keyFilterImpl));
    }
}
