package p000;

import java.util.Locale;

/* renamed from: beqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beqt {

    /* renamed from: c */
    public static final beqt f112072c = m95449a(Long.MAX_VALUE);

    /* renamed from: a */
    public final int f112073a;

    /* renamed from: b */
    public final String f112074b;

    /* renamed from: d */
    private final Long f112075d;

    private beqt(int i, Long l, String str) {
        this.f112073a = i;
        this.f112075d = l;
        this.f112074b = str;
    }

    /* renamed from: a */
    public static beqt m95449a(long j) {
        bxbm.m122544b(j >= 0);
        return new beqt(0, Long.valueOf(j), null);
    }

    /* renamed from: b */
    public static beqt m95451b(long j) {
        bxbm.m122544b(true);
        return new beqt(1, Long.valueOf(j), null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Error [errorCode=");
        int i = this.f112073a;
        if (i == 0) {
            sb.append(String.format(Locale.US, "ERROR_CODE_SUCCESS, skipTimeMillis=%d]", this.f112075d));
        } else if (i == 1) {
            sb.append(String.format(Locale.US, "ERROR_CODE_INSUFFICIENT_SAMPLES, numOfSamples=%d]", this.f112075d));
        } else {
            sb.append("ERROR_CODE_FATAL]");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static beqt m95450a(String str) {
        bxbm.m122539a(str);
        return new beqt(2, null, str);
    }

    /* renamed from: a */
    public final long mo60942a() {
        if (this.f112073a == 0) {
            return this.f112075d.longValue();
        }
        return Long.MAX_VALUE;
    }
}
