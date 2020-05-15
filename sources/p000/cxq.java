package p000;

/* renamed from: cxq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cxq extends cyc {
    /* renamed from: a */
    public final cvv mo8383a(cuq cuq, cyq cyq) {
        boolean z;
        boolean z2;
        cyq cyq2 = cyq;
        if (!cyq.mo8402c().mo8362a(cwj.DCVV_SUPPORTED)) {
            return super.mo8383a(cuq, cyq);
        }
        cuu cuu = cuu.FILE_OR_APP_NOT_FOUND;
        if (cuq.mo8311g() != 1) {
            z = true;
        } else {
            z = false;
        }
        cuu.mo8315a(z);
        cuu cuu2 = cuu.RECORD_NOT_FOUND;
        if (cuq.mo8298a() != 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        cuu2.mo8315a(z2);
        cxr.m7842a((cyp) cyq);
        byte[] a = cyq2.mo8417a(cuz.UNPREDICTABLE_NUMBER);
        if (a == null || a.length == 0) {
            throw new cvl(cuu.WRONG_MISSING_OR_INVALID_DATA_80);
        }
        String a2 = cwd.m7748a(cvz.m7704a(a), 2);
        cuu.WRONG_MISSING_OR_INVALID_DATA_80.mo8315a(!cwd.m7752a(a2));
        String b = cyq2.f12399b.mo8429b(a2);
        String a3 = cyq2.mo8396a(11, 8, "000");
        String a4 = cyq2.f12399b.mo8424a(3);
        int length = String.valueOf(a3).length();
        int length2 = String.valueOf(b).length();
        StringBuilder sb = new StringBuilder(length + 2 + length2 + String.valueOf(a4).length() + String.valueOf(a2).length());
        sb.append("11");
        sb.append(a3);
        sb.append(b);
        sb.append(a4);
        sb.append(a2);
        String sb2 = sb.toString();
        cza a5 = cyz.m7965a(cyq2, cxc.SUCCESS);
        cuw cuw = cuw.RECORD_TEMPLATE;
        cuz cuz = cuz.TRACK_1;
        String h = cyq.mo8407h();
        byte[] bArr = {66};
        byte[] bArr2 = {94};
        byte[] bArr3 = {94};
        byte[][] bArr4 = {cvz.m7721b(cvz.m7722b(bArr, cvz.m7725c(h), bArr2, cyq2.f12399b.f12408a.mo8439a("Cardholder_Name"), bArr3, cvz.m7725c(cyq.mo8410k()), cvz.m7725c(cyq.mo8404e())), 52), cvz.m7725c(sb2)};
        cuz cuz2 = cuz.TRACK_2_EQV_DATA;
        String h2 = cyq.mo8407h();
        String k = cyq.mo8410k();
        String e = cyq.mo8404e();
        int length3 = String.valueOf(h2).length();
        StringBuilder sb3 = new StringBuilder(length3 + 1 + String.valueOf(k).length() + String.valueOf(e).length());
        sb3.append(h2);
        sb3.append('D');
        sb3.append(k);
        sb3.append(e);
        StringBuilder sb4 = new StringBuilder(String.valueOf(sb2).length() + 1);
        sb4.append(sb2);
        sb4.append('F');
        return cvv.m7695a(a5, cut.m7621a(cuw.mo8317a(cuz.mo8318a(cvz.m7723b(bArr4)), cuz2.mo8318a(cvz.m7723b(cvz.m7721b(cvz.m7720b(sb3.toString()), 12), cvz.m7720b(sb4.toString()))), cuz.DCVV.mo8318a(Byte.valueOf(String.valueOf(b.charAt(0))).byteValue(), Byte.valueOf(String.valueOf(b.charAt(1))).byteValue(), Byte.valueOf(String.valueOf(b.charAt(2))).byteValue()))));
    }
}
