package p000;

import com.android.volley.Response;
import com.google.android.wallet.p097ui.document.DownloadedDocument;

/* renamed from: bkhx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkhx implements Response.Listener {

    /* renamed from: a */
    final /* synthetic */ String f124254a;

    /* renamed from: b */
    final /* synthetic */ bkib f124255b;

    public bkhx(bkib bkib, String str) {
        this.f124255b = bkib;
        this.f124254a = str;
    }

    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        DownloadedDocument downloadedDocument = (DownloadedDocument) obj;
        bkib bkib = this.f124255b;
        String str = this.f124254a;
        bkib.f124265d.mo15547a(str, downloadedDocument);
        bkhz bkhz = (bkhz) bkib.f124263b.remove(str);
        bkhz.f124259b = downloadedDocument;
        bkib.mo66012a(str, bkhz);
    }
}
