package p000;

import android.content.Context;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.RequestOptions;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: xeq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xeq {

    /* renamed from: a */
    public final Context f52078a;

    /* renamed from: b */
    public final xwj f52079b;

    /* renamed from: c */
    public final String f52080c;

    /* renamed from: d */
    public final RequestOptions f52081d;

    /* renamed from: e */
    public final xoo f52082e;

    /* renamed from: f */
    public final bqgj f52083f;

    /* renamed from: g */
    public bmxv f52084g = bmvz.f131120a;

    /* renamed from: h */
    public xes f52085h;

    /* renamed from: i */
    private final ScheduledExecutorService f52086i;

    /* renamed from: j */
    private final xwn f52087j;

    public xeq(Context context, xwj xwj, String str, RequestOptions requestOptions, xoo xoo, bqgj bqgj, ScheduledExecutorService scheduledExecutorService, xwn xwn) {
        bmxy.m108581a(context);
        this.f52078a = context;
        bmxy.m108581a(xwj);
        this.f52079b = xwj;
        bmxy.m108581a(str);
        this.f52080c = str;
        bmxy.m108581a(requestOptions);
        this.f52081d = requestOptions;
        bmxy.m108581a(xoo);
        this.f52082e = xoo;
        this.f52083f = bqgj;
        this.f52086i = scheduledExecutorService;
        this.f52087j = xwn;
    }

    /* renamed from: a */
    public static synchronized xeq m42780a(Context context, xwj xwj, RequestOptions requestOptions, String str, xoo xoo) {
        xeq xeq;
        synchronized (xeq.class) {
            bmxy.m108588a(xez.m42801b(requestOptions));
            xeq = new xeq(context, xwj, str, requestOptions, xoo, snp.m35704b(9), Executors.newScheduledThreadPool(1), xwm.m43526a(context));
        }
        return xeq;
    }

    /* renamed from: b */
    public static synchronized xeq m42781b(Context context, xwj xwj, RequestOptions requestOptions, String str, xoo xoo) {
        xeq xeq;
        synchronized (xeq.class) {
            bmxy.m108588a(xez.m42800a(requestOptions));
            xeq = new xeq(context, xwj, str, requestOptions, xoo, snp.m35704b(9), Executors.newScheduledThreadPool(1), xwm.m43526a(context));
        }
        return xeq;
    }

    /* renamed from: a */
    public final void mo29687a() {
        xwj xwj = this.f52079b;
        String str = this.f52080c;
        RequestOptions requestOptions = this.f52081d;
        if (requestOptions instanceof PublicKeyCredentialRequestOptions) {
            this.f52087j.mo30192a(xwj, str, (PublicKeyCredentialRequestOptions) requestOptions);
        } else if (requestOptions instanceof BrowserPublicKeyCredentialRequestOptions) {
            this.f52087j.mo30192a(xwj, str, ((BrowserPublicKeyCredentialRequestOptions) requestOptions).f31734a);
        } else if (requestOptions instanceof PublicKeyCredentialCreationOptions) {
            this.f52087j.mo30191a(xwj, str, (PublicKeyCredentialCreationOptions) requestOptions);
        } else if (requestOptions instanceof BrowserPublicKeyCredentialCreationOptions) {
            this.f52087j.mo30191a(xwj, str, ((BrowserPublicKeyCredentialCreationOptions) requestOptions).f31732a);
        }
        this.f52083f.mo25812a(new xek(this));
    }

    /* renamed from: a */
    public final void mo29688a(int i) {
        this.f52082e.mo14259a(xpv.m43283a(i));
    }

    /* renamed from: a */
    public final void mo29689a(xes xes) {
        this.f52085h = xes;
        int intValue = xes.mo29682a().intValue();
        if (intValue == 0) {
            Context context = this.f52078a;
            xwj xwj = this.f52079b;
            RequestOptions requestOptions = this.f52081d;
            String str = this.f52080c;
            mo29689a(new xew(context, new xbf(xwj, new xay(context), new xbg(context), new xbd(context), xwm.m43526a(context)), this.f52083f, requestOptions, str));
        } else if (intValue == 1) {
            bqga.m112781a(this.f52085h.mo29684b(), new xem(this), this.f52083f);
        } else if (intValue == 2) {
            bqga.m112781a(this.f52085h.mo29684b(), new xen(this), this.f52083f);
        } else if (intValue == 3) {
            bqgg b = this.f52085h.mo29684b();
            Double b2 = this.f52081d.mo18683b();
            if (b2 == null) {
                b2 = Double.valueOf((double) cdxq.f181879a.mo6606a().mo78423a());
            } else if (b2.doubleValue() < ((double) cdxq.m135227c())) {
                b2 = Double.valueOf((double) cdxq.m135227c());
            } else if (b2.doubleValue() > ((double) cdxq.m135226b())) {
                b2 = Double.valueOf((double) cdxq.m135226b());
            }
            bqga.m112781a(bqga.m112773a(b, b2.longValue(), TimeUnit.SECONDS, this.f52086i), new xeo(this), this.f52083f);
        } else if (intValue != 4) {
            throw new IllegalStateException("Unrecognized stage.");
        }
    }
}
