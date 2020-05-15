package p000;

import com.felicanetworks.mfc.mfi.Card;
import com.felicanetworks.mfc.mfi.MfiClient;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.felicanetworks.mfc.mfi.User;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: cijq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cijq implements brfa {

    /* renamed from: a */
    final /* synthetic */ brep f190452a;

    /* renamed from: b */
    final /* synthetic */ JSONObject f190453b;

    /* renamed from: c */
    final /* synthetic */ Card f190454c;

    public cijq(brep brep, JSONObject jSONObject, Card card) {
        this.f190452a = brep;
        this.f190453b = jSONObject;
        this.f190454c = card;
    }

    /* renamed from: a */
    public final void mo49936a(bret bret) {
        Integer num = cijs.f190456a;
        new Object[1][0] = bret.name();
        this.f190452a.mo49931a(new bres(bret));
    }

    /* renamed from: a */
    public final void mo49937a(MfiClient mfiClient, User user) {
        Integer num = cijs.f190456a;
        try {
            srn srn = atgf.f90279a;
            String string = ((JSONObject) this.f190453b.get("dynamicCardData")).getString("linkageData");
            cikh cikh = new cikh();
            Card card = this.f190454c;
            cikh.f190517f = new cijx();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            try {
                card.delete(string, new cikg(cikh, countDownLatch));
            } catch (MfiClientException e) {
                String exc = e.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(exc).length() + 43);
                sb.append("executeDeleteMfiCard Exception Occerd (e=");
                sb.append(exc);
                sb.append(").");
                sb.toString();
                cikh.f190517f.f190484a = new bres(bret.m113949a(e));
                countDownLatch.countDown();
            }
            try {
                countDownLatch.await();
            } catch (InterruptedException e2) {
                cikh.f190517f.f190484a = new bres(cijw.QUICPAY_UNKNOWN_ERROR);
            }
            cijx cijx = cikh.f190517f;
            bres bres = cijx.f190484a;
            if (bres != null) {
                String valueOf = String.valueOf(bres.f142689a);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 40);
                sb2.append("deleteCard delete#onError called(error:");
                sb2.append(valueOf);
                sb2.append(")");
                sb2.toString();
                this.f190452a.mo49931a(cijx.f190484a);
                return;
            }
            this.f190452a.mo49932a((Object) null);
        } catch (JSONException e3) {
            String valueOf2 = String.valueOf(e3.toString());
            if (valueOf2.length() == 0) {
                new String("JSON error occurred ");
            } else {
                "JSON error occurred ".concat(valueOf2);
            }
            this.f190452a.mo49931a(new bres(cijw.QUICPAY_JSON_ERROR));
        }
    }
}
