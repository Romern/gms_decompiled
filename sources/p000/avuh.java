package p000;

import com.google.android.gms.usagereporting.ConsentInformation;

/* renamed from: avuh */
public final /* synthetic */ class avuh implements roo {

    /* renamed from: a */
    private final String f93928a;

    /* renamed from: b */
    private final byte[] f93929b;

    /* renamed from: c */
    private final int[] f93930c;

    /* renamed from: d */
    private final int f93931d;

    /* renamed from: e */
    private final rjx f93932e;

    public avuh(rjx rjx, String str, byte[] bArr, int[] iArr, int i) {
        this.f93932e = rjx;
        this.f93928a = str;
        this.f93929b = bArr;
        this.f93930c = iArr;
        this.f93931d = i;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        rjx rjx = this.f93932e;
        String str = this.f93928a;
        byte[] bArr = this.f93929b;
        int[] iArr = this.f93930c;
        int i = this.f93931d;
        avvi avvi = (avvi) obj;
        avty avty = (avty) rjx.f43171z;
        sdo.checkIfNull(avty, "canLog must be called by a client that has api options.");
        ConsentInformation consentInformation = avty.f93907a;
        sdo.checkIfNull(consentInformation, "canLog must be called by a client that has UsageReportingOptions.consentInformation set (Almost always by a prior call to canLog).");
        avvi.mo51638a(str, bArr, null, iArr, i, rjx.f43168w, consentInformation, (aucf) obj2);
    }
}
