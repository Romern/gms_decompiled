package p000;

import android.net.wifi.ScanResult;
import android.os.Build;
import java.util.concurrent.TimeUnit;

/* renamed from: bidg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bidg {

    /* renamed from: a */
    public static final long f120293a = TimeUnit.SECONDS.toMillis(60);

    /* renamed from: b */
    public final bidh f120294b = new bidh();

    public bidg() {
        int i = Build.VERSION.SDK_INT;
    }

    /* renamed from: a */
    public static long m101997a(String str) {
        int length = str.length();
        long j = 0;
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            int digit = Character.digit(charAt, 16);
            if (digit != -1) {
                j = (j * 16) + ((long) digit);
            } else if (!(charAt == ':' || charAt == '-')) {
                return -1;
            }
        }
        return j;
    }

    /* renamed from: a */
    public static bhwq m101998a(ScanResult scanResult, long j, long j2) {
        return new bhwq(j, scanResult.level, scanResult.SSID != null ? scanResult.SSID.intern() : null, (short) scanResult.frequency, j2);
    }

    /* renamed from: a */
    public static boolean m101999a(long j, ScanResult scanResult) {
        return (j == -1 || j == 281474976710655L || (scanResult.capabilities != null && scanResult.capabilities.contains("[IBSS]"))) ? false : true;
    }
}
