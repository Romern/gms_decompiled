package p000;

import android.content.Context;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.apiservice.LifecycleSynchronizer;
import com.google.android.gms.smartdevice.directtransfer.DirectTransferOptions;

/* renamed from: arre */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arre extends arrl implements aaai, argv {

    /* renamed from: e */
    private static final asco f88173e = ascp.m73787a("TargetDirectTransferService");

    /* renamed from: a */
    public final Handler f88174a;

    /* renamed from: b */
    public final argg f88175b;

    /* renamed from: c */
    public final armn f88176c;

    /* renamed from: d */
    public boolean f88177d;

    /* renamed from: f */
    private final long f88178f = System.currentTimeMillis();

    /* renamed from: g */
    private final aaag f88179g;

    public arre(LifecycleSynchronizer lifecycleSynchronizer, arah arah, armb armb, Context context, Handler handler, String str, boolean z, boolean z2) {
        this.f88179g = aaag.m21014a(context, lifecycleSynchronizer, arpy.m73286a());
        this.f88174a = handler;
        armn a = armb.mo48626a(context);
        this.f88176c = a;
        a.mo48661a(str, z, z2);
        this.f88175b = arah.mo48331a(new arai(context, handler, this.f88176c, this));
    }

    /* renamed from: a */
    public final void mo48401a() {
        int i = spn.f44932a;
        f88173e.mo25414c("Completed", new Object[0]);
        this.f88176c.mo48665b(true);
        mo48772b();
    }

    /* renamed from: b */
    public final void mo48772b() {
        this.f88176c.mo48664b(System.currentTimeMillis() - this.f88178f);
        this.f88177d = true;
    }

    /* renamed from: a */
    public final void mo48402a(int i) {
        int i2 = spn.f44932a;
        f88173e.mo25418e("error %d", Integer.valueOf(i));
        f88173e.mo25412b("%s", araj.m72321a(i));
        armn armn = this.f88176c;
        armn.mo48665b(false);
        armn.mo48658a(i);
        mo48772b();
    }

    /* renamed from: a */
    public final void mo48770a(arrh arrh) {
        this.f88179g.mo16658a(new arrb(arrh, this.f88175b, this.f88174a));
    }

    /* renamed from: a */
    public final void mo48771a(arrh arrh, DirectTransferOptions directTransferOptions, ParcelFileDescriptor[] parcelFileDescriptorArr, arik arik) {
        this.f88179g.mo16658a(new arrd(arrh, this.f88175b, directTransferOptions, parcelFileDescriptorArr, new aqzq(arik), this.f88174a));
    }
}
