package p000;

import android.accounts.Account;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: whc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class whc {

    /* renamed from: a */
    private static wih f50633a;

    /* renamed from: a */
    public static ClientContext m41942a(String str) {
        ClientContext clientContext;
        if (cdsh.m134825d()) {
            clientContext = new ClientContext();
        } else {
            clientContext = new ClientContext(Process.myUid(), str, str, "com.google.android.gms", "com.google.android.gms");
        }
        if (cdsh.m134825d()) {
            clientContext.f30212b = Process.myUid();
            if (!TextUtils.isEmpty(str)) {
                Account account = new Account(str, "com.google");
                clientContext.f30214d = account;
                clientContext.f30213c = account;
            }
            clientContext.f30215e = "com.google.android.gms";
            clientContext.f30216f = "com.google.android.gms";
        }
        clientContext.mo17806d(cdsw.f181668a.mo6606a().mo78263a());
        return clientContext;
    }

    /* renamed from: a */
    public static wih m41943a() {
        if (f50633a == null) {
            f50633a = new wih(new whd(rpr.m34216b().getApplicationContext(), cdsw.f181668a.mo6606a().mo78264b(), (int) cdsw.f181668a.mo6606a().mo78265c()));
        }
        return f50633a;
    }
}
