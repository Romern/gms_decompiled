package p000;

import com.google.location.nearby.common.fastpair.DiscoveryListItem;
import java.util.Comparator;

/* renamed from: wtt */
final /* synthetic */ class wtt implements Comparator {

    /* renamed from: a */
    private final wtu f51326a;

    public wtt(wtu wtu) {
        this.f51326a = wtu;
    }

    public final int compare(Object obj, Object obj2) {
        wtu wtu = this.f51326a;
        return wtu.m42251a(wtu.f51328b, (DiscoveryListItem) obj) - wtu.m42251a(wtu.f51328b, (DiscoveryListItem) obj2);
    }
}
