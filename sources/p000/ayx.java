package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: ayx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayx {

    /* renamed from: a */
    public static final Executor f2604a = Executors.newCachedThreadPool();

    /* renamed from: b */
    public volatile ayu f2605b = null;

    /* renamed from: c */
    private final Set f2606c = new LinkedHashSet(1);

    /* renamed from: d */
    private final Set f2607d = new LinkedHashSet(1);

    /* renamed from: e */
    private final Handler f2608e = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public final synchronized void mo2912a(ayq ayq) {
        if (this.f2605b != null) {
            if (this.f2605b.f2601b != null) {
                ayq.mo2853a(this.f2605b.f2601b);
            }
        }
        this.f2607d.add(ayq);
    }

    /* renamed from: b */
    public final synchronized void mo2916b(ayq ayq) {
        if (this.f2605b != null) {
            if (this.f2605b.f2600a != null) {
                ayq.mo2853a(this.f2605b.f2600a);
            }
        }
        this.f2606c.add(ayq);
    }

    /* renamed from: c */
    public final synchronized void mo2917c(ayq ayq) {
        this.f2607d.remove(ayq);
    }

    /* renamed from: d */
    public final synchronized void mo2918d(ayq ayq) {
        this.f2606c.remove(ayq);
    }

    public ayx(Callable callable) {
        f2604a.execute(new ayw(this, callable));
    }

    /* renamed from: a */
    public final void mo2913a(ayu ayu) {
        if (this.f2605b == null) {
            this.f2605b = ayu;
            this.f2608e.post(new ayv(this));
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    /* renamed from: a */
    public final synchronized void mo2914a(Object obj) {
        ArrayList arrayList = new ArrayList(this.f2606c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ayq) arrayList.get(i)).mo2853a(obj);
        }
    }

    /* renamed from: a */
    public final synchronized void mo2915a(Throwable th) {
        ArrayList arrayList = new ArrayList(this.f2607d);
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ayq) arrayList.get(i)).mo2853a(th);
            }
            return;
        }
        bek.m2806a("Lottie encountered an error but no failure listener was added:", th);
    }
}
