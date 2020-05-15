package p000;

import com.google.android.gms.thunderbird.state.EmergencyInfo;

/* renamed from: auix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auix extends auja {

    /* renamed from: a */
    public final EmergencyInfo f91925a;

    /* renamed from: b */
    public final auft f91926b;

    /* renamed from: c */
    public boolean f91927c;

    /* renamed from: d */
    public long f91928d;

    /* renamed from: e */
    public long f91929e;

    /* renamed from: f */
    public aufs f91930f;

    public auix(auiu auiu, EmergencyInfo emergencyInfo, auft auft) {
        super(auiu);
        bmxy.m108600b(emergencyInfo.mo59541e() != null);
        this.f91925a = emergencyInfo;
        this.f91926b = auft;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bM */
    public final String mo50562bM() {
        String bM = super.mo50562bM();
        String a = this.f91925a.mo59541e().mo59529a();
        String a2 = this.f91926b.mo50499a();
        int length = String.valueOf(bM).length();
        StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(a).length() + String.valueOf(a2).length());
        sb.append(bM);
        sb.append(":");
        sb.append(a);
        sb.append(":");
        sb.append(a2);
        return sb.toString();
    }
}
