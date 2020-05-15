package p000;

import java.util.List;

/* renamed from: bhtr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhtr {

    /* renamed from: a */
    public final List f119565a;

    /* renamed from: b */
    public final long f119566b;

    public bhtr(List list, long j) {
        this.f119565a = list;
        this.f119566b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bhtr) {
            bhtr bhtr = (bhtr) obj;
            return this.f119566b == bhtr.f119566b && bhxi.m101705a(this.f119565a, bhtr.f119565a);
        }
    }

    public final int hashCode() {
        long j = this.f119566b;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        long j = this.f119566b;
        String valueOf = String.valueOf(this.f119565a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 54);
        sb.append("timeInMillis=");
        sb.append(j);
        sb.append("; detectedActivities ");
        sb.append(valueOf);
        return sb.toString();
    }
}
