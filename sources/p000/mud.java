package p000;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import com.felicanetworks.mfc.C0126R;

/* renamed from: mud */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mud {

    /* renamed from: a */
    public static final lvn f34744a = new lvn("BackUpNowNotificationManager");

    /* renamed from: b */
    public final Context f34745b;

    /* renamed from: c */
    public final Notification.Builder f34746c;

    /* renamed from: d */
    public int f34747d;

    /* renamed from: e */
    public int f34748e;

    /* renamed from: f */
    private final sex f34749f;

    /* renamed from: g */
    private final boolean f34750g;

    public mud(Context context, boolean z) {
        int i;
        sdo.m34959a(context);
        this.f34745b = context;
        this.f34750g = z;
        PendingIntent activity = PendingIntent.getActivity(context, 0, mcc.m24851a(), 134217728);
        if (!ccli.m130404d()) {
            i = C0126R.C0127drawable.quantum_ic_backup_googblue_48;
        } else {
            i = C0126R.C0127drawable.quantum_gm_ic_backup_googblue_24;
        }
        Notification.Builder autoCancel = mbv.m24812a(context).setSmallIcon(qkj.m32287a(context, i)).setColor(context.getColor(C0126R.color.quantum_googblue600)).setContentIntent(activity).setContentTitle(context.getString(C0126R.string.backup_now_notification_title)).setProgress(0, 0, true).setOngoing(ccli.f179330a.mo6606a().mo76269b()).setAutoCancel(false);
        int i2 = Build.VERSION.SDK_INT;
        autoCancel.setTimeoutAfter(ccnl.f179542a.mo6606a().mo76459b());
        mbv.m24814a(context, autoCancel);
        this.f34746c = autoCancel;
        this.f34749f = sex.m35104a(context);
    }

    /* renamed from: a */
    public static void m25628a(Context context) {
        sex.m35104a(context).mo25444a("com.google.android.backup.notification.backup_now.tag", 2);
    }

    /* renamed from: a */
    public final void mo20246a() {
        if (this.f34750g) {
            this.f34749f.mo25445a("com.google.android.backup.notification.backup_now.tag", 2, this.f34746c.build());
        }
    }
}
