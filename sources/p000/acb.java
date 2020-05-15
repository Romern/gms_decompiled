package p000;

import android.util.SparseArray;

/* renamed from: acb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acb {

    /* renamed from: a */
    public final SparseArray f142a = new SparseArray();

    /* renamed from: b */
    public int f143b = 0;

    /* renamed from: a */
    static final long m384a(long j, long j2) {
        return j != 0 ? ((j / 4) * 3) + (j2 / 4) : j2;
    }

    /* renamed from: a */
    public final void mo274a() {
        this.f143b++;
    }

    /* renamed from: b */
    public final void mo275b() {
        this.f143b--;
    }

    /* renamed from: a */
    public final aca mo273a(int i) {
        aca aca = (aca) this.f142a.get(i);
        if (aca != null) {
            return aca;
        }
        aca aca2 = new aca();
        this.f142a.put(i, aca2);
        return aca2;
    }
}
