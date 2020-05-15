package com.google.android.gms.tapandpay.tapreporting;

import android.content.Context;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UploadDoodleRenderedInfosTaskOperation implements aspm {

    /* renamed from: a */
    private static final srn f108743a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    static void m93186b(Context context) {
        aebi aebi = new aebi();
        aebi.f63097i = "com.google.android.gms.tapandpay.gcmtask.TapAndPayGcmTaskService";
        aebi.f63099k = "tapreporting.uploadDoodleRenderedInfos";
        aebi.mo34023a(0);
        aebi.mo34004a(0, TimeUnit.MINUTES.toSeconds(60));
        aebi.mo34027b(1);
        aeat.m51532a(context).mo33984a(aebi.mo33974b());
    }

    /* renamed from: a */
    public final int mo49332a(aecc aecc, Context context) {
        int i;
        String[] strArr;
        atos atos;
        boolean z;
        Context context2 = context;
        String str = aecc.f63128a;
        if ("tapreporting.uploadDoodleRenderedInfos".equals(str)) {
            try {
                atos atos2 = new atos(context2);
                String[] a = atmw.m76197a(context2, "DoodleRenderedInfos");
                int length = a.length;
                boolean z2 = true;
                int i2 = 0;
                while (i2 < length) {
                    String str2 = a[i2];
                    String[] a2 = atmw.m76198a(context2, str2, "DoodleRenderedInfos");
                    int length2 = a2.length;
                    boolean z3 = z2;
                    int i3 = 0;
                    while (i3 < length2) {
                        String str3 = a2[i3];
                        Context context3 = atos2.f90613a;
                        if (asjg.m74214a(context3, str3, str2)) {
                            atmv[] a3 = atmw.m76196a(context3, str3, str2, (int) BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, "DoodleRenderedInfos");
                            ArrayList arrayList = new ArrayList();
                            int length3 = a3.length;
                            atos = atos2;
                            int i4 = 0;
                            while (i4 < length3) {
                                String[] strArr2 = a;
                                int i5 = length;
                                atmv atmv = a3[i4];
                                try {
                                    arrayList.add((btpj) atmv.mo50046a(btpj.f149850c));
                                } catch (bxwf e) {
                                    atmw.m76194a(context3, new long[]{atmv.f90518a}, "DoodleRenderedInfos");
                                }
                                i4++;
                                a = strArr2;
                                length = i5;
                            }
                            try {
                                atoo.m76235a(askg.m74281a(str3, str2, context3), (btpj[]) arrayList.toArray(new btpj[arrayList.size()]));
                                int length4 = a3.length;
                                long[] jArr = new long[length4];
                                int i6 = 0;
                                while (i6 < length4) {
                                    jArr[i6] = a3[i6].f90518a;
                                    i6++;
                                    a = a;
                                    length = length;
                                }
                                strArr = a;
                                i = length;
                                atmw.m76194a(context3, jArr, "DoodleRenderedInfos");
                                z = true;
                            } catch (IOException e2) {
                                strArr = a;
                                i = length;
                                z = false;
                                z3 &= z;
                                i3++;
                                atos2 = atos;
                                a = strArr;
                                length = i;
                            } catch (atfh e3) {
                                strArr = a;
                                i = length;
                                z = false;
                                z3 &= z;
                                i3++;
                                atos2 = atos;
                                a = strArr;
                                length = i;
                            }
                        } else {
                            atos = atos2;
                            strArr = a;
                            i = length;
                            atmw.m76193a(context3, str3, str2, "DoodleRenderedInfos");
                            z = true;
                        }
                        z3 &= z;
                        i3++;
                        atos2 = atos;
                        a = strArr;
                        length = i;
                    }
                    i2++;
                    context2 = context;
                    z2 = z3;
                }
                return z2 ? 0 : 1;
            } catch (asks e4) {
                bnsl bnsl = (bnsl) f108743a.mo68388c();
                bnsl.mo68437a(e4);
                bnsl.mo68405a("Error uploading doodle rendered infos");
                return 2;
            }
        } else {
            ((bnsl) f108743a.mo68388c()).mo68420a("Got an unexpected task service tag: %s", str);
            return 2;
        }
    }

    /* renamed from: a */
    public final void mo49333a(Context context) {
        m93186b(context);
    }
}
