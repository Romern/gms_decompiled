package p000;

import android.accounts.Account;
import android.content.Context;
import java.util.Collection;
import java.util.List;

/* renamed from: hpl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hpl implements hep {

    /* renamed from: a */
    private final Context f20169a;

    /* renamed from: b */
    private final String f20170b;

    /* renamed from: c */
    private final bngx f20171c;

    public hpl(Context context, String str, List list) {
        sdo.m34959a(context);
        this.f20169a = context;
        sdo.m34977c(str);
        this.f20170b = str;
        this.f20171c = bngx.m109368a((Collection) list);
    }

    /* renamed from: a */
    public final adbj mo12290a() {
        return adbj.AUTH_API_CREDENTIALS_INTERNAL_LIST_PASSWORD_SIGN_IN_CREDENTIALS;
    }

    /* renamed from: a */
    public final bqgg mo12291a(hez hez) {
        bmxv a = qqt.m32666a(this.f20169a, this.f20170b);
        if (a.mo66813a()) {
            bngs j = bngx.m109377j();
            bnre i = this.f20171c.listIterator();
            while (i.hasNext()) {
                try {
                    j.mo67668c(heb.m14255a((Account) i.next()));
                } catch (adbe e) {
                }
            }
            return bqdx.m112673a(new hoh(this.f20169a, (String) a.mo66814b(), j.mo67664a(), true, bnon.f131923a).mo12291a(hez), hpi.f20166a, bqfb.INSTANCE);
        }
        throw adbe.m50106a(28442);
    }
}
