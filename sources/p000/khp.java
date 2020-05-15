package p000;

/* renamed from: khp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class khp implements kew {

    /* renamed from: a */
    private static final srn f24164a = srn.m36124a();

    /* renamed from: a */
    public final bnic mo14435a(byte[] bArr) {
        try {
            kdd kdd = (kdd) GeneratedMessageLite.m124014a(kdd.f23851d, bArr);
            bnia j = bnic.m109500j();
            bxwc bxwc = kdd.f23853a;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                j.mo67629b(kct.m17647a((kde) bxwc.get(i), khv.m17875a()));
            }
            bxwc bxwc2 = kdd.f23854b;
            int size2 = bxwc2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                j.mo67629b(kct.m17647a((kcy) bxwc2.get(i2), khv.m17875a()));
            }
            bxwc bxwc3 = kdd.f23855c;
            int size3 = bxwc3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                kcq kcq = (kcq) bxwc3.get(i3);
                j.mo67629b(kct.m17647a(new kdf(kcq.f23832b, kcq.f23833c, kcq.f23834d, kcq.f23835e, kcq.f23836f), khv.m17875a()));
            }
            return j.mo67751a();
        } catch (bxwf e) {
            throw new kev("Failed to deserialize people data from data source cache", e);
        }
    }

    /* renamed from: a */
    public final byte[] mo14436a(bnic bnic) {
        bxvd da = kdd.f23851d.mo74144da();
        bnrd a = bnic.iterator();
        while (a.hasNext()) {
            Object a2 = ((kct) a.next()).mo14368a();
            if (a2 instanceof kde) {
                kde kde = (kde) a2;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                kdd kdd = (kdd) da.f164949b;
                kde.getClass();
                if (!kdd.f23853a.mo73666a()) {
                    kdd.f23853a = GeneratedMessageLite.m124021a(kdd.f23853a);
                }
                kdd.f23853a.add(kde);
            } else if (a2 instanceof kcy) {
                kcy kcy = (kcy) a2;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                kdd kdd2 = (kdd) da.f164949b;
                kcy.getClass();
                if (!kdd2.f23854b.mo73666a()) {
                    kdd2.f23854b = GeneratedMessageLite.m124021a(kdd2.f23854b);
                }
                kdd2.f23854b.add(kcy);
            } else if (a2 instanceof kdf) {
                kdf kdf = (kdf) a2;
                bxvd da2 = kcq.f23829g.mo74144da();
                String str = kdf.f23866a;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                kcq kcq = (kcq) da2.f164949b;
                str.getClass();
                int i = kcq.f23831a | 1;
                kcq.f23831a = i;
                kcq.f23832b = str;
                String str2 = kdf.f23867b;
                str2.getClass();
                int i2 = i | 2;
                kcq.f23831a = i2;
                kcq.f23833c = str2;
                String str3 = kdf.f23868c;
                str3.getClass();
                int i3 = i2 | 4;
                kcq.f23831a = i3;
                kcq.f23834d = str3;
                String str4 = kdf.f23869d;
                str4.getClass();
                int i4 = i3 | 8;
                kcq.f23831a = i4;
                kcq.f23835e = str4;
                String str5 = kdf.f23870e;
                str5.getClass();
                kcq.f23831a = i4 | 16;
                kcq.f23836f = str5;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                kdd kdd3 = (kdd) da.f164949b;
                kcq kcq2 = (kcq) da2.mo74062i();
                kcq2.getClass();
                if (!kdd3.f23855c.mo73666a()) {
                    kdd3.f23855c = GeneratedMessageLite.m124021a(kdd3.f23855c);
                }
                kdd3.f23855c.add(kcq2);
            } else {
                ((bnsl) f24164a.mo68388c()).mo68420a("Unknown type '%s' in person cached data.", a2.getClass());
            }
        }
        return ((kdd) da.mo74062i()).serializeToBytes();
    }
}
