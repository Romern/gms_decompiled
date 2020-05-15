package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.SparseArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import com.google.android.gms.nearby.messages.internal.SubscribeRequest;
import com.google.android.gms.nearby.messages.internal.UnsubscribeRequest;
import java.util.HashSet;

/* renamed from: ajfx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajfx extends buqn {

    /* renamed from: a */
    final /* synthetic */ SubscribeRequest f70544a;

    /* renamed from: b */
    final /* synthetic */ ajgf f70545b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajfx(ajgf ajgf, String str, SubscribeRequest subscribeRequest) {
        super(str);
        this.f70545b = ajgf;
        this.f70544a = subscribeRequest;
    }

    public final void run() {
        long j;
        aixw a = this.f70545b.mo38595a(this.f70544a.f80773n);
        SubscribeRequest subscribeRequest = this.f70544a;
        aiyd aiyd = a.f70031e;
        try {
            if (subscribeRequest.f80761b != null) {
                int a2 = ClientAppContext.m67402a(subscribeRequest.f80776q, aiyd.f70048a.f80668c);
                if (!aiyd.m58182a(a2, subscribeRequest.f80763d) || !aiyd.mo38254c(subscribeRequest) || !aiyd.mo38246a(subscribeRequest.f80763d) || !aiyd.mo38256d(subscribeRequest) || !aiyd.mo38250a("subscribe", subscribeRequest.f80763d, a2) || !aiyd.mo38252b(subscribeRequest)) {
                    return;
                }
            } else if (subscribeRequest.f80765f == null) {
                throw new IllegalArgumentException("SubscribeRequest missing both messageListener and pendingIntent");
            } else if (aiyd.mo38254c(subscribeRequest) && aiyd.mo38246a(subscribeRequest.f80763d) && aiyd.mo38256d(subscribeRequest)) {
                PendingIntent pendingIntent = subscribeRequest.f80765f;
                ajcg ajcg = subscribeRequest.f80763d;
                if (!ajcp.m58515a(pendingIntent).equals(aiyd.f70048a.f80669d)) {
                    String str = aiyd.f70048a.f80669d;
                    String a3 = ajcp.m58515a(pendingIntent);
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 85 + String.valueOf(a3).length());
                    sb.append("The PendingIntent creator must be the package making the API call. Expected ");
                    sb.append(str);
                    sb.append(" but was ");
                    sb.append(a3);
                    aixw.m58159a(new Status(10, sb.toString()), ajcg);
                    return;
                } else if (aiyd.mo38255d(subscribeRequest.f80763d)) {
                    PendingIntent pendingIntent2 = subscribeRequest.f80765f;
                    ajcg ajcg2 = subscribeRequest.f80763d;
                    aiyr aiyr = (aiyr) ahgz.m55754a(aiyd.f70049b, aiyr.class);
                    ClientAppIdentifier clientAppIdentifier = aiyd.f70048a;
                    aiyr.f70096g.mo72984b();
                    aiyr.f70096g.mo72984b();
                    sdo.m34959a(clientAppIdentifier);
                    HashSet hashSet = new HashSet();
                    if (aiyr.f70093d.mo67271d(clientAppIdentifier)) {
                        for (aiyo aiyo : ((bndq) aiyr.f70093d).mo67127c(clientAppIdentifier)) {
                            PendingIntent pendingIntent3 = aiyo.f70084b.f70081b;
                            if (pendingIntent3 != null) {
                                hashSet.add(pendingIntent3);
                            }
                        }
                    }
                    hashSet.add(pendingIntent2);
                    if (hashSet.size() > 5) {
                        aixw.m58159a(new Status(2801, "Will exceed MAX_PENDING_INTENTS_PER_APP=5"), ajcg2);
                        return;
                    } else if (!aiyd.mo38252b(subscribeRequest)) {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
            if (subscribeRequest.f80761b == null) {
                PendingIntent pendingIntent4 = subscribeRequest.f80765f;
                sdo.m34959a(pendingIntent4);
                Strategy strategy = subscribeRequest.f80762c;
                MessageFilter messageFilter = subscribeRequest.f80764e;
                ajcg ajcg3 = subscribeRequest.f80763d;
                srn srn = ahfq.f67120a;
                int i = strategy.f80692e;
                int i2 = strategy.f80693f;
                int i3 = strategy.f80696i;
                aixz aixz = new aixz(a.f70028b, 4);
                a.f70030d.mo38244a(aixz, messageFilter, strategy, true);
                aiyo aiyo2 = new aiyo(new aiyn(pendingIntent4), messageFilter, aixw.m58155a(strategy, false, true));
                aiyn aiyn = aiyo2.f70084b;
                int i4 = subscribeRequest.f80775p;
                if (i4 != 0) {
                    aiyn.f70082c = i4;
                }
                a.f70032f.mo38169a(ajdm.m58552a(aiyo2, a.mo38234a(ajcg3, aixz)), a.mo38238b(ajcg3), a.f70028b);
                aiyo a4 = a.f70035i.mo38290a(pendingIntent4);
                if (a4 != null) {
                    a.f70034h.mo38400a(new ajao(pendingIntent4), strategy.f80692e, subscribeRequest.f80771l);
                    aiwj aiwj = a.f70029c;
                    ClientAppIdentifier clientAppIdentifier2 = a.f70028b;
                    String str2 = a4.f70083a;
                    sdo.m34959a(subscribeRequest.f80765f);
                    rsk rsk = aiwj.f69937a;
                    long j2 = (long) subscribeRequest.f80762c.f80692e;
                    if (j2 != 2147483647L) {
                        j = SystemClock.elapsedRealtime() + (j2 * 1000);
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("t", j);
                    bundle.putParcelable("s", subscribeRequest);
                    bundle.putByteArray("i", sef.m35074a(clientAppIdentifier2));
                    bundle.putString("d", str2);
                    rsk.mo25062a(bundle);
                } else {
                    a.f70034h.mo38401a(pendingIntent4);
                    a.f70029c.mo38160a(pendingIntent4);
                }
            } else {
                if (subscribeRequest.f80766g != 0) {
                    if (a.f70036j == null) {
                        a.f70036j = new SparseArray();
                    }
                    ajcd ajcd = (ajcd) a.f70036j.get(subscribeRequest.f80766g);
                    if (ajcd != null) {
                        a.mo38236a(new UnsubscribeRequest(ajcd.asBinder(), null, null));
                    }
                    a.f70036j.put(subscribeRequest.f80766g, subscribeRequest.f80761b);
                }
                ajcd ajcd2 = subscribeRequest.f80761b;
                Strategy strategy2 = subscribeRequest.f80762c;
                MessageFilter messageFilter2 = subscribeRequest.f80764e;
                ajcg ajcg4 = subscribeRequest.f80763d;
                ajco ajco = subscribeRequest.f80771l;
                srn srn2 = ahfq.f67120a;
                int i5 = strategy2.f80692e;
                int i6 = strategy2.f80693f;
                int i7 = strategy2.f80696i;
                aixz aixz2 = new aixz(a.f70028b, 4);
                a.f70030d.mo38244a(aixz2, messageFilter2, strategy2, false);
                a.f70032f.mo38169a(ajdm.m58552a(new aiyo(new aiyn(ajcd2), messageFilter2, aixw.m58155a(strategy2, messageFilter2.mo44309a(), true)), a.mo38234a(ajcg4, aixz2)), a.mo38238b(ajcg4), a.f70028b);
                a.f70034h.mo38400a(new ajao(ajcd2), strategy2.f80692e, ajco);
            }
            aiyb.m58178a(a.f70027a);
        } catch (Exception e) {
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("aiyd", "a", 138, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("NearbyPreconditions: Exception trying to check %s", subscribeRequest);
            aixw.m58159a(new Status(8), subscribeRequest.f80763d);
        }
    }
}
