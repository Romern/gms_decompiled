package p000;

import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;

/* renamed from: xpv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xpv extends rjs {

    /* renamed from: a */
    public static final AuthenticatorErrorResponse f52879a;

    /* renamed from: b */
    public static final AuthenticatorErrorResponse f52880b;

    /* renamed from: c */
    public static final AuthenticatorErrorResponse f52881c;

    /* renamed from: d */
    public static final AuthenticatorErrorResponse f52882d;

    /* renamed from: e */
    public static final AuthenticatorErrorResponse f52883e;

    /* renamed from: f */
    public static final AuthenticatorErrorResponse f52884f;

    /* renamed from: g */
    public static final AuthenticatorErrorResponse f52885g;

    /* renamed from: h */
    public static final AuthenticatorErrorResponse f52886h;

    /* renamed from: i */
    public static final AuthenticatorErrorResponse f52887i;

    /* renamed from: j */
    public static final AuthenticatorErrorResponse f52888j;

    /* renamed from: k */
    public static final AuthenticatorErrorResponse f52889k;

    /* renamed from: l */
    public static final AuthenticatorErrorResponse f52890l;

    /* renamed from: m */
    public static final AuthenticatorErrorResponse f52891m;

    /* renamed from: n */
    public static final AuthenticatorErrorResponse f52892n;

    /* renamed from: o */
    public static final AuthenticatorErrorResponse f52893o;

    /* renamed from: p */
    public static final AuthenticatorErrorResponse f52894p;

    /* renamed from: q */
    public static final AuthenticatorErrorResponse f52895q;

    /* renamed from: r */
    public static final AuthenticatorErrorResponse f52896r;

    /* renamed from: s */
    public static final AuthenticatorErrorResponse f52897s;

    /* renamed from: t */
    public static final AuthenticatorErrorResponse f52898t;

    /* renamed from: u */
    public static final AuthenticatorErrorResponse f52899u;

    /* renamed from: v */
    public static final AuthenticatorErrorResponse f52900v;

    /* renamed from: w */
    public static final AuthenticatorErrorResponse f52901w;

    /* renamed from: x */
    static final bnhe f52902x;

    static {
        xpf xpf = new xpf();
        xpf.mo30001a(ErrorCode.NOT_SUPPORTED_ERR);
        f52879a = xpf.mo30000a();
        xpf xpf2 = new xpf();
        xpf2.mo30001a(ErrorCode.INVALID_STATE_ERR);
        f52880b = xpf2.mo30000a();
        xpf xpf3 = new xpf();
        xpf3.mo30001a(ErrorCode.SECURITY_ERR);
        f52881c = xpf3.mo30000a();
        xpf xpf4 = new xpf();
        xpf4.mo30001a(ErrorCode.NETWORK_ERR);
        f52882d = xpf4.mo30000a();
        xpf xpf5 = new xpf();
        xpf5.mo30001a(ErrorCode.ABORT_ERR);
        f52883e = xpf5.mo30000a();
        xpf xpf6 = new xpf();
        xpf6.mo30001a(ErrorCode.TIMEOUT_ERR);
        f52884f = xpf6.mo30000a();
        xpf xpf7 = new xpf();
        xpf7.mo30001a(ErrorCode.ENCODING_ERR);
        f52885g = xpf7.mo30000a();
        xpf xpf8 = new xpf();
        xpf8.mo30001a(ErrorCode.UNKNOWN_ERR);
        f52886h = xpf8.mo30000a();
        xpf xpf9 = new xpf();
        xpf9.mo30001a(ErrorCode.CONSTRAINT_ERR);
        f52887i = xpf9.mo30000a();
        xpf xpf10 = new xpf();
        xpf10.mo30001a(ErrorCode.DATA_ERR);
        f52888j = xpf10.mo30000a();
        xpf xpf11 = new xpf();
        xpf11.mo30001a(ErrorCode.NOT_ALLOWED_ERR);
        f52889k = xpf11.mo30000a();
        xpf xpf12 = new xpf();
        xpf12.mo30001a(ErrorCode.ATTESTATION_NOT_PRIVATE_ERR);
        f52890l = xpf12.mo30000a();
        xpf xpf13 = new xpf();
        xpf13.mo30001a(ErrorCode.INVALID_STATE_ERR);
        xpf13.f52860a = "A request is already pending.";
        f52891m = xpf13.mo30000a();
        xpf xpf14 = new xpf();
        xpf14.mo30001a(ErrorCode.SECURITY_ERR);
        xpf14.f52860a = "This is an Invalid Domain.";
        f52892n = xpf14.mo30000a();
        xpf xpf15 = new xpf();
        xpf15.mo30001a(ErrorCode.INVALID_STATE_ERR);
        xpf15.f52860a = "The user attempted to register an authenticator that contains one of the credentials already registered with the relying party.";
        f52893o = xpf15.mo30000a();
        xpf xpf16 = new xpf();
        xpf16.mo30001a(ErrorCode.INVALID_STATE_ERR);
        xpf16.f52860a = "The user attempted to use an authenticator that recognized none of the provided credentials.";
        f52894p = xpf16.mo30000a();
        xpf xpf17 = new xpf();
        xpf17.mo30001a(ErrorCode.NOT_SUPPORTED_ERR);
        xpf17.f52860a = "Not implemented.";
        f52895q = xpf17.mo30000a();
        xpf xpf18 = new xpf();
        xpf18.mo30001a(ErrorCode.NOT_SUPPORTED_ERR);
        xpf18.f52860a = "Resident credentials or empty 'allowCredentials' lists are not supported at this time.";
        f52896r = xpf18.mo30000a();
        xpf xpf19 = new xpf();
        xpf19.mo30001a(ErrorCode.NOT_SUPPORTED_ERR);
        xpf19.f52860a = "The specified `userVerification` requirement cannot be fulfilled by this device unless the device is secured with a screen lock.";
        f52897s = xpf19.mo30000a();
        xpf xpf20 = new xpf();
        xpf20.mo30001a(ErrorCode.NOT_SUPPORTED_ERR);
        xpf20.f52860a = "None of the algorithms specified in `pubKeyCredParams` are supported by this device.";
        f52898t = xpf20.mo30000a();
        xpf xpf21 = new xpf();
        xpf21.mo30001a(ErrorCode.NOT_SUPPORTED_ERR);
        xpf21.f52860a = "Use of an empty `allowCredentials` list is not supported on this device.";
        f52899u = xpf21.mo30000a();
        xpf xpf22 = new xpf();
        xpf22.mo30001a(ErrorCode.NOT_ALLOWED_ERR);
        xpf22.f52860a = "User verification is cancelled by the user.";
        f52900v = xpf22.mo30000a();
        xpf xpf23 = new xpf();
        xpf23.mo30001a(ErrorCode.NOT_ALLOWED_ERR);
        xpf23.f52860a = "Error occurred while using this authenticator.";
        f52901w = xpf23.mo30000a();
        bnha bnha = new bnha();
        bnha.mo67695b(34000, f52879a);
        bnha.mo67695b(34001, f52880b);
        bnha.mo67695b(34002, f52881c);
        bnha.mo67695b(34003, f52882d);
        bnha.mo67695b(34004, f52883e);
        bnha.mo67695b(34005, f52884f);
        bnha.mo67695b(34006, f52885g);
        bnha.mo67695b(34007, f52886h);
        bnha.mo67695b(34008, f52887i);
        bnha.mo67695b(34009, f52888j);
        bnha.mo67695b(34010, f52889k);
        bnha.mo67695b(34011, f52890l);
        bnha.mo67695b(34012, f52891m);
        bnha.mo67695b(34013, f52892n);
        bnha.mo67695b(34014, f52893o);
        bnha.mo67695b(34015, f52894p);
        bnha.mo67695b(34016, f52895q);
        bnha.mo67695b(34017, f52896r);
        bnha.mo67695b(34018, f52897s);
        bnha.mo67695b(34019, f52898t);
        bnha.mo67695b(34020, f52899u);
        bnha.mo67695b(34021, f52900v);
        bnha.mo67695b(34022, f52901w);
        f52902x = bnha.mo67618b();
    }

    /* renamed from: a */
    public static AuthenticatorErrorResponse m43283a(int i) {
        bnhe bnhe = f52902x;
        Integer valueOf = Integer.valueOf(i);
        if (bnhe.containsKey(valueOf)) {
            return (AuthenticatorErrorResponse) f52902x.get(valueOf);
        }
        xpf xpf = new xpf();
        xpf.mo30001a(ErrorCode.UNKNOWN_ERR);
        return xpf.mo30000a();
    }
}
