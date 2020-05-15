package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.cryptauth.AppClaim;
import com.google.android.gms.auth.cryptauth.KeyRegistrationResult;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: itx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class itx extends aaab {

    /* renamed from: i */
    private static final Logger f21735i = new Logger(new String[]{"RegisterForCustomKeyOperation"}, (byte[]) null);

    /* renamed from: a */
    private final irw f21736a;

    /* renamed from: b */
    private final int f21737b;

    /* renamed from: c */
    private final String f21738c;

    /* renamed from: d */
    private final String f21739d;

    /* renamed from: e */
    private final Account f21740e;

    /* renamed from: f */
    private final byte[] f21741f;

    /* renamed from: g */
    private final byte[] f21742g;

    /* renamed from: h */
    private final byte[] f21743h;

    public itx(irw irw, int i, String str, String str2, Account account, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(129, "RegisterForCustomKeyOperation");
        this.f21736a = irw;
        this.f21737b = i;
        this.f21738c = str;
        this.f21739d = str2;
        this.f21740e = account;
        this.f21741f = bArr;
        this.f21742g = bArr2;
        this.f21743h = bArr3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        byte[] bArr;
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f21741f);
        try {
            ehi a = new itd(context, this.f21737b, Arrays.asList(this.f21738c), this.f21739d, this.f21740e, arrayList, null, this.f21742g, this.f21743h, null).mo13332a();
            eho a2 = a.mo10148a(this.f21738c);
            ArrayList arrayList2 = new ArrayList();
            if (a2 != null) {
                List list = a2.f14985a;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    eha eha = (eha) list.get(i);
                    arrayList2.add(new AppClaim(eha.f14901a, eha.f14902b, eha.f14903c));
                }
            }
            Status a3 = ito.m16125a(a.f14968a);
            if (a2 != null) {
                bArr = a2.f14988d;
            } else {
                bArr = null;
            }
            this.f21736a.mo13305a(new KeyRegistrationResult(a3, bArr, arrayList2));
        } catch (ehf e) {
            Logger Logger = f21735i;
            String valueOf = String.valueOf(e.f14947a.toString());
            Logger.mo25415d(valueOf.length() == 0 ? new String("Failed to perform enrollment. StatusCode=") : "Failed to perform enrollment. StatusCode=".concat(valueOf), e, new Object[0]);
            this.f21736a.mo13306a(ito.m16125a(e.f14947a));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f21736a.mo13306a(status);
    }
}
