package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: bfjy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfjy {

    /* renamed from: j */
    public static final List f114242j;

    /* renamed from: a */
    public final ArrayList f114243a = new ArrayList();

    /* renamed from: b */
    public final Object f114244b = new Object();

    /* renamed from: c */
    public final boolean f114245c;

    /* renamed from: d */
    public boolean f114246d = false;

    /* renamed from: e */
    public boolean f114247e = true;

    /* renamed from: f */
    public boolean f114248f = false;

    /* renamed from: g */
    public boolean f114249g = false;

    /* renamed from: h */
    public boolean f114250h = false;

    /* renamed from: i */
    public int f114251i = 99;

    /* renamed from: k */
    private boolean f114252k = false;

    static {
        ArrayList arrayList = new ArrayList();
        f114242j = arrayList;
        arrayList.add(new bfla(6, 0, 11));
        f114242j.add(new bfla(11, 1, 16));
        f114242j.add(new bfla(16, 1, 23));
    }

    public bfjy(boolean z) {
        this.f114245c = z;
    }

    /* renamed from: f */
    private final int m97072f() {
        boolean a = mo61811a();
        boolean z = this.f114247e;
        if (a && !z && this.f114246d) {
            return 1;
        }
        if (!a) {
            return 99;
        }
        if (!z) {
            return this.f114246d ? 99 : 23;
        }
        return 22;
    }

    /* renamed from: a */
    public final synchronized void mo61809a(int i, int i2, boolean z) {
        float f;
        boolean z2;
        float a = bhct.m100646a(i, i2);
        if (!z) {
            f = 0.6f;
        } else {
            f = 0.2f;
        }
        if (a >= f) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f114246d = z2;
        mo61812b();
    }

    /* renamed from: c */
    public final String mo61814c() {
        return String.format("[canEnableForScheduler: %s, canEnableForCollector: %s, enabledInClient: %s, enabledInServer: %s, enabledInGservices: %s, hasRequiredSensors: %s, screenOn: %s, isBatteryHealthy: %s, isInWhitelist: %s, nlpEnabled: %s, isInDeepIdleMode: %s]", Boolean.valueOf(this.f114250h), Integer.valueOf(this.f114251i), true, Boolean.valueOf(this.f114248f), Boolean.valueOf(bfjg.m97018a(8)), Boolean.valueOf(this.f114245c), Boolean.valueOf(this.f114247e), Boolean.valueOf(this.f114246d), Boolean.valueOf(cfaj.m138528b()), Boolean.valueOf(this.f114249g), Boolean.valueOf(this.f114252k));
    }

    /* renamed from: d */
    public final boolean mo61816d() {
        return this.f114249g && bfjb.m96990a();
    }

    /* renamed from: e */
    public final synchronized void mo61817e() {
        mo61812b();
    }

    /* renamed from: b */
    public final void mo61812b() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (mo61811a() == this.f114250h) {
            if (m97072f() != 1) {
                z = false;
            } else {
                z = true;
            }
            if (this.f114251i != 1) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z != z2) {
                z3 = true;
            }
        } else {
            z3 = true;
        }
        this.f114250h = mo61811a();
        this.f114251i = m97072f();
        if (z3) {
            synchronized (this.f114244b) {
                Iterator it = this.f114243a.iterator();
                while (it.hasNext()) {
                    ((bhco) it.next()).mo62906a(this);
                }
                mo61814c();
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo61810a(boolean z) {
        this.f114247e = z;
        mo61812b();
    }

    /* renamed from: c */
    public final void mo61815c(boolean z) {
        this.f114252k = z;
        mo61812b();
    }

    /* renamed from: a */
    public final boolean mo61811a() {
        return this.f114245c && this.f114248f && cfaj.m138528b() && mo61816d() && !this.f114252k && bfjg.m97018a(8);
    }

    /* renamed from: b */
    public final void mo61813b(boolean z) {
        this.f114249g = z;
        mo61812b();
    }
}
