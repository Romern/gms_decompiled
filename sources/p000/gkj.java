package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: gkj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gkj {

    /* renamed from: a */
    public static final Logger f18395a = ght.m13171a("AccountStatusChecker");

    /* renamed from: b */
    private final Context f18396b;

    /* renamed from: c */
    private final gkp f18397c;

    /* renamed from: d */
    private final ily f18398d = ((ily) ily.f21320d.mo13145b());

    /* renamed from: e */
    private final gkk f18399e;

    public gkj(Context context) {
        gkp gkp = new gkp(context);
        gkk gkk = new gkk(context);
        this.f18396b = context;
        this.f18397c = gkp;
        this.f18399e = gkk;
    }

    /* renamed from: a */
    public final void mo11985a(goa goa, Account account) {
        boolean z;
        if (!TextUtils.isEmpty((CharSequence) goa.mo12090a(account, gqd.f18807a))) {
            String str = (String) goa.mo12090a(account, gqd.f18810d);
            if (!TextUtils.isEmpty(str)) {
                if (this.f18398d.mo13134b("com.google.android.apps.work.clouddpc") || this.f18398d.mo13134b("com.google.android.apps.work.clouddpc.arc")) {
                    z = true;
                } else {
                    z = false;
                }
                boolean hasSystemFeature = this.f18398d.f21322a.hasSystemFeature("org.chromium.arc.device_management");
                if (z || hasSystemFeature) {
                    gkk gkk = this.f18399e;
                    Logger Logger = gkk.f18400a;
                    String valueOf = String.valueOf(str);
                    Logger.mo25414c(valueOf.length() == 0 ? new String("Broadcasting bad device management: ") : "Broadcasting bad device management: ".concat(valueOf), new Object[0]);
                    String a = gkk.f18409j.mo13129a();
                    if (a != null) {
                        Intent intent = new Intent("com.google.android.gms.auth.BAD_DEVICE_MANAGEMENT");
                        ims ims = new ims();
                        ims.mo13148b(gkk.f18404e, account);
                        ims.mo13148b(gkk.f18405f, str);
                        gkk.f18406g.sendBroadcast(intent.putExtras(ims.f21367a).setPackage(a));
                    }
                }
                this.f18396b.sendBroadcast(new Intent("com.google.android.apps.enterprise.dmagent.AUTO_SYNC").setPackage("com.google.android.apps.enterprise.dmagent").putExtra("com.google.android.apps.enterprise.dmagent.Email", account.name).putExtra("com.google.android.apps.enterprise.dmagent.DmResponseStatusCode", str));
                Long l = (Long) goa.mo12090a(account, gqd.f18821o);
                int i = Build.VERSION.SDK_INT;
                Bundle applicationRestrictions = ((UserManager) this.f18396b.getSystemService("user")).getApplicationRestrictions(this.f18396b.getPackageName());
                if ((applicationRestrictions == null || !applicationRestrictions.getBoolean("auth_account:hide_dm_notification")) && (l == null || System.currentTimeMillis() >= l.longValue())) {
                    f18395a.mo25412b("Notifying for %s because of DeviceManagement", Logger.m35081a(account));
                    if (hasSystemFeature) {
                        f18395a.mo25414c("Notifying 'Account blocked' because of DeviceManagement", new Object[0]);
                        gkp gkp = this.f18397c;
                        if (gkp.mo11994c(account)) {
                            gkp.mo11992a(gkp.m13339d(account), null, account, gkp.f18421a.getString(C0126R.string.account_blocked_title), BitmapFactory.decodeResource(gkp.f18421a.getResources(), C0126R.C0127drawable.ic_google), false);
                            return;
                        }
                        return;
                    }
                    f18395a.mo25414c("Notifying 'Account action required' because of DeviceManagement", new Object[0]);
                    this.f18397c.mo11991a(account);
                    return;
                }
                f18395a.mo25414c("Canceling for %s because of DM suppression", Logger.m35081a(account));
                this.f18397c.mo11993b(account);
                return;
            }
            f18395a.mo25414c("Canceling for %s", Logger.m35081a(account));
            this.f18397c.mo11993b(account);
            return;
        }
        f18395a.mo25414c("Notifying for %s because of bad LST", Logger.m35081a(account));
        this.f18397c.mo11991a(account);
        if (this.f18398d.mo13131a(account)) {
            gkk gkk2 = this.f18399e;
            if (gnv.m13494D()) {
                gkk.f18400a.mo25414c("Broadcasting account reauth required.", new Object[0]);
                Intent intent2 = new Intent("com.google.android.gms.auth.ACCOUNT_REAUTH_REQUIRED");
                ims ims2 = new ims();
                ims2.mo13148b(gkk.f18404e, account);
                Intent putExtras = intent2.putExtras(ims2.f21367a);
                ily ily = gkk2.f18409j;
                HashSet<String> hashSet = new HashSet();
                String a2 = ily.mo13129a();
                if (a2 != null) {
                    hashSet.add(a2);
                }
                String[] a3 = ily.f21323b.mo26175a(ily.f21324c.mo12126a(account));
                if (a3 != null) {
                    Collections.addAll(hashSet, a3);
                }
                for (String str2 : hashSet) {
                    gkk2.mo11986a(putExtras, str2);
                }
            }
        }
    }
}
