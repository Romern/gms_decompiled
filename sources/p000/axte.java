package p000;

import com.google.android.gms.wearable.internal.GetConnectedNodesResponse;
import java.util.ArrayList;
import java.util.List;

/* renamed from: axte */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axte extends axtc {
    public axte(rlf rlf) {
        super(rlf);
    }

    /* renamed from: a */
    public final void mo53453a(GetConnectedNodesResponse getConnectedNodesResponse) {
        ArrayList arrayList = new ArrayList();
        List list = getConnectedNodesResponse.f110939b;
        if (list != null) {
            arrayList.addAll(list);
        }
        mo53529a(new axsm(axsw.m83147a(getConnectedNodesResponse.f110938a), arrayList));
    }
}
