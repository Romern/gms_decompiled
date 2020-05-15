package p000;

import android.accounts.Account;
import android.util.Pair;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bjtq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjtq implements Response.Listener {

    /* renamed from: a */
    public final Activity f123299a;

    /* renamed from: b */
    public final bwgw f123300b;

    /* renamed from: c */
    public final Account f123301c;

    /* renamed from: d */
    public final RequestQueue f123302d;

    /* renamed from: e */
    public final int f123303e;

    /* renamed from: f */
    public final byte[] f123304f;

    /* renamed from: g */
    public final String f123305g;

    /* renamed from: h */
    public final Response.ErrorListener f123306h;

    /* renamed from: i */
    private final bkab f123307i;

    public bjtq(Activity activity, bwgw bwgw, Account account, RequestQueue requestQueue, int i, byte[] bArr, String str, bkab bkab, Response.ErrorListener errorListener) {
        this.f123299a = activity;
        this.f123300b = bwgw;
        this.f123301c = account;
        this.f123302d = requestQueue;
        this.f123303e = i;
        this.f123304f = bArr;
        this.f123305g = str;
        this.f123307i = bkab;
        this.f123306h = errorListener;
    }

    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        Pair pair = (Pair) obj;
        if ((((bwgg) pair.second).f159196a & 1) == 0) {
            JSONObject jSONObject = null;
            try {
                jSONObject = new JSONObject(((bwgg) pair.second).f159198c);
            } catch (JSONException e) {
                bkab bkab = this.f123307i;
                bkab.f123721a.mo65708b(false);
                bkaf bkaf = bkab.f123721a;
                bkaf.mo65702a(bkaf.f123765b.getString(C0126R.string.wallet_uic_network_error_title), bkab.f123721a.f123765b.getString(C0126R.string.wallet_uic_network_error_message), (String) null);
            }
            this.f123307i.mo65686a(jSONObject);
            return;
        }
        bkab bkab2 = this.f123307i;
        bmav bmav = ((bwgg) pair.second).f159197b;
        if (bmav == null) {
            bmav = bmav.f128500h;
        }
        bkab2.f123721a.mo65708b(false);
        bkaf bkaf2 = bkab2.f123721a;
        bkaf2.mo65702a(bkaf2.f123765b.getString(C0126R.string.wallet_uic_title_possibly_recoverable_error_dialog), bmav.f128503b, bmav.f128506e);
    }
}
