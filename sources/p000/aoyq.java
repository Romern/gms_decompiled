package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.util.Random;

/* renamed from: aoyq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoyq {

    /* renamed from: a */
    private static final Random f83858a = new Random();

    /* renamed from: b */
    private long f83859b;

    /* renamed from: c */
    private boolean f83860c;

    /* renamed from: d */
    private final aoyj f83861d;

    /* renamed from: e */
    private final int f83862e;

    public aoyq(int i) {
        aoyj a = aoyj.m69819a();
        this.f83862e = i;
        this.f83861d = a;
    }

    /* renamed from: a */
    public final void mo47010a() {
        this.f83860c = true;
        this.f83859b = System.currentTimeMillis();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo47013b(Context context, String str, boolean z) {
        int i;
        long currentTimeMillis = System.currentTimeMillis() - this.f83859b;
        if (currentTimeMillis < 0) {
            return;
        }
        if (z) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                if (type == 0) {
                    switch (((TelephonyManager) context.getSystemService("phone")).getNetworkType()) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                            i = 4;
                            break;
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                            i = 5;
                            break;
                        case 13:
                            i = 6;
                            break;
                    }
                } else {
                    i = type != 1 ? type != 6 ? type != 9 ? 2 : 8 : 7 : 3;
                }
                this.f83861d.mo46990a(this.f83862e, str, currentTimeMillis, i);
                return;
            }
            i = 2;
            this.f83861d.mo46990a(this.f83862e, str, currentTimeMillis, i);
            return;
        }
        this.f83861d.mo46990a(this.f83862e, str, currentTimeMillis, 2);
    }

    /* renamed from: a */
    public final void mo47011a(Context context, String str) {
        if (this.f83860c && this.f83859b != 0 && f83858a.nextDouble() >= cgij.f186992a.mo6606a().mo83860K()) {
            mo47013b(context, str, true);
        }
        this.f83860c = false;
    }

    /* renamed from: a */
    public final void mo47012a(Context context, String str, boolean z) {
        if (this.f83860c && this.f83859b != 0) {
            mo47013b(context, str, z);
        }
        this.f83860c = false;
    }
}
