package p000;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: buyb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buyb {

    /* renamed from: a */
    public final long f155282a;

    /* renamed from: b */
    public int f155283b;

    /* renamed from: c */
    public int f155284c;

    /* renamed from: d */
    private final int f155285d;

    public buyb(long j, int i) {
        this.f155282a = j;
        this.f155285d = i;
    }

    public final String toString() {
        long j;
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[4];
        objArr[0] = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.ENGLISH).format(new Date(this.f155282a));
        int i = this.f155283b;
        if (i == 0) {
            j = System.currentTimeMillis() - this.f155282a;
        } else {
            j = (long) i;
        }
        objArr[1] = Long.valueOf(j);
        objArr[2] = Integer.valueOf(this.f155284c);
        objArr[3] = bzal.m125582a(this.f155285d);
        return String.format(locale, "%s - %dms %d results with %s", objArr);
    }
}
