package p000;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.List;

/* renamed from: avdi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avdi implements avab, rkk {

    /* renamed from: a */
    private final Status f92994a;

    /* renamed from: b */
    private final avab f92995b;

    public avdi(Status status, avab avab) {
        this.f92994a = status;
        this.f92995b = avab;
    }

    /* renamed from: a */
    public final List mo51103a() {
        Status status = this.f92994a;
        if (status != null && status.mo17710c()) {
            avab avab = this.f92995b;
            if (avab == null) {
                return Collections.emptyList();
            }
            return avab.mo51103a();
        }
        Log.e("OptedInAccRes", "Can't call getters on result as API call failed.");
        return Collections.emptyList();
    }

    /* renamed from: b */
    public final List mo51104b() {
        Status status = this.f92994a;
        if (status != null && status.mo17710c()) {
            avab avab = this.f92995b;
            if (avab == null) {
                return Collections.emptyList();
            }
            return avab.mo51104b();
        }
        Log.e("OptedInAccRes", "Can't call getters on result as API call failed.");
        return Collections.emptyList();
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f92994a;
    }
}
