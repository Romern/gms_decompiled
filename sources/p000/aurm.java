package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: aurm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aurm implements aurp {

    /* renamed from: c */
    private static final aunx f92356c = new aunx("TrustAgent", "TrustletServiceClient");

    /* renamed from: a */
    public final boolean f92357a;

    /* renamed from: b */
    public final boolean f92358b;

    /* renamed from: d */
    private final Context f92359d;

    /* renamed from: e */
    private final aurq f92360e;

    /* renamed from: f */
    private final String f92361f;

    /* renamed from: g */
    private boolean f92362g;

    /* renamed from: h */
    private auri f92363h;

    /* renamed from: i */
    private String f92364i;

    /* renamed from: j */
    private auqp f92365j;

    public aurm(Context context, aurq aurq, String str, boolean z, boolean z2) {
        this.f92359d = context;
        this.f92360e = aurq;
        this.f92361f = str;
        this.f92358b = z2;
        this.f92357a = z;
        aurq.f92374a = this;
    }

    /* renamed from: a */
    public final synchronized void mo50841a(auqn auqn) {
        if (auqn == null) {
            f92356c.mo50711a("trustletService is null.", new Object[0]).mo50709d();
            mo50843b();
            return;
        }
        try {
            Bundle g = auqn.mo50807g();
            if (g == null) {
                f92356c.mo50711a("trustletInfo is null.", new Object[0]).mo50709d();
                mo50843b();
                return;
            }
            String string = g.getString("com.google.android.gms.trustagent.api.trustlet.key_trustlet_name");
            this.f92364i = string;
            if (string == null) {
                this.f92364i = "Car";
            }
            auqp auqp = new auqp(this.f92364i, aurl.m77712a());
            this.f92365j = auqp;
            auqn.mo50799a(auqp);
            this.f92363h = new auri(auqn, g);
            aurl a = aurl.m77712a();
            auri auri = this.f92363h;
            aurl.f92332a.mo50711a("registerTrustlet: %s", auri.f92321d).mo50708c();
            String str = auri.f92321d;
            a.f92340i.add(auri);
            synchronized (a.f92336e) {
                if (!a.f92346o && auri.mo50823c()) {
                    a.f92346o = true;
                    a.mo50832a(true);
                }
                if (!a.f92345n && auri.mo50821a()) {
                    a.f92345n = true;
                    a.mo50833a(true, auri.f92319b, auri.f92320c, str);
                }
            }
        } catch (RemoteException e) {
            f92356c.mo50710a("RemoteException", e, new Object[0]).mo50706a();
        }
    }

    /* renamed from: b */
    public final synchronized void mo50843b() {
        f92356c.mo50711a("unbind from action: %s", this.f92361f);
        if (!this.f92362g) {
            f92356c.mo50711a("No need to unbind.", new Object[0]);
            return;
        }
        skh.m35531a().mo25689a(this.f92359d, this.f92360e);
        this.f92362g = false;
    }

    /* renamed from: c */
    public final synchronized boolean mo50844c() {
        return this.f92362g;
    }

    /* renamed from: d */
    public final synchronized void mo50845d() {
        if (this.f92363h != null) {
            aurl a = aurl.m77712a();
            auri auri = this.f92363h;
            String str = auri.f92321d;
            aurl.f92332a.mo50711a("unregisterTrustlet: %s", str).mo50708c();
            a.f92340i.remove(auri);
            String valueOf = String.valueOf(str);
            a.mo50836b(valueOf.length() == 0 ? new String("Removed trustlet ") : "Removed trustlet ".concat(valueOf));
            this.f92362g = false;
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo50842a() {
        f92356c.mo50711a("bind with action: %s", this.f92361f);
        if (this.f92362g) {
            f92356c.mo50711a("already bound to TrustletService.", new Object[0]);
            return this.f92362g;
        }
        Intent intent = new Intent(this.f92361f);
        intent.setPackage("com.google.android.gms");
        boolean a = skh.m35531a().mo25690a(this.f92359d, intent, this.f92360e, 1);
        this.f92362g = a;
        return a;
    }
}
