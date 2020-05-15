package p000;

import java.util.Collection;

/* renamed from: bfnd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfnd extends bfmn {

    /* renamed from: l */
    private final int f114464l;

    /* renamed from: m */
    private final int f114465m;

    /* renamed from: n */
    private final long f114466n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bfnd(long j, int i, int i2, long j2, int i3, int i4, int i5, Collection collection) {
        super(j, 5, 0, i, i2, collection != null ? collection : bfmn.f114411a, Integer.MAX_VALUE, Integer.MAX_VALUE, i5);
        this.f114466n = j2;
        this.f114464l = i3;
        this.f114465m = i4;
    }

    /* renamed from: a */
    public final String mo61934a() {
        if (this.f114421k == null) {
            int i = this.f114413c;
            int i2 = this.f114414d;
            long j = this.f114466n;
            StringBuilder sb = new StringBuilder(46);
            sb.append("7:");
            sb.append(i);
            sb.append(":");
            sb.append(i2);
            sb.append(":");
            sb.append(j);
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
        long j = this.f114466n;
        int i = this.f114464l;
        int i2 = this.f114465m;
        StringBuilder sb = new StringBuilder(59);
        sb.append(" nci: ");
        sb.append(j);
        sb.append(" pci: ");
        sb.append(i);
        sb.append(" tac ");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: d */
    public final long mo61939d() {
        try {
            return bung.m120047a(this.f114413c, this.f114414d, this.f114466n);
        } catch (IllegalArgumentException e) {
            return -1;
        }
    }

    /* renamed from: a */
    public final void mo61935a(bsax bsax) {
        bsax.mo70117b(13, this.f114466n);
        bsax.mo70134g(11, this.f114464l);
        bsax.mo70134g(12, this.f114465m);
    }

    /* renamed from: a */
    public final boolean mo61936a(bfmn bfmn) {
        if (bfmn instanceof bfnd) {
            bfnd bfnd = (bfnd) bfmn;
            return this.f114464l == bfnd.f114464l && this.f114465m == bfnd.f114465m && this.f114466n == bfnd.f114466n;
        }
    }
}
