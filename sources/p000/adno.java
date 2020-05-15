package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: adno */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class adno {

    /* renamed from: a */
    protected final List f62227a = new ArrayList();

    /* renamed from: b */
    protected final int f62228b;

    public adno(int i) {
        this.f62228b = Math.max(1, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo33682a();

    /* renamed from: a */
    public final void mo33683a(Object obj) {
        this.f62227a.add(obj);
        if (this.f62227a.size() >= this.f62228b) {
            mo33682a();
            this.f62227a.clear();
        }
    }

    /* renamed from: b */
    public final void mo33684b() {
        if (!this.f62227a.isEmpty()) {
            mo33682a();
            this.f62227a.clear();
        }
    }
}
