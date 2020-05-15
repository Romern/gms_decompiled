package p000;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.nearby.internal.connection.ParcelablePayload;
import java.io.IOException;

/* renamed from: ahnu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class ahnu extends ahnq {

    /* renamed from: b */
    private final ParcelFileDescriptor.AutoCloseOutputStream f67641b;

    public ahnu(ParcelablePayload parcelablePayload, ParcelFileDescriptor parcelFileDescriptor) {
        super(parcelablePayload);
        this.f67641b = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor);
    }

    /* renamed from: a */
    public final void mo36898a(byte[] bArr) {
        if (bArr != null) {
            this.f67641b.write(bArr);
            this.f67641b.flush();
            return;
        }
        srn srn = ahkm.f67363a;
        srz.m36171a(this.f67641b);
    }

    /* renamed from: c */
    public final void mo36901c() {
        srz.m36171a(this.f67641b);
    }

    /* renamed from: a */
    public final byte[] mo36899a(int i) {
        throw new IOException(String.format("Cannot detach a chunk for an incoming Payload %s.", this));
    }
}
