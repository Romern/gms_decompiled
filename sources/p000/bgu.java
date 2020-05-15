package p000;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bgu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgu {
    /* renamed from: a */
    public static List m2996a(String str) {
        byte[] bArr;
        ArrayList arrayList = new ArrayList();
        String replaceAll = str.replaceAll(" ", "");
        if (replaceAll.length() == 0) {
            bArr = new byte[0];
        } else if (replaceAll.length() % 2 != 0) {
            String valueOf = String.valueOf(replaceAll);
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Input string must contain an even number of characters: ") : "Input string must contain an even number of characters: ".concat(valueOf));
        } else {
            byte[] bArr2 = new byte[(replaceAll.length() / 2)];
            char[] charArray = replaceAll.toCharArray();
            for (int i = 0; i < charArray.length; i += 2) {
                StringBuilder sb = new StringBuilder(2);
                sb.append(charArray[i]);
                sb.append(charArray[i + 1]);
                bArr2[i / 2] = (byte) Integer.parseInt(sb.toString(), 16);
            }
            bArr = bArr2;
        }
        int i2 = 0;
        short s = 0;
        while (true) {
            int length = bArr.length;
            if (i2 < length) {
                bgv a = bhn.m3050a(bArr, i2, length, false);
                if (a != null) {
                    a.f3197d = s;
                    arrayList.add(a);
                    i2 += a.f3199f;
                    s = (short) (s + a.f3195b);
                } else {
                    throw new bhm("::TLVHelper::parseTLV::Malformed Record Data");
                }
            } else {
                bgv bgv = new bgv();
                bgv.f3194a = "DOL_TOTAL_LEN";
                bgv.f3195b = s;
                arrayList.add(bgv);
                String valueOf2 = String.valueOf(arrayList);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
                sb2.append("parseDOL::dolList::");
                sb2.append(valueOf2);
                sb2.toString();
                return arrayList;
            }
        }
    }

    /* renamed from: a */
    public static short m2997a(String str, List list) {
        int i = 0;
        while (i < list.size()) {
            try {
                bgv bgv = (bgv) list.get(i);
                String valueOf = String.valueOf(bgv);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                sb.append("computeDOL::dolTag:: ");
                sb.append(valueOf);
                sb.toString();
                short s = bgv.f3195b;
                short s2 = bgv.f3197d;
                if (bgv.f3194a.compareToIgnoreCase("DOL_TOTAL_LEN") == 0) {
                    bes.m2845a(bgv.f3194a, Short.valueOf(s));
                } else {
                    bes.m2845a(bgv.f3194a, bgx.m3002a(str, s2, s));
                }
                i++;
            } catch (Exception e) {
                String valueOf2 = String.valueOf(e);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 21);
                sb2.append("Failed to compute DOL");
                sb2.append(valueOf2);
                Log.e("core-hceclient", sb2.toString());
                return 30003;
            }
        }
        return -23238;
    }
}
