package p000;

import android.util.Log;
import java.util.Map;

/* renamed from: bfj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bfj extends bew {
    /* renamed from: a */
    public final void mo3074a() {
        try {
            boolean d = mo3082d();
            bgs.f3191a.mo3121a("IS_ALREADY_PROVSIONED", Boolean.valueOf(d));
            StringBuilder sb = new StringBuilder(56);
            sb.append("::TokenOpenProvisionDelegate::doesTokenRefIdExist::");
            sb.append(d);
            sb.toString();
            if (d) {
                mo3081c();
                mo3083e();
                return;
            }
            mo3080b();
        } catch (bfq e) {
            Log.e("core-hceclient", "::TokenOpenProvisionDelegate::catch::", e);
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo3080b() {
        bew.m2863a(new bgl().mo3102a(bgz.m3019a()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo3081c() {
        bew.m2863a(new bgl().mo3102a(new bhl().mo3128a(bgp.OPERATION.f3180c, "HCECLIENTSC_DATA_CONTEXT").getBytes()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo3082d() {
        bhl bhl = new bhl();
        String str = bgp.OPERATION.f3180c;
        return bhl.mo3131b(str, "HCECLIENT_DATA_CONTEXT") && bhl.mo3131b(str, "HCECLIENT_META_DATA");
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo3083e() {
        try {
            bet a = bet.m2847a();
            bgl bgl = new bgl();
            String str = bgp.OPERATION.f3180c;
            bhl bhl = new bhl();
            String a2 = bhl.mo3128a(str, "HCECLIENT_DATA_CONTEXT");
            if (a2 != null) {
                byte[] bytes = a2.getBytes();
                int length = bytes.length;
                int i = length + 1024;
                byte[] bArr = new byte[i];
                bew.m2863a(bgl.mo3100a(1, bytes, length, bArr, i));
                if (bgl.m2964b()) {
                    bArr = bgl.mo3114a();
                }
                String str2 = new String(bArr);
                if (str2.length() == 0) {
                    new String("TokenOpenProvisionDelegate::destBuffer::");
                } else {
                    "TokenOpenProvisionDelegate::destBuffer::".concat(str2);
                }
                bhp.m3059c(new String(bArr));
                Object[] a3 = bgz.m3021a(bgz.m3021a(bArr)[0].toString().getBytes());
                String obj = a3[0].toString();
                String obj2 = a3[1].toString();
                String a4 = bhl.mo3128a(str, "HCECLIENT_META_DATA");
                String valueOf = String.valueOf(a4);
                if (valueOf.length() == 0) {
                    new String("TokenOpenProvisionDelegate::sdkMetatData::");
                } else {
                    "TokenOpenProvisionDelegate::sdkMetatData::".concat(valueOf);
                }
                String obj3 = bgz.m3021a(a4.getBytes())[0].toString();
                String valueOf2 = String.valueOf(obj);
                if (valueOf2.length() == 0) {
                    new String("TokenOpenProvisionDelegate::dgiJson::");
                } else {
                    "TokenOpenProvisionDelegate::dgiJson::".concat(valueOf2);
                }
                String valueOf3 = String.valueOf(obj2);
                if (valueOf3.length() == 0) {
                    new String("TokenOpenProvisionDelegate::tagJson::");
                } else {
                    "TokenOpenProvisionDelegate::tagJson::".concat(valueOf3);
                }
                String valueOf4 = String.valueOf(obj3);
                if (valueOf4.length() == 0) {
                    new String("TokenOpenProvisionDelegate::metaDataJson::");
                } else {
                    "TokenOpenProvisionDelegate::metaDataJson::".concat(valueOf4);
                }
                a.f3119a.putAll((Map) bhf.m3034a(obj));
                a.f3120b.putAll(bev.m2857a(obj2));
                a.f3122d.putAll(bev.m2857a(obj3));
                for (bhz bhz : a.f3122d.keySet()) {
                    String valueOf5 = String.valueOf(bhz);
                    String valueOf6 = String.valueOf(beu.m2849a().get(bhz));
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf5).length() + 54 + String.valueOf(valueOf6).length());
                    sb.append("::: TokenOpenProvisionDelegate  MetaData Map  :::");
                    sb.append(valueOf5);
                    sb.append("-- > ");
                    sb.append(valueOf6);
                    sb.toString();
                }
                return;
            }
            throw new bfq(bha.OPERATION_NOT_SUPPORTED);
        } catch (bhg e) {
            throw new bfq(bha.JSON_PARSING_FAILURE);
        } catch (bfq e2) {
            Log.e("core-hceclient", "::TokenOpenProvisionDelegate::catch::", e2);
            throw e2;
        }
    }
}
