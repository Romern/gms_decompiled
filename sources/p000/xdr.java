package p000;

import android.content.Context;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.FragmentManager;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.RequestOptions;
import java.security.Signature;
import java.util.List;

/* renamed from: xdr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xdr implements xeh {

    /* renamed from: a */
    public static final Logger f52012a = new Logger(new String[]{"UserVerifier"}, (short[]) null);

    /* renamed from: b */
    private final Context f52013b;

    /* renamed from: c */
    private final FragmentManager f52014c;

    /* renamed from: d */
    private final RequestOptions f52015d;

    /* renamed from: e */
    private final String f52016e;

    /* renamed from: f */
    private final xvu f52017f;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    public xdr(Context context, FragmentManager fragmentManager, RequestOptions requestOptions, String str) {
        bmxy.m108581a(context);
        bmxy.m108581a(fragmentManager);
        bmxy.m108581a(str);
        this.f52013b = context;
        this.f52014c = fragmentManager;
        this.f52016e = str;
        this.f52015d = requestOptions;
        xvo.m43485a(str);
        sdo.m34969a(str, (Object) "Caller name must not be empty");
        xvu xvu = new xvu();
        Bundle bundle = new Bundle();
        bundle.putCharSequence("caller_name", str);
        xvu.setArguments(bundle);
        this.f52017f = xvu;
    }

    /* renamed from: b */
    public static void m42733b(Context context, RequestOptions requestOptions) {
        if (!m42732a(context, requestOptions)) {
            int i = Build.VERSION.SDK_INT;
        }
    }

    /* renamed from: a */
    public static boolean m42732a(Context context, RequestOptions requestOptions) {
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions;
        int i = Build.VERSION.SDK_INT;
        if (cdwo.f181843a.mo6606a().mo78400d() && xez.m42801b(requestOptions)) {
            if (requestOptions instanceof PublicKeyCredentialRequestOptions) {
                publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) requestOptions;
            } else {
                publicKeyCredentialRequestOptions = ((BrowserPublicKeyCredentialRequestOptions) requestOptions).f31734a;
            }
            List list = publicKeyCredentialRequestOptions.f31784d;
            if (list == null || list.isEmpty() || !bnjd.m109596d(list, new xdn(context))) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo29666a(xwj xwj, bmxv bmxv, xeg xeg, xwn xwn) {
        bmxy.m108581a(xeg);
        bmxy.m108581a(xwn);
        f52012a.mo25412b("Verify the user with fingerprint auth", new Object[0]);
        m42733b(this.f52013b, this.f52015d);
        if (m42732a(this.f52013b, this.f52015d) && bmxv.mo66813a()) {
            int i = Build.VERSION.SDK_INT;
            BiometricPrompt build = new BiometricPrompt.Builder(this.f52013b).setTitle(this.f52013b.getString(C0126R.string.verify_your_identity_title)).setDescription(String.format(this.f52013b.getString(C0126R.string.verify_your_identity_description), this.f52016e)).setNegativeButton(this.f52013b.getString(C0126R.string.common_cancel), snp.m35704b(9), new xdo(xwn, xwj, xeg)).build();
            CancellationSignal cancellationSignal = new CancellationSignal();
            cancellationSignal.setOnCancelListener(new xdp(xwn, xwj, xeg));
            build.authenticate(new BiometricPrompt.CryptoObject((Signature) bmxv.mo66814b()), cancellationSignal, snp.m35704b(9), new xdq(xwn, xwj, xeg));
        } else if (this.f52014c.findFragmentByTag("fragment_fingerprint_or_lock_screen") == null) {
            xvu xvu = this.f52017f;
            xvu.f53252a = xeg;
            xvu.f53254c = xwj;
            xvu.f53253b = xwn;
            this.f52014c.beginTransaction().add(this.f52017f, "fragment_fingerprint_or_lock_screen").commit();
        }
    }
}
