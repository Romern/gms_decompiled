package org.webrtc;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RtcCertificatePem {

    /* renamed from: a */
    public final String f191996a;

    /* renamed from: b */
    public final String f191997b;

    public RtcCertificatePem(String str, String str2) {
        this.f191996a = str;
        this.f191997b = str2;
    }

    /* access modifiers changed from: package-private */
    public String getCertificate() {
        return this.f191997b;
    }

    /* access modifiers changed from: package-private */
    public String getPrivateKey() {
        return this.f191996a;
    }
}
