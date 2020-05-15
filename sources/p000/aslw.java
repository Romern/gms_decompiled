package p000;

import android.content.Intent;

/* renamed from: aslw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aslw {

    /* renamed from: a */
    public asly f89192a;

    /* renamed from: b */
    public aslx f89193b;

    /* renamed from: c */
    public Integer f89194c;

    /* renamed from: d */
    public Intent f89195d;

    /* renamed from: e */
    public Integer f89196e;

    /* renamed from: f */
    private Integer f89197f;

    /* renamed from: g */
    private Integer f89198g;

    /* renamed from: a */
    public final aslz mo49228a() {
        aslx aslx;
        Integer num;
        asly asly = this.f89192a;
        if (asly != null && (aslx = this.f89193b) != null && (num = this.f89197f) != null && this.f89198g != null) {
            return new aslz(asly, aslx, num.intValue(), this.f89198g.intValue(), this.f89194c, this.f89195d, this.f89196e);
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    public final void mo49230b(int i) {
        this.f89198g = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo49229a(int i) {
        this.f89197f = Integer.valueOf(i);
    }
}
