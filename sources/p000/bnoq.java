package p000;

import java.io.Serializable;
import java.util.Iterator;

/* renamed from: bnoq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnoq extends bnny implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final bnny f131932a;

    public bnoq(bnny bnny) {
        bmxy.m108581a(bnny);
        this.f131932a = bnny;
    }

    /* renamed from: a */
    public final bnny mo67377a() {
        return this.f131932a;
    }

    /* renamed from: b */
    public final Object mo68164b(Object obj, Object obj2) {
        return this.f131932a.mo68160a(obj, obj2);
    }

    /* renamed from: c */
    public final Object mo68167c(Iterable iterable) {
        return this.f131932a.mo68168d(iterable);
    }

    public final int compare(Object obj, Object obj2) {
        return this.f131932a.compare(obj2, obj);
    }

    /* renamed from: d */
    public final Object mo68168d(Iterable iterable) {
        return this.f131932a.mo68167c(iterable);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bnoq) {
            return this.f131932a.equals(((bnoq) obj).f131932a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f131932a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f131932a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 10);
        sb.append(valueOf);
        sb.append(".reverse()");
        return sb.toString();
    }

    /* renamed from: a */
    public final Object mo68160a(Object obj, Object obj2) {
        return this.f131932a.mo68164b(obj, obj2);
    }

    /* renamed from: b */
    public final Object mo68165b(Iterator it) {
        return this.f131932a.mo68161a(it);
    }

    /* renamed from: a */
    public final Object mo68161a(Iterator it) {
        return this.f131932a.mo68165b(it);
    }
}
