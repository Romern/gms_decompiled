package p000;

import android.content.Context;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: atoq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atoq {

    /* renamed from: a */
    private static final srn f90611a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    private static float m76236a(btqp btqp) {
        btqn btqn = btqp.f150001h;
        if (btqn == null) {
            btqn = btqn.f149986e;
        }
        if (btqn.f149988a == null) {
            return Float.MAX_VALUE;
        }
        btqn btqn2 = btqp.f150001h;
        if (btqn2 == null) {
            btqn2 = btqn.f149986e;
        }
        btnc btnc = btqn2.f149988a;
        if (btnc == null) {
            btnc = btnc.f149591d;
        }
        return btnc.f149595c;
    }

    /* renamed from: a */
    public final int mo50090a(Context context) {
        int i;
        String[] strArr;
        String[] strArr2;
        int i2;
        String str;
        int i3;
        String[] strArr3;
        int i4;
        Context context2 = context;
        if (!ssk.m36235a(context)) {
            return 1;
        }
        synchronized (atoq.class) {
            String str2 = "TapInfos";
            try {
                String[] a = atmw.m76197a(context2, str2);
                int length = a.length;
                for (int i5 = 0; i5 < length; i5++) {
                    String str3 = a[i5];
                    String[] a2 = atmw.m76198a(context2, str3, str2);
                    int length2 = a2.length;
                    int i6 = 0;
                    while (i6 < length2) {
                        String str4 = a2[i6];
                        if (asjg.m74214a(context2, str4, str3)) {
                            atmv[] a3 = atmw.m76196a(context2, str4, str3, Integer.MAX_VALUE, "TapInfos");
                            atop atop = new atop();
                            int length3 = a3.length;
                            HashMap hashMap = new HashMap(length3);
                            str = str2;
                            int i7 = 0;
                            while (i7 < length3) {
                                String[] strArr4 = a;
                                atmv atmv = a3[i7];
                                try {
                                    btqp btqp = (btqp) atmv.mo50046a(btqp.f149992o);
                                    i4 = length;
                                    strArr3 = a2;
                                    i3 = length2;
                                    atop.f90610b.put(Long.valueOf(atmv.f90518a), btqp);
                                    Long l = (Long) hashMap.put(btqp.f149994a, Long.valueOf(atmv.f90518a));
                                    if (l != null) {
                                        if (m76236a((btqp) atop.f90610b.get(l)) < m76236a(btqp)) {
                                            hashMap.put(btqp.f149994a, l);
                                            atop.f90610b.remove(Long.valueOf(atmv.f90518a));
                                            atop.f90609a.add(Long.valueOf(atmv.f90518a));
                                        } else {
                                            atop.f90609a.add(l);
                                            atop.f90610b.remove(l);
                                        }
                                    }
                                } catch (bxwf e) {
                                    i4 = length;
                                    strArr3 = a2;
                                    i3 = length2;
                                    bnsl bnsl = (bnsl) f90611a.mo68388c();
                                    bnsl.mo68437a(e);
                                    bnsl.mo68405a("Stored proto is not TapInfo");
                                    atop.f90609a.add(Long.valueOf(atmv.f90518a));
                                }
                                i7++;
                                length = i4;
                                a2 = strArr3;
                                a = strArr4;
                                length2 = i3;
                            }
                            atmw.m76194a(context2, bqcr.m112597a(atop.f90609a), "TapInfos");
                            Iterator it = bnjd.m109574a(atop.f90610b.entrySet(), 50).iterator();
                            while (it.hasNext()) {
                                List list = (List) it.next();
                                bxvd da = btqr.f150032c.mo74144da();
                                long[] jArr = new long[list.size()];
                                int i8 = 0;
                                while (i8 < list.size()) {
                                    Map.Entry entry = (Map.Entry) list.get(i8);
                                    Iterator it2 = it;
                                    btqp btqp2 = (btqp) entry.getValue();
                                    List list2 = list;
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    btqr btqr = (btqr) da.f164949b;
                                    btqp2.getClass();
                                    String[] strArr5 = a;
                                    if (!btqr.f150034a.mo73666a()) {
                                        btqr.f150034a = GeneratedMessageLite.m124021a(btqr.f150034a);
                                    }
                                    btqr.f150034a.add(btqp2);
                                    jArr[i8] = ((Long) entry.getKey()).longValue();
                                    i8++;
                                    list = list2;
                                    it = it2;
                                    a = strArr5;
                                }
                                Iterator it3 = it;
                                String[] strArr6 = a;
                                bxyk a4 = atyh.m76556a(System.currentTimeMillis());
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                a4.getClass();
                                ((btqr) da.f164949b).f150035b = a4;
                                try {
                                    atff.m75759a(askg.m74281a(str4, str3, context2), "t/transaction/tap/capturetapinfo", (btqr) da.mo74062i(), btqs.f150036a);
                                    atmw.m76194a(context2, jArr, "TapInfos");
                                    it = it3;
                                    a = strArr6;
                                } catch (IllegalArgumentException e2) {
                                    e = e2;
                                    throw new RuntimeException(e);
                                } catch (IOException e3) {
                                    e = e3;
                                    throw new RuntimeException(e);
                                } catch (atfh e4) {
                                    e = e4;
                                    throw new RuntimeException(e);
                                }
                            }
                            strArr = a;
                            i2 = length;
                            strArr2 = a2;
                            i = length2;
                        } else {
                            str = str2;
                            strArr = a;
                            i2 = length;
                            strArr2 = a2;
                            i = length2;
                            atmw.m76193a(context2, str4, str3, "TapInfos");
                        }
                        i6++;
                        str2 = str;
                        length = i2;
                        a2 = strArr2;
                        a = strArr;
                        length2 = i;
                    }
                }
                return 0;
            } catch (RuntimeException e5) {
                return 2;
            } catch (asks e6) {
                return 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
