package p000;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.BrowserRequestOptions;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.RequestOptions;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;
import com.google.android.gms.fido.fido2.api.common.UvmEntries;
import com.google.android.gms.fido.fido2.api.common.UvmEntry;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.UUID;

/* renamed from: xob */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xob extends xhl implements xre {

    /* renamed from: d */
    public static final sek f52828d = new sek(new String[]{"Fido2ApiImpl"}, (short[]) null);

    /* renamed from: e */
    private static final HashMap f52829e = new HashMap();

    /* renamed from: b */
    public final xoo f52830b;

    /* renamed from: c */
    final xxj f52831c;

    /* renamed from: f */
    private final RequestOptions f52832f;

    /* renamed from: g */
    private final xwn f52833g;

    /* renamed from: h */
    private final xeh f52834h;

    /* renamed from: i */
    private final xdx f52835i;

    /* renamed from: j */
    private final String f52836j;

    /* renamed from: k */
    private final Context f52837k;

    /* renamed from: l */
    private final xwj f52838l;

    private xob(Context context, xwj xwj, RequestOptions requestOptions, xeh xeh, xdx xdx, xoo xoo, xwn xwn, String str, xxj xxj) {
        this.f52832f = requestOptions;
        this.f52830b = xoo;
        this.f52834h = xeh;
        this.f52836j = str;
        bmxy.m108581a(xdx);
        this.f52835i = xdx;
        bmxy.m108581a(xwn);
        this.f52833g = xwn;
        this.f52837k = context;
        this.f52838l = xwj;
        this.f52831c = xxj;
    }

    /* renamed from: a */
    public static synchronized xob m43233a(UUID uuid) {
        xob xob;
        synchronized (xob.class) {
            xob = (xob) f52829e.get(uuid);
        }
        return xob;
    }

    /* renamed from: b */
    public static synchronized xob m43236b(UUID uuid, Context context, xwj xwj, RequestOptions requestOptions, xeh xeh, xdx xdx, xoo xoo, xwn xwn, String str) {
        xxg xxg;
        xob xob;
        RequestOptions requestOptions2 = requestOptions;
        xwn xwn2 = xwn;
        String str2 = str;
        synchronized (xob.class) {
            boolean z = requestOptions2 instanceof PublicKeyCredentialCreationOptions;
            boolean z2 = true;
            if (!z && !(requestOptions2 instanceof BrowserPublicKeyCredentialCreationOptions)) {
                z2 = false;
            }
            bmxy.m108588a(z2);
            if (z) {
                f52828d.mo25412b("process MakeCredentialOptions", new Object[0]);
                PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) requestOptions2;
                xxg xxg2 = new xxg(publicKeyCredentialCreationOptions);
                xwn2.mo30191a(xwj, str2, publicKeyCredentialCreationOptions);
                xxg = xxg2;
            } else {
                f52828d.mo25412b("process BrowserMakeCredentialOptions", new Object[0]);
                BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions = (BrowserPublicKeyCredentialCreationOptions) requestOptions2;
                xxg xxg3 = new xxg(browserPublicKeyCredentialCreationOptions);
                xwn2.mo30191a(xwj, str2, browserPublicKeyCredentialCreationOptions.f31732a);
                xxg = xxg3;
            }
            xob = new xob(context, xwj, requestOptions, xeh, xdx, xoo, xwn, str, xxg);
            f52829e.put(uuid, xob);
        }
        return xob;
    }

    /* renamed from: a */
    public static synchronized xob m43234a(UUID uuid, Context context, xwj xwj, RequestOptions requestOptions, xeh xeh, xdx xdx, xoo xoo, xwn xwn, String str) {
        xxl xxl;
        xob xob;
        RequestOptions requestOptions2 = requestOptions;
        xwn xwn2 = xwn;
        String str2 = str;
        synchronized (xob.class) {
            boolean z = requestOptions2 instanceof PublicKeyCredentialRequestOptions;
            boolean z2 = true;
            if (!z && !(requestOptions2 instanceof BrowserPublicKeyCredentialRequestOptions)) {
                z2 = false;
            }
            bmxy.m108588a(z2);
            if (z) {
                f52828d.mo25412b("process PublicKeyCredentialRequestOptions", new Object[0]);
                PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) requestOptions2;
                xxl xxl2 = new xxl(publicKeyCredentialRequestOptions);
                xwn2.mo30192a(xwj, str2, publicKeyCredentialRequestOptions);
                xxl = xxl2;
            } else {
                f52828d.mo25412b("process BrowserPublicKeyCredentialRequestOptions", new Object[0]);
                BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions = (BrowserPublicKeyCredentialRequestOptions) requestOptions2;
                xxl xxl3 = new xxl(browserPublicKeyCredentialRequestOptions);
                xwn2.mo30192a(xwj, str2, browserPublicKeyCredentialRequestOptions.f31734a);
                xxl = xxl3;
            }
            xob = new xob(context, xwj, requestOptions, xeh, xdx, xoo, xwn, str, xxl);
            f52829e.put(uuid, xob);
        }
        return xob;
    }

    /* renamed from: a */
    private final void m43235a(AuthenticatorErrorResponse authenticatorErrorResponse) {
        this.f52830b.mo14259a(authenticatorErrorResponse);
        this.f52833g.mo30189a(this.f52838l, authenticatorErrorResponse.f31727a.f31755m, authenticatorErrorResponse.f31728b);
    }

    /* renamed from: b */
    public final void mo29964b() {
        RequestOptions requestOptions;
        Boolean bool;
        if (cdxd.f181863a.mo6606a().mo78412a() && (requestOptions = this.f52832f) != null && !(requestOptions instanceof PublicKeyCredentialRequestOptions) && !(requestOptions instanceof BrowserPublicKeyCredentialRequestOptions)) {
            AuthenticatorSelectionCriteria authenticatorSelectionCriteria = (requestOptions instanceof BrowserPublicKeyCredentialCreationOptions ? ((BrowserPublicKeyCredentialCreationOptions) requestOptions).f31732a : (PublicKeyCredentialCreationOptions) requestOptions).f31770g;
            if (!(authenticatorSelectionCriteria == null || (bool = authenticatorSelectionCriteria.f31730b) == null || !bool.booleanValue())) {
                xpf xpf = new xpf();
                xpf.mo30001a(ErrorCode.NOT_SUPPORTED_ERR);
                xpf.f52860a = "Resident credentials or empty 'allowCredentials' lists are not supported  at this time.";
                m43235a(xpf.mo30000a());
                return;
            }
        }
        xbd xbd = new xbd(this.f52837k);
        RequestOptions requestOptions2 = this.f52832f;
        if (requestOptions2 instanceof BrowserRequestOptions) {
            String uri = ((BrowserRequestOptions) requestOptions2).mo18688f().toString();
            try {
                xbc a = xbd.mo29604a(xhl.m42944a(uri), this.f52836j);
                if (a == null) {
                    mo29962a(ErrorCode.NOT_ALLOWED_ERR);
                } else {
                    mo29963a(this.f52838l, a);
                }
            } catch (URISyntaxException e) {
                sek sek = f52828d;
                String valueOf = String.valueOf(uri);
                sek.mo25418e(valueOf.length() == 0 ? new String("Bad url ") : "Bad url ".concat(valueOf), new Object[0]);
                this.f52833g.mo30184a(this.f52838l, e);
                mo29962a(ErrorCode.NOT_ALLOWED_ERR);
            }
        } else {
            xbc a2 = xbd.m42595a(this.f52836j);
            if (a2 == null) {
                mo29962a(ErrorCode.NOT_ALLOWED_ERR);
            } else {
                mo29963a(this.f52838l, a2);
            }
        }
    }

    /* renamed from: a */
    public final void mo29961a(AuthenticatorResponse authenticatorResponse, xpj xpj) {
        AuthenticationExtensions e;
        UserVerificationMethodExtension userVerificationMethodExtension;
        mo29749a();
        if (authenticatorResponse instanceof AuthenticatorErrorResponse) {
            m43235a((AuthenticatorErrorResponse) authenticatorResponse);
        } else if (authenticatorResponse instanceof AuthenticatorAssertionResponse) {
            AuthenticatorAssertionResponse authenticatorAssertionResponse = (AuthenticatorAssertionResponse) authenticatorResponse;
            xpw xpw = new xpw();
            xpw.f52903a = authenticatorResponse;
            if (cdvw.f181825a.mo6606a().mo78385a() && (e = this.f52832f.mo18686e()) != null && (userVerificationMethodExtension = e.f31717c) != null && userVerificationMethodExtension.f31806a) {
                xoy xoy = new xoy();
                xpj xpj2 = xpj.BLUETOOTH_LOW_ENERGY;
                int ordinal = xpj.ordinal();
                boolean z = true;
                UvmEntry uvmEntry = new UvmEntry(ordinal != 4 ? ordinal != 5 ? 1 : 134 : 2, 0, 0);
                xqs xqs = new xqs();
                if (xqs.f52935a.size() >= 3) {
                    z = false;
                }
                bmxy.m108600b(z);
                xqs.f52935a.add(uvmEntry);
                xoy.f52851a = new UvmEntries(xqs.f52935a);
                xpw.f52904b = new AuthenticationExtensionsClientOutputs(xoy.f52851a);
            }
            this.f52830b.mo14260a(xpw.mo30021a());
            this.f52833g.mo30190a(this.f52838l, authenticatorAssertionResponse, xpj);
        } else if (authenticatorResponse instanceof AuthenticatorAttestationResponse) {
            xoo xoo = this.f52830b;
            xpw xpw2 = new xpw();
            xpw2.f52903a = authenticatorResponse;
            xoo.mo14260a(xpw2.mo30021a());
            this.f52833g.mo30197a(this.f52838l, xpj);
        } else {
            throw new IllegalArgumentException("Unexpected ResponseData type!");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29962a(ErrorCode errorCode) {
        xpf xpf = new xpf();
        xpf.mo30001a(errorCode);
        m43235a(xpf.mo30000a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29963a(xwj xwj, xbc xbc) {
        bnic bnic;
        xoa xoa = new xoa(this);
        xrd xrd = new xrd();
        xrd.f52961a = this;
        xrd.f52962b = this.f52831c;
        xrd.f52966f = this.f52837k;
        xrd.f52967g = xwj;
        xrd.f52969i = this.f52833g;
        xrd.f52963c = this.f52834h;
        xrd.f52965e = this.f52836j;
        xrd.f52968h = xbc;
        Context context = this.f52837k;
        boolean hasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.usb.host");
        if (((Boolean) xmn.f52768r.mo58455c()).booleanValue()) {
            bnic = bnic.m109492a(Transport.BLUETOOTH_LOW_ENERGY, Transport.NFC, Transport.USB, Transport.CABLE);
        } else {
            bnic = bnic.m109491a(Transport.BLUETOOTH_LOW_ENERGY, Transport.NFC, Transport.USB);
        }
        xrd.f52971k = new xyy(BluetoothAdapter.getDefaultAdapter(), xhy.m42973a(context), hasSystemFeature, bnic);
        xrd.f52970j = this.f52830b;
        xdx xdx = this.f52835i;
        bmxy.m108581a(xdx);
        xrd.f52964d = xdx;
        xrd.f52972l = xoa;
        this.f52300a = new xrf(xrd.f52961a, xrd.f52962b, xrd.f52966f, xrd.f52967g, xrd.f52971k, xrd.f52968h, xrd.f52969i, xrd.f52964d, xrd.f52963c, xrd.f52970j, xrd.f52972l, xrd.f52965e);
        this.f52300a.mo29752a();
    }
}
