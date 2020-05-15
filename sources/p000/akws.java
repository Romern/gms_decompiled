package p000;

import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.os.RemoteException;

/* renamed from: akws */
final /* synthetic */ class akws implements NfcAdapter.ReaderCallback {

    /* renamed from: a */
    private final xhx f73018a;

    public akws(xhx xhx) {
        this.f73018a = xhx;
    }

    public final void onTagDiscovered(Tag tag) {
        try {
            this.f73018a.mo29740a(tag);
        } catch (RemoteException e) {
            akwu.f73020a.mo25417e("Error while executing NFC reader callback.", e, new Object[0]);
        }
    }
}
