package p000;

import android.content.Context;
import android.os.Build;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: buvb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buvb implements bvbk {

    /* renamed from: a */
    public final buxb f155024a;

    /* renamed from: b */
    public final buzq f155025b;

    /* renamed from: c */
    public final AtomicBoolean f155026c = new AtomicBoolean(false);

    /* renamed from: d */
    public final buyx f155027d;

    public buvb(Context context, buzq buzq, buyx buyx) {
        this.f155024a = (buxb) ahgz.m55754a(context, buxb.class);
        this.f155025b = buzq;
        this.f155027d = buyx;
    }

    /* renamed from: a */
    public static void m120493a(Context context, buyq buyq) {
        int i = Build.VERSION.SDK_INT;
        buzq buzq = buyq.f155327c;
        if (buzq == null) {
            buzq = buzq.f155418c;
        }
        if ((buzq.f155420a & 1) != 0) {
            buzq buzq2 = buyq.f155327c;
            if (buzq2 == null) {
                buzq2 = buzq.f155418c;
            }
            if (!buzq2.f155421b.mo73779j()) {
                buxb buxb = (buxb) ahgz.m55755b(context, buxb.class);
                if (buxb == null || !buxb.mo73227b()) {
                    throw new bvdl(buxb.class, buvb.class);
                } else if ((buyq.f155325a & 8) != 0) {
                    buyx buyx = buyq.f155329e;
                    if (buyx == null) {
                        buyx = buyx.f155353d;
                    }
                    buyv a = buyv.m120788a(buyx.f155357c);
                    if (a == null) {
                        a = buyv.BLE_ADVERTISE_DATA_TYPE_UNKNOWN;
                    }
                    if (a == buyv.BLE_ADVERTISE_SCAN_RECORD) {
                        throw new bvdj("Requesting to advertise over BLE using the entire scan record is not a supported operation.");
                    }
                    return;
                } else {
                    return;
                }
            }
        }
        throw new bvdj("Advertise data is not set");
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo73128a() {
        return buyr.f155331c;
    }

    /* renamed from: a */
    public final void mo73129a(bvat bvat, bvda bvda) {
        this.f155024a.mo73220a(new buva(this, bvda));
    }

    /* renamed from: a */
    public final void mo73130a(bvda bvda) {
        if (this.f155026c.compareAndSet(true, false)) {
            buxb buxb = this.f155024a;
            srn srn = bvcm.f155598a;
            buxb.mo73221a((bvda) null, buxb.f155210h.f155270n);
        }
        this.f155024a.mo73225b(bvda);
    }
}
