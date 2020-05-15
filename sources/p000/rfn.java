package p000;

import java.lang.ref.WeakReference;

/* renamed from: rfn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class rfn extends rfl {

    /* renamed from: b */
    private static final WeakReference f42878b = new WeakReference(null);

    /* renamed from: a */
    private WeakReference f42879a = f42878b;

    public rfn(byte[] bArr) {
        super(bArr);
    }

    /* renamed from: a */
    public final byte[] mo24594a() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f42879a.get();
            if (bArr == null) {
                bArr = mo24599d();
                this.f42879a = new WeakReference(bArr);
            }
        }
        return bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract byte[] mo24599d();
}
