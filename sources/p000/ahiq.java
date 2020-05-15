package p000;

import android.os.ParcelFileDescriptor;
import java.io.Closeable;
import java.util.UUID;

/* renamed from: ahiq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahiq {

    /* renamed from: a */
    public final long f67251a;

    /* renamed from: b */
    public final int f67252b;

    /* renamed from: c */
    public final byte[] f67253c;

    /* renamed from: d */
    public final ahio f67254d;

    /* renamed from: e */
    public final ahip f67255e;

    private ahiq(long j, int i, byte[] bArr, ahio ahio, ahip ahip) {
        this.f67251a = j;
        this.f67252b = i;
        this.f67253c = bArr;
        this.f67254d = ahio;
        this.f67255e = ahip;
    }

    /* renamed from: a */
    public static long m55836a() {
        return UUID.randomUUID().getLeastSignificantBits();
    }

    /* renamed from: b */
    public final void mo36539b() {
        ahio ahio = this.f67254d;
        if (ahio != null) {
            srz.m36170a(ahio.f67247b);
        }
        ahip ahip = this.f67255e;
        if (ahip != null) {
            srz.m36170a(ahip.f67249a);
            srz.m36171a((Closeable) ahip.f67250b);
        }
    }

    /* renamed from: a */
    public static ahiq m55837a(ahio ahio, long j) {
        return new ahiq(j, 2, null, ahio, null);
    }

    /* renamed from: a */
    public static ahiq m55838a(ahip ahip, long j) {
        return new ahiq(j, 3, null, null, ahip);
    }

    /* renamed from: a */
    public static ahiq m55839a(ParcelFileDescriptor parcelFileDescriptor) {
        return m55837a(ahio.m55834a(parcelFileDescriptor), m55836a());
    }

    /* renamed from: a */
    public static ahiq m55840a(byte[] bArr) {
        sdo.checkIfNull(bArr, "Cannot create a Payload from null bytes.");
        return m55841a(bArr, m55836a());
    }

    /* renamed from: a */
    public static ahiq m55841a(byte[] bArr, long j) {
        return new ahiq(j, 1, bArr, null, null);
    }
}
