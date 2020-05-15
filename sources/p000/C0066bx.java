package p000;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: bx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0066bx {

    /* renamed from: a */
    public final C1411uo f5931a;

    /* renamed from: b */
    public final C1397ua f5932b;

    /* renamed from: c */
    Executor f5933c = C0069c.f6313b;

    /* renamed from: d */
    public final List f5934d = new CopyOnWriteArrayList();

    /* renamed from: e */
    public boolean f5935e;

    /* renamed from: f */
    public C0915ct f5936f;

    /* renamed from: g */
    public C0915ct f5937g;

    /* renamed from: h */
    public int f5938h;

    /* renamed from: i */
    public C0911cq f5939i = new C0911cq(this);

    public C0066bx(abh abh, C1406uj ujVar) {
        this.f5931a = new C1399uc(abh);
        C1395tz tzVar = new C1395tz(ujVar);
        if (tzVar.f27234a == null) {
            synchronized (C1395tz.f27232c) {
                if (C1395tz.f27233d == null) {
                    C1395tz.f27233d = Executors.newFixedThreadPool(2);
                }
            }
            tzVar.f27234a = C1395tz.f27233d;
        }
        this.f5932b = new C1397ua(tzVar.f27234a, tzVar.f27235b);
    }

    /* renamed from: a */
    public final int mo3566a() {
        C0915ct ctVar = this.f5936f;
        if (ctVar != null) {
            return ctVar.size();
        }
        C0915ct ctVar2 = this.f5937g;
        if (ctVar2 != null) {
            return ctVar2.size();
        }
        return 0;
    }

    /* renamed from: b */
    public final void mo3567b() {
        for (C0916cu cuVar : this.f5934d) {
        }
    }
}
