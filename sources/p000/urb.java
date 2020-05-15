package p000;

import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.internal.TransferProgressData;
import java.util.Arrays;

/* renamed from: urb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class urb {

    /* renamed from: a */
    private final DriveId f48574a;

    /* renamed from: b */
    private final int f48575b;

    /* renamed from: c */
    private final int f48576c;

    public urb(TransferProgressData transferProgressData) {
        this.f48574a = transferProgressData.f30792b;
        this.f48575b = transferProgressData.f30791a;
        this.f48576c = transferProgressData.f30793c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        urb urb = (urb) obj;
        return sdg.m34949a(this.f48574a, urb.f48574a) && this.f48575b == urb.f48575b && this.f48576c == urb.f48576c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48574a, Integer.valueOf(this.f48575b), Integer.valueOf(this.f48576c)});
    }

    public final String toString() {
        return String.format("FileTransferState[TransferType: %d, DriveId: %s, status: %d]", Integer.valueOf(this.f48575b), this.f48574a, Integer.valueOf(this.f48576c));
    }
}
