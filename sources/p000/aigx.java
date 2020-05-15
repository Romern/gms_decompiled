package p000;

import android.content.Intent;
import android.nfc.NfcAdapter;
import android.nfc.Tag;

/* renamed from: aigx */
final /* synthetic */ class aigx implements NfcAdapter.ReaderCallback {

    /* renamed from: a */
    private final aigz f68882a;

    public aigx(aigz aigz) {
        this.f68882a = aigz;
    }

    public final void onTagDiscovered(Tag tag) {
        aigz aigz = this.f68882a;
        Intent intent = new Intent("android.nfc.action.TAG_DISCOVERED");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("android.nfc.extra.TAG", tag);
        aigz.f68886a.sendBroadcast(intent);
    }
}
