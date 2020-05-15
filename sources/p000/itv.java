package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.cryptauth.KeyInvalidationResult;
import com.google.android.gms.common.api.Status;
import java.util.Arrays;
import java.util.List;

/* renamed from: itv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class itv extends aaab {

    /* renamed from: f */
    private static final Logger f21724f = new Logger(new String[]{"InvalidateCustomKeyOperation"}, (byte[]) null);

    /* renamed from: a */
    private final irt f21725a;

    /* renamed from: b */
    private final int f21726b;

    /* renamed from: c */
    private final String f21727c;

    /* renamed from: d */
    private final Account f21728d;

    /* renamed from: e */
    private final List f21729e;

    public itv(irt irt, int i, String str, Account account, List list) {
        super(129, "InvalidateCustomKeyOperation");
        this.f21725a = irt;
        this.f21726b = i;
        this.f21727c = str;
        this.f21728d = account;
        this.f21729e = list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        f21724f.mo25412b("Invalidate custom key operation is called", new Object[0]);
        sdo.m34975b(this.f21727c.equals("fido:hardware_protected_uv"), "The key name must be fido hardware uv protected key");
        try {
            this.f21725a.mo13303a(new KeyInvalidationResult(1, ito.m16125a(new itd(context, this.f21726b, Arrays.asList(this.f21727c), null, this.f21728d, null, null, null, null, this.f21729e).mo13332a().f14968a)));
        } catch (ehf e) {
            Logger Logger = f21724f;
            String valueOf = String.valueOf(e.f14947a);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 54);
            sb.append("Failed to perform custom key invalidation. StatusCode=");
            sb.append(valueOf);
            Logger.mo25415d(sb.toString(), e, new Object[0]);
            this.f21725a.mo13304a(ito.m16125a(e.f14947a));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f21725a.mo13304a(status);
    }
}
