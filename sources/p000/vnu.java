package p000;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/* renamed from: vnu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vnu {

    /* renamed from: a */
    static final long f49594a = TimeUnit.DAYS.toMillis(1);

    /* renamed from: b */
    public final long f49595b;

    /* renamed from: c */
    public final long f49596c;

    /* renamed from: d */
    final long f49597d;

    /* renamed from: e */
    final long f49598e;

    /* renamed from: f */
    final long f49599f;

    /* renamed from: g */
    final long f49600g;

    public vnu(Calendar calendar) {
        Calendar calendar2 = (Calendar) calendar.clone();
        int i = calendar2.get(1);
        int i2 = calendar2.get(2);
        int i3 = calendar2.get(5);
        int i4 = calendar2.get(7);
        int i5 = calendar2.get(6);
        calendar2.set(i, i2, i3, 0, 0, 0);
        long timeInMillis = calendar2.getTimeInMillis();
        this.f49595b = timeInMillis;
        long j = f49594a;
        this.f49596c = timeInMillis - j;
        this.f49597d = timeInMillis - (((long) (i4 - 1)) * j);
        this.f49598e = timeInMillis - (((long) (i3 - 1)) * j);
        this.f49599f = timeInMillis - (((long) (i5 - 1)) * j);
        calendar2.set(i - 1, 0, 1, 0, 0, 0);
        this.f49600g = calendar2.getTimeInMillis();
    }
}
