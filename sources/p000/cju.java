package p000;

import java.util.Collections;
import java.util.List;

/* renamed from: cju */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cju {

    /* renamed from: a */
    private final cjz f6953a;

    /* renamed from: b */
    private final cjt f6954b = new cjt();

    public cju(C1241og ogVar) {
        cjz cjz = new cjz(ogVar);
        this.f6953a = cjz;
    }

    /* renamed from: a */
    public final synchronized List mo3949a(Class cls) {
        return this.f6953a.mo3957b(cls);
    }

    /* renamed from: b */
    public final synchronized List mo3951b(Class cls) {
        List list;
        cjs cjs = (cjs) this.f6954b.f6952a.get(cls);
        if (cjs != null) {
            list = cjs.f6951a;
        } else {
            list = null;
        }
        if (list == null) {
            list = Collections.unmodifiableList(this.f6953a.mo3955a(cls));
            if (((cjs) this.f6954b.f6952a.put(cls, new cjs(list))) != null) {
                String valueOf = String.valueOf(cls);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                sb.append("Already cached loaders for model: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            }
        }
        return list;
    }

    /* renamed from: a */
    public final synchronized void mo3950a(Class cls, Class cls2, cjr cjr) {
        this.f6953a.mo3956a(cls, cls2, cjr);
        this.f6954b.f6952a.clear();
    }
}
