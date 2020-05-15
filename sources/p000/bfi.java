package p000;

import android.util.Log;
import java.util.Map;

/* renamed from: bfi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfi extends bfj {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo3080b() {
        bew.m2863a(new bgl().mo3102a(bgz.m3019a()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo3081c() {
        String str = bgp.OPERATION.f3180c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1);
        sb.append('1');
        sb.append(str);
        int a = new bgl().mo3102a(bgz.m3020a(sb.toString()));
        bew.m2863a(a);
        bes.m2845a("SDK_CONTEXT_DATA_LEN", Integer.valueOf(a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo3082d() {
        bhl bhl = new bhl();
        String valueOf = String.valueOf(bhl);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 73);
        sb.append("::Flux::TokenOpenProvisionChildDelegate::doesTokenRefIdExist::dataStash::");
        sb.append(valueOf);
        sb.toString();
        return bhl.mo3131b(bgp.OPERATION.f3180c, "HCECLIENT_META_DATA");
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo3083e() {
        try {
            bet a = bet.m2847a();
            bgl bgl = new bgl();
            String str = bgp.OPERATION.f3180c;
            bhl bhl = new bhl();
            int intValue = ((Integer) bes.m2844a("SDK_CONTEXT_DATA_LEN")).intValue() + 1024;
            byte[] bArr = new byte[intValue];
            bew.m2863a(bgl.mo3100a(1, null, 0, bArr, intValue));
            if (bgl.m2964b()) {
                bArr = bgl.mo3114a();
            }
            String str2 = new String(bArr);
            if (str2.length() == 0) {
                new String("::Flux::TokenOpenProvisionChildDelegate::destBuffer::");
            } else {
                "::Flux::TokenOpenProvisionChildDelegate::destBuffer::".concat(str2);
            }
            bhp.m3059c(new String(bArr));
            Object[] a2 = bgz.m3021a(bgz.m3021a(bArr)[0].toString().getBytes());
            String obj = a2[0].toString();
            String obj2 = a2[1].toString();
            String a3 = bhl.mo3128a(str, "HCECLIENT_META_DATA");
            String valueOf = String.valueOf(a3);
            if (valueOf.length() == 0) {
                new String("::Flux::TokenOpenProvisionChildDelegate::sdkMetatData::");
            } else {
                "::Flux::TokenOpenProvisionChildDelegate::sdkMetatData::".concat(valueOf);
            }
            String obj3 = bgz.m3021a(a3.getBytes())[0].toString();
            String valueOf2 = String.valueOf(obj);
            if (valueOf2.length() == 0) {
                new String("::Flux::TokenOpenProvisionChildDelegate::dgiJson::");
            } else {
                "::Flux::TokenOpenProvisionChildDelegate::dgiJson::".concat(valueOf2);
            }
            String valueOf3 = String.valueOf(obj2);
            if (valueOf3.length() == 0) {
                new String("::Flux::TokenOpenProvisionChildDelegate::tagJson::");
            } else {
                "::Flux::TokenOpenProvisionChildDelegate::tagJson::".concat(valueOf3);
            }
            String valueOf4 = String.valueOf(obj3);
            if (valueOf4.length() == 0) {
                new String("::Flux::TokenOpenProvisionChildDelegate::metaDataJson::");
            } else {
                "::Flux::TokenOpenProvisionChildDelegate::metaDataJson::".concat(valueOf4);
            }
            a.f3119a.putAll((Map) bhf.m3034a(obj));
            a.f3120b.putAll(bev.m2857a(obj2));
            a.f3122d.putAll(bev.m2857a(obj3));
            for (bhz bhz : a.f3122d.keySet()) {
                String valueOf5 = String.valueOf(bhz);
                String valueOf6 = String.valueOf(beu.m2849a().get(bhz));
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf5).length() + 67 + String.valueOf(valueOf6).length());
                sb.append("::: ::Flux::TokenOpenProvisionChildDelegate  MetaData Map  :::");
                sb.append(valueOf5);
                sb.append("-- > ");
                sb.append(valueOf6);
                sb.toString();
            }
        } catch (bhg e) {
            throw new bfq(bha.JSON_PARSING_FAILURE);
        } catch (bfq e2) {
            Log.e("core-hceclient", "::Flux::TokenOpenProvisionChildDelegate::catch::", e2);
            throw e2;
        }
    }
}
