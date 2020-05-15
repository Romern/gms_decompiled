package p000;

import java.util.Collection;

/* renamed from: bfmk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfmk extends bfmn {

    /* renamed from: l */
    private final int f114404l;

    public bfmk(long j, int i, int i2, int i3, int i4, Collection collection, int i5, int i6) {
        super(j, 2, i, 0, i2, collection, i5, i6, i4);
        this.f114404l = i3;
    }

    /* renamed from: a */
    public final String mo61934a() {
        if (this.f114421k == null) {
            int f = mo61951f();
            int i = this.f114413c;
            int i2 = this.f114414d;
            int i3 = this.f114404l;
            int i4 = this.f114412b;
            StringBuilder sb = new StringBuilder(59);
            sb.append(f);
            sb.append(":");
            sb.append(i);
            sb.append(":");
            sb.append(i2);
            sb.append(":");
            sb.append(i3);
            sb.append(":");
            sb.append(i4);
            this.f114421k = sb.toString();
        }
        return this.f114421k;
    }

    /* renamed from: b */
    public final boolean mo61937b() {
        return this.f114404l != -1;
    }

    /* renamed from: c */
    public final String mo61938c() {
        int i = this.f114404l;
        StringBuilder sb = new StringBuilder(17);
        sb.append(" lac: ");
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: d */
    public final long mo61939d() {
        try {
            return bunc.m120020a(this.f114414d, this.f114404l, this.f114412b);
        } catch (IllegalArgumentException e) {
            return -1;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bfmk) {
            bfmk bfmk = (bfmk) obj;
            return super.equals(bfmk) && this.f114404l == bfmk.f114404l;
        }
    }

    public final int hashCode() {
        return super.hashCode() ^ (this.f114404l * 3449);
    }

    /* renamed from: a */
    public final void mo61935a(bsax bsax) {
        bsax.mo70134g(1, this.f114404l);
    }

    /* renamed from: a */
    public final boolean mo61936a(bfmn bfmn) {
        return (bfmn instanceof bfmk) && this.f114404l == ((bfmk) bfmn).f114404l;
    }
}
