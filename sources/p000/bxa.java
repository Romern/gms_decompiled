package p000;

import java.util.Date;

/* renamed from: bxa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxa {

    /* renamed from: a */
    public final bqp f5940a;

    /* renamed from: b */
    private final Date f5941b;

    public bxa(bqp bqp, Date date) {
        this.f5940a = bqp;
        this.f5941b = date;
    }

    public final String toString() {
        cba a = cbb.m3876a(this);
        a.mo3643a();
        a.mo3645a("keyPackage", this.f5940a);
        a.mo3645a("utcTimeStamp", this.f5941b);
        return a.toString();
    }
}
