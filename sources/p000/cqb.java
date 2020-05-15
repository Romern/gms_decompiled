package p000;

import android.graphics.Bitmap;
import android.os.Handler;

/* renamed from: cqb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cqb implements cqf {

    /* renamed from: a */
    public final int f11835a;

    /* renamed from: b */
    public Bitmap f11836b;

    /* renamed from: c */
    private cpv f11837c;

    /* renamed from: d */
    private final Handler f11838d;

    /* renamed from: e */
    private final long f11839e;

    /* renamed from: a */
    public final cpv mo8123a() {
        return this.f11837c;
    }

    /* renamed from: a */
    public final void mo8124a(cpv cpv) {
        this.f11837c = cpv;
    }

    /* renamed from: b */
    public final void mo8125b() {
        this.f11836b = null;
    }

    /* renamed from: b */
    public final void mo8132b(cqe cqe) {
    }

    /* renamed from: c */
    public final void mo3687c() {
    }

    /* renamed from: d */
    public final void mo3688d() {
    }

    /* renamed from: e */
    public final void mo3689e() {
    }

    /* renamed from: f */
    public final void mo8126f() {
    }

    /* renamed from: g */
    public final void mo8127g() {
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ void mo8133k(Object obj) {
        this.f11836b = (Bitmap) obj;
        this.f11838d.sendMessageAtTime(this.f11838d.obtainMessage(1, this), this.f11839e);
    }

    public cqb() {
        if (!crd.m7394a(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            StringBuilder sb = new StringBuilder(111);
            sb.append("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo8131a(cqe cqe) {
        cqe.mo8122a(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public cqb(Handler handler, int i, long j) {
        if (crd.m7394a(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            this.f11838d = handler;
            this.f11835a = i;
            this.f11839e = j;
            return;
        }
        StringBuilder sb = new StringBuilder(111);
        sb.append("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        throw new IllegalArgumentException(sb.toString());
    }
}
