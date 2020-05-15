package com.google.android.gms.ads.internal.video.gmsg;

import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.video.C0681c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.ads.internal.video.gmsg.b */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0683b implements Iterable {

    /* renamed from: a */
    private final List f9030a = new ArrayList();

    public final Iterator iterator() {
        return this.f9030a.iterator();
    }

    /* renamed from: a */
    public static final void m5749a(C0681c cVar) {
        C0682a aVar;
        Iterator it = C0387d.m5373k().iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = null;
                break;
            }
            aVar = (C0682a) it.next();
            C0681c cVar2 = aVar.f9029a;
            if (cVar == null) {
                break;
            }
        }
        if (aVar != null) {
            throw null;
        }
    }
}
