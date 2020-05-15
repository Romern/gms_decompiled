package p000;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

/* renamed from: bfiu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfiu {

    /* renamed from: a */
    protected final bgmk f114058a;

    /* renamed from: b */
    protected final bgns f114059b;

    /* renamed from: c */
    protected final Random f114060c;

    /* renamed from: d */
    public final bfjy f114061d;

    /* renamed from: e */
    long f114062e = -1;

    /* renamed from: f */
    long f114063f = -1;

    /* renamed from: g */
    public final bfla f114064g;

    /* renamed from: h */
    public final bfjf f114065h;

    /* renamed from: i */
    private final bgnq f114066i;

    /* renamed from: j */
    private final int f114067j;

    public bfiu(bgmk bgmk, bgns bgns, bfla bfla, bfjf bfjf, bfjy bfjy) {
        Random random = new Random();
        bgnq bgnq = bgnq.IN_OUT_DOOR_COLLECTOR;
        this.f114058a = bgmk;
        this.f114059b = bgns;
        this.f114066i = bgnq;
        this.f114061d = bfjy;
        this.f114060c = random;
        this.f114064g = bfla;
        this.f114067j = (int) (bfla.mo61866a() / 6);
        this.f114065h = bfjf;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bfne mo61773a(long j, bfju bfju) {
        if (j == this.f114062e) {
            return bfne.m97311a(Long.valueOf(this.f114063f), bfju);
        }
        long d = j - this.f114058a.mo62777d();
        this.f114059b.mo62917a(this.f114066i, d, null);
        this.f114065h.mo61788b(j);
        this.f114062e = j;
        this.f114063f = d;
        Object[] objArr = {new Date(j), bfju};
        return bfne.m97311a(Long.valueOf(d), bfju);
    }

    /* renamed from: a */
    public final bfne mo61774a(Calendar calendar, int i) {
        int i2;
        Locale locale = Locale.US;
        Object[] objArr = {calendar.getTime(), Integer.valueOf(i)};
        long c = bfla.m97167c(calendar);
        int i3 = this.f114067j;
        bfla bfla = this.f114064g;
        long j = ((long) ((6 - i) * i3)) + bfla.f114327a;
        if (j > c) {
            c = j;
        } else {
            if (bfla.mo61867a(c)) {
                long j2 = this.f114064g.f114327a;
                int i4 = this.f114067j;
                i2 = i4 - (((int) (c - j2)) % i4);
            } else {
                i2 = this.f114067j;
            }
            i3 = i2;
        }
        int nextInt = this.f114060c.nextInt(i3);
        Calendar instance = Calendar.getInstance();
        instance.setTime(calendar.getTime());
        bfla.m97164a(instance, c + ((long) nextInt));
        this.f114065h.mo61799l();
        return mo61773a(instance.getTimeInMillis(), bfju.USING_FULL_TIME_SPANS);
    }
}
