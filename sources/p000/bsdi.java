package p000;

import java.util.ArrayList;

/* renamed from: bsdi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bsdi implements adyr {

    /* renamed from: a */
    public final ArrayList f144169a = new ArrayList();

    /* renamed from: b */
    protected int f144170b = 1;

    public bsdi(bsfy bsfy) {
        bxbm.m122540a(bsfy, "EvidenceListener can not be null!");
        this.f144169a.add(bsfy);
    }

    /* renamed from: a */
    public final void mo70265a(int i, long j) {
        if (i == this.f144170b) {
            mo70266a(new bsfs(4, bsgk.m115737a(j)));
        }
    }

    /* renamed from: m */
    public final void mo31163m(long j) {
        mo70265a(1, j);
    }

    /* renamed from: a */
    public final void mo70266a(bsfs bsfs) {
        ArrayList arrayList = this.f144169a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((bsfy) arrayList.get(i)).mo70487b(bsfs);
        }
    }
}
