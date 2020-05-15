package p000;

import java.util.Comparator;

/* renamed from: ecf */
final /* synthetic */ class ecf implements Comparator {

    /* renamed from: a */
    private final int f14669a;

    public ecf(int i) {
        this.f14669a = i;
    }

    public final int compare(Object obj, Object obj2) {
        int i = this.f14669a;
        int[] iArr = eci.f14678a;
        return -Float.compare(((ecg) obj).mo9951b(i), ((ecg) obj2).mo9951b(i));
    }
}
