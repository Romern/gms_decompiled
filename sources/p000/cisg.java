package p000;

import java.io.InputStream;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: cisg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cisg implements cisy {

    /* renamed from: a */
    final /* synthetic */ cisx f191324a;

    public cisg(cisx cisx) {
        this.f191324a = cisx;
    }

    /* renamed from: a */
    public final void mo86442a() {
        List list;
        if (this.f191324a.f191375q != null) {
            ArrayList arrayList = new ArrayList();
            String str = "http/1.1";
            int i = 0;
            while (true) {
                String headerFieldKey = this.f191324a.f191375q.getHeaderFieldKey(i);
                if (headerFieldKey == null) {
                    break;
                }
                if ("X-Android-Selected-Transport".equalsIgnoreCase(headerFieldKey)) {
                    str = this.f191324a.f191375q.getHeaderField(i);
                }
                if (!headerFieldKey.startsWith("X-Android")) {
                    arrayList.add(new AbstractMap.SimpleEntry(headerFieldKey, this.f191324a.f191375q.getHeaderField(i)));
                }
                i++;
            }
            int responseCode = this.f191324a.f191375q.getResponseCode();
            cisx cisx = this.f191324a;
            cisx.f191373o = new cite(new ArrayList(cisx.f191364f), responseCode, this.f191324a.f191375q.getResponseMessage(), Collections.unmodifiableList(arrayList), str, "");
            if (responseCode >= 300 && responseCode < 400 && (list = (List) this.f191324a.f191373o.getAllHeaders().get("location")) != null) {
                cisx cisx2 = this.f191324a;
                cisx2.mo86475a(1, 2, new cisj(cisx2, (String) list.get(0)));
                return;
            }
            this.f191324a.mo86482b();
            if (responseCode >= 400) {
                InputStream errorStream = this.f191324a.f191375q.getErrorStream();
                this.f191324a.f191372n = errorStream != null ? cirk.m150922a(errorStream) : null;
                this.f191324a.f191360b.mo86469a();
                return;
            }
            cisx cisx3 = this.f191324a;
            cisx3.f191372n = cirk.m150922a(cisx3.f191375q.getInputStream());
            this.f191324a.f191360b.mo86469a();
        }
    }
}
