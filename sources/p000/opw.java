package p000;

/* renamed from: opw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class opw {

    /* renamed from: a */
    public final int f38213a;

    /* renamed from: b */
    public final int f38214b;

    /* renamed from: c */
    public final int f38215c;

    /* renamed from: d */
    public final int f38216d;

    /* renamed from: e */
    public final int f38217e;

    public opw(int i, int i2, int i3, int i4, int i5) {
        this.f38213a = i;
        this.f38214b = i2;
        this.f38215c = i3;
        this.f38216d = i4;
        this.f38217e = i5;
    }

    public final String toString() {
        int i = this.f38213a;
        int i2 = this.f38214b;
        int i3 = this.f38215c;
        int i4 = this.f38216d;
        int i5 = this.f38217e;
        StringBuilder sb = new StringBuilder(98);
        sb.append(" programId:");
        sb.append(i);
        sb.append(" uMVP:");
        sb.append(i2);
        sb.append(" uST:");
        sb.append(i3);
        sb.append(" aPosition:");
        sb.append(i4);
        sb.append(" aTexture:");
        sb.append(i5);
        return sb.toString();
    }
}
