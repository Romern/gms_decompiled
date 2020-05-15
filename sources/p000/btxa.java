package p000;

import java.util.Comparator;

/* renamed from: btxa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btxa {

    /* renamed from: c */
    public static final Comparator f152783c = new btwz();

    /* renamed from: a */
    public final int f152784a;

    /* renamed from: b */
    public final int f152785b;

    public btxa(int i, int i2) {
        this.f152784a = i;
        this.f152785b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof btxa) {
            btxa btxa = (btxa) obj;
            if (this.f152784a == btxa.f152784a && this.f152785b == btxa.f152785b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f152784a * 31) + this.f152785b;
    }
}
