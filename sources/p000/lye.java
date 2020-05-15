package p000;

import android.content.Context;
import android.net.Uri;

/* renamed from: lye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lye implements lyg {

    /* renamed from: a */
    private final Context f33182a;

    /* renamed from: b */
    private final lxh f33183b;

    /* renamed from: c */
    private final bmzi f33184c = lxv.f33173a;

    public lye(Context context) {
        this.f33182a = context;
        this.f33183b = new lxh(context);
    }

    /* renamed from: a */
    public static Uri.Builder m24636a() {
        return new Uri.Builder().scheme("https").encodedAuthority(ccls.m130531j()).appendPath("v1");
    }

    /* renamed from: a */
    public static void m24637a(Uri.Builder builder, bzoa bzoa) {
        builder.appendQueryParameter("request_header.experiment_overrides", bzoa.f170787b);
        bzod bzod = bzoa.f170786a;
        if (bzod != null) {
            Uri.Builder appendQueryParameter = builder.appendQueryParameter("request_header.client_info.version", bzod.f170797a);
            bzod bzod2 = bzoa.f170786a;
            if (bzod2 == null) {
                bzod2 = bzod.f170795c;
            }
            appendQueryParameter.appendQueryParameter("request_header.client_info.client_id", String.valueOf(bzod2.f170798b));
        }
    }

    /* renamed from: a */
    public final bzob mo19734a(bzog bzog) {
        lzy lzy = (lzy) this.f33184c.mo6606a();
        return (bzob) new lxz(bzog).mo19751a(this.f33182a, new byte[0], this.f33183b.mo19723a(), "application/x-protobuf");
    }

    /* renamed from: a */
    public final bzob mo19735a(bzol bzol) {
        lzy lzy = (lzy) this.f33184c.mo6606a();
        return (bzob) new lxy(bzol).mo19750a(this.f33182a, this.f33183b.mo19723a(), "application/x-protobuf");
    }

    /* renamed from: a */
    public final bzoo mo19736a(bzon bzon) {
        lzy lzy = (lzy) this.f33184c.mo6606a();
        return (bzoo) new lya(bzon).mo19750a(this.f33182a, this.f33183b.mo19723a(), "application/x-protobuf");
    }

    /* renamed from: a */
    public final bzoq mo19737a(bzop bzop) {
        lzy lzy = (lzy) this.f33184c.mo6606a();
        return (bzoq) new lxw(bzop).mo19751a(this.f33182a, new byte[0], this.f33183b.mo19723a(), "application/x-protobuf");
    }

    /* renamed from: a */
    public final void mo19738a(bzoe bzoe) {
        lzy lzy = (lzy) this.f33184c.mo6606a();
        new lxx(bzoe).mo19751a(this.f33182a, new byte[0], this.f33183b.mo19723a(), "application/x-protobuf");
    }

    /* renamed from: a */
    public final void mo19739a(bzoh bzoh) {
        lzy lzy = (lzy) this.f33184c.mo6606a();
        new lyc(bzoh).mo19749a(this.f33182a, new byte[0], this.f33183b.mo19723a(), "application/x-protobuf");
    }

    /* renamed from: a */
    public final void mo19740a(bzoi bzoi) {
        lzy lzy = (lzy) this.f33184c.mo6606a();
        new lyb(bzoi).mo19749a(this.f33182a, new byte[0], this.f33183b.mo19723a(), "application/x-protobuf");
    }

    /* renamed from: a */
    public final void mo19741a(bzoj bzoj) {
        throw new RuntimeException("Unimplemented");
    }

    /* renamed from: a */
    public final void mo19742a(bzot bzot) {
        lzy lzy = (lzy) this.f33184c.mo6606a();
        bzoc bzoc = (bzoc) new lyd(bzot).mo19751a(this.f33182a, new byte[0], this.f33183b.mo19723a(), "application/x-protobuf");
    }
}
