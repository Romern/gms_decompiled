package p000;

import java.util.Comparator;

/* renamed from: apdt */
final /* synthetic */ class apdt implements Comparator {

    /* renamed from: a */
    static final Comparator f84191a = new apdt();

    private apdt() {
    }

    public final int compare(Object obj, Object obj2) {
        apej apej = (apej) obj;
        apej apej2 = (apej) obj2;
        aoyh aoyh = apeh.f84210c;
        if (apej != null) {
            if (apej2 == null) {
                return -1;
            }
            long j = apej.f84231c;
            long j2 = apej2.f84231c;
            if (j != j2) {
                return j <= j2 ? 1 : -1;
            }
            return 0;
        }
    }
}
