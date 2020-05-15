package p000;

import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.LocationRequest;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Arrays;

/* renamed from: bgya */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgya {

    /* renamed from: a */
    public final long f117976a;

    /* renamed from: b */
    public final ClientIdentity f117977b;

    /* renamed from: c */
    private final long f117978c;

    /* renamed from: d */
    private final long f117979d;

    /* renamed from: e */
    private final long f117980e;

    public bgya(long j, long j2, long j3, long j4, ClientIdentity clientIdentity) {
        sdo.m34966a(clientIdentity, "No source package provided");
        this.f117978c = j;
        this.f117979d = j2;
        this.f117976a = j3;
        this.f117980e = j4;
        this.f117977b = clientIdentity;
    }

    /* renamed from: b */
    public static LocationRequest m100287b() {
        LocationRequest a = LocationRequest.m66854a();
        a.mo43554c(0L);
        a.mo43553c(102);
        a.mo43552b(0L);
        a.mo43556d(0);
        a.mo43551b(1);
        a.mo43549a(chcs.f188354a.mo6606a().mo85033V());
        return a;
    }

    /* renamed from: a */
    public final LocationRequest mo63337a() {
        LocationRequest a = LocationRequest.m66854a();
        a.mo43554c(this.f117978c);
        a.mo43553c(102);
        a.mo43552b(this.f117979d);
        a.mo43556d(this.f117980e);
        return a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bgya) {
            bgya bgya = (bgya) obj;
            return mo63339b(bgya) && mo63338a(bgya) && bxbl.m122538a(this.f117977b, bgya.f117977b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f117978c), Long.valueOf(this.f117979d), Long.valueOf(this.f117976a), Long.valueOf(this.f117980e), this.f117977b});
    }

    public final String toString() {
        long j = this.f117978c;
        long j2 = this.f117979d;
        long j3 = this.f117976a;
        long j4 = this.f117980e;
        String valueOf = String.valueOf(this.f117977b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC);
        sb.append("UlrSampleSpec{mSamplePeriodMs=");
        sb.append(j);
        sb.append(", mSampleMinMillis=");
        sb.append(j2);
        sb.append(", mActivitySampleMillis=");
        sb.append(j3);
        sb.append(", mMaxWaitTimeMillis=");
        sb.append(j4);
        sb.append(", mSourcePackage=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final boolean mo63338a(bgya bgya) {
        return this.f117979d == bgya.f117979d && this.f117978c == bgya.f117978c && this.f117980e == bgya.f117980e;
    }

    /* renamed from: b */
    public final boolean mo63339b(bgya bgya) {
        return this.f117976a == bgya.f117976a;
    }
}
