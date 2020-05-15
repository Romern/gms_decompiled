package androidx.slice;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SliceSpec implements avg {

    /* renamed from: a */
    public String f1670a;

    /* renamed from: b */
    public int f1671b;

    public SliceSpec() {
        this.f1671b = 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SliceSpec) {
            SliceSpec sliceSpec = (SliceSpec) obj;
            return this.f1670a.equals(sliceSpec.f1670a) && this.f1671b == sliceSpec.f1671b;
        }
    }

    public final int hashCode() {
        return this.f1670a.hashCode() + this.f1671b;
    }

    public final String toString() {
        return String.format("SliceSpec{%s,%d}", this.f1670a, Integer.valueOf(this.f1671b));
    }

    public SliceSpec(String str, int i) {
        this.f1670a = str;
        this.f1671b = i;
    }
}
