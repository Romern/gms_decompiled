package p000;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.Locale;

/* renamed from: bgjk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgjk implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bugr f116611a;

    /* renamed from: b */
    final /* synthetic */ bgjl f116612b;

    /* renamed from: c */
    final /* synthetic */ buhd f116613c;

    public bgjk(bgjl bgjl, bugr bugr, buhd buhd) {
        this.f116612b = bgjl;
        this.f116611a = bugr;
        this.f116613c = buhd;
    }

    public final void run() {
        Locale locale = Locale.US;
        int i = 0;
        new Object[1][0] = Long.valueOf(this.f116611a.mo72639a());
        bufu bufu = (bufu) this.f116613c.mo72661a((bxxk) bufu.f153741b.mo74142c(7));
        if (bufu != null) {
            String valueOf = String.valueOf(bufu);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("onMessageReceived: offBodyResult = ");
            sb.append(valueOf);
            sb.toString();
            bgna bgna = this.f116612b.f116614a.f116839g;
            if (bgna != null) {
                boolean z = bufu.f153743a;
                berb berb = (berb) bgna;
                bgnb bgnb = berb.f112172av;
                if (bgnb != null && bgnb.f116833a) {
                    if (z) {
                        i = 100;
                    }
                    berb.mo60967a(new ActivityRecognitionResult(new DetectedActivity(9, i), System.currentTimeMillis(), SystemClock.elapsedRealtime(), bevp.WATCH_HARDWARE_OFF_BODY_GCORE_V6.f112768am, (Bundle) null));
                    berb.f112163am = SystemClock.elapsedRealtime();
                    berb.f112190q.mo61115C();
                    StringBuilder sb2 = new StringBuilder(42);
                    sb2.append("reported OFF_BODY confidence = ");
                    sb2.append(i);
                    sb2.toString();
                }
            }
        }
    }
}
