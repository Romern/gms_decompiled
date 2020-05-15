package com.google.android.gms.ads.internal.p012js;

import android.net.Uri;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.gmsg.C0426e;
import com.google.android.gms.ads.internal.util.client.C0633h;
import com.google.android.gms.ads.internal.util.future.C0645d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.gms.ads.internal.js.n */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C0496n implements C0493k {

    /* renamed from: a */
    private final Map f8492a = new HashMap();

    /* renamed from: c */
    public Object f8493c;

    /* renamed from: a */
    public final synchronized void mo6684a(String str, C0426e eVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f8492a.get(str);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            this.f8492a.put(str, copyOnWriteArrayList);
        }
        copyOnWriteArrayList.add(eVar);
    }

    /* renamed from: b */
    public final void mo6688b(Uri uri) {
        mo6685a(uri.getPath(), C0387d.m5363a().mo6847a(uri));
    }

    /* renamed from: d */
    public final synchronized void mo6690d() {
        this.f8492a.clear();
    }

    /* renamed from: b */
    public final synchronized void mo6689b(String str, C0426e eVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f8492a.get(str);
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(eVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b4, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo6685a(String str, Map map) {
        if (C0633h.m5667a(2)) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() == 0) {
                new String("Received GMSG: ");
            } else {
                "Received GMSG: ".concat(valueOf);
            }
            for (String str2 : map.keySet()) {
                String str3 = (String) map.get(str2);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str3);
                sb.toString();
            }
        }
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f8492a.get(str);
        if (copyOnWriteArrayList != null) {
            if (!copyOnWriteArrayList.isEmpty()) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    C0645d.f8976d.execute(new C0494l(this, (C0426e) it.next(), map));
                }
                return;
            }
        }
        if (((Boolean) C0371o.f8221aH.mo6604a()).booleanValue() && C0387d.m5366d().mo6781a() != null) {
            C0645d.f8973a.execute(new C0495m(str));
        }
    }

    /* renamed from: a */
    public final synchronized void mo6686a(String str, ssx ssx) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f8492a.get(str);
        if (copyOnWriteArrayList != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C0426e eVar = (C0426e) it.next();
                if (ssx.mo6692a(eVar)) {
                    arrayList.add(eVar);
                }
            }
            copyOnWriteArrayList.removeAll(arrayList);
        }
    }

    /* renamed from: a */
    public final boolean mo6687a(Uri uri) {
        if (!"gmsg".equalsIgnoreCase(uri.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            return false;
        }
        mo6688b(uri);
        return true;
    }
}
