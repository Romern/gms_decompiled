package p000;

import android.util.Log;
import java.nio.ByteBuffer;
import java.util.UUID;

/* renamed from: bdsw */
final /* synthetic */ class bdsw implements bqeh {

    /* renamed from: a */
    private final bdtd f106385a;

    /* renamed from: b */
    private final bdtm f106386b;

    public bdsw(bdtd bdtd, bdtm bdtm) {
        this.f106385a = bdtd;
        this.f106386b = bdtm;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bmxv bmxv;
        boolean z;
        bmxv bmxv2;
        bqgg bqgg;
        bxph bxph;
        bmxv bmxv3;
        bxph bxph2;
        bdtd bdtd = this.f106385a;
        bdtm bdtm = this.f106386b;
        bxpj bxpj = (bxpj) obj;
        if (bxpj.f164279d.size() != 1) {
            return bqga.m112777a((Throwable) new bdtf());
        }
        bxpi bxpi = (bxpi) bnjd.m109587b(bxpj.f164279d);
        if ((bxpj.f164276a & 1) != 0) {
            bmxv = bmxv.m108566b(bxpj.f164277b);
        } else {
            bmxv = bmvz.f131120a;
        }
        int i = bxpi.f164272a;
        if (i == 1) {
            z = true;
        } else {
            if (i == 2) {
                bxph2 = (bxph) bxpi.f164273b;
            } else {
                bxph2 = bxph.f164267b;
            }
            z = bxph2.f164269a.size() > 0;
        }
        bdtd.f106400d = Boolean.valueOf(z);
        int i2 = bxpi.f164272a;
        if (i2 == 1) {
            bxog bxog = bdtd.f106399c;
            bxvd da = bxoi.f164154c.mo74144da();
            bxuo bxuo = bxuo.f164865a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxoi bxoi = (bxoi) da.f164949b;
            bxuo.getClass();
            bxoi.f164157b = bxuo;
            bxoi.f164156a = 1;
            bxog.mo73594a(da);
            bqgg = bqga.m112771a(new bdsy(bdtd), bdtd.f106398b);
            bmxv2 = bmxv;
        } else if (i2 == 2) {
            bxwc bxwc = ((bxph) bxpi.f164273b).f164269a;
            bngs j = bngx.m109377j();
            int size = bxwc.size();
            int i3 = 0;
            while (i3 < size) {
                bxtx bxtx = (bxtx) bxwc.get(i3);
                if (bxtx.mo73744a() != 16) {
                    Log.w("DeletionsDownloader", "Ignored UUID with invalid length");
                    bmxv3 = bmxv;
                } else {
                    ByteBuffer e = bxtx.mo73760e();
                    bmxv3 = bmxv;
                    j.mo67668c(new UUID(e.getLong(), e.getLong()));
                }
                i3++;
                bmxv = bmxv3;
            }
            bmxv2 = bmxv;
            bngx a = j.mo67664a();
            if (bxpi.f164272a == 2) {
                bxph = (bxph) bxpi.f164273b;
            } else {
                bxph = bxph.f164267b;
            }
            int size2 = bxph.f164269a.size();
            int size3 = a.size();
            bxog bxog2 = bdtd.f106399c;
            bxvd da2 = bxoi.f164154c.mo74144da();
            bxvd da3 = bxoh.f164149d.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bxoh bxoh = (bxoh) da3.f164949b;
            int i4 = bxoh.f164151a | 1;
            bxoh.f164151a = i4;
            bxoh.f164152b = size2;
            bxoh.f164151a = i4 | 2;
            bxoh.f164153c = size3;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bxoi bxoi2 = (bxoi) da2.f164949b;
            bxoh bxoh2 = (bxoh) da3.mo74062i();
            bxoh2.getClass();
            bxoi2.f164157b = bxoh2;
            bxoi2.f164156a = 2;
            bxog2.mo73594a(da2);
            if (a.isEmpty()) {
                bqgg = bqga.m112775a((Object) null);
            } else {
                bqgg = bqga.m112771a(new bdsz(bdtd, a), bdtd.f106398b);
            }
        } else {
            bmxv2 = bmxv;
            bxog bxog3 = bdtd.f106399c;
            bxoi bxoi3 = bxoi.f164154c;
            if (bxog3.f164950c) {
                bxog3.mo74035c();
                bxog3.f164950c = false;
            }
            bxoj bxoj = (bxoj) bxog3.f164949b;
            bxoj bxoj2 = bxoj.f164158b;
            bxoi3.getClass();
            bxoj.mo73595a();
            bxoj.f164160a.add(bxoi3);
            bqgg = bqga.m112775a((Object) null);
        }
        return bqdx.m112674a(bqdf.m112620a(bqgg, Exception.class, bdta.f106391a, bdtd.f106401e.f106415i), new bdtb(bdtd, bdtm, bmxv2, bxpj), bdtd.f106401e.f106415i);
    }
}
