package p000;

import android.util.Log;
import com.google.android.gms.wearable.internal.GetConnectedNodesResponse;
import com.google.android.gms.wearable.internal.NodeParcelable;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: ayhr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayhr extends ayfu {

    /* renamed from: c */
    final /* synthetic */ axrs f97618c;

    /* renamed from: d */
    final /* synthetic */ ayja f97619d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayhr(ayja ayja, String str, axrs axrs) {
        super(str);
        this.f97619d = ayja;
        this.f97618c = axrs;
    }

    /* renamed from: a */
    public final void mo53991a() {
        ArrayList arrayList;
        try {
            ayja ayja = this.f97619d;
            if (ayja.f97740s) {
                Set<ayac> b = ayja.f97728g.mo53786b();
                arrayList = new ArrayList(b.size());
                for (ayac ayac : b) {
                    if (ayac.f96885b > 0 && !"cloud".equals(ayac.f96884a.f96814a)) {
                        arrayList.add(ayfy.m83947a(ayac));
                    }
                }
            } else {
                arrayList = new ArrayList(1);
                axzf a = this.f97619d.f97733l.mo60322a();
                if (a != null) {
                    arrayList.add(new NodeParcelable(a.f96814a, a.f96815b, 1, true));
                }
            }
            this.f97618c.mo53453a(new GetConnectedNodesResponse(0, arrayList));
        } catch (Exception e) {
            Log.e("WearableService", "getConnectedNodes: exception during processing", e);
            this.f97618c.mo53453a(new GetConnectedNodesResponse(8, null));
        }
    }
}
