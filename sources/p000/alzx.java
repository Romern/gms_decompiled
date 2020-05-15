package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* renamed from: alzx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alzx extends alzl {

    /* renamed from: a */
    private final rlf f74551a;

    /* renamed from: a */
    public final void mo40528a(int i, Bundle bundle, Bundle bundle2) {
        Status a = amaz.m62474a(i, bundle);
        String str = null;
        String string = bundle2 != null ? bundle2.getString("circle_id") : null;
        if (bundle2 != null) {
            str = bundle2.getString("circle_name");
        }
        this.f74551a.mo9482a(new alzy(a, string, str));
    }

    public alzx(rlf rlf) {
        this.f74551a = rlf;
    }
}
