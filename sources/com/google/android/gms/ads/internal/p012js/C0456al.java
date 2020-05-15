package com.google.android.gms.ads.internal.p012js;

import com.google.android.gms.ads.internal.gmsg.C0426e;
import com.google.android.gms.ads.internal.util.promise.C0662c;
import java.util.AbstractMap;
import java.util.Iterator;

/* renamed from: com.google.android.gms.ads.internal.js.al */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0456al implements C0662c {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6648a(Object obj) {
        C0467aw awVar = (C0467aw) ((C0466av) obj);
        Iterator it = awVar.f8452b.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
            String valueOf = String.valueOf(((C0426e) simpleEntry.getValue()).toString());
            if (valueOf.length() == 0) {
                new String("Unregistering eventhandler: ");
            } else {
                "Unregistering eventhandler: ".concat(valueOf);
            }
            awVar.f8451a.mo6658b((String) simpleEntry.getKey(), (C0426e) simpleEntry.getValue());
        }
        awVar.f8452b.clear();
    }
}
