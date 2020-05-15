package p000;

import com.felicanetworks.mfc.mfi.MfiClientException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: aivv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aivv implements aivm {

    /* renamed from: a */
    public final aivn f69904a;

    /* renamed from: b */
    public final aiug f69905b;

    /* renamed from: c */
    public final airs f69906c;

    /* renamed from: d */
    private final Map f69907d = new C1223np();

    /* renamed from: e */
    private final bqgj f69908e = ahhr.m55806b();

    public aivv(aivd aivd, aitq aitq, aivn aivn, airs airs) {
        this.f69904a = aivn;
        this.f69905b = new aiug(aivd, aitq);
        this.f69906c = airs;
        aivn.mo38123a(this);
    }

    /* renamed from: a */
    public final aivx mo38131a(aivw aivw, String str, ahfk ahfk) {
        if (aivw != null) {
            aivu aivu = new aivu(this.f69904a, this.f69905b, aivw, str, ahfk);
            if (airr.SUCCESS != this.f69906c.mo37908b(aivu)) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
                bnsl.mo68432a("aivv", "a", 195, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Failed to connect WiFi Aware socket because the MediumOperation failed to register.");
                return null;
            }
            aivx aivx = aivu.f69898a;
            aivx.mo37637a(new aivq(this, aivu));
            return aivx;
        }
        bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
        bnsl2.mo68432a("aivv", "a", 185, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68405a("Refusing to connect to WiFi Aware network because wifiAwarePeer is null.");
        return null;
    }

    /* renamed from: b */
    public final synchronized void mo38137b(String str) {
        if (!mo38135a(str)) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aivv", "b", 122, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Can't stop accepting WiFi connections because it was never started.");
            return;
        }
        this.f69907d.remove(str);
        bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
        bnsl2.mo68432a("aivv", "b", 127, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68405a("Stopped accepting incoming WiFi Aware connections.");
    }

    /* renamed from: a */
    public final synchronized void mo38132a() {
        ahhr.m55805a(this.f69908e, "WifiAwareNetworkManager.singleThreadOffloader");
        Iterator it = new C1225nr(this.f69907d.keySet()).iterator();
        while (it.hasNext()) {
            mo38137b((String) it.next());
        }
        aiug aiug = this.f69905b;
        ahhr.m55805a(aiug.f69782e, "L2ProtocolRunner.alarmExecutor");
        ahhr.m55805a(aiug.f69780c, "L2ProtocolRunner.requestExecutor");
        ahhr.m55805a(aiug.f69781d, "L2ProtocolRunner.acceptExecutor");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo38119a(aivg aivg) {
        String str = aivg.f69865a.f69910b;
        if (!mo38135a(str)) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aivv", "a", 134, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Ignoring incoming WiFi Aware connection because we are no longer accepting incoming connections for %s.", str);
            if (aivg != null) {
                aivg.close();
            }
        } else {
            aiug aiug = this.f69905b;
            aiug.mo38053a(new aitr(aiug, aivg, ((aivt) this.f69907d.get(str)).mo38004a(), new aivo(this, str)));
        }
    }

    /* renamed from: a */
    public final void mo38133a(Runnable runnable) {
        this.f69908e.execute(runnable);
    }

    /* renamed from: a */
    public final synchronized void mo38134a(String str, aivx aivx) {
        if (!mo38135a(str)) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aivv", "a", (int) MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Ignoring incoming WiFi Aware connection because we are no longer accepting incoming connections for %s.", str);
            ails.m57440a(aivx, "WifiAware", "IncomingL2Socket");
            return;
        }
        airo airo = new airo(54);
        if (airr.SUCCESS != this.f69906c.mo37908b(airo)) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
            bnsl2.mo68432a("aivv", "a", 163, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Ignoring incoming WiFi Aware connection because the MediumOperation failed to register.");
            ails.m57440a(aivx, "WifiAware", "IncomingL2Socket");
            return;
        }
        aivx.mo37637a(new aivp(this, airo));
        ((aivt) this.f69907d.get(str)).mo38005b().f69191a.f67651a.mo36909a(aivx);
    }

    /* renamed from: a */
    public final synchronized boolean mo38135a(String str) {
        return this.f69907d.containsKey(str);
    }

    /* renamed from: a */
    public final synchronized boolean mo38136a(String str, String str2, aiml aiml) {
        if (str == null || aiml == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aivv", "a", 99, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Refusing to start accepting WiFi Aware connections because serviceId and/or acceptedConnectionCallback is null.");
            return false;
        } else if (mo38135a(str)) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
            bnsl2.mo68432a("aivv", "a", 106, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Refusing to start accepting WiFi Aware connections for %s because we're already accepting connections.", str);
            return false;
        } else {
            this.f69907d.put(str, new aitn(aiml, str2));
            return true;
        }
    }
}
