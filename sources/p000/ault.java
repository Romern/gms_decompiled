package p000;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: ault */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ault extends aulp {

    /* renamed from: a */
    private static final aunx f92058a = new aunx("TrustAgent", "GetTrustletConfigOperation");

    public ault(auqe auqe, Bundle bundle) {
        super(auqe, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Bundle mo50660a(Bundle bundle) {
        HashMap hashMap;
        Bundle bundle2;
        f92058a.mo50711a("doExecute", new Object[0]);
        Bundle bundle3 = new Bundle();
        aurl a = aurl.m77712a();
        Iterator it = a.f92340i.iterator();
        while (it.hasNext()) {
            auri auri = (auri) it.next();
            try {
                bundle2 = auri.f92322e.mo50807g();
            } catch (RemoteException e) {
                auri.f92318a.mo50710a("RemoteException", e, new Object[0]).mo50706a();
                bundle2 = null;
            }
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            synchronized (a.f92336e) {
                a.f92339h.put(auri.f92321d, bundle2);
            }
        }
        synchronized (a.f92336e) {
            hashMap = new HashMap(a.f92339h);
        }
        ArrayList arrayList = new ArrayList(hashMap.size());
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            arrayList.add(str);
            bundle3.putBundle(str, (Bundle) entry.getValue());
        }
        bundle3.putStringArrayList("key_trustlet_names", arrayList);
        return bundle3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo50661a() {
    }
}
