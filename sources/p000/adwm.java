package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Process;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: adwm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adwm {

    /* renamed from: a */
    public final adwn f62836a;

    /* renamed from: b */
    private final Context f62837b;

    public adwm(Context context, adwn adwn) {
        this.f62837b = context;
        this.f62836a = adwn;
    }

    /* renamed from: a */
    public static adwm m51286a(Context context) {
        return new adwm(context, new adwn(new shl(context, ceqz.f183340a.mo6606a().mo79674n(), (int) ceqz.f183340a.mo6606a().mo79677q(), context.getApplicationInfo().uid, 17920)));
    }

    /* renamed from: a */
    public final void mo33870a() {
        this.f62836a.f62841a.mo25561g();
    }

    /* renamed from: a */
    public final ClientContext mo33869a(Account account) {
        Context context = this.f62837b;
        String valueOf = String.valueOf(ceqz.m138037f());
        String d = gik.m13216d(context, account, valueOf.length() == 0 ? new String("oauth2:") : "oauth2:".concat(valueOf));
        ClientContext clientContext = new ClientContext();
        clientContext.f30216f = "com.google.android.gms";
        clientContext.f30212b = Process.myUid();
        clientContext.f30215e = this.f62837b.getPackageName();
        clientContext.f30214d = account;
        clientContext.f30213c = account;
        clientContext.mo17806d(ceqz.m138037f());
        clientContext.mo17798a("auth_token", d);
        return clientContext;
    }
}
