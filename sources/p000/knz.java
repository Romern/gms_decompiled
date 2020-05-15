package p000;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: knz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class knz extends kny {

    /* renamed from: b */
    private final ConcurrentMap f24551b = new ConcurrentHashMap();

    /* renamed from: c */
    private int f24552c = 0;

    public knz(int i) {
        super(i);
    }

    /* renamed from: a */
    public final synchronized void mo14731a() {
        this.f24552c++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo14728a(kom kom);

    /* renamed from: b */
    public final synchronized void mo14732b() {
        int max = Math.max(0, this.f24552c - 1);
        this.f24552c = max;
        if (max == 0) {
            this.f24551b.clear();
        }
    }

    /* renamed from: b */
    public final boolean mo14729b(kom kom) {
        if (this.f24551b.containsKey(kom)) {
            return ((Boolean) this.f24551b.get(kom)).booleanValue();
        }
        boolean a = mo14728a(kom);
        this.f24551b.put(kom, Boolean.valueOf(a));
        return a;
    }
}
