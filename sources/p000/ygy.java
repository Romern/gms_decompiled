package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: ygy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ygy {

    /* renamed from: a */
    public final String f53786a;

    /* renamed from: b */
    public ygd f53787b = null;

    /* renamed from: c */
    public boolean f53788c = false;

    /* renamed from: d */
    public ynn f53789d = ynn.LOCAL_AND_REMOTE;

    /* renamed from: e */
    public boolean f53790e = false;

    /* renamed from: f */
    public boolean f53791f = false;

    /* renamed from: g */
    public long f53792g = 0;

    /* renamed from: h */
    public long f53793h = 0;

    /* renamed from: i */
    public bmxv f53794i = bmvz.f131120a;

    /* renamed from: j */
    public int f53795j = 0;

    public ygy(String str) {
        bmxy.m108581a(str);
        this.f53786a = str;
    }

    /* renamed from: a */
    public final ygz mo30475a() {
        return new ygz(this);
    }

    /* renamed from: b */
    public final void mo30477b() {
        this.f53791f = true;
    }

    /* renamed from: c */
    public final void mo30479c() {
        this.f53790e = true;
    }

    /* renamed from: b */
    public final void mo30478b(long j, TimeUnit timeUnit) {
        this.f53792g = timeUnit.toNanos(j);
    }

    /* renamed from: c */
    public final void mo30480c(long j, TimeUnit timeUnit) {
        this.f53793h = timeUnit.toNanos(j);
    }

    /* renamed from: a */
    public final void mo30476a(long j, TimeUnit timeUnit) {
        this.f53792g = timeUnit.toNanos(j);
    }
}
