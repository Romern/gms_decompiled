package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: gho */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gho {

    /* renamed from: a */
    public final Context f18270a;

    /* renamed from: b */
    private final ghn f18271b;

    public gho(Context context) {
        this.f18270a = context;
        this.f18271b = new ghn(new shl(context, cbwv.f178492a.mo6606a().mo75560a(), (int) cbwv.f178492a.mo6606a().mo75561b(), -1, 4103));
    }

    /* renamed from: a */
    public static boolean m13165a(Throwable th) {
        chus chus = chus.OK;
        chuv chuv = th instanceof chux ? ((chux) th).f189238a : th instanceof chuw ? ((chuw) th).f189236a : null;
        if (chuv == null) {
            chuv = chuv.f189217d;
        }
        int ordinal = chuv.f189233s.ordinal();
        return ordinal == 1 || ordinal == 4 || ordinal == 8 || ordinal == 10 || ordinal == 13 || ordinal == 14;
    }

    /* renamed from: a */
    public final void mo11883a() {
        this.f18271b.f18269a.mo25561g();
    }

    /* renamed from: a */
    public final ClientContext mo11882a(Account account, String str) {
        String str2;
        ClientContext clientContext = new ClientContext();
        clientContext.f30216f = "com.google.android.gms";
        if (!str.isEmpty()) {
            clientContext.f30212b = spn.m35897i(this.f18270a, str);
            clientContext.f30215e = str;
        }
        if (account != null) {
            try {
                str2 = gik.m13216d(this.f18270a, account, "oauth2:https://www.googleapis.com/auth/auditrecording-pa");
            } catch (gid | IOException e) {
                str2 = null;
            }
            if (str2 != null) {
                clientContext.f30214d = account;
                clientContext.f30213c = account;
                clientContext.mo17806d("https://www.googleapis.com/auth/auditrecording-pa");
                clientContext.mo17798a("auth_token", str2);
            }
        }
        return clientContext;
    }

    /* renamed from: a */
    public final void mo11884a(ClientContext clientContext, bssn bssn) {
        ghn ghn = this.f18271b;
        if (ghn.f18268c == null) {
            ghn.f18268c = chtv.m149566a(chtu.UNARY, "google.internal.api.auditrecording.v1.AuditRecordingMobileService/CreateAuditRecord", ciie.m150370a(bssn.f146882h), ciie.m150370a(bsso.f146891a));
        }
        bsso bsso = (bsso) ghn.f18269a.mo25553a(ghn.f18268c, clientContext, bssn, (long) ghn.f18267b, TimeUnit.MILLISECONDS);
    }
}
