package com.google.android.gms.cast_mirroring;

import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.android.media.remotedisplay.RemoteDisplay;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Service;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CastSystemMirroringChimeraService extends Service implements qbl {

    /* renamed from: a */
    public qbn f29932a;

    /* renamed from: b */
    private pes f29933b;

    /* renamed from: c */
    private BroadcastReceiver f29934c;

    /* renamed from: d */
    private BroadcastReceiver f29935d;

    /* renamed from: e */
    private PendingIntent f29936e;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class DisconnectReceiver extends aacn {
        public DisconnectReceiver() {
            super("cast");
        }

        /* renamed from: a */
        public final void mo6253a(Context context, Intent intent) {
            if ("com.google.android.gms.cast.media.ACTION_DISCONNECT".equals(intent.getAction())) {
                pes.m30266a().execute(new qbu(this));
                CastSystemMirroringChimeraService.this.stopSelf();
            }
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    class ProjectionReceiver extends aacn {
        public ProjectionReceiver() {
            super("Projection receiver");
        }

        /* renamed from: a */
        public final void mo6253a(Context context, Intent intent) {
            if (!"com.google.android.gms.cast.media.PROJECT".equals(intent.getAction())) {
                return;
            }
            if (intent.getIntExtra("com.google.android.gms.media.USER_CONSENT_REQUEST_RESULT", 0) == -1) {
                Intent intent2 = (Intent) intent.getParcelableExtra("extra_projection_intent");
                if (intent2 != null) {
                    CastSystemMirroringChimeraService.this.f29932a.mo23874a(intent2);
                    qbn qbn = CastSystemMirroringChimeraService.this.f29932a;
                    qbn.f40882i = false;
                    qbn.f40876a.mo23861b("User consent requested successfully!");
                    qbm qbm = qbn.f40884k;
                    if (qbm != null) {
                        qbn.mo23875a(qbm.f40872a);
                    } else if (qbn.f40885l != null) {
                        qbn.f40878c.execute(new qbh(qbn));
                    }
                }
            } else {
                qbn qbn2 = CastSystemMirroringChimeraService.this.f29932a;
                qbn2.f40876a.mo23675c("Failed to get user consent to start mirroring.", new Object[0]);
                qbn2.f40882i = false;
                if (qbn2.f40884k == null) {
                    qbj qbj = qbn2.f40885l;
                    if (qbj != null) {
                        try {
                            qbj.f40869c.mo23897a(2209);
                        } catch (RemoteException e) {
                        }
                    }
                } else {
                    if (qbn2.getDiscoveryMode() != 0) {
                        RemoteDisplay findRemoteDisplay = qbn2.findRemoteDisplay(qbn2.f40884k.f40872a.getId());
                        if (findRemoteDisplay != null) {
                            findRemoteDisplay.setStatus(2);
                            qbn2.updateDisplay(findRemoteDisplay);
                        }
                    } else {
                        qbn2.removeDisplay(qbn2.f40884k.f40872a);
                    }
                    qbn2.f40884k = null;
                }
                qbn2.f40885l = null;
                qbn2.mo23879b();
            }
        }
    }

    /* renamed from: a */
    public static void m22334a(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.cast.media.CastRemoteDisplayProviderService");
        context.stopService(intent);
    }

    public final IBinder onBind(Intent intent) {
        if (intent.getAction().equals("com.android.media.remotedisplay.RemoteDisplayProvider")) {
            return this.f29932a.getBinder();
        }
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        this.f29933b = pes.m30267a(getApplicationContext(), "CastSystemMirroringSrv");
        Context applicationContext = getApplicationContext();
        ScheduledExecutorService a = pes.m30266a();
        pes pes = this.f29933b;
        qbn a2 = qbn.m31799a(applicationContext, a, pes.f38984h, pes.f38988l, alw.m1050a(this));
        this.f29932a = a2;
        a2.mo23876a(this);
        Intent intent = new Intent("com.google.android.gms.cast.media.ACTION_DISCONNECT");
        intent.setPackage("com.google.android.gms");
        this.f29936e = PendingIntent.getBroadcast(this, 0, intent, 134217728);
        this.f29934c = new DisconnectReceiver();
        this.f29935d = new ProjectionReceiver();
        registerReceiver(this.f29934c, new IntentFilter("com.google.android.gms.cast.media.ACTION_DISCONNECT"));
        registerReceiver(this.f29935d, new IntentFilter("com.google.android.gms.cast.media.PROJECT"));
        int i = Build.VERSION.SDK_INT;
        sex a3 = sex.m35104a(getApplicationContext());
        NotificationChannel notificationChannel = new NotificationChannel("cast_system_mirroring_service", getString(C0126R.string.cast_display_notification_channel_name), 2);
        notificationChannel.setShowBadge(false);
        a3.mo25442a(notificationChannel);
    }

    public final void onDestroy() {
        unregisterReceiver(this.f29934c);
        unregisterReceiver(this.f29935d);
        qbn qbn = this.f29932a;
        if (qbn != null) {
            qbn.mo23876a((qbl) null);
            this.f29932a.mo23874a((Intent) null);
        }
        pes pes = this.f29933b;
        if (pes != null) {
            pes.mo22984a("CastSystemMirroringSrv");
        }
        super.onDestroy();
    }

    /* renamed from: a */
    public final void mo17610a() {
        stopForeground(true);
    }

    /* renamed from: a */
    public final void mo17611a(String str, boolean z, boolean z2) {
        int i = !z ? C0126R.C0127drawable.ic_notification_cast_on : C0126R.C0127drawable.ic_notification_cast_connecting;
        int i2 = !z ? C0126R.string.cast_display_notification_connected_message : C0126R.string.cast_display_notification_connecting_message;
        int a = qkj.m32287a(this, i);
        C1102je jeVar = new C1102je(this);
        jeVar.mo13640e(getString(C0126R.string.cast_display_notification_title));
        jeVar.mo13632b(getString(i2, new Object[]{str}));
        jeVar.mo13633b(true);
        jeVar.f22254f = this.f29932a.getSettingsPendingIntent();
        jeVar.f22244B = "cast_system_mirroring_service";
        jeVar.mo13618a(17301560, getString(C0126R.string.common_disconnect), this.f29936e);
        jeVar.mo13630b(a);
        int i3 = Build.VERSION.SDK_INT;
        if (cdag.f180376a.mo6606a().mo77164a()) {
            Bundle bundle = new Bundle();
            bundle.putString("android.substName", getString(C0126R.string.cast_display_notification_app_name));
            jeVar.mo13623a(bundle);
        }
        if (z2) {
            int i4 = Build.VERSION.SDK_INT;
            jeVar.f22258j = -1;
        }
        startForeground(C0126R.C0129id.notification_id_cast_mirroring_provider, jeVar.mo13629b());
    }
}
