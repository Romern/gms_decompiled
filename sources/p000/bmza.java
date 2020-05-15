package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: bmza */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmza {

    /* renamed from: a */
    public boolean f131251a;

    /* renamed from: b */
    private final bmzq f131252b;

    /* renamed from: c */
    private long f131253c;

    /* renamed from: d */
    private long f131254d;

    public bmza() {
        this.f131252b = bmzq.f131275a;
    }

    /* renamed from: a */
    public static bmza m108656a() {
        return new bmza();
    }

    /* renamed from: b */
    public static bmza m108658b() {
        bmza bmza = new bmza();
        bmza.mo66930d();
        return bmza;
    }

    /* renamed from: f */
    private final long m108660f() {
        return this.f131251a ? (this.f131252b.mo15379a() - this.f131254d) + this.f131253c : this.f131253c;
    }

    /* renamed from: c */
    public final void mo66929c() {
        this.f131253c = 0;
        this.f131251a = false;
    }

    /* renamed from: d */
    public final void mo66930d() {
        bmxy.m108601b(!this.f131251a, "This stopwatch is already running.");
        this.f131251a = true;
        this.f131254d = this.f131252b.mo15379a();
    }

    /* renamed from: e */
    public final void mo66931e() {
        long a = this.f131252b.mo15379a();
        bmxy.m108601b(this.f131251a, "This stopwatch is already stopped.");
        this.f131251a = false;
        this.f131253c += a - this.f131254d;
    }

    public final String toString() {
        TimeUnit timeUnit;
        String str;
        long f = m108660f();
        if (TimeUnit.DAYS.convert(f, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.DAYS;
        } else if (TimeUnit.HOURS.convert(f, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.HOURS;
        } else if (TimeUnit.MINUTES.convert(f, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MINUTES;
        } else if (TimeUnit.SECONDS.convert(f, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.SECONDS;
        } else if (TimeUnit.MILLISECONDS.convert(f, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        } else if (TimeUnit.MICROSECONDS.convert(f, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MICROSECONDS;
        } else {
            timeUnit = TimeUnit.NANOSECONDS;
        }
        double d = (double) f;
        double convert = (double) TimeUnit.NANOSECONDS.convert(1, timeUnit);
        Double.isNaN(d);
        Double.isNaN(convert);
        String a = bmxx.m108576a(d / convert);
        switch (bmyz.f131250a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 1 + str.length());
        sb.append(a);
        sb.append(" ");
        sb.append(str);
        return sb.toString();
    }

    public bmza(bmzq bmzq) {
        bmxy.m108582a(bmzq, "ticker");
        this.f131252b = bmzq;
    }

    /* renamed from: a */
    public static bmza m108657a(bmzq bmzq) {
        return new bmza(bmzq);
    }

    /* renamed from: b */
    public static bmza m108659b(bmzq bmzq) {
        bmza bmza = new bmza(bmzq);
        bmza.mo66930d();
        return bmza;
    }

    /* renamed from: a */
    public final long mo66928a(TimeUnit timeUnit) {
        return timeUnit.convert(m108660f(), TimeUnit.NANOSECONDS);
    }
}
