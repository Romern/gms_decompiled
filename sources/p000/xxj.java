package p000;

import android.util.Base64;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;
import com.google.android.gms.fido.fido2.api.common.RequestOptions;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.google.android.gms.fido.u2f.api.common.RequestParams;
import com.google.android.gms.fido.u2f.api.common.ResponseData;
import java.security.MessageDigest;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: xxj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class xxj {

    /* renamed from: h */
    private static final sek f53333h = new sek(new String[]{"RequestDataTracker"}, (short[]) null);

    /* renamed from: a */
    public xxi f53334a;

    /* renamed from: b */
    public ResponseData f53335b;

    /* renamed from: c */
    public boolean f53336c = true;

    /* renamed from: d */
    private RequestParams f53337d;

    /* renamed from: e */
    private xfo f53338e;

    /* renamed from: f */
    private RequestOptions f53339f;

    /* renamed from: g */
    private String f53340g;

    public xxj(RequestOptions requestOptions) {
        bmxy.m108581a(requestOptions);
        this.f53339f = requestOptions;
        m43617a(xxi.INIT);
    }

    /* renamed from: a */
    protected static final String m43615a(String str, String str2, String str3, TokenBinding tokenBinding, xlv xlv) {
        JSONObject jSONObject;
        if (tokenBinding != null) {
            try {
                jSONObject = new JSONObject().put("status", tokenBinding.f31799a).put("id", tokenBinding.f31800b);
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        } else {
            jSONObject = null;
        }
        return new xlw(xlv, str, str2, str3, jSONObject).mo18664a().toString();
    }

    /* renamed from: a */
    public abstract AuthenticatorResponse mo30216a(ResponseData responseData);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract xfo mo30217a(MessageDigest messageDigest, String str, String str2);

    /* renamed from: b */
    public final RequestOptions mo30222b() {
        boolean z = true;
        if (!(this.f53334a == xxi.INIT || this.f53334a == xxi.REQUEST_PREPARED)) {
            z = false;
        }
        bmxy.m108600b(z);
        return this.f53339f;
    }

    /* renamed from: c */
    public final String mo30223c() {
        bmxy.m108600b(this.f53334a == xxi.INIT);
        return this.f53340g;
    }

    /* renamed from: d */
    public final xfo mo30224d() {
        bmxy.m108600b(this.f53334a == xxi.REQUEST_PREPARED);
        return this.f53338e;
    }

    /* renamed from: e */
    public final void mo30225e() {
        boolean z = true;
        if (!(this.f53334a == xxi.INIT || this.f53334a == xxi.REQUEST_PREPARED)) {
            z = false;
        }
        bmxy.m108600b(z);
        mo30226f();
    }

    /* renamed from: f */
    public final void mo30226f() {
        this.f53338e = null;
        m43617a(xxi.COMPLETE);
    }

    public xxj(RequestParams requestParams) {
        bmxy.m108581a(requestParams);
        this.f53337d = requestParams;
        m43617a(xxi.INIT);
    }

    /* renamed from: a */
    protected static final String m43616a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* renamed from: a */
    private final void m43617a(xxi xxi) {
        bmxy.m108581a(xxi);
        this.f53334a = xxi;
    }

    /* renamed from: a */
    public final RequestParams mo30219a() {
        bmxy.m108600b(this.f53334a == xxi.INIT);
        return this.f53337d;
    }

    /* renamed from: a */
    public final void mo30220a(ErrorResponseData errorResponseData) {
        boolean z = true;
        if (!(this.f53334a == xxi.INIT || this.f53334a == xxi.REQUEST_PREPARED)) {
            z = false;
        }
        bmxy.m108600b(z);
        this.f53335b = errorResponseData;
        mo30226f();
    }

    /* renamed from: a */
    public final void mo30221a(MessageDigest messageDigest, String str, String str2, String str3) {
        boolean z = false;
        f53333h.mo25412b("prepareRequest origin: %s; appIdExt: %s", str, str2);
        if (this.f53334a == xxi.INIT) {
            z = true;
        }
        bmxy.m108600b(z);
        bmxy.m108581a(messageDigest);
        this.f53340g = str2;
        this.f53338e = mo30217a(messageDigest, str, str3);
        this.f53337d = null;
        m43617a(xxi.REQUEST_PREPARED);
    }
}
