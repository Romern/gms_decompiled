package p000;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.Date;
import java.util.List;

/* renamed from: beua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beua implements bfms {

    /* renamed from: a */
    public final bgmk f112448a;

    /* renamed from: b */
    public final bgns f112449b;

    /* renamed from: c */
    public final berb f112450c;

    /* renamed from: d */
    public final bety f112451d = new bety(this);

    /* renamed from: e */
    public betv f112452e;

    /* renamed from: f */
    public long f112453f;

    /* renamed from: g */
    private final berg f112454g;

    /* renamed from: h */
    private final bfor f112455h;

    /* renamed from: i */
    private final List f112456i;

    public beua(berg berg, bgmk bgmk, bfor bfor, bgns bgns, berb berb, List list) {
        betu betu = new betu(this);
        this.f112452e = betu;
        this.f112453f = -1;
        this.f112454g = berg;
        this.f112448a = bgmk;
        this.f112455h = bfor;
        this.f112449b = bgns;
        this.f112450c = berb;
        this.f112456i = list;
        this.f112451d.mo61144a(betu, SystemClock.elapsedRealtime());
    }

    /* renamed from: a */
    public static boolean m95854a(ActivityRecognitionResult activityRecognitionResult) {
        DetectedActivity a = activityRecognitionResult.mo43491a();
        return a.mo43513a() == 2 && ((long) a.f79320e) >= ceuq.f183443a.mo6606a().arVehicleExitOnFootConfidenceThreshold();
    }

    /* renamed from: b */
    public static boolean m95855b(ActivityRecognitionResult activityRecognitionResult) {
        return activityRecognitionResult.mo43491a().mo43513a() == 0;
    }

    /* renamed from: a */
    public final void mo61145a(long j) {
        if (j != this.f112453f) {
            this.f112453f = j;
            String valueOf = String.valueOf(new Date(bgof.m99492e() + j));
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("Alarm set to: ");
            sb.append(j);
            sb.append(" ");
            sb.append(valueOf);
            sb.toString();
            this.f112449b.mo62917a(bgnq.VEHICLE_EXIT_DETECTOR, j, null);
        }
    }

    /* renamed from: a */
    public final void mo61146a(betv betv) {
        betv betv2 = betv;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String b = this.f112452e.mo61140b();
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 40);
        sb.append("Leaving state: ");
        sb.append(b);
        sb.append(" at: ");
        sb.append(elapsedRealtime);
        sb.toString();
        bfor bfor = this.f112455h;
        String b2 = this.f112452e.mo61140b();
        String b3 = betv.mo61140b();
        StringBuilder sb2 = new StringBuilder(String.valueOf(b2).length() + 4 + String.valueOf(b3).length());
        sb2.append(b2);
        sb2.append(" -> ");
        sb2.append(b3);
        String sb3 = sb2.toString();
        bfor.mo62047a(new bfop(bfos.VEHICLE_EXIT_STATE_CHANGE, bfor.mo62055b(), sb3, sb3.hashCode()));
        this.f112452e.mo61138a(betv2);
        this.f112452e = betv2;
        String b4 = betv.mo61140b();
        StringBuilder sb4 = new StringBuilder(String.valueOf(b4).length() + 41);
        sb4.append("Entering state: ");
        sb4.append(b4);
        sb4.append(" at: ");
        sb4.append(elapsedRealtime);
        sb4.toString();
        this.f112451d.mo61144a(betv2, elapsedRealtime);
        this.f112452e.mo61137a();
        List list = this.f112456i;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((betx) list.get(i)).mo61013a(betv2);
            }
        }
    }

    /* renamed from: a */
    public final void mo61147a(boolean z) {
        Bundle bundle;
        this.f112455h.mo62048a(bfos.VEHICLE_EXIT_DETECTED);
        int i = bevp.VEHICLE_EXIT_TALA.f112768am;
        DetectedActivity detectedActivity = new DetectedActivity(6, 100);
        long currentTimeMillis = System.currentTimeMillis();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (z) {
            bundle = aega.m51813a(null, "vehicle_personal_confidence");
        } else {
            bundle = null;
        }
        this.f112454g.mo61010a(new ActivityRecognitionResult(detectedActivity, currentTimeMillis, elapsedRealtime, i, bundle));
        List list = this.f112456i;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((betx) list.get(i2)).mo61014a(z);
            }
        }
        mo61146a(new betz(this));
    }

    /* renamed from: a */
    public final void mo60973a(boolean z, int i, bfmj bfmj) {
        if (z && i == 1) {
            this.f112452e.mo61141c();
        }
    }
}
