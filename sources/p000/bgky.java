package p000;

import android.content.Context;
import java.util.Locale;

/* renamed from: bgky */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgky {

    /* renamed from: a */
    public static final short[] f116730a = {250, 500, 1000, 2000, 4000, 8000};

    /* renamed from: b */
    final asfb f116731b;

    /* renamed from: c */
    public final String f116732c;

    /* renamed from: d */
    public long f116733d = -1;

    /* renamed from: e */
    final short[] f116734e;

    public bgky(Context context, boolean z, String str, short[] sArr) {
        String str2;
        if (!str.toLowerCase(Locale.US).contains("collector")) {
            str2 = "NlpWakeLock";
        } else {
            str2 = "NlpCollectorWakeLock";
        }
        asfb asfb = new asfb(context, str2, str);
        this.f116731b = asfb;
        if (!z) {
            asfb.mo49115a(false);
        }
        this.f116732c = str;
        this.f116734e = sArr;
    }

    /* renamed from: a */
    public final long mo62963a(long j) {
        synchronized (bgla.f116740a) {
            long j2 = this.f116733d;
            if (j2 == -1) {
                return -1;
            }
            long j3 = j - j2;
            return j3;
        }
    }

    /* renamed from: a */
    public final boolean mo62964a() {
        return this.f116731b.mo49124e();
    }
}
