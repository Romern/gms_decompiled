package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bdxi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdxi implements bqeg {

    /* renamed from: a */
    final List f106577a = new ArrayList();

    /* renamed from: b */
    long f106578b = -1;

    /* renamed from: c */
    int f106579c = 0;

    /* renamed from: d */
    int f106580d = 0;

    /* renamed from: e */
    int f106581e = 0;

    /* renamed from: f */
    int f106582f = 0;

    /* renamed from: g */
    final /* synthetic */ bdxj f106583g;

    /* renamed from: h */
    final bbis f106584h = new bbis();

    public bdxi(bdxj bdxj) {
        this.f106583g = bdxj;
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        return bqdx.m112674a(bdrg.m91328a(((bbnn) this.f106583g.f106591g.mo6606a()).mo56235a(), "FootprintsUploadBufferImpl"), new bdww(this), this.f106583g.f106587c);
    }

    /* renamed from: b */
    public final bqgg mo58415b() {
        return bqdx.m112674a(this.f106583g.f106586b.mo58418a(), new bdwz(this), this.f106583g.f106587c);
    }

    /* renamed from: c */
    public final bxpa mo58416c() {
        bxvd da = bxpa.f164219h.mo74144da();
        int a = (int) abry.m48160a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxpa bxpa = (bxpa) da.f164949b;
        int i = bxpa.f164221a | 1;
        bxpa.f164221a = i;
        bxpa.f164222b = a;
        int i2 = this.f106579c;
        int i3 = i | 2;
        bxpa.f164221a = i3;
        bxpa.f164223c = i2;
        int i4 = this.f106580d;
        int i5 = i3 | 4;
        bxpa.f164221a = i5;
        bxpa.f164225e = i4;
        int i6 = this.f106581e;
        int i7 = i5 | 8;
        bxpa.f164221a = i7;
        bxpa.f164226f = i6;
        int i8 = this.f106582f;
        bxpa.f164221a = i7 | 16;
        bxpa.f164227g = i8;
        if (this.f106578b != -1) {
            List list = this.f106577a;
            int size = list.size();
            for (int i9 = 0; i9 < size; i9++) {
                bxvd da2 = bxoz.f164215c.mo74144da();
                long longValue = this.f106578b - ((Long) list.get(i9)).longValue();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bxoz bxoz = (bxoz) da2.f164949b;
                bxoz.f164217a |= 1;
                bxoz.f164218b = longValue;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxpa bxpa2 = (bxpa) da.f164949b;
                bxoz bxoz2 = (bxoz) da2.mo74062i();
                bxoz2.getClass();
                if (!bxpa2.f164224d.mo73666a()) {
                    bxpa2.f164224d = GeneratedMessageLite.m124021a(bxpa2.f164224d);
                }
                bxpa2.f164224d.add(bxoz2);
            }
        }
        return (bxpa) da.mo74062i();
    }

    /* renamed from: a */
    public final bqgg mo58414a(bqgg bqgg, bbnm bbnm) {
        return bqdx.m112673a(bqdf.m112620a(bqfl.m112747c(bqgg), Exception.class, new bdxc(this, bbnm), this.f106583g.f106587c), new bdxd(this, bbnm), this.f106583g.f106587c);
    }
}
