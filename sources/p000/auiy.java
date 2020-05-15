package p000;

import android.util.Log;
import com.google.android.gms.thunderbird.state.EmergencyInfo;
import java.util.Iterator;
import java.util.List;

/* renamed from: auiy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auiy extends auit {
    public auiy(augv augv, EmergencyInfo emergencyInfo, Iterable iterable) {
        super(augv, emergencyInfo, iterable);
        bmxy.m108588a("SMS".equals(emergencyInfo.mo59538b()));
    }

    /* renamed from: a */
    public final void mo50570a(auit auit) {
        int i;
        if ("SMS".equals(auit.mo50561bL().f109072b) && auit.mo50561bL().f109075e >= mo50561bL().f109075e) {
            List list = this.f91916e;
            int size = list.size();
            int i2 = 0;
            while (i2 < size) {
                auiq auiq = (auiq) list.get(i2);
                Iterator it = auit.f91916e.iterator();
                while (true) {
                    i = i2 + 1;
                    if (!it.hasNext()) {
                        break;
                    }
                    auiq auiq2 = (auiq) it.next();
                    aufq aufq = auiq.f91895a;
                    boolean z = aufq.f91720b;
                    aufq aufq2 = auiq2.f91895a;
                    if (z == aufq2.f91720b && aufq == aufq2) {
                        it.remove();
                        auiq.mo50558a(Math.max(auiq.f91902h, (auit.mo50561bL().f109075e - mo50561bL().f109075e) + auiq2.f91902h));
                        if (auho.m77070a()) {
                            String valueOf = String.valueOf(auiq);
                            String valueOf2 = String.valueOf(auit);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21 + String.valueOf(valueOf2).length());
                            sb.append(valueOf);
                            sb.append(" merged in work from ");
                            sb.append(valueOf2);
                            Log.d("Thunderbird", sb.toString());
                        }
                    }
                }
                i2 = i;
            }
        }
    }
}
