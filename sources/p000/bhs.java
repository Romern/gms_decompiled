package p000;

import java.util.List;

/* renamed from: bhs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhs implements bht {
    /* renamed from: a */
    public final bhy mo3132a(byte[] bArr, String str, String str2) {
        List a = bhn.m3051a(bArr, str, false);
        String valueOf = String.valueOf(a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("PPSEDataCollector::tagDetailList::");
        sb.append(valueOf);
        sb.toString();
        bhy bhy = new bhy();
        bhz bhz = new bhz();
        bhz.f3263a = str;
        bhz.f3264b = str2.toUpperCase();
        bhy.f3261a = bhz;
        bhx bhx = new bhx();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            bhy bhy2 = (bhy) a.get(i);
            if (bhy2.f3261a.f3264b.equalsIgnoreCase(bgt.m2993a("APPLICATION_INDICATOR"))) {
                bhx.f3260b = bhy2.f3262b.f3270h;
            }
        }
        bhx.f3259a = bgx.m3004a(bArr);
        bhy.f3262b = bhx;
        return bhy;
    }
}
