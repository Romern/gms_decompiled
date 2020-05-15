package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

/* renamed from: ysx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ysx extends ysb {

    /* renamed from: i */
    public final yss f54565i;

    public ysx(Context context, yss yss) {
        super(context, yss);
        this.f54565i = yss;
    }

    /* renamed from: a */
    public final void mo30719a(String str, int i) {
        yss yss = this.f54565i;
        if (i == 0) {
            i = yss.mo30735a(str);
        }
        ClientContext a = ClientContext.m22584a(yss.f54559a, i, yss.f54560b, str);
        if (a != null) {
            yss.mo30736a(a);
        }
    }

    /* renamed from: c */
    public final Status mo30730c(String str, Set set) {
        long j;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!((Scope) it.next()).f30106b.isEmpty()) {
                yss yss = this.f54528c;
                ClientContext a = ClientContext.m22584a(yss.f54559a, yss.mo30735a(str), yss.f54560b, str);
                if (a == null || yss.mo30738b(a)) {
                    a = new ClientContext();
                    a.f30212b = yss.mo30735a(str);
                    a.f30215e = str;
                    a.f30216f = str;
                    Account account = yss.f54560b;
                    a.f30214d = account;
                    a.f30213c = account;
                }
                Iterator it2 = set.iterator();
                boolean z = false;
                while (it2.hasNext()) {
                    Scope scope = (Scope) it2.next();
                    if (!a.mo17800a(scope) && !a.mo17800a(ydl.m43848a(scope))) {
                        a.mo17806d(scope.f30106b);
                        z = true;
                    }
                }
                try {
                    String b = new sie(a, null).mo25586b(this.f54527b);
                    yss yss2 = this.f54528c;
                    String str2 = a.f30215e;
                    long currentTimeMillis = System.currentTimeMillis();
                    Long l = (Long) yss2.f54561c.get(str2);
                    if (l != null) {
                        j = l.longValue();
                    } else {
                        j = 0;
                    }
                    if (currentTimeMillis - j > cdzd.f182003a.mo6606a().mo78562ab()) {
                        a.mo17798a("com.google.android.gms.fitness.auth.token", b);
                        a.mo17798a("com.google.android.gms.fitness.auth.time", String.valueOf(System.currentTimeMillis()));
                        a.mo17796a(yss2.f54559a);
                    } else {
                        yss2.mo30737a(b, a.f30215e);
                    }
                    return Status.f30107a;
                } catch (UserRecoverableAuthException e) {
                    Intent a2 = e.mo7366a();
                    if (a2 == null) {
                        bnsl bnsl = (bnsl) ysb.f54526a.mo68387b();
                        bnsl.mo68437a(e);
                        bnsl.mo68432a("ysb", "a", 172, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("User recoverable auth exception with no intent");
                        return ysb.f54551h;
                    }
                    bnsl bnsl2 = (bnsl) ysb.f54526a.mo68388c();
                    bnsl2.mo68437a(e);
                    bnsl2.mo68432a("ysb", "a", 177, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("User recoverable auth exception");
                    return new Status(5000, "Application needs OAuth consent from the user", PendingIntent.getActivity(this.f54527b, 0, a2, 134217728));
                } catch (gid | IOException e2) {
                    bnsl bnsl3 = (bnsl) ysb.f54526a.mo68388c();
                    bnsl3.mo68437a(e2);
                    bnsl3.mo68432a("ysb", "a", 180, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68405a("Auth related exception");
                    if (this.f54528c.mo30738b(a)) {
                        this.f54528c.mo30736a(a);
                        return ysb.f54551h;
                    } else if (z) {
                        return ysb.f54551h;
                    } else {
                        return Status.f30107a;
                    }
                }
            }
        }
        return Status.f30107a;
    }
}
