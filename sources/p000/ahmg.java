package p000;

import java.util.Arrays;

/* renamed from: ahmg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class ahmg {

    /* renamed from: b */
    public final String f67521b;

    /* renamed from: c */
    public final byte[] f67522c;

    /* renamed from: d */
    public final String f67523d;

    /* renamed from: e */
    public final bvif f67524e;

    /* renamed from: f */
    public int f67525f = 1;

    public ahmg(String str, byte[] bArr, String str2, bvif bvif) {
        this.f67521b = str;
        this.f67522c = bArr;
        this.f67523d = str2;
        this.f67524e = bvif;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ahmg) {
            ahmg ahmg = (ahmg) obj;
            return sdg.m34949a(this.f67521b, ahmg.f67521b) && Arrays.equals(this.f67522c, ahmg.f67522c) && sdg.m34949a(this.f67523d, ahmg.f67523d) && sdg.m34949a(this.f67524e, ahmg.f67524e);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f67521b, Integer.valueOf(Arrays.hashCode(this.f67522c)), this.f67523d, this.f67524e});
    }

    public final String toString() {
        return String.format("DiscoveredEndpoint { endpointId=%s, medium=%s }", this.f67521b, this.f67524e.name());
    }
}
