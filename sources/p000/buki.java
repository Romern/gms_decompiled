package p000;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: buki */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buki {

    /* renamed from: f */
    private static final SimpleDateFormat f154087f = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);

    /* renamed from: a */
    public final long f154088a;

    /* renamed from: b */
    public bujz f154089b = null;

    /* renamed from: c */
    public bujz f154090c = null;

    /* renamed from: d */
    public bujz f154091d = null;

    /* renamed from: e */
    public boolean f154092e = false;

    public buki(long j) {
        this.f154088a = j;
    }

    /* renamed from: a */
    public static String m119727a(long j) {
        return String.format("%s (%d)", f154087f.format(new Date(j)), Long.valueOf(j));
    }

    /* renamed from: a */
    public final bukm mo72770a() {
        if (!this.f154092e) {
            return bulf.f154134a;
        }
        bulh bulh = new bulh();
        this.f154090c.mo72752a(bulh);
        return bulh;
    }
}
