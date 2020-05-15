package p000;

import java.io.DataOutput;
import java.nio.ByteBuffer;

/* renamed from: bqxv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bqxv extends bqwu {

    /* renamed from: e */
    private int f141926e;

    /* renamed from: f */
    private int[] f141927f;

    protected bqxv(ByteBuffer byteBuffer, bqwu bqwu) {
        super(byteBuffer, bqwu);
        this.f141926e = bqcw.m112606a(byteBuffer.get());
        byteBuffer.position(byteBuffer.position() + 3);
        int i = byteBuffer.getInt();
        this.f141927f = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.f141927f[i2] = byteBuffer.getInt();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69396a(DataOutput dataOutput, ByteBuffer byteBuffer) {
        for (int i : this.f141927f) {
            dataOutput.writeInt(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final bqwt mo69400h() {
        return bqwt.TABLE_TYPE_SPEC;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69397a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.f141926e);
        byteBuffer.putInt(this.f141927f.length);
    }
}
