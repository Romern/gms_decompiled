package p000;

import java.net.UnknownHostException;
import java.util.HashMap;

/* renamed from: baah */
final /* synthetic */ class baah implements bqeh {

    /* renamed from: a */
    private final baam f100367a;

    public baah(baam baam) {
        this.f100367a = baam;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bqam bqam;
        baam baam = this.f100367a;
        Exception exc = (Exception) obj;
        bxvd da = bpya.f139814c.mo74144da();
        try {
            if (((Boolean) acaw.f59250G.mo32596a()).booleanValue()) {
                HashMap hashMap = new HashMap();
                for (Throwable th : bmzo.m108691c(exc)) {
                    hashMap.put(th.getClass(), th);
                }
                if (!hashMap.containsKey(UnknownHostException.class)) {
                    if (hashMap.containsKey(chux.class)) {
                        if (((chux) hashMap.get(chux.class)).f189238a.f189233s.equals(chuv.f189229p.f189233s)) {
                            bqam = bqam.UNAVAILABLE;
                        }
                    }
                    if (hashMap.containsKey(chux.class)) {
                        if (((chux) hashMap.get(chux.class)).f189238a.f189233s.equals(chuv.f189219f.f189233s)) {
                            bqam = bqam.DEADLINE_EXCEEDED;
                        }
                    }
                    bqam = bqam.FAILURE;
                } else {
                    bqam = bqam.UNKNOWN_HOST_EXCEPTION;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpya bpya = (bpya) da.f164949b;
                bpya.f139817b = bqam.mo3214a();
                bpya.f139816a |= 16;
                bnic bnic = baam.f100372a;
                bqam a = bqam.m112472a(((bpya) da.f164949b).f139817b);
                if (a == null) {
                    a = bqam.UNDEFINED;
                }
                if (bnic.contains(a)) {
                    throw new baan(exc);
                }
                throw exc;
            }
            bqam bqam2 = bqam.FAILURE;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpya bpya2 = (bpya) da.f164949b;
            bpya2.f139817b = bqam2.mo3214a();
            bpya2.f139816a |= 16;
            throw exc;
        } catch (Throwable th2) {
            ((bads) baam.f100378g.mo16713a()).mo32747a((bpya) da.mo74062i());
            throw th2;
        }
    }
}
