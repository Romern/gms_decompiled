package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* renamed from: bsfq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsfq extends bsgc {

    /* renamed from: a */
    final List f144493a = new ArrayList();

    /* renamed from: b */
    private final Random f144494b;

    public bsfq(bsgh bsgh) {
        super(bsgh);
        this.f144494b = bsgh.mo70530b();
    }

    /* renamed from: a */
    public final void mo70511a() {
        boolean z;
        if (this.f144523d.f144497c == 3) {
            z = true;
        } else {
            z = false;
        }
        bxbm.m122543a(z, "Expected type# %s, but got type# %s.", 3, Integer.valueOf(this.f144523d.f144497c));
        bsfc bsfc = (bsfc) this.f144523d;
        bsfs bsfs = bsfc.f144431a;
        if (bsfs != null) {
            this.f144493a.add(bsfs);
        }
        bsfs bsfs2 = bsfc.f144432b;
        if (bsfs2 != null) {
            this.f144493a.add(bsfs2);
        }
    }

    /* renamed from: b */
    public final void mo70513b() {
        this.f144493a.clear();
    }

    /* renamed from: a */
    public final void mo70512a(bsft bsft) {
        bsft.f144500a = this.f144523d.f144498d;
        List list = this.f144493a;
        bsfs bsfs = (bsfs) list.get(this.f144494b.nextInt(list.size()));
        double a = this.f144522c.mo70526a() * bsfs.mo70516a(2);
        double nextDouble = this.f144494b.nextDouble() * 3.141592653589793d;
        bsft.f144501b[0] = bsfs.mo70516a(0) + (Math.cos(nextDouble) * a);
        bsft.f144501b[1] = bsfs.mo70516a(1) + (Math.sin(nextDouble) * a);
    }
}
