package p000;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Collection;

/* renamed from: rvl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rvl {

    /* renamed from: a */
    public final bpun f43759a;

    /* renamed from: b */
    public final Context f43760b;

    /* renamed from: c */
    public final rwg f43761c;

    /* renamed from: d */
    public bngx f43762d;

    /* renamed from: e */
    public final bngx f43763e;

    /* renamed from: f */
    public final bnhe f43764f;

    /* renamed from: g */
    public rud f43765g;

    /* renamed from: h */
    public final rvj f43766h;

    /* renamed from: i */
    public boolean f43767i;

    /* renamed from: j */
    public final boolean f43768j;

    public rvl(rvk rvk) {
        this.f43759a = rvk.f43749a;
        Context context = rvk.f43750b;
        bmxy.m108581a(context);
        this.f43760b = context;
        rwg rwg = rvk.f43751c;
        bmxy.m108581a(rwg);
        this.f43761c = rwg;
        this.f43762d = rvk.f43752d;
        this.f43763e = rvk.f43753e;
        this.f43764f = bnhe.m109413a(rvk.f43754f);
        this.f43765g = rvk.f43755g;
        this.f43766h = rvk.f43756h;
        this.f43767i = rvk.f43757i;
        this.f43768j = rvk.f43758j;
    }

    /* renamed from: c */
    public static rvk m34524c() {
        return new rvk();
    }

    /* renamed from: e */
    private final void m34525e() {
        ruf ruf;
        try {
            ruf = new ruf();
            this.f43765g = ruf.mo25179c();
            this.f43762d = bngx.m109368a((Collection) ruf.mo25176a());
            this.f43767i = true;
            ruf.close();
            return;
        } catch (SQLiteException e) {
            Log.e("FixerContext", "Couldn't fetch crashData or recent fixes", e);
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final rud mo25202a() {
        if (this.f43765g == null && !this.f43767i) {
            m34525e();
        }
        return this.f43765g;
    }

    /* renamed from: b */
    public final bngx mo25204b() {
        if (this.f43762d == null && !this.f43767i) {
            m34525e();
        }
        bngx bngx = this.f43762d;
        return bngx == null ? bngx.m109376e() : bngx;
    }

    /* renamed from: d */
    public final rvk mo25205d() {
        return new rvk(this);
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("entry_point", this.f43759a);
        a.mo25396a("context", this.f43760b);
        a.mo25396a("fixerLogger", this.f43761c);
        a.mo25396a("recentFixes", this.f43762d);
        a.mo25396a("fixesExecutedThisIteration", this.f43763e);
        a.mo25396a("fixStatusesExecutedThisIteration", this.f43764f);
        a.mo25396a("crashData", this.f43765g);
        a.mo25396a("currentFixer", this.f43766h);
        return a.toString();
    }

    /* renamed from: a */
    public final rve mo25203a(String str) {
        rve rve = (rve) this.f43764f.get(str);
        return rve == null ? new rve(str, 1) : rve;
    }
}
