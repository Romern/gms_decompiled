package p000;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: aiqe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aiqe extends OutputStream {

    /* renamed from: a */
    public final AtomicBoolean f69481a = new AtomicBoolean(false);

    /* renamed from: b */
    private final byte[] f69482b;

    /* renamed from: c */
    private final blux f69483c;

    public aiqe(byte[] bArr, blux blux) {
        this.f69482b = bArr;
        this.f69483c = blux;
    }

    public final void close() {
        if (this.f69481a.compareAndSet(false, true)) {
            synchronized (this.f69481a) {
                this.f69481a.notifyAll();
            }
        }
    }

    public final void write(int i) {
        write(new byte[]{(byte) i});
    }

    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) {
        byte[] bArr2;
        if (cfnv.m140800x()) {
            bArr2 = aips.m57683a(this.f69482b, Arrays.copyOfRange(bArr, i, i2 + i));
        } else {
            bArr2 = aips.m57683a(this.f69482b, Arrays.copyOfRange(bArr, i, i2 + i));
        }
        if (bArr2 != null) {
            bluv b = this.f69483c.mo66704b(bArr2);
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            b.mo66727a(new aiqd(this, atomicBoolean));
            synchronized (this.f69481a) {
                while (!b.isDone() && !this.f69481a.get()) {
                    try {
                        this.f69481a.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
            if (!atomicBoolean.get()) {
                throw new IOException("BleSocketOutputStreamV1 failed to write data");
            }
            return;
        }
        throw new IOException("BleSocketOutputStreamV1 failed to create a BlePacket");
    }
}
