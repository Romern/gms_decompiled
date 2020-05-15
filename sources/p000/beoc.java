package p000;

import java.util.Arrays;

/* renamed from: beoc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beoc {

    /* renamed from: a */
    static final Object[] f111923a = new Object[0];

    /* renamed from: b */
    public static final beoc f111924b = new beoc(f111923a);

    /* renamed from: c */
    public final Object[] f111925c;

    /* renamed from: d */
    private final int f111926d;

    public beoc(Object... objArr) {
        this.f111925c = objArr;
        this.f111926d = Arrays.hashCode(objArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof beoc)) {
            return false;
        }
        beoc beoc = (beoc) obj;
        return this.f111926d == beoc.f111926d && Arrays.equals(this.f111925c, beoc.f111925c);
    }

    public final int hashCode() {
        return this.f111926d;
    }

    public final String toString() {
        return Arrays.toString(this.f111925c);
    }
}
