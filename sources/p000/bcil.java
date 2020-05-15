package p000;

import android.accounts.Account;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.io.IOException;

/* renamed from: bcil */
final /* synthetic */ class bcil implements bqeg {

    /* renamed from: a */
    private final bcjm f104225a;

    /* renamed from: b */
    private final ContactId f104226b;

    /* renamed from: c */
    private final bqgg f104227c;

    public bcil(bcjm bcjm, ContactId contactId, bqgg bqgg) {
        this.f104225a = bcjm;
        this.f104226b = contactId;
        this.f104227c = bqgg;
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        String str;
        bcjm bcjm = this.f104225a;
        ContactId contactId = this.f104226b;
        bqgg bqgg = this.f104227c;
        if (contactId.mo60494c() != ContactId.ContactType.EMAIL) {
            return bqgg;
        }
        try {
            azbs azbs = bcjm.f104338g;
            try {
                str = gie.m13188a(azbs.f98921a, azoe.m85908a(azbs.f98921a).mo55114a(new Account(contactId.mo60492a(), "com.google").name), "oauth2:https://www.googleapis.com/auth/tachyon", new Bundle());
            } catch (UserRecoverableAuthException e) {
                Log.e("OAuthProvider", "UserRecoverableAuthException encountered, consuming exception");
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                bcjm.f104337f.put(contactId.mo60492a(), str);
                return bqdx.m112673a(bqgg, new bciw(str), bqfb.INSTANCE);
            }
            throw new chux(chuv.f189223j.mo85687a("Failed to generate OAuthToken"));
        } catch (Exception e2) {
            gid gid = new gid(e2);
            if (e2 instanceof IOException) {
                throw new chux(chuv.f189228o.mo85692c(gid));
            }
            throw new chux(chuv.f189223j.mo85692c(gid));
        }
    }
}
