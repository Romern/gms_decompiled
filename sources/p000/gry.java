package p000;

import android.util.Log;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: gry */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gry implements grt {

    /* renamed from: a */
    private final grm f18916a;

    /* renamed from: b */
    private final grn f18917b;

    /* renamed from: c */
    private final byqk f18918c = new byqk(this.f18919d, new gru());

    /* renamed from: d */
    private final byqf f18919d;

    public gry(grm grm, grn grn) {
        byqf byqf = new byqf();
        this.f18916a = grm;
        this.f18917b = grn;
        this.f18919d = byqf;
    }

    /* renamed from: a */
    public final List mo12137a(String str, boolean z) {
        return mo12138a(str, z, null);
    }

    /* renamed from: a */
    public final List mo12138a(String str, boolean z, byte[] bArr) {
        int i;
        boolean z2;
        String str2;
        grv a = this.f18916a.mo12135a(str);
        if (a == null) {
            Log.e("TenDigitOtp", "Failed to get Authzen secret.");
            return null;
        }
        Long a2 = this.f18917b.mo12136a(a);
        if (!(a2 == null || a2.longValue() % 2 == 0)) {
            a2 = this.f18917b.mo12136a(a);
        }
        String valueOf = String.valueOf(a2);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
        sb.append("Current counter: ");
        sb.append(valueOf);
        sb.toString();
        if (a2 == null) {
            Log.e("TenDigitOtp", "Failed to get counter.");
            return null;
        }
        if (!z) {
            i = 1;
        } else {
            i = 2;
        }
        try {
            byqk byqk = this.f18918c;
            byte[] bArr2 = a.f18911b;
            long longValue = a2.longValue();
            byqk.m125127a(true);
            long a3 = byqf.m125121a();
            byqj byqj = new byqj(byqk.f167386b.mo12146a(bArr2), 9, byqk.f167385a);
            ArrayList arrayList = new ArrayList(2);
            for (long j = 0; j < 2; j++) {
                long j2 = (longValue + j) % 1000;
                byqk.m125127a(true);
                boolean z3 = false;
                if (j2 >= 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                byqk.m125127a(z2);
                if (j2 < 1000) {
                    z3 = true;
                }
                byqk.m125127a(z3);
                String a4 = byqj.mo74470a(a3, j2, i, bArr);
                if (j2 % 2 != 0) {
                    long j3 = (j2 % 50) / 10;
                    str2 = Long.toString(j3 + j3 + 1);
                } else {
                    str2 = Long.toString(j2 % 10);
                }
                String valueOf2 = String.valueOf(str2);
                String valueOf3 = String.valueOf(a4);
                arrayList.add(valueOf3.length() == 0 ? new String(valueOf2) : valueOf2.concat(valueOf3));
            }
            return arrayList;
        } catch (InvalidKeyException e) {
            Log.e("TenDigitOtp", "Failed to generate code.", e);
            return null;
        }
    }
}
