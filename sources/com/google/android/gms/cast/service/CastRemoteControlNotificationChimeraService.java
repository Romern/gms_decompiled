package com.google.android.gms.cast.service;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import com.google.android.chimera.Service;
import com.google.android.gms.cast.MediaStatus;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CastRemoteControlNotificationChimeraService extends Service implements pvu {

    /* renamed from: a */
    public static final qav f29907a = new qav("RCNService");

    /* renamed from: b */
    public final all f29908b;

    /* renamed from: c */
    public final boolean f29909c = cday.f180398a.mo6606a().mo77187i();

    /* renamed from: d */
    public phy f29910d;

    /* renamed from: e */
    public pzz f29911e;

    /* renamed from: f */
    public pwr f29912f;

    /* renamed from: g */
    public boolean f29913g;

    /* renamed from: h */
    public pvv f29914h;

    /* renamed from: i */
    private final alm f29915i;

    /* renamed from: j */
    private final IntentReceiver f29916j;

    /* renamed from: k */
    private final boolean f29917k = cday.f180398a.mo6606a().mo77191m();

    /* renamed from: l */
    private alw f29918l;

    /* renamed from: m */
    private pes f29919m;

    /* renamed from: n */
    private final Handler f29920n;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    class IntentReceiver extends aacn {
        public IntentReceiver() {
            super("cast");
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
         method: pjs.a(boolean, bpfe):void
         arg types: [int, bpfe]
         candidates:
          pjs.a(android.content.Intent, int):android.app.PendingIntent
          pjs.a(boolean, bpfe):void */
        /* renamed from: a */
        public final void mo6253a(Context context, Intent intent) {
            char c;
            psx psx;
            MediaStatus b;
            int i;
            pwq pwq;
            pwq pwq2;
            pwq pwq3;
            CastRemoteControlNotificationChimeraService.f29907a.mo23856a("IntentReceiver received %s", intent);
            String action = intent.getAction();
            String stringExtra = intent.getStringExtra("extra_device_id");
            pjs a = CastRemoteControlNotificationChimeraService.this.f29912f.mo23779a(stringExtra);
            switch (action.hashCode()) {
                case -2128145023:
                    if (action.equals("android.intent.action.SCREEN_OFF")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1895444897:
                    if (action.equals("com.google.android.gms.cast.rcn.TOGGLE_PLAY_BACK")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1644837463:
                    if (action.equals("com.google.android.gms.cast.rcn.ENABLED")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -1454123155:
                    if (action.equals("android.intent.action.SCREEN_ON")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1389759828:
                    if (action.equals("com.google.android.gms.cast.rcn.TOGGLE_MUTE")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -895871138:
                    if (action.equals("com.google.android.gms.cast.rcn.STOP_CASTING")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -821605132:
                    if (action.equals("com.google.android.gms.cast.rcn.DISABLED")) {
                        c = 8;
                        break;
                    }
                    c = 65535;
                    break;
                case 626556400:
                    if (action.equals("com.google.android.gms.cast.rcn.CLICK")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1636429042:
                    if (action.equals("com.google.android.gms.cast.rcn.DISMISS")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    CastRemoteControlNotificationChimeraService.this.mo17603a(true);
                    return;
                case 1:
                    CastRemoteControlNotificationChimeraService.this.mo17603a(false);
                    return;
                case 2:
                    CastRemoteControlNotificationChimeraService.f29907a.mo23856a("Entry to mute: %s", a);
                    if (a != null) {
                        try {
                            boolean a2 = a.f39380h.mo22981a();
                            if (!a2) {
                                a.f39374b.mo23776a(174);
                            } else {
                                a.f39374b.mo23776a(175);
                            }
                            pep pep = a.f39380h;
                            roz b2 = rpa.m34196b();
                            b2.f43472a = new pfc((pfv) pep, !a2);
                            ((rjx) pep).mo24732b(b2.mo24977a());
                            return;
                        } catch (IllegalStateException e) {
                            pjs.f39373a.mo23675c("Error retrieving mute state: The device is disconnected while the ApiClient is still connected", new Object[0]);
                            a.mo23280a(false, bpfe.REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_RECEIVER_OFFLINE);
                            return;
                        }
                    } else {
                        return;
                    }
                case 3:
                    if (a != null && (psx = a.f39379g) != null && (b = psx.mo23619b()) != null && (i = b.f29813e) != 1 && b.f29809a != null) {
                        if (i != 2) {
                            a.f39374b.mo23776a(177);
                            psx psx2 = a.f39379g;
                            sdo.m34967a("Must be called from the main thread.");
                            if (!psx2.mo23622e()) {
                                psx2.mo23623f();
                                return;
                            } else {
                                psx2.mo23618a(new psk(psx2));
                                return;
                            }
                        } else {
                            a.f39374b.mo23776a((int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_FILTER);
                            psx psx3 = a.f39379g;
                            sdo.m34967a("Must be called from the main thread.");
                            if (!psx3.mo23622e()) {
                                psx3.mo23623f();
                                return;
                            } else {
                                psx3.mo23618a(new psj(psx3));
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                case 4:
                    pjs a3 = CastRemoteControlNotificationChimeraService.this.f29912f.mo23780a(stringExtra, true, bpfe.REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_USER_STOPPED);
                    if (a3 != null && (pwq = a3.f39374b) != null) {
                        pwq.mo23776a(173);
                        return;
                    }
                    return;
                case 5:
                    String stringExtra2 = intent.getStringExtra("extra_session_id");
                    if (!TextUtils.isEmpty(stringExtra) && !TextUtils.isEmpty(stringExtra2)) {
                        pzz pzz = CastRemoteControlNotificationChimeraService.this.f29911e;
                        long currentTimeMillis = System.currentTimeMillis();
                        pzy pzy = null;
                        if (!TextUtils.isEmpty(stringExtra) && !TextUtils.isEmpty(stringExtra2)) {
                            pzy = new pzy();
                            pzy.f40764a = stringExtra;
                            pzy.f40765b = stringExtra2;
                            pzy.f40766c = currentTimeMillis;
                        }
                        if (pzy != null) {
                            pzz.f40769c.put(stringExtra, pzy);
                            pzz.mo23835b();
                        }
                    }
                    pjs a4 = CastRemoteControlNotificationChimeraService.this.f29912f.mo23780a(stringExtra, false, bpfe.REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_USER_DISMISSED);
                    if (a4 != null && (pwq2 = a4.f39374b) != null) {
                        pwq2.mo23776a(178);
                        return;
                    }
                    return;
                case 6:
                    if (a == null) {
                        return;
                    }
                    if (cday.m132438b()) {
                        CastRemoteControlNotificationChimeraService castRemoteControlNotificationChimeraService = CastRemoteControlNotificationChimeraService.this;
                        CastRemoteControlNotificationChimeraService.f29907a.mo23673b("handleClickAction is called", new Object[0]);
                        Intent intent2 = (Intent) intent.getParcelableExtra("extra_intent_to_launch");
                        if (intent2 == null) {
                            CastRemoteControlNotificationChimeraService.f29907a.mo23677d("No intent embedded in the content intent.", new Object[0]);
                            return;
                        }
                        intent2.addFlags(268435456);
                        castRemoteControlNotificationChimeraService.startActivity(intent2);
                        int a5 = bpfg.m111865a(intent.getIntExtra("extra_click_result_code", 0));
                        if (a5 != 0 && (pwq3 = a.f39374b) != null) {
                            pwq3.mo23778b(a5);
                            return;
                        }
                        return;
                    }
                    pwq pwq4 = a.f39374b;
                    if (pwq4 != null) {
                        pwq4.mo23778b(1);
                        return;
                    }
                    return;
                case 7:
                    CastRemoteControlNotificationChimeraService.this.f29910d.mo23133a(true);
                    CastRemoteControlNotificationChimeraService castRemoteControlNotificationChimeraService2 = CastRemoteControlNotificationChimeraService.this;
                    if (castRemoteControlNotificationChimeraService2.f29913g) {
                        castRemoteControlNotificationChimeraService2.mo17605b(true);
                        return;
                    }
                    return;
                case 8:
                    CastRemoteControlNotificationChimeraService.this.f29910d.mo23133a(false);
                    CastRemoteControlNotificationChimeraService.this.f29912f.mo23781a(bpfe.REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_USER_DISABLE_FROM_SETTINGS);
                    CastRemoteControlNotificationChimeraService.this.mo17605b(false);
                    return;
                default:
                    CastRemoteControlNotificationChimeraService.f29907a.mo23675c("IntentReceiver received unsupported action: %s", action);
                    return;
            }
        }
    }

    public CastRemoteControlNotificationChimeraService() {
        List singletonList = Collections.singletonList(pgr.f39089a);
        if (singletonList != null) {
            String a = pev.m30273a("com.google.android.gms.cast.CATEGORY_CAST", null, singletonList);
            alk alk = new alk();
            alk.mo973a(a);
            this.f29908b = alk.mo971a();
            this.f29915i = new pxj(this);
            this.f29916j = new IntentReceiver();
            this.f29920n = new adzt(Looper.getMainLooper());
            return;
        }
        throw new IllegalArgumentException("namespaces cannot be null");
    }

    /* renamed from: a */
    public final void mo17601a(String str) {
        f29907a.mo23856a("onDeviceControllerEntryAdded: %s", str);
        mo17602a(str, true);
    }

    /* renamed from: b */
    public final void mo17604b(String str) {
        f29907a.mo23856a("onDeviceControllerEntryRemoved: %s", str);
        mo17602a(str, false);
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        f29907a.mo23861b("onCreate");
        pes a = pes.m30267a(getApplicationContext(), "RCNService");
        this.f29919m = a;
        this.f29910d = a.f38982f;
        pvv pvv = a.f38985i;
        this.f29914h = pvv;
        pvv.f40409e.add(this);
        if (this.f29918l == null) {
            this.f29918l = alw.m1050a(this);
        }
        if (this.f29911e == null) {
            this.f29911e = new pzz(this);
        }
        if (this.f29912f == null) {
            this.f29912f = new pwr(getApplicationContext(), this.f29910d, this.f29911e, this.f29917k);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("com.google.android.gms.cast.rcn.TOGGLE_MUTE");
        intentFilter.addAction("com.google.android.gms.cast.rcn.TOGGLE_PLAY_BACK");
        intentFilter.addAction("com.google.android.gms.cast.rcn.STOP_CASTING");
        intentFilter.addAction("com.google.android.gms.cast.rcn.DISMISS");
        intentFilter.addAction("com.google.android.gms.cast.rcn.CLICK");
        intentFilter.addAction("com.google.android.gms.cast.rcn.ENABLED");
        intentFilter.addAction("com.google.android.gms.cast.rcn.DISABLED");
        getApplicationContext().registerReceiver(this.f29916j, intentFilter);
    }

    public final void onDestroy() {
        f29907a.mo23861b("onDestroy");
        mo17605b(false);
        getApplicationContext().unregisterReceiver(this.f29916j);
        pwr pwr = this.f29912f;
        pwr.mo23781a(bpfe.REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_SERVICE_STOPPED);
        if (pwr.f40523e) {
            pwr.f40525g.clear();
            pwr.f40526h.clear();
        }
        pes pes = this.f29919m;
        if (pes != null) {
            pes.mo22984a("RCNService");
            this.f29919m = null;
        }
        this.f29914h.f40409e.remove(this);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        f29907a.mo23857a("onStartCommand intent = %s, flags = %d", intent, Integer.valueOf(i));
        int i3 = Build.VERSION.SDK_INT;
        mo17603a(((PowerManager) getApplicationContext().getSystemService("power")).isInteractive());
        return 1;
    }

    /* renamed from: a */
    public final void mo17602a(String str, boolean z) {
        this.f29920n.post(new pxh(this, str, z));
    }

    /* renamed from: b */
    public final void mo17605b(boolean z) {
        int i;
        if (z) {
            alw alw = this.f29918l;
            all all = this.f29908b;
            alm alm = this.f29915i;
            if (!sre.m36084d(getBaseContext())) {
                i = 4;
            } else {
                i = 12;
            }
            alw.mo1005a(all, alm, i);
            return;
        }
        this.f29918l.mo1006a(this.f29915i);
    }

    /* renamed from: a */
    public final void mo17603a(boolean z) {
        this.f29913g = z;
        if (z && this.f29911e.f40772f) {
            f29907a.mo23861b("Screen is ON.");
            mo17605b(true);
            return;
        }
        f29907a.mo23861b("Screen is OFF.");
        mo17605b(false);
        this.f29912f.mo23781a(bpfe.REMOTE_CONTROL_NOTIFICATION_CANCEL_SCEEN_OFF);
    }
}
