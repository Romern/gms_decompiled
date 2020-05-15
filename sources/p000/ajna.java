package p000;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: ajna */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajna {

    /* renamed from: e */
    private static ajna f70951e;

    /* renamed from: a */
    public final Context f70952a;

    /* renamed from: b */
    public final ahgp f70953b;

    /* renamed from: c */
    public final ajwp f70954c;

    /* renamed from: d */
    private final ScheduledExecutorService f70955d = ahhr.m55804a();

    private ajna(Context context, ajwp ajwp) {
        this.f70952a = context;
        ahgp a = ahgp.m55715a(context);
        this.f70953b = a;
        this.f70954c = ajwp;
        a.f67174a = true;
        int i = Build.VERSION.SDK_INT;
        this.f70953b.mo36452a(new NotificationChannelGroup("NEARBY_SHARING_CHANNEL_GROUP_ID", this.f70952a.getString(C0126R.string.sharing_product_name)));
        ahgp ahgp = this.f70953b;
        NotificationChannel notificationChannel = new NotificationChannel("nearby_sharing_file", this.f70952a.getString(C0126R.string.sharing_notification_channel_title_files), 4);
        notificationChannel.setDescription(this.f70952a.getString(C0126R.string.sharing_notification_channel_description_files));
        notificationChannel.setGroup("NEARBY_SHARING_CHANNEL_GROUP_ID");
        if (cfov.f185185a.mo6606a().mo82295aD()) {
            notificationChannel.setBypassDnd(true);
        }
        m58861a(notificationChannel);
        ahgp.mo36451a(notificationChannel);
        ahgp ahgp2 = this.f70953b;
        NotificationChannel notificationChannel2 = new NotificationChannel("nearby_sharing_alert", this.f70952a.getString(C0126R.string.sharing_notification_channel_title_alert), 4);
        notificationChannel2.setDescription(this.f70952a.getString(C0126R.string.sharing_notification_channel_description_alert));
        notificationChannel2.setGroup("NEARBY_SHARING_CHANNEL_GROUP_ID");
        m58861a(notificationChannel2);
        ahgp2.mo36451a(notificationChannel2);
        ahgp ahgp3 = this.f70953b;
        NotificationChannel notificationChannel3 = new NotificationChannel("nearby_sharing_privacy", this.f70952a.getString(C0126R.string.sharing_notification_channel_title_privacy_reminder), 2);
        notificationChannel3.setDescription(this.f70952a.getString(C0126R.string.sharing_notification_channel_description_privacy_reminder));
        notificationChannel3.setGroup("NEARBY_SHARING_CHANNEL_GROUP_ID");
        m58861a(notificationChannel3);
        ahgp3.mo36451a(notificationChannel3);
        if (this.f70953b.mo36447a("nearby_sharing") != null) {
            this.f70953b.mo36448a().mo25447b("nearby_sharing");
        }
    }

    /* renamed from: a */
    static int m58859a(int i, ShareTarget shareTarget) {
        return (Arrays.hashCode(new Object[]{Long.valueOf(shareTarget.f81028a)}) << 10) + i;
    }

    /* renamed from: c */
    public static final void m58862c() {
        f70951e.f70954c.mo39010c().edit().remove("dont_show_notification_again").remove("most_recent_notification_dismissed_timestamp").apply();
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        bnsl.mo68432a("ajwp", "b", 94, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Resetting the fast init notification blacklist.");
    }

    /* renamed from: b */
    public final PendingIntent mo38815b(ShareTarget shareTarget, TransferMetadata transferMetadata) {
        return PendingIntent.getActivity(this.f70952a, 1001, new Intent().setClassName(this.f70952a, "com.google.android.gms.nearby.sharing.InternalReceiveSurfaceActivity").addFlags(268435456).addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT).putExtra("share_target_bytes", sef.m35074a(shareTarget)).putExtra("transfer_metadata_bytes", sef.m35074a(transferMetadata)), 134217728);
    }

    /* renamed from: a */
    public static ajna m58860a(Context context) {
        ajwp a = ajwp.m59150a(context.getApplicationContext());
        if (f70951e == null) {
            f70951e = new ajna(new C1416ut(context.getApplicationContext(), context.getTheme()), a);
        }
        return f70951e;
    }

    /* renamed from: c */
    public final PendingIntent mo38819c(ShareTarget shareTarget, TransferMetadata transferMetadata) {
        return PendingIntent.getActivity(this.f70952a, 1001, new Intent().setClassName(this.f70952a, "com.google.android.gms.nearby.sharing.InternalShareSheetActivity").addFlags(268435456).addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT).putExtra("share_target_bytes", sef.m35074a(shareTarget)).putExtra("transfer_metadata_bytes", sef.m35074a(transferMetadata)), 134217728);
    }

    /* renamed from: a */
    private final void m58861a(NotificationChannel notificationChannel) {
        notificationChannel.setSound(akim.m59833e(this.f70952a), Notification.AUDIO_ATTRIBUTES_DEFAULT);
        notificationChannel.enableVibration(false);
    }

    /* renamed from: b */
    public final void mo38816b() {
        ahgp ahgp = this.f70953b;
        int i = Build.VERSION.SDK_INT;
        StatusBarNotification[] b = ahgp.mo36448a().mo25448b();
        for (StatusBarNotification statusBarNotification : b) {
            if ("nearby_sharing".equals(statusBarNotification.getTag())) {
                this.f70953b.mo36453a(statusBarNotification.getTag(), statusBarNotification.getId());
            }
        }
    }

    /* renamed from: a */
    public final void mo38809a() {
        this.f70953b.mo36453a("nearby_sharing", 3);
    }

    /* renamed from: a */
    public final void mo38810a(ahgl ahgl) {
        ahgl.mo36430b(akim.m59833e(this.f70952a));
        ahgl.mo36432b(new long[0]);
    }

    /* renamed from: c */
    public final void mo38820c(ShareTarget shareTarget) {
        ahgr ahgr = new ahgr();
        String str = shareTarget.f81037j;
        if (str == null) {
            str = shareTarget.f81029b;
        }
        ahgr.f67181a = str;
        ahgr.f67182b = akia.m59781a(new ajwv(this.f70952a, shareTarget));
        ahgr.f67183c = Long.toString(shareTarget.f81028a);
        new ahgs(ahgr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo38817b(int i, ShareTarget shareTarget) {
        this.f70955d.schedule(new ajmz(this, i, shareTarget), cfov.f185185a.mo6606a().mo82293aB(), TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public final void mo38811a(ShareTarget shareTarget) {
        this.f70953b.mo36453a("nearby_sharing", m58859a(1, shareTarget));
    }

    /* renamed from: a */
    public final void mo38812a(ShareTarget shareTarget, TransferMetadata transferMetadata) {
        int a = m58859a(1, shareTarget);
        ahgl ahgl = new ahgl(this.f70952a, "nearby_sharing_file");
        ahgl.mo36442i();
        ahgl.mo36429b(akia.m59783b(new ajwv(this.f70952a, shareTarget)));
        ahgl.mo36440g(shareTarget.f81029b);
        ahgl.mo36438f(this.f70952a.getString(C0126R.string.sharing_notification_incoming_failed_description));
        ahgl.f22254f = mo38815b(shareTarget, transferMetadata);
        ahgl.mo36434d(PendingIntent.getBroadcast(this.f70952a, m58859a(1006, shareTarget), new Intent("com.google.android.gms.nearby.sharing.ACTION_DISMISS").setPackage(this.f70952a.getPackageName()).putExtra("share_target_bytes", sef.m35074a(shareTarget)).putExtra("notification_id", a), 134217728));
        ahgl.mo36439g();
        ahgl.f22258j = 2;
        ahgl.f22269u = "msg";
        ahgl.f22271w = akim.m59827a(this.f70952a);
        ahgl.mo36435d(true);
        ahgl.f22266r = "nearby_sharing";
        ahgl.mo36427a(this.f70952a.getString(C0126R.string.sharing_product_name));
        mo38820c(shareTarget);
        ahgl.mo36436e();
        mo38810a(ahgl);
        mo38814a("nearby_sharing", a, ahgl.mo13629b());
        mo38817b(a, shareTarget);
    }

    /* renamed from: b */
    public final void mo38818b(ShareTarget shareTarget) {
        this.f70953b.mo36453a("nearby_sharing", m58859a(2, shareTarget));
    }

    /* renamed from: a */
    public final void mo38813a(ShareTarget shareTarget, TransferMetadata transferMetadata, boolean z) {
        String str = transferMetadata.f81054c;
        if (z) {
            try {
                mo38815b(shareTarget, transferMetadata).send();
                return;
            } catch (PendingIntent.CanceledException e) {
                bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68405a("Failed to launch receive surface.");
            }
        }
        CharSequence a = TextUtils.isEmpty(str) ? akip.m59837a(this.f70952a, shareTarget) : akip.m59838a(this.f70952a, shareTarget, str);
        int a2 = m58859a(1, shareTarget);
        ahgl ahgl = new ahgl(this.f70952a, "nearby_sharing_file");
        ahgl.mo36431b(new C1101jd());
        ahgl.mo36442i();
        ahgl.mo36429b(akia.m59783b(new ajwv(this.f70952a, shareTarget)));
        ahgl.mo36440g(shareTarget.f81029b);
        ahgl.mo36438f(a);
        ahgl.f22254f = mo38815b(shareTarget, transferMetadata);
        ahgl.mo36434d(PendingIntent.getBroadcast(this.f70952a, m58859a(1006, shareTarget), new Intent("com.google.android.gms.nearby.sharing.ACTION_DISMISS").setPackage(this.f70952a.getPackageName()).putExtra("share_target_bytes", sef.m35074a(shareTarget)).putExtra("notification_id", a2), 134217728));
        ahgl.mo36439g();
        ahgl.f22258j = 2;
        ahgl.f22269u = "msg";
        ahgl.mo36441h();
        ahgl.mo13618a(C0126R.C0127drawable.quantum_gm_ic_clear_vd_theme_24, this.f70952a.getText(C0126R.string.sharing_action_reject), PendingIntent.getBroadcast(this.f70952a, m58859a(1003, shareTarget), new Intent("com.google.android.gms.nearby.sharing.ACTION_REJECT").setPackage(this.f70952a.getPackageName()).putExtra("share_target_bytes", sef.m35074a(shareTarget)).putExtra("notification_id", a2), 134217728));
        ahgl.mo13618a(C0126R.C0127drawable.quantum_gm_ic_done_vd_theme_24, this.f70952a.getText(C0126R.string.sharing_action_accept), PendingIntent.getBroadcast(this.f70952a, m58859a(1002, shareTarget), new Intent("com.google.android.gms.nearby.sharing.ACTION_ACCEPT").setPackage(this.f70952a.getPackageName()).putExtra("share_target_bytes", sef.m35074a(shareTarget)).putExtra("notification_id", a2), 134217728));
        ahgl.f22271w = akim.m59827a(this.f70952a);
        ahgl.f22266r = "nearby_sharing";
        ahgl.mo36427a(this.f70952a.getString(C0126R.string.sharing_product_name));
        mo38820c(shareTarget);
        ahgl.mo36436e();
        mo38810a(ahgl);
        mo38814a("nearby_sharing", a2, ahgl.mo13629b());
    }

    /* renamed from: a */
    public final void mo38814a(String str, int i, Notification notification) {
        if (notification.getSmallIcon() == null) {
            ((bnsl) ajvp.f71371a.mo68388c()).mo68420a("Invalid notification (no valid small icon) %s", notification);
        } else {
            this.f70953b.mo36454a(str, i, notification);
        }
    }
}
