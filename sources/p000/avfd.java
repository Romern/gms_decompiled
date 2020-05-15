package p000;

import android.accounts.Account;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.udc.UdcCacheRequest;
import com.google.android.gms.udc.UdcSettingsListActivityRequest;
import com.google.android.gms.udc.UdcWriteLocalSettingsRequest;
import com.google.android.gms.udc.service.UdcApiChimeraService;

/* renamed from: avfd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avfd extends avdn implements aaai {

    /* renamed from: a */
    final ClientContext f93067a;

    /* renamed from: b */
    final avap f93068b;

    /* renamed from: c */
    private final UdcApiChimeraService f93069c;

    /* renamed from: d */
    private final aaag f93070d;

    /* renamed from: e */
    private final String f93071e;

    public avfd(UdcApiChimeraService udcApiChimeraService, aaag aaag, Account account, String str, int i) {
        this.f93069c = udcApiChimeraService;
        this.f93070d = aaag;
        this.f93071e = str;
        ClientContext clientContext = new ClientContext();
        clientContext.f30215e = "com.google.android.gms";
        clientContext.f30216f = this.f93071e;
        clientContext.f30212b = i;
        clientContext.f30214d = account;
        clientContext.f30213c = account;
        clientContext.mo17806d(chbe.f188233a.mo6606a().mo84911g());
        this.f93067a = clientContext;
        this.f93068b = new avap(new avao(new sgv(udcApiChimeraService, chbe.m147975e(), chbe.m147974d(), chbe.f188233a.mo6606a().mo84906b(), chbe.f188233a.mo6606a().mo84916l(), chbe.f188233a.mo6606a().mo84905a(), chbe.f188233a.mo6606a().mo84912h())), account != null ? new avjn(this.f93069c, account.name) : null);
    }

    /* renamed from: a */
    public final void mo51165a(avdl avdl) {
        mo51167a(avdl, new UdcSettingsListActivityRequest(null, false));
    }

    /* renamed from: b */
    public final void mo51170b(avdl avdl) {
        this.f93070d.mo16659a(this.f93069c, new avbf(this.f93069c, avdl, this.f93067a, this.f93071e, new avfc(this)));
    }

    /* renamed from: c */
    public final void mo51172c(avdl avdl) {
        this.f93070d.mo16659a(this.f93069c, new avbg(this.f93069c, avdl, this.f93067a, this.f93071e));
    }

    /* renamed from: d */
    public final void mo51174d(avdl avdl, byte[] bArr) {
        this.f93070d.mo16659a(this.f93069c, new avbx(this.f93069c, avdl, this.f93067a, this.f93071e, this.f93068b, bArr));
    }

    /* renamed from: e */
    public final void mo51175e(avdl avdl, byte[] bArr) {
        this.f93070d.mo16659a(this.f93069c, new avax(this.f93069c, avdl, this.f93067a, this.f93071e, this.f93068b, bArr));
    }

    /* renamed from: f */
    public final void mo51176f(avdl avdl, byte[] bArr) {
        this.f93070d.mo16659a(this.f93069c, new avba(this.f93069c, avdl, this.f93067a, this.f93071e, this.f93068b, bArr));
    }

    /* renamed from: a */
    public final void mo51166a(avdl avdl, UdcCacheRequest udcCacheRequest) {
        this.f93070d.mo16659a(this.f93069c, new avbn(this.f93069c, avdl, this.f93067a, this.f93071e, new avfa(this), udcCacheRequest));
    }

    /* renamed from: b */
    public final void mo51171b(avdl avdl, byte[] bArr) {
        this.f93070d.mo16659a(this.f93069c, new avaz(this.f93069c, avdl, this.f93067a, this.f93071e, this.f93068b, bArr));
    }

    /* renamed from: c */
    public final void mo51173c(avdl avdl, byte[] bArr) {
        this.f93070d.mo16659a(this.f93069c, new avay(this.f93069c, avdl, this.f93067a, this.f93071e, this.f93068b, bArr));
    }

    /* renamed from: a */
    public final void mo51167a(avdl avdl, UdcSettingsListActivityRequest udcSettingsListActivityRequest) {
        this.f93070d.mo16659a(this.f93069c, new avbo(this.f93069c, avdl, this.f93067a, this.f93071e, udcSettingsListActivityRequest));
    }

    /* renamed from: a */
    public final void mo51168a(avdl avdl, UdcWriteLocalSettingsRequest udcWriteLocalSettingsRequest) {
        this.f93070d.mo16659a(this.f93069c, new avbz(this.f93069c, avdl, this.f93067a, this.f93071e, new avfb(this), udcWriteLocalSettingsRequest));
    }

    /* renamed from: a */
    public final void mo51169a(avdl avdl, byte[] bArr) {
        this.f93070d.mo16659a(this.f93069c, new avbb(this.f93069c, avdl, this.f93067a, this.f93071e, this.f93068b, bArr));
    }
}
