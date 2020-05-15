package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bsfj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsfj {

    /* renamed from: a */
    final List f144472a = new ArrayList();

    /* renamed from: b */
    public bsbs f144473b;

    /* renamed from: c */
    public final boolean f144474c = true;

    /* renamed from: a */
    public static bsfs m115683a(bsfs bsfs, bsbs bsbs, bsbs bsbs2) {
        bsfs bsfs2 = bsfs;
        bsbs bsbs3 = bsbs;
        bsbs bsbs4 = bsbs2;
        if (bsfs2 == null) {
            return null;
        }
        return new bsfs(bsfs2.f144497c, bsfs2.f144498d, bsbs4.mo70229b(bsbs3.mo70230b(bsfs2.mo70516a(0))), bsbs4.mo70227a(bsbs3.mo70228a(bsfs2.mo70516a(1))), bsfs2.mo70516a(2));
    }

    /* renamed from: a */
    public final boolean mo70510a() {
        return this.f144473b != null;
    }

    /* renamed from: a */
    public final bsfs mo70507a(int i, double d, int i2, int i3, double d2) {
        int i4 = i2;
        int i5 = i3;
        if (!mo70510a()) {
            mo70508a(i4, i5);
        }
        return new bsfs(i, d, this.f144473b.mo70229b(i5), this.f144473b.mo70227a(i4), d2);
    }

    /* renamed from: a */
    public final void mo70508a(int i, int i2) {
        bsbs bsbs = new bsbs(i, i2);
        bsbs bsbs2 = this.f144473b;
        this.f144473b = bsbs;
        List list = this.f144472a;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((bsfi) list.get(i3)).mo70262a(bsbs2, bsbs);
        }
    }

    /* renamed from: a */
    public final void mo70509a(bsfi bsfi) {
        this.f144472a.add(bsfi);
        bsbs bsbs = this.f144473b;
        if (bsbs != null) {
            bsfi.mo70262a(null, bsbs);
        }
    }
}
