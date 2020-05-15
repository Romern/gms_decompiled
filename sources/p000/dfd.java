package p000;

import java.util.Comparator;

/* renamed from: dfd */
final /* synthetic */ class dfd implements Comparator {

    /* renamed from: a */
    static final Comparator f13004a = new dfd();

    private dfd() {
    }

    public final int compare(Object obj, Object obj2) {
        din din = (din) obj;
        din din2 = (din) obj2;
        if (din == din2) {
            return 0;
        }
        int a = dik.m8576a(din.f13232b);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        int a2 = dik.m8576a(din2.f13232b);
        if (a2 != 0) {
            i = a2;
        }
        int i3 = i2 - (i - 1);
        if (i3 != 0) {
            return i3;
        }
        int compareTo = din.f13233c.compareTo(din2.f13233c);
        if (compareTo != 0) {
            return compareTo;
        }
        return 0;
    }
}
