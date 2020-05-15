package p000;

/* renamed from: akgp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akgp extends akgl {

    /* renamed from: a */
    String f71890a;

    /* renamed from: b */
    akcj f71891b;

    /* renamed from: c */
    akdd f71892c;

    /* renamed from: d */
    ajud f71893d;

    /* renamed from: f */
    String f71894f;

    public final String toString() {
        boolean z;
        Object[] objArr = new Object[3];
        boolean z2 = false;
        objArr[0] = this.f71890a;
        if (this.f71891b != null) {
            z = true;
        } else {
            z = false;
        }
        objArr[1] = Boolean.valueOf(z);
        if (this.f71892c != null) {
            z2 = true;
        }
        objArr[2] = Boolean.valueOf(z2);
        return String.format("IncomingShareTargetInfo<endpointId: %s, hasCertificate: %s, hasConnection: %s>", objArr);
    }
}
