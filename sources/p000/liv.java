package p000;

import android.os.Looper;
import java.util.HashMap;
import java.util.Map;

/* renamed from: liv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class liv {

    /* renamed from: a */
    public final Map f26173a = new HashMap();

    /* renamed from: b */
    public final lqw f26174b;

    /* renamed from: c */
    public boolean f26175c;

    public liv() {
        lqw lqw = new lqw(new adzt(Looper.getMainLooper()));
        this.f26174b = lqw;
    }

    /* renamed from: a */
    public final bqgg mo15186a(lis lis) {
        Object a = lis.mo15181a();
        liu b = mo15189b(a);
        if (b != null) {
            return b;
        }
        liu liu = new liu(this, lis.mo15182b());
        this.f26173a.put(a, liu);
        return liu;
    }

    /* renamed from: b */
    public final liu mo15189b(Object obj) {
        mo15193d();
        return (liu) this.f26173a.get(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo15192c() {
        mo15190b();
        for (liu liu : this.f26173a.values()) {
            liu.mo15184a();
        }
    }

    /* renamed from: d */
    public final void mo15193d() {
        if (!this.f26174b.f26615a.getLooper().isCurrentThread()) {
            throw new IllegalStateException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo15190b() {
        mo15193d();
        this.f26175c = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo15187a() {
        mo15193d();
        if (!this.f26175c) {
            this.f26175c = true;
            for (liu liu : this.f26173a.values()) {
                liu.mo15185b();
            }
        }
    }

    /* renamed from: b */
    public final void mo15191b(lis lis) {
        mo15188a(lis.mo15181a());
    }

    /* renamed from: a */
    public final void mo15188a(Object obj) {
        mo15193d();
        liu liu = (liu) this.f26173a.remove(obj);
        if (liu != null) {
            liu.mo15184a();
            liu.cancel(true);
        }
    }
}
