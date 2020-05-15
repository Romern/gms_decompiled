package p000;

import com.google.android.gms.nearby.internal.connection.ParcelablePayload;

/* renamed from: ahnq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class ahnq {

    /* renamed from: a */
    final ParcelablePayload f67639a;

    public ahnq(ParcelablePayload parcelablePayload) {
        this.f67639a = parcelablePayload;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo36897a() {
        return this.f67639a.f80605a;
    }

    /* renamed from: a */
    public abstract void mo36898a(byte[] bArr);

    /* renamed from: a */
    public abstract byte[] mo36899a(int i);

    /* renamed from: b */
    public abstract long mo36900b();

    /* renamed from: c */
    public void mo36901c() {
    }

    /* renamed from: d */
    public abstract int mo36902d();

    public final String toString() {
        String str;
        int d = mo36902d();
        int i = d - 1;
        if (d != 0) {
            if (i != 1) {
                str = i != 2 ? i != 3 ? "UNKNOWN" : "STREAM" : "FILE";
            } else {
                str = "BYTES";
            }
            return String.format("(id:%s type:%s)", Long.valueOf(mo36897a()), str);
        }
        throw null;
    }
}
