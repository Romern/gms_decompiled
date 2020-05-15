package p000;

import android.content.Context;
import com.google.firebase.auth.EmailAuthCredential;

/* renamed from: brng */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brng extends brmj {

    /* renamed from: g */
    private final EmailAuthCredential f143012g;

    public brng(String str, String str2, brps brps, EmailAuthCredential emailAuthCredential, brpp brpp) {
        super(str, str2, brps, brpp, "SignInWithCredential");
        this.f143012g = emailAuthCredential;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69748a(Context context, brph brph) {
        EmailAuthCredential emailAuthCredential = this.f143012g;
        brpj brpj = this.f142967a;
        sdo.m34959a(emailAuthCredential);
        sdo.m34959a(brpj);
        if (emailAuthCredential.f152400e) {
            brph.mo69756a(emailAuthCredential.f152399d, new brns(brph, emailAuthCredential, brpj));
        } else {
            brph.mo69753a(new brqc(emailAuthCredential, null), brpj);
        }
    }
}
