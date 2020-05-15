package p000;

import android.net.wifi.ScanResult;
import android.os.Build;

/* renamed from: bgjz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgjz {
    /* renamed from: a */
    public static bfnw m99182a(bgkf bgkf, long j, long j2) {
        String str;
        String str2 = bgkf.f116699c;
        if (str2 != null) {
            str = str2.intern();
        } else {
            str = "";
        }
        int i = Build.VERSION.SDK_INT;
        if (!bgkf.f116702f) {
            return new bfnw(j, bgkf.f116704h, str, (short) bgkf.f116703g, j2);
        }
        ScanResult scanResult = bgkf.f116707k;
        if (scanResult != null) {
            int i2 = bgkf.f116704h;
            int i3 = bgkf.f116703g;
            int i4 = bgkf.f116701e;
            int i5 = bgkf.f116705i;
            int i6 = bgkf.f116706j;
            return new bgjq(j, i2, str, (short) i3, j2, scanResult);
        }
        int i7 = bgkf.f116704h;
        int i8 = bgkf.f116703g;
        int i9 = bgkf.f116701e;
        int i10 = bgkf.f116705i;
        int i11 = bgkf.f116706j;
        return new bfnt(j, i7, str, (short) i8, j2);
    }

    /* renamed from: a */
    public static boolean m99183a(long j, bgkf bgkf) {
        String str = bgkf.f116700d;
        return (j == -1 || j == 281474976710655L || (str != null && str.contains("[IBSS]"))) ? false : true;
    }
}
