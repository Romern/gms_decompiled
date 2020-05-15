package p000;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.location.places.internal.PlacesParams;
import java.util.concurrent.TimeoutException;

/* renamed from: bibq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bibq {

    /* renamed from: a */
    public final Context f120154a;

    /* renamed from: b */
    public final bibx f120155b;

    /* renamed from: c */
    public final bibt f120156c;

    /* renamed from: d */
    public final ClientContext f120157d;

    /* renamed from: e */
    private final bhpt f120158e;

    public bibq(Context context, ClientContext clientContext, bibx bibx, bibt bibt, bhpt bhpt) {
        this.f120154a = context;
        this.f120157d = clientContext;
        this.f120158e = bhpt;
        this.f120155b = bibx;
        this.f120156c = bibt;
    }

    /* renamed from: a */
    public static bibq m101917a(Context context, PlacesParams placesParams, bhpt bhpt) {
        ClientContext clientContext = new ClientContext();
        String str = placesParams.f79572b;
        clientContext.f30215e = str;
        clientContext.f30216f = str;
        clientContext.mo17806d(cghh.m145421b());
        clientContext.f30212b = spn.m35897i(context, placesParams.f79572b);
        if (!TextUtils.isEmpty(placesParams.f79574d)) {
            Account account = new Account(placesParams.f79574d, "com.google");
            clientContext.f30214d = account;
            clientContext.f30213c = account;
        }
        bibs bibs = new bibs(context, spn.m35849a(context, placesParams.f79572b, "com.google.android.geo.API_KEY"), placesParams.f79572b, spn.m35895h(context, placesParams.f79572b));
        return new bibq(context, clientContext, new bibx(bibs), new bibt(bibs), bhpt);
    }

    public bibq(Context context, String str, String str2, String str3, ClientContext clientContext, bhpt bhpt) {
        this.f120154a = context;
        this.f120157d = clientContext;
        this.f120158e = bhpt;
        bibs bibs = new bibs(context, str, str2, str3);
        this.f120155b = new bibx(bibs);
        this.f120156c = new bibt(bibs);
    }

    /* renamed from: a */
    public final Object mo64508a(bick bick, PlacesParams placesParams) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Object a = bick.mo64518a();
            if (cgfl.m145007c()) {
                this.f120158e.mo64139a(bick.mo64517a(1, currentTimeMillis, placesParams, a));
            }
            return a;
        } catch (TimeoutException e) {
            if (cgfl.m145007c()) {
                this.f120158e.mo64139a(bick.mo64517a(2, currentTimeMillis, placesParams, (Object) null));
            }
            throw e;
        } catch (VolleyError | gid e2) {
            Throwable th = e2;
            if (cgfl.m145007c()) {
                this.f120158e.mo64139a(bick.mo64517a(3, currentTimeMillis, placesParams, (Object) null));
            }
            throw th;
        }
    }
}
