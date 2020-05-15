package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.util.DisplayMetrics;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.pay.Transaction;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.transaction.WalletTransactionDetailsChimeraActivity;
import java.io.IOException;

/* renamed from: atwb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atwb {

    /* renamed from: a */
    public static final srn f91035a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    public final bmxv f91036b = bmvz.f131120a;

    /* renamed from: a */
    private static Transaction m76490a(askf askf, bztn bztn) {
        DisplayMetrics displayMetrics = askf.f89126d.getResources().getDisplayMetrics();
        int round = Math.round(((float) displayMetrics.widthPixels) - (displayMetrics.density * 32.0f));
        int round2 = Math.round(((float) round) * 0.48f);
        bxvd da = bzur.f171456c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bztn.getClass();
        ((bzur) da.f164949b).f171458a = bztn;
        bxvd da2 = bztm.f171347b.mo74144da();
        bxvd da3 = bztl.f171342d.mo74144da();
        float f = displayMetrics.density;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bztl bztl = (bztl) da3.f164949b;
        bztl.f171346c = f;
        bztl.f171344a = round;
        bztl.f171345b = round2;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bztl bztl2 = (bztl) da3.mo74062i();
        bztl2.getClass();
        ((bztm) da2.f164949b).f171349a = bztl2;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bztm bztm = (bztm) da2.mo74062i();
        bztm.getClass();
        ((bzur) da.f164949b).f171459b = bztm;
        try {
            bzus bzus = (bzus) atff.m75769b(askf, "g/transaction/getcoretransaction", (bzur) da.mo74062i(), bzus.f171460b);
            if (bzus.f171462a != null) {
                algt algt = new algt();
                bzuq bzuq = bzus.f171462a;
                if (bzuq == null) {
                    bzuq = bzuq.f171454a;
                }
                algt.mo40310a(bzuq.serializeToBytes());
                return algt.f73511a;
            }
            bnsl bnsl = (bnsl) f91035a.mo68388c();
            bnsl.mo68432a("atwb", "a", 286, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("tryGetTransaction: no transaction returned");
            return null;
        } catch (atfh e) {
            bnsl bnsl2 = (bnsl) f91035a.mo68388c();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("atwb", "a", 288, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("tryGetTransaction: RPC failed");
            return null;
        } catch (IOException e2) {
            return null;
        }
    }

    /* renamed from: a */
    private static void m76491a(askf askf) {
        if (cgwn.m147261k()) {
            try {
                atbd.m75359b(askf);
            } catch (atfh | IOException | IllegalStateException e) {
                bnsl bnsl = (bnsl) f91035a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("atwb", "a", 342, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Update chime setting failed");
            }
        }
    }

    /* renamed from: a */
    private final void m76492a(bmux bmux, askf askf, blci blci) {
        String str;
        int i;
        int i2;
        C1102je jeVar;
        Transaction transaction;
        String str2;
        Transaction transaction2;
        btrd btrd;
        askf askf2 = askf;
        bmuq bmuq = bmux.f130996e;
        if (bmuq == null) {
            bmuq = bmuq.f130966d;
        }
        String str3 = bmuq.f130969b;
        if (!str3.isEmpty()) {
            try {
                btqu btqu = (btqu) btqw.f150046c.mo74144da();
                bxvd da = btqv.f150043b.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                str3.getClass();
                ((btqv) da.f164949b).f150045a = str3;
                btqu.mo70834a(da);
                btqu.mo70833a(btrh.SUPPORTS_INFERRED_RICH_DATA);
                btqy btqy = (btqy) atff.m75759a(askf2, "t/transaction/get", (btqw) btqu.mo74062i(), btqy.f150053b);
                if (btqy.f150055a.size() == 1) {
                    btrg btrg = ((btqx) btqy.f150055a.get(0)).f150052a;
                    if (btrg != null) {
                        CardInfo b = atds.m75666a(askf).mo49853b(btrg.f150097g);
                        if (b != null) {
                            atvv atvv = new atvv(btrg);
                            Context context = askf2.f89126d;
                            sre.m36089i(context);
                            Context context2 = askf2.f89126d;
                            btrb btrb = ((btrg) atvv.f91029a.f164949b).f150095e;
                            if (btrb == null || (btrd = btrb.f150063f) == null || btrd.f150072a.isEmpty()) {
                                str = context2.getString(C0126R.string.tp_default_store_name);
                            } else {
                                btrb btrb2 = ((btrg) atvv.f91029a.f164949b).f150095e;
                                if (btrb2 == null) {
                                    btrb2 = btrb.f150056k;
                                }
                                btrd btrd2 = btrb2.f150063f;
                                if (btrd2 == null) {
                                    btrd2 = btrd.f150070b;
                                }
                                str = btrd2.f150072a;
                            }
                            C1102je a = atbg.m75368a(context, atbf.TRANSACTION_RECEIPTS);
                            atbg.m75376b(a, str);
                            if (!atvv.mo50255f()) {
                                i = !atvv.mo50256g() ? C0126R.string.tp_transaction_notification_text_full : C0126R.string.tp_transaction_declined_notification_text_full;
                            } else {
                                i = C0126R.string.tp_transaction_refund_notification_text_full;
                            }
                            String str4 = b.f108343d;
                            if (atyj.m76564a(b)) {
                                str4 = context.getString(C0126R.string.tp_paypal);
                            }
                            atbg.m75377c(a, context.getString(i, atvv.mo50252c(), str4));
                            a.f22266r = atbf.TRANSACTION_RECEIPTS.f89994e;
                            a.mo13631b(PendingIntent.getService(context, String.valueOf(btrg.f150091a).concat("_dismissed").hashCode(), atbe.m75364a(askf2, blci.serializeToBytes(), 6, b), 134217728));
                            int i3 = !atvv.mo50255f() ? !atvv.mo50256g() ? C0126R.string.tp_transaction_notification_title_sensitive : C0126R.string.tp_transaction_decline_notification_ticker : C0126R.string.tp_transaction_refund_notification_title_sensitive;
                            C1102je a2 = atbg.m75368a(context, atbf.TRANSACTION_RECEIPTS);
                            a2.mo13640e(context.getString(i3));
                            a2.mo13632b(context.getString(C0126R.string.tp_transaction_notification_text_sensitive));
                            if (!atvv.mo50255f()) {
                                i2 = !atvv.mo50256g() ? C0126R.string.tp_transaction_notification_ticker : C0126R.string.tp_transaction_decline_notification_ticker;
                            } else {
                                i2 = C0126R.string.tp_transaction_refund_notification_ticker;
                            }
                            a.mo13639d(context.getString(i2));
                            if (cgwn.m147260j() && (bmuq.f130968a & 2) != 0) {
                                bmxv bmxv = this.f91036b;
                                Boolean valueOf = Boolean.valueOf(alfj.m60866b(askf2.f89126d));
                                bmxv.mo66812a(valueOf);
                                if (valueOf.booleanValue()) {
                                    bztn bztn = bmuq.f130970c;
                                    if (bztn == null) {
                                        bztn = bztn.f171350b;
                                    }
                                    String str5 = bztn.f171352a;
                                    bztn bztn2 = bmuq.f130970c;
                                    if (bztn2 == null) {
                                        bztn2 = bztn.f171350b;
                                    }
                                    DisplayMetrics displayMetrics = askf2.f89126d.getResources().getDisplayMetrics();
                                    int round = Math.round(((float) displayMetrics.widthPixels) - (displayMetrics.density * 32.0f));
                                    int round2 = Math.round(((float) round) * 0.48f);
                                    bxvd da2 = bzur.f171456c.mo74144da();
                                    String str6 = str5;
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bztn2.getClass();
                                    ((bzur) da2.f164949b).f171458a = bztn2;
                                    bxvd da3 = bztm.f171347b.mo74144da();
                                    bxvd da4 = bztl.f171342d.mo74144da();
                                    float f = displayMetrics.density;
                                    jeVar = a2;
                                    if (da4.f164950c) {
                                        da4.mo74035c();
                                        da4.f164950c = false;
                                    }
                                    bztl bztl = (bztl) da4.f164949b;
                                    bztl.f171346c = f;
                                    bztl.f171344a = round;
                                    bztl.f171345b = round2;
                                    if (da3.f164950c) {
                                        da3.mo74035c();
                                        da3.f164950c = false;
                                    }
                                    bztl bztl2 = (bztl) da4.mo74062i();
                                    bztl2.getClass();
                                    ((bztm) da3.f164949b).f171349a = bztl2;
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bztm bztm = (bztm) da3.mo74062i();
                                    bztm.getClass();
                                    ((bzur) da2.f164949b).f171459b = bztm;
                                    try {
                                        bzus bzus = (bzus) atff.m75769b(askf2, "g/transaction/getcoretransaction", (bzur) da2.mo74062i(), bzus.f171460b);
                                        if (bzus.f171462a != null) {
                                            algt algt = new algt();
                                            bzuq bzuq = bzus.f171462a;
                                            if (bzuq == null) {
                                                bzuq = bzuq.f171454a;
                                            }
                                            algt.mo40310a(bzuq.serializeToBytes());
                                            transaction2 = algt.f73511a;
                                        } else {
                                            bnsl bnsl = (bnsl) f91035a.mo68388c();
                                            bnsl.mo68432a("atwb", "a", 286, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            bnsl.mo68405a("tryGetTransaction: no transaction returned");
                                            transaction2 = null;
                                        }
                                    } catch (atfh e) {
                                        bnsl bnsl2 = (bnsl) f91035a.mo68388c();
                                        bnsl2.mo68437a(e);
                                        bnsl2.mo68432a("atwb", "a", 288, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        bnsl2.mo68405a("tryGetTransaction: RPC failed");
                                        transaction2 = null;
                                        transaction = transaction2;
                                        str2 = str6;
                                        a.f22254f = PendingIntent.getActivity(askf2.f89126d, btrg.f150091a.hashCode(), WalletTransactionDetailsChimeraActivity.m93298a(btrg, askf, b, blci, str2, transaction), 134217728);
                                        a.mo13627a(true);
                                        a.f22273y = jeVar.mo13629b();
                                        atbg.m75371a(context, Integer.toString(btrg.f150091a.hashCode()), a);
                                        askf2.f89126d.startService(atbe.m75364a(askf2, blci.serializeToBytes(), 5, b));
                                        return;
                                    } catch (IOException e2) {
                                        transaction2 = null;
                                        transaction = transaction2;
                                        str2 = str6;
                                        a.f22254f = PendingIntent.getActivity(askf2.f89126d, btrg.f150091a.hashCode(), WalletTransactionDetailsChimeraActivity.m93298a(btrg, askf, b, blci, str2, transaction), 134217728);
                                        a.mo13627a(true);
                                        a.f22273y = jeVar.mo13629b();
                                        atbg.m75371a(context, Integer.toString(btrg.f150091a.hashCode()), a);
                                        askf2.f89126d.startService(atbe.m75364a(askf2, blci.serializeToBytes(), 5, b));
                                        return;
                                    }
                                    transaction = transaction2;
                                    str2 = str6;
                                    a.f22254f = PendingIntent.getActivity(askf2.f89126d, btrg.f150091a.hashCode(), WalletTransactionDetailsChimeraActivity.m93298a(btrg, askf, b, blci, str2, transaction), 134217728);
                                    a.mo13627a(true);
                                    a.f22273y = jeVar.mo13629b();
                                    atbg.m75371a(context, Integer.toString(btrg.f150091a.hashCode()), a);
                                    askf2.f89126d.startService(atbe.m75364a(askf2, blci.serializeToBytes(), 5, b));
                                    return;
                                }
                            }
                            jeVar = a2;
                            str2 = null;
                            transaction = null;
                            a.f22254f = PendingIntent.getActivity(askf2.f89126d, btrg.f150091a.hashCode(), WalletTransactionDetailsChimeraActivity.m93298a(btrg, askf, b, blci, str2, transaction), 134217728);
                            a.mo13627a(true);
                            a.f22273y = jeVar.mo13629b();
                            atbg.m75371a(context, Integer.toString(btrg.f150091a.hashCode()), a);
                            askf2.f89126d.startService(atbe.m75364a(askf2, blci.serializeToBytes(), 5, b));
                            return;
                        }
                        bnsl bnsl3 = (bnsl) f91035a.mo68388c();
                        bnsl3.mo68432a("atwb", "a", 142, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl3.mo68405a("Could not find payment card for transaction, dropping notification");
                        return;
                    }
                    return;
                }
                btqy.f150055a.size();
            } catch (atfh | IOException e3) {
                bnsl bnsl4 = (bnsl) f91035a.mo68388c();
                bnsl4.mo68432a("atwb", "a", 116, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68405a("Error calling LEGACY_GET_TRANSACTIONS_RPC, dropping transaction notification");
            }
        }
    }
}
