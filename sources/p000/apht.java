package p000;

import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.scheduler.DeviceStateReceiver;
import com.google.android.gms.scheduler.SchedulerDebugReceiver;
import com.google.android.gms.scheduler.standalone.ReceiverBasedNetworkConstraintObserver;

/* renamed from: apht */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apht {

    /* renamed from: f */
    private static Boolean f84399f;

    /* renamed from: g */
    private static apht f84400g;

    /* renamed from: a */
    public aphm f84401a;

    /* renamed from: b */
    public apjy f84402b;

    /* renamed from: c */
    public final aamf f84403c;

    /* renamed from: d */
    public final aakr f84404d = new aakr();

    /* renamed from: e */
    public final DeviceStateReceiver f84405e = new DeviceStateReceiver();

    private apht(Context context) {
        this.f84403c = new aamf(context);
    }

    /* renamed from: a */
    public static synchronized apht m70315a() {
        synchronized (apht.class) {
            if (f84400g == null) {
                rpr b = rpr.m34216b();
                aajg.m21335a((Context) b);
                f84399f = Boolean.valueOf(aytw.m84813a(rpr.m34216b()));
                boolean z = true;
                if (!aajg.m21343c()) {
                    if (aajg.m21344d() == 0) {
                        z = false;
                    }
                    sdo.m34970a(z);
                    apht apht = new apht(b);
                    f84400g = apht;
                    return apht;
                }
                srb srb = srb.f45012a;
                if (aajg.m21344d() != 0) {
                    z = false;
                }
                sdo.m34970a(z);
                apht apht2 = new apht(b);
                if (!m70316b()) {
                    apht2.mo47224a(b, srb);
                }
                DeviceStateReceiver deviceStateReceiver = apht2.f84405e;
                int i = Build.VERSION.SDK_INT;
                IntentFilter intentFilter = new IntentFilter();
                int i2 = Build.VERSION.SDK_INT;
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
                int i3 = Build.VERSION.SDK_INT;
                intentFilter.addAction("android.os.action.LIGHT_DEVICE_IDLE_MODE_CHANGED");
                int i4 = Build.VERSION.SDK_INT;
                intentFilter.addAction("android.intent.action.DREAMING_STARTED");
                intentFilter.addAction("android.intent.action.DREAMING_STOPPED");
                intentFilter.addAction("android.intent.action.DOCK_IDLE");
                intentFilter.addAction("android.intent.action.DOCK_ACTIVE");
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("com.google.android.gms.gcm.TRIGGER_IDLE");
                b.registerReceiver(deviceStateReceiver, intentFilter);
                if (rfy.m33550g(b)) {
                    SchedulerDebugReceiver schedulerDebugReceiver = new SchedulerDebugReceiver();
                    IntentFilter intentFilter2 = new IntentFilter();
                    intentFilter2.addAction("com.google.android.gms.gcm.ACTION_SCHEDULER_DEBUG");
                    b.registerReceiver(schedulerDebugReceiver, intentFilter2);
                }
                f84400g = apht2;
                return apht2;
            }
            apht apht3 = f84400g;
            return apht3;
        }
    }

    /* renamed from: b */
    public static synchronized boolean m70316b() {
        boolean equals;
        synchronized (apht.class) {
            if (ceck.m135995e()) {
                sdo.m34959a(f84399f);
            }
            equals = Boolean.TRUE.equals(f84399f);
        }
        return equals;
    }

    /* renamed from: a */
    public final void mo47224a(Context context, sqv sqv) {
        Looper looper;
        adzi adzi;
        apko apko;
        Context context2 = context;
        if (!ceea.f182428a.mo6606a().mo78927l()) {
            this.f84401a = null;
            this.f84402b = null;
        } else if (this.f84401a == null) {
            apkg apkg = new apkg(context, new skc(context2), this.f84404d, snp.m35702a(10), new apkl(), new aphr(new qws(context2, "GCM", null)));
            aplm aplm = new aplm(context2);
            aphw aphw = new aphw(context2, this.f84403c);
            bqgj b = snp.m35704b(10);
            HandlerThread handlerThread = new HandlerThread("netscheduler-queue-handler", 10);
            handlerThread.start();
            if (!cedr.f182397a.mo6606a().mo78903p()) {
                looper = Looper.getMainLooper();
            } else {
                looper = handlerThread.getLooper();
            }
            aamf aamf = this.f84403c;
            apje apje = new apje(aamf, new apjc(aamf, looper));
            int i = Build.VERSION.SDK_INT;
            if (!cedx.m136353b()) {
                adzi = new adzi((JobScheduler) context2.getSystemService(JobScheduler.class));
            } else {
                adzi = null;
            }
            if (adzi != null) {
                Log.i("NetworkScheduler", "Using JobScheduler engine");
                apjr apjr = new apjr(aplm, new apib[]{new apjs(adzi, new apjz(new ComponentName("com.google.android.gms", "com.google.android.gms.gcm.nts.TaskExecutionService"), sqv))}, this.f84403c, aphw, new apjp(), adzi, new apia(context2), apkg);
                this.f84401a = new aphm(context2, apjr, b, this.f84404d);
                this.f84402b = new apjy(apjr, adzi, apje, b);
                return;
            }
            Log.i("NetworkScheduler", "Using standalone scheduling engine");
            int i2 = Build.VERSION.SDK_INT;
            if (ceea.f182428a.mo6606a().mo78917b()) {
                apko = new apko(context2);
            } else {
                apko = new ReceiverBasedNetworkConstraintObserver(context2);
            }
            this.f84401a = new aphm(context, new aplb(context, apje, apko, aplm, b, handlerThread.getLooper(), new apib[]{new apkr(context2, aplm)}, this.f84403c, aphw, new apia(context2), new apli(context2, new skc(context2)), apkg), b, this.f84404d);
            this.f84402b = null;
        }
    }
}
