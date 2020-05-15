package p000;

import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.google.android.wallet.p097ui.document.DownloadedDocument;
import java.util.LinkedList;

/* renamed from: bkhz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkhz {

    /* renamed from: a */
    final Request f124258a;

    /* renamed from: b */
    public DownloadedDocument f124259b;

    /* renamed from: c */
    public VolleyError f124260c;

    /* renamed from: d */
    public final LinkedList f124261d;

    public bkhz(Request request, bkht bkht) {
        LinkedList linkedList = new LinkedList();
        this.f124261d = linkedList;
        this.f124258a = request;
        linkedList.add(bkht);
    }

    /* renamed from: a */
    public final boolean mo66009a(bkht bkht) {
        this.f124261d.remove(bkht);
        if (!this.f124261d.isEmpty()) {
            return false;
        }
        this.f124258a.cancel();
        return true;
    }
}
