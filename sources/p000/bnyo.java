package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: bnyo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bnyo extends bnyq {

    /* renamed from: a */
    private final ByteBuffer f132381a = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    /* renamed from: b */
    private final void m110797b(int i) {
        try {
            mo68715a(this.f132381a.array(), 0, i);
        } finally {
            this.f132381a.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo68710a(byte b);

    /* renamed from: a */
    public final void mo68711a(char c) {
        this.f132381a.putChar(c);
        m110797b(2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo68715a(byte[] bArr, int i, int i2) {
        throw null;
    }

    /* renamed from: a */
    public final void mo68712a(int i) {
        this.f132381a.putInt(i);
        m110797b(4);
    }

    /* renamed from: a */
    public final void mo68713a(long j) {
        this.f132381a.putLong(j);
        m110797b(8);
    }

    /* renamed from: b */
    public final void mo68716b(byte b) {
        mo68710a(b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo68714a(byte[] bArr) {
        mo68715a(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public final void mo68717b(byte[] bArr) {
        bmxy.m108581a(bArr);
        mo68714a(bArr);
    }

    /* renamed from: b */
    public final void mo68718b(byte[] bArr, int i, int i2) {
        bmxy.m108585a(i, i + i2, bArr.length);
        mo68715a(bArr, i, i2);
    }
}
