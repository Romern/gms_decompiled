package p000;

import android.util.Pair;
import com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: azfu */
public final /* synthetic */ class azfu implements bdaq {

    /* renamed from: a */
    private final SilentRegisterIntentOperation f99248a;

    /* renamed from: b */
    private final List f99249b;

    public azfu(SilentRegisterIntentOperation silentRegisterIntentOperation, List list) {
        this.f99248a = silentRegisterIntentOperation;
        this.f99249b = list;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bbpk.a(bcoh, com.google.android.libraries.messaging.lighter.model.ConversationId, java.lang.Integer, java.lang.Integer, bctq[]):bdar
     arg types: [bcoh, com.google.android.libraries.messaging.lighter.model.ConversationId, int, int, bctq[]]
     candidates:
      bbpk.a(bcoh, com.google.android.libraries.messaging.lighter.model.ConversationId, bcop, java.lang.String, bmxv):bqgg
      bbpk.a(bcoh, com.google.android.libraries.messaging.lighter.model.ConversationId, java.lang.Integer, java.lang.Integer, bctq[]):bdar */
    /* renamed from: a */
    public final void mo54573a(Object obj) {
        int i;
        SilentRegisterIntentOperation silentRegisterIntentOperation = this.f99248a;
        List list = this.f99249b;
        bdau bdau = (bdau) obj;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            Pair pair = (Pair) list.get(i2);
            bnre i3 = ((bngx) bdau.mo57835a((bdar) pair.first)).listIterator();
            while (true) {
                i = i2 + 1;
                if (!i3.hasNext()) {
                    break;
                }
                arrayList.add(azbj.m85193a(silentRegisterIntentOperation.f111106c).mo54564d().mo56312a((bcoh) pair.second, ((bcsp) i3.next()).mo57317a(), (Integer) 1, (Integer) 0, bctq.f104886g));
            }
            i2 = i;
        }
        if (arrayList.isEmpty()) {
            silentRegisterIntentOperation.mo60382a();
        } else {
            bdav.m90505a((Collection) arrayList).mo57830c(new azfw(silentRegisterIntentOperation, arrayList));
        }
    }
}
