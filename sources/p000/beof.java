package p000;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: beof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beof implements beor {

    /* renamed from: a */
    private final qws f111927a;

    /* renamed from: b */
    private final String f111928b;

    /* renamed from: c */
    private CopyOnWriteArrayList f111929c;

    /* renamed from: d */
    private CopyOnWriteArrayList f111930d;

    /* renamed from: e */
    private String f111931e;

    public beof(Context context, String str) {
        this(new qws(context, str, null), str);
    }

    /* renamed from: a */
    public final void mo60848a(beoq beoq) {
        beos beos = new beos(beoq);
        if (beos.f111955a.f127812a.size() != 0) {
            qwo a = this.f111927a.mo24334a(beos);
            a.f42320d = this.f111928b;
            Iterator it = this.f111930d.iterator();
            while (it.hasNext()) {
                a.mo24325a((String) it.next());
            }
            if (!this.f111931e.isEmpty()) {
                String str = this.f111931e;
                bxvf bxvf = a.f42325i;
                if (bxvf.f164950c) {
                    bxvf.mo74035c();
                    bxvf.f164950c = false;
                }
                cagi cagi = (cagi) bxvf.f164949b;
                cagi cagi2 = cagi.f173096t;
                str.getClass();
                cagi.f173098a |= 32;
                cagi.f173103f = str;
            }
            Iterator it2 = this.f111929c.iterator();
            while (it2.hasNext()) {
                a = ((beoe) it2.next()).mo60847a();
            }
            a.mo24327b();
        }
    }

    public beof(qws qws, String str) {
        this.f111929c = new CopyOnWriteArrayList();
        this.f111930d = new CopyOnWriteArrayList();
        this.f111931e = "";
        if (str.startsWith("STREAMZ_")) {
            this.f111927a = qws;
            this.f111928b = str;
            return;
        }
        throw new IllegalArgumentException("logSourceName should be prefixed by STREAMZ_");
    }
}
