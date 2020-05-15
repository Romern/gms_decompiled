package p000;

import android.content.Context;
import android.os.Binder;

/* renamed from: gqm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gqm {

    /* renamed from: a */
    static final bnic f18828a = bnic.m109492a(13, 8, 14, 15);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final gls mo12129a(Context context) {
        sdo.m34959a(context);
        ilq ilq = new ilq(context);
        try {
            ilw.m15682a(Binder.getCallingUid(), ilq);
            return new gls(ilq);
        } catch (SecurityException e) {
            gql gql = new gql(10);
            gql.f18825a = e;
            throw gql.mo12128a();
        }
    }
}
