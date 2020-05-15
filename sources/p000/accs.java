package p000;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdh.MdhBroadcastListenerKey;

/* renamed from: accs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class accs implements acjj {

    /* renamed from: a */
    private final baaf f59587a;

    /* renamed from: b */
    private final Account f59588b;

    /* renamed from: c */
    private final bygz f59589c;

    /* renamed from: d */
    private final rnt f59590d;

    public accs(baag baag, MdhBroadcastListenerKey mdhBroadcastListenerKey, String str, rnt rnt) {
        try {
            baab a = accp.m48894a(str, mdhBroadcastListenerKey);
            azzy azzy = (azzy) baag.f100366a.mo6445a();
            baag.m86451a(azzy, 1);
            baag.m86451a(a, 2);
            this.f59587a = new baaf(azzy, a);
            this.f59588b = mdhBroadcastListenerKey.f79984b;
            this.f59589c = a.mo55529c();
            this.f59590d = rnt;
        } catch (bxwf | NullPointerException e) {
            throw new azzp(3, "Exception occurred while parsing subscription key.", e);
        }
    }

    /* renamed from: a */
    public final bygz mo32663a() {
        return this.f59589c;
    }

    /* renamed from: b */
    public final accl mo32665b() {
        return accl.READ;
    }

    /* renamed from: c */
    public final Account mo32666c() {
        return this.f59588b;
    }

    /* renamed from: d */
    public final boolean mo32667d() {
        return true;
    }

    /* renamed from: e */
    public final void mo32668e() {
        try {
            this.f59587a.mo55544a();
            this.f59590d.mo11797a(Status.f30107a);
        } catch (azzp e) {
            this.f59590d.mo11797a(ackq.m49338a(getClass().getSimpleName(), e));
        }
    }

    /* renamed from: a */
    public final void mo32664a(Status status) {
        this.f59590d.mo11797a(status);
    }
}
