package p000;

import android.net.Uri;
import android.util.Base64;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.u2f.api.common.KeyHandle;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import com.google.android.gms.fido.u2f.api.common.RegisteredKey;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: xfe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xfe extends xfd {

    /* renamed from: a */
    private final String f52110a;

    /* renamed from: b */
    private final String f52111b;

    public xfe(String str, String str2) {
        bmxy.m108581a(str);
        this.f52110a = str;
        bmxy.m108581a(str2);
        this.f52111b = str2;
    }

    /* renamed from: a */
    private static final String m42809a(String str, String str2, String str3) {
        return new xlw(xlv.WEBAUTHN_GET, str, str2, str3, null).mo18664a().toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo12637b(Object obj) {
        byte[] bArr;
        ByteString bxtx;
        bmxv bmxv;
        FidoAppIdExtension fidoAppIdExtension;
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) obj;
        MessageDigest a = xid.m42997a();
        ArrayList arrayList = new ArrayList();
        List list = publicKeyCredentialRequestOptions.f31784d;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (PublicKeyCredentialDescriptor) list.get(i);
                arrayList.add(new RegisteredKey(new KeyHandle(publicKeyCredentialDescriptor.f31776a, ProtocolVersion.UNKNOWN, publicKeyCredentialDescriptor.f31777b)));
            }
        }
        xym xym = new xym();
        xym.f53368b = publicKeyCredentialRequestOptions.f31782b;
        xym.f53370d = publicKeyCredentialRequestOptions.f31781a;
        xym.f53371e = arrayList;
        xym.f53369c = Uri.parse(publicKeyCredentialRequestOptions.f31783c);
        SignRequestParams a2 = xym.mo30267a();
        ArrayList arrayList2 = new ArrayList(a2.f31941e.size());
        String a3 = m42809a(Base64.encodeToString(a2.f31940d, 11), this.f52110a, this.f52111b);
        byte[] digest = a.digest(a3.getBytes());
        List list2 = a2.f31941e;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            RegisteredKey registeredKey = (RegisteredKey) list2.get(i2);
            KeyHandle keyHandle = registeredKey.f31934a;
            String str = registeredKey.f31935b;
            if (str != null) {
                bArr = a.digest(str.getBytes());
            } else {
                bArr = a.digest(a2.f31939c.toString().getBytes());
            }
            String str2 = registeredKey.f31936c;
            if (str2 == null) {
                bmxv = bmxv.m108566b(a3);
                bxtx = bxtx.m123261a(digest);
            } else {
                bmxv = bmxv.m108566b(m42809a(str2, this.f52110a, this.f52111b));
                bxtx = bxtx.m123261a(a.digest(((String) ((bmyg) bmxv).f131198a).getBytes()));
            }
            arrayList2.add(new xfr(keyHandle, bxtx.m123261a(bArr), bxtx, bmxv));
            AuthenticationExtensions authenticationExtensions = publicKeyCredentialRequestOptions.f31788h;
            if (authenticationExtensions != null) {
                fidoAppIdExtension = authenticationExtensions.f31715a;
            } else {
                fidoAppIdExtension = null;
            }
            if (fidoAppIdExtension != null) {
                byte[] digest2 = a.digest(fidoAppIdExtension.f31756a.getBytes());
                if (!Arrays.equals(digest2, bArr)) {
                    arrayList2.add(new xfr(keyHandle, bxtx.m123261a(digest2), bxtx, bmxv));
                }
            }
        }
        Double d = a2.f31938b;
        return new xfp(d != null ? Long.valueOf((long) (d.doubleValue() * 1000.0d)) : null, arrayList2);
    }
}
