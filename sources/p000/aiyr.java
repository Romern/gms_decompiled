package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: aiyr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiyr {

    /* renamed from: a */
    public final ahgz f70090a;

    /* renamed from: b */
    public final Set f70091b = new HashSet();

    /* renamed from: c */
    public final bnmu f70092c = bnge.m109299s();

    /* renamed from: d */
    public final bnmu f70093d = bnge.m109299s();

    /* renamed from: e */
    public final Map f70094e = new HashMap();

    /* renamed from: f */
    public final Map f70095f = new HashMap();

    /* renamed from: g */
    public final buqh f70096g;

    /* renamed from: h */
    public aiyo f70097h;

    /* renamed from: i */
    private final Context f70098i;

    /* renamed from: j */
    private final buqn f70099j = new aiyp(this, "SubscriptionManager.removeExpired");

    public aiyr(Context context) {
        this.f70098i = context;
        this.f70090a = ahgz.m55753a(context);
        this.f70096g = (buqh) ahgz.m55754a(context, buqh.class);
    }

    /* renamed from: a */
    public final aiyo mo38288a(aiyn aiyn) {
        this.f70096g.mo72984b();
        mo38294a();
        return (aiyo) this.f70094e.get(aiyn);
    }

    /* renamed from: b */
    public final Set mo38298b() {
        this.f70096g.mo72984b();
        mo38294a();
        return new C1225nr(this.f70094e.values());
    }

    /* renamed from: c */
    public final Set mo38301c() {
        this.f70096g.mo72984b();
        HashSet hashSet = new HashSet(this.f70093d.mo67316o());
        hashSet.addAll(this.f70092c.mo67316o());
        return hashSet;
    }

    /* renamed from: d */
    public final boolean mo38302d() {
        this.f70096g.mo72984b();
        mo38294a();
        return this.f70094e.isEmpty();
    }

    /* renamed from: e */
    public final boolean mo38303e() {
        return this.f70097h != null;
    }

    /* renamed from: f */
    public final boolean mo38304f() {
        for (aiyo aiyo : this.f70095f.values()) {
            if (!aiyo.mo38280a()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final void mo38305g() {
        this.f70096g.mo72984b();
        this.f70094e.size();
    }

    /* renamed from: a */
    public final aiyo mo38289a(ajcd ajcd) {
        return mo38288a(new aiyn(ajcd));
    }

    /* renamed from: b */
    public final void mo38299b(aiyn aiyn) {
        this.f70096g.mo72984b();
        aiyo aiyo = (aiyo) this.f70094e.remove(aiyn);
        if (aiyo != null) {
            this.f70093d.mo67310c(mo38292a(aiyo), aiyo);
            this.f70095f.remove(aiyo.f70083a);
            for (aiyq aiyq : this.f70091b) {
                aiyq.mo38287b();
            }
            srn srn = ahfq.f67120a;
            mo38305g();
            if (aiyo.equals(this.f70097h)) {
                this.f70097h = null;
                ((ajgu) ahgz.m55754a(this.f70098i, ajgu.class)).mo38621b();
                return;
            }
            return;
        }
        srn srn2 = ahfq.f67120a;
        mo38305g();
    }

    /* renamed from: a */
    public final aiyo mo38290a(PendingIntent pendingIntent) {
        return mo38288a(new aiyn(pendingIntent));
    }

    /* renamed from: a */
    public final aiyo mo38291a(String str) {
        this.f70096g.mo72984b();
        return (aiyo) this.f70095f.get(str);
    }

    /* renamed from: a */
    public final ClientAppIdentifier mo38292a(aiyo aiyo) {
        this.f70096g.mo72984b();
        for (ClientAppIdentifier clientAppIdentifier : this.f70093d.mo67316o()) {
            if (this.f70093d.mo67309b(clientAppIdentifier, aiyo)) {
                return clientAppIdentifier;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final Collection mo38293a(ClientAppIdentifier clientAppIdentifier) {
        this.f70096g.mo72984b();
        sdo.m34959a(clientAppIdentifier);
        mo38294a();
        return new HashSet(((bndq) this.f70093d).mo67127c(clientAppIdentifier));
    }

    /* renamed from: a */
    public final void mo38294a() {
        this.f70096g.mo72984b();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList arrayList = new ArrayList();
        long j = Long.MAX_VALUE;
        for (aiyo aiyo : this.f70094e.values()) {
            long j2 = aiyo.f70087e;
            if (j2 < elapsedRealtime) {
                arrayList.add(aiyo);
            } else if (j2 < j) {
                j = j2;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            aiyo aiyo2 = (aiyo) arrayList.get(i);
            if (ajdq.m58560a(aiyo2.mo38281b())) {
                bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
                bnsl.mo68432a("aiyr", "a", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68424a("%s Skip renewing ephemeral infinite-TTL entry: %s", "SubscriptionManager: ", aiyo2.f70084b);
            } else {
                srn srn = ahfq.f67120a;
                aiyn aiyn = aiyo2.f70084b;
                mo38300b(aiyo2);
            }
        }
        this.f70096g.mo72989e(this.f70099j);
        if (j != Long.MAX_VALUE) {
            srn srn2 = ahfq.f67120a;
            this.f70096g.mo72983a(this.f70099j, (j - elapsedRealtime) + 1);
        }
        if (!arrayList2.isEmpty()) {
            aiwp aiwp = (aiwp) this.f70090a.mo36473a(aiwp.class);
            aiwp.f69949b.mo72984b();
            aiwp.f69951d.mo38297a(arrayList2, 0, 0);
            aiwp.f69952e.mo38548a();
        }
    }

    /* renamed from: b */
    public final void mo38300b(aiyo aiyo) {
        this.f70096g.mo72984b();
        if (aiyo != null) {
            mo38299b(aiyo.f70084b);
        }
    }

    /* renamed from: a */
    public final void mo38295a(aiyq aiyq) {
        this.f70096g.mo72984b();
        this.f70091b.add(aiyq);
    }

    /* renamed from: a */
    public final void mo38296a(Collection collection, int i) {
        if (!ajdm.m58555a(i)) {
            this.f70092c.mo67317p().removeAll(collection);
        }
    }

    /* renamed from: a */
    public final void mo38297a(Collection collection, int i, int i2) {
        ajdm ajdm;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            aiyo a = mo38291a((String) it.next());
            if (!(a == null || (ajdm = a.f70088f) == null)) {
                ajdm.mo38506a(i, i2);
                if (ajdm.f70395f == 3) {
                    mo38300b(a);
                }
            }
        }
    }
}
