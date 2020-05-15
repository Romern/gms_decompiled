package p000;

/* renamed from: berh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class berh implements bfms {

    /* renamed from: a */
    final /* synthetic */ bgmw f112207a;

    public berh(bgmw bgmw) {
        this.f112207a = bgmw;
    }

    /* renamed from: a */
    public final void mo60973a(boolean z, int i, bfmj bfmj) {
        boolean z2;
        if (i == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        StringBuilder sb = new StringBuilder(85);
        sb.append("chre onVehicleBluetoothStateChanged connected = ");
        sb.append(z);
        sb.append(", vehicle classification = ");
        sb.append(z2);
        sb.toString();
        if (i == 1) {
            this.f112207a.mo62856a(Boolean.valueOf(z), null);
        }
    }
}
