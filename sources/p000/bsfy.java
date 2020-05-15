package p000;

import java.util.ArrayDeque;
import java.util.ArrayList;

/* renamed from: bsfy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bsfy implements bsfz {

    /* renamed from: g */
    protected final bsgh f144509g;

    /* renamed from: h */
    public final bsgb f144510h;

    /* renamed from: i */
    protected final ArrayList f144511i;

    /* renamed from: j */
    protected final ArrayList f144512j;

    /* renamed from: k */
    public final ArrayDeque f144513k;

    public bsfy(bsgh bsgh, int i, double d) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        bxbm.m122542a(z, "numberOfParticles must be greater than 0!");
        bxbm.m122540a(bsgh, "seedBox needs to be set!");
        this.f144509g = bsgh;
        bsgb bsgb = new bsgb(bsgh, i, d);
        this.f144510h = bsgb;
        bsgb.mo70524a(this);
        this.f144511i = new ArrayList();
        this.f144512j = new ArrayList();
        this.f144513k = new ArrayDeque();
    }

    /* renamed from: a */
    public final void mo70261a(double d, bsfv bsfv) {
    }

    /* renamed from: b */
    public void mo70487b(bsfs bsfs) {
        throw null;
    }
}
