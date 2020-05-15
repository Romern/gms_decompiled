package p000;

import android.accounts.Account;
import android.content.Intent;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: lpx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lpx implements bqfp {

    /* renamed from: a */
    final /* synthetic */ kbe f26566a;

    /* renamed from: b */
    final /* synthetic */ int f26567b;

    /* renamed from: c */
    final /* synthetic */ lpy f26568c;

    public lpx(lpy lpy, kbe kbe, int i) {
        this.f26568c = lpy;
        this.f26566a = kbe;
        this.f26567b = i;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        lpy lpy = this.f26568c;
        srn srn = lpy.f26569d;
        Intent a = lra.m19562a(lpy.f26159a, (Account) this.f26566a.mo14344a().mo66814b(), (bmxv) obj, this.f26567b);
        if (a != null) {
            this.f26568c.f26159a.startActivityForResult(a, 1002);
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        bnsl bnsl = (bnsl) lpy.f26569d.mo68387b();
        bnsl.mo68437a(th);
        bnsl.mo68432a("lpx", "a", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Could not fetch payment billing customer number");
    }
}
