package p000;

import android.util.Log;
import java.util.Map;

/* renamed from: bfc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bfc extends bew {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgr.a(java.lang.String, boolean):java.lang.Object
     arg types: [java.lang.String, int]
     candidates:
      bgr.a(java.lang.String, java.lang.Object):void
      bgr.a(java.lang.String, boolean):java.lang.Object */
    /* renamed from: a */
    public final void mo3074a() {
        String str = bgp.OPERATION.f3180c;
        String valueOf = String.valueOf(str);
        if (valueOf.length() == 0) {
            new String("::TokenCloseDelegate::tokenRefId::");
        } else {
            "::TokenCloseDelegate::tokenRefId::".concat(valueOf);
        }
        bhl bhl = new bhl();
        try {
            bet a = bet.m2847a();
            Map map = a.f3119a;
            Map map2 = a.f3120b;
            Map map3 = a.f3122d;
            if (map.isEmpty() || map2.isEmpty() || map3.isEmpty()) {
                bhl.mo3129a(str);
            } else {
                bgr bgr = bgs.f3191a;
                if (bes.m2844a("BLOCK_IN_CLOSE") != null) {
                    if (((Short) bes.m2844a("BLOCK_IN_CLOSE")).shortValue() == -23238) {
                        bgd.m2922a(4);
                    }
                }
                bgl bgl = new bgl();
                bet bet = (bet) bgr.mo3119a("DATA_CONTEXT", false);
                Map map4 = bet.f3119a;
                Map map5 = bet.f3120b;
                String a2 = bhf.m3035a(map4);
                StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 1);
                sb.append('1');
                sb.append(a2);
                String sb2 = sb.toString();
                String a3 = bhf.m3035a(map5);
                StringBuilder sb3 = new StringBuilder(String.valueOf(a3).length() + 1);
                sb3.append('1');
                sb3.append(a3);
                String sb4 = sb3.toString();
                String valueOf2 = String.valueOf(sb2);
                if (valueOf2.length() == 0) {
                    new String("::TokenCloseDelegate::dgiJson::");
                } else {
                    "::TokenCloseDelegate::dgiJson::".concat(valueOf2);
                }
                String valueOf3 = String.valueOf(sb4);
                if (valueOf3.length() == 0) {
                    new String("::TokenCloseDelegate::tagJson::");
                } else {
                    "::TokenCloseDelegate::tagJson::".concat(valueOf3);
                }
                String str2 = new String(bgz.m3020a(sb2, sb4));
                StringBuilder sb5 = new StringBuilder(str2.length() + 1);
                sb5.append('1');
                sb5.append(str2);
                byte[] a4 = bgz.m3020a(sb5.toString());
                String str3 = new String(a4);
                if (str3.length() == 0) {
                    new String("::TokenCloseDelegate::srcBuffer::");
                } else {
                    "::TokenCloseDelegate::srcBuffer::".concat(str3);
                }
                bhp.m3059c(new String(a4));
                int length = a4.length;
                int b = bew.m2864b(length);
                byte[] bArr = new byte[b];
                int a5 = bgl.mo3103a(a4, length, bArr, b);
                bew.m2863a(a5);
                if (bgl.m2964b()) {
                    bArr = bgl.mo3114a();
                }
                if (a5 > 0) {
                    String str4 = new String(bArr);
                    if (str4.length() == 0) {
                        new String("::TokenCloseDelegate::wrap::destBuffer::");
                    } else {
                        "::TokenCloseDelegate::wrap::destBuffer::".concat(str4);
                    }
                    bhp.m3059c(new String(bArr));
                    StringBuilder sb6 = new StringBuilder(53);
                    sb6.append("::TokenCloseDelegate::wrap::wrapSCStatus::");
                    sb6.append(a5);
                    sb6.toString();
                    bhl.mo3130a(str, "HCECLIENT_DATA_CONTEXT", new String(bArr));
                }
                Map map6 = bet.f3122d;
                String a6 = bhf.m3035a(map6);
                StringBuilder sb7 = new StringBuilder(String.valueOf(a6).length() + 1);
                sb7.append('1');
                sb7.append(a6);
                bhl.mo3130a(str, "HCECLIENT_META_DATA", new String(bgz.m3020a(sb7.toString())));
                String valueOf4 = String.valueOf(bhf.m3035a(map6));
                if (valueOf4.length() == 0) {
                    new String("::Stashed metaData JSON::");
                } else {
                    "::Stashed metaData JSON::".concat(valueOf4);
                }
            }
            mo3075b();
        } catch (bfq e) {
            Log.e("core-hceclient", "::TokenCloseDelegate::catch::", e);
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo3075b() {
        StringBuilder sb = new StringBuilder("111");
        sb.append(String.valueOf(4));
        sb.append(4096);
        for (int i = 0; i < 4096; i++) {
            sb.append('0');
        }
        sb.append("10");
        byte[] bytes = sb.toString().getBytes();
        String str = new String(bytes);
        if (str.length() == 0) {
            new String("::TokenCloseDelegate::close::srcBuffer::");
        } else {
            "::TokenCloseDelegate::close::srcBuffer::".concat(str);
        }
        bgl bgl = new bgl();
        bew.m2863a(bgl.mo3106b(bytes));
        if (bgl.m2964b()) {
            bytes = bgl.mo3114a();
        }
        bhl bhl = new bhl();
        String str2 = new String(bytes);
        if (str2.length() == 0) {
            new String("::TokenCloseDelegate::close::srcBuffer::");
        } else {
            "::TokenCloseDelegate::close::srcBuffer::".concat(str2);
        }
        bhl.mo3130a(bgp.OPERATION.f3180c, "HCECLIENTSC_DATA_CONTEXT", new String(bytes));
    }
}
