package p000;

import java.io.IOException;

/* renamed from: ahne */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahne {

    /* renamed from: a */
    private final ahov f67598a;

    /* renamed from: b */
    private final ahnd f67599b = new ahnd();

    public ahne(ahov ahov) {
        this.f67598a = ahov;
    }

    /* renamed from: a */
    private static void m56215a(String str, ahna ahna, byqy byqy) {
        ((bnsl) ahkm.f67363a.mo68390d()).mo68424a("EndpointChannelManager encrypted channel of type %s to endpoint %s", ahna.mo36795a(), str);
        ahna.mo36798a(byqy);
    }

    /* renamed from: c */
    private final void m56216c(ahkv ahkv, String str, ahna ahna) {
        if (this.f67599b.mo36872a(str) != null) {
            m56215a(str, ahna, this.f67599b.mo36872a(str));
        }
        ahna.mo36797a(ahkv.f67390f, str);
        ahnd ahnd = this.f67599b;
        ahnc ahnc = (ahnc) ahnd.f67597a.get(str);
        if (ahnc == null) {
            ahnc = new ahnc();
        }
        ahnc.f67595a = ahna;
        ahnd.f67597a.put(str, ahnc);
    }

    /* renamed from: b */
    public final synchronized int mo36880b() {
        return ((C1245ok) this.f67599b.f67597a).f26809h;
    }

    /* renamed from: b */
    public final synchronized ahna mo36881b(ahkv ahkv, String str, ahna ahna) {
        ahna b = this.f67599b.mo36874b(str);
        if (b != null) {
            m56216c(ahkv, str, ahna);
            ((bnsl) ahkm.f67363a.mo68390d()).mo68425a("EndpointChannelManager replaced endpoint %s's channel from type %s to type %s.", str, b.mo36795a(), ahna.mo36795a());
            return b;
        }
        ((bnsl) ahkm.f67363a.mo68390d()).mo68424a("EndpointChannelManager failed to replace endpoint %s's channel with type %s because the endpoint has no existing channel.", str, ahna.mo36795a());
        return null;
    }

    /* renamed from: a */
    public final ahna mo36875a(aiwd aiwd) {
        try {
            return new ahrl(this.f67598a, aiwd);
        } catch (IOException e) {
            return null;
        }
    }

    /* renamed from: a */
    public final synchronized ahna mo36876a(String str) {
        return this.f67599b.mo36874b(str);
    }

    /* renamed from: a */
    public final synchronized void mo36877a() {
        ((bnsl) ahkm.f67363a.mo68390d()).mo68405a("Initiating shutdown of EndpointChannelManager.");
        ahnd ahnd = this.f67599b;
        while (!ahnd.f67597a.isEmpty()) {
            String str = (String) ahnd.f67597a.keySet().iterator().next();
            ((bnsl) ahkm.f67363a.mo68390d()).mo68420a("EndpointChannelManager found an unexpected lingering entry for endpoint %s while shutting down.", str);
            ahnd.mo36873a(str, 6);
        }
        ((bnsl) ahkm.f67363a.mo68390d()).mo68405a("EndpointChannelManager has shut down.");
    }

    /* renamed from: b */
    public final synchronized boolean mo36882b(String str) {
        boolean z;
        if (this.f67599b.mo36873a(str, 2)) {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68420a("EndpointChannelManager unregistered endpoint %s", str);
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public final synchronized void mo36878a(ahkv ahkv, String str, ahna ahna) {
        mo36882b(str);
        m56216c(ahkv, str, ahna);
        ((bnsl) ahkm.f67363a.mo68390d()).mo68424a("EndpointChannelManager registered channel of type %s to endpoint %s", ahna.mo36795a(), str);
    }

    /* renamed from: a */
    public final synchronized void mo36879a(String str, byqy byqy) {
        ahna b = this.f67599b.mo36874b(str);
        if (b != null) {
            m56215a(str, b, byqy);
            ahnd ahnd = this.f67599b;
            ahnc ahnc = (ahnc) ahnd.f67597a.get(str);
            if (ahnc == null) {
                ahnc = new ahnc();
            }
            ahnc.f67596b = byqy;
            ahnd.f67597a.put(str, ahnc);
            return;
        }
        ((bnsl) ahkm.f67363a.mo68390d()).mo68420a("EndpointChannelManager failed to encrypt endpoint %s's channel because the endpoint has no existing channel.", str);
    }
}
