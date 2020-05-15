package p000;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: adfd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adfd {

    /* renamed from: a */
    public final qxq f61544a;

    /* renamed from: b */
    private final Map f61545b = new HashMap();

    /* renamed from: c */
    private final adfa f61546c = new adfa();

    static {
        new adfs("ClearcutCounters");
    }

    public adfd(Context context) {
        int g = (int) cepl.f183185a.mo6606a().mo79536g();
        if (g <= 0) {
            new Object[1][0] = Integer.valueOf(g);
            this.f61544a = null;
            return;
        }
        qxq qxq = new qxq(new qws(context, "WESTINGHOUSE_COUNTERS", null), "WESTINGHOUSE_COUNTERS", g);
        this.f61544a = qxq;
        qxq.mo24374a();
    }

    /* renamed from: a */
    public final adfb mo33411a() {
        return mo33412a(0);
    }

    /* renamed from: b */
    public final adfc mo33415b(String str) {
        qxq qxq = this.f61544a;
        if (qxq != null) {
            return new adfc(qxq.mo24379b(str));
        }
        return new adfc(null);
    }

    /* renamed from: a */
    public final adfb mo33412a(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("offsetMillis should be >= 0, not ");
        sb.append(j);
        sdo.m34975b(z, sb.toString());
        return this.f61544a != null ? new adfb(this, j) : new adfb(this);
    }

    /* renamed from: a */
    public final synchronized qxm mo33413a(String str) {
        qxm qxm;
        qxm = (qxm) this.f61545b.get(str);
        if (qxm == null) {
            qxm = this.f61544a.mo24373a(str, qxq.f42380p);
            this.f61545b.put(str, qxm);
        }
        return qxm;
    }

    /* renamed from: a */
    public final void mo33414a(String str, int i) {
        qxq qxq = this.f61544a;
        if (qxq != null) {
            qxq.mo24377a(this.f61546c.mo33407a(str, i));
        }
    }
}
