package p000;

import android.os.Build;
import java.util.concurrent.Executor;

/* renamed from: alai */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class alai {

    /* renamed from: a */
    public static svu f73223a;

    /* renamed from: b */
    private static final alai f73224b = m60751a();

    public alai() {
        f73223a = svu.m36486a();
    }

    /* renamed from: a */
    public static alai m60751a() {
        alai alai = f73224b;
        if (alai != null) {
            return alai;
        }
        int i = Build.VERSION.SDK_INT;
        return new alam();
    }

    /* renamed from: c */
    public static Executor m60752c() {
        return svu.f45253e;
    }

    /* renamed from: b */
    public final int mo40053b() {
        return f73223a.mo26189c();
    }

    /* renamed from: a */
    public final boolean mo40052a(Object obj) {
        return f73223a.mo26187a(obj);
    }
}
