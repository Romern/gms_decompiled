package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.common.BrowserRegisterRequestParams;
import java.util.HashSet;

/* renamed from: ybo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ybo extends sji {

    /* renamed from: a */
    public static final Logger f53554a = new Logger(new String[]{"Register0POperation"}, (short[]) null);

    /* renamed from: d */
    public final xxc f53555d;

    /* renamed from: e */
    private final xwj f53556e;

    /* renamed from: f */
    private final rnt f53557f;

    /* renamed from: g */
    private final BrowserRegisterRequestParams f53558g;

    /* renamed from: h */
    private final String f53559h;

    public ybo(xwj xwj, rnt rnt, BrowserRegisterRequestParams browserRegisterRequestParams, xxc xxc, String str) {
        super(119, "RegisterZeroParty");
        this.f53556e = xwj;
        this.f53557f = rnt;
        this.f53558g = browserRegisterRequestParams;
        this.f53555d = xxc;
        this.f53559h = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11356a(Context context) {
        ybn ybn = new ybn(this);
        xxb a = xxb.m43593a(xwr.m43574a(context));
        xwj xwj = this.f53556e;
        BrowserRegisterRequestParams browserRegisterRequestParams = this.f53558g;
        HashSet a2 = bnpf.m110050a(Transport.BLUETOOTH_LOW_ENERGY, Transport.NFC, Transport.USB);
        String str = this.f53559h;
        xxb.f53322c.mo25414c("headlessRegister is called", new Object[0]);
        a.f53325b = true;
        a.f53324a.mo30233a(context, xwj, browserRegisterRequestParams, ybn, a.mo30210a(context, a2), str);
        this.f53557f.mo11797a(Status.f30107a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11357a(Status status) {
        this.f53557f.mo11797a(status);
    }
}
