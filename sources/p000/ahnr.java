package p000;

import com.google.android.gms.nearby.internal.connection.ParcelablePayload;

/* renamed from: ahnr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahnr extends ahnq {

    /* renamed from: b */
    private boolean f67640b = false;

    public ahnr(ParcelablePayload parcelablePayload) {
        super(parcelablePayload);
    }

    /* renamed from: a */
    public final void mo36898a(byte[] bArr) {
    }

    /* renamed from: a */
    public final byte[] mo36899a(int i) {
        if (this.f67640b) {
            return null;
        }
        this.f67640b = true;
        return this.f67639a.f80607c;
    }

    /* renamed from: b */
    public final long mo36900b() {
        return (long) this.f67639a.f80607c.length;
    }

    /* renamed from: d */
    public final int mo36902d() {
        return 2;
    }
}
