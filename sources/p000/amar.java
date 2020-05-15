package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: amar */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amar extends alzl {

    /* renamed from: a */
    private final rlf f74582a;

    /* renamed from: a */
    public final void mo40531a(int i, Bundle bundle, DataHolder dataHolder) {
        String str;
        Status a = amaz.m62474a(i, bundle);
        amfb a2 = amaz.m62472a(dataHolder);
        if (dataHolder != null) {
            str = dataHolder.f30166f.getString("pageToken");
        } else {
            str = null;
        }
        this.f74582a.mo9482a(new amax(a, a2, str));
    }

    public amar(rlf rlf) {
        this.f74582a = rlf;
    }
}
