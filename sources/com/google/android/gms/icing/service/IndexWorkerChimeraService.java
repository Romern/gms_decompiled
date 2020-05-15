package com.google.android.gms.icing.service;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;
import com.google.android.chimera.Service;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class IndexWorkerChimeraService extends Service {

    /* renamed from: a */
    static final long f79086a = TimeUnit.MINUTES.toMillis(10);

    /* renamed from: c */
    public static final /* synthetic */ int f79087c = 0;

    /* renamed from: b */
    public acri f79088b;

    /* renamed from: a */
    public final abrv mo43420a() {
        sdo.m34959a(this.f79088b);
        return this.f79088b.mo33016b();
    }

    /* renamed from: b */
    public final aeat mo43422b() {
        return aeat.m51532a(mo43420a().f58066b);
    }

    /* renamed from: c */
    public final SharedPreferences mo43423c() {
        sdo.m34960a();
        return getSharedPreferences("IndexWorkerChimeraService_preferences", 0);
    }

    public final IBinder onBind(Intent intent) {
        absg.m48186a("%s: Binding with intent %s", "main", intent);
        return null;
    }

    public final void onCreate() {
        absg.m48185a("%s: IndexWorkerService onCreate", "main");
        if (cemq.m137369f()) {
            this.f79088b = acri.m49734a("main", getApplicationContext());
        }
        super.onCreate();
    }

    public final void onDestroy() {
        absg.m48185a("%s: IndexWorkerService onDestroy", "main");
        acri acri = this.f79088b;
        if (acri != null) {
            acri.mo33015a();
        }
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        absg.m48186a("%s: IndexWorkerService: onStartCommand with %s", "main", intent);
        if (intent != null && "com.google.android.gms.icing.START_STICKY".equals(intent.getAction())) {
            return 1;
        }
        acri acri = this.f79088b;
        if (acri != null) {
            acri.f60610c.mo32995d(new acqz(this, bqbd.INDEX_WORKER, intent));
            return 2;
        }
        absg.m48184a("IndexWorkerService is unavailable on this device");
        return 2;
    }

    public final boolean onUnbind(Intent intent) {
        absg.m48185a("%s: Unbind", "main");
        return false;
    }

    /* renamed from: a */
    public final void mo43421a(String str) {
        aebm a = absh.m48213a("maintenance", TimeUnit.MILLISECONDS.toSeconds(((Long) abzt.f58859a.mo58455c()).longValue()), TimeUnit.MILLISECONDS.toSeconds(f79086a), 2, true);
        absg.m48194b("Scheduling maintenance at %s period=%ds flex=%ds reason=%s", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()), Long.valueOf(a.f63072a), Long.valueOf(a.f63073b), str);
        mo43422b().mo33984a(a);
        mo43423c().edit().putBoolean("maintenance_scheduled", true).apply();
    }
}
