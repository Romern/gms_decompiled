package p000;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.chimera.Service;
import com.google.android.gms.mdm.services.BaseLockscreenMessageChimeraService$1;
import com.google.android.gms.mdm.services.BaseLockscreenMessageChimeraService$2;

/* renamed from: afzj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class afzj extends Service {

    /* renamed from: a */
    private final BroadcastReceiver f65008a = new BaseLockscreenMessageChimeraService$1("security");

    /* renamed from: b */
    private final BroadcastReceiver f65009b = new BaseLockscreenMessageChimeraService$2("security");

    /* renamed from: a */
    public static void m53717a(Context context) {
        afzd.f64992f.mo10352a("");
        afzd.f64993g.mo10352a("");
        context.stopService(new Intent().setClassName(context, "com.google.android.gms.mdm.services.LockscreenMessageService"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo35086a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo35087b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo35088c();

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        registerReceiver(this.f65009b, new IntentFilter("android.intent.action.USER_PRESENT"));
        registerReceiver(this.f65008a, new IntentFilter("android.intent.action.SCREEN_ON"));
    }

    public final void onDestroy() {
        aki.m919a(this).mo874a(new Intent("com.google.android.gms.mdm.DISMISS_MESSAGE"));
        unregisterReceiver(this.f65009b);
        unregisterReceiver(this.f65008a);
        stopForeground(true);
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        String stringExtra = intent.getStringExtra("lock_message");
        if (TextUtils.isEmpty(stringExtra)) {
            stopSelf();
            return 2;
        }
        afzd.f64992f.mo10352a(stringExtra);
        String stringExtra2 = intent.getStringExtra("lock_phone_number");
        if (!TextUtils.isEmpty(stringExtra2)) {
            afzd.f64993g.mo10352a(stringExtra2);
        }
        int a = qkj.m32287a(this, mo35086a());
        afzw.m53779b(this);
        int i3 = Build.VERSION.SDK_INT;
        C1102je jeVar = new C1102je(this, "find_my_device");
        jeVar.mo13630b(a);
        jeVar.mo13640e(getString(mo35087b()));
        jeVar.mo13632b(stringExtra);
        C1101jd jdVar = new C1101jd();
        jdVar.mo13593a(stringExtra);
        jeVar.mo13626a(jdVar);
        jeVar.f22254f = PendingIntent.getActivity(this, 0, afys.m53682a(this, stringExtra, stringExtra2, true), 0);
        jeVar.f22271w = C1133kh.m17843b(this, mo35088c());
        jeVar.f22258j = 2;
        jeVar.f22269u = "msg";
        jeVar.f22272x = 1;
        Notification b = jeVar.mo13629b();
        afzq.m53767d(this);
        startForeground(76183, b);
        startActivity(afys.m53682a(this, stringExtra, stringExtra2, false));
        return 3;
    }

    /* renamed from: a */
    public static void m53718a(Context context, String str, String str2) {
        Intent className = new Intent().setClassName(context, "com.google.android.gms.mdm.services.LockscreenMessageService");
        className.putExtra("lock_message", str);
        if (!TextUtils.isEmpty(str2)) {
            className.putExtra("lock_phone_number", str2);
        }
        context.startService(className);
    }
}
