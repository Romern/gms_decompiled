package p000;

import com.google.android.gms.usagereporting.ConsentInformation;

/* renamed from: avuf */
public final /* synthetic */ class avuf implements roo {

    /* renamed from: a */
    private final String f93918a;

    /* renamed from: b */
    private final byte[] f93919b;

    /* renamed from: c */
    private final String f93920c;

    /* renamed from: d */
    private final avua f93921d;

    /* renamed from: e */
    private final rjx f93922e;

    public avuf(rjx rjx, String str, byte[] bArr, String str2, avua avua) {
        this.f93922e = rjx;
        this.f93918a = str;
        this.f93919b = bArr;
        this.f93920c = str2;
        this.f93921d = avua;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        rjx rjx = this.f93922e;
        String str = this.f93918a;
        byte[] bArr = this.f93919b;
        String str2 = this.f93920c;
        avvi avvi = (avvi) obj;
        avty avty = (avty) rjx.f43171z;
        sdo.checkIfNull(avty, "canLog must be called by a client that has api options.");
        ConsentInformation consentInformation = avty.f93907a;
        sdo.checkIfNull(consentInformation, "canLog must be called by a client that has UsageReportingOptions.consentInformation set (Almost always by a prior call to canLog).");
        avvi.mo51638a(str, bArr, str2, null, 0, rjx.f43168w, consentInformation, (aucf) obj2);
    }
}
