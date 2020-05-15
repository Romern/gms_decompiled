package com.google.android.gms.tapandpay.secard;

import android.content.Context;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SeTransactionSyncTaskOperation implements aspm {

    /* renamed from: a */
    private static final srn f108653a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    public static void m93098a(Context context, atgf atgf, atgn atgn) {
        aeat a = aeat.m51532a(context);
        if (!atgf.mo49940a() || atgn.mo49946a().isEmpty()) {
            ((bnsl) f108653a.mo68390d()).mo68420a("Cancelling task %s", "secard.transactions.sync");
            a.mo33986a("secard.transactions.sync", "com.google.android.gms.tapandpay.gcmtask.TapAndPayGcmTaskService");
            return;
        }
        ((bnsl) f108653a.mo68390d()).mo68420a("Scheduling task %s", "secard.transactions.sync");
        aebl aebl = new aebl();
        aebl.f63097i = "com.google.android.gms.tapandpay.gcmtask.TapAndPayGcmTaskService";
        aebl.f63099k = "secard.transactions.sync";
        aebl.f63070a = cgwh.f187848a.mo6606a().mo84566c();
        aebl.f63071b = TimeUnit.MINUTES.toSeconds(20);
        aebl.mo34023a(0);
        aebl.mo34024a(0, cdny.m134338c() ? 1 : 0);
        aebl.mo34027b(1);
        aeat.m51532a(context).mo33984a(aebl.mo33974b());
    }

    /* renamed from: a */
    public final int mo49332a(aecc aecc, Context context) {
        int i;
        int i2;
        int i3;
        int i4;
        bxvd da;
        Context context2 = context;
        String str = aecc.f63128a;
        if (!"secard.transactions.sync".equals(str)) {
            ((bnsl) f108653a.mo68388c()).mo68420a("Got an unexpected task service tag: %s", str);
            return 2;
        }
        String b = askc.m74272b();
        try {
            AccountInfo b2 = asix.m74201b(context2, b);
            atgf a = atgf.m75807a(context);
            if (b2 == null || !a.mo49940a()) {
                return 0;
            }
            atgn a2 = atgn.m75827a(new askf(b2, b, context2));
            try {
                List a3 = a2.mo49946a();
                if (a3.isEmpty()) {
                    return 0;
                }
                try {
                    Map map = bnoj.f131912b;
                    if (!a3.isEmpty()) {
                        Iterator it = a3.iterator();
                        atgu atgu = null;
                        while (true) {
                            if (it.hasNext()) {
                                atgu atgu2 = (atgu) it.next();
                                if (atgu2.f90326c == atgt.ID) {
                                    map = a2.mo49947a(a3, a2.mo49957d());
                                    a2.f90305e.mo49737a(3, 2);
                                    break;
                                } else if (atgu2.f90326c == atgt.QUICPAY && atgu2.f90331h) {
                                    atgu = atgu2;
                                }
                            } else if (!a2.mo49956c()) {
                                a2.f90305e.mo49762d();
                            } else if (atgu != null) {
                                map = bnhe.m109408a(atgt.QUICPAY, atgu);
                                a2.f90305e.mo49762d();
                            } else {
                                a2.f90305e.mo49751a("", "");
                                map = a2.mo49947a(a3, a2.mo49957d());
                                a2.f90305e.mo49737a(3, 5);
                            }
                        }
                    } else if (a2.mo49956c()) {
                        a2.f90305e.mo49751a("", "");
                        map = a2.mo49947a(a3, a2.mo49957d());
                        a2.f90305e.mo49737a(3, 5);
                    }
                    atgt[] values = atgt.values();
                    int length = values.length;
                    int i5 = 1;
                    int i6 = 0;
                    boolean z = true;
                    while (i6 < length) {
                        atgt atgt = values[i6];
                        atgu atgu3 = (atgu) map.get(atgt);
                        if (atgu3 == null) {
                            i2 = length;
                            i = i6;
                        } else {
                            try {
                                bngx b3 = a2.f90304d.mo49942b(atgt);
                                b3.size();
                                ArrayList arrayList = new ArrayList();
                                int i7 = 0;
                                while (i7 < b3.size()) {
                                    breq breq = (breq) b3.get(i7);
                                    try {
                                        int e = breq.mo60906e();
                                        i4 = 14;
                                        if (e != i5) {
                                            if (e != 23) {
                                                if (e == 27) {
                                                    i4 = 20;
                                                } else if (e != 13) {
                                                    if (e != 14) {
                                                        breq.mo60906e();
                                                        i4 = 2;
                                                    }
                                                }
                                            }
                                            i4 = 21;
                                        } else {
                                            i4 = 3;
                                        }
                                        da = btqj.f149958e.mo74144da();
                                        i2 = length;
                                    } catch (IllegalStateException e2) {
                                        i2 = length;
                                        i3 = i6;
                                        i7++;
                                        length = i2;
                                        i6 = i3;
                                        i5 = 1;
                                    }
                                    try {
                                        long a4 = breq.mo60902a();
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        ((btqj) da.f164949b).f149963d = a4;
                                        bxvd da2 = btnd.f149596c.mo74144da();
                                        String currencyCode = breq.mo60904c().getCurrencyCode();
                                        if (da2.f164950c) {
                                            da2.mo74035c();
                                            da2.f164950c = false;
                                        }
                                        currencyCode.getClass();
                                        ((btnd) da2.f164949b).f149599b = currencyCode;
                                        i3 = i6;
                                        try {
                                            long longValue = breq.mo60903b().multiply(atgn.f90302b).longValue();
                                            if (da2.f164950c) {
                                                da2.mo74035c();
                                                da2.f164950c = false;
                                            }
                                            ((btnd) da2.f164949b).f149598a = longValue;
                                            if (da.f164950c) {
                                                da.mo74035c();
                                                da.f164950c = false;
                                            }
                                            btnd btnd = (btnd) da2.mo74062i();
                                            btnd.getClass();
                                            ((btqj) da.f164949b).f149962c = btnd;
                                            long d = breq.mo60905d();
                                            if (da.f164950c) {
                                                da.mo74035c();
                                                da.f164950c = false;
                                            }
                                            btqj btqj = (btqj) da.f164949b;
                                            btqj.f149961b = d;
                                            btqj.f149960a = i4 - 2;
                                            arrayList.add((btqj) da.mo74062i());
                                        } catch (IllegalStateException e3) {
                                        }
                                    } catch (IllegalStateException e4) {
                                        i3 = i6;
                                        i7++;
                                        length = i2;
                                        i6 = i3;
                                        i5 = 1;
                                    } catch (atfh | bres | IOException e5) {
                                        e = e5;
                                        i = i6;
                                        bnsl bnsl = (bnsl) atgn.f90301a.mo68387b();
                                        bnsl.mo68437a(e);
                                        bnsl.mo68420a("Error while reading transactions for %s", atgt);
                                        z = false;
                                        i6 = i + 1;
                                        length = i2;
                                        i5 = 1;
                                    }
                                    i7++;
                                    length = i2;
                                    i6 = i3;
                                    i5 = 1;
                                }
                                i2 = length;
                                i = i6;
                                try {
                                    if (!arrayList.isEmpty()) {
                                        bxvd da3 = btqh.f149951d.mo74144da();
                                        int i8 = atgt.f90322g;
                                        if (da3.f164950c) {
                                            da3.mo74035c();
                                            da3.f164950c = false;
                                        }
                                        ((btqh) da3.f164949b).f149954b = btod.m116976a(i8);
                                        if (da3.f164950c) {
                                            da3.mo74035c();
                                            da3.f164950c = false;
                                        }
                                        btqh btqh = (btqh) da3.f164949b;
                                        if (!btqh.f149955c.mo73666a()) {
                                            btqh.f149955c = GeneratedMessageLite.m124021a(btqh.f149955c);
                                        }
                                        bxsy.m123078a(arrayList, btqh.f149955c);
                                        btiy btiy = atgu3.f90324a.f149123a;
                                        if (btiy == null) {
                                            btiy = btiy.f149054c;
                                        }
                                        if (da3.f164950c) {
                                            da3.mo74035c();
                                            da3.f164950c = false;
                                        }
                                        btiy.getClass();
                                        ((btqh) da3.f164949b).f149953a = btiy;
                                        atff.m75759a(a2.f90303c, "t/secureelement/tokenizedtransaction/insert", (btqh) da3.mo74062i(), btqi.f149956a);
                                    }
                                } catch (atfh | bres | IOException e6) {
                                    e = e6;
                                    bnsl bnsl2 = (bnsl) atgn.f90301a.mo68387b();
                                    bnsl2.mo68437a(e);
                                    bnsl2.mo68420a("Error while reading transactions for %s", atgt);
                                    z = false;
                                    i6 = i + 1;
                                    length = i2;
                                    i5 = 1;
                                }
                            } catch (atfh | bres | IOException e7) {
                                e = e7;
                                i2 = length;
                                i = i6;
                                bnsl bnsl22 = (bnsl) atgn.f90301a.mo68387b();
                                bnsl22.mo68437a(e);
                                bnsl22.mo68420a("Error while reading transactions for %s", atgt);
                                z = false;
                                i6 = i + 1;
                                length = i2;
                                i5 = 1;
                            }
                        }
                        i6 = i + 1;
                        length = i2;
                        i5 = 1;
                    }
                    if (!z) {
                        return 2;
                    }
                    return 0;
                } catch (bres e8) {
                    bnsl bnsl3 = (bnsl) atgn.f90301a.mo68387b();
                    bnsl3.mo68437a(e8);
                    bnsl3.mo68405a("Error while reading default cards");
                    return 2;
                }
            } catch (asks e9) {
                return 2;
            }
        } catch (asks e10) {
            bnsl bnsl4 = (bnsl) f108653a.mo68387b();
            bnsl4.mo68437a(e10);
            bnsl4.mo68405a("Error retrieving active account");
            return 2;
        }
    }

    /* renamed from: a */
    public final void mo49333a(Context context) {
        try {
            askf a = askg.m74277a(context);
            a.mo49209a();
            m93098a(context, atgf.m75807a(context), atgn.m75827a(a));
        } catch (asks | IllegalStateException e) {
            bnsl bnsl = (bnsl) f108653a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Error retrieving account");
        }
    }
}
