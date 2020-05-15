package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.auth.AppIdentity;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: uey */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uey {

    /* renamed from: a */
    public final uih f47394a;

    /* renamed from: b */
    public final String f47395b;

    /* renamed from: c */
    public final AppIdentity f47396c;

    /* renamed from: d */
    public final long f47397d;

    /* renamed from: e */
    public final Set f47398e;

    private uey(uih uih) {
        sdo.m34959a(uih);
        this.f47394a = uih;
        this.f47395b = "0";
        this.f47396c = AppIdentity.f30763a;
        this.f47397d = Long.MAX_VALUE;
        this.f47398e = Collections.unmodifiableSet(twt.f46776e);
    }

    /* renamed from: a */
    public static uey m38255a(uih uih) {
        return new uey(uih);
    }

    /* renamed from: b */
    public final boolean mo27265b() {
        return "378076965553".equals(this.f47395b) || "86665574018".equals(this.f47395b) || "745476177629".equals(this.f47395b);
    }

    /* renamed from: c */
    public final boolean mo27266c() {
        return this.f47398e.contains(twt.f46774c);
    }

    /* renamed from: d */
    public final boolean mo27267d() {
        return this.f47398e.contains(twt.f46772a) && !mo27266c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            uey uey = (uey) obj;
            return sdg.m34949a(this.f47394a, uey.f47394a) && sdg.m34949a(this.f47396c, uey.f47396c) && sdg.m34949a(this.f47395b, uey.f47395b) && sdg.m34949a(this.f47398e, uey.f47398e);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f47394a, this.f47396c, this.f47395b, this.f47398e});
    }

    public final String toString() {
        return String.format("AuthorizedApp [account=%s, sdkAppId=%s, appIdentity=%s, expiryTimestamp=%s, scopes=%s]", this.f47394a, this.f47395b, this.f47396c, new Date(this.f47397d).toString(), this.f47398e);
    }

    /* renamed from: a */
    public final ClientContext mo27262a(Context context) {
        Account a = voo.m40937a(context, this.f47394a.f47682a);
        rzz.m34727a(a, "No account object found for app!");
        String str = this.f47396c.f30764b;
        ClientContext clientContext = new ClientContext();
        clientContext.f30212b = spn.m35897i(context, str);
        clientContext.f30213c = a;
        clientContext.f30215e = str;
        clientContext.f30216f = str;
        for (twt twt : this.f47398e) {
            clientContext.mo17806d(twt.f46779f);
        }
        return clientContext;
    }

    public uey(uih uih, String str, AppIdentity appIdentity, long j, Set set) {
        sdo.m34959a(uih);
        this.f47394a = uih;
        this.f47395b = str;
        sdo.m34959a(appIdentity);
        this.f47396c = appIdentity;
        this.f47397d = j;
        Set unmodifiableSet = Collections.unmodifiableSet(EnumSet.copyOf(set));
        this.f47398e = unmodifiableSet;
        sdo.m34975b(!unmodifiableSet.isEmpty(), "At least one scope is required.");
        sdo.m34975b(!"0".equals(str), String.format("sdkAppId %s is only valid for a full access AuthorizedApp.", str));
        sdo.m34975b(!appIdentity.equals(AppIdentity.f30763a), "Superuser AppIdentity is only valid for a full access AuthorizedApp.");
    }

    /* renamed from: a */
    public final boolean mo27263a() {
        return "0".equals(this.f47395b);
    }

    /* renamed from: a */
    public final boolean mo27264a(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (this.f47398e.contains((twt) it.next())) {
                return true;
            }
        }
        return false;
    }
}
