package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: cok */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cok {

    /* renamed from: a */
    private final List f7164a = new ArrayList();

    /* renamed from: a */
    public final synchronized coi mo4034a(Class cls, Class cls2) {
        if (!cls2.isAssignableFrom(cls)) {
            List list = this.f7164a;
            int size = list.size();
            int i = 0;
            while (i < size) {
                coj coj = (coj) list.get(i);
                i++;
                if (coj.mo4033a(cls, cls2)) {
                    return coj.f7161a;
                }
            }
            String valueOf = String.valueOf(cls);
            String valueOf2 = String.valueOf(cls2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47 + String.valueOf(valueOf2).length());
            sb.append("No transcoder registered to transcode from ");
            sb.append(valueOf);
            sb.append(" to ");
            sb.append(valueOf2);
            throw new IllegalArgumentException(sb.toString());
        }
        return col.f7165a;
    }

    /* renamed from: b */
    public final synchronized List mo4036b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (!cls2.isAssignableFrom(cls)) {
            List list = this.f7164a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((coj) list.get(i)).mo4033a(cls, cls2)) {
                    arrayList.add(cls2);
                }
            }
            return arrayList;
        }
        arrayList.add(cls2);
        return arrayList;
    }

    /* renamed from: a */
    public final synchronized void mo4035a(Class cls, Class cls2, coi coi) {
        this.f7164a.add(new coj(cls, cls2, coi));
    }
}
