package p000;

import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.os.RemoteException;

/* renamed from: xib */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xib implements NfcAdapter.ReaderCallback {

    /* renamed from: a */
    final /* synthetic */ xhx f52324a;

    public xib(xhx xhx) {
        this.f52324a = xhx;
    }

    public final void onTagDiscovered(Tag tag) {
        try {
            this.f52324a.mo29740a(tag);
        } catch (RemoteException e) {
            xic.f52325c.mo25417e("enabledNfcReaderMode", e, new Object[0]);
        }
    }
}
