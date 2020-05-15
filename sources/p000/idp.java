package p000;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

/* renamed from: idp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class idp extends aaab {

    /* renamed from: a */
    public static final Logger f20767a = new Logger("GoogleSilentSignIn", new String[0]);

    /* renamed from: b */
    public final ide f20768b;

    /* renamed from: c */
    private final GoogleSignInOptions f20769c;

    /* renamed from: d */
    private final String f20770d;

    /* renamed from: e */
    private final qws f20771e;

    public idp(ide ide, Context context, GoogleSignInOptions googleSignInOptions, String str) {
        super(91, "GoogleSilentSignIn");
        this.f20768b = ide;
        this.f20770d = str;
        this.f20769c = googleSignInOptions;
        this.f20771e = new qws(context, "ANDROID_AUTH", null);
    }

    /* renamed from: a */
    public final void mo12947a(int i) {
        if (((Boolean) icl.f20738c.mo58455c()).booleanValue()) {
            this.f20771e.mo24333a(idx.m15307a(this.f20770d, 2, Integer.valueOf(i), this.f20769c)).mo24327b();
        }
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        bqga.m112781a(bqga.m112773a(new ied(context, this.f20769c, this.f20770d, bmvz.f131120a).mo7073a(), (long) ((Integer) icl.f20739d.mo58455c()).intValue(), TimeUnit.SECONDS, snp.m35703a(1, 9)), new ido(this), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f20768b.mo12919a(null, status);
    }
}
