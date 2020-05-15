package p000;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* renamed from: qdb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qdb {

    /* renamed from: a */
    public final Context f40966a;

    /* renamed from: b */
    public bmxv f40967b = bmvz.f131120a;

    /* renamed from: c */
    public boolean f40968c;

    /* renamed from: d */
    protected bxvd f40969d;

    public qdb(Context context) {
        this.f40966a = context;
    }

    /* renamed from: a */
    public static long m31901a(String str, bmza bmza) {
        long a = bmza.mo66928a(TimeUnit.MILLISECONDS);
        if (!bmza.f131251a) {
            qdd.f40972a.mo25418e("Trying to restart stopwatch that is not running.", new Object[0]);
        }
        bmza.mo66929c();
        bmza.mo66930d();
        qdd.f40972a.mo25412b("Generate data event:%s time: %d ms.", str, Long.valueOf(a));
        return a;
    }
}
