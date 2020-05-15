package p000;

import android.content.Context;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import com.google.android.libraries.messaging.lighter.model.ContactId;

/* renamed from: azbt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azbt implements bbpn {

    /* renamed from: a */
    private final Context f98922a;

    public azbt(Context context) {
        this.f98922a = context;
    }

    /* renamed from: a */
    private static final int m85220a(ContactId.ContactType contactType) {
        ContactId.ContactType contactType2 = ContactId.ContactType.UNKNOWN;
        int ordinal = contactType.ordinal();
        if (ordinal == 1) {
            return 1;
        }
        if (ordinal != 2) {
            return ordinal != 4 ? 0 : 8;
        }
        return 7;
    }

    /* renamed from: a */
    public final bqgg mo54581a(bcoh bcoh, boolean z) {
        bmxv a = azbj.m85193a(this.f98922a).mo54570j().mo56668a(bcoh);
        ContactId e = bcoh.mo57058b().mo57074e();
        if (!a.mo66813a()) {
            azho.m85729a(azfo.m85593a(this.f98922a), new chuw(chuv.f189223j), null, new LocalEntityId(e.mo60492a(), m85220a(e.mo60494c()), e.mo60493b()));
            return bqga.m112775a((Object) null);
        } else if (!z) {
            return bqga.m112775a((bcoz) a.mo66814b());
        } else {
            azfo a2 = azfo.m85593a(this.f98922a);
            chuw chuw = new chuw(chuv.f189223j);
            bcoh.mo57059c().mo73780k();
            byte[] a3 = bqce.m112561a(((bcoz) a.mo66814b()).mo57131a());
            ContactId.ContactType c = e.mo60494c();
            ContactId.ContactType contactType = ContactId.ContactType.UNKNOWN;
            int ordinal = c.ordinal();
            int i = 2;
            if (ordinal != 1) {
                i = ordinal != 2 ? ordinal != 4 ? 0 : 1 : 3;
            }
            azho.m85729a(a2, chuw, new azcs(a3, i), new LocalEntityId(e.mo60492a(), m85220a(e.mo60494c()), e.mo60493b()));
            return bqga.m112775a((Object) null);
        }
    }
}
