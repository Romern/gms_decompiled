package p000;

import android.accounts.Account;
import android.content.Context;
import android.database.Cursor;
import java.util.Collection;
import java.util.List;

/* renamed from: adel */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adel implements adeo {

    /* renamed from: a */
    private static final adfs f61496a = new adfs("DevManagerRouterBackendClient");

    /* renamed from: b */
    private final Context f61497b;

    /* renamed from: c */
    private final adeo f61498c;

    public adel(Context context, adeo adeo) {
        this.f61497b = context;
        this.f61498c = adeo;
    }

    /* renamed from: a */
    public final bqgg mo33390a(Account account, Collection collection) {
        return this.f61498c.mo33390a(account, collection);
    }

    /* renamed from: a */
    public final bqgg mo33391a(camj camj, Account account) {
        return this.f61498c.mo33391a(camj, account);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x006f  */
    /* renamed from: a */
    public final bqgg mo33392a(String str, int i, int i2, List list) {
        btib btib;
        try {
            Cursor query = this.f61497b.getContentResolver().query(adky.f62096a.buildUpon().appendPath("getAppSplits").appendQueryParameter("packageName", str).appendQueryParameter("versionCode", Integer.toString(i)).build(), new String[]{"appSplits"}, null, null, null);
            if (query != null) {
                if (query.moveToFirst()) {
                    f61496a.mo33423a("AIA is sideloaded: %s", str);
                    btib = (btib) bxvk.m124016a(btib.f148936m, query.getBlob(0), bxus.m123743b());
                    if (btib != null) {
                        return this.f61498c.mo33392a(str, i, i2, list);
                    }
                    return bqga.m112775a(btib);
                }
            }
            f61496a.mo33423a("AIA is not sideloaded, checking if live in prod: %s", str);
            btib = null;
            if (btib != null) {
            }
        } catch (bxwf e) {
            f61496a.mo33425a(e, "failed GetAppSplitsResponse proto is invalid", new Object[0]);
            throw new chux(chuv.f189228o);
        }
    }

    /* renamed from: a */
    public final bqgg mo33393a(byte[] bArr, Account account, camh camh, Collection collection) {
        if (!cepl.f183185a.mo6606a().mo79538i()) {
            return this.f61498c.mo33393a(bArr, account, camh, collection);
        }
        f61496a.mo33423a("Domain filter fallback is disabled.", new Object[0]);
        return bqga.m112775a(btih.f148964m);
    }
}
