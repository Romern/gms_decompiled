package p000;

/* renamed from: bkuh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bkuh {
    /* renamed from: a */
    public final void mo66358a(bkxi bkxi, Object obj) {
        bkxi.mo66430c();
        int b = bkxi.mo66429b();
        if (b == 0) {
            mo66359b(bkxi, obj);
            bkxi.mo66431d();
            return;
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("Unexpected type code: ");
        sb.append(b);
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo66349a(Object obj, Object obj2);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo66359b(bkxi bkxi, Object obj) {
        while (bkxi.f125378a) {
            mo66349a(obj, bkti.m106597a(bkxi));
        }
    }
}
