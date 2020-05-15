package p000;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: bbez */
final /* synthetic */ class bbez implements Callable {

    /* renamed from: a */
    private final bbfc f102522a;

    /* renamed from: b */
    private final Map f102523b;

    /* renamed from: c */
    private final Map f102524c;

    /* renamed from: d */
    private final AtomicLong f102525d;

    /* renamed from: e */
    private final int f102526e;

    public bbez(bbfc bbfc, Map map, Map map2, AtomicLong atomicLong, int i) {
        this.f102522a = bbfc;
        this.f102523b = map;
        this.f102524c = map2;
        this.f102525d = atomicLong;
        this.f102526e = i;
    }

    public final Object call() {
        bbfc bbfc = this.f102522a;
        Map map = this.f102523b;
        Map map2 = this.f102524c;
        AtomicLong atomicLong = this.f102525d;
        int i = this.f102526e;
        bxvd da = bpxv.f139787g.mo74144da();
        for (String str : map.keySet()) {
            List c = bmyx.m108643a("|").mo66925c((CharSequence) str);
            Integer num = (Integer) map2.get(str);
            if (num == null) {
                num = -1;
            }
            bxvd da2 = bpwz.f139594g.mo74144da();
            String str2 = (String) c.get(0);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpwz bpwz = (bpwz) da2.f164949b;
            str2.getClass();
            bpwz.f139596a |= 1;
            bpwz.f139597b = str2;
            String str3 = (String) c.get(1);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpwz bpwz2 = (bpwz) da2.f164949b;
            str3.getClass();
            bpwz2.f139596a |= 4;
            bpwz2.f139599d = str3;
            int intValue = num.intValue();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpwz bpwz3 = (bpwz) da2.f164949b;
            bpwz3.f139596a |= 2;
            bpwz3.f139598c = intValue;
            bpwz bpwz4 = (bpwz) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpxv bpxv = (bpxv) da.f164949b;
            bpwz4.getClass();
            if (!bpxv.f139790b.mo73666a()) {
                bpxv.f139790b = bxvk.m124021a(bpxv.f139790b);
            }
            bpxv.f139790b.add(bpwz4);
            bbfb bbfb = (bbfb) map.get(str);
            long j = bbfb.f102528a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpxv bpxv2 = (bpxv) da.f164949b;
            if (!bpxv2.f139791c.mo73666a()) {
                bpxv2.f139791c = bxvk.m124020a(bpxv2.f139791c);
            }
            bpxv2.f139791c.mo74161a(j);
            long j2 = bbfb.f102529b;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpxv bpxv3 = (bpxv) da.f164949b;
            if (!bpxv3.f139792d.mo73666a()) {
                bpxv3.f139792d = bxvk.m124020a(bpxv3.f139792d);
            }
            bpxv3.f139792d.mo74161a(j2);
        }
        long j3 = atomicLong.get();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpxv bpxv4 = (bpxv) da.f164949b;
        bpxv4.f139789a |= 1;
        bpxv4.f139793e = j3;
        long j4 = 0;
        try {
            Uri a = bbfd.m87918a(bbfc.f102534e, bbfc.f102536g);
            if (bbfc.f102532c.mo60647c(a)) {
                j4 = ((Long) bbfc.f102532c.mo60643a(a, behu.m95068a(), new beer[0])).longValue();
            }
        } catch (IOException e) {
            bbev.m87908a(e, "%s: Failed to call Mobstore to compute MDD Directory bytes used!", "StorageLogger");
            bbfc.f102535f.mo55999a("Failed to call Mobstore to compute MDD Directory bytes used!", e);
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpxv bpxv5 = (bpxv) da.f164949b;
        bpxv5.f139789a |= 2;
        bpxv5.f139794f = j4;
        bbfc.f102533d.mo34986a((bpxv) da.mo74062i(), i);
        return null;
    }
}
