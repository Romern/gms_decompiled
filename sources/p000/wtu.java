package p000;

import android.content.Context;
import com.google.location.nearby.common.fastpair.DiscoveryListItem;
import java.util.ArrayList;
import java.util.List;

/* renamed from: wtu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wtu {

    /* renamed from: a */
    public final Context f51327a;

    /* renamed from: b */
    public final ArrayList f51328b = new ArrayList();

    /* renamed from: c */
    public final ArrayList f51329c = new ArrayList();

    /* renamed from: d */
    public wsi f51330d;

    public wtu(Context context) {
        this.f51327a = context;
    }

    /* renamed from: a */
    public static final int m42251a(List list, DiscoveryListItem discoveryListItem) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            DiscoveryListItem discoveryListItem2 = (DiscoveryListItem) list.get(i);
            i++;
            if (discoveryListItem2.f191735a.equals(discoveryListItem.f191735a)) {
                return list.indexOf(discoveryListItem2);
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo29406a() {
        wsi wsi = this.f51330d;
        if (wsi != null) {
            ArrayList arrayList = this.f51328b;
            wsc wsc = wsi.f51241a.f51244a;
            wsc.f51232d.clear();
            wsc.f51232d.addAll(arrayList);
            wsc.mo29347c();
            wsc.mo171aJ();
        }
    }

    /* renamed from: a */
    public static final List m42252a(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            DiscoveryListItem discoveryListItem = (DiscoveryListItem) list2.get(i);
            int size2 = list.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    list.add(discoveryListItem);
                    arrayList.add(discoveryListItem);
                    break;
                }
                int i3 = i2 + 1;
                if (((DiscoveryListItem) list.get(i2)).f191735a.equals(discoveryListItem.f191735a)) {
                    break;
                }
                i2 = i3;
            }
        }
        return arrayList;
    }
}
