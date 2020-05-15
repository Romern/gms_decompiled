package p000;

import java.nio.ByteBuffer;

/* renamed from: mkn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class mkn {

    /* renamed from: a */
    private boolean f33901a = false;

    /* renamed from: b */
    private mkm f33902b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo20106a(byte[] bArr, int i, int i2);

    /* renamed from: a */
    public final ByteBuffer mo20131a(int i) {
        ByteBuffer allocate = ByteBuffer.allocate(i);
        int i2 = 0;
        while (i2 < i) {
            i2 += mo20106a(allocate.array(), i2, i - i2);
        }
        return allocate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20112a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo20133b() {
        if (!this.f33901a) {
            this.f33901a = true;
            mo20112a();
            mkm mkm = this.f33902b;
            if (mkm != null) {
                ((mkt) mkm).mo20137f();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo20113c(byte[] bArr, int i, int i2);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo20132a(mkm mkm) {
        if (this.f33901a) {
            ((mkt) mkm).mo20137f();
        } else {
            this.f33902b = mkm;
        }
    }
}
