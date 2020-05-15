package p000;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;
import android.os.SystemClock;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.location.bluesky.OnFootActivityRecognition;
import java.util.ArrayList;

/* renamed from: beyi */
final /* synthetic */ class beyi implements Runnable {

    /* renamed from: a */
    private final beyv f113011a;

    /* renamed from: b */
    private final bfch f113012b;

    public beyi(beyv beyv, bfch bfch) {
        this.f113011a = beyv;
        this.f113012b = bfch;
    }

    public final void run() {
        boolean z;
        int i;
        beyv beyv = this.f113011a;
        beyv.f113043f.add(this.f113012b);
        if (!beyv.f113043f.isEmpty() && !beyv.f113047j) {
            sdo.m34970a(!beyv.f113047j);
            beyv.f113048k = cesw.f183411a.mo6606a().blueskyUseGnssAsGridCenter();
            boolean blueskyExtendGridCoveringFlpGnss = cesw.f183411a.mo6606a().blueskyExtendGridCoveringFlpGnss();
            beyv.f113049l = blueskyExtendGridCoveringFlpGnss;
            if (beyv.f113048k || blueskyExtendGridCoveringFlpGnss) {
                bhbr bhbr = beyv.f113040c;
                if (bhbr == null) {
                    beyv.f113041d.requestLocationUpdates("passive", 0, 0.0f, beyv.f113056s, Looper.getMainLooper());
                } else {
                    bhbr.mo63535a("passive", beyv.f113056s, Looper.getMainLooper(), bngx.m109376e());
                }
            }
            LocationRequest locationRequest = new LocationRequest();
            locationRequest.mo43553c((int) ErrorInfo.TYPE_SDU_MEMORY_FULL);
            locationRequest.mo43554c(1000L);
            locationRequest.mo43552b(1000L);
            LocationRequestInternal a = LocationRequestInternal.m66889a("BlueskyManager", locationRequest);
            a.f79426h = "com.google.android.gms.location";
            a.mo43611a();
            beyv.f113062y.mo24725a(a, beyv.f113055r, Looper.getMainLooper());
            bhbr bhbr2 = beyv.f113040c;
            if (bhbr2 != null) {
                bhbr2.mo63532a(beyv.f113060w, beyv.f113038a);
            } else {
                beyv.f113041d.registerGnssStatusCallback(beyv.f113061x, new adzt(Looper.getMainLooper()));
            }
            OnFootActivityRecognition onFootActivityRecognition = beyv.f113039b;
            if (onFootActivityRecognition.f150687c == null) {
                z = true;
            } else {
                z = false;
            }
            bmxy.m108601b(z, "Call unregister between register()");
            bfci bfci = onFootActivityRecognition.f150686b;
            synchronized (bfci) {
                if (!bfci.f113381b) {
                    i = 4;
                } else {
                    i = 7;
                }
                bfci.f113383d = i;
                bfci.f113382c = SystemClock.elapsedRealtimeNanos();
            }
            int length = bfci.f113380a.length + 2;
            ArrayList arrayList = new ArrayList(length + length);
            for (short s : bfci.f113380a) {
                bfci.m96339a(s, arrayList);
            }
            bfci.m96339a(3, arrayList);
            bfci.m96339a(0, arrayList);
            ActivityTransitionRequest activityTransitionRequest = new ActivityTransitionRequest(arrayList);
            onFootActivityRecognition.f150685a.registerReceiver(onFootActivityRecognition, new IntentFilter("com.google.android.location.internal.action.BLUESKY_TRANSITION_RESULT"));
            Intent intent = new Intent("com.google.android.location.internal.action.BLUESKY_TRANSITION_RESULT");
            intent.setPackage(onFootActivityRecognition.f150685a.getPackageName());
            onFootActivityRecognition.f150687c = PendingIntent.getBroadcast(onFootActivityRecognition.f150685a, 0, intent, 134217728);
            onFootActivityRecognition.f150688d.mo24683a(activityTransitionRequest, onFootActivityRecognition.f150687c);
            beyv.f113057t = beyv.f113042e.mo26070b();
            beyv.f113042e.mo26069a(beyv.f113059v);
            beyv.f113045h.mo61338z();
            boolean blueskyEnableBugreportLogs = cesw.f183411a.mo6606a().blueskyEnableBugreportLogs();
            beyv.f113051n = blueskyEnableBugreportLogs;
            if (blueskyEnableBugreportLogs) {
                synchronized (beyv.f113046i) {
                    if (beyv.f113050m == null) {
                        beyv.f113050m = bnfd.m109230a((int) cesw.f183411a.mo6606a().blueskyBugreportLogSize());
                    }
                }
            }
            beyv.f113047j = true;
        }
    }
}
