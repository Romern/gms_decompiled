package p000;

import com.google.android.gms.fido.authenticator.autoenroll.FidoEnrollmentPersistentIntentOperation;

/* renamed from: xbr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xbr implements xbw {

    /* renamed from: a */
    final /* synthetic */ FidoEnrollmentPersistentIntentOperation f51886a;

    public xbr(FidoEnrollmentPersistentIntentOperation fidoEnrollmentPersistentIntentOperation) {
        this.f51886a = fidoEnrollmentPersistentIntentOperation;
    }

    /* renamed from: a */
    public final void mo29619a() {
        FidoEnrollmentPersistentIntentOperation.f31639d.mo25412b("Successfully registered a custom key to Cryptauth", new Object[0]);
        FidoEnrollmentPersistentIntentOperation fidoEnrollmentPersistentIntentOperation = this.f51886a;
        fidoEnrollmentPersistentIntentOperation.f31641b.mo30193a(fidoEnrollmentPersistentIntentOperation.f31640a, wzs.EVENT_TYPE_ENROLLMENT_SUCCESS, wzu.KEY_TYPE_KEYSTORE, 2, null);
        this.f51886a.f31642c.countDown();
    }

    /* renamed from: a */
    public final void mo29620a(Exception exc) {
        FidoEnrollmentPersistentIntentOperation.f31639d.mo25412b("Failed to register a custom key to Cryptauth", new Object[0]);
        FidoEnrollmentPersistentIntentOperation fidoEnrollmentPersistentIntentOperation = this.f51886a;
        fidoEnrollmentPersistentIntentOperation.f31641b.mo30193a(fidoEnrollmentPersistentIntentOperation.f31640a, wzs.EVENT_TYPE_ENROLLMENT_ERROR, wzu.KEY_TYPE_KEYSTORE, 2, exc);
        this.f51886a.f31642c.countDown();
    }
}
