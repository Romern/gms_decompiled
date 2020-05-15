package p000;

/* renamed from: aykp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aykp {

    /* renamed from: a */
    public final int f97864a;

    /* renamed from: b */
    public final int f97865b;

    /* renamed from: c */
    public final int f97866c;

    /* renamed from: d */
    public final int f97867d;

    /* renamed from: e */
    public final int f97868e;

    public aykp(int i, int i2, int i3, int i4, int i5) {
        this.f97864a = i;
        this.f97865b = i2;
        this.f97866c = i3;
        this.f97867d = i4;
        this.f97868e = i5;
    }

    /* renamed from: a */
    public final int mo54063a() {
        if (this.f97864a == 2) {
            return (this.f97867d + this.f97866c) - this.f97868e;
        }
        throw new NoSuchMethodException("Can't call this method of non length delimited field");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            aykp aykp = (aykp) obj;
            return this.f97864a == aykp.f97864a && this.f97865b == aykp.f97865b && this.f97866c == aykp.f97866c && this.f97867d == aykp.f97867d && this.f97868e == aykp.f97868e;
        }
    }

    public final int hashCode() {
        return (((((((this.f97864a * 31) + this.f97865b) * 31) + this.f97866c) * 31) + this.f97867d) * 31) + this.f97868e;
    }

    public final String toString() {
        int i = this.f97864a;
        int i2 = this.f97865b;
        int i3 = this.f97866c;
        int i4 = this.f97867d;
        int i5 = this.f97868e;
        StringBuilder sb = new StringBuilder(117);
        sb.append("ProtoField{wireType=");
        sb.append(i);
        sb.append(", id=");
        sb.append(i2);
        sb.append(", size=");
        sb.append(i3);
        sb.append(", beginningIndex=");
        sb.append(i4);
        sb.append(", childSize=");
        sb.append(i5);
        sb.append('}');
        return sb.toString();
    }
}
