package p000;

import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: idl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class idl extends aaab {

    /* renamed from: a */
    protected static final sek f20761a = new sek("Auth.Api.SignIn", "BaseGoogleSignInOperation");

    /* renamed from: b */
    protected final String f20762b;

    /* renamed from: c */
    protected final GoogleSignInOptions f20763c;

    /* renamed from: d */
    protected final ide f20764d;

    public idl(ide ide, GoogleSignInOptions googleSignInOptions, String str, String str2) {
        super(91, str2);
        sdo.m34959a(ide);
        this.f20764d = ide;
        this.f20763c = googleSignInOptions;
        sdo.m34977c(str);
        this.f20762b = str;
    }
}
