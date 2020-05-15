package com.google.android.gms.tapandpay.hce.task;

import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.nfc.cardemulation.CardEmulation;
import android.os.Bundle;
import android.os.SystemClock;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.felicanetworks.sdu.ErrorInfo;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TapAndPayAidRegistrationTaskOperation implements aspm {

    /* renamed from: a */
    private static final srn f108519a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    private static bngx m93034a(bngx bngx, bngx bngx2) {
        ArrayList arrayList = new ArrayList(bngx);
        arrayList.removeAll(bngx2);
        return bngx.m109368a((Collection) arrayList);
    }

    /* renamed from: b */
    private static boolean m93036b(Context context) {
        try {
            return DatabaseUtils.queryNumEntries(asko.m74292a(context).mo49214a(), "PaymentCards") > 0;
        } catch (asks e) {
            bnsl bnsl = (bnsl) f108519a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("com.google.android.gms.tapandpay.hce.task.TapAndPayAidRegistrationTaskOperation", "b", (int) ErrorInfo.TYPE_SDU_UNKNOWN, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to obtain token status");
            return false;
        }
    }

    /* renamed from: a */
    public final void mo49333a(Context context) {
    }

    /* renamed from: a */
    private static final void m93035a(Context context, asut asut) {
        try {
            if (DatabaseUtils.queryNumEntries(asko.m74292a(context).mo49214a(), "PaymentCards") > 0) {
                bngx a = m93034a(asut.f89774c, asut.f89772a);
                bngx a2 = m93034a(asut.f89772a, asut.f89774c);
                atam atam = (atam) bmxu.m108565a(null, new atam(context, null));
                int i = asut.f89776e;
                int i2 = asut.f89775d;
                bngx bngx = asut.f89774c;
                long elapsedRealtime = SystemClock.elapsedRealtime() - asut.f89773b;
                bxvd g = atam.mo49765g(140);
                bxvd da = boyj.f135319i.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                boyj boyj = (boyj) da.f164949b;
                int i3 = i - 1;
                if (i != 0) {
                    boyj.f135322b = i3;
                    int i4 = boyj.f135321a | 1;
                    boyj.f135321a = i4;
                    boyj.f135323c = i2 - 1;
                    int i5 = i4 | 2;
                    boyj.f135321a = i5;
                    boyj.f135324d = 1;
                    boyj.f135321a = i5 | 4;
                    if (!boyj.f135325e.mo73666a()) {
                        boyj.f135325e = bxvk.m124021a(boyj.f135325e);
                    }
                    bxsy.m123078a(bngx, boyj.f135325e);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    boyj boyj2 = (boyj) da.f164949b;
                    if (!boyj2.f135326f.mo73666a()) {
                        boyj2.f135326f = bxvk.m124021a(boyj2.f135326f);
                    }
                    bxsy.m123078a(a, boyj2.f135326f);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    boyj boyj3 = (boyj) da.f164949b;
                    if (!boyj3.f135327g.mo73666a()) {
                        boyj3.f135327g = bxvk.m124021a(boyj3.f135327g);
                    }
                    bxsy.m123078a(a2, boyj3.f135327g);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    boyj boyj4 = (boyj) da.f164949b;
                    boyj4.f135321a |= 8;
                    boyj4.f135328h = elapsedRealtime;
                    if (g.f164950c) {
                        g.mo74035c();
                        g.f164950c = false;
                    }
                    bpbx bpbx = (bpbx) g.f164949b;
                    boyj boyj5 = (boyj) da.mo74062i();
                    bpbx bpbx2 = bpbx.f135635S;
                    boyj5.getClass();
                    bpbx.f135646J = boyj5;
                    bpbx.f135656b |= 64;
                    atam.mo49741a((bpbx) g.mo74062i());
                    return;
                }
                throw null;
            }
        } catch (asks e) {
            bnsl bnsl = (bnsl) f108519a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("com.google.android.gms.tapandpay.hce.task.TapAndPayAidRegistrationTaskOperation", "b", (int) ErrorInfo.TYPE_SDU_UNKNOWN, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to obtain token status");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x013f A[Catch:{ asqn -> 0x0148 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0199  */
    /* renamed from: a */
    public final int mo49332a(aecc aecc, Context context) {
        int i;
        bngx bngx;
        int i2;
        char c;
        bngm bngm;
        Cursor query;
        Throwable th;
        Cursor query2;
        Throwable th2;
        aecc aecc2 = aecc;
        Context context2 = context;
        if ("hce.dynamic_aid_registration.oneoff".equals(aecc2.f63128a)) {
            Bundle bundle = aecc2.f63129b;
            if (bundle != null) {
                i = boyh.m111663a(bundle.getInt("registration_reason", 0));
            } else {
                i = 1;
            }
            if (i == 0) {
                i = 1;
            }
            asut asut = new asut(i, SystemClock.elapsedRealtime(), asqo.m74468a(context));
            try {
                asqp asqp = (asqp) bmxu.m108565a(null, new asqp());
                String b = cgwd.m147194b();
                int hashCode = b.hashCode();
                if (hashCode != -1958530330) {
                    if (hashCode == -261807623 && b.equals("REGISTRATION_MODE_STATIC_LIST")) {
                        c = 0;
                        if (c == 0) {
                            bngm = asqp.m74472a();
                        } else if (c != 1) {
                            bngm = bnon.f131923a;
                        } else {
                            try {
                                String b2 = askc.m74272b();
                                query = atdg.m75596a(context).query("PaymentBundles", new String[]{"supported_aids"}, "environment= ?", new String[]{b2}, null, null, null);
                                do {
                                    if (!query.moveToNext()) {
                                        if (query != null) {
                                            query.close();
                                        }
                                        bnia bnia = new bnia();
                                        bnia.mo67629b("325041592E5359532E4444463031");
                                        query2 = atdg.m75596a(context).query("PaymentBundles", new String[]{"supported_aids"}, "environment= ?", new String[]{b2}, null, null, null);
                                        bnia bnia2 = new bnia();
                                        while (query2.moveToNext()) {
                                            byte[] blob = query2.getBlob(0);
                                            if (blob != null) {
                                                bnia2.mo67752b((Iterable) atdg.m75597a(blob).f165758a);
                                            }
                                        }
                                        bnic a = bnia2.mo67751a();
                                        if (query2 != null) {
                                            query2.close();
                                        }
                                        bnia.mo67752b((Iterable) a);
                                        bnia.mo67752b((Iterable) cgwd.m147196d().f165797a);
                                        bngm = bnia.mo67751a();
                                    }
                                } while (query.getBlob(0) != null);
                                if (query != null) {
                                    query.close();
                                }
                                throw new asqn(asqm.BACKFILL_REQUIRED);
                            } catch (asks e) {
                                throw new asqn(asqm.DATABASE_EXCEPTION, e);
                            } catch (Throwable th3) {
                                bqye.m113761a(th2, th3);
                            }
                        }
                        bngx = bngm.mo67639g();
                        asut.f89774c = bngx;
                        boolean z = bundle == null && bundle.getBoolean("register_if_changed_only", false);
                        if (bngx.isEmpty()) {
                            CardEmulation b3 = asqo.m74470b(context);
                            if (b3 == null) {
                                ((bnsl) asqo.f89397a.mo68387b()).mo68405a("CardEmulation is null while trying to unregister AIDs.");
                            } else if (asqo.m74468a(context).isEmpty() || b3.removeAidsForService(new ComponentName(context2, "com.google.android.gms.tapandpay.hce.service.TpHceService"), "payment")) {
                                bnsl bnsl = (bnsl) f108519a.mo68390d();
                                bnsl.mo68432a("com.google.android.gms.tapandpay.hce.task.TapAndPayAidRegistrationTaskOperation", "a", 115, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl.mo68405a("Dynamic AID registration removed.");
                                if (!cgwd.m147194b().equals("REGISTRATION_MODE_DISABLED")) {
                                    i2 = 5;
                                } else {
                                    i2 = 7;
                                }
                                asut.f89776e = i2;
                                m93035a(context2, asut);
                                return 0;
                            }
                            bnsl bnsl2 = (bnsl) f108519a.mo68388c();
                            bnsl2.mo68432a("com.google.android.gms.tapandpay.hce.task.TapAndPayAidRegistrationTaskOperation", "a", 124, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl2.mo68405a("Dynamic AID registration removal failed.");
                            asut.f89776e = 8;
                            m93035a(context2, asut);
                            return 2;
                        } else if (z && asqo.m74471b(context2, bngx)) {
                            bnsl bnsl3 = (bnsl) f108519a.mo68390d();
                            bnsl3.mo68432a("com.google.android.gms.tapandpay.hce.task.TapAndPayAidRegistrationTaskOperation", "a", 134, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl3.mo68405a("Registration matches requested list. Skipping AID registration.");
                            asut.f89776e = 4;
                            m93035a(context2, asut);
                            return 0;
                        } else if (asqo.m74469a(context2, bngx)) {
                            bnsl bnsl4 = (bnsl) f108519a.mo68390d();
                            bnsl4.mo68432a("com.google.android.gms.tapandpay.hce.task.TapAndPayAidRegistrationTaskOperation", "a", 141, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl4.mo68405a("AID registration succeeded.");
                            if (z) {
                                asut.f89776e = 3;
                            } else {
                                asut.f89776e = 2;
                            }
                            m93035a(context2, asut);
                            return 0;
                        } else {
                            bnsl bnsl5 = (bnsl) f108519a.mo68387b();
                            bnsl5.mo68432a("com.google.android.gms.tapandpay.hce.task.TapAndPayAidRegistrationTaskOperation", "a", (int) MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl5.mo68405a("AID registration failed.");
                            asut.f89776e = 6;
                            m93035a(context2, asut);
                            return 1;
                        }
                    }
                } else if (b.equals("REGISTRATION_MODE_SELECTIVE")) {
                    c = 1;
                    if (c == 0) {
                    }
                    bngx = bngm.mo67639g();
                    asut.f89774c = bngx;
                    if (bundle == null) {
                    }
                    if (bngx.isEmpty()) {
                    }
                }
                c = 65535;
                if (c == 0) {
                }
                bngx = bngm.mo67639g();
            } catch (asqn e2) {
                asqm asqm = asqm.BACKFILL_REQUIRED;
                int ordinal = e2.f89396a.ordinal();
                if (ordinal == 0) {
                    asut.f89776e = 13;
                    m93035a(context2, asut);
                    bngx = asqp.m74472a().mo67639g();
                } else if (ordinal != 1) {
                    bnsl bnsl6 = (bnsl) f108519a.mo68387b();
                    bnsl6.mo68432a("com.google.android.gms.tapandpay.hce.task.TapAndPayAidRegistrationTaskOperation", "a", 101, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl6.mo68405a("Unknown TapAndPayAidError");
                    asut.f89776e = 6;
                    m93035a(context2, asut);
                    return 1;
                } else {
                    asut.f89776e = 12;
                    m93035a(context2, asut);
                    return 1;
                }
            }
            asut.f89774c = bngx;
            if (bundle == null) {
            }
            if (bngx.isEmpty()) {
            }
        } else {
            bnsl bnsl7 = (bnsl) f108519a.mo68388c();
            bnsl7.mo68432a("com.google.android.gms.tapandpay.hce.task.TapAndPayAidRegistrationTaskOperation", "a", 61, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl7.mo68405a("Unknown task tag received by HCE service init task operation.");
            return 2;
        }
        throw th;
        throw th2;
    }
}
