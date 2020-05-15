package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: bsks */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsks implements bsla {

    /* renamed from: a */
    public static final bsks f144892a = new bsks();

    private bsks() {
    }

    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.List, java.util.Collection], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo70665a(Collection r14) {
        int i;
        bxvd bxvd;
        boolean z;
        boolean z2;
        HashMap hashMap = new HashMap();
        int size = r14.size();
        int i2 = 0;
        while (i2 < size) {
            bxwc bxwc = ((byty) r14.get(i2)).f167734b;
            int size2 = bxwc.size();
            int i3 = 0;
            while (true) {
                i = i2 + 1;
                if (i3 >= size2) {
                    break;
                }
                bytw bytw = (bytw) bxwc.get(i3);
                if (hashMap.containsKey(bytw.f167728b)) {
                    bxvd = (bxvd) hashMap.get(bytw.f167728b);
                } else {
                    bxvd = (bxvd) bytw.mo74142c(5);
                    bxvd.mo73625a((GeneratedMessageLite) bytw);
                }
                if ((((bytw) bxvd.f164949b).f167727a & 2) == 0) {
                    z = (bytw.f167727a & 2) != 0;
                } else {
                    z = false;
                }
                bytv bytv = bytw.f167729c;
                if (bytv == null) {
                    bytv = bytv.f167717g;
                }
                if ((bytv.f167719a & 4) == 0) {
                    bytv bytv2 = ((bytw) bxvd.f164949b).f167729c;
                    if (bytv2 == null) {
                        bytv2 = bytv.f167717g;
                    }
                    z2 = (bytv2.f167719a & 4) != 0;
                } else {
                    z2 = false;
                }
                if (z || z2) {
                    bytv bytv3 = bytw.f167729c;
                    if (bytv3 == null) {
                        bytv3 = bytv.f167717g;
                    }
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bytw bytw2 = (bytw) bxvd.f164949b;
                    bytw bytw3 = bytw.f167725e;
                    bytv3.getClass();
                    bytw2.f167729c = bytv3;
                    bytw2.f167727a |= 2;
                }
                if ((((bytw) bxvd.f164949b).f167727a & 4) == 0 && (bytw.f167727a & 4) != 0) {
                    String str = bytw.f167730d;
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bytw bytw4 = (bytw) bxvd.f164949b;
                    bytw bytw5 = bytw.f167725e;
                    str.getClass();
                    bytw4.f167727a |= 4;
                    bytw4.f167730d = str;
                }
                hashMap.put(bytw.f167728b, bxvd);
                i3++;
            }
            i2 = i;
        }
        bytx bytx = (bytx) byty.f167731d.mo74144da();
        for (bxvd bxvd2 : hashMap.values()) {
            bytx.mo74507a((bytw) bxvd2.mo74062i());
        }
        ArrayList arrayList = new ArrayList((Collection) r14);
        Collections.sort(arrayList, new bskz());
        int size3 = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size3) {
                break;
            }
            byty byty = (byty) arrayList.get(i4);
            i4++;
            if ((byty.f167733a & 1) != 0) {
                bytz bytz = byty.f167735c;
                if (bytz == null) {
                    bytz = bytz.f167736g;
                }
                if (bytx.f164950c) {
                    bytx.mo74035c();
                    bytx.f164950c = false;
                }
                byty byty2 = (byty) bytx.f164949b;
                bytz.getClass();
                byty2.f167735c = bytz;
                byty2.f167733a |= 1;
            }
        }
        return (byty) bytx.mo74062i();
    }
}
