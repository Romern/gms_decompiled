package com.google.android.gms.audiomodem;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class EncodeResultsProtoHelper {
    private final bzwq results = ((bzwq) bzwr.f171665e.mo74144da());

    public bzwr build() {
        return (bzwr) this.results.mo74062i();
    }

    /* access modifiers changed from: package-private */
    public void setEncodeResults(byte[] bArr, byte[] bArr2, float f) {
        bzwq bzwq = this.results;
        bxtx a = bxtx.m123261a(bArr);
        if (bzwq.f164950c) {
            bzwq.mo74035c();
            bzwq.f164950c = false;
        }
        bzwr bzwr = (bzwr) bzwq.f164949b;
        bzwr bzwr2 = bzwr.f171665e;
        a.getClass();
        bzwr.f171667a |= 1;
        bzwr.f171668b = a;
        bzwq bzwq2 = this.results;
        bxtx a2 = bxtx.m123261a(bArr2);
        if (bzwq2.f164950c) {
            bzwq2.mo74035c();
            bzwq2.f164950c = false;
        }
        bzwr bzwr3 = (bzwr) bzwq2.f164949b;
        a2.getClass();
        bzwr3.f171667a |= 2;
        bzwr3.f171669c = a2;
        bzwq bzwq3 = this.results;
        if (bzwq3.f164950c) {
            bzwq3.mo74035c();
            bzwq3.f164950c = false;
        }
        bzwr bzwr4 = (bzwr) bzwq3.f164949b;
        bzwr4.f171667a |= 4;
        bzwr4.f171670d = f;
    }
}
