package p000;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.nearby.internal.connection.ParcelablePayload;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ahny */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class ahny extends ahnq {

    /* renamed from: b */
    private final bqgj f67643b;

    /* renamed from: c */
    private final ParcelFileDescriptor.AutoCloseInputStream f67644c;

    /* renamed from: d */
    private byte[] f67645d;

    public ahny(ParcelablePayload parcelablePayload, ParcelFileDescriptor parcelFileDescriptor, bqgj bqgj) {
        super(parcelablePayload);
        this.f67644c = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        this.f67643b = bqgj;
    }

    /* renamed from: a */
    private final int m56258a(InputStream inputStream) {
        try {
            return ((Integer) this.f67643b.mo25819b(new ahnx(inputStream)).get(1000, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e) {
            throw new IOException(String.format("Timed out waiting for status for Payload %s", this), e);
        } catch (InterruptedException e2) {
            throw new IOException(String.format("Interrupted waiting for status for Payload %s", this), e2);
        } catch (ExecutionException e3) {
            throw new IOException(String.format("Exception reading status for Payload %s", this), e3);
        }
    }

    /* renamed from: c */
    public final void mo36901c() {
        srz.m36171a((Closeable) this.f67644c);
    }

    /* renamed from: a */
    public final void mo36898a(byte[] bArr) {
        throw new IOException(String.format("Cannot attach a chunk for an outgoing Payload %s.", this));
    }

    /* renamed from: a */
    public byte[] mo36899a(int i) {
        byte[] bArr = this.f67645d;
        if (bArr == null || bArr.length != i) {
            this.f67645d = new byte[i];
        }
        byte[] bArr2 = this.f67645d;
        try {
            int read = this.f67644c.read(bArr2);
            if (read >= 0) {
                return read < bArr2.length ? Arrays.copyOf(bArr2, read) : bArr2;
            }
            srn srn = ahkm.f67363a;
            srz.m36171a((Closeable) this.f67644c);
            ParcelFileDescriptor parcelFileDescriptor = this.f67639a.f80611g;
            if (parcelFileDescriptor == null) {
                return null;
            }
            ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
            try {
                if (m56258a(autoCloseInputStream) == 0) {
                    return null;
                }
                throw new IOException(String.format("Error status received for Payload %s", this));
            } finally {
                srz.m36171a((Closeable) autoCloseInputStream);
            }
        } catch (IOException e) {
            srz.m36171a((Closeable) this.f67644c);
            throw e;
        }
    }
}
