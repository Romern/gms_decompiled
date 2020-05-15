package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: ctz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ctz extends crz {
    public ctz(Class cls) {
        super(cls);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: czx.a(byte[], int, boolean):void
     arg types: [byte[], int, int]
     candidates:
      czx.a(int, int, boolean):void
      czx.a(byte[], int, boolean):void */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0342  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x03d1  */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ czf mo8202a(crn crn, csn csn) {
        ctf ctf;
        boolean z;
        byte b;
        boolean z2;
        boolean z3;
        czk czk;
        byte[] bArr;
        boolean z4;
        byte[] bArr2;
        byte[] c;
        byte b2;
        byte[] bArr3;
        byte b3;
        byte[] bArr4;
        int length;
        csn csn2 = csn;
        crw crw = (crw) crn;
        crw.mo8200g();
        css css = css.WRONG_MISSING_OR_INVALID_DATA_80;
        cte a = csn2.f11917a.f12049c.mo8294a(csn.mo8224i().mo8235a(csu.FCI_PROPRIETARY_TEMPLATE));
        csx csx = csx.UNPREDICTABLE_NUMBER;
        ctf[] ctfArr = (ctf[]) a.f12004b;
        int length2 = ctfArr.length;
        char c2 = 0;
        int i = 0;
        while (true) {
            if (i >= length2) {
                ctf = null;
                break;
            }
            ctf = ctfArr[i];
            if (ctf.f12010c == csx) {
                break;
            }
            i++;
        }
        css.mo8229a((ctf != null ? ctf.f12011d : 0) > 4);
        css.CONDITIONS_OF_USE_NOT_SATISFIED.mo8229a(csn.mo8216b() == null);
        czw a2 = csn.mo8212a();
        csp a3 = csn2.mo8211a(crw, csn.mo8224i().mo8235a(csu.FCI_PROPRIETARY_TEMPLATE));
        czw a4 = czz.m8064a(a3.mo8225a(csx.TERMINAL_TRANSACTION_QUALIFIERS));
        css.WRONG_MISSING_OR_INVALID_DATA_80.mo8229a(!czq.m8042a(a3.mo8226b(csx.AMOUNT_AUTHORISED_NUMERIC)));
        css.WRONG_MISSING_OR_INVALID_DATA_80.mo8229a(!czq.m8042a(a3.mo8226b(csx.AMOUNT_OTHER_NUMERIC)));
        if (a4.mo8463a(czz.MAGSTRIPE_SUPPORTED) && (a2.mo8463a(czt.MAGSTRIPE_PREFERRED) || !a4.mo8463a(czz.EMV_SUPPORTED))) {
            cud.m7590a((csn) a3);
            cud.m7591a(a3);
            ctw ctw = ctw.ZIP;
            cty cty = a3.f11917a;
            return czf.m7988a(new czh(new csp(new cty(cty.f12047a, cty.f12048b, ctw), a3.f11922e, a3.f11918b, a3.mo8219d())), cud.m7592b(a3));
        } else if (a4.mo8463a(czz.EMV_SUPPORTED)) {
            ctp b4 = a3.mo8216b();
            css css2 = css.CONDITIONS_OF_USE_NOT_SATISFIED;
            if (b4 == null || czq.m8041a((CharSequence) b4.f12032c)) {
                z = true;
            } else {
                z = false;
            }
            css2.mo8229a(z);
            cta cta = (cta) a3.f11922e.f11910b.get(csx.TRANSACTION_TYPE);
            if (cta != null) {
                b = cta.mo8237a()[0];
            } else {
                b = 0;
            }
            if (a2.mo8463a(czt.DOMESTICITY_BASED_ON_COUNTRY_CODE)) {
                z2 = Arrays.equals(a3.mo8225a(csx.TERMINAL_COUNTRY_CODE), czm.m8026d(a3.f11918b.f12028a.mo8267a("CRM_Country_Code")));
            } else {
                z2 = Arrays.equals(a3.mo8225a(csx.TRANSACTION_CURRENCY_CODE), czm.m8026d(a3.f11918b.f12028a.mo8267a("CRM_Currency_Code")));
            }
            byte[] c3 = a3.f11918b.f12028a.mo8272c("CVM-CAC_Online-PIN");
            czx czx = new czx();
            czx.mo8466a(2, 8, a4.mo8463a(czz.ONLINE_CRYPTOGRAM_REQUIRED));
            if (b == 1) {
                z3 = true;
            } else {
                z3 = b == 9;
            }
            czx.mo8466a(2, 7, z3);
            czx.mo8466a(2, 6, b == 32);
            czx.mo8466a(2, 5, z2);
            czx.mo8466a(2, 4, !z2);
            czx.mo8465a(2, 2);
            czx.mo8466a(3, 8, a4.mo8463a(czz.CVM_REQUIRED));
            czx.mo8465a(3, 7);
            czx.mo8465a(7, 8);
            czx.mo8466a(7, 7, a4.mo8463a(czz.OFFLINE_ONLY));
            czx.mo8465a(7, 6);
            czx.mo8466a(7, 5, a4.mo8463a(czz.SIGNATURE_SUPPORTED));
            czx.mo8466a(7, 4, a4.mo8463a(czz.READER_SUPPORTING_ISSUER_UPDATE_PROCESSING));
            byte[] a5 = czx.mo8468a();
            byte[] c4 = a3.f11918b.f12028a.mo8272c("CRM-CAC_Denial");
            byte[] c5 = a3.f11918b.f12028a.mo8272c("CRM-CAC_Online");
            if (cua.m7585a(a5[1], c4[0]) || cua.m7585a(a5[3], c4[1]) || cua.m7585a(a5[4], c4[2])) {
                czk = czk.AAC;
            } else if (a4.mo8463a(czz.ONLINE_CRYPTOGRAM_REQUIRED)) {
                czk = czk.ARQC;
            } else if (a4.mo8463a(czz.OFFLINE_ONLY)) {
                czk = czk.AAC;
            } else if (cua.m7585a(a5[1], c5[0]) || cua.m7585a(a5[3], c5[1]) || cua.m7585a(a5[4], c5[2])) {
                czk = czk.ARQC;
            } else {
                czk = czk.AAC;
            }
            czx.mo8464a(1, czk.f12448d);
            byte[] a6 = czx.mo8468a();
            if (!a2.mo8463a(czt.IDD_IN_IAD)) {
                Object[] objArr = new Object[3];
                objArr[0] = Byte.valueOf(a3.mo8223h());
                objArr[1] = Byte.valueOf(!a2.mo8463a(czt.CVN_16_FOR_CRYPTOGRAM) ? (byte) 21 : 22);
                objArr[2] = a6;
                bArr = czm.m8016a(objArr);
            } else {
                byte[] b5 = a3.mo8217b("IADOL");
                if (b5 != null) {
                    if (b5.length != 0) {
                        List<ctf> asList = Arrays.asList(ctc.m7528b(b5));
                        ArrayList arrayList = new ArrayList();
                        for (ctf ctf2 : asList) {
                            byte[] a7 = ctf2.f12010c.mo8234a();
                            if (a7[c2] == -33 && (b3 = a7[1]) > 0 && b3 <= 10) {
                                byte[] b6 = a3.mo8217b(ctm.m7556a(b3 - 1));
                                if (b6 == null || (length = b6.length) < 3) {
                                    bArr4 = null;
                                } else {
                                    bArr4 = Arrays.copyOfRange(b6, 2, length);
                                }
                                bArr3 = bArr4 != null ? Arrays.copyOfRange(bArr4, 0, ctf2.f12011d) : ctf2.mo8256f();
                            } else {
                                String str = (String) csp.f11921d.get(czm.m8019b(ctf2.f12010c.mo8234a()));
                                if (str == null) {
                                    bArr3 = ctf2.mo8256f();
                                } else {
                                    byte[] a8 = a3.mo8215a(str);
                                    if (a8 != null) {
                                        bArr3 = Arrays.copyOfRange(a8, 0, ctf2.f12011d);
                                    } else {
                                        bArr3 = ctf2.mo8256f();
                                    }
                                }
                            }
                            arrayList.add(bArr3);
                            c2 = 0;
                        }
                        bArr2 = czm.m8013a(arrayList);
                        if (bArr2.length > 22) {
                            bArr2 = Arrays.copyOfRange(bArr2, 0, 22);
                        }
                        c = a3.f11918b.f12028a.mo8271c();
                        if (bArr2.length > c.length - 10) {
                            czx czx2 = new czx(c);
                            czx2.mo8466a(2, 1, !a2.mo8463a(czt.CVN_16_FOR_CRYPTOGRAM));
                            czx2.mo8466a(2, 2, a2.mo8463a(czt.CVN_16_FOR_CRYPTOGRAM));
                            czx2.mo8467a(a6, 2, true);
                            czx2.mo8467a(bArr2, 10, false);
                            bArr = czx2.mo8468a();
                        } else {
                            Object[] objArr2 = new Object[4];
                            objArr2[0] = Byte.valueOf(a3.mo8223h());
                            if (!a2.mo8463a(czt.CVN_16_FOR_CRYPTOGRAM)) {
                                b2 = 21;
                            } else {
                                b2 = 22;
                            }
                            objArr2[1] = Byte.valueOf(b2);
                            objArr2[2] = a6;
                            objArr2[3] = bArr2;
                            bArr = czm.m8016a(objArr2);
                        }
                    }
                }
                bArr2 = new byte[0];
                c = a3.f11918b.f12028a.mo8271c();
                if (bArr2.length > c.length - 10) {
                }
            }
            byte[] d = czm.m8027d(a3.f11918b.f12028a.mo8268a());
            d[12] = (byte) (d[12] | 1);
            if (a4.mo8463a(czz.ONLINE_PIN_SUPPORTED)) {
                if (cua.m7585a(c3[0], a6[2])) {
                    z4 = true;
                } else if (cua.m7585a(c3[1], a6[3])) {
                    z4 = true;
                }
                czx czx3 = new czx(czm.m8012a(a3.f11918b.f12028a.mo8267a("CPR")));
                czx3.mo8466a(1, 8, z4);
                czx3.mo8465a(1, 5);
                byte[] a9 = czx3.mo8468a();
                a3.mo8214a("CPR", a9);
                a3.mo8214a("Issuer_Application_Data", bArr);
                if (!a2.mo8463a(czt.CVN_16_FOR_CRYPTOGRAM)) {
                    a6 = bArr;
                }
                return czf.m7988a(new czh(a3, true), csr.m7475a(csu.RESPONSE_MESSAGE_TEMPLATE_2.mo8231a(csx.APPLICATION_INTERCHANGE_PROFILE.mo8232a(czm.m8012a(a3.f11918b.f12028a.mo8267a("AIP"))), csx.APP_CRYPTOGRAM.mo8232a(a3.f11918b.mo8279a(a3.mo8225a(csx.AMOUNT_AUTHORISED_NUMERIC), a3.mo8225a(csx.TRANSACTION_CURRENCY_CODE), a3.mo8225a(csx.UNPREDICTABLE_NUMBER), a6)), csx.APP_TRANSACTION_COUNTER.mo8232a(a3.f11918b.mo8287h()), csx.ISSUER_APPLICATION_DATA.mo8232a(bArr), csx.CRYPTOGRAM_INFORMATION_DATA.mo8232a(czk.f12449e), csx.TRACK_2_EQV_DATA.mo8232a(d), csx.APP_USAGE_CONTROL.mo8232a(czm.m8012a(a3.f11918b.f12028a.mo8267a("AUC"))), csx.ISSUER_COUNTRY_CODE.mo8232a(a3.f11918b.f12028a.mo8270b()), new csy(csx.PAN_SEQUENCE_NUMBER, czm.m8025c(czq.m8045d(a3.f11918b.f12028a.mo8267a("PAN_Seq_NBR"), 2))), csx.CARD_PROCESSING_REQUIREMENTS.mo8232a(a9), csx.APP_EFFECTIVE_DATE.mo8232a(czm.m8012a(a3.f11918b.f12028a.mo8267a("Effective_Date"))), csx.APP_VERSION_NUMBER_CARD.mo8232a(czm.m8012a(a3.f11918b.f12028a.mo8267a("AVN"))))));
            }
            z4 = false;
            czx czx32 = new czx(czm.m8012a(a3.f11918b.f12028a.mo8267a("CPR")));
            czx32.mo8466a(1, 8, z4);
            czx32.mo8465a(1, 5);
            byte[] a92 = czx32.mo8468a();
            a3.mo8214a("CPR", a92);
            a3.mo8214a("Issuer_Application_Data", bArr);
            if (!a2.mo8463a(czt.CVN_16_FOR_CRYPTOGRAM)) {
            }
            return czf.m7988a(new czh(a3, true), csr.m7475a(csu.RESPONSE_MESSAGE_TEMPLATE_2.mo8231a(csx.APPLICATION_INTERCHANGE_PROFILE.mo8232a(czm.m8012a(a3.f11918b.f12028a.mo8267a("AIP"))), csx.APP_CRYPTOGRAM.mo8232a(a3.f11918b.mo8279a(a3.mo8225a(csx.AMOUNT_AUTHORISED_NUMERIC), a3.mo8225a(csx.TRANSACTION_CURRENCY_CODE), a3.mo8225a(csx.UNPREDICTABLE_NUMBER), a6)), csx.APP_TRANSACTION_COUNTER.mo8232a(a3.f11918b.mo8287h()), csx.ISSUER_APPLICATION_DATA.mo8232a(bArr), csx.CRYPTOGRAM_INFORMATION_DATA.mo8232a(czk.f12449e), csx.TRACK_2_EQV_DATA.mo8232a(d), csx.APP_USAGE_CONTROL.mo8232a(czm.m8012a(a3.f11918b.f12028a.mo8267a("AUC"))), csx.ISSUER_COUNTRY_CODE.mo8232a(a3.f11918b.f12028a.mo8270b()), new csy(csx.PAN_SEQUENCE_NUMBER, czm.m8025c(czq.m8045d(a3.f11918b.f12028a.mo8267a("PAN_Seq_NBR"), 2))), csx.CARD_PROCESSING_REQUIREMENTS.mo8232a(a92), csx.APP_EFFECTIVE_DATE.mo8232a(czm.m8012a(a3.f11918b.f12028a.mo8267a("Effective_Date"))), csx.APP_VERSION_NUMBER_CARD.mo8232a(czm.m8012a(a3.f11918b.f12028a.mo8267a("AVN"))))));
        } else {
            throw new ctu(css.CONDITIONS_OF_USE_NOT_SATISFIED);
        }
    }
}
