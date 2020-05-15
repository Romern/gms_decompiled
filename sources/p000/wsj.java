package p000;

import android.content.Context;
import com.google.location.nearby.common.fastpair.DiscoveryListItem;
import java.util.List;

/* renamed from: wsj */
final /* synthetic */ class wsj implements bure {

    /* renamed from: a */
    private final wsl f51242a;

    public wsj(wsl wsl) {
        this.f51242a = wsl;
    }

    /* renamed from: a */
    public final void mo29352a(List list) {
        wsl wsl = this.f51242a;
        srn srn = wtw.f51331a;
        list.size();
        if (wsl.mo29355b()) {
            wtu wtu = wsl.f51245b;
            List a = wtu.m42252a(wtu.f51328b, list);
            wtu.m42252a(wtu.f51329c, list);
            wtu.mo29406a();
            int size = a.size();
            for (int i = 0; i < size; i++) {
                String str = ((DiscoveryListItem) a.get(i)).f191735a;
                if (str != null) {
                    Context context = wtu.f51327a;
                    context.startService(butb.m120417b(context).setAction("com.google.android.gms.nearby.discovery.ACTION_DEVICES_LIST_ACTIVITY_ITEM_VIEWED").putExtra("com.google.android.gms.nearby.discovery.EXTRA_ITEM_ID", str));
                }
            }
        }
    }
}
