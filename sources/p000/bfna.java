package p000;

import java.util.Collection;

/* renamed from: bfna */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfna extends bfmn {

    /* renamed from: l */
    public final int f114453l;

    /* renamed from: m */
    private final int f114454m;

    /* renamed from: n */
    private final int f114455n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bfna(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, Collection collection) {
        super(j, 4, i3, i, i2, collection != null ? collection : bfmn.f114411a, Integer.MAX_VALUE, Integer.MAX_VALUE, i7);
        this.f114453l = i4;
        this.f114454m = i5;
        this.f114455n = i6;
    }

    /* renamed from: a */
    public final String mo61934a() {
        if (this.f114421k == null) {
            int i = this.f114413c;
            int i2 = this.f114414d;
            int i3 = this.f114412b;
            StringBuilder sb = new StringBuilder(37);
            sb.append("6:");
            sb.append(i);
            sb.append(":");
            sb.append(i2);
            sb.append(":");
            sb.append(i3);
            this.f114421k = sb.toString();
        }
        return this.f114421k;
    }

    /* renamed from: b */
    public final boolean mo61937b() {
        return true;
    }

    /* renamed from: c */
    public final String mo61938c() {
        int i = this.f114453l;
        int i2 = this.f114454m;
        int i3 = this.f114455n;
        StringBuilder sb = new StringBuilder(59);
        sb.append(" pci: ");
        sb.append(i);
        sb.append(" tac ");
        sb.append(i2);
        sb.append(" timingAdvance ");
        sb.append(i3);
        return sb.toString();
    }

    /* renamed from: d */
    public final long mo61939d() {
        try {
            return bune.m120036a(this.f114413c, this.f114414d, this.f114412b);
        } catch (IllegalArgumentException e) {
            return -1;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bfna) {
            bfna bfna = (bfna) obj;
            return super.equals(bfna) && this.f114453l == bfna.f114453l && this.f114454m == bfna.f114454m;
        }
    }

    public final int hashCode() {
        return (super.hashCode() ^ (this.f114453l * 7013)) ^ (this.f114454m * 2939);
    }

    /* renamed from: a */
    public final void mo61935a(bsax bsax) {
        int i = this.f114455n;
        if (!(i == -1 || i == Integer.MAX_VALUE)) {
            bsax.mo70134g(7, i);
        }
        bsax.mo70134g(11, this.f114453l);
        bsax.mo70134g(12, this.f114454m);
    }

    /* renamed from: a */
    public final boolean mo61936a(bfmn bfmn) {
        if (bfmn instanceof bfna) {
            bfna bfna = (bfna) bfmn;
            return this.f114453l == bfna.f114453l && this.f114454m == bfna.f114454m;
        }
    }
}
