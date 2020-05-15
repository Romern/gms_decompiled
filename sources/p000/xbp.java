package p000;

import com.google.android.gms.fido.authenticator.autoenroll.FidoEnrollmentIntentOperation;
import java.util.concurrent.CountDownLatch;

/* renamed from: xbp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xbp implements xbw {

    /* renamed from: a */
    final /* synthetic */ CountDownLatch f51882a;

    /* renamed from: b */
    final /* synthetic */ FidoEnrollmentIntentOperation f51883b;

    public xbp(FidoEnrollmentIntentOperation fidoEnrollmentIntentOperation, CountDownLatch countDownLatch) {
        this.f51883b = fidoEnrollmentIntentOperation;
        this.f51882a = countDownLatch;
    }

    /* renamed from: a */
    public final void mo29619a() {
        FidoEnrollmentIntentOperation.f31633a.mo25412b("Enrolled a strongbox key.", new Object[0]);
        this.f51883b.mo18634a(wzu.KEY_TYPE_STRONGBOX);
        this.f51882a.countDown();
    }

    /* renamed from: a */
    public final void mo29620a(Exception exc) {
        FidoEnrollmentIntentOperation.f31633a.mo25418e("Failed to auto-enroll a strongbox key.", new Object[0]);
        this.f51883b.mo18635a(wzu.KEY_TYPE_STRONGBOX, exc);
        this.f51882a.countDown();
    }
}
