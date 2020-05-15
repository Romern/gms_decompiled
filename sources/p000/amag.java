package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: amag */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amag extends alzl {

    /* renamed from: a */
    private final rlf f74570a;

    /* renamed from: a */
    public final void mo40531a(int i, Bundle bundle, DataHolder dataHolder) {
        amev amev;
        Status a = amaz.m62474a(i, bundle);
        if (dataHolder != null) {
            amev = new amev(dataHolder);
        } else {
            amev = null;
        }
        this.f74570a.mo9482a(new alzu(a, amev));
    }

    public amag(rlf rlf) {
        this.f74570a = rlf;
    }
}
