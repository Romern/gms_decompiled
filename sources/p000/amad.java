package p000;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: amad */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amad extends alzl {

    /* renamed from: a */
    private final ambn f74566a;

    public amad(ambn ambn) {
        this.f74566a = ambn;
    }

    /* renamed from: a */
    public final void mo40532a(int i, Bundle bundle, DataHolder[] dataHolderArr) {
        int i2 = amaz.f74597e;
        ConnectionResult connectionResult = new ConnectionResult(i, amaz.m62473a(bundle));
        ambn ambn = this.f74566a;
        if (connectionResult.mo17671b()) {
            ambn.f74657e.mo41711a("people loaded");
        } else {
            ambn.f74657e.mo41711a("people load failure");
        }
        if (dataHolderArr != null && dataHolderArr.length >= 2) {
            DataHolder dataHolder = dataHolderArr[0];
        }
        synchronized (ambn.f74653a) {
            ambn.f74658f = true;
            ambn.f74659g = connectionResult;
            if (ambn.f74659g.mo17671b()) {
                ambn.f74660h = dataHolderArr[0];
                ambn.f74661i = dataHolderArr[1];
            }
        }
        if (!ambn.f74656d) {
            ambn.mo41116d();
        } else if (!ambn.f74659g.mo17671b()) {
            synchronized (ambn.f74653a) {
                ambn.f74662j = true;
            }
            ambn.mo41115c();
        } else {
            ambn.mo41112a();
        }
    }
}
