package p000;

import com.google.android.gms.location.reporting.UploadRequest;
import java.util.Arrays;

/* renamed from: bgyt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgyt implements bgyu {

    /* renamed from: a */
    public final long f118130a;

    /* renamed from: b */
    public final long f118131b;

    /* renamed from: c */
    public final UploadRequest f118132c;

    /* renamed from: d */
    public final String f118133d;

    public bgyt(long j, long j2, UploadRequest uploadRequest, String str) {
        this.f118130a = j;
        this.f118131b = j2;
        sdo.m34966a(uploadRequest, "request");
        this.f118132c = uploadRequest;
        this.f118133d = str;
    }

    /* renamed from: a */
    public final String mo63285a() {
        UploadRequest uploadRequest = this.f118132c;
        String str = uploadRequest.f79613b;
        String str2 = uploadRequest.f79617f;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" (");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final String mo63286a(boolean z) {
        return !z ? "stationary" : "default";
    }

    /* renamed from: b */
    public final long mo63287b(boolean z) {
        return !z ? this.f118132c.f79616e : this.f118132c.f79615d;
    }

    /* renamed from: b */
    public final String mo63288b() {
        return "burst";
    }

    /* renamed from: c */
    public final String mo63289c() {
        return this.f118133d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bgyt) {
            bgyt bgyt = (bgyt) obj;
            if (this.f118130a != bgyt.f118130a || this.f118131b != bgyt.f118131b || !this.f118132c.equals(bgyt.f118132c) || !bxbl.m122538a(this.f118133d, bgyt.f118133d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f118130a), Long.valueOf(this.f118131b), this.f118132c, this.f118133d});
    }

    public final String toString() {
        long j = this.f118130a;
        long j2 = this.f118131b;
        String valueOf = String.valueOf(this.f118132c);
        String str = this.f118133d;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 116 + String.valueOf(str).length());
        sb.append("IdentifiedUploadRequest{mId=");
        sb.append(j);
        sb.append(", mElapsedRealtime=");
        sb.append(j2);
        sb.append(", mRequest=");
        sb.append(valueOf);
        sb.append(", mSourcePackage=");
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
