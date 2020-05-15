package p000;

import java.util.Collection;

/* renamed from: bfmv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfmv extends bfmn {

    /* renamed from: l */
    public final int f114431l;

    /* renamed from: m */
    private final int f114432m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bfmv(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, Collection collection) {
        super(j, i, i2, i3, i4, collection, Integer.MAX_VALUE, Integer.MAX_VALUE, i7);
        int i8 = i6;
        this.f114432m = i5;
        int i9 = -1;
        if (!(i8 == Integer.MAX_VALUE || i8 == 0)) {
            i9 = i8;
        }
        this.f114431l = i9;
    }

    /* renamed from: a */
    public final String mo61934a() {
        if (this.f114421k == null) {
            int f = mo61951f();
            if (this.f114419i == 3) {
                int i = this.f114413c;
                int i2 = this.f114414d;
                int i3 = this.f114412b;
                StringBuilder sb = new StringBuilder(50);
                sb.append(f);
                sb.append(":");
                sb.append(i);
                sb.append(":");
                sb.append(i2);
                sb.append(":-1:");
                sb.append(i3);
                this.f114421k = sb.toString();
            } else {
                int i4 = this.f114413c;
                int i5 = this.f114414d;
                int i6 = this.f114432m;
                int i7 = this.f114412b;
                StringBuilder sb2 = new StringBuilder(59);
                sb2.append(f);
                sb2.append(":");
                sb2.append(i4);
                sb2.append(":");
                sb2.append(i5);
                sb2.append(":");
                sb2.append(i6);
                sb2.append(":");
                sb2.append(i7);
                this.f114421k = sb2.toString();
            }
        }
        return this.f114421k;
    }

    /* renamed from: b */
    public final boolean mo61937b() {
        return this.f114432m != -1;
    }

    /* renamed from: c */
    public final String mo61938c() {
        int i = this.f114432m;
        int i2 = this.f114431l;
        StringBuilder sb = new StringBuilder(34);
        sb.append(" lac: ");
        sb.append(i);
        sb.append(" psc: ");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: d */
    public final long mo61939d() {
        try {
            if (this.f114419i != 3) {
                return bund.m120027a(this.f114413c, this.f114414d, this.f114432m, this.f114412b);
            }
            return bunh.m120054a(this.f114413c, this.f114414d, this.f114412b);
        } catch (IllegalArgumentException e) {
            return -1;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bfmv) {
            bfmv bfmv = (bfmv) obj;
            return this.f114432m == bfmv.f114432m && this.f114431l == bfmv.f114431l && super.equals(obj);
        }
    }

    public final int hashCode() {
        return (super.hashCode() ^ (this.f114432m * 3701)) ^ (this.f114431l * 2687);
    }

    /* renamed from: a */
    public final void mo61935a(bsax bsax) {
        bsax.mo70134g(1, this.f114432m);
        int i = this.f114431l;
        if (i != -1) {
            bsax.mo70134g(8, i);
        }
    }

    /* renamed from: a */
    public final boolean mo61936a(bfmn bfmn) {
        if (bfmn instanceof bfmv) {
            bfmv bfmv = (bfmv) bfmn;
            int i = bfmv.f114431l;
            boolean z = i != -1;
            int i2 = this.f114431l;
            return z == (i2 != -1) && this.f114432m == bfmv.f114432m && i2 == i;
        }
    }
}
