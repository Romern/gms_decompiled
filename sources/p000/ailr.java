package p000;

import android.content.Context;
import android.nfc.NfcAdapter;

/* renamed from: ailr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ailr {

    /* renamed from: a */
    private final NfcAdapter f69150a;

    public ailr(Context context) {
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(context.getApplicationContext());
        this.f69150a = defaultAdapter;
        if (defaultAdapter == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("ailr", "<init>", 32, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to retrieve default NfcAdapter, NFC is unsupported.");
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo37659a() {
        NfcAdapter nfcAdapter;
        nfcAdapter = this.f69150a;
        return nfcAdapter != null && nfcAdapter.isEnabled();
    }
}
