package p000;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;

/* renamed from: rjq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rjq extends Exception {

    /* renamed from: a */
    public final C1223np f43153a;

    public rjq(C1223np npVar) {
        this.f43153a = npVar;
    }

    public final String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (rkz rkz : this.f43153a.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) this.f43153a.get(rkz);
            if (connectionResult.mo17671b()) {
                z = false;
            }
            String a = rkz.mo24840a();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 2 + String.valueOf(valueOf).length());
            sb.append(a);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
