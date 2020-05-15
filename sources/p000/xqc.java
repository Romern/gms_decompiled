package p000;

import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement;
import java.util.List;

/* renamed from: xqc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xqc {

    /* renamed from: a */
    public Double f52905a;

    /* renamed from: b */
    public List f52906b;

    /* renamed from: c */
    public Integer f52907c;

    /* renamed from: d */
    public TokenBinding f52908d;

    /* renamed from: e */
    public UserVerificationRequirement f52909e;

    /* renamed from: f */
    public AuthenticationExtensions f52910f;

    /* renamed from: g */
    private byte[] f52911g;

    /* renamed from: h */
    private String f52912h;

    /* renamed from: a */
    public final PublicKeyCredentialRequestOptions mo30030a() {
        byte[] bArr = this.f52911g;
        Double d = this.f52905a;
        String str = this.f52912h;
        List list = this.f52906b;
        Integer num = this.f52907c;
        TokenBinding tokenBinding = this.f52908d;
        UserVerificationRequirement userVerificationRequirement = this.f52909e;
        return new PublicKeyCredentialRequestOptions(bArr, d, str, list, num, tokenBinding, userVerificationRequirement != null ? userVerificationRequirement.f31811d : null, this.f52910f);
    }

    /* renamed from: a */
    public final void mo30031a(String str) {
        sdo.m34959a((Object) str);
        this.f52912h = str;
    }

    /* renamed from: a */
    public final void mo30032a(byte[] bArr) {
        this.f52911g = (byte[]) sdo.m34959a(bArr);
    }
}
