package p000;

import android.content.Context;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.common.BrowserRegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.BrowserSignRequestParams;
import com.google.android.gms.fido.u2f.api.common.ErrorCode;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.google.android.gms.fido.u2f.api.common.RegisterResponseData;
import com.google.android.gms.fido.u2f.api.common.ResponseData;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: xxs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xxs extends xhl implements xzo {

    /* renamed from: g */
    public static final Logger f53345g = new Logger(new String[]{"U2fApiImpl"}, (short[]) null);

    /* renamed from: b */
    public Context f53346b;

    /* renamed from: c */
    public xxk f53347c;

    /* renamed from: d */
    public xyy f53348d;

    /* renamed from: e */
    public xxj f53349e;

    /* renamed from: f */
    public final xws f53350f;

    public xxs(xws xws) {
        this.f53350f = xws;
    }

    /* renamed from: a */
    private final void m43639a(xwj xwj, int i, String str) {
        xws xws;
        if (this.f53349e == null || (xws = this.f53350f) == null) {
            f53345g.mo25418e("In logU2fError, requestDataTracker or eventLogger should not be null!", new Object[0]);
        } else {
            xws.mo30198a(xwj, i, str);
        }
    }

    /* renamed from: a */
    public final void mo30233a(Context context, xwj xwj, BrowserRegisterRequestParams browserRegisterRequestParams, xxh xxh, xyy xyy, String str) {
        f53345g.mo25414c("doRegister for browsers is called", new Object[0]);
        this.f53346b = context;
        this.f53347c = xxh;
        this.f53348d = xyy;
        this.f53349e = new xxg(browserRegisterRequestParams.f31887a);
        this.f53350f.mo30201a(xwj, str, browserRegisterRequestParams.f31887a, this.f53348d.mo30279a());
        if (!xyy.mo30279a().isEmpty()) {
            String uri = browserRegisterRequestParams.f31888b.toString();
            try {
                mo30237a(xwj, new xbc(xhl.m42944a(uri)));
            } catch (URISyntaxException e) {
                Logger Logger = f53345g;
                String valueOf = String.valueOf(uri);
                Logger.mo25418e(valueOf.length() == 0 ? new String("Bad url ") : "Bad url ".concat(valueOf), new Object[0]);
                this.f53350f.mo30184a(xwj, e);
                mo30235a(xwj, ErrorCode.BAD_REQUEST);
            }
        } else {
            f53345g.mo25418e("No enabled transport found on the platform", new Object[0]);
            mo30235a(xwj, ErrorCode.CONFIGURATION_UNSUPPORTED);
        }
    }

    /* renamed from: a */
    public final void mo30234a(Context context, xwj xwj, BrowserSignRequestParams browserSignRequestParams, xxm xxm, xyy xyy, String str) {
        f53345g.mo25414c("doSign for browsers is called", new Object[0]);
        this.f53346b = context;
        this.f53347c = xxm;
        this.f53348d = xyy;
        this.f53349e = new xxl(browserSignRequestParams.f31889a);
        this.f53350f.mo30202a(xwj, str, browserSignRequestParams.f31889a, this.f53348d.mo30279a());
        if (!xyy.mo30279a().isEmpty()) {
            String uri = browserSignRequestParams.f31890b.toString();
            try {
                mo30237a(xwj, new xbc(xhl.m42944a(uri)));
            } catch (URISyntaxException e) {
                Logger Logger = f53345g;
                String valueOf = String.valueOf(uri);
                Logger.mo25418e(valueOf.length() == 0 ? new String("Bad url ") : "Bad url ".concat(valueOf), new Object[0]);
                this.f53350f.mo30184a(xwj, e);
                mo30235a(xwj, ErrorCode.BAD_REQUEST);
            }
        } else {
            f53345g.mo25418e("No enabled transport found on the platform", new Object[0]);
            mo30235a(xwj, ErrorCode.CONFIGURATION_UNSUPPORTED);
        }
    }

    /* renamed from: a */
    public final void mo30235a(xwj xwj, ErrorCode errorCode) {
        if (this.f53349e != null) {
            ErrorResponseData errorResponseData = new ErrorResponseData(errorCode);
            this.f53349e.mo30220a(errorResponseData);
            this.f53347c.mo14254a(errorResponseData);
            m43639a(xwj, errorCode.f31907g, (String) null);
            this.f53349e = null;
            return;
        }
        f53345g.mo25418e("sendSecurityKeyErrorResponseForCurrentRequest should not be called when RequestDataTracker is null.", new Object[0]);
    }

    /* renamed from: a */
    public final void mo30236a(xwj xwj, ResponseData responseData, Transport transport) {
        mo29749a();
        if (transport != null && !(responseData instanceof ErrorResponseData)) {
            if (responseData instanceof SignResponseData) {
                SignResponseData signResponseData = (SignResponseData) responseData;
                ((xxm) this.f53347c).mo14255a(signResponseData);
                this.f53350f.mo30200a(xwj, signResponseData, transport);
            } else if (responseData instanceof RegisterResponseData) {
                ((xxh) this.f53347c).mo30218a((RegisterResponseData) responseData);
                this.f53350f.mo30199a(xwj, transport);
            } else {
                throw new IllegalArgumentException("Unexpected ResponseData type!");
            }
            this.f53349e = null;
        } else if (responseData instanceof ErrorResponseData) {
            ErrorResponseData errorResponseData = (ErrorResponseData) responseData;
            this.f53347c.mo14254a(errorResponseData);
            m43639a(xwj, errorResponseData.f31908a.f31907g, errorResponseData.f31909b);
        } else {
            f53345g.mo25418e("transport should not be null for Sign/Register ResponseData.", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo30237a(xwj xwj, xbc xbc) {
        xwj xwj2 = xwj;
        f53345g.mo25412b("startSecurityKeyRequestController", new Object[0]);
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            xxr xxr = new xxr(this);
            xzn xzn = new xzn();
            xzn.f53458a = this;
            xzn.f53460c = xbc;
            xzn.f53461d = instance;
            xzn.f53459b = xxr;
            xzn.f53468k = this.f53347c;
            xzn.f53462e = this.f53349e;
            xzn.f53463f = this.f53348d;
            xzn.f53464g = new xgn(this.f53346b);
            Context context = this.f53346b;
            xzn.f53465h = context;
            xzn.f53466i = xwj2;
            xws xws = this.f53350f;
            xzn.f53467j = xws;
            xzn.f53469l = new xzi(context, xwj2, xws);
            bmxy.m108581a(xzn.f53466i);
            this.f52300a = new xzp(xzn.f53458a, xzn.f53459b, xzn.f53468k, xzn.f53460c, xzn.f53461d, xzn.f53462e, xzn.f53463f, xzn.f53464g, xzn.f53465h, xzn.f53466i, xzn.f53469l, xzn.f53467j);
            this.f52300a.mo29752a();
        } catch (NoSuchAlgorithmException e) {
            f53345g.mo25417e("SHA-256 unavailable? Unable to handle security key request", e, new Object[0]);
            this.f53350f.mo30184a(xwj2, e);
            mo30235a(xwj2, ErrorCode.BAD_REQUEST);
        }
    }
}
