package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.auth.firstparty.delegate.TokenWorkflowRequest;
import com.google.android.gms.auth.firstparty.shared.AppDescription;

/* renamed from: gkp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gkp {

    /* renamed from: c */
    private static final sek f18420c = ght.m13171a("ReauthNotificationManager");

    /* renamed from: a */
    public final Context f18421a;

    /* renamed from: b */
    public final imx f18422b;

    /* renamed from: d */
    private final sex f18423d;

    /* renamed from: e */
    private final adyd f18424e;

    /* renamed from: f */
    private final gjy f18425f;

    /* renamed from: g */
    private final ily f18426g = ((ily) ily.f21320d.mo13145b());

    public gkp(Context context) {
        sex a = sex.m35104a(context);
        adyd a2 = adyd.m51363a(context);
        imx imx = new imx(context);
        gjy gjy = new gjy(context);
        this.f18421a = context;
        this.f18423d = a;
        this.f18424e = a2;
        this.f18422b = imx;
        this.f18425f = gjy;
    }

    /* renamed from: d */
    public static String m13339d(Account account) {
        return String.format("%s:%s:%s", "com.google.android.gms.auth.TokenNotificationManager", account.name, account.type);
    }

    /* renamed from: a */
    public final void mo11991a(Account account) {
        if (mo11994c(account)) {
            try {
                AppDescription appDescription = new AppDescription(this.f18421a.getPackageName(), this.f18421a.getApplicationInfo().uid, null, null);
                gjy gjy = this.f18425f;
                TokenWorkflowRequest tokenWorkflowRequest = new TokenWorkflowRequest();
                tokenWorkflowRequest.mo7666a(account);
                tokenWorkflowRequest.f10812b = "oauth2:https://www.googleapis.com/auth/accounts.reauth";
                tokenWorkflowRequest.f10818h = appDescription;
                mo11992a(m13339d(account), gjy.mo11950a(tokenWorkflowRequest), account, this.f18421a.getString(C0126R.string.account_level_title), BitmapFactory.decodeResource(this.f18421a.getResources(), C0126R.C0127drawable.ic_google), true);
            } catch (gkb e) {
                sek sek = f18420c;
                String valueOf = String.valueOf(e.getMessage());
                sek.mo25418e(valueOf.length() == 0 ? new String("Unable to get a valid intent to display the notification: ") : "Unable to get a valid intent to display the notification: ".concat(valueOf), new Object[0]);
            }
        }
    }

    /* renamed from: b */
    public final void mo11993b(Account account) {
        this.f18423d.mo25444a(m13339d(account), 0);
    }

    /* renamed from: c */
    public final boolean mo11994c(Account account) {
        if (account != null) {
            Account[] a = this.f18424e.mo33916a(account.type);
            int length = a.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (!a[i].equals(account)) {
                    i++;
                } else if (!this.f18426g.mo13131a(account)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo11992a(String str, PendingIntent pendingIntent, Account account, CharSequence charSequence, Bitmap bitmap, boolean z) {
        kag.m17570a(this.f18423d, this.f18421a, "com.google.android.gms.auth.base.Notifications.AuthGroup.AccountReauth");
        C1102je jeVar = new C1102je(this.f18421a);
        jeVar.mo13640e(charSequence);
        jeVar.mo13632b(account.name);
        jeVar.mo13630b(17301642);
        jeVar.mo13621a(bitmap);
        jeVar.f22254f = pendingIntent;
        jeVar.mo13633b(z);
        jeVar.mo13637c(true);
        jeVar.mo13639d(this.f18421a.getString(C0126R.string.notification_ticker));
        jeVar.mo13619a(System.currentTimeMillis());
        jeVar.f22244B = "com.google.android.gms.auth.base.Notifications.AuthGroup.AccountReauth";
        jeVar.mo13625a(new kah());
        this.f18423d.mo25445a(str, 0, jeVar.mo13629b());
    }
}
