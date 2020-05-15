package p000;

import android.nfc.tech.IsoDep;

/* renamed from: airw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class airw extends aisb {

    /* renamed from: a */
    private final IsoDep f69604a;

    public airw(IsoDep isoDep) {
        this.f69604a = isoDep;
    }

    /* renamed from: a */
    public final IsoDep mo37913a() {
        return this.f69604a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f69604a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("NfcDevice{isoDep=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
