package p000;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.content.Context;
import android.os.Build;
import com.felicanetworks.mfc.C0126R;

/* renamed from: atbf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum atbf {
    ALERTS("tapandpay.alerts", C0126R.string.tp_alerts_channel, C0126R.string.tp_alerts_channel_description, 4, true),
    TRANSACTION_RECEIPTS("tapandpay.transactions.low", C0126R.string.tp_transaction_notification_setting_label, C0126R.string.tp_transaction_notification_setting_description, 2, true),
    PROMOTIONS("tapandpay.promotions", C0126R.string.tp_notifications_setting_label, C0126R.string.tp_notifications_setting_description, 2, false);
    

    /* renamed from: d */
    static final String[] f89992d = {"tapandpay.transactions"};

    /* renamed from: e */
    public final String f89994e;

    /* renamed from: f */
    public final int f89995f;

    /* renamed from: g */
    public final int f89996g;

    /* renamed from: h */
    public final int f89997h;

    /* renamed from: i */
    public final boolean f89998i;

    private atbf(String str, int i, int i2, int i3, boolean z) {
        this.f89994e = str;
        this.f89995f = i;
        this.f89996g = i2;
        this.f89997h = i3;
        this.f89998i = z;
    }

    /* renamed from: a */
    public final boolean mo49775a(NotificationChannelGroup notificationChannelGroup) {
        return notificationChannelGroup == null || notificationChannelGroup.isBlocked();
    }

    /* renamed from: a */
    public final boolean mo49776a(Context context) {
        NotificationChannel a;
        sex a2 = sex.m35104a(context);
        if (a2 != null && a2.mo25453e()) {
            int i = Build.VERSION.SDK_INT;
            if (mo49775a(a2.mo25449c("tapandpay")) || (a = a2.mo25437a(this.f89994e)) == null || a.getImportance() == 0) {
                return true;
            }
            return false;
        }
        return true;
    }
}
