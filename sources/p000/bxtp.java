package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* renamed from: bxtp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxtp extends bxtu {
    private static final long serialVersionUID = 1;

    /* renamed from: d */
    private final int f164785d;

    /* renamed from: e */
    private final int f164786e;

    public bxtp(byte[] bArr, int i, int i2) {
        super(bArr);
        m123267c(i, i + i2, bArr.length);
        this.f164785d = i;
        this.f164786e = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    /* renamed from: a */
    public final byte mo73743a(int i) {
        m123266b(i, this.f164786e);
        return this.f164789a[this.f164785d + i];
    }

    /* renamed from: a */
    public final int mo73744a() {
        return this.f164786e;
    }

    /* renamed from: b */
    public final byte mo73746b(int i) {
        return this.f164789a[this.f164785d + i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo73747b() {
        return this.f164785d;
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return bxtx.m123264b(mo73780k());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo73745a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f164789a, this.f164785d + i, bArr, i2, i3);
    }
}
