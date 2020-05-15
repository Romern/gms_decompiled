package p000;

import java.util.HashMap;

/* renamed from: bapf */
final /* synthetic */ class bapf implements bqeh {
    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        Exception exc = (Exception) obj;
        HashMap hashMap = new HashMap();
        for (Throwable th : bmzo.m108691c(exc)) {
            hashMap.put(th.getClass(), th);
        }
        if (hashMap.containsKey(babw.class)) {
            bxvd da = bpyi.f139852o.mo74144da();
            bqaq bqaq = bqaq.CALL_CREDENTIALS_ERROR;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpyi bpyi = (bpyi) da.f164949b;
            bpyi.f139856c = bqaq.mo3214a();
            bpyi.f139854a |= 2;
            return bqga.m112775a((bpyi) da.mo74062i());
        } else if (hashMap.containsKey(baqd.class)) {
            bxvd da2 = bpyi.f139852o.mo74144da();
            bqaq a = bapk.m87323a((baqd) hashMap.get(baqd.class));
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpyi bpyi2 = (bpyi) da2.f164949b;
            bpyi2.f139856c = a.mo3214a();
            bpyi2.f139854a |= 2;
            return bqga.m112775a((bpyi) da2.mo74062i());
        } else {
            throw exc;
        }
    }
}
