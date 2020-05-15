package p000;

import com.google.android.gms.awareness.fence.AwarenessFence;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;

/* renamed from: lrl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lrl {
    /* renamed from: a */
    public static AwarenessFence m19591a(double d, double d2, double d3, long j) {
        boolean z;
        int i = (int) (d * 1.0E7d);
        int i2 = (int) (d2 * 1.0E7d);
        if (d3 >= 0.0d) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        bxvd da = bxdn.f163044j.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxdn bxdn = (bxdn) da.f164949b;
        bxdn.f163047b = 1;
        int i3 = bxdn.f163046a | 1;
        bxdn.f163046a = i3;
        bxdn.f163048c = 1;
        int i4 = i3 | 2;
        bxdn.f163046a = i4;
        int i5 = i4 | 4;
        bxdn.f163046a = i5;
        bxdn.f163049d = 0;
        int i6 = i5 | 128;
        bxdn.f163046a = i6;
        bxdn.f163054i = j;
        int i7 = i6 | 8;
        bxdn.f163046a = i7;
        bxdn.f163050e = i;
        int i8 = i7 | 16;
        bxdn.f163046a = i8;
        bxdn.f163051f = i2;
        int i9 = i8 | 32;
        bxdn.f163046a = i9;
        bxdn.f163052g = d3;
        bxdn.f163046a = i9 | 64;
        bxdn.f163053h = d3;
        tkw tkw = new tkw((bxdn) da.mo74062i());
        sdo.m34959a(tkw);
        bxcj bxcj = (bxcj) bxcm.f162813z.mo74144da();
        bxcl bxcl = bxcl.LOCATION_FENCE;
        if (bxcj.f164950c) {
            bxcj.mo74035c();
            bxcj.f164950c = false;
        }
        bxcm bxcm = (bxcm) bxcj.f164949b;
        bxcm.f162815b = bxcl.f162810z;
        int i10 = bxcm.f162814a | 1;
        bxcm.f162814a = i10;
        bxdn bxdn2 = tkw.f46230a;
        bxdn2.getClass();
        bxcm.f162818e = bxdn2;
        bxcm.f162814a = i10 | 4;
        return new ContextFenceStub((bxcm) bxcj.mo74062i());
    }
}
