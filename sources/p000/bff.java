package p000;

import android.util.Log;
import java.util.Map;

/* renamed from: bff */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bff extends bew {
    /* renamed from: a */
    public final void mo3074a() {
        try {
            bgr bgr = bgs.f3191a;
            bet bet = new bet();
            bgr.mo3121a("DATA_CONTEXT", bet);
            mo3076b();
            new bgl();
            String a = new bhl().mo3128a(bgp.OPERATION.f3180c, "HCECLIENT_META_DATA");
            byte[] c = mo3077c();
            String str = new String(c);
            if (str.length() == 0) {
                new String("TokenOpenLCMDelegate::destBuffer::");
            } else {
                "TokenOpenLCMDelegate::destBuffer::".concat(str);
            }
            bhp.m3059c(new String(c));
            Object[] a2 = bgz.m3021a(bgz.m3021a(c)[0].toString().getBytes());
            String obj = a2[0].toString();
            String obj2 = a2[1].toString();
            String obj3 = bgz.m3021a(a.getBytes())[0].toString();
            String valueOf = String.valueOf(obj);
            if (valueOf.length() == 0) {
                new String("TokenOpenLCMDelegate::dgiJson::");
            } else {
                "TokenOpenLCMDelegate::dgiJson::".concat(valueOf);
            }
            String valueOf2 = String.valueOf(obj2);
            if (valueOf2.length() == 0) {
                new String("TokenOpenLCMDelegate::tagJson::");
            } else {
                "TokenOpenLCMDelegate::tagJson::".concat(valueOf2);
            }
            String valueOf3 = String.valueOf(obj3);
            if (valueOf3.length() == 0) {
                new String("TokenOpenLCMDelegate::metaDataJson::");
            } else {
                "TokenOpenLCMDelegate::metaDataJson::".concat(valueOf3);
            }
            bet.f3119a.putAll((Map) bhf.m3034a(obj));
            bet.f3120b.putAll(bev.m2857a(obj2));
            bet.f3122d.putAll(bev.m2857a(obj3));
            for (bhz bhz : bet.f3122d.keySet()) {
                String valueOf4 = String.valueOf(bhz);
                String valueOf5 = String.valueOf(beu.m2849a().get(bhz));
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf4).length() + 48 + String.valueOf(valueOf5).length());
                sb.append("::: TokenOpenLCMDelegate  MetaData Map  :::");
                sb.append(valueOf4);
                sb.append("-- > ");
                sb.append(valueOf5);
                sb.toString();
            }
        } catch (bhg e) {
            throw new bfq(bha.JSON_PARSING_FAILURE);
        } catch (bfq e2) {
            Log.e("core-hceclient", "::TokenOpenLCMDelegate::catch::", e2);
            throw e2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo3076b() {
        bew.m2863a(new bgl().mo3102a(new bhl().mo3128a(bgp.OPERATION.f3180c, "HCECLIENTSC_DATA_CONTEXT").getBytes()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public byte[] mo3077c() {
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
