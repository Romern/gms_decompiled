package p000;

import java.math.BigInteger;
import java.util.Arrays;

/* renamed from: xlz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xlz extends xlx {

    /* renamed from: b */
    public final BigInteger f52717b;

    /* renamed from: c */
    public final BigInteger f52718c;

    /* renamed from: d */
    public final xly f52719d;

    public xlz(xpr xpr, xly xly, BigInteger bigInteger, BigInteger bigInteger2) {
        super(xpr);
        bmxy.m108581a(bigInteger);
        this.f52717b = bigInteger;
        bmxy.m108581a(bigInteger2);
        this.f52718c = bigInteger2;
        bmxy.m108581a(xly);
        this.f52719d = xly;
    }

    /* renamed from: a */
    public final bypu mo29930a() {
        try {
            return bypx.m125084a(new bypt(bypx.m125083a(1), bypx.m125083a(2)), new bypt(bypx.m125083a(3), bypx.m125083a((long) ((xpr) this.f52710a).f52878f)), new bypt(bypx.m125083a(-1), bypx.m125083a((long) this.f52719d.f52715d)), new bypt(bypx.m125083a(-2), bypx.m125082a(xlt.m43151a(this.f52717b, this.f52719d.f52716e))), new bypt(bypx.m125083a(-3), bypx.m125082a(xlt.m43151a(this.f52718c, this.f52719d.f52716e))));
        } catch (bypm e) {
            throw new IllegalStateException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xlz) {
            xlz xlz = (xlz) obj;
            if (!bmxi.m108538a(this.f52710a, xlz.f52710a) || !this.f52717b.equals(xlz.f52717b) || !this.f52718c.equals(xlz.f52718c) || !bmxi.m108538a(this.f52719d, xlz.f52719d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f52710a, this.f52717b, this.f52718c, this.f52719d});
    }
}
