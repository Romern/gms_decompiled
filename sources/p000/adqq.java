package p000;

import java.util.Arrays;

/* renamed from: adqq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adqq {

    /* renamed from: a */
    public final Long f62514a;

    /* renamed from: b */
    public final Long f62515b;

    public adqq(Long l, Long l2) {
        this.f62514a = l;
        this.f62515b = l2;
    }

    /* renamed from: a */
    public final boolean mo33713a() {
        return this.f62514a.longValue() < this.f62515b.longValue();
    }

    public final boolean equals(Object obj) {
        adqq adqq;
        if (!(obj instanceof adqq) || (adqq = (adqq) obj) == null || !adqq.f62514a.equals(this.f62514a) || !adqq.f62515b.equals(this.f62515b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f62514a, this.f62515b});
    }

    public final String toString() {
        return String.format("%d %d", this.f62514a, this.f62515b);
    }
}
