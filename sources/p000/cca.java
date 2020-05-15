package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: cca */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cca extends cpu implements Cloneable {

    /* renamed from: r */
    private final ccd f6451r;

    /* renamed from: s */
    private final Class f6452s;

    /* renamed from: t */
    private final cbr f6453t;

    /* renamed from: u */
    private cce f6454u;

    /* renamed from: v */
    private Object f6455v;

    /* renamed from: w */
    private List f6456w;

    /* renamed from: x */
    private boolean f6457x;

    static {
        new cpu().mo8099a(cfn.f6710b).mo8095a(cbs.LOW).mo8106d();
    }

    protected cca(cbo cbo, ccd ccd, Class cls) {
        this.f6451r = ccd;
        this.f6452s = cls;
        cbr cbr = ccd.f6462a.f6404b;
        cce cce = (cce) cbr.f6427e.get(cls);
        if (cce == null) {
            for (Map.Entry entry : cbr.f6427e.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    cce = (cce) entry.getValue();
                }
            }
        }
        this.f6454u = cce == null ? cbr.f6423a : cce;
        this.f6453t = cbo.f6404b;
        for (cpw cpw : ccd.f6465d) {
            if (cpw != null) {
                if (this.f6456w == null) {
                    this.f6456w = new ArrayList();
                }
                this.f6456w.add(cpw);
            }
        }
        mo3677b(ccd.mo3690f());
    }

    /* renamed from: a */
    public final cca clone() {
        cca cca = (cca) super.clone();
        cca.f6454u = cca.f6454u.clone();
        return cca;
    }

    /* renamed from: a */
    public final void mo3675a(Object obj) {
        this.f6455v = obj;
        this.f6457x = true;
    }

    /* renamed from: a */
    public final cca mo3677b(cpu cpu) {
        crb.m7382a(cpu);
        return (cca) super.mo3677b(cpu);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006f  */
    /* renamed from: a */
    public final void mo3673a(ImageView imageView) {
        cpu cpu;
        Class cls;
        cqf cqf;
        crd.m7393a();
        crb.m7382a(imageView);
        if (!cpu.m7266a(this.f11788a, 2048) && this.f11797j && imageView.getScaleType() != null) {
            switch (cbz.f6446a[imageView.getScaleType().ordinal()]) {
                case 1:
                    cpu = clone().mo8100a(cmb.f7042c, new clp());
                    break;
                case 2:
                    cpu = clone().mo8105c();
                    break;
                case 3:
                case 4:
                case 5:
                    cpu = super.mo8104b(cmb.f7040a, new cmj());
                    break;
                case 6:
                    cpu = clone().mo8105c();
                    break;
            }
            cls = this.f6452s;
            if (!Bitmap.class.equals(cls)) {
                cqf = new cqa(imageView);
            } else if (Drawable.class.isAssignableFrom(cls)) {
                cqf = new cqc(imageView);
            } else {
                String valueOf = String.valueOf(cls);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 64);
                sb.append("Unhandled class: ");
                sb.append(valueOf);
                sb.append(", try .as*(Class).transcode(ResourceTranscoder)");
                throw new IllegalArgumentException(sb.toString());
            }
            mo3674a(cqf, cpu, cqv.f11864a);
        }
        cpu = this;
        cls = this.f6452s;
        if (!Bitmap.class.equals(cls)) {
        }
        mo3674a(cqf, cpu, cqv.f11864a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007a, code lost:
        if (r4 != r13) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007c, code lost:
        if (r5 != r14) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0082, code lost:
        if (p000.crd.m7399b(r6, r11) == false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0088, code lost:
        if (r7.equals(r0) == false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008e, code lost:
        if (r8.equals(r1) == false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0090, code lost:
        if (r9 != r2) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0092, code lost:
        if (r10 != r3) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0096, code lost:
        if (r15.f11792e != false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009c, code lost:
        if (r17.mo8115e() != false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009e, code lost:
        p000.crb.m7382a(r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a5, code lost:
        if (r17.mo8114d() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a7, code lost:
        r17.mo8111a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo3674a(cqf cqf, cpu cpu, Executor executor) {
        cpy cpy;
        int i;
        int i2;
        cpu cpu2 = cpu;
        crb.m7382a(cqf);
        if (this.f6457x) {
            Object obj = new Object();
            cce cce = this.f6454u;
            cbs cbs = cpu2.f11791d;
            int i3 = cpu2.f11794g;
            int i4 = cpu2.f11793f;
            cbr cbr = this.f6453t;
            Object obj2 = this.f6455v;
            Class cls = this.f6452s;
            List list = this.f6456w;
            cfu cfu = cbr.f6428f;
            cqj cqj = cce.f6473a;
            cpy cpy2 = r14;
            cpy cpy3 = new cpy(cbr, obj, obj2, cls, cpu, i3, i4, cbs, cqf, list, cfu, executor);
            cpv a = cqf.mo8123a();
            if (!(a instanceof cpy)) {
                cpy = cpy2;
            } else {
                synchronized (cpy2.f11814a) {
                    int i5 = cpy2.f11818e;
                    int i6 = cpy2.f11819f;
                    Object obj3 = cpy2.f11815b;
                    Class cls2 = cpy2.f11816c;
                    cpu cpu3 = cpy2.f11817d;
                    cbs cbs2 = cpy2.f11820g;
                    List list2 = cpy2.f11821h;
                    if (list2 != null) {
                        i = list2.size();
                    } else {
                        i = 0;
                    }
                }
                cpy cpy4 = (cpy) a;
                synchronized (cpy4.f11814a) {
                    try {
                        int i7 = cpy4.f11818e;
                        int i8 = cpy4.f11819f;
                        Object obj4 = cpy4.f11815b;
                        cpy = cpy2;
                        Class cls3 = cpy4.f11816c;
                        try {
                            cpu cpu4 = cpy4.f11817d;
                            cpv cpv = a;
                            cbs cbs3 = cpy4.f11820g;
                            List list3 = cpy4.f11821h;
                            if (list3 != null) {
                                i2 = list3.size();
                            } else {
                                i2 = 0;
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            }
            this.f6451r.mo3683a(cqf);
            cqf.mo8124a((cpv) cpy);
            this.f6451r.mo3684a(cqf, cpy);
            return;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }
}
