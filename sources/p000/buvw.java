package p000;

import android.content.Context;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: buvw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buvw implements bvbk {

    /* renamed from: e */
    public static final /* synthetic */ int f155099e = 0;

    /* renamed from: a */
    public final buxb f155100a;

    /* renamed from: b */
    public final buzh f155101b;

    /* renamed from: c */
    public final buzq f155102c;

    /* renamed from: d */
    public final AtomicBoolean f155103d = new AtomicBoolean(false);

    static {
        Collections.singleton(bzbu.BLUETOOTH_CLASSIC_NAME);
    }

    public buvw(Context context, buzh buzh, buzq buzq) {
        this.f155100a = (buxb) ahgz.m55754a(context, buxb.class);
        this.f155101b = buzh;
        this.f155102c = buzq;
    }

    /* renamed from: a */
    public static void m120547a(Context context, buyq buyq) {
        int i;
        buzh buzh = buyq.f155328d;
        if (buzh == null) {
            buzh = buzh.f155378c;
        }
        buzq buzq = buyq.f155327c;
        if (buzq == null) {
            buzq = buzq.f155418c;
        }
        if (!(buzh == null || (buzh.f155380a & 1) == 0)) {
            buzi buzi = buzh.f155381b;
            if (buzi == null) {
                buzi = buzi.f155382d;
            }
            if (!((buzi.f155384a & 1) == 0 || buzi.f155385b.length() <= 0 || buzq == null || (buzq.f155420a & 1) == 0 || ((buzi.f155384a & 2) != 0 && (i = buzi.f155386c) != 0 && i != buzq.f155421b.mo73744a()))) {
                buxb buxb = (buxb) ahgz.m55755b(context, buxb.class);
                if (buxb == null || !buxb.mo73224a()) {
                    throw new bvdl(buxb.class, buvw.class);
                }
                return;
            }
        }
        throw new bvdj("Data to advertise on bluetooth name is not correctly set");
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo73128a() {
        return buyr.f155331c;
    }

    /* renamed from: a */
    public final void mo73129a(bvat bvat, bvda bvda) {
        this.f155100a.mo73220a(new buvv(this, bvda));
    }

    /* renamed from: a */
    public final void mo73130a(bvda bvda) {
        if (this.f155103d.compareAndSet(true, false)) {
            buxb buxb = this.f155100a;
            srn srn = bvcm.f155598a;
            buxv buxv = buxb.f155210h;
            buxb.mo73221a((bvda) null, buxv.f155269m, buxv.f155271o);
        }
        this.f155100a.mo73225b(bvda);
    }
}
