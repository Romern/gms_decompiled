package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.felicanetworks.mfc.C0126R;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: apus */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apus {

    /* renamed from: a */
    public final int f84950a;

    /* renamed from: b */
    private final Context f84951b;

    public apus(Context context) {
        this.f84951b = context;
        this.f84950a = apuh.m71028b(context, "com.android.vending") ? apuh.m71020a(context) : -1;
    }

    /* renamed from: a */
    public static String m71060a(Context context, long j) {
        apul a = apum.m71044a(context, System.currentTimeMillis(), j);
        if (a == null) {
            return null;
        }
        int i = a.f84925a;
        if (i == 1) {
            return context.getString(C0126R.string.verify_apps_last_scanned, a.f84926b);
        } else if (i == 2) {
            return context.getString(C0126R.string.verify_apps_last_scanned_yesterday, a.f84926b);
        } else if (i != 3) {
            return context.getString(C0126R.string.verify_apps_last_scanned_date, a.f84926b);
        } else {
            Resources resources = context.getResources();
            int i2 = a.f84927c;
            return resources.getQuantityString(C0126R.plurals.verify_apps_last_scanned_days_ago, i2, Integer.valueOf(i2));
        }
    }

    /* renamed from: a */
    public final apup mo47632a(boolean z, long j, TimeUnit timeUnit) {
        int i = this.f84950a;
        apup apup = null;
        if (i >= 80770500) {
            Intent intent = new Intent("com.google.android.vending.verifier.ACTION_PACKAGE_VERIFICATION_API").setPackage("com.android.vending");
            apur apur = new apur(this.f84951b, this.f84950a, z);
            skh.m35531a().mo25690a(this.f84951b, intent, apur.f84949f, 1);
            try {
                if (!apur.f84944a.await(j, timeUnit)) {
                    try {
                        skh.m35531a().mo25689a(apur.f84945b, apur.f84949f);
                    } catch (RuntimeException e) {
                    }
                    return apup;
                }
                apup = apur.f84948e;
                skh.m35531a().mo25689a(apur.f84945b, apur.f84949f);
                return apup;
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                skh.m35531a().mo25689a(apur.f84945b, apur.f84949f);
            } catch (Throwable th) {
                try {
                    skh.m35531a().mo25689a(apur.f84945b, apur.f84949f);
                } catch (RuntimeException e3) {
                }
                throw th;
            }
        } else if (i < 80700200) {
            return null;
        } else {
            try {
                apup[] apupArr = {null};
                CountDownLatch countDownLatch = new CountDownLatch(1);
                aptx.m70998a(this.f84951b, new aptx(this.f84951b, new apun(apupArr, countDownLatch)).f84890a.f84887c);
                if (countDownLatch.await(j, timeUnit)) {
                    return apupArr[0];
                }
                return null;
            } catch (Exception e4) {
                return null;
            }
        }
    }
}
