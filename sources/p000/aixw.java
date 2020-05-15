package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.SparseArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.nearby.messages.internal.SubscribeRequest;
import com.google.android.gms.nearby.messages.internal.UnsubscribeRequest;

/* renamed from: aixw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aixw {

    /* renamed from: a */
    public final Context f70027a;

    /* renamed from: b */
    public final ClientAppIdentifier f70028b;

    /* renamed from: c */
    public final aiwj f70029c;

    /* renamed from: d */
    public final aiya f70030d;

    /* renamed from: e */
    public final aiyd f70031e;

    /* renamed from: f */
    public final aiwp f70032f;

    /* renamed from: g */
    public final ajas f70033g = new ajas();

    /* renamed from: h */
    public final ajap f70034h;

    /* renamed from: i */
    public final aiyr f70035i;

    /* renamed from: j */
    public SparseArray f70036j;

    /* renamed from: k */
    private final IBinder f70037k;

    /* renamed from: l */
    private final aiyh f70038l;

    public aixw(Context context, ClientAppIdentifier clientAppIdentifier, aiwj aiwj) {
        this.f70027a = context;
        this.f70028b = clientAppIdentifier;
        this.f70029c = aiwj;
        this.f70030d = (aiya) ahgz.m55754a(context, aiya.class);
        this.f70037k = new Binder();
        this.f70032f = (aiwp) ahgz.m55754a(context, aiwp.class);
        this.f70034h = new ajap(this.f70027a);
        this.f70031e = new aiyd(clientAppIdentifier, context, aiwj, new ajgk(context));
        this.f70038l = (aiyh) ahgz.m55754a(context, aiyh.class);
        this.f70035i = (aiyr) ahgz.m55754a(context, aiyr.class);
    }

    /* renamed from: a */
    public static Strategy m58155a(Strategy strategy, boolean z, boolean z2) {
        aiyi aiyi = new aiyi(strategy);
        if (z) {
            if (strategy.f80695h == -1) {
                aiyi.f70067c = 4;
            }
            if (strategy.f80696i == 3) {
                if (!z2) {
                    aiyi.f70065a = 1;
                } else {
                    aiyi.f70065a = 2;
                }
            }
            if (strategy.f80693f == 0) {
                aiyi.f70066b = 1;
            }
        }
        if (strategy.f80695h == 2 && strategy.f80696i == 3) {
            if (!z2) {
                aiyi.f70065a = 1;
            } else {
                aiyi.f70065a = 2;
            }
        } else if (strategy.f80693f == 1) {
            aiyi.f70067c = 4;
        }
        return aiyi.mo38269a();
    }

    /* renamed from: a */
    public final int mo38233a(int i) {
        aiyd aiyd = this.f70031e;
        int i2 = aiyd.f70050c;
        int i3 = i | i2;
        aiyd.f70050c = i3;
        return i3 ^ i2;
    }

    /* renamed from: b */
    public final IBinder mo38238b(ajcg ajcg) {
        return ajcg != null ? ajcg.asBinder() : this.f70037k;
    }

    /* renamed from: a */
    private final void m58156a(ajcd ajcd, ajcg ajcg) {
        srn srn = ahfq.f67120a;
        if (this.f70035i.mo38289a(ajcd) != null) {
            aixz aixz = new aixz(this.f70028b, 5);
            this.f70030d.mo38242a(aixz);
            this.f70032f.mo38169a(ajdm.m58554a(ajdt.m58563a(ajcd), mo38234a(ajcg, aixz)), mo38238b(ajcg), this.f70028b);
        } else {
            m58157a(ajcg);
        }
        this.f70034h.mo38399a(new ajao(ajcd));
    }

    /* renamed from: a */
    public static void m58157a(ajcg ajcg) {
        m58159a(Status.f30107a, ajcg);
    }

    /* renamed from: a */
    private final void m58158a(PendingIntent pendingIntent, ajcg ajcg) {
        srn srn = ahfq.f67120a;
        this.f70029c.mo38160a(pendingIntent);
        aixz aixz = new aixz(this.f70028b, 5);
        this.f70030d.mo38242a(aixz);
        this.f70032f.mo38169a(ajdm.m58554a(ajdt.m58564a(pendingIntent), mo38234a(ajcg, aixz)), mo38238b(ajcg), this.f70028b);
        this.f70034h.mo38401a(pendingIntent);
    }

    /* renamed from: a */
    public static void m58159a(Status status, ajcg ajcg) {
        srn srn = ahfq.f67120a;
        if (ajcg != null) {
            try {
                ajcg.mo38481a(status);
            } catch (RemoteException e) {
                status.toString();
            }
        }
    }

    /* renamed from: a */
    public final rkl mo38234a(ajcg ajcg, aixz aixz) {
        return new aixu(this, ajcg, aixz);
    }

    /* renamed from: a */
    public final void mo38235a() {
        ajas ajas = this.f70033g;
        boolean b = this.f70031e.mo38251b((ajcg) null);
        try {
            int beginBroadcast = ajas.f70272a.beginBroadcast();
            srn srn = ahfq.f67120a;
            for (int i = 0; i < beginBroadcast; i++) {
                ((ajcl) ajas.f70272a.getBroadcastItem(i)).mo38490a(b);
            }
            ajas.f70272a.finishBroadcast();
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("ajas", "a", 47, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to send onPermissionChange");
        } catch (Throwable th) {
            ajas.f70272a.finishBroadcast();
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo38236a(UnsubscribeRequest unsubscribeRequest) {
        ajcd ajcd;
        SparseArray sparseArray;
        aiyd aiyd = this.f70031e;
        if (unsubscribeRequest.f80785b != null) {
            if (!aiyd.mo38253c(unsubscribeRequest.f80786c)) {
                return;
            }
        } else if (!aiyd.mo38255d(unsubscribeRequest.f80786c) || !aiyd.mo38253c(unsubscribeRequest.f80786c)) {
            return;
        }
        int i = unsubscribeRequest.f80788e;
        if (i == 0 || (sparseArray = this.f70036j) == null) {
            ajcd = unsubscribeRequest.f80785b;
        } else {
            ajcd = (ajcd) sparseArray.get(i, unsubscribeRequest.f80785b);
            this.f70036j.remove(i);
        }
        if (ajcd == null) {
            m58158a(unsubscribeRequest.f80787d, unsubscribeRequest.f80786c);
        } else {
            m58156a(ajcd, unsubscribeRequest.f80786c);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.util.Collection], assign insn: 0x0006: INVOKE  (r1v1 ? I:java.util.Collection) = (r1v0 ajar) type: VIRTUAL call: ajar.b():java.util.Collection */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List, java.util.Collection], assign insn: 0x0014: INVOKE  (r5v0 ? I:java.util.Collection) = (r1v2 ajar) type: VIRTUAL call: ajar.b():java.util.Collection */
    /* renamed from: a */
    public final void mo38237a(boolean z) {
        SubscribeRequest b;
        srn srn = ahfq.f67120a;
        ajap ajap = this.f70034h;
        ? b2 = ajap.f70261a.mo38406b();
        int size = b2.size();
        for (int i = 0; i < size; i++) {
            try {
                ((ajck) b2.get(i)).mo38489a();
            } catch (RemoteException e) {
            }
        }
        ? b3 = ajap.f70263c.mo38406b();
        int size2 = b3.size();
        for (int i2 = 0; i2 < size2; i2++) {
            try {
                ((ajco) b3.get(i2)).mo38491a();
            } catch (RemoteException e2) {
            }
        }
        ajap.f70261a.mo38404a();
        ajap.f70263c.mo38404a();
        for (buqn buqn : ajap.f70262b.values()) {
            ajap.f70265e.mo72989e(buqn);
        }
        ajap.f70262b.clear();
        for (buqn buqn2 : ajap.f70264d.values()) {
            ajap.f70265e.mo72989e(buqn2);
        }
        ajap.f70264d.clear();
        if (z) {
            this.f70029c.mo38162b().size();
            for (Bundle bundle : this.f70029c.mo38162b()) {
                if (this.f70028b.equals(aiwj.m58077e(bundle)) && (b = aiwj.m58074b(bundle)) != null) {
                    m58158a(b.f80765f, (ajcg) null);
                }
            }
        }
        for (String str : this.f70038l.mo38262a(this.f70028b)) {
            this.f70032f.mo38169a(ajdm.m58553a(ajdr.m58562a(this.f70028b, str), aixv.f70026a), this.f70037k, this.f70028b);
        }
        for (aiyo aiyo : this.f70035i.mo38293a(this.f70028b)) {
            if (!aiyo.mo38280a()) {
                m58156a(aiyo.f70084b.f70080a, (ajcg) null);
            }
        }
        SparseArray sparseArray = this.f70036j;
        if (sparseArray != null) {
            sparseArray.clear();
            this.f70036j = null;
        }
    }
}
