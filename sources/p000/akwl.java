package p000;

import com.google.android.gms.fido.fido2.api.common.ErrorCode;

/* renamed from: akwl */
final /* synthetic */ class akwl implements aubt {

    /* renamed from: a */
    private final akwo f73004a;

    /* renamed from: b */
    private final Integer f73005b;

    public akwl(akwo akwo, Integer num) {
        this.f73004a = akwo;
        this.f73005b = num;
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        this.f73004a.mo39931a(ErrorCode.UNKNOWN_ERR, "Could not create an intent for Fido2 signature", this.f73005b.intValue());
    }
}
