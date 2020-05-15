package p000;

import android.accounts.Account;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.location.reporting.ReportingState;
import com.google.android.location.internal.LocationHistoryUpgradeNotificationIntentOperation;

/* renamed from: bgat */
public final /* synthetic */ class bgat implements aubw {

    /* renamed from: a */
    private final bgye f115933a;

    /* renamed from: b */
    private final Account f115934b;

    /* renamed from: c */
    private final Context f115935c;

    /* renamed from: d */
    private final sex f115936d;

    /* renamed from: e */
    private final int f115937e;

    /* renamed from: f */
    private final bgau f115938f;

    public bgat(bgye bgye, Account account, Context context, sex sex, int i, bgau bgau) {
        this.f115933a = bgye;
        this.f115934b = account;
        this.f115935c = context;
        this.f115936d = sex;
        this.f115937e = i;
        this.f115938f = bgau;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        String str;
        bgye bgye = this.f115933a;
        Account account = this.f115934b;
        Context context = this.f115935c;
        sex sex = this.f115936d;
        int i = this.f115937e;
        bgau bgau = this.f115938f;
        if (!((ReportingState) obj).f79600a || !aepw.m52375a(bgye.mo63353a(account).mo70906b())) {
            bgau.mo62571a(account);
            return;
        }
        PendingIntent a = LocationHistoryUpgradeNotificationIntentOperation.m117251a(context, account, "com.google.android.location.internal.LOCATION_HISTORY_UPGRADE_NOTIFICATION_CLICKED", i);
        PendingIntent a2 = LocationHistoryUpgradeNotificationIntentOperation.m117251a(context, account, "com.google.android.location.internal.LOCATION_HISTORY_UPGRADE_NOTIFICATION_CLEARED", i);
        Notification.Builder builder = new Notification.Builder(context, "privacy-features-channel");
        if (cezr.f183532a.mo6606a().locationHistoryNotificationForQAlternativeTitle()) {
            str = context.getString(C0126R.string.location_history_upgrade_notification_title_alternative);
        } else {
            str = context.getString(C0126R.string.location_history_upgrade_notification_title);
        }
        sex.mo25445a("6Dcl2tQlEemxP7t6xUHQ9g", i, builder.setContentTitle(str).setStyle(new Notification.BigTextStyle().bigText(context.getString(C0126R.string.location_history_upgrade_notification_content))).setSmallIcon(qkj.m32287a(context, C0126R.C0127drawable.ic_signal_location)).setContentIntent(a).setDeleteIntent(a2).setSubText(account.name).setAutoCancel(true).build());
    }
}
