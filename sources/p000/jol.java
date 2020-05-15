package p000;

import java.util.Comparator;

/* renamed from: jol */
final /* synthetic */ class jol implements Comparator {

    /* renamed from: a */
    static final Comparator f22938a = new jol();

    private jol() {
    }

    public final int compare(Object obj, Object obj2) {
        int i = joo.f22939a;
        return (((jrn) obj2).mo7837j() > ((jrn) obj).mo7837j() ? 1 : (((jrn) obj2).mo7837j() == ((jrn) obj).mo7837j() ? 0 : -1));
    }
}
