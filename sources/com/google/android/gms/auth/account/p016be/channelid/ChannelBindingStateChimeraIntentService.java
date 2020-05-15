package com.google.android.gms.auth.account.p016be.channelid;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.google.android.gms.auth.account.be.channelid.ChannelBindingStateChimeraIntentService */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ChannelBindingStateChimeraIntentService extends TracingIntentService {

    /* renamed from: b */
    private static final sek f10001b = new sek("GLSUser", "ChannelBindingStateChimeraIntentService");

    /* renamed from: c */
    private static final Lock f10002c = new ReentrantLock();

    /* renamed from: a */
    iml f10003a;

    public ChannelBindingStateChimeraIntentService() {
        super("ChannelBindingStateIntentService");
        setIntentRedelivery(true);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0064 A[Catch:{ all -> 0x00db, all -> 0x00d4, Exception -> 0x00e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0065 A[Catch:{ all -> 0x00db, all -> 0x00d4, Exception -> 0x00e2 }] */
    /* renamed from: a */
    public final void mo6499a(Intent intent) {
        String str;
        try {
            rpr b = rpr.m34216b();
            f10002c.lock();
            this.f10003a = new iml(new File(b.getFilesDir(), "auth.channel.store.properties"));
            f10002c.unlock();
            try {
                f10002c.lock();
                String a = this.f10003a.mo13139a("stored_binding_state");
                f10002c.unlock();
                if (gnv.m13516Z()) {
                    if (((rqt) rqt.f43529a.mo13145b()).mo25034a()) {
                        str = "true";
                        f10002c.lock();
                        this.f10003a.mo13141a("stored_binding_state", str, a);
                        this.f10003a.mo13140a();
                        f10002c.unlock();
                        if (a != null) {
                            a = "false";
                        }
                        f10001b.mo25412b("Saved state is %s, new state is %s", a, str);
                        if ("false".equals(a) && "true".equals(str)) {
                            f10001b.mo25412b("Server requests we re-auth to get a bound token.", new Object[0]);
                            f10001b.mo25412b("Channel-bound LST requirement enabled by gservices flag update. Resetting LST", new Object[0]);
                            List c = soz.m35798c(this, getPackageName(), "com.google");
                            int size = c.size();
                            for (int i = 0; i < size; i++) {
                                Account account = (Account) c.get(i);
                                if (account.name.endsWith("@google.com")) {
                                    ((goa) goa.f18759a.mo13145b()).mo12095b(account, gqd.f18807a, "");
                                    f10001b.mo25412b("Reset LST for account %s", account.name);
                                }
                            }
                            return;
                        }
                    }
                }
                str = "false";
                f10002c.lock();
                this.f10003a.mo13141a("stored_binding_state", str, a);
                this.f10003a.mo13140a();
                f10002c.unlock();
                if (a != null) {
                }
                f10001b.mo25412b("Saved state is %s, new state is %s", a, str);
                if ("false".equals(a)) {
                }
            } catch (Exception e) {
                f10001b.mo25417e("Errors while handling Channel ID status changes", e, new Object[0]);
            } catch (Throwable th) {
                f10002c.unlock();
                throw th;
            }
        } catch (IOException e2) {
            f10001b.mo25417e("Errors while handling channel-binding requirement status changes", e2, new Object[0]);
        } catch (Throwable th2) {
            f10002c.unlock();
            throw th2;
        }
    }
}
