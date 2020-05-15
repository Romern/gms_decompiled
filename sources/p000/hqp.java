package p000;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: hqp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hqp implements hep {

    /* renamed from: a */
    private final hln f20240a;

    public hqp(Context context) {
        this.f20240a = hln.m14581a(context);
    }

    /* renamed from: a */
    public final adbj mo12290a() {
        return adbj.AUTH_API_CREDENTIALS_SET_IS_FIRST_TIME_WELCOME_SHOWN;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: hmu.a(java.lang.String, boolean):quo
     arg types: [java.lang.String, int]
     candidates:
      hmu.a(quo, boolean):boolean
      hmu.a(java.lang.String, boolean):quo */
    /* renamed from: a */
    public final bqgg mo12291a(hez hez) {
        bngx a = heb.m14256a();
        ArrayList arrayList = new ArrayList();
        bnre i = a.listIterator();
        while (i.hasNext()) {
            acyr acyr = (acyr) i.next();
            adbj adbj = adbj.AUTH_API_CREDENTIALS_ACCOUNT_SETTINGS_DATA_PROVIDER_SET_FIRST_TIME_WELCOME_NEEDED;
            hln hln = this.f20240a;
            bqgg a2 = bqdx.m112674a(hln.f19985a.mo12616a(acyr, hmu.m14620a("credentials_need_first_time_welcome", false)), new hle(hln, acyr), bqfb.INSTANCE);
            hez.mo12448a(adbj, a2);
            arrayList.add(a2);
        }
        return bqga.m112785c(arrayList).mo69216a(hqo.f20239a, bqfb.INSTANCE);
    }
}
