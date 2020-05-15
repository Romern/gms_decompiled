package p000;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* renamed from: rwu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rwu extends rvd {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    public rwu() {
        super("CheckinFix", Math.max(cdng.f181305a.mo6606a().mo77956d(), 60L), TimeUnit.MILLISECONDS.convert(1, TimeUnit.MINUTES));
    }

    /* renamed from: a */
    public final boolean mo25188a(rvl rvl) {
        return cdng.f181305a.mo6606a().mo77955c();
    }

    /* renamed from: b */
    public final rvl mo25189b(rvl rvl) {
        Context context = rvl.f43760b;
        qds a = qdu.m31973a(context);
        a.f41021o = true;
        a.f41017k = cdkp.f181122a.mo6606a().mo77803F();
        int i = 3;
        a.f41027u = 3;
        a.mo23964a(21, 1, context.getPackageName(), rwu.class.getName(), true);
        qdu a2 = a.mo23963a();
        int i2 = new qdd(context, new rwt(a2), new qdb(context)).mo23927a(a2).f40962e;
        rvk d = rvl.mo25205d();
        if (i2 != 0) {
            i = 5;
        }
        d.mo25199a(this, i);
        return d.mo25198a();
    }
}
