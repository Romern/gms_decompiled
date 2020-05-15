package p000;

import com.google.android.gms.drive.events.internal.TransferProgressData;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: ura */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ura {

    /* renamed from: a */
    private final long f48571a;

    /* renamed from: b */
    private final long f48572b;

    /* renamed from: c */
    private final urb f48573c;

    public ura(TransferProgressData transferProgressData) {
        this.f48573c = new urb(transferProgressData);
        this.f48571a = transferProgressData.f30794d;
        this.f48572b = transferProgressData.f30795e;
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ura ura = (ura) obj;
        return sdg.m34949a(this.f48573c, ura.f48573c) && this.f48571a == ura.f48571a && this.f48572b == ura.f48572b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f48572b), Long.valueOf(this.f48571a), Long.valueOf(this.f48572b)});
    }

    public final String toString() {
        return String.format(Locale.US, "FileTransferProgress[FileTransferState: %s, BytesTransferred: %d, TotalBytes: %d]", this.f48573c.toString(), Long.valueOf(this.f48571a), Long.valueOf(this.f48572b));
    }
}
