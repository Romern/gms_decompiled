package p000;

import java.io.InputStream;
import java.io.Serializable;

/* renamed from: bxd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bxd implements Serializable {

    /* renamed from: a */
    public long f5947a;

    /* renamed from: b */
    public bxb f5948b = null;

    /* renamed from: c */
    public cat f5949c;

    /* renamed from: d */
    public bxp f5950d;

    /* renamed from: e */
    public Long f5951e;

    /* renamed from: f */
    public byte[] f5952f;

    /* renamed from: g */
    public byte[] f5953g;

    /* renamed from: a */
    public abstract bqp mo3438a(InputStream inputStream);

    /* renamed from: a */
    public abstract bxg mo3439a();

    /* renamed from: b */
    public bxa mo3440b() {
        return ((bpz) this.f5949c).mo3405a(this);
    }

    /* renamed from: d */
    public final bxb mo3578d() {
        bxb bxb = this.f5948b;
        if (bxb != null) {
            return bxb;
        }
        throw new IllegalStateException("Application data is not loaded");
    }

    /* renamed from: e */
    public final byl mo3579e() {
        return this.f5948b.mo3429d();
    }

    /* renamed from: f */
    public final byl mo3580f() {
        return this.f5948b.mo3431e();
    }

    public final String toString() {
        return "dcid=null";
    }
}
