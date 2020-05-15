package p000;

import android.util.SparseArray;

/* renamed from: arhg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arhg {

    /* renamed from: a */
    public byte[] f87723a;

    /* renamed from: b */
    public int f87724b = -1;

    /* renamed from: c */
    public int f87725c = 0;

    /* renamed from: d */
    public final SparseArray f87726d = new SparseArray();

    /* renamed from: a */
    public final void mo48537a(aroj aroj) {
        System.arraycopy(aroj.f88008e.mo73780k(), 0, this.f87723a, this.f87725c, aroj.f88008e.mo73744a());
        this.f87724b = aroj.f88006c;
        this.f87725c += aroj.f88008e.mo73744a();
        aroj aroj2 = (aroj) this.f87726d.get(this.f87724b + 1);
        if (aroj2 != null) {
            mo48537a(aroj2);
        }
    }
}
