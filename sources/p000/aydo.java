package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.wearable.node.connection.ConnectionStatusHelper$CancelNotificationReceiver;
import com.google.android.gms.wearable.node.connection.ConnectionStatusHelper$NotificationDismissedReceiver;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: aydo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aydo implements ayjm {

    /* renamed from: a */
    public long f97232a;

    /* renamed from: b */
    public long f97233b;

    /* renamed from: c */
    private final Context f97234c;

    /* renamed from: d */
    private final skc f97235d = new skc(this.f97234c);

    /* renamed from: e */
    private final sex f97236e = sex.m35104a(this.f97234c);

    /* renamed from: f */
    private final AtomicBoolean f97237f;

    /* renamed from: g */
    private int f97238g;

    /* renamed from: h */
    private CharSequence f97239h;

    /* renamed from: i */
    private long f97240i;

    public aydo(Context context) {
        this.f97234c = context;
        int a = qkj.m32287a(this.f97234c, C0126R.C0127drawable.ic_watch_connect);
        C1102je jeVar = new C1102je(this.f97234c);
        jeVar.mo13640e(this.f97234c.getText(C0126R.string.wearable_service_name));
        jeVar.mo13630b(a);
        jeVar.f22258j = -2;
        jeVar.mo13627a(false);
        jeVar.f22268t = true;
        jeVar.mo13631b(PendingIntent.getBroadcast(this.f97234c, 0, new Intent("com.google.android.gms.wearable.node.connection.NOTIFICATION_DISMISSED"), 0));
        this.f97237f = new AtomicBoolean(false);
        this.f97238g = 1;
        this.f97239h = "";
        this.f97240i = 0;
        this.f97232a = 0;
        this.f97233b = 0;
        ConnectionStatusHelper$CancelNotificationReceiver connectionStatusHelper$CancelNotificationReceiver = new ConnectionStatusHelper$CancelNotificationReceiver(this);
        Context context2 = this.f97234c;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.wearable.node.connection.CANCEL_NOTIFICATION");
        context2.registerReceiver(connectionStatusHelper$CancelNotificationReceiver, intentFilter);
        ConnectionStatusHelper$NotificationDismissedReceiver connectionStatusHelper$NotificationDismissedReceiver = new ConnectionStatusHelper$NotificationDismissedReceiver(this);
        Context context3 = this.f97234c;
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("com.google.android.gms.wearable.node.connection.NOTIFICATION_DISMISSED");
        context3.registerReceiver(connectionStatusHelper$NotificationDismissedReceiver, intentFilter2);
    }

    /* renamed from: a */
    public final void mo53962a() {
        if (!this.f97237f.get()) {
            this.f97239h = "Notification service started. Notifications are off.";
            this.f97237f.set(true);
        }
    }

    /* renamed from: b */
    public final void mo53964b() {
        if (this.f97237f.get()) {
            this.f97237f.set(false);
            this.f97239h = "Notification service stopped.";
            mo53965c();
        }
    }

    /* renamed from: c */
    public final void mo53965c() {
        this.f97235d.mo25668a(PendingIntent.getBroadcast(this.f97234c, 0, new Intent("com.google.android.gms.wearable.node.connection.CANCEL_NOTIFICATION"), 134217728));
        this.f97232a = SystemClock.elapsedRealtime();
        this.f97236e.mo25440a(22543);
    }

    /* renamed from: a */
    public final void mo53963a(int i, CharSequence charSequence, Throwable th) {
        if (this.f97237f.get()) {
            if (th != null) {
                String charSequence2 = charSequence.toString();
                String message = th.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(charSequence2).length() + 9 + String.valueOf(message).length());
                sb.append(charSequence2);
                sb.append(", error: ");
                sb.append(message);
                Log.w("WearableConn", sb.toString());
            } else {
                Log.i("WearableConn", charSequence.toString());
            }
            this.f97239h = charSequence;
            this.f97238g = i;
            this.f97240i = System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    public final void mo53558a(ssb ssb, boolean z, boolean z2) {
        ssb.mo26034a();
        int i = this.f97238g;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "PROTOCOL VERSION MISMATCH" : "CONNECTED" : "CONNECTING" : "DISCONNECTED";
        ssb.println(str.length() == 0 ? new String("Status: ") : "Status: ".concat(str));
        ssb.println("Notifications: disabled");
        String valueOf = String.valueOf(ayjl.m84112a(this.f97240i));
        ssb.println(valueOf.length() == 0 ? new String("Last updated: ") : "Last updated: ".concat(valueOf));
        String valueOf2 = String.valueOf(this.f97239h);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 14);
        sb.append("Last message: ");
        sb.append(valueOf2);
        ssb.println(sb.toString());
        long j = this.f97232a;
        long j2 = this.f97233b;
        StringBuilder sb2 = new StringBuilder(85);
        sb2.append("Last notification dismissals - Auto: ");
        sb2.append(j);
        sb2.append("; User: ");
        sb2.append(j2);
        ssb.println(sb2.toString());
        ssb.mo26035b();
    }
}
