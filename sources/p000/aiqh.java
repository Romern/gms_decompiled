package p000;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: aiqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aiqh extends OutputStream {

    /* renamed from: a */
    public final AtomicBoolean f69487a = new AtomicBoolean(false);

    /* renamed from: b */
    private final byte[] f69488b;

    /* renamed from: c */
    private final blux f69489c;

    /* renamed from: d */
    private final DataOutputStream f69490d;

    public aiqh(byte[] bArr, blux blux, OutputStream outputStream) {
        this.f69488b = bArr;
        this.f69489c = blux;
        this.f69490d = outputStream != null ? new DataOutputStream(new BufferedOutputStream(outputStream)) : null;
    }

    /* renamed from: a */
    static final /* synthetic */ void m57697a(byte[] bArr, bluu bluu) {
        if (!bluu.mo66725b()) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aiqh", "a", 139, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("BleSocketOutputStreamV2 failed to send a control packet %s", ails.m57438a(bArr));
        }
    }

    /* renamed from: c */
    private final bluv m57698c(byte[] bArr) {
        DataOutputStream dataOutputStream = this.f69490d;
        if (dataOutputStream != null) {
            dataOutputStream.writeInt(bArr.length);
            this.f69490d.write(bArr);
            this.f69490d.flush();
            return null;
        }
        blux blux = this.f69489c;
        if (blux != null) {
            return blux.mo66704b(bArr);
        }
        throw new IOException("BleSocketOutputStreamV2 illegal state, both gattSocket and l2capOutputStream are null!");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final bluv mo37848b(byte[] bArr) {
        byte[] a = aips.m57683a(aips.f69457a, bArr);
        if (a != null) {
            return m57698c(a);
        }
        throw new IOException("BleSocketOutputStreamV2 failed to create a BlePacket");
    }

    public final void close() {
        if (this.f69487a.compareAndSet(false, true)) {
            synchronized (this.f69487a) {
                this.f69487a.notifyAll();
            }
        }
    }

    public final void write(int i) {
        write(new byte[]{(byte) i});
    }

    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo37847a(byte[] bArr) {
        bluv b = mo37848b(bArr);
        if (b != null) {
            try {
                b.get(cfnv.m140787k(), TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                if (e instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                throw new IOException("BleSocketOutputStreamV2 write data but timeout");
            }
        }
    }

    public final void write(byte[] bArr, int i, int i2) {
        byte[] a = aips.m57683a(this.f69488b, Arrays.copyOfRange(bArr, i, i2 + i));
        if (a != null) {
            bluv c = m57698c(a);
            if (c != null) {
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                c.mo66727a(new aiqf(this, atomicBoolean));
                synchronized (this.f69487a) {
                    while (!c.isDone() && !this.f69487a.get()) {
                        try {
                            this.f69487a.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
                if (!atomicBoolean.get()) {
                    throw new IOException("BleSocketOutputStreamV2 failed to write data");
                }
                return;
            }
            return;
        }
        throw new IOException("BleSocketOutputStreamV2 failed to create a BlePacket");
    }
}
