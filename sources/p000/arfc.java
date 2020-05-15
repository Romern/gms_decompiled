package p000;

import com.google.android.gms.nearby.connection.PayloadTransferUpdate;

/* renamed from: arfc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arfc extends ahir {

    /* renamed from: a */
    final /* synthetic */ arfd f87556a;

    public arfc(arfd arfd) {
        this.f87556a = arfd;
    }

    /* renamed from: a */
    public final void mo20150a(String str, ahiq ahiq) {
        arfd.f87557a.mo25409a("Received payload.", new Object[0]);
        if (!str.equals(this.f87556a.f87563g)) {
            sek sek = arfd.f87557a;
            String str2 = this.f87556a.f87563g;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 62 + String.valueOf(str).length());
            sb.append("Connected to ");
            sb.append(str2);
            sb.append(", but receiving payloads from ");
            sb.append(str);
            sb.append("! Ignoring payload.");
            sek.mo25418e(sb.toString(), new Object[0]);
        } else if (ahiq.f67252b == 1) {
            byte[] bArr = ahiq.f67253c;
            arfd arfd = this.f87556a;
            if (!arfd.f87569m) {
                armu armu = arfd.f87567k;
                if (armu != null) {
                    armu.mo48352a(bArr);
                    return;
                }
                return;
            }
            arfd.mo48479a(bArr, str);
        } else {
            throw new IllegalArgumentException("Smart Setup should only be sending or receiving byte payloads!");
        }
    }

    /* renamed from: a */
    public final void mo20151a(String str, PayloadTransferUpdate payloadTransferUpdate) {
    }
}
