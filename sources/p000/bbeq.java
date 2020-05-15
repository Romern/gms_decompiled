package p000;

import android.util.Pair;
import java.util.List;

/* renamed from: bbeq */
public final /* synthetic */ class bbeq implements bqeh {

    /* renamed from: a */
    private final bbeu f102495a;

    /* renamed from: b */
    private final int f102496b;

    public bbeq(bbeu bbeu, int i) {
        this.f102495a = bbeu;
        this.f102496b = i;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbeu bbeu = this.f102495a;
        int i = this.f102496b;
        bqgg a = bqga.m112775a((Object) null);
        bqgg bqgg = a;
        for (Pair pair : (List) obj) {
            bavr bavr = (bavr) pair.first;
            bavd bavd = (bavd) pair.second;
            if (bavd != null) {
                bxvd da = bpwz.f139594g.mo74144da();
                String str = bavr.f101919b;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpwz bpwz = (bpwz) da.f164949b;
                str.getClass();
                int i2 = bpwz.f139596a | 1;
                bpwz.f139596a = i2;
                bpwz.f139597b = str;
                String str2 = bavr.f101920c;
                str2.getClass();
                int i3 = i2 | 4;
                bpwz.f139596a = i3;
                bpwz.f139599d = str2;
                int i4 = bavd.f101875e;
                bpwz.f139596a = i3 | 2;
                bpwz.f139598c = i4;
                int size = bavd.f101880j.size();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpwz bpwz2 = (bpwz) da.f164949b;
                bpwz2.f139596a |= 8;
                bpwz2.f139600e = size;
                boolean z = !bavr.f101921d.isEmpty();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpwz bpwz3 = (bpwz) da.f164949b;
                bpwz3.f139596a |= 16;
                bpwz3.f139601f = z;
                bqgg = bqdx.m112674a(bqgg, new bbes(bbeu, bavd, bavr, (bpwz) da.mo74062i(), i), bbeu.f102509d);
            }
        }
        return bqgg;
    }
}
