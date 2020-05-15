package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.apiservice.LifecycleSynchronizer;
import com.google.android.gms.smartdevice.directtransfer.DirectTransferConfigurations;

/* renamed from: arqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arqy extends arrj implements aaai, argv {

    /* renamed from: a */
    public armh f88150a;

    /* renamed from: b */
    public long f88151b;

    /* renamed from: c */
    private final arah f88152c;

    /* renamed from: d */
    private final armb f88153d;

    /* renamed from: e */
    private final Context f88154e;

    /* renamed from: f */
    private final Handler f88155f;

    /* renamed from: g */
    private final String f88156g;

    /* renamed from: h */
    private final boolean f88157h;

    /* renamed from: i */
    private final boolean f88158i;

    /* renamed from: j */
    private ardc f88159j;

    /* renamed from: k */
    private final aaag f88160k;

    public arqy(LifecycleSynchronizer lifecycleSynchronizer, arah arah, armb armb, Context context, Handler handler, String str, boolean z, boolean z2) {
        this.f88160k = aaag.m21014a(context, lifecycleSynchronizer, arpy.m73286a());
        this.f88152c = arah;
        this.f88153d = armb;
        this.f88154e = context;
        this.f88155f = handler;
        this.f88156g = str;
        this.f88157h = z;
        this.f88158i = z2;
        m73321c();
    }

    /* renamed from: a */
    public static void m73320a(armh armh, long j) {
        armh.mo48648b(System.currentTimeMillis() - j);
        if (!spn.m35859a()) {
            armh.mo48641a();
        }
    }

    /* renamed from: c */
    private final ardc m73321c() {
        ardc ardc = this.f88159j;
        if (ardc != null) {
            return ardc;
        }
        armh b = this.f88153d.mo48627b(this.f88154e);
        b.mo48645a(this.f88156g, this.f88157h, this.f88158i);
        this.f88151b = System.currentTimeMillis();
        ardc b2 = this.f88152c.mo48332b(new arai(this.f88154e, this.f88155f, b, this, this.f88156g));
        this.f88159j = b2;
        this.f88150a = b;
        return b2;
    }

    /* renamed from: b */
    public final synchronized void mo48766b() {
        this.f88150a = null;
        ardc ardc = this.f88159j;
        if (ardc != null) {
            this.f88155f.post(new arqr(ardc));
        }
        this.f88159j = null;
    }

    /* renamed from: a */
    public final void mo48401a() {
        int i = spn.f44932a;
        armh armh = this.f88150a;
        if (armh != null) {
            armh.mo48649b(true);
            m73320a(armh, this.f88151b);
            long k = cgqs.m146605k();
            if (k < 0) {
                mo48766b();
            } else {
                this.f88155f.postDelayed(new arqq(this), k);
            }
        }
    }

    /* renamed from: a */
    public final void mo48402a(int i) {
        int i2 = spn.f44932a;
        armh armh = this.f88150a;
        if (armh != null) {
            armh.mo48649b(false);
            armh.mo48647b(i);
            m73320a(armh, this.f88151b);
            mo48766b();
        }
    }

    /* renamed from: a */
    public final void mo48763a(arrh arrh) {
        this.f88160k.mo16658a(new arqt(arrh, m73321c(), this.f88155f));
    }

    /* renamed from: a */
    public final void mo48764a(arrh arrh, Bundle bundle) {
        this.f88160k.mo16658a(new arqv(arrh, bundle, m73321c(), this.f88155f));
    }

    /* renamed from: a */
    public final void mo48765a(arrh arrh, DirectTransferConfigurations directTransferConfigurations, ParcelFileDescriptor[] parcelFileDescriptorArr, arik arik) {
        this.f88160k.mo16658a(new arqx(arrh, directTransferConfigurations, parcelFileDescriptorArr, new aqzq(arik), m73321c(), this.f88155f));
    }
}
