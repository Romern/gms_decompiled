package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: qvd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qvd {

    /* renamed from: a */
    public final qrr f42220a;

    /* renamed from: b */
    private final Context f42221b;

    private qvd(Context context) {
        sdo.m34959a(context);
        this.f42221b = context;
        this.f42220a = new qrr(new shl(context, (String) qqv.f41965b.mo58455c(), ((Integer) qqv.f41966c.mo58455c()).intValue(), -1, 7938));
    }

    /* renamed from: a */
    public static qvd m32933a(Context context) {
        return new qvd(context);
    }

    /* renamed from: a */
    public final ClientContext mo24283a(acyr acyr) {
        Account a = acyr.mo33252a();
        int i = this.f42221b.getApplicationInfo().uid;
        String packageName = this.f42221b.getPackageName();
        ClientContext clientContext = new ClientContext(i, a, a, packageName, packageName);
        clientContext.mo17806d((String) qqv.f41967d.mo58455c());
        return clientContext;
    }
}
