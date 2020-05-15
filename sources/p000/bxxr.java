package p000;

import java.util.ArrayDeque;
import java.util.Arrays;

/* renamed from: bxxr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxxr {

    /* renamed from: a */
    public final ArrayDeque f165050a = new ArrayDeque();

    /* renamed from: a */
    private static final int m124305a(int i) {
        int binarySearch = Arrays.binarySearch(bxxu.f165060a, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }

    /* renamed from: a */
    public final void mo74232a(bxtx bxtx) {
        if (bxtx.mo73752d()) {
            int a = m124305a(bxtx.mo73744a());
            int f = bxxu.m124313f(a + 1);
            if (this.f165050a.isEmpty() || ((bxtx) this.f165050a.peek()).mo73744a() >= f) {
                this.f165050a.push(bxtx);
                return;
            }
            int f2 = bxxu.m124313f(a);
            bxtx bxtx2 = (bxtx) this.f165050a.pop();
            while (!this.f165050a.isEmpty() && ((bxtx) this.f165050a.peek()).mo73744a() < f2) {
                bxtx2 = new bxxu((bxtx) this.f165050a.pop(), bxtx2);
            }
            bxxu bxxu = new bxxu(bxtx2, bxtx);
            while (!this.f165050a.isEmpty() && ((bxtx) this.f165050a.peek()).mo73744a() < bxxu.m124313f(m124305a(bxxu.f165062d) + 1)) {
                bxxu = new bxxu((bxtx) this.f165050a.pop(), bxxu);
            }
            this.f165050a.push(bxxu);
        } else if (bxtx instanceof bxxu) {
            bxxu bxxu2 = (bxxu) bxtx;
            int i = bxxu.f165061h;
            mo74232a(bxxu2.f165063e);
            mo74232a(bxxu2.f165064f);
        } else {
            String valueOf = String.valueOf(bxtx.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
            sb.append("Has a new type of ByteString been created? Found ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
