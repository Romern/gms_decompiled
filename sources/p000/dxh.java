package p000;

import android.content.Context;
import java.util.Collection;

/* renamed from: dxh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dxh extends dxd {

    /* renamed from: f */
    private final Collection f14357f;

    public dxh(Context context, doh doh, Collection collection, dwu dwu, dqb dqb) {
        super(context, "ReadServerFenceUpdatesTask", doh, "readfenceupdates", 12554, 12, bxjg.f163631c, cdhr.m133452b(), dwu, dqb, null);
        this.f14357f = collection;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxjd mo9827a(bxxc bxxc) {
        bxjd bxjd = ((bxjg) bxxc).f163633a;
        return bxjd == null ? bxjd.f163616c : bxjd;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List, java.util.Collection], assign insn: 0x0028: IGET  (r1v4 ? I:java.util.Collection) = (r13v0 'this' dxh A[THIS]) dxh.f java.util.Collection */
    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ bxxc mo9830c() {
        bxvd da = bxjf.f163626d.mo74144da();
        bxjc a = dwv.m9720a(this.f14340c, this.f14341d);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxjf bxjf = (bxjf) da.f164949b;
        a.getClass();
        bxjf.f163629b = a;
        bxjf.f163628a |= 1;
        ? r1 = this.f14357f;
        int size = r1.size();
        for (int i = 0; i < size; i++) {
            duu duu = (duu) r1.get(i);
            bxvd da2 = bxjx.f163698d.mo74144da();
            String str = duu.f14118a;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bxjx bxjx = (bxjx) da2.f164949b;
            str.getClass();
            int i2 = bxjx.f163700a | 1;
            bxjx.f163700a = i2;
            bxjx.f163701b = str;
            long j = duu.f14120c;
            bxjx.f163700a = i2 | 2;
            bxjx.f163702c = j;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxjf bxjf2 = (bxjf) da.f164949b;
            bxjx bxjx2 = (bxjx) da2.mo74062i();
            bxjx2.getClass();
            if (!bxjf2.f163630c.mo73666a()) {
                bxjf2.f163630c = GeneratedMessageLite.m124021a(bxjf2.f163630c);
            }
            bxjf2.f163630c.add(bxjx2);
        }
        new Object[1][0] = da.mo74062i();
        return (bxjf) da.mo74062i();
    }
}
