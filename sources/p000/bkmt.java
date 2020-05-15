package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/* renamed from: bkmt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bkmt {

    /* renamed from: c */
    final LinkedList f124905c;

    /* renamed from: d */
    final String f124906d;

    /* renamed from: e */
    int f124907e;

    /* renamed from: f */
    protected bkmq f124908f = new bkmr();

    public bkmt(bkpx bkpx) {
        this.f124906d = bkpx.f125106c;
        this.f124905c = new LinkedList(bkpx.f125107d);
        this.f124907e = bkpx.f125105b;
    }

    /* renamed from: d */
    private final synchronized int mo66119d() {
        return this.f124907e;
    }

    /* renamed from: a */
    public abstract bkpv mo66114a(blhg blhg);

    /* renamed from: a */
    public abstract void mo66115a();

    /* renamed from: a */
    public final void mo66121a(bkmq bkmq) {
        bkww.m106781a(bkmq, "operationReceivedHandler");
        this.f124908f = bkmq;
    }

    /* renamed from: b */
    public abstract bkqi mo66117b();

    /* renamed from: c */
    public abstract boolean mo66118c();

    /* renamed from: f */
    public final synchronized boolean mo66122f() {
        return !this.f124905c.isEmpty();
    }

    /* renamed from: g */
    public final bkpx mo66123g() {
        return new bkpx(mo66119d(), this.f124906d, Collections.unmodifiableList(new ArrayList(this.f124905c)));
    }
}
