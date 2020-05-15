package p000;

import java.util.Date;

/* renamed from: begn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class begn {

    /* renamed from: a */
    public final Date f111544a;

    /* renamed from: b */
    public final int f111545b;

    static {
        new begn(1, null);
    }

    public begn(int i, Date date) {
        this.f111545b = i;
        this.f111544a = date;
    }

    /* renamed from: a */
    public final boolean mo60697a() {
        return this.f111545b == 1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof begn)) {
            return false;
        }
        begn begn = (begn) obj;
        if (this.f111545b != begn.f111545b) {
            return false;
        }
        if (mo60697a() || this.f111544a.getTime() == begn.f111544a.getTime()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!mo60697a()) {
            return this.f111544a.hashCode();
        }
        return 0;
    }
}
