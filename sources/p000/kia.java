package p000;

/* renamed from: kia */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kia implements kew {
    /* renamed from: a */
    public final bnic mo14435a(byte[] bArr) {
        try {
            kdh kdh = (kdh) GeneratedMessageLite.m124014a(kdh.f23882b, bArr);
            bnia j = bnic.m109500j();
            bxwc bxwc = kdh.f23884a;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                kdg kdg = (kdg) bxwc.get(i);
                j.mo67629b(kct.m17647a(kdg, kcs.m17644a("places", kdg.f23881i)));
            }
            return j.mo67751a();
        } catch (bxwf e) {
            throw new kev("Failed to deserialize postal address list from data source cache", e);
        }
    }

    /* renamed from: a */
    public final byte[] mo14436a(bnic bnic) {
        bxvd da = kdh.f23882b.mo74144da();
        bnrd a = bnic.iterator();
        while (a.hasNext()) {
            kdg kdg = (kdg) ((kct) a.next()).mo14368a();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            kdh kdh = (kdh) da.f164949b;
            kdg.getClass();
            if (!kdh.f23884a.mo73666a()) {
                kdh.f23884a = GeneratedMessageLite.m124021a(kdh.f23884a);
            }
            kdh.f23884a.add(kdg);
        }
        return ((kdh) da.mo74062i()).serializeToBytes();
    }
}
