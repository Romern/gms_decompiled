package p000;

import java.util.List;

/* renamed from: bhr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhr implements bht {
    /* renamed from: a */
    public final bhy mo3132a(byte[] bArr, String str, String str2) {
        List a = bhn.m3051a(bArr, str, false);
        String valueOf = String.valueOf(a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
        sb.append("NFCLUPCDataCollector::tagDetailList::");
        sb.append(valueOf);
        sb.toString();
        bhy bhy = new bhy();
        bhz bhz = new bhz();
        bhz.f3263a = str;
        bhz.f3264b = str2.toUpperCase();
        bhy.f3261a = bhz;
        bhw bhw = new bhw();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            bhy bhy2 = (bhy) a.get(i);
            if (bhy2.f3261a.f3264b.equalsIgnoreCase(bgt.m2993a("NFC_LUPC_ATC"))) {
                String str3 = bhy2.f3262b.f3270h;
                bhw.f3253b = str3;
                bhz.f3266d = Integer.parseInt(str3, 16);
            } else if (bhy2.f3261a.f3264b.equalsIgnoreCase(bgt.m2993a("NFC_LUPC_LUPC"))) {
                bhw.f3254c = bhy2.f3262b.f3270h;
            } else if (bhy2.f3261a.f3264b.equalsIgnoreCase(bgt.m2993a("NFC_LUPC_KCV"))) {
                bhw.f3255d = bhy2.f3262b.f3270h;
            } else if (bhy2.f3261a.f3264b.equalsIgnoreCase(bgt.m2993a("NFC_LUPC_DKI"))) {
                bhw.f3256e = bhy2.f3262b.f3270h;
            } else if (bhy2.f3261a.f3264b.equalsIgnoreCase(bgt.m2993a("NFC_LUPC_START_DT"))) {
                bhw.f3257f = bhy2.f3262b.f3270h;
            } else if (bhy2.f3261a.f3264b.equalsIgnoreCase(bgt.m2993a("NFC_LUPC_END_DT"))) {
                bhw.f3258g = bhy2.f3262b.f3270h;
            }
        }
        bhy.f3262b = bhw;
        return bhy;
    }
}
