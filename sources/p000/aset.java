package p000;

import android.content.Context;
import android.os.Build;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

/* renamed from: aset */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aset extends asen {

    /* renamed from: h */
    public long f88787h;

    /* renamed from: i */
    private final boolean f88788i;

    /* renamed from: j */
    private final int f88789j;

    /* renamed from: k */
    private final String[] f88790k;

    /* renamed from: l */
    private final calj[] f88791l;

    /* renamed from: m */
    private final cagz f88792m;

    /* renamed from: n */
    private final boolean f88793n;

    public aset() {
        super("UnifiedDumpsysTask", "", "", false, null);
        this.f88787h = TimeUnit.DAYS.toSeconds(1);
        this.f88788i = false;
        this.f88789j = -1;
        this.f88790k = null;
        this.f88791l = null;
        this.f88792m = null;
        this.f88793n = false;
    }

    /* renamed from: a */
    public final int mo49089a() {
        cagz cagz = this.f88792m;
        if (cagz != null) {
            return cagz.f174516f;
        }
        return 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final calx mo49102b(Context context, InputStream inputStream, long j, long j2, qxq qxq) {
        return mo49100a(context, inputStream, j, j2, qxq, this.f88793n);
    }

    /* renamed from: c */
    public final long mo49094c() {
        return this.f88787h;
    }

    /* renamed from: d */
    public final long mo49095d() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String[] mo49101a(long j, long j2) {
        String str;
        calj[] caljArr = this.f88791l;
        if (caljArr == null || caljArr.length == 0) {
            return this.f88790k;
        }
        String[] strArr = this.f88790k;
        calj calj = calj.START_MILLIS;
        int ordinal = caljArr[0].ordinal();
        if (ordinal == 0) {
            str = String.valueOf(j);
        } else if (ordinal != 1) {
            str = "";
        } else {
            str = String.valueOf(TimeUnit.HOURS.convert(j2 - j, TimeUnit.MILLISECONDS));
        }
        return (String[]) sqc.m35965c(strArr, str);
    }

    /* renamed from: b */
    public final boolean mo49093b() {
        return Build.VERSION.SDK_INT >= this.f88789j && this.f88788i;
    }

    public aset(String str, calk calk) {
        super(str, calk.f175138b, calk.f175141e, calk.f175142f, null);
        this.f88787h = TimeUnit.DAYS.toSeconds(1);
        this.f88788i = calk.f175137a;
        this.f88789j = calk.f175140d;
        this.f88790k = (String[]) calk.f175139c.toArray(new String[0]);
        this.f88791l = (calj[]) new bxvv(calk.f175144h, calk.f175134i).toArray(new calj[0]);
        cagz a = cagz.m126622a(calk.f175143g);
        this.f88792m = a == null ? cagz.UNMETERED_OR_DAILY : a;
        this.f88793n = calk.f175145j;
        this.f88787h = calk.f175146k;
    }
}
