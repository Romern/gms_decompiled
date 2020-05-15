package p000;

import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: zro */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class zro extends zrr {
    public zro(Callable callable) {
        super(callable);
    }

    /* renamed from: a */
    public final void mo31410a(caae caae, long j) {
        Map map = (Map) mo31413b();
        if (map != null) {
            mo31411a(map.get(caae), j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo31411a(Object obj, long j);
}
