package p000;

import java.io.DataOutput;
import java.nio.ByteBuffer;
import java.util.Map;

/* renamed from: bqwy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqwy extends bqxf implements bqww {

    /* renamed from: f */
    public byte[] f141791f;

    /* renamed from: g */
    public byte[] f141792g;

    /* renamed from: k */
    private boolean f141793k = true;

    protected bqwy(bobl bobl, bqwu bqwu) {
        super(bqwx.m113583a(bobl, 286), bqwu);
    }

    /* renamed from: a */
    public final void mo69401a() {
        this.f141793k = false;
        for (bqwu bqwu : this.f141790e.values()) {
            if (bqwu instanceof bqww) {
                ((bqww) bqwu).mo69401a();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final short mo69398b() {
        return (short) (this.f141793k ? bqwt.TABLE_PACKAGE.f141785q | 4096 : bqwt.TABLE_PACKAGE.f141785q);
    }

    /* renamed from: d */
    public final bqxr mo69402d() {
        if (this.f141791f == null) {
            return super.mo69402d();
        }
        throw new RuntimeException("Compressed packagechunks in extraction mode do not support access to the Type and Key string pools.");
    }

    /* renamed from: e */
    public final bqxr mo69403e() {
        if (this.f141792g == null) {
            return super.mo69403e();
        }
        throw new RuntimeException("Compressed packagechunks in extraction mode do not support access to the Type and Key string pools.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69396a(DataOutput dataOutput, ByteBuffer byteBuffer) {
        byte[] bArr = this.f141791f;
        if (bArr == null || this.f141792g == null) {
            boolean z = false;
            if (bArr == null && this.f141792g == null) {
                z = true;
            }
            bmxy.m108600b(z);
            bqxr e = mo69403e();
            bqxr d = mo69402d();
            bmxy.m108600b(e instanceof bqww);
            bmxy.m108600b(d instanceof bqww);
            ((bqxb) e).mo69401a();
            ((bqxb) d).mo69401a();
            Map a = bqwx.m113584a(dataOutput, this.f141790e.values(), this.f141793k);
            for (bqwu bqwu : this.f141790e.values()) {
                if (bqwu == e) {
                    Integer num = (Integer) a.get(bqwu);
                    bmxy.m108581a(num);
                    byteBuffer.putInt(276, num.intValue());
                } else if (bqwu == d) {
                    Integer num2 = (Integer) a.get(bqwu);
                    bmxy.m108581a(num2);
                    byteBuffer.putInt(268, num2.intValue());
                }
            }
            return;
        }
        dataOutput.write(bArr);
        byteBuffer.putInt(268, this.f141787b);
        dataOutput.write(this.f141792g);
        byteBuffer.putInt(276, this.f141787b + this.f141791f.length);
        bqwx.m113584a(dataOutput, this.f141790e.values(), this.f141793k);
    }
}
