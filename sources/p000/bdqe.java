package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bdqe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdqe {

    /* renamed from: a */
    public final bdqd f106256a;

    /* renamed from: b */
    public final List f106257b = new ArrayList();

    /* renamed from: c */
    private long f106258c;

    public bdqe(bdqd bdqd) {
        this.f106256a = bdqd;
        this.f106258c = 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00df A[LOOP:0: B:27:0x00d9->B:29:0x00df, LOOP_END] */
    /* renamed from: a */
    public final void mo58295a(bdqd bdqd, long j) {
        bdqd bdqd2 = bdqd;
        List<bdqd> list = bdqd2.f106253e;
        bdqd2.f106253e = bdqc.f106248a;
        if (!bdqd.mo58294a() || !list.isEmpty()) {
            long j2 = this.f106258c;
            this.f106258c = 1 + j2;
            bxvd da = cinx.f190993m.mo74144da();
            int i = bdqd2.f106254f;
            String str = bdqd2.f106249a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cinx cinx = (cinx) da.f164949b;
            str.getClass();
            int i2 = cinx.f190995a | 1;
            cinx.f190995a = i2;
            cinx.f190996b = str;
            long j3 = bdqd2.f106250b;
            int i3 = i2 | 32;
            cinx.f190995a = i3;
            cinx.f191001g = j3;
            long j4 = bdqd2.f106251c;
            long j5 = j4 != -1 ? j4 - j3 : -1;
            int i4 = i3 | 64;
            cinx.f190995a = i4;
            cinx.f191002h = j5;
            long j6 = bdqd2.f106252d;
            int i5 = i4 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            cinx.f190995a = i5;
            cinx.f191004j = j6;
            int i6 = i5 | 8;
            cinx.f190995a = i6;
            cinx.f190999e = j2;
            int i7 = i6 | 16;
            cinx.f190995a = i7;
            cinx.f191000f = j;
            int i8 = bdqd2.f106255g - 1;
            if (i8 == 1) {
                cinx.f191005k = 1;
            } else if (i8 != 3) {
                cinx.f191005k = 0;
                cinx.f190995a = i7 | 512;
                cinx cinx2 = (cinx) da.mo74062i();
                bxvd bxvd = (bxvd) cinx2.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) cinx2);
                if (bdqd.mo58294a()) {
                    long j7 = ((bdqd) list.get(list.size() - 1)).f106251c - bdqd2.f106250b;
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    cinx cinx3 = (cinx) bxvd.f164949b;
                    cinx3.f190995a |= 64;
                    cinx3.f191002h = j7;
                }
                this.f106257b.add((cinx) bxvd.mo74062i());
                for (bdqd bdqd3 : list) {
                    mo58295a(bdqd3, ((cinx) bxvd.f164949b).f190999e);
                }
            } else {
                cinx.f191005k = 4;
            }
            cinx.f190995a = i7 | 512;
            cinx cinx22 = (cinx) da.mo74062i();
            bxvd bxvd2 = (bxvd) cinx22.mo74142c(5);
            bxvd2.mo73625a((GeneratedMessageLite) cinx22);
            if (bdqd.mo58294a()) {
            }
            this.f106257b.add((cinx) bxvd2.mo74062i());
            while (r1.hasNext()) {
            }
        }
    }
}
