package p000;

import java.io.OutputStream;

/* renamed from: miu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class miu implements mjm {

    /* renamed from: a */
    private boolean f33797a = false;

    /* renamed from: b */
    final mhu f33798b;

    protected miu(mhu mhu) {
        this.f33798b = mhu;
    }

    /* renamed from: a */
    public abstract OutputStream mo20025a();

    /* renamed from: a */
    public final void mo20024a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            mo20027c();
        } else if (i2 == 2 && !this.f33797a) {
            this.f33797a = true;
            mo20026b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo20026b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo20027c();
}
