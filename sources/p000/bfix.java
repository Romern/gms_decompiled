package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: bfix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfix {

    /* renamed from: a */
    public final ArrayList f114109a = new ArrayList();

    /* renamed from: b */
    public final HashMap f114110b = new HashMap();

    /* renamed from: c */
    public final HashMap f114111c = new HashMap();

    /* renamed from: d */
    public final HashMap f114112d = new HashMap();

    /* renamed from: e */
    long f114113e = 0;

    /* renamed from: f */
    public final int f114114f;

    public bfix(int i) {
        this.f114114f = i;
    }

    /* renamed from: a */
    public final bgjm mo61777a() {
        if (this.f114109a.isEmpty()) {
            return null;
        }
        ArrayList arrayList = this.f114109a;
        return (bgjm) arrayList.get(arrayList.size() - 1);
    }

    /* renamed from: a */
    public final void mo61778a(int i) {
        if (i >= 0 && i < this.f114109a.size()) {
            bgjm bgjm = (bgjm) this.f114109a.get(i);
            this.f114109a.remove(i);
            this.f114110b.remove(bgjm);
            this.f114111c.remove(bgjm);
            this.f114112d.remove(bgjm);
            Locale locale = Locale.US;
            new Object[1][0] = Long.valueOf(bgjm.f116616b);
        }
    }
}
