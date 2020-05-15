package p000;

import com.google.android.gms.fido.authenticator.autoenroll.FidoEnrollmentIntentOperation;
import java.util.concurrent.CountDownLatch;

/* renamed from: xbq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xbq implements xbw {

    /* renamed from: a */
    final /* synthetic */ CountDownLatch f51884a;

    /* renamed from: b */
    final /* synthetic */ FidoEnrollmentIntentOperation f51885b;

    public xbq(FidoEnrollmentIntentOperation fidoEnrollmentIntentOperation, CountDownLatch countDownLatch) {
        this.f51885b = fidoEnrollmentIntentOperation;
        this.f51884a = countDownLatch;
    }

    /* renamed from: a */
    public final void mo29619a() {
        FidoEnrollmentIntentOperation.f31633a.mo25412b("Enrolled a software key.", new Object[0]);
        this.f51885b.mo18634a(wzu.KEY_TYPE_SOFTWARE);
        this.f51884a.countDown();
    }

    /* renamed from: a */
    public final void mo29620a(Exception exc) {
        FidoEnrollmentIntentOperation.f31633a.mo25418e("Failed to auto-enroll a software key.", new Object[0]);
        this.f51885b.mo18635a(wzu.KEY_TYPE_SOFTWARE, exc);
        this.f51884a.countDown();
    }
}
