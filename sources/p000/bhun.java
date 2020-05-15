package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: bhun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhun {

    /* renamed from: a */
    public final C1245ok f119642a;

    /* renamed from: b */
    public final bvpf f119643b;

    /* renamed from: c */
    public final bhul f119644c;

    /* renamed from: d */
    public final bvmj[] f119645d;

    /* renamed from: e */
    public final int f119646e;

    /* renamed from: f */
    public final int f119647f;

    /* renamed from: g */
    public final brtm f119648g;

    public bhun(bvpf bvpf, int i, bhul bhul) {
        this(bvpf, i, m101565a(), bhul);
    }

    /* renamed from: a */
    private static bvmj[] m101565a() {
        bvmj[] bvmjArr = new bvmj[90];
        for (int i = 0; i < 90; i++) {
            bvmjArr[i] = bvmj.m121259a(i);
        }
        return bvmjArr;
    }

    public bhun(bvpf bvpf, int i, bvmj[] bvmjArr, bhul bhul) {
        C1245ok okVar;
        this.f119648g = null;
        this.f119647f = i;
        this.f119646e = bvpf.f157283d;
        this.f119644c = bhul;
        if (bvmjArr.length == 0) {
            this.f119645d = m101565a();
        } else {
            this.f119645d = bvmjArr;
        }
        bxwc bxwc = bvpf.f157282c;
        if (bxwc == null) {
            bhuj.m101555a().mo64360b("Missing first pass model.");
            okVar = new C1245ok();
        } else {
            C1245ok okVar2 = new C1245ok();
            int size = bxwc.size();
            for (int i2 = 0; i2 < size; i2++) {
                bvpi bvpi = (bvpi) bxwc.get(i2);
                okVar2.put(bvpi.f157300a, Float.valueOf((float) bvpi.f157301b));
            }
            okVar = okVar2;
        }
        this.f119642a = okVar;
        this.f119643b = bvpf;
    }

    public bhun(ByteBuffer byteBuffer, bhul bhul) {
        int i;
        C1245ok okVar;
        String str;
        double d;
        bvmj[] a = m101565a();
        this.f119643b = null;
        this.f119647f = 2;
        this.f119644c = bhul;
        brtm brtm = new brtm();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        brtm.__reset(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        this.f119648g = brtm;
        int __offset = brtm.__offset(8);
        if (__offset != 0) {
            i = brtm.f143329bb.getInt(__offset + brtm.bb_pos);
        } else {
            i = 0;
        }
        this.f119646e = i;
        if (a.length == 0) {
            this.f119645d = m101565a();
        } else {
            this.f119645d = a;
        }
        brtm brtm2 = this.f119648g;
        if (brtm2 == null || brtm2.mo69904M() == 0) {
            bhuj.m101555a().mo64360b("Missing first pass model in FB");
            okVar = new C1245ok();
        } else {
            okVar = new C1245ok();
            int M = brtm2.mo69904M();
            for (int i2 = 0; i2 < M; i2++) {
                brtm f = brtm2.mo69927f(i2);
                int __offset2 = f.__offset(4);
                if (__offset2 != 0) {
                    str = f.__string(__offset2 + f.bb_pos);
                } else {
                    str = null;
                }
                brtm f2 = brtm2.mo69927f(i2);
                int __offset3 = f2.__offset(6);
                if (__offset3 != 0) {
                    d = f2.f143329bb.getDouble(__offset3 + f2.bb_pos);
                } else {
                    d = 0.0d;
                }
                okVar.put(str, Float.valueOf((float) d));
            }
        }
        this.f119642a = okVar;
    }
}
