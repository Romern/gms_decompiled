package p000;

import com.google.android.gms.usagereporting.ConsentInformation;

/* renamed from: avug */
public final /* synthetic */ class avug implements roo {

    /* renamed from: a */
    private final String f93923a;

    /* renamed from: b */
    private final byte[] f93924b;

    /* renamed from: c */
    private final int f93925c;

    /* renamed from: d */
    private final avua f93926d;

    /* renamed from: e */
    private final rjx f93927e;

    public avug(rjx rjx, String str, byte[] bArr, int i, avua avua) {
        this.f93927e = rjx;
        this.f93923a = str;
        this.f93924b = bArr;
        this.f93925c = i;
        this.f93926d = avua;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        rjx rjx = this.f93927e;
        String str = this.f93923a;
        byte[] bArr = this.f93924b;
        int i = this.f93925c;
        avvi avvi = (avvi) obj;
        avty avty = (avty) rjx.f43171z;
        sdo.checkIfNull(avty, "canLog must be called by a client that has api options.");
        ConsentInformation consentInformation = avty.f93907a;
        sdo.checkIfNull(consentInformation, "canLog must be called by a client that has UsageReportingOptions.consentInformation set (Almost always by a prior call to canLog).");
        avvi.mo51638a(str, bArr, null, null, i, rjx.f43168w, consentInformation, (aucf) obj2);
    }
}
