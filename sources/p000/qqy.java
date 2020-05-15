package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: qqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qqy {

    /* renamed from: a */
    public final bnhe f41983a;

    /* renamed from: b */
    private final String f41984b;

    public qqy(List list, String str) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qqz qqz = (qqz) it.next();
            hashMap.put(qqz.f41985a, qqz);
        }
        sdo.m34975b(hashMap.containsKey(str), "The default key needs to be included in the key list.");
        this.f41983a = bnhe.m109413a(hashMap);
        this.f41984b = str;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: a */
    public static List m32673a(qqy qqy, qui qui) {
        if (qui != null && !qui.f42145b.isEmpty()) {
            sdo.checkIfNull(qui, "encryptedData cannot be null");
            String str = qui.f42145b;
            sdo.m34969a(str, (Object) "keyName cannot be empty");
            if (qqy.f41983a.containsKey(str)) {
                try {
                    qul qul = (qul) GeneratedMessageLite.m124016a(qul.f42159b, qqy.mo24213a(qui), bxus.m123744c());
                    if (qul.f42161a.size() != 0) {
                        ArrayList arrayList = new ArrayList();
                        bxwc bxwc = qul.f42161a;
                        int size = bxwc.size();
                        for (int i = 0; i < size; i++) {
                            arrayList.add(qqz.m32680a((quk) bxwc.get(i)));
                        }
                        return arrayList;
                    }
                    throw new qra("Invalid key bag.");
                } catch (bxwf | qra e) {
                    throw new qra("Unable to parse the key bag.", e);
                }
            }
        }
        throw new qra("The key bag cannot be decrypted.");
    }

    /* renamed from: a */
    public static qqy m32674a(qqz qqz, bstz bstz) {
        sdo.checkIfNull(qqz, "cryptographerKey cannot be null");
        sdo.checkIfNull(bstz, "nigoriSpecifics cannot be null");
        ArrayList arrayList = new ArrayList();
        arrayList.add(qqz);
        qqy qqy = new qqy(bngx.m109356a(qqz), qqz.f41985a);
        qui qui = bstz.f147088a;
        if (qui == null) {
            qui = qui.f42142d;
        }
        arrayList.addAll(m32673a(qqy, qui));
        qui qui2 = bstz.f147088a;
        if (qui2 == null) {
            qui2 = qui.f42142d;
        }
        return new qqy(arrayList, qui2.f42145b);
    }

    /* renamed from: a */
    public static boolean m32675a(bstz bstz) {
        sdo.m34959a(bstz);
        bsty a = bsty.m116191a(bstz.f147089b);
        if (a == null) {
            a = bsty.UNRECOGNIZED;
        }
        return a == bsty.KEYSTORE_PASSPHRASE;
    }

    /* renamed from: a */
    public final qqz mo24211a() {
        return (qqz) this.f41983a.get(this.f41984b);
    }

    /* renamed from: a */
    public final qui mo24212a(byte[] bArr) {
        sdo.checkIfNull(bArr, "data cannot be null");
        qqz a = mo24211a();
        bxvd da = qui.f42142d.mo74144da();
        String str = a.f41985a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        qui qui = (qui) da.f164949b;
        str.getClass();
        qui.f42144a |= 1;
        qui.f42145b = str;
        ByteString a2 = ByteString.m123261a(a.f41986b.mo24216a(bArr));
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        qui qui2 = (qui) da.f164949b;
        a2.getClass();
        qui2.f42144a |= 2;
        qui2.f42146c = a2;
        return (qui) da.mo74062i();
    }

    /* renamed from: a */
    public final byte[] mo24213a(qui qui) {
        sdo.checkIfNull(qui, "encryptedData cannot be null");
        int i = qui.f42144a;
        if ((i & 1) == 0) {
            throw new qra("Missing key name.");
        } else if ((i & 2) != 0) {
            String str = qui.f42145b;
            byte[] k = qui.f42146c.getKey();
            qqz qqz = (qqz) this.f41983a.get(str);
            if (qqz != null) {
                return qqz.f41986b.mo24217b(k);
            }
            throw new qra("No valid key found for decrypting the data.");
        } else {
            throw new qra("Missing encrypted data.");
        }
    }
}
