package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: jps */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jps extends aaab {

    /* renamed from: a */
    private final jsa f23000a;

    /* renamed from: b */
    private final String f23001b;

    /* renamed from: c */
    private final Account f23002c;

    public jps(jsa jsa, String str, String str2) {
        super(142, "GetFeatureEnabledState");
        this.f23000a = jsa;
        this.f23001b = str;
        this.f23002c = new Account(str2, "com.google");
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        boolean z;
        try {
            bsni a = bsni.m116007a(this.f23001b);
            if (a != bsni.UNKNOWN_FEATURE) {
                z = true;
            } else {
                z = false;
            }
            sdo.m34974b(z);
            if (!soz.m35791a(context, this.f23002c)) {
                String valueOf = String.valueOf(this.f23002c.name);
                throw new aaaj(102, valueOf.length() == 0 ? new String("Account not found: ") : "Account not found: ".concat(valueOf));
            } else {
                this.f23000a.mo14029a(Status.f30107a, jlf.m16865a(context).mo13851a(this.f23002c, a) ? 1 : 0);
            }
        } catch (IllegalArgumentException e) {
            String valueOf2 = String.valueOf(this.f23001b);
            throw new aaaj(101, valueOf2.length() == 0 ? new String("Invalid feature name: ") : "Invalid feature name: ".concat(valueOf2));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f23000a.mo14029a(status, -1);
    }
}
