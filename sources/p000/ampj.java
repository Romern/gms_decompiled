package p000;

import android.net.Uri;
import android.os.Binder;
import com.google.android.gms.common.internal.ClientContext;
import java.util.List;

/* renamed from: ampj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ampj extends also implements aaai {

    /* renamed from: a */
    private final aaag f75662a;

    /* renamed from: b */
    private final zzx f75663b;

    /* renamed from: c */
    private final String f75664c;

    public ampj(zzx zzx, aaag aaag, String str) {
        this.f75663b = zzx;
        this.f75662a = aaag;
        this.f75664c = str;
    }

    /* renamed from: a */
    public final void mo40713a(alss alss) {
        this.f75662a.mo16658a(new amqj(alss, this.f75663b, this.f75664c));
    }

    /* renamed from: b */
    public final void mo40718b(alss alss) {
        this.f75662a.mo16658a(new amqg(alss, this.f75663b, this.f75664c));
    }

    /* renamed from: c */
    public final void mo40720c(alss alss) {
        this.f75662a.mo16658a(new amqh(alss, this.f75663b, this.f75664c));
    }

    /* renamed from: a */
    public final void mo40714a(alss alss, Uri uri) {
        this.f75662a.mo16658a(new amqq(alss, this.f75663b, this.f75664c, uri));
    }

    /* renamed from: b */
    public final void mo40719b(alss alss, int[] iArr) {
        this.f75662a.mo16658a(new amqk(alss, this.f75663b, iArr));
    }

    /* renamed from: a */
    public final void mo40715a(alss alss, String str) {
        this.f75662a.mo16658a(new amqi(alss, this.f75663b, str, this.f75664c));
    }

    /* renamed from: a */
    public final void mo40716a(alss alss, List list, String str) {
        aaag aaag = this.f75662a;
        zzx zzx = this.f75663b;
        ClientContext clientContext = new ClientContext();
        clientContext.f30215e = this.f75664c;
        clientContext.f30220j = Binder.getCallingPid();
        clientContext.f30212b = Binder.getCallingUid();
        aaag.mo16658a(new almf(zzx, clientContext, list, alss, almc.m61252a(this.f75663b), almk.m61263a(), str));
    }

    /* renamed from: a */
    public final void mo40717a(alss alss, int[] iArr) {
        this.f75662a.mo16658a(new amqe(alss, this.f75663b, iArr));
    }
}
