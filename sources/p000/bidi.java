package p000;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.location.places.internal.PlacesParams;

/* renamed from: bidi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bidi {

    /* renamed from: a */
    public final Context f120298a;

    /* renamed from: b */
    public final String f120299b;

    /* renamed from: c */
    private boolean f120300c = false;

    /* renamed from: d */
    private String f120301d;

    /* renamed from: e */
    private String f120302e;

    /* renamed from: f */
    private boolean f120303f = false;

    /* renamed from: g */
    private int f120304g;

    /* renamed from: h */
    private sfr f120305h;

    public bidi(Context context, String str) {
        this.f120298a = context;
        this.f120299b = str;
    }

    /* renamed from: a */
    private final void m102001a(ClientContext clientContext, PlacesParams placesParams, String str) {
        String str2 = placesParams.f79572b;
        clientContext.f30215e = str2;
        clientContext.f30216f = str2;
        clientContext.mo17806d(str);
        clientContext.f30212b = mo64543a(placesParams.f79572b);
        if (!TextUtils.isEmpty(placesParams.f79574d)) {
            Account account = new Account(placesParams.f79574d, "com.google");
            clientContext.f30214d = account;
            clientContext.f30213c = account;
        }
    }

    /* renamed from: b */
    public final synchronized bibq mo64546b(PlacesParams placesParams, bhpt bhpt) {
        ClientContext clientContext;
        if (!this.f120300c) {
            this.f120301d = spn.m35895h(this.f120298a, placesParams.f79572b);
            this.f120302e = spn.m35849a(this.f120298a, placesParams.f79572b, "com.google.android.geo.API_KEY");
            this.f120300c = true;
        }
        clientContext = new ClientContext();
        m102001a(clientContext, placesParams, cghh.m145421b());
        return new bibq(this.f120298a, this.f120302e, placesParams.f79572b, this.f120301d, clientContext, bhpt);
    }

    /* renamed from: a */
    public final synchronized int mo64543a(String str) {
        if (!this.f120303f) {
            this.f120304g = spn.m35897i(this.f120298a, str);
            this.f120303f = true;
        }
        return this.f120304g;
    }

    /* renamed from: a */
    public final synchronized biam mo64544a(PlacesParams placesParams, bhpt bhpt) {
        ClientContext clientContext;
        if (!this.f120300c) {
            this.f120301d = spn.m35895h(this.f120298a, placesParams.f79572b);
            this.f120302e = spn.m35849a(this.f120298a, placesParams.f79572b, "com.google.android.geo.API_KEY");
            this.f120300c = true;
        }
        clientContext = new ClientContext();
        m102001a(clientContext, placesParams, cggs.m145359b());
        return new biam(this.f120298a, this.f120302e, clientContext, placesParams.f79572b, this.f120301d, bhpt);
    }

    /* renamed from: a */
    public final synchronized sfr mo64545a(PlacesParams placesParams) {
        if (this.f120305h == null) {
            ClientContext clientContext = new ClientContext();
            String str = placesParams.f79572b;
            clientContext.f30215e = str;
            clientContext.f30212b = mo64543a(str);
            this.f120305h = sfr.m35174a(this.f120298a, clientContext);
        }
        return this.f120305h;
    }
}
