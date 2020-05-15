package p000;

import android.accounts.Account;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.RequestFuture;
import com.google.android.chimera.Activity;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: bjtu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjtu implements bjth {

    /* renamed from: a */
    bmaj f123315a;

    /* renamed from: b */
    bjty f123316b;

    /* renamed from: c */
    private final RequestQueue f123317c;

    /* renamed from: d */
    private final Activity f123318d;

    /* renamed from: e */
    private final Account f123319e;

    /* renamed from: f */
    private final bwgw f123320f;

    public bjtu(Activity activity, bwgw bwgw, Account account, RequestQueue requestQueue) {
        this.f123318d = activity;
        this.f123320f = bwgw;
        this.f123319e = account;
        this.f123317c = requestQueue;
    }

    /* renamed from: a */
    public final btwp mo65522a(String str, String str2) {
        throw new UnsupportedOperationException(String.format("%s does not use reference identifiers", "OrchestrationAddressSource"));
    }

    /* renamed from: a */
    public final String mo65523a() {
        return "OrchestrationAddressSource";
    }

    /* renamed from: a */
    public final List mo65524a(CharSequence charSequence, char c, char[] cArr, int i, String str) {
        bwge bwge;
        ArrayList arrayList = new ArrayList();
        String charSequence2 = charSequence.toString();
        if (!(TextUtils.isEmpty(charSequence2) || c == 'Z' || c == 'N')) {
            if (this.f123315a == null) {
                Activity activity = this.f123318d;
                this.f123315a = bjvn.m104710a(activity, bjyw.m104937a(activity));
            }
            if (this.f123316b == null) {
                this.f123316b = bjty.m104626a(this.f123318d, this.f123319e, this.f123320f);
            }
            bxvd da = bwgd.f159176g.mo74144da();
            bmaj bmaj = this.f123315a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwgd bwgd = (bwgd) da.f164949b;
            bmaj.getClass();
            bwgd.f159179b = bmaj;
            int i2 = bwgd.f159178a | 1;
            bwgd.f159178a = i2;
            charSequence2.getClass();
            bwgd.f159178a = i2 | 2;
            bwgd.f159180c = charSequence2;
            String a = bjtv.m104615a(i);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwgd bwgd2 = (bwgd) da.f164949b;
            a.getClass();
            int i3 = bwgd2.f159178a | 4;
            bwgd2.f159178a = i3;
            bwgd2.f159181d = a;
            bwgd2.f159178a = i3 | 8;
            bwgd2.f159182e = 3;
            bmbm bmbm = (bmbm) bjtl.f123281a.get(c, bmbm.PHONE_NUMBER);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwgd bwgd3 = (bwgd) da.f164949b;
            bwgd3.f159183f = bmbm.f128563q;
            bwgd3.f159178a |= 16;
            bwgd bwgd4 = (bwgd) da.mo74062i();
            bjty bjty = this.f123316b;
            RequestFuture newFuture = RequestFuture.newFuture();
            this.f123317c.add(new bjuc("addressentry/getaddresssuggestion", bjty, bwgd4, (bxxk) bwge.f159184b.mo74142c(7), new bjub(newFuture), newFuture));
            try {
                bwge = (bwge) newFuture.get();
            } catch (InterruptedException | ExecutionException e) {
                Log.e("OrchestrationAddressSou", "Exception sending Volley request", e);
                bwge = null;
            }
            if (bwge != null) {
                bxwc bxwc = bwge.f159186a;
                int size = bxwc.size();
                for (int i4 = 0; i4 < size; i4++) {
                    bwgc bwgc = (bwgc) bxwc.get(i4);
                    bmnr bmnr = bwgc.f159174b;
                    if (bmnr == null) {
                        bmnr = bmnr.f130153o;
                    }
                    Spanned fromHtml = Html.fromHtml(bmnr.f130159e);
                    bmbs bmbs = bwgc.f159173a;
                    if (bmbs == null) {
                        bmbs = bmbs.f128609j;
                    }
                    btwp btwp = bmbs.f128615e;
                    if (btwp == null) {
                        btwp = btwp.f152728s;
                    }
                    arrayList.add(new bjtj(charSequence2, btwp, fromHtml, "OrchestrationAddressSource"));
                }
            }
        }
        return arrayList;
    }
}
