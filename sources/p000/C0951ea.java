package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: ea */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0951ea {

    /* renamed from: a */
    public final C0952eb f14521a = new C0952eb();

    /* renamed from: b */
    public Set f14522b;

    /* renamed from: c */
    private final Class f14523c;

    /* renamed from: d */
    private final String f14524d;

    /* renamed from: e */
    private final Context f14525e;

    /* renamed from: f */
    private Executor f14526f;

    /* renamed from: g */
    private Executor f14527g;

    /* renamed from: h */
    private boolean f14528h = true;

    /* renamed from: i */
    private boolean f14529i;

    /* renamed from: j */
    private C0937dn f14530j;

    public C0951ea(Context context, Class cls, String str) {
        this.f14525e = context;
        this.f14523c = cls;
        this.f14524d = str;
    }

    /* renamed from: a */
    public final C0953ec mo9900a() {
        boolean z;
        Executor executor;
        if (this.f14525e != null) {
            Executor executor2 = this.f14526f;
            if (executor2 == null && this.f14527g == null) {
                Executor executor3 = C0069c.f6314c;
                this.f14527g = executor3;
                this.f14526f = executor3;
            } else if (executor2 != null && this.f14527g == null) {
                this.f14527g = executor2;
            } else if (executor2 == null && (executor = this.f14527g) != null) {
                this.f14526f = executor;
            }
            if (this.f14530j == null) {
                this.f14530j = new C0937dn();
            }
            Context context = this.f14525e;
            String str = this.f14524d;
            C0952eb ebVar = this.f14521a;
            int i = Build.VERSION.SDK_INT;
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            int i2 = 2;
            if (activityManager != null) {
                int i3 = Build.VERSION.SDK_INT;
                if (!activityManager.isLowRamDevice()) {
                    i2 = 3;
                }
            }
            C0940dq dqVar = new C0940dq(context, str, ebVar, i2, this.f14526f, this.f14527g, this.f14528h, this.f14529i);
            C0953ec ecVar = (C0953ec) C0949dz.m9855a(this.f14523c, "_Impl");
            ecVar.f14652b = ecVar.mo6326a(dqVar);
            C0929df dfVar = ecVar.f14652b;
            if (!(dfVar instanceof C0957eg)) {
                int i4 = Build.VERSION.SDK_INT;
                if (dqVar.f13804h == 3) {
                    z = true;
                } else {
                    z = false;
                }
                ecVar.f14652b.mo8641a(z);
                ecVar.f14651a = dqVar.f13800d;
                new C0960ej(dqVar.f13801e);
                ecVar.f14653c = z;
                return ecVar;
            }
            C0957eg egVar = (C0957eg) dfVar;
            throw null;
        }
        throw new IllegalArgumentException("Cannot provide null context for the database.");
    }

    /* renamed from: b */
    public final void mo9901b() {
        this.f14528h = false;
        this.f14529i = true;
    }
}
