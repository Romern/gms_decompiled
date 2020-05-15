package p000;

import android.os.Build;
import android.view.WindowInsets;

/* renamed from: qh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C1296qh {

    /* renamed from: a */
    public static final C1296qh f26855a = new C1289qa().mo15717a().mo15743i().mo15741h().mo15740g();

    /* renamed from: b */
    private final C1295qg f26856b;

    private C1296qh(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        this.f26856b = new C1294qf(this, windowInsets);
    }

    /* renamed from: a */
    static C1166ln m19995a(C1166ln lnVar, int i, int i2, int i3, int i4) {
        int max = Math.max(0, lnVar.f26426b - i);
        int max2 = Math.max(0, lnVar.f26427c - i2);
        int max3 = Math.max(0, lnVar.f26428d - i3);
        int max4 = Math.max(0, lnVar.f26429e - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? lnVar : C1166ln.m19401a(max, max2, max3, max4);
    }

    /* renamed from: b */
    public int mo15733b() {
        return mo15744j().f26427c;
    }

    /* renamed from: c */
    public int mo15735c() {
        return mo15744j().f26428d;
    }

    /* renamed from: d */
    public int mo15736d() {
        return mo15744j().f26429e;
    }

    /* renamed from: e */
    public boolean mo15737e() {
        return !mo15744j().equals(C1166ln.f26425a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1296qh) {
            return C1239oe.m19757a(this.f26856b, ((C1296qh) obj).f26856b);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo15739f() {
        return this.f26856b.mo15722c();
    }

    /* renamed from: g */
    public C1296qh mo15740g() {
        return this.f26856b.mo15724e();
    }

    /* renamed from: h */
    public C1296qh mo15741h() {
        return this.f26856b.mo15723d();
    }

    public int hashCode() {
        C1295qg qgVar = this.f26856b;
        if (qgVar != null) {
            return qgVar.hashCode();
        }
        return 0;
    }

    /* renamed from: i */
    public C1296qh mo15743i() {
        return this.f26856b.mo15728h();
    }

    /* renamed from: j */
    public C1166ln mo15744j() {
        return this.f26856b.mo15721b();
    }

    /* renamed from: k */
    public C1166ln mo15745k() {
        return this.f26856b.mo15730i();
    }

    /* renamed from: l */
    public WindowInsets mo15746l() {
        C1295qg qgVar = this.f26856b;
        if (qgVar instanceof C1291qc) {
            return ((C1291qc) qgVar).f26850a;
        }
        return null;
    }

    public C1296qh(C1296qh qhVar) {
        if (qhVar != null) {
            C1295qg qgVar = qhVar.f26856b;
            int i = Build.VERSION.SDK_INT;
            if (!(qgVar instanceof C1294qf)) {
                int i2 = Build.VERSION.SDK_INT;
                if (!(qgVar instanceof C1293qe)) {
                    int i3 = Build.VERSION.SDK_INT;
                    if (!(qgVar instanceof C1292qd)) {
                        int i4 = Build.VERSION.SDK_INT;
                        if (qgVar instanceof C1291qc) {
                            this.f26856b = new C1291qc(this, (C1291qc) qgVar);
                        } else {
                            this.f26856b = new C1295qg(this);
                        }
                    } else {
                        this.f26856b = new C1292qd(this, (C1292qd) qgVar);
                    }
                } else {
                    this.f26856b = new C1293qe(this, (C1293qe) qgVar);
                }
            } else {
                this.f26856b = new C1294qf(this, (C1294qf) qgVar);
            }
        } else {
            this.f26856b = new C1295qg(this);
        }
    }

    /* renamed from: b */
    public C1296qh mo15734b(int i, int i2, int i3, int i4) {
        return this.f26856b.mo15719a(i, i2, i3, i4);
    }

    /* renamed from: a */
    public static C1296qh m19996a(WindowInsets windowInsets) {
        C1244oj.m19766a(windowInsets);
        return new C1296qh(windowInsets);
    }

    /* renamed from: a */
    public int mo15731a() {
        return mo15744j().f26426b;
    }

    @Deprecated
    /* renamed from: a */
    public C1296qh mo15732a(int i, int i2, int i3, int i4) {
        C1289qa qaVar = new C1289qa(this);
        qaVar.mo15718a(C1166ln.m19401a(i, i2, i3, i4));
        return qaVar.mo15717a();
    }
}
