package com.google.android.gms.netrec;

import android.content.Intent;
import android.database.ContentObserver;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import android.provider.Settings;
import com.google.android.chimera.BoundService;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NetworkRecommendationService extends BoundService {

    /* renamed from: a */
    public akjm f81170a;

    /* renamed from: b */
    public final akjo f81171b;

    /* renamed from: c */
    public final List f81172c;

    /* renamed from: d */
    private sns f81173d;

    /* renamed from: e */
    private final List f81174e;

    /* renamed from: f */
    private bqgj f81175f;

    /* renamed from: g */
    private final ContentObserver f81176g;

    public NetworkRecommendationService() {
        this.f81171b = new akjo();
        this.f81174e = new ArrayList(2);
        this.f81172c = new ArrayList();
        this.f81176g = new akjn(this, "netrec", "NetworkRecommendationService", new adzt(Looper.getMainLooper()));
        this.f81173d = null;
    }

    /* renamed from: a */
    public final void mo44675a() {
        if (!this.f81171b.f72106a.compareAndSet(true, false)) {
            eoa.m10826b("NetRec", "Service already stopped.", new Object[0]);
            return;
        }
        eoa.m10826b("NetRec", "Stopping service.", new Object[0]);
        akjm akjm = this.f81170a;
        if (akjm != null) {
            akmi.m60009a(akjm.f72096b);
        }
        List list = this.f81172c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            akko akko = (akko) list.get(i);
            if (akko.f72168a.compareAndSet(true, false)) {
                akko.mo39519d();
            }
        }
    }

    public final IBinder onBind(Intent intent) {
        akjm akjm = this.f81170a;
        if (akjm != null) {
            return akjm.getBinder();
        }
        return null;
    }

    public final void onCreate() {
        eoa.m10826b("NetRec", "Creating service.", new Object[0]);
        int i = Build.VERSION.SDK_INT;
        if (this.f81173d == null) {
            this.f81173d = new sns("NetRecController", 9);
        }
        this.f81173d.start();
        snr snr = new snr(this.f81173d);
        this.f81175f = new soc((int) cfpd.f185332a.mo6606a().mo82425I(), 9);
        akjm akjm = new akjm(getApplicationContext(), this.f81175f, this.f81171b);
        this.f81170a = akjm;
        this.f81174e.add(akjm);
        this.f81172c.add(new akkn(this, snr, (WifiManager) getSystemService("wifi"), (ConnectivityManager) getSystemService("connectivity")));
        this.f81172c.add(new akkm(getContentResolver(), snr));
        this.f81172c.add(new akkk(this, getContentResolver(), snr, (PowerManager) getSystemService("power")));
        getContentResolver().registerContentObserver(Settings.Global.getUriFor("network_recommendations_package"), false, this.f81176g);
        getContentResolver().registerContentObserver(Settings.Global.getUriFor("network_recommendations_enabled"), false, this.f81176g);
        this.f81176g.onChange(false);
    }

    public final void onDestroy() {
        eoa.m10826b("NetRec", "Destroying service.", new Object[0]);
        if (this.f81171b.mo39505a()) {
            mo44675a();
        }
        getContentResolver().unregisterContentObserver(this.f81176g);
        akjm akjm = this.f81170a;
        if (akjm != null) {
            aknd aknd = akjm.f72095a;
            if (cdiv.m133521b()) {
                aknd.f72297a.mo24388e();
            }
        }
        sns sns = this.f81173d;
        if (sns != null) {
            sns.quitSafely();
        }
        bqgj bqgj = this.f81175f;
        if (bqgj != null) {
            bqgj.shutdown();
        }
        this.f81172c.clear();
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i = Build.VERSION.SDK_INT;
        printWriter.println("==== NetworkRecommendationService start ====");
        if (this.f81171b.mo39505a()) {
            printWriter.println("Service is enabled.");
            if (akjl.m59883a(strArr)) {
                List list = this.f81174e;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((akjk) list.get(i2)).mo39503a(printWriter, strArr);
                }
            }
        } else {
            printWriter.println("Service not enabled.");
        }
        printWriter.println("==== NetworkRecommendationService end ====");
    }

    NetworkRecommendationService(sns sns) {
        this.f81171b = new akjo();
        this.f81174e = new ArrayList(2);
        this.f81172c = new ArrayList();
        this.f81176g = new akjn(this, "netrec", "NetworkRecommendationService", new adzt(Looper.getMainLooper()));
        this.f81173d = sns;
    }
}
