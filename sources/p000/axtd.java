package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.GetAllCapabilitiesResponse;
import java.util.HashMap;
import java.util.List;

/* renamed from: axtd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axtd extends axtc {
    public axtd(rlf rlf) {
        super(rlf);
    }

    /* renamed from: a */
    public final void mo53444a(GetAllCapabilitiesResponse getAllCapabilitiesResponse) {
        Status a = axsw.m83147a(getAllCapabilitiesResponse.f110919a);
        List list = getAllCapabilitiesResponse.f110920b;
        HashMap hashMap = new HashMap();
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                CapabilityInfoParcelable capabilityInfoParcelable = (CapabilityInfoParcelable) list.get(i);
                hashMap.put(capabilityInfoParcelable.f110898a, new axpz(capabilityInfoParcelable));
            }
        }
        mo53529a(new axqa(a, hashMap));
    }
}
