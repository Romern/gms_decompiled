package p000;

import android.content.Context;
import java.util.Locale;

/* renamed from: ufp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ufp implements ufs {

    /* renamed from: a */
    final /* synthetic */ uey f47460a;

    /* renamed from: b */
    final /* synthetic */ ujx f47461b;

    /* renamed from: c */
    final /* synthetic */ vfb f47462c;

    /* renamed from: d */
    final /* synthetic */ ufu f47463d;

    public ufp(ufu ufu, uey uey, ujx ujx, vfb vfb) {
        this.f47463d = ufu;
        this.f47460a = uey;
        this.f47461b = ujx;
        this.f47462c = vfb;
    }

    /* renamed from: a */
    public final ugb mo27300a(ufv ufv) {
        uey uey = this.f47460a;
        ujx ujx = this.f47461b;
        sdo.m34974b(!ujx.mo27566ab());
        String format = String.format(Locale.US, (String) twy.f46836aT.mo58455c(), ujx.mo27616i());
        ufu ufu = this.f47463d;
        Context context = ufu.f47472b;
        ufb ufb = ufu.f47479i;
        return new ugh(ufv, uey, format, context, ufu.f47478h, ufu.f47474d, ufu.f47477g, this.f47461b, this.f47462c);
    }
}
