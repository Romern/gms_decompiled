package p000;

import com.google.android.gms.thunderbird.config.provider.EmergencyConfigChimeraContentProvider;
import com.google.android.gms.thunderbird.state.DeviceState;
import java.util.List;

/* renamed from: augd */
public final /* synthetic */ class augd implements bmxz {

    /* renamed from: a */
    private final List f91757a;

    public augd(List list) {
        this.f91757a = list;
    }

    /* renamed from: a */
    public final boolean mo6527a(Object obj) {
        List list = this.f91757a;
        aufq aufq = (aufq) obj;
        int i = EmergencyConfigChimeraContentProvider.f109064a;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            if (aufq.mo50495a((DeviceState) list.get(i2))) {
                return true;
            }
            i2 = i3;
        }
        return false;
    }
}
