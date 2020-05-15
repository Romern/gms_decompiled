package p000;

import com.felicanetworks.mfc.mfi.MfiClient;
import com.felicanetworks.mfc.mfi.User;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: cikd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cikd implements brfa {

    /* renamed from: a */
    final /* synthetic */ JSONObject f190501a;

    /* renamed from: b */
    final /* synthetic */ CountDownLatch f190502b;

    /* renamed from: c */
    final /* synthetic */ cikh f190503c;

    public cikd(cikh cikh, JSONObject jSONObject, CountDownLatch countDownLatch) {
        this.f190503c = cikh;
        this.f190501a = jSONObject;
        this.f190502b = countDownLatch;
    }

    /* renamed from: a */
    public final void mo49936a(bret bret) {
        int i = cikh.f190511g;
        this.f190503c.f190515d.f190484a = new bres(bret);
        this.f190502b.countDown();
    }

    /* renamed from: a */
    public final void mo49937a(MfiClient mfiClient, User user) {
        int i = cikh.f190511g;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            user.issueCard(this.f190501a.getString("linkageData"), new cikc(this, countDownLatch));
        } catch (JSONException e) {
            String jSONException = e.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(jSONException).length() + 43);
            sb.append("executeIssueCard JSONException Occerd (e=");
            sb.append(jSONException);
            sb.append(").");
            sb.toString();
            this.f190503c.f190515d.f190484a = new bres(cijw.QUICPAY_JSON_ERROR);
            countDownLatch.countDown();
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e2) {
            this.f190503c.f190515d.f190484a = new bres(cijw.QUICPAY_UNKNOWN_ERROR);
        }
        this.f190502b.countDown();
    }
}
