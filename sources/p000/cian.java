package p000;

import java.util.HashSet;

/* renamed from: cian */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class cian {

    /* renamed from: a */
    private final HashSet f189675a = new HashSet();

    /* renamed from: a */
    public final void mo85871a(Object obj, boolean z) {
        int size = this.f189675a.size();
        if (z) {
            this.f189675a.add(obj);
            if (size == 0) {
                mo85873b();
            }
        } else if (this.f189675a.remove(obj) && size == 1) {
            mo85874c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo85873b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo85874c();

    /* renamed from: a */
    public final boolean mo85872a() {
        return !this.f189675a.isEmpty();
    }
}
