package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: amao */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amao extends alzl {

    /* renamed from: a */
    private final rlf f74579a;

    /* renamed from: a */
    public final void mo40531a(int i, Bundle bundle, DataHolder dataHolder) {
        amey amey;
        Status a = amaz.m62474a(i, bundle);
        if (dataHolder != null) {
            amey = new amey(dataHolder);
        } else {
            amey = null;
        }
        this.f74579a.mo9482a(new amau(a, amey));
    }

    public amao(rlf rlf) {
        this.f74579a = rlf;
    }
}
