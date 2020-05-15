package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* renamed from: bqxa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqxa {

    /* renamed from: a */
    public final bobl f141795a;

    /* renamed from: b */
    public final Charset f141796b;

    /* renamed from: c */
    ByteBuffer f141797c;

    /* renamed from: d */
    private byte[] f141798d;

    public bqxa(bobl bobl, Charset charset) {
        this.f141795a = bobl;
        this.f141796b = charset;
    }

    /* renamed from: a */
    public final void mo69404a() {
        boolean z;
        ByteBuffer byteBuffer = this.f141797c;
        if (byteBuffer == null || !byteBuffer.hasRemaining()) {
            bobl bobl = this.f141795a;
            bmxy.m108581a(bobl);
            int readInt = bobl.readInt();
            if (readInt > 0) {
                z = true;
            } else {
                z = false;
            }
            bmxy.m108600b(z);
            byte[] bArr = this.f141798d;
            if (bArr == null || bArr.length < readInt) {
                this.f141798d = new byte[(readInt + 1024)];
            }
            boav.m111018a(this.f141795a, this.f141798d, 0, readInt);
            this.f141797c = ByteBuffer.wrap(this.f141798d, 0, readInt).order(ByteOrder.LITTLE_ENDIAN);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo69405a(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            mo69404a();
            short s = this.f141797c.getShort();
            ByteBuffer byteBuffer = this.f141797c;
            byteBuffer.position(byteBuffer.position() + s);
        }
    }
}
