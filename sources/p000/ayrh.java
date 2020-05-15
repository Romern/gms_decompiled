package p000;

import com.google.android.libraries.bluetooth.BluetoothException;
import com.google.android.libraries.bluetooth.BluetoothTimeoutException;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* renamed from: ayrh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayrh {

    /* renamed from: a */
    public final BlockingDeque f98331a = new LinkedBlockingDeque();

    /* renamed from: b */
    public volatile aype f98332b;

    /* renamed from: a */
    public final byte[] mo54309a(long j) {
        try {
            byte[] bArr = (byte[]) this.f98331a.poll(j, TimeUnit.MILLISECONDS);
            if (bArr != null) {
                return bArr;
            }
            throw new BluetoothTimeoutException(String.format("Operation timed out after %dms", Long.valueOf(j)));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new BluetoothException("Operation interrupted.");
        }
    }
}
