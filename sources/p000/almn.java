package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.util.concurrent.TimeUnit;

/* renamed from: almn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class almn {

    /* renamed from: a */
    private final bmza f73779a;

    public almn(bmza bmza) {
        this.f73779a = bmza;
    }

    /* renamed from: a */
    public static int m61290a(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return 1;
        }
        int type = activeNetworkInfo.getType();
        if (type == 0) {
            switch (((TelephonyManager) context.getSystemService("phone")).getNetworkType()) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return 3;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    return 4;
                case 13:
                    return 5;
                default:
                    return 1;
            }
        } else if (type == 1) {
            return 2;
        } else {
            if (type == 6) {
                return 6;
            }
            if (type != 9) {
                return 1;
            }
            return 7;
        }
    }

    /* renamed from: a */
    public final void mo40526a() {
        this.f73779a.mo66929c();
        this.f73779a.mo66930d();
    }

    /* renamed from: a */
    public final void mo40527a(Context context, String str, boolean z) {
        this.f73779a.mo66931e();
        almk a = almk.m61263a();
        long a2 = this.f73779a.mo66928a(TimeUnit.MILLISECONDS);
        if (a2 < 0) {
            return;
        }
        if (!z) {
            a.mo40524a(str, a2, 1);
        } else {
            a.mo40524a(str, a2, m61290a(context));
        }
    }
}
