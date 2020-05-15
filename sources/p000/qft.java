package p000;

import android.content.Context;
import android.telephony.TelephonyManager;

/* renamed from: qft */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qft {

    /* renamed from: a */
    public static final sek f41131a = qgn.m32143a("SimHelper");

    /* renamed from: b */
    public final Context f41132b;

    /* renamed from: c */
    public final TelephonyManager f41133c;

    public qft(Context context) {
        this.f41132b = context;
        this.f41133c = (TelephonyManager) context.getSystemService("phone");
    }

    /* renamed from: a */
    public final String mo24019a() {
        String simSerialNumber = this.f41133c.getSimSerialNumber();
        String str = "no-sim\nno-imsi";
        if (simSerialNumber != null) {
            str = str.replace("no-sim", simSerialNumber);
        }
        String subscriberId = this.f41133c.getSubscriberId();
        return subscriberId != null ? str.replace("no-imsi", subscriberId) : str;
    }
}
