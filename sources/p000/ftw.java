package p000;

import java.util.Arrays;

/* renamed from: ftw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ftw {

    /* renamed from: a */
    public final String f17228a;

    /* renamed from: b */
    public final ftz[] f17229b;

    public ftw(String str, ftz[] ftzArr) {
        this.f17228a = str;
        int length = ftzArr.length;
        if (length != 0) {
            ftz[] ftzArr2 = new ftz[length];
            System.arraycopy(ftzArr, 0, ftzArr2, 0, length);
            this.f17229b = ftzArr2;
            return;
        }
        throw new IllegalArgumentException("Must provide at least 1 CorpusTableMapping");
    }

    /* renamed from: a */
    private final Object[] m12391a() {
        return new Object[]{this.f17228a, this.f17229b};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ftw)) {
            return false;
        }
        return Arrays.deepEquals(m12391a(), ((ftw) obj).m12391a());
    }

    public final int hashCode() {
        return Arrays.deepHashCode(m12391a());
    }
}
