package p000;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.MdhBroadcastListenerKey;
import com.google.android.gms.mdh.MdhBroadcastListenerParams;

/* renamed from: accq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class accq implements acjj {

    /* renamed from: a */
    private final baad f59582a;

    /* renamed from: b */
    private final Account f59583b;

    /* renamed from: c */
    private final bygz f59584c;

    /* renamed from: d */
    private final rnt f59585d;

    public accq(baae baae, MdhBroadcastListenerKey mdhBroadcastListenerKey, MdhBroadcastListenerParams mdhBroadcastListenerParams, String str, rnt rnt) {
        baac baac;
        try {
            baab a = accp.m48894a(str, mdhBroadcastListenerKey);
            LatestFootprintFilter latestFootprintFilter = mdhBroadcastListenerParams.f79986a;
            if (latestFootprintFilter == null) {
                baac = baac.m86446a(null);
            } else {
                baac = baac.m86446a(bafi.m86740a(acfw.m49036a(latestFootprintFilter)));
            }
            azzy azzy = (azzy) baae.f100363a.mo6445a();
            baae.m86449a(azzy, 1);
            baae.m86449a(a, 2);
            baae.m86449a(baac, 3);
            this.f59582a = new baad(azzy, a, baac);
            this.f59583b = mdhBroadcastListenerKey.f79984b;
            this.f59584c = a.mo55529c();
            this.f59585d = rnt;
        } catch (bxwf | NullPointerException e) {
            throw new azzp(3, "Exception occurred while parsing subscription key.", e);
        }
    }

    /* renamed from: a */
    public final bygz mo32663a() {
        return this.f59584c;
    }

    /* renamed from: b */
    public final accl mo32665b() {
        return accl.READ;
    }

    /* renamed from: c */
    public final Account mo32666c() {
        return this.f59583b;
    }

    /* renamed from: d */
    public final boolean mo32667d() {
        return true;
    }

    /* renamed from: e */
    public final void mo32668e() {
        try {
            this.f59582a.mo55542a();
            this.f59585d.mo11797a(Status.f30107a);
        } catch (azzp e) {
            this.f59585d.mo11797a(ackq.m49338a(getClass().getSimpleName(), e));
        }
    }

    /* renamed from: a */
    public final void mo32664a(Status status) {
        this.f59585d.mo11797a(status);
    }
}
