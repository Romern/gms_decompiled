package p000;

import java.util.Comparator;

/* renamed from: bump */
final /* synthetic */ class bump implements Comparator {

    /* renamed from: a */
    static final Comparator f154254a = new bump();

    private bump() {
    }

    public final int compare(Object obj, Object obj2) {
        return (((bumq) obj).f154257c > ((bumq) obj2).f154257c ? 1 : (((bumq) obj).f154257c == ((bumq) obj2).f154257c ? 0 : -1));
    }
}
