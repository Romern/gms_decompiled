package p000;

import com.google.android.gms.nearby.connection.PayloadTransferUpdate;

/* renamed from: arbn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arbn extends ahir {

    /* renamed from: a */
    final /* synthetic */ arbr f87290a;

    public arbn(arbr arbr) {
        this.f87290a = arbr;
    }

    /* renamed from: a */
    public final void mo20150a(String str, ahiq ahiq) {
        arbr.f87299b.mo25409a("Received payload.", new Object[0]);
        if (!str.equals(this.f87290a.f87304g)) {
            sek sek = arbr.f87299b;
            String str2 = this.f87290a.f87304g;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 62 + String.valueOf(str).length());
            sb.append("Connected to ");
            sb.append(str2);
            sb.append(", but receiving payloads from ");
            sb.append(str);
            sb.append("! Ignoring payload.");
            sek.mo25418e(sb.toString(), new Object[0]);
        } else if (ahiq.f67252b == 1) {
            byte[] bArr = ahiq.f67253c;
            arbr arbr = this.f87290a;
            if (!arbr.f87308k.f87143e) {
                armu armu = arbr.f87302e;
                if (armu != null) {
                    armu.mo48352a(bArr);
                    return;
                }
                return;
            }
            arbr.mo48372a(bArr, str);
        } else {
            throw new IllegalArgumentException("Smart Setup should only be sending or receiving byte payloads!");
        }
    }

    /* renamed from: a */
    public final void mo20151a(String str, PayloadTransferUpdate payloadTransferUpdate) {
    }
}
