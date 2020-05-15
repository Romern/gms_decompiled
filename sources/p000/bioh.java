package p000;

import android.content.Context;
import android.location.Location;
import android.util.Log;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bioh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bioh {

    /* renamed from: a */
    public static final long f121046a = TimeUnit.SECONDS.toMillis(150);

    /* renamed from: a */
    public static biog m102655a(Context context, String str, rjx rjx, long j) {
        int i;
        if (!m102656a(context, str)) {
            return new biog(null, 13);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference(null);
        try {
            rjx.mo24756l().mo50371a(new biof(new bioe(atomicReference, countDownLatch), rjx, j));
            if (countDownLatch.await(j, TimeUnit.MILLISECONDS)) {
                Location location = (Location) atomicReference.get();
                if (location != null) {
                    i = 0;
                } else {
                    i = 8;
                }
                return new biog(location, i);
            }
            if (Log.isLoggable("Places", 6)) {
                Log.e("Places", "Timed out waiting for a location for getCurrentPlace");
            }
            return new biog(null, 15);
        } catch (InterruptedException e) {
            if (Log.isLoggable("Places", 6)) {
                Log.e("Places", "Interrupted while waiting for a location for getCurrentPlace.");
            }
            return new biog(null, 14);
        }
    }

    /* renamed from: a */
    public static boolean m102656a(Context context, String str) {
        return spx.m35925a(context).mo25960c("android:fine_location", spn.m35897i(context, str), str) == 0;
    }
}
