package p000;

import android.text.TextUtils;
import java.util.Collections;

/* renamed from: bcad */
final /* synthetic */ class bcad implements Runnable {

    /* renamed from: a */
    private final bcas f103863a;

    /* renamed from: b */
    private final bngx f103864b;

    public bcad(bcas bcas, bngx bngx) {
        this.f103863a = bcas;
        this.f103864b = bngx;
    }

    public final void run() {
        bcas bcas = this.f103863a;
        bngx bngx = this.f103864b;
        String join = TextUtils.join(",", Collections.nCopies(bngx.size(), "?"));
        StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 21);
        sb.append("notification_id IN (");
        sb.append(join);
        sb.append(")");
        if (bcas.f103908c.mo54675a(bcas.mo56655d("notifications"), sb.toString(), (String[]) bngx.toArray(new String[bngx.size()])) > 0) {
            bcas.mo56651c();
        }
    }
}
