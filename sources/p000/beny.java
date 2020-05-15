package p000;

import java.util.Date;

/* renamed from: beny */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beny {

    /* renamed from: a */
    public static final beny f111906a = new beny(1, null);

    /* renamed from: b */
    private final Date f111907b;

    /* renamed from: c */
    private final int f111908c;

    public beny(int i, Date date) {
        this.f111908c = i;
        this.f111907b = date;
    }

    /* renamed from: a */
    public final Date mo60836a() {
        if (this.f111908c == 2) {
            return this.f111907b;
        }
        throw new IllegalStateException("GcRule is not an expiration");
    }

    /* renamed from: b */
    public final boolean mo60837b() {
        return this.f111908c == 1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof beny)) {
            return false;
        }
        beny beny = (beny) obj;
        if (this.f111908c != beny.f111908c) {
            return false;
        }
        if (mo60837b() || this.f111907b.getTime() == beny.f111907b.getTime()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!mo60837b()) {
            return this.f111907b.hashCode();
        }
        return 0;
    }
}
