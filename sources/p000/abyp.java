package p000;

import android.content.Context;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: abyp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abyp {

    /* renamed from: a */
    static final Random f58745a = new Random();

    /* renamed from: b */
    public static final /* synthetic */ int f58746b = 0;

    /* renamed from: c */
    private final String f58747c;

    /* renamed from: d */
    private final wwr f58748d;

    public abyp(Context context) {
        this(context, "Icing");
    }

    /* renamed from: a */
    private static int m48569a(long j) {
        if (j >= 0 && j <= 2147483647L) {
            return (int) j;
        }
        absg.m48192b("Invalid silent feedback sampling interval (%d)", Long.valueOf(j));
        return 0;
    }

    public abyp(Context context, String str) {
        wwr a = wvu.m42361a(context);
        this.f58747c = str;
        this.f58748d = a;
    }

    /* renamed from: a */
    private final void m48570a(String str, Throwable th) {
        wwv wwv = new wwv(th);
        wwv.f51512j = "com.google.android.gms.icing";
        wwv.f51499d = "com.google.android.gms.icing.SILENT_FEEDBACK";
        wwv.f51498c = str;
        wwv.mo29496b();
        this.f58748d.mo29488b(wwv.mo29490a()).mo50371a(abyn.f58742a);
    }

    /* renamed from: a */
    public final void mo32456a(String str, Throwable th, long j) {
        int a;
        absg.m48187a(this.f58747c, "%s", str);
        if (((Boolean) abzt.f58995o.mo58455c()).booleanValue() && (a = m48569a(j)) != 0 && f58745a.nextInt(a) == 0) {
            m48570a(str, th);
        }
    }

    /* renamed from: a */
    public final void mo32457a(String str, Throwable th, abyo abyo, long j, bdyx bdyx, TimeUnit timeUnit) {
        int a;
        absg.m48187a(this.f58747c, "%s", str);
        if (((Boolean) abzt.f58995o.mo58455c()).booleanValue() && (a = m48569a(j)) != 0 && abyo.mo32455a(1.0f / ((float) a), ((Long) bdyx.mo58455c()).longValue(), timeUnit)) {
            m48570a(str, th);
        }
    }
}
