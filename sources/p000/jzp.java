package p000;

import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.os.RemoteException;

/* renamed from: jzp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jzp implements NfcAdapter.ReaderCallback {

    /* renamed from: a */
    final /* synthetic */ xhx f23582a;

    public jzp(xhx xhx) {
        this.f23582a = xhx;
    }

    public final void onTagDiscovered(Tag tag) {
        try {
            this.f23582a.mo29740a(tag);
        } catch (RemoteException e) {
            kaa.f23599d.mo25417e("ReaderCallback onTagDiscovered error", e, new Object[0]);
        }
    }
}
