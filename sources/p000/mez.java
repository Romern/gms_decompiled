package p000;

import android.os.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: mez */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mez {

    /* renamed from: a */
    private final lvn f33566a = new lvn("BaseCallbacksManager");

    /* renamed from: b */
    private final HashMap f33567b = new HashMap();

    /* renamed from: a */
    public final void mo19907a() {
        mo19910a(mfh.f33575a);
    }

    /* renamed from: b */
    public final void mo19912b() {
        mo19910a(C1576mfi.f33576a);
    }

    /* renamed from: c */
    public final void mo19913c() {
        mo19910a(mfl.f33579a);
    }

    /* renamed from: d */
    public final void mo19914d() {
        mo19910a(mfm.f33580a);
    }

    /* renamed from: e */
    public final void mo19915e() {
        mo19910a(mfn.f33581a);
    }

    /* renamed from: f */
    public final void mo19916f() {
        mo19910a(mfa.f33568a);
    }

    /* renamed from: a */
    public final synchronized void mo19908a(Object obj, String str) {
        this.f33567b.put(str, obj);
    }

    /* renamed from: a */
    public final synchronized void mo19909a(String str) {
        this.f33567b.remove(str);
    }

    /* renamed from: a */
    public final synchronized void mo19910a(mey mey) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f33567b.entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                try {
                    mey.mo19906a(entry.getValue());
                } catch (RemoteException e) {
                    this.f33566a.mo25409a("RemoteException caught; removing activity from callbacks manager: %s", e.getMessage());
                    arrayList.add(str);
                }
            } else {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    mo19909a((String) arrayList.get(i));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo19911a(boolean z) {
        mo19910a(new mfb(z));
    }
}
