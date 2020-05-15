package com.google.android.gms.auth.account.p016be.accountstate;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.gms.auth.account.be.accountstate.LoginAccountsChangedChimeraIntentService */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LoginAccountsChangedChimeraIntentService extends TracingIntentService {

    /* renamed from: a */
    private static final sek f9996a = ght.m13171a("LoginAccountsChangedIntentService");

    /* renamed from: b */
    private Context f9997b;

    /* renamed from: c */
    private gkk f9998c;

    /* renamed from: d */
    private gkp f9999d;

    public LoginAccountsChangedChimeraIntentService() {
        super("LoginAccountsChangedIntentService");
    }

    /* renamed from: a */
    private static final Set m6291a(Set set) {
        C1225nr nrVar = new C1225nr(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            nrVar.add(((gks) it.next()).f18430a);
        }
        return nrVar;
    }

    public final void onCreate() {
        super.onCreate();
        this.f9997b = this;
        this.f9998c = new gkk(this.f9997b);
        this.f9999d = new gkp(this.f9997b);
    }

    LoginAccountsChangedChimeraIntentService(Context context, gkp gkp) {
        super("LoginAccountsChangedIntentService");
        this.f9997b = context;
        this.f9998c = new gkk(this.f9997b);
        this.f9999d = gkp;
        setIntentRedelivery(true);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ca A[Catch:{ IOException -> 0x0124, all -> 0x0132 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cb A[Catch:{ IOException -> 0x0124, all -> 0x0132 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0105 A[Catch:{ IOException -> 0x0124, all -> 0x0132 }] */
    /* renamed from: a */
    public final void mo6499a(Intent intent) {
        Context context;
        Set a;
        Set a2;
        Set a3;
        Account[] accountArr;
        Account[] accountArr2;
        Account[] accountArr3;
        Intent intent2;
        ims ims;
        if (intent != null) {
            try {
                String action = intent.getAction();
                if (!"android.accounts.LOGIN_ACCOUNTS_CHANGED".equals(action) && !"BootOrGmsUpdated".equals(action)) {
                    f9996a.mo25416d("Received unknown action: %s. Stopping.", action);
                    context = this.f9997b;
                }
                gkz a4 = gkz.m13355a(this.f9997b);
                f9996a.mo25412b("AccountsChange - added: %s removed: %s mutated: %s", a4.f18448a, a4.f18449b, a4.f18450c);
                a = m6291a(a4.f18448a);
                a2 = m6291a(a4.f18449b);
                a3 = m6291a(a4.f18450c);
                if (a.isEmpty() || !a2.isEmpty() || !a3.isEmpty()) {
                    gkk gkk = this.f9998c;
                    accountArr = (Account[]) a.toArray(new Account[((C1225nr) a).f26758b]);
                    accountArr2 = (Account[]) a2.toArray(new Account[((C1225nr) a2).f26758b]);
                    accountArr3 = (Account[]) a3.toArray(new Account[((C1225nr) a3).f26758b]);
                    intent2 = new Intent("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE");
                    ims = new ims();
                    if (accountArr != null && accountArr.length > 0) {
                        intent2.addCategory("com.google.android.gms.auth.category.ACCOUNT_ADDED");
                        ims.mo13148b(gkk.f18401b, accountArr);
                    }
                    if (accountArr2 != null && accountArr2.length > 0) {
                        intent2.addCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED");
                        ims.mo13148b(gkk.f18402c, accountArr2);
                    }
                    if (accountArr3 == null) {
                        if (accountArr3.length > 0) {
                            intent2.addCategory("com.google.android.gms.auth.category.ACCOUNT_MUTATED");
                            ims.mo13148b(gkk.f18403d, accountArr3);
                        }
                    }
                    intent2.putExtras(ims.f21367a);
                    if (!(intent2.getCategories() == null || intent2.getExtras() == null)) {
                        gkk.f18400a.mo25414c("Broadcasting account change.", new Object[0]);
                        gkk.f18406g.sendBroadcast(intent2, "com.google.android.gms.auth.permission.GOOGLE_ACCOUNT_CHANGE");
                    }
                }
                for (gks gks : a4.f18449b) {
                    this.f9999d.mo11993b(gks.f18430a);
                    if (gnv.m13528aa()) {
                        String str = gks.f18432c;
                        Context context2 = this.f9997b;
                        context2.startService(CredentialRevocationIntentOperation.m6281a(context2, str));
                    }
                }
            } catch (IOException e) {
                f9996a.mo25415d("Error occurred getting AccountsChange", e, new Object[0]);
            } catch (Throwable th) {
                aseo.m73884b(this.f9997b, intent);
                throw th;
            }
            context = this.f9997b;
        } else {
            f9996a.mo25416d("Received null intent, probably due to intent redelivery. Continuing.", new Object[0]);
            gkz a42 = gkz.m13355a(this.f9997b);
            f9996a.mo25412b("AccountsChange - added: %s removed: %s mutated: %s", a42.f18448a, a42.f18449b, a42.f18450c);
            a = m6291a(a42.f18448a);
            a2 = m6291a(a42.f18449b);
            a3 = m6291a(a42.f18450c);
            if (a.isEmpty()) {
            }
            gkk gkk2 = this.f9998c;
            accountArr = (Account[]) a.toArray(new Account[((C1225nr) a).f26758b]);
            accountArr2 = (Account[]) a2.toArray(new Account[((C1225nr) a2).f26758b]);
            accountArr3 = (Account[]) a3.toArray(new Account[((C1225nr) a3).f26758b]);
            intent2 = new Intent("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE");
            ims = new ims();
            intent2.addCategory("com.google.android.gms.auth.category.ACCOUNT_ADDED");
            ims.mo13148b(gkk.f18401b, accountArr);
            intent2.addCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED");
            ims.mo13148b(gkk.f18402c, accountArr2);
            if (accountArr3 == null) {
            }
            intent2.putExtras(ims.f21367a);
            gkk.f18400a.mo25414c("Broadcasting account change.", new Object[0]);
            gkk2.f18406g.sendBroadcast(intent2, "com.google.android.gms.auth.permission.GOOGLE_ACCOUNT_CHANGE");
            while (r0.hasNext()) {
            }
            context = this.f9997b;
        }
        aseo.m73884b(context, intent);
    }
}
