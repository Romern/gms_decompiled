package p000;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaPlayer;
import android.os.BatteryManager;
import android.os.Build;
import android.os.IBinder;
import android.os.Vibrator;
import android.view.View;
import android.view.WindowManager;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.felicanetworks.mfc.C0126R;
import com.google.android.cast.JGCastService;
import com.google.android.chimera.Service;
import com.google.android.gms.mdm.receivers.StopRingReceiver;
import com.google.android.gms.mdm.services.BaseRingOrUnpairChimeraService$2;

/* renamed from: afzm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class afzm extends Service implements View.OnTouchListener, Response.Listener, Response.ErrorListener, afzt {

    /* renamed from: n */
    public static final /* synthetic */ int f65014n = 0;

    /* renamed from: o */
    private static final long[] f65015o = {0, 500, 500};

    /* renamed from: a */
    protected BroadcastReceiver f65016a = null;

    /* renamed from: b */
    protected String f65017b;

    /* renamed from: c */
    protected boolean f65018c;

    /* renamed from: d */
    protected WindowManager f65019d;

    /* renamed from: e */
    protected View f65020e;

    /* renamed from: f */
    protected boolean f65021f;

    /* renamed from: g */
    public String f65022g;

    /* renamed from: h */
    protected afzv f65023h;

    /* renamed from: i */
    protected Vibrator f65024i;

    /* renamed from: j */
    protected final Runnable f65025j = mo35104a();

    /* renamed from: k */
    protected adzt f65026k;

    /* renamed from: l */
    protected byte[] f65027l;

    /* renamed from: m */
    protected final Runnable f65028m = new afzl(this);

    /* renamed from: a */
    public static void m53739a(Context context) {
        context.stopService(apuh.m71022a(context, "com.google.android.gms.mdm.services.RingService"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Runnable mo35104a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo35105a(Intent intent);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract cajt mo35106b(Intent intent);

    /* renamed from: b */
    public final void mo35107b() {
        stopSelf();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract afzv mo35108c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract int mo35109d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract int mo35110e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract int mo35111f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract boolean mo35112g();

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        agac.m53790a("Failed to send the payload", volleyError);
    }

    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        cakg cakg = (cakg) obj;
        int i = eoa.f15378a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x0209 A[Catch:{ all -> 0x01fe }] */
    public final int onStartCommand(Intent intent, int i, int i2) {
        String str;
        cajs cajs;
        Intent intent2 = intent;
        if (intent2 != null && "unpair".equals(intent.getAction())) {
            this.f65022g = intent2.getStringExtra("echoServerToken");
            this.f65027l = intent2.getByteArrayExtra("com.google.android.gms.nearby.discovery.ACCOUNT_KEY");
            BaseRingOrUnpairChimeraService$2 baseRingOrUnpairChimeraService$2 = new BaseRingOrUnpairChimeraService$2(this, "security");
            this.f65016a = baseRingOrUnpairChimeraService$2;
            registerReceiver(baseRingOrUnpairChimeraService$2, new IntentFilter("android.bluetooth.device.action.ACL_DISCONNECTED"));
            startService(new Intent().setComponent(new ComponentName(getPackageName(), "com.google.android.gms.nearby.discovery.service.DiscoveryService")).setAction("com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_UNPAIR").putExtra("com.google.android.gms.nearby.discovery.ACCOUNT_KEY", this.f65027l));
            adzt adzt = new adzt();
            this.f65026k = adzt;
            adzt.postDelayed(this.f65028m, cgki.f187161a.mo6606a().mo83989g());
            aseo.m73884b(this, intent);
            return 2;
        }
        int a = qkj.m32287a(this, mo35109d());
        afzw.m53779b(this);
        int i3 = Build.VERSION.SDK_INT;
        C1102je jeVar = new C1102je(this, "find_my_device");
        jeVar.mo13630b(a);
        jeVar.mo13640e(getString(mo35110e()));
        jeVar.mo13632b(getString(C0126R.string.mdm_ringing_notification_text));
        jeVar.f22254f = PendingIntent.getBroadcast(this, 0, new Intent(this, StopRingReceiver.class), JGCastService.FLAG_PRIVATE_DISPLAY);
        jeVar.mo13627a(true);
        jeVar.f22271w = C1133kh.m17843b(this, mo35111f());
        jeVar.f22258j = 2;
        jeVar.f22269u = "alarm";
        jeVar.f22272x = 1;
        startForeground(76182, jeVar.mo13629b());
        boolean g = mo35112g();
        this.f65021f = g;
        if (!g) {
            this.f65024i = (Vibrator) getSystemService("vibrator");
        } else if (this.f65023h == null) {
            this.f65023h = mo35108c();
        }
        this.f65019d = (WindowManager) getSystemService("window");
        if (intent2 != null && !"stopRinging".equals(intent.getAction())) {
            if (this.f65020e == null) {
                int i4 = 0;
                while (true) {
                    if (i4 >= 3) {
                        break;
                    }
                    try {
                        int i5 = Build.VERSION.SDK_INT;
                        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 2038, 524480, -2);
                        View view = new View(this);
                        this.f65020e = view;
                        view.setOnTouchListener(this);
                        this.f65019d.addView(this.f65020e, layoutParams);
                        int i6 = eoa.f15378a;
                        break;
                    } catch (RuntimeException e) {
                        agac.m53791a(e, "Could not add view to stop rings", new Object[0]);
                        i4++;
                    }
                }
            }
            agac.m53790a("Could not add view to stop rings.", new Object[0]);
        }
        if (intent2 != null) {
            try {
                if (!"stopRinging".equals(intent.getAction()) || !intent2.getBooleanExtra("remote", false)) {
                    if (!this.f65021f) {
                        new adzt().postDelayed(this.f65025j, 300000);
                        this.f65024i.vibrate(f65015o, 0);
                    } else {
                        afzv afzv = this.f65023h;
                        if (afzv.f65041e == null) {
                            afzv.f65039c = new MediaPlayer();
                            afzv.f65041e = new afzy(afzv);
                            afzv.f65041e.execute(new Void[0]);
                        }
                    }
                    if (intent2.getBooleanExtra("remote", false)) {
                        if (intent2.getBooleanExtra("includeBatteryStatus", false)) {
                            BatteryManager batteryManager = (BatteryManager) getSystemService("batterymanager");
                            cajs = afzx.m53781a(this);
                        } else {
                            cajs = null;
                        }
                        cajt b = mo35106b(intent);
                        this.f65022g = intent2.getStringExtra("echoServerToken");
                        str = "remote";
                        try {
                            afyu.m53686a(new cake[]{cake.SUCCESS}, null, cajs, b, this.f65022g, null, afzw.m53778a(this), null, this, this);
                        } catch (SecurityException e2) {
                            try {
                                if (intent2.getBooleanExtra(str, false)) {
                                }
                                return 2;
                            } finally {
                                aseo.m73884b(this, intent);
                            }
                        }
                    } else {
                        mo35105a(intent);
                    }
                    aseo.m73884b(this, intent);
                    return 2;
                }
                this.f65018c = true;
                this.f65022g = intent2.getStringExtra("echoServerToken");
                int i7 = eoa.f15378a;
                stopSelf();
                aseo.m73884b(this, intent);
                return 2;
            } catch (SecurityException e3) {
                str = "remote";
                if (intent2.getBooleanExtra(str, false)) {
                    this.f65022g = intent2.getStringExtra("echoServerToken");
                    afyu.m53686a(new cake[]{cake.GMS_PERMISSION_DENIED}, null, null, null, this.f65022g, null, afzw.m53778a(this), null, this, this);
                }
                return 2;
            }
        } else {
            str = "remote";
            agac.m53790a("Service intent is null.", new Object[0]);
            stopSelf();
            aseo.m73884b(this, null);
            return 2;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: a */
    public static void m53740a(Context context, String str, boolean z, Boolean bool, boolean z2) {
        Intent a = apuh.m71022a(context, "com.google.android.gms.mdm.services.RingService");
        a.putExtra("remote", true);
        a.putExtra("echoServerToken", str);
        a.putExtra("includeBatteryStatus", z);
        a.putExtra("includeConnectivityStatus", bool);
        if (z2) {
            a.setAction("stopRinging");
        }
        aseo.m73885c(context, a);
    }
}
