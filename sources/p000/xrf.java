package p000;

import android.app.KeyguardManager;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.BrowserRequestOptions;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.RequestOptions;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.google.android.gms.fido.u2f.api.common.RegisterResponseData;
import com.google.android.gms.fido.u2f.api.common.ResponseData;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: xrf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xrf extends xhp implements xom, xny, xzq {

    /* renamed from: q */
    public static final Logger f52973q = new Logger(new String[]{"Fido2RequestController"}, (short[]) null);

    /* renamed from: r */
    private static final long f52974r = TimeUnit.SECONDS.toMillis(300);

    /* renamed from: m */
    public final Context f52975m;

    /* renamed from: n */
    public final xbc f52976n;

    /* renamed from: o */
    public final String f52977o;

    /* renamed from: p */
    public final xbg f52978p;

    /* renamed from: s */
    private final xre f52979s;

    /* renamed from: t */
    private final xeh f52980t;

    /* renamed from: u */
    private final xbi f52981u;

    /* renamed from: v */
    private final xdx f52982v;

    /* renamed from: w */
    private final ExecutorService f52983w;

    /* renamed from: x */
    private Future f52984x;

    /* renamed from: y */
    private Uri f52985y;

    public xrf(xre xre, xxj xxj, Context context, xwj xwj, xyy xyy, xbc xbc, xwn xwn, xdx xdx, xeh xeh, xoo xoo, yas yas, String str) {
        adzt adzt = new adzt(Looper.getMainLooper());
        xbi xbi = new xbi();
        xay xay = new xay(context);
        xbg xbg = new xbg(context);
        bqgj bqgj = xhu.f52320a;
        bmxy.m108581a(xxj);
        this.f52306d = xxj;
        bmxy.m108581a(xre);
        this.f52979s = xre;
        bmxy.m108581a(str);
        this.f52977o = str;
        this.f52982v = xdx;
        this.f52983w = bqgj;
        bmxy.m108581a(xeh);
        this.f52980t = xeh;
        bmxy.m108581a(context);
        this.f52975m = context;
        bmxy.m108581a(xwj);
        this.f52305c = xwj;
        bmxy.m108581a(xbc);
        this.f52976n = xbc;
        bmxy.m108581a(adzt);
        this.f52303a = adzt;
        bmxy.m108581a(xwn);
        this.f52314l = xwn;
        bmxy.m108581a(xyy);
        this.f52313k = xyy;
        this.f52307e = xay;
        this.f52978p = xbg;
        this.f52308f = new xzi(context, xwj, xwn);
        this.f52312j = new xzh(xyy.mo30279a(), new xgn(context), this.f52308f);
        this.f52309g = new xzz(xwj, yas, xwn, xyy.mo30279a());
        this.f52311i = new HashMap();
        this.f52311i.put(Transport.BLUETOOTH_LOW_ENERGY, new xyp(context, BluetoothAdapter.getDefaultAdapter(), new xgn(context)));
        this.f52311i.put(Transport.NFC, new xze(context, xoo));
        this.f52311i.put(Transport.USB, new xzs(context));
        this.f52981u = xbi;
    }

    /* renamed from: a */
    private final void m43297a(ErrorCode errorCode, String str) {
        f52973q.mo25418e(str, new Object[0]);
        xpf xpf = new xpf();
        xpf.mo30001a(errorCode);
        xpf.f52860a = str;
        AuthenticatorErrorResponse a = xpf.mo30000a();
        this.f52306d.mo30225e();
        this.f52979s.mo29961a(a, null);
        mo29762f();
    }

    /* renamed from: b */
    private final boolean m43299b(RequestOptions requestOptions) {
        FidoAppIdExtension fidoAppIdExtension;
        String str;
        Uri uri = null;
        if (!(requestOptions == null || requestOptions.mo18686e() == null || (fidoAppIdExtension = requestOptions.mo18686e().f31715a) == null || (str = fidoAppIdExtension.f31756a) == null || str.trim().isEmpty())) {
            uri = Uri.parse(str);
        }
        if (uri == null) {
            return false;
        }
        f52973q.mo25412b("validateAppId", new Object[0]);
        if ((requestOptions instanceof PublicKeyCredentialRequestOptions) || (requestOptions instanceof BrowserPublicKeyCredentialRequestOptions)) {
            bqga.m112781a(xhu.f52320a.mo25819b(new xqz(this, uri)), new xra(this, uri), xhu.f52320a);
            return true;
        }
        this.f52314l.mo30184a(this.f52305c, new IllegalArgumentException("FIDO_APPID extension is only valid for assertion request!"));
        m43297a(ErrorCode.NOT_SUPPORTED_ERR, "FIDO_APPID extension is only valid for assertion request!");
        return true;
    }

    /* renamed from: i */
    private final void m43300i() {
        f52973q.mo25412b("validateRpId", new Object[0]);
        bqga.m112781a(xhu.f52320a.mo25819b(new xrb(this)), new xrc(this), bqfb.INSTANCE);
    }

    /* renamed from: j */
    private final boolean m43301j() {
        KeyguardManager keyguardManager = (KeyguardManager) this.f52975m.getSystemService("keyguard");
        return keyguardManager != null && keyguardManager.isDeviceSecure();
    }

    /* renamed from: c */
    public final void mo29759c() {
        String str;
        f52973q.mo25412b("startEmbeddedSecurityKey", new Object[0]);
        xxj xxj = this.f52306d;
        if (!xxj.f53336c) {
            f52973q.mo25418e("The incoming FIDO2 request cannot be validated", new Object[0]);
            m43297a(ErrorCode.SECURITY_ERR, "The incoming FIDO2 request cannot be validated");
            return;
        }
        RequestOptions b = xxj.mo30222b();
        if (b instanceof BrowserRequestOptions) {
            str = this.f52981u.mo29607a((BrowserRequestOptions) b);
        } else {
            str = this.f52981u.mo29608a(this.f52977o);
        }
        if ((b instanceof PublicKeyCredentialRequestOptions) || (b instanceof BrowserPublicKeyCredentialRequestOptions)) {
            xdh xdh = new xdh(this.f52305c, this.f52980t, this.f52982v);
            this.f52984x = ((soc) this.f52983w).submit(new xnz(this.f52305c, xdh, this.f52980t, this.f52982v, b, (xwn) this.f52314l, str, this.f52977o, this));
        } else if ((b instanceof PublicKeyCredentialCreationOptions) || (b instanceof BrowserPublicKeyCredentialCreationOptions)) {
            xea xea = new xea(this.f52305c, this.f52980t, this.f52982v, new xed(this.f52975m));
            this.f52984x = ((soc) this.f52983w).submit(new xon(this.f52305c, xea, b, (xwn) this.f52314l, str, this.f52977o, this));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo29760d() {
        f52973q.mo25412b("onSecurityKeyActivityTimeout", new Object[0]);
        this.f52314l.mo30186a(this.f52305c, xag.TYPE_SERVER_SET_TIMEOUT_REACHED);
        m43297a(ErrorCode.TIMEOUT_ERR, "Request doesn't finish on time!");
    }

    /* renamed from: e */
    public final void mo29761e() {
        super.mo29761e();
        Future future = this.f52984x;
        if (future != null) {
            future.cancel(false);
            this.f52984x = null;
        }
    }

    /* renamed from: f */
    public final void mo29762f() {
        super.mo29762f();
        mo29761e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo30063g() {
        boolean z;
        f52973q.mo25412b("onRequestValidationFailed", new Object[0]);
        xxj xxj = this.f52306d;
        if (xxj.f53334a == xxi.INIT) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108600b(z);
        xxj.f53336c = false;
        if (this.f52985y == null) {
            f52973q.mo25418e("The incoming request cannot be validated", new Object[0]);
            m43297a(ErrorCode.SECURITY_ERR, "The incoming request cannot be validated");
            return;
        }
        f52973q.mo25416d("The incoming request's RpId cannot be validated.", new Object[0]);
        f52973q.mo25412b("AppId is valid so that the request could still proceed with U2F purpose.", new Object[0]);
        mo30064h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo30064h() {
        String str;
        f52973q.mo25412b("processRequest", new Object[0]);
        xxj xxj = this.f52306d;
        MessageDigest a = xid.m42997a();
        String xbc = this.f52976n.toString();
        Uri uri = this.f52985y;
        if (uri != null) {
            str = uri.toString();
        } else {
            str = null;
        }
        xxj.mo30221a(a, xbc, str, this.f52977o);
        xxj xxj2 = this.f52306d;
        if (xxj2.f53336c) {
            xqx a2 = xqy.m43291a(this.f52305c, xxj2.mo30222b(), this.f52982v, this.f52314l);
            xqx xqx = xqx.ALL;
            xxi xxi = xxi.INIT;
            int ordinal = a2.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    this.f52309g.mo30294a();
                } else if (ordinal == 2) {
                    if (m43301j()) {
                        mo29759c();
                        return;
                    }
                    f52973q.mo25418e("The device is not secured with any screen lock", new Object[0]);
                    m43297a(ErrorCode.CONSTRAINT_ERR, "The device is not secured with any screen lock");
                    return;
                }
            } else if (!m43301j()) {
                this.f52309g.mo30294a();
            }
        } else {
            this.f52309g.mo30294a();
        }
        Set a3 = this.f52313k.mo30279a();
        mo29755a(a3);
        mo29758b(new HashSet(a3));
    }

    /* renamed from: a */
    private final boolean m43298a(RequestOptions requestOptions) {
        xqx a = xqy.m43291a(this.f52305c, requestOptions, this.f52982v, this.f52314l);
        f52973q.mo25412b("AuthenticatorSelector.Attachment: %s", a);
        if (xqx.PLATFORM_ATTACHED != a) {
            return false;
        }
        if (m43301j()) {
            m43300i();
        } else {
            f52973q.mo25418e("The device is not secured with any screen lock", new Object[0]);
            m43297a(ErrorCode.CONSTRAINT_ERR, "The device is not secured with any screen lock");
        }
        return true;
    }

    /* renamed from: a */
    public final void mo29752a() {
        f52973q.mo25412b("run", new Object[0]);
        long j = f52974r;
        RequestOptions b = this.f52306d.mo30222b();
        if (!(b == null || b.mo18683b() == null)) {
            j = TimeUnit.SECONDS.toMillis(b.mo18683b().longValue());
        }
        this.f52303a.postDelayed(this.f52304b, j);
        if (!m43298a(b) && !m43299b(b)) {
            m43300i();
        }
    }

    /* renamed from: b */
    public final void mo29757b() {
        xqx xqx = xqx.ALL;
        xxi xxi = xxi.INIT;
        int ordinal = this.f52306d.f53334a.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                mo29755a(this.f52313k.mo30279a());
            } else if (ordinal != 2) {
                f52973q.mo25416d("In unexpected state to be run(): %s", this.f52306d.f53334a);
            }
        } else if (!m43298a(this.f52306d.mo30222b()) && !m43299b(this.f52306d.mo30222b())) {
            m43300i();
        }
    }

    /* renamed from: a */
    public final void mo30060a(bmxv bmxv, Uri uri) {
        if (!bmxv.mo66813a()) {
            Logger Logger = f52973q;
            String valueOf = String.valueOf(this.f52976n);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 69);
            sb.append("AppId specified by AuthenticationExtension is not allowed for caller ");
            sb.append(valueOf);
            Logger.mo25416d(sb.toString(), new Object[0]);
            this.f52985y = null;
        } else {
            this.f52985y = uri;
        }
        m43300i();
    }

    /* renamed from: b */
    public final void mo30062b(AuthenticatorResponse authenticatorResponse, xpj xpj) {
        boolean z;
        if (authenticatorResponse instanceof AuthenticatorErrorResponse) {
            this.f52306d.mo30225e();
        } else {
            xxj xxj = this.f52306d;
            boolean z2 = false;
            if (xxj.f53334a == xxi.REQUEST_PREPARED) {
                z = true;
            } else {
                z = false;
            }
            bmxy.m108600b(z);
            if ((authenticatorResponse instanceof AuthenticatorAttestationResponse) || (authenticatorResponse instanceof AuthenticatorAssertionResponse)) {
                z2 = true;
            }
            bmxy.m108588a(z2);
            xxj.mo30226f();
        }
        this.f52979s.mo29961a(authenticatorResponse, xpj);
        mo29762f();
    }

    /* renamed from: a */
    public final void mo30061a(Transport transport, ResponseData responseData) {
        int i = 0;
        boolean z = true;
        for (String str : bmyx.m108641a(1024).mo66918a((CharSequence) String.format("onResultReceived(%s, %s)", transport, responseData))) {
            f52973q.mo25412b(str, new Object[0]);
        }
        if (this.f52306d.f53334a == xxi.COMPLETE) {
            return;
        }
        if ((responseData instanceof RegisterResponseData) || (responseData instanceof SignResponseData)) {
            try {
                xre xre = this.f52979s;
                xxj xxj = this.f52306d;
                if (xxj.f53334a != xxi.REQUEST_PREPARED) {
                    z = false;
                }
                bmxy.m108600b(z);
                AuthenticatorResponse a = xxj.mo30216a(responseData);
                xxj.mo30226f();
                String str2 = transport.f31675g;
                xpj[] values = xpj.values();
                int length = values.length;
                while (i < length) {
                    xpj xpj = values[i];
                    if (!str2.equals(xpj.f52869g)) {
                        i++;
                    } else {
                        xre.mo29961a(a, xpj);
                        mo29762f();
                        return;
                    }
                }
                throw new xpi(str2);
            } catch (xpi e) {
                this.f52314l.mo30184a(this.f52305c, e);
            }
        } else if (responseData instanceof ErrorResponseData) {
            xpf xpf = new xpf();
            xpf.mo30001a(ErrorCode.UNKNOWN_ERR);
            xpf.f52860a = ((ErrorResponseData) responseData).f31909b;
            mo30062b(xpf.mo30000a(), null);
        }
    }

    /* renamed from: a */
    public final void mo29959a(AuthenticatorResponse authenticatorResponse, xpj xpj) {
        f52973q.mo25412b("onAuthenticationResult", new Object[0]);
        mo30062b(authenticatorResponse, xpj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29756a(JSONObject jSONObject) {
        boolean z;
        try {
            String string = jSONObject.getString("deviceId");
            if (jSONObject.has("requiresPinInstructions")) {
                z = jSONObject.getBoolean("requiresPinInstructions");
            } else {
                z = false;
            }
            Map map = this.f52310h;
            if (map != null) {
                xyr xyr = (xyr) map.get(Transport.BLUETOOTH_LOW_ENERGY);
                if (xyr != null) {
                    xyr.mo30273a(string, z);
                } else {
                    f52973q.mo25414c("Empty BleRequestController.", new Object[0]);
                }
            } else {
                f52973q.mo25416d("No transport controllers initialized", new Object[0]);
            }
        } catch (JSONException e) {
            f52973q.mo25417e("Missing or malformed required field \"deviceId\"", e, new Object[0]);
            this.f52314l.mo30184a(this.f52305c, e);
            m43297a(ErrorCode.DATA_ERR, "Missing or malformed required field \"deviceId\"");
        }
    }
}
