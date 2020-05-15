package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: bhn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhn {
    /* renamed from: a */
    public static bgv m3050a(byte[] bArr, int i, int i2, boolean z) {
        int i3;
        int i4;
        int i5;
        int i6;
        short s;
        if (i >= i2) {
            return null;
        }
        bgv bgv = new bgv();
        int i7 = 0;
        if ((bArr[i] & 32) == 32) {
            bgv.f3198e = true;
        } else {
            bgv.f3198e = false;
        }
        while (true) {
            byte b = bArr[i];
            if (b != 0 && b != -1) {
                if ((b & 31) == 31) {
                    bgv.f3194a = bgx.m3005a(bArr, i, 2).toUpperCase();
                    i3 = i + 2;
                    i4 = i7 + 2;
                } else {
                    i3 = i + 1;
                    bgv.f3194a = bgx.m3000a(b).toUpperCase();
                    i4 = i7 + 1;
                }
                byte b2 = bArr[i3];
                if (b2 == -127) {
                    int i8 = i3 + 1;
                    s = bArr[i8] & 255;
                    bgv.f3195b = (short) s;
                    i5 = i8 + 1;
                    i6 = i4 + 2;
                } else if (b2 == -126) {
                    int i9 = i3 + 1;
                    s = bgx.m3006a(bArr, i9);
                    bgv.f3195b = s;
                    i5 = i9 + 2;
                    i6 = i4 + 3;
                } else {
                    i5 = i3 + 1;
                    s = b2 & 255;
                    bgv.f3195b = (short) s;
                    i6 = i4 + 1;
                }
                if (z) {
                    bgv.f3196c = bgx.m3005a(bArr, i5, s);
                }
                bgv.f3199f = i6;
                return bgv;
            } else if (i >= bArr.length - 2) {
                return null;
            } else {
                i++;
                i7++;
            }
        }
    }

    /* renamed from: a */
    public static List m3051a(byte[] bArr, String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return arrayList;
            }
            bgv a = m3050a(bArr, i, length, true);
            if (a != null) {
                String str2 = a.f3194a;
                byte[] a2 = bgx.m3011a(a.f3196c);
                bhy bhy = new bhy();
                bht a3 = bhu.m3064a(str, str2);
                if (a3 != null) {
                    bhy a4 = a3.mo3132a(a2, str, str2);
                    arrayList.add(a4);
                    String valueOf = String.valueOf(a4);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                    sb.append("parseTLV::tagDetail::");
                    sb.append(valueOf);
                    sb.toString();
                } else {
                    bhz bhz = new bhz();
                    bhz.f3263a = str;
                    bhz.f3264b = str2.toUpperCase();
                    if (bho.f3251a.contains(bhz) || !z) {
                        bia bia = new bia();
                        bia.f3270h = bgx.m3012b(a2).toUpperCase();
                        bhy.f3261a = bhz;
                        bhy.f3262b = bia;
                        arrayList.add(bhy);
                        String valueOf2 = String.valueOf(bhy);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 21);
                        sb2.append("parseTLV::tagDetail::");
                        sb2.append(valueOf2);
                        sb2.toString();
                    }
                }
                i += a.f3199f;
                if (!a.f3198e) {
                    i += a.f3195b;
                }
            } else {
                throw new bhm("::TLVHelper::parseTLV::Malformed Record Data");
            }
        }
    }

    /* renamed from: a */
    public static Map m3052a(List list) {
        HashMap hashMap = new HashMap();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bhy bhy = (bhy) list.get(i);
            hashMap.put(bhy.f3261a, bhy.f3262b);
        }
        return hashMap;
    }
}
