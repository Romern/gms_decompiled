package p000;

/* renamed from: akgq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akgq extends akgl {

    /* renamed from: a */
    String f71895a;

    /* renamed from: b */
    akcj f71896b;

    /* renamed from: c */
    akdd f71897c;

    /* renamed from: d */
    ajud f71898d;

    /* renamed from: f */
    String f71899f;

    /* renamed from: g */
    boolean f71900g;

    /* renamed from: h */
    ahiq[] f71901h = new ahiq[0];

    /* renamed from: i */
    ahiq[] f71902i = new ahiq[0];

    /* renamed from: j */
    ahiq[] f71903j = new ahiq[0];

    public final String toString() {
        boolean z;
        boolean z2;
        Object[] objArr = new Object[7];
        boolean z3 = false;
        objArr[0] = this.f71895a;
        if (this.f71896b != null) {
            z = true;
        } else {
            z = false;
        }
        objArr[1] = Boolean.valueOf(z);
        if (this.f71897c != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        objArr[2] = Boolean.valueOf(z2);
        if (this.f71898d != null) {
            z3 = true;
        }
        objArr[3] = Boolean.valueOf(z3);
        objArr[4] = Integer.valueOf(this.f71901h.length);
        objArr[5] = Integer.valueOf(this.f71902i.length);
        objArr[6] = Integer.valueOf(this.f71903j.length);
        return String.format("OutgoingShareTargetInfo<endpointId: %s, hasCertificate: %s, hasConnection: %s, hasCallback: %s, textPayloadsSize: %s, filePayloadsSize: %s, wifiCredentialPayloadsSize: %s>", objArr);
    }
}
