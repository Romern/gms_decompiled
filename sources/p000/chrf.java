package p000;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: chrf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chrf {

    /* renamed from: a */
    public static final chrf f189025a = new chrf(new chrb(), chrc.f189024a);

    /* renamed from: b */
    public final ConcurrentMap f189026b = new ConcurrentHashMap();

    public chrf(chre... chreArr) {
        for (int i = 0; i < 2; i++) {
            chre chre = chreArr[i];
            this.f189026b.put(chre.mo85559a(), chre);
        }
    }
}
