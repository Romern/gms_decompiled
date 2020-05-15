package p000;

import android.os.Build;
import java.util.ArrayList;

/* renamed from: ajp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajp {

    /* renamed from: a */
    public static final ThreadLocal f655a = new ThreadLocal();

    /* renamed from: b */
    public final C1245ok f656b = new C1245ok();

    /* renamed from: c */
    public final ArrayList f657c = new ArrayList();

    /* renamed from: d */
    long f658d = 0;

    /* renamed from: e */
    public boolean f659e = false;

    /* renamed from: f */
    private final ajl f660f = new ajl(this);

    /* renamed from: g */
    private ajn f661g;

    /* renamed from: a */
    public static ajp m880a() {
        if (f655a.get() == null) {
            f655a.set(new ajp());
        }
        return (ajp) f655a.get();
    }

    /* renamed from: b */
    public final ajn mo834b() {
        if (this.f661g == null) {
            int i = Build.VERSION.SDK_INT;
            this.f661g = new ajn(this.f660f);
        }
        return this.f661g;
    }
}
