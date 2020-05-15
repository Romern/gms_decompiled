package p000;

import android.app.Activity;
import android.content.Context;
import android.nfc.NfcAdapter;

/* renamed from: xhy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xhy {

    /* renamed from: a */
    public final NfcAdapter f52322a;

    public xhy(NfcAdapter nfcAdapter) {
        this.f52322a = nfcAdapter;
    }

    /* renamed from: a */
    public static xhy m42973a(Context context) {
        if (NfcAdapter.getDefaultAdapter(context) != null) {
            return new xhy(NfcAdapter.getDefaultAdapter(context));
        }
        return null;
    }

    /* renamed from: b */
    public final void mo29776b() {
        this.f52322a.disable();
    }

    /* renamed from: c */
    public final void mo29777c() {
        this.f52322a.enable();
    }

    /* renamed from: a */
    public final void mo29773a(Activity activity) {
        this.f52322a.disableReaderMode(activity);
    }

    /* renamed from: a */
    public final void mo29774a(Activity activity, NfcAdapter.ReaderCallback readerCallback, int i) {
        this.f52322a.enableReaderMode(activity, readerCallback, i, null);
    }

    /* renamed from: a */
    public final boolean mo29775a() {
        return this.f52322a.isEnabled();
    }
}
