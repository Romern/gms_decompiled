package p000;

import android.content.SharedPreferences;

/* renamed from: fny */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fny extends fkj {

    /* renamed from: a */
    public SharedPreferences f16989a;

    /* renamed from: b */
    public final fnx f16990b;

    /* renamed from: c */
    private long f16991c;

    /* renamed from: e */
    private long f16992e = -1;

    protected fny(fkm fkm) {
        super(fkm);
        mo10943h();
        this.f16990b = new fnx(this, "monitoring", ((Long) fni.f16920F.mo11021a()).longValue());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10890a() {
        this.f16989a = mo10939f().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    }

    /* renamed from: b */
    public final long mo11050b() {
        fje.m11804a();
        mo10954t();
        long j = this.f16991c;
        if (j != 0) {
            return j;
        }
        long j2 = this.f16989a.getLong("first_run", 0);
        if (j2 == 0) {
            long a = mo10936e().mo20505a();
            SharedPreferences.Editor edit = this.f16989a.edit();
            edit.putLong("first_run", a);
            if (!edit.commit()) {
                mo10940f("Failed to commit first run time");
            }
            this.f16991c = a;
            return a;
        }
        this.f16991c = j2;
        return j2;
    }

    /* renamed from: c */
    public final long mo11051c() {
        fje.m11804a();
        mo10954t();
        long j = this.f16992e;
        if (j != -1) {
            return j;
        }
        long j2 = this.f16989a.getLong("last_dispatch", 0);
        this.f16992e = j2;
        return j2;
    }

    /* renamed from: d */
    public final void mo11052d() {
        fje.m11804a();
        mo10954t();
        long a = mo10936e().mo20505a();
        SharedPreferences.Editor edit = this.f16989a.edit();
        edit.putLong("last_dispatch", a);
        edit.apply();
        this.f16992e = a;
    }
}
