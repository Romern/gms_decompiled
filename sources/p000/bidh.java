package p000;

import android.net.wifi.ScanResult;
import java.util.concurrent.TimeUnit;

/* renamed from: bidh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bidh {

    /* renamed from: c */
    private static final long f120295c = TimeUnit.HOURS.toMillis(1);

    /* renamed from: a */
    private int f120296a = 0;

    /* renamed from: b */
    private int f120297b;

    /* renamed from: a */
    public final boolean mo64542a(long j, ScanResult[] scanResultArr) {
        int length;
        int i = this.f120296a;
        int i2 = 0;
        if (i != 0) {
            return i != 1;
        }
        if (scanResultArr == null || (length = scanResultArr.length) == 0) {
            return true;
        }
        if (i == 0) {
            this.f120297b++;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                ScanResult scanResult = scanResultArr[i2];
                if (scanResult != null) {
                    long j2 = scanResult.timestamp / 1000;
                    if (j2 != 0 && j2 != -1) {
                        if (Math.abs(j - j2) > f120295c) {
                            this.f120296a = 1;
                            break;
                        } else if (this.f120297b > 6) {
                            this.f120296a = 2;
                        }
                    } else {
                        this.f120296a = 1;
                    }
                }
                i2++;
            }
        }
        return mo64542a(j, null);
    }
}
