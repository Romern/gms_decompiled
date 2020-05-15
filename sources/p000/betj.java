package p000;

import android.os.Bundle;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.Collections;

/* renamed from: betj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class betj extends beqp {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public betj() {
        super(400000000);
        bevp bevp = bevp.UNKNOWN;
    }

    /* renamed from: a */
    public final bfnq mo60938a(long j, long j2, bfku bfku) {
        int i;
        bfku bfku2 = bfku;
        beur beur = this.f112060b;
        boolean z = true;
        if (beur == null) {
            int i2 = bfku2.f114316b;
            int a = beqp.m95443a(bfku2, i2 - 1, 400000000);
            if (a == -1) {
                return bfnq.m97344a(beqt.m95451b((long) bfku2.f114316b), null, Collections.emptyList());
            }
            bfku b = bfku2.mo61860b(a, i2 - a);
            int i3 = b.f114316b;
            double[] dArr = new double[i3];
            int a2 = b.mo61855a();
            for (int i4 = 0; i4 < i3; i4++) {
                double d = 0.0d;
                for (int i5 = 0; i5 < a2; i5++) {
                    double a3 = (double) b.mo61854a(i4, i5);
                    Double.isNaN(a3);
                    Double.isNaN(a3);
                    d += a3 * a3;
                }
                dArr[i4] = Math.sqrt(d);
            }
            double d2 = Double.MAX_VALUE;
            double d3 = Double.MIN_VALUE;
            for (int i6 = 0; i6 < i3; i6++) {
                double d4 = dArr[i6];
                if (d4 < d2) {
                    d2 = d4;
                }
                if (d4 > d3) {
                    d3 = d4;
                }
            }
            if (d3 - d2 >= 1.0d) {
                z = false;
            }
        } else if (beur != beur.STILL) {
            z = false;
        }
        if (!z) {
            i = 4;
        } else {
            i = 3;
        }
        ActivityRecognitionResult activityRecognitionResult = new ActivityRecognitionResult(new DetectedActivity(i, 100), j, j2, bevp.STATIONARY_FROYO.f112768am, (Bundle) null);
        this.f112061c = false;
        return bfnq.m97344a(beqt.f112072c, activityRecognitionResult, Collections.emptyList());
    }
}
