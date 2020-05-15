package p000;

import java.util.Arrays;

/* renamed from: bewx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bewx {

    /* renamed from: a */
    public final float[] f112861a;

    /* renamed from: b */
    public final boolean f112862b;

    /* renamed from: c */
    public final int f112863c;

    public bewx(float[] fArr, boolean z, int i) {
        this.f112861a = fArr;
        this.f112862b = z;
        this.f112863c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bewx) {
            return Arrays.equals(this.f112861a, ((bewx) obj).f112861a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f112861a)), Boolean.valueOf(this.f112862b)});
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f112861a);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 2);
        sb.append("{");
        sb.append(arrays);
        sb.append("}");
        return sb.toString();
    }
}
