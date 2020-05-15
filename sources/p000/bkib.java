package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.google.android.wallet.p097ui.document.DownloadedDocument;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: bkib */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkib implements Runnable {

    /* renamed from: a */
    public final bkhv f124262a;

    /* renamed from: b */
    final C1223np f124263b = new C1223np();

    /* renamed from: c */
    final C1223np f124264c = new C1223np();

    /* renamed from: d */
    public final C1231nx f124265d;

    /* renamed from: e */
    private final RequestQueue f124266e;

    /* renamed from: f */
    private final Handler f124267f = new adzt(Looper.getMainLooper());

    public bkib(RequestQueue requestQueue, C1231nx nxVar) {
        this.f124266e = requestQueue;
        this.f124265d = nxVar;
        this.f124262a = bjvn.m104709a();
    }

    /* renamed from: a */
    public final bkht mo66010a(Context context, String str, String str2, bkia bkia, Account account, bwgw bwgw) {
        String str3 = bwgw.f159295b;
        if (str3.endsWith("/payments/apis")) {
            String substring = str3.substring(0, str3.length() - 14);
            String format = String.format(Locale.US, "%s%s%s", substring, str, "?s7e=");
            String format2 = String.format(Locale.US, "%s:%s:%s", format, str2, account.name);
            bkht bkht = new bkht(format2, format, str2, bkia);
            DownloadedDocument downloadedDocument = (DownloadedDocument) this.f124265d.mo15546a(format2);
            if (downloadedDocument != null) {
                bkht.mo66007a(downloadedDocument);
            } else if (this.f124263b.containsKey(format2)) {
                ((bkhz) this.f124263b.get(format2)).f124261d.add(bkht);
            } else {
                bkhu a = this.f124262a.mo52943a(bkht, account, bwgw.f159297d, context, new bkhx(this, format2), new bkhy(this, format2));
                this.f124263b.put(format2, new bkhz(a, bkht));
                this.f124266e.add(a);
            }
            return bkht;
        }
        throw new IllegalArgumentException("Path does not contain payments api suffix.");
    }

    public final void run() {
        for (bkhz bkhz : this.f124264c.values()) {
            Iterator it = bkhz.f124261d.iterator();
            while (it.hasNext()) {
                bkht bkht = (bkht) it.next();
                VolleyError volleyError = bkhz.f124260c;
                if (volleyError == null) {
                    DownloadedDocument downloadedDocument = bkhz.f124259b;
                    if (downloadedDocument != null) {
                        bkht.mo66007a(downloadedDocument);
                    }
                } else {
                    bkht.f124246d.onErrorResponse(volleyError);
                }
            }
        }
        this.f124264c.clear();
    }

    /* renamed from: a */
    public final void mo66011a(bkht bkht) {
        bkhz bkhz = (bkhz) this.f124263b.get(bkht.f124243a);
        if (bkhz != null && bkhz.mo66009a(bkht)) {
            this.f124263b.remove(bkht.f124243a);
        }
        bkhz bkhz2 = (bkhz) this.f124264c.get(bkht.f124243a);
        if (bkhz2 != null && bkhz2.mo66009a(bkht)) {
            this.f124264c.remove(bkht.f124243a);
        }
    }

    /* renamed from: a */
    public final void mo66012a(String str, bkhz bkhz) {
        this.f124264c.put(str, bkhz);
        this.f124267f.removeCallbacks(this);
        this.f124267f.post(this);
    }
}
