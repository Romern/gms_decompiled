package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: bbxo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bbxo {

    /* renamed from: a */
    public final Set f103692a = Collections.synchronizedSet(new HashSet());

    /* renamed from: b */
    public final AtomicBoolean f103693b = new AtomicBoolean(false);

    /* renamed from: c */
    public int f103694c = 0;

    /* renamed from: d */
    public int f103695d = 0;

    /* renamed from: e */
    private final Handler f103696e = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public final void mo56492a() {
        if (!this.f103693b.get()) {
            this.f103693b.set(true);
            this.f103696e.postDelayed(new bbxn(this), 500);
        }
    }
}
