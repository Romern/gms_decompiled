package p000;

import com.felicanetworks.mfc.mfi.MfiClient;
import com.felicanetworks.mfc.mfi.User;
import java.util.concurrent.CountDownLatch;

/* renamed from: ciky */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciky extends cikl {

    /* renamed from: a */
    private final brhc f190574a;

    /* renamed from: b */
    private final String f190575b;

    /* renamed from: c */
    private final brep f190576c;

    public ciky(String str, brhc brhc, brep brep) {
        super(brep);
        this.f190574a = brhc;
        this.f190575b = str;
        this.f190576c = brep;
    }

    /* renamed from: a */
    public final void mo49937a(MfiClient mfiClient, User user) {
        cikv cikv = new cikv(this.f190576c);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            user.issueCard(this.f190575b, new cikx(cikv, countDownLatch));
        } catch (IllegalArgumentException e) {
            this.f190574a.mo69532a("felica", "The input argument is invalid", e);
            countDownLatch.countDown();
            this.f190576c.mo49931a(new bres(bret.UNKNOWN_FELICA_ERROR));
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e2) {
        }
    }
}
