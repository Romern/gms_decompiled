package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.common.BrowserSignRequestParams;
import java.util.HashSet;

/* renamed from: ybs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ybs extends sji {

    /* renamed from: d */
    public static final sek f53565d = new sek(new String[]{"Sign0POperation"}, (short[]) null);

    /* renamed from: a */
    public final xxf f53566a;

    /* renamed from: e */
    private final xwj f53567e;

    /* renamed from: f */
    private final rnt f53568f;

    /* renamed from: g */
    private final BrowserSignRequestParams f53569g;

    /* renamed from: h */
    private final String f53570h;

    public ybs(xwj xwj, rnt rnt, BrowserSignRequestParams browserSignRequestParams, xxf xxf, String str) {
        super(119, "SignZeroParty");
        this.f53567e = xwj;
        this.f53568f = rnt;
        this.f53569g = browserSignRequestParams;
        this.f53566a = xxf;
        this.f53570h = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11356a(Context context) {
        ybr ybr = new ybr(this);
        xxb a = xxb.m43593a(xwr.m43574a(context));
        xwj xwj = this.f53567e;
        BrowserSignRequestParams browserSignRequestParams = this.f53569g;
        HashSet a2 = bnpf.m110050a(Transport.BLUETOOTH_LOW_ENERGY, Transport.NFC, Transport.USB);
        String str = this.f53570h;
        xxb.f53322c.mo25414c("headlessSign is called", new Object[0]);
        a.f53325b = true;
        a.f53324a.mo30234a(context, xwj, browserSignRequestParams, ybr, a.mo30210a(context, a2), str);
        this.f53568f.mo11797a(Status.f30107a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11357a(Status status) {
        this.f53568f.mo11797a(status);
    }
}
