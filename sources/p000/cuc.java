package p000;

/* renamed from: cuc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cuc extends cse {
    /* renamed from: a */
    public final czf mo8204a(crx crx, csp csp) {
        boolean z;
        csp csp2 = csp;
        if (!csp.mo8212a().mo8463a(czt.DCVV_SUPPORTED)) {
            return super.mo8204a(crx, csp);
        }
        css.FILE_OR_APP_NOT_FOUND.mo8229a(crx.mo8201g() != 1);
        css css = css.RECORD_NOT_FOUND;
        if (crx.mo8191a() != 1) {
            z = true;
        } else {
            z = false;
        }
        css.mo8229a(z);
        cud.m7590a((csn) csp);
        byte[] a = csp2.mo8225a(csx.UNPREDICTABLE_NUMBER);
        if (a == null || a.length == 0) {
            throw new ctu(css.WRONG_MISSING_OR_INVALID_DATA_80);
        }
        String a2 = czq.m8039a(czm.m8019b(a), 2);
        css.WRONG_MISSING_OR_INVALID_DATA_80.mo8229a(!czq.m8042a(a2));
        String b = csp2.f11918b.mo8281b(a2);
        String str = "11" + csp2.mo8213a(11, 8, "000") + b + csp2.f11918b.mo8277a(3) + a2;
        czh czh = new czh(csp2, true);
        csu csu = csu.RECORD_TEMPLATE;
        csx csx = csx.TRACK_1;
        byte[][] bArr = {czm.m8014a(czm.m8016a(new byte[]{66}, czm.m8020b(csp.mo8220e()), new byte[]{94}, csp2.f11918b.f12028a.mo8267a("Cardholder_Name"), new byte[]{94}, czm.m8020b(csp.mo8222g()), czm.m8020b(csp.mo8218c())), 52), czm.m8020b(str)};
        csx csx2 = csx.TRACK_2_EQV_DATA;
        String e = csp.mo8220e();
        String g = csp.mo8222g();
        String c = csp.mo8218c();
        StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 1 + String.valueOf(g).length() + String.valueOf(c).length());
        sb.append(e);
        sb.append('D');
        sb.append(g);
        sb.append(c);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1);
        sb2.append(str);
        sb2.append('F');
        return czf.m7988a(czh, csr.m7475a(csu.mo8231a(csx.mo8232a(czm.m8022b(bArr)), csx2.mo8232a(czm.m8022b(czm.m8014a(czm.m8012a(sb.toString()), 12), czm.m8012a(sb2.toString()))), csx.DCVV.mo8232a(Byte.valueOf(String.valueOf(b.charAt(0))).byteValue(), Byte.valueOf(String.valueOf(b.charAt(1))).byteValue(), Byte.valueOf(String.valueOf(b.charAt(2))).byteValue()))));
    }
}
