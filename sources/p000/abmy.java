package p000;

import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: abmy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abmy {

    /* renamed from: a */
    private static rjx f57717a;

    @Deprecated
    /* renamed from: a */
    public static bory m47934a() {
        String str;
        sdo.m34973b("Must not call getActivityRecognition() from main thread");
        int i = eoa.f15378a;
        try {
            ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) aucu.m76783a(m47936b().mo24754k(), celh.f182898a.mo6606a().mo79270a(), TimeUnit.MILLISECONDS);
            if (activityRecognitionResult != null) {
                return m47935a(activityRecognitionResult);
            }
            return null;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            eoa.m10824a("Herrevad", "Error on ActivityRecognition", e);
            aylp a = abnd.m47941a();
            if (!(e instanceof TimeoutException)) {
                str = "error";
            } else {
                str = "timeout";
            }
            ((beon) a.f97909k.mo6606a()).mo60861b(str);
            return null;
        }
    }

    /* renamed from: b */
    public static rjx m47936b() {
        if (f57717a == null) {
            f57717a = abmx.f57716b;
        }
        return f57717a;
    }

    /* renamed from: a */
    public static bory m47935a(ActivityRecognitionResult activityRecognitionResult) {
        bxvd da = bory.f134528e.mo74144da();
        for (DetectedActivity detectedActivity : activityRecognitionResult.f79300a) {
            if (abmx.f57715a.contains(Integer.valueOf(detectedActivity.mo43513a()))) {
                bxvd da2 = borx.f134523d.mo74144da();
                int a = detectedActivity.mo43513a();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                borx borx = (borx) da2.f164949b;
                int i = borx.f134525a | 1;
                borx.f134525a = i;
                borx.f134526b = a;
                int i2 = detectedActivity.f79320e;
                borx.f134525a = i | 2;
                borx.f134527c = i2;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bory bory = (bory) da.f164949b;
                borx borx2 = (borx) da2.mo74062i();
                borx2.getClass();
                if (!bory.f134531b.mo73666a()) {
                    bory.f134531b = bxvk.m124021a(bory.f134531b);
                }
                bory.f134531b.add(borx2);
            }
        }
        long currentTimeMillis = System.currentTimeMillis() - activityRecognitionResult.f79301b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bory bory2 = (bory) da.f164949b;
        int i3 = bory2.f134530a | 1;
        bory2.f134530a = i3;
        bory2.f134532c = currentTimeMillis;
        int i4 = activityRecognitionResult.f79303d;
        bory2.f134530a = i3 | 2;
        bory2.f134533d = i4;
        return (bory) da.mo74062i();
    }
}
