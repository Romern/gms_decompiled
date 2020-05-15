package p000;

import java.util.Comparator;

/* renamed from: aibh */
final /* synthetic */ class aibh implements Comparator {

    /* renamed from: a */
    static final Comparator f68599a = new aibh();

    private aibh() {
    }

    public final int compare(Object obj, Object obj2) {
        Long E = ((ahsu) obj2).mo37058E();
        Long E2 = ((ahsu) obj).mo37058E();
        if (E == null && E2 == null) {
            return 0;
        }
        if (E == null) {
            return -1;
        }
        if (E2 == null) {
            return 1;
        }
        return E.compareTo(E2);
    }
}
