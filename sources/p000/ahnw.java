package p000;

import com.google.android.gms.nearby.internal.connection.ParcelablePayload;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: ahnw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahnw extends ahny {
    public ahnw(ParcelablePayload parcelablePayload, bqgj bqgj) {
        super(parcelablePayload, parcelablePayload.f80608d, bqgj);
    }

    /* renamed from: a */
    public final byte[] mo36899a(int i) {
        return super.mo36899a(Math.min((int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE, i));
    }

    /* renamed from: b */
    public final long mo36900b() {
        return -1;
    }

    /* renamed from: d */
    public final int mo36902d() {
        return 4;
    }
}
