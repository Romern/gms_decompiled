package p000;

import android.content.Context;
import android.nfc.Tag;
import com.google.android.gms.fido.fido2.api.common.RequestOptions;

/* renamed from: xgz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xgz extends xhw {

    /* renamed from: a */
    public final Context f52247a;

    /* renamed from: b */
    public final xwj f52248b;

    /* renamed from: c */
    public final RequestOptions f52249c;

    /* renamed from: d */
    public final xoo f52250d;

    /* renamed from: e */
    public final String f52251e;

    /* renamed from: f */
    public final String f52252f;

    /* renamed from: g */
    public final xhi f52253g;

    /* renamed from: h */
    public final bqgy f52254h;

    /* renamed from: i */
    public int f52255i = 0;

    /* renamed from: j */
    private final bqgj f52256j;

    /* renamed from: a */
    public final void mo29740a(Tag tag) {
        xkx a = com.google.android.gms.fido.communication.channel.nfc.Tag.m23434a(tag).mo18640a();
        if (a != null) {
            xlc xlc = new xlc(this.f52256j, a);
            bqgg a2 = bqdx.m112673a(xlc.mo29890b(), new xgw(this, xlc), this.f52256j);
            xlc.getClass();
            a2.mo741a(new xgx(xlc), this.f52256j);
            bqga.m112781a(a2, new xgy(this), this.f52256j);
            return;
        }
        throw adbe.m50106a(34009).mo33303c();
    }

    public xgz(Context context, xwj xwj, RequestOptions requestOptions, xoo xoo, String str, String str2, xhi xhi, bqgy bqgy, bqgj bqgj) {
        this.f52247a = context;
        this.f52248b = xwj;
        this.f52249c = requestOptions;
        this.f52250d = xoo;
        this.f52251e = str;
        this.f52252f = str2;
        this.f52253g = xhi;
        this.f52254h = bqgy;
        this.f52256j = bqgj;
    }
}
