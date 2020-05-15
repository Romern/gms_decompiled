package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* renamed from: bdar */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bdar {

    /* renamed from: a */
    private bmxv f105244a;

    /* renamed from: f */
    public final Handler f105245f;

    /* renamed from: g */
    protected final Set f105246g;

    public bdar() {
        this.f105245f = new Handler(Looper.getMainLooper());
        this.f105246g = new HashSet();
        this.f105244a = bmvz.f131120a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        return;
     */
    /* renamed from: a */
    private final synchronized void m90489a(int i) {
        int size = this.f105246g.size() - i;
        if (size != 0) {
            if (this.f105246g.size() == size) {
                mo56704a();
            } else if (this.f105246g.isEmpty()) {
                mo56706b();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void mo56704a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public synchronized void mo56706b() {
    }

    /* renamed from: c */
    public final void mo57830c(bdaq bdaq) {
        mo56710a((bdaq) new bdao(this, bdaq));
    }

    /* renamed from: d */
    public synchronized bmxv mo56712d() {
        return this.f105244a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final synchronized void mo57831e() {
        this.f105244a = bmvz.f131120a;
    }

    /* renamed from: f */
    public final void mo57832f() {
        mo56710a((bdaq) new bdap(this));
    }

    /* renamed from: b */
    public synchronized void mo56711b(bdaq bdaq) {
        int size = this.f105246g.size();
        this.f105246g.remove(bdaq);
        m90489a(size);
    }

    public bdar(Object obj) {
        this.f105245f = new Handler(Looper.getMainLooper());
        this.f105246g = new HashSet();
        this.f105244a = bmxv.m108566b(obj);
    }

    /* renamed from: a */
    public synchronized void mo56710a(bdaq bdaq) {
        int size = this.f105246g.size();
        this.f105246g.add(bdaq);
        if (this.f105244a.mo66813a()) {
            mo57828a((Runnable) new bdam(bdaq, this.f105244a.mo66814b()));
        }
        m90489a(size);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final synchronized void mo57829b(Object obj) {
        mo57828a((Runnable) new bdan(bnic.m109495a((Collection) this.f105246g), obj));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void mo56705a(Object obj) {
        if (!this.f105244a.mo66813a() || !obj.equals(this.f105244a.mo66814b())) {
            this.f105244a = bmxv.m108566b(obj);
            mo57829b(obj);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo57828a(Runnable runnable) {
        this.f105245f.post(runnable);
    }
}
