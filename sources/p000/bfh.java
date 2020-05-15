package p000;

import android.util.Log;
import java.util.List;
import java.util.Map;

/* renamed from: bfh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bfh extends bew {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgr.a(java.lang.String, boolean):java.lang.Object
     arg types: [java.lang.String, int]
     candidates:
      bgr.a(java.lang.String, java.lang.Object):void
      bgr.a(java.lang.String, boolean):java.lang.Object */
    /* renamed from: a */
    public final void mo3074a() {
        List list;
        try {
            bgr bgr = bgs.f3191a;
            bet bet = new bet();
            bgr.mo3121a("DATA_CONTEXT", bet);
            mo3078b();
            byte[] c = mo3079c();
            String a = new bhl().mo3128a(bgp.OPERATION.f3180c, "HCECLIENT_META_DATA");
            String str = new String(c);
            if (str.length() == 0) {
                new String("TokenOpenPaymentDelegate::destBuffer::");
            } else {
                "TokenOpenPaymentDelegate::destBuffer::".concat(str);
            }
            bhp.m3059c(new String(c));
            Object[] a2 = bgz.m3021a(bgz.m3021a(c)[0].toString().getBytes());
            String obj = a2[0].toString();
            String obj2 = a2[1].toString();
            String obj3 = bgz.m3021a(a.getBytes())[0].toString();
            String valueOf = String.valueOf(obj);
            if (valueOf.length() == 0) {
                new String("TokenOpenPaymentDelegate::dgiJson::");
            } else {
                "TokenOpenPaymentDelegate::dgiJson::".concat(valueOf);
            }
            String valueOf2 = String.valueOf(obj2);
            if (valueOf2.length() == 0) {
                new String("TokenOpenPaymentDelegate::tagJson::");
            } else {
                "TokenOpenPaymentDelegate::tagJson::".concat(valueOf2);
            }
            String valueOf3 = String.valueOf(obj3);
            if (valueOf3.length() == 0) {
                new String("TokenOpenPaymentDelegate::metaDataJson::");
            } else {
                "TokenOpenPaymentDelegate::metaDataJson::".concat(valueOf3);
            }
            bet.f3119a.putAll((Map) bhf.m3034a(obj));
            bet.f3120b.putAll(bev.m2857a(obj2));
            bet.f3122d.putAll(bev.m2857a(obj3));
            for (bhz bhz : bet.f3122d.keySet()) {
                String valueOf4 = String.valueOf(bhz);
                String valueOf5 = String.valueOf(beu.m2849a().get(bhz));
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf4).length() + 52 + String.valueOf(valueOf5).length());
                sb.append("::: TokenOpenPaymentDelegate  MetaData Map  :::");
                sb.append(valueOf4);
                sb.append("-- > ");
                sb.append(valueOf5);
                sb.toString();
            }
            if (bev.m2855a(bet.f3122d, bgt.m2993a("NFC_LUPC_DGI"), bgt.m2993a("NFC_LUPC_TAG")).isEmpty()) {
                bgd.m2922a(4);
            }
            bes.m2845a("TR_APP_STATE", (short) 14161);
            bes.m2845a("TR_MOB_CVM_STATUS", (byte) 117);
            bes.m2845a("TR_MOB_CVM_REQ", (short) 30003);
            bes.m2845a("MOBILE_CVM_RESULTS", new byte[]{0, 0, 0});
            bes.m2845a("TR_TERMINAL_MODE", (byte) 120);
            bes.m2845a("TR_TXN_AMNT_STATUS", (byte) -68);
            bes.m2845a("TR_ABORT_IN_GAC", (short) 30003);
            bgd.m2923a(bha.NO_FURTHER_ACTION_REQUIRED);
            bes.m2845a("TID", "0000000000000000000000000000000000000000000000000000000000000000");
            bes.m2845a("TR_RETURN_AMNT_IN_GAC", (short) 30003);
            bet bet2 = (bet) bgs.f3191a.mo3119a("DATA_CONTEXT", false);
            String str2 = (String) bet2.f3119a.get(bgt.m2993a("MS_AIP_DGI"));
            String str3 = (String) bet2.f3119a.get(bgt.m2993a("EMV_AIP_DGI"));
            if (str2 != null && str3 != null) {
                bes.m2845a("TR_APP_CAPABILITY", (byte) 57);
            } else if (str2 == null && str3 != null) {
                bes.m2845a("TR_APP_CAPABILITY", (byte) -73);
            } else if (str2 != null) {
                bes.m2845a("TR_APP_CAPABILITY", (byte) -63);
            }
            List list2 = null;
            bes.m2845a("TR_CUR_PPSE_RES_OBJ", null);
            bes.m2845a("TR_NFC_LUPC_OBJ", null);
            bes.m2845a("TR_MST_LUPC_OBJ", null);
            bes.m2845a("BLOCK_IN_CLOSE", (short) 30003);
            bia a3 = bev.m2854a(bet.f3120b, bgt.m2993a("CARD_RISK_MANAGEMENT_MS_DGI"), bgt.m2993a("CDOL_TAG"), true);
            bia a4 = bev.m2854a(bet.f3120b, bgt.m2993a("CARD_RISK_MANAGEMENT_EMV_DGI"), bgt.m2993a("CDOL_TAG"), true);
            if (a3 != null) {
                list = bgu.m2996a(a3.f3270h);
            } else {
                list = null;
            }
            if (a4 != null) {
                list2 = bgu.m2996a(a4.f3270h);
            }
            bes.m2845a("MS_CDOL_LIST", list);
            bes.m2845a("EMV_CDOL_LIST", list2);
            bgc bgc = new bgc();
            if (!bgp.OPERATION.f3179b.equals(bgq.TAP_PAYMENT) || bgd.m2920a((byte) 4, (byte) 8) != -23238) {
                bgc.mo3099a(true);
            } else {
                bgc.mo3099a(false);
            }
            bes.m2845a("TR_CUR_PPSE_RES_OBJ", bgc);
        } catch (bhg e) {
            throw new bfq(bha.JSON_PARSING_FAILURE);
        } catch (bfq e2) {
            Log.e("core-hceclient", "::TokenOpenPaymentDelegate::catch::", e2);
            throw e2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo3078b() {
        bew.m2863a(new bgl().mo3102a(new bhl().mo3128a(bgp.OPERATION.f3180c, "HCECLIENTSC_DATA_CONTEXT").getBytes()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public byte[] mo3079c() {
        bgl bgl = new bgl();
        String a = new bhl().mo3128a(bgp.OPERATION.f3180c, "HCECLIENT_DATA_CONTEXT");
        String valueOf = String.valueOf(a);
        if (valueOf.length() == 0) {
            new String("TokenOpenPaymentDelegate::sdkDataContext::");
        } else {
            "TokenOpenPaymentDelegate::sdkDataContext::".concat(valueOf);
        }
        bhp.m3059c(new String(a));
        byte[] bytes = a.getBytes();
        int length = bytes.length;
        int i = length + 1024;
        byte[] bArr = new byte[i];
        bew.m2863a(bgl.mo3100a(1, bytes, length, bArr, i));
        return bgl.m2964b() ? bgl.mo3114a() : bArr;
    }
}
