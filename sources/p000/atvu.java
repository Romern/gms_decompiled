package p000;

import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.TextView;
import com.android.volley.toolbox.NetworkImageView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.pay.Transaction;
import com.google.android.gms.pay.TransactionDetailIntentArgs;
import com.google.android.gms.tapandpay.transaction.WalletTransactionDetailsChimeraActivity;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: atvu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atvu {

    /* renamed from: a */
    public static final srn f91025a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    public final WalletTransactionDetailsChimeraActivity f91026b;

    /* renamed from: c */
    public atvv f91027c = null;

    /* renamed from: d */
    public boolean f91028d = false;

    public atvu(WalletTransactionDetailsChimeraActivity walletTransactionDetailsChimeraActivity, boolean z) {
        btrg btrg;
        this.f91026b = walletTransactionDetailsChimeraActivity;
        Intent intent = walletTransactionDetailsChimeraActivity.getIntent();
        boolean booleanExtra = intent.getBooleanExtra("extra_legacy_debug_transaction", false);
        if (z && booleanExtra) {
            this.f91028d = intent.getBooleanExtra("extra_force_open_in_gms", false);
            Intent intent2 = new Intent();
            String stringExtra = intent.getStringExtra("account_name");
            intent2.putExtra("account_name", TextUtils.isEmpty(stringExtra) ? "debug_account_name" : stringExtra);
            String stringExtra2 = intent.getStringExtra("account_id");
            intent2.putExtra("account_id", TextUtils.isEmpty(stringExtra2) ? "debug_account_id" : stringExtra2);
            if (intent.getIntExtra("extra_legacy_debug_transaction_num", 0) != 11) {
                bxvd da = btrg.f150089i.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                btrg btrg2 = (btrg) da.f164949b;
                "12".getClass();
                btrg2.f150097g = "12";
                "00001".getClass();
                btrg2.f150091a = "00001";
                bxvd da2 = bxyk.f165095c.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ((bxyk) da2.f164949b).f165097a = 1589651400;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxyk bxyk = (bxyk) da2.mo74062i();
                bxyk.getClass();
                ((btrg) da.f164949b).f150092b = bxyk;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((btrg) da.f164949b).f150094d = 1;
                bxvd da3 = btnd.f149596c.mo74144da();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                btnd btnd = (btnd) da3.f164949b;
                btnd.f149598a = -123000000;
                "USD".getClass();
                btnd.f149599b = "USD";
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                btnd btnd2 = (btnd) da3.mo74062i();
                btnd2.getClass();
                ((btrg) da.f164949b).f150093c = btnd2;
                bxvd da4 = btqt.f150038d.mo74144da();
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                ((btqt) da4.f164949b).f150040a = 2;
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                "1234".getClass();
                ((btqt) da4.f164949b).f150042c = "1234";
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                btqt btqt = (btqt) da4.mo74062i();
                btqt.getClass();
                ((btrg) da.f164949b).f150096f = btqt;
                bxvd da5 = btrb.f150056k.mo74144da();
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                ((btrb) da5.f164949b).f150064g = btra.m117056a(4);
                bxvd da6 = btrd.f150070b.mo74144da();
                if (da6.f164950c) {
                    da6.mo74035c();
                    da6.f164950c = false;
                }
                "Fake Debug Transaction".getClass();
                ((btrd) da6.f164949b).f150072a = "Fake Debug Transaction";
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                btrd btrd = (btrd) da6.mo74062i();
                btrd.getClass();
                ((btrb) da5.f164949b).f150063f = btrd;
                bxvd da7 = btmy.f149577g.mo74144da();
                if (da7.f164950c) {
                    da7.mo74035c();
                    da7.f164950c = false;
                }
                "Debug Transactions are on".getClass();
                ((btmy) da7.f164949b).f149580b = "Debug Transactions are on";
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                btmy btmy = (btmy) da7.mo74062i();
                btmy.getClass();
                ((btrb) da5.f164949b).f150059b = btmy;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                btrb btrb = (btrb) da5.mo74062i();
                btrb.getClass();
                ((btrg) da.f164949b).f150095e = btrb;
                btrg = (btrg) da.mo74062i();
            } else {
                bxvd da8 = btrg.f150089i.mo74144da();
                if (da8.f164950c) {
                    da8.mo74035c();
                    da8.f164950c = false;
                }
                btrg btrg3 = (btrg) da8.f164949b;
                "12".getClass();
                btrg3.f150097g = "12";
                "00004".getClass();
                btrg3.f150091a = "00004";
                bxvd da9 = bxyk.f165095c.mo74144da();
                if (da9.f164950c) {
                    da9.mo74035c();
                    da9.f164950c = false;
                }
                ((bxyk) da9.f164949b).f165097a = 1589650000;
                if (da8.f164950c) {
                    da8.mo74035c();
                    da8.f164950c = false;
                }
                bxyk bxyk2 = (bxyk) da9.mo74062i();
                bxyk2.getClass();
                ((btrg) da8.f164949b).f150092b = bxyk2;
                if (da8.f164950c) {
                    da8.mo74035c();
                    da8.f164950c = false;
                }
                ((btrg) da8.f164949b).f150094d = 1;
                bxvd da10 = btnd.f149596c.mo74144da();
                if (da10.f164950c) {
                    da10.mo74035c();
                    da10.f164950c = false;
                }
                btnd btnd3 = (btnd) da10.f164949b;
                btnd3.f149598a = 123000000;
                "USD".getClass();
                btnd3.f149599b = "USD";
                if (da8.f164950c) {
                    da8.mo74035c();
                    da8.f164950c = false;
                }
                btnd btnd4 = (btnd) da10.mo74062i();
                btnd4.getClass();
                ((btrg) da8.f164949b).f150093c = btnd4;
                bxvd da11 = btqt.f150038d.mo74144da();
                if (da11.f164950c) {
                    da11.mo74035c();
                    da11.f164950c = false;
                }
                ((btqt) da11.f164949b).f150040a = 2;
                if (da11.f164950c) {
                    da11.mo74035c();
                    da11.f164950c = false;
                }
                "1234".getClass();
                ((btqt) da11.f164949b).f150042c = "1234";
                if (da8.f164950c) {
                    da8.mo74035c();
                    da8.f164950c = false;
                }
                btqt btqt2 = (btqt) da11.mo74062i();
                btqt2.getClass();
                ((btrg) da8.f164949b).f150096f = btqt2;
                bxvd da12 = btrb.f150056k.mo74144da();
                if (da12.f164950c) {
                    da12.mo74035c();
                    da12.f164950c = false;
                }
                ((btrb) da12.f164949b).f150064g = btra.m117056a(4);
                bxvd da13 = btrd.f150070b.mo74144da();
                if (da13.f164950c) {
                    da13.mo74035c();
                    da13.f164950c = false;
                }
                "Fake Txn with Geo&Street".getClass();
                ((btrd) da13.f164949b).f150072a = "Fake Txn with Geo&Street";
                if (da12.f164950c) {
                    da12.mo74035c();
                    da12.f164950c = false;
                }
                btrd btrd2 = (btrd) da13.mo74062i();
                btrd2.getClass();
                ((btrb) da12.f164949b).f150063f = btrd2;
                bxvd da14 = btmy.f149577g.mo74144da();
                if (da14.f164950c) {
                    da14.mo74035c();
                    da14.f164950c = false;
                }
                ((btmy) da14.f164949b).f149584f = 1;
                bxvd da15 = btnc.f149591d.mo74144da();
                if (da15.f164950c) {
                    da15.mo74035c();
                    da15.f164950c = false;
                }
                btnc btnc = (btnc) da15.f164949b;
                btnc.f149593a = 51.5025d;
                btnc.f149594b = -0.278126d;
                if (da14.f164950c) {
                    da14.mo74035c();
                    da14.f164950c = false;
                }
                btnc btnc2 = (btnc) da15.mo74062i();
                btnc2.getClass();
                ((btmy) da14.f164949b).f149582d = btnc2;
                if (da14.f164950c) {
                    da14.mo74035c();
                    da14.f164950c = false;
                }
                "Gunnersbury Ln, London W3 8HN, UK".getClass();
                ((btmy) da14.f164949b).f149583e = "Gunnersbury Ln, London W3 8HN, UK";
                if (da12.f164950c) {
                    da12.mo74035c();
                    da12.f164950c = false;
                }
                btmy btmy2 = (btmy) da14.mo74062i();
                btmy2.getClass();
                ((btrb) da12.f164949b).f150059b = btmy2;
                if (da8.f164950c) {
                    da8.mo74035c();
                    da8.f164950c = false;
                }
                btrb btrb2 = (btrb) da12.mo74062i();
                btrb2.getClass();
                ((btrg) da8.f164949b).f150095e = btrb2;
                btrg btrg4 = (btrg) da8.mo74062i();
                bxvd bxvd = (bxvd) btrg4.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) btrg4);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                btrg btrg5 = (btrg) bxvd.f164949b;
                "000101".getClass();
                btrg5.f150091a = "000101";
                btrg5.f150094d = 1;
                bxyk bxyk3 = ((btrg) bxvd.f164949b).f150092b;
                bxyk3 = bxyk3 == null ? bxyk.f165095c : bxyk3;
                bxvd bxvd2 = (bxvd) bxyk3.mo74142c(5);
                bxvd2.mo73625a((GeneratedMessageLite) bxyk3);
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                ((bxyk) bxvd2.f164949b).f165097a = 1589650000;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bxyk bxyk4 = (bxyk) bxvd2.mo74062i();
                bxyk4.getClass();
                ((btrg) bxvd.f164949b).f150092b = bxyk4;
                btrb btrb3 = ((btrg) bxvd.f164949b).f150095e;
                btrb3 = btrb3 == null ? btrb.f150056k : btrb3;
                bxvd bxvd3 = (bxvd) btrb3.mo74142c(5);
                bxvd3.mo73625a((GeneratedMessageLite) btrb3);
                if (bxvd3.f164950c) {
                    bxvd3.mo74035c();
                    bxvd3.f164950c = false;
                }
                ((btrb) bxvd3.f164949b).f150064g = btra.m117056a(4);
                if (bxvd3.f164950c) {
                    bxvd3.mo74035c();
                    bxvd3.f164950c = false;
                }
                btrb btrb4 = (btrb) bxvd3.f164949b;
                "Inferred Store Name".getClass();
                btrb4.f150058a = "Inferred Store Name";
                "https://www.google.com".getClass();
                btrb4.f150061d = "https://www.google.com";
                bxvd da16 = btrd.f150070b.mo74144da();
                if (da16.f164950c) {
                    da16.mo74035c();
                    da16.f164950c = false;
                }
                "Fake Txn; reversible feedback".getClass();
                ((btrd) da16.f164949b).f150072a = "Fake Txn; reversible feedback";
                if (bxvd3.f164950c) {
                    bxvd3.mo74035c();
                    bxvd3.f164950c = false;
                }
                btrd btrd3 = (btrd) da16.mo74062i();
                btrd3.getClass();
                ((btrb) bxvd3.f164949b).f150063f = btrd3;
                if (bxvd3.f164950c) {
                    bxvd3.mo74035c();
                    bxvd3.f164950c = false;
                }
                ((btrb) bxvd3.f164949b).f150067j = btqz.m117054a(5);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                btrb btrb5 = (btrb) bxvd3.mo74062i();
                btrb5.getClass();
                ((btrg) bxvd.f164949b).f150095e = btrb5;
                btrg = (btrg) bxvd.mo74062i();
            }
            intent2.putExtra("transaction", btrg.serializeToBytes());
            asmg asmg = new asmg();
            asmg.f89223a = btrg.f150097g;
            asmg.f89226d = "Visa-101";
            asoc asoc = new asoc();
            asoc.f89286a = "IssuerName";
            asoc.f89287b = "123-456-7890";
            asmg.f89233k = asoc.mo49277a();
            asoz asoz = new asoz();
            asox asox = new asox();
            asox.f89330b = 4;
            asoz.f89331a = asox.mo49311a();
            asmg.f89228f = asoz.mo49314a();
            intent2.putExtra("payment_card", asmg.mo49237a());
            walletTransactionDetailsChimeraActivity.setIntent(intent2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo50240a(View view) {
        bnsl bnsl = (bnsl) f91025a.mo68390d();
        bnsl.mo68432a("atvu", "a", 168, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("User closing WalletTransactionDetailsActivity.");
        this.f91026b.finish();
    }

    /* renamed from: a */
    public final boolean mo50242a() {
        return this.f91027c != null;
    }

    /* renamed from: b */
    public final boolean mo50244b() {
        String stringExtra = this.f91026b.getIntent().getStringExtra("device_transaction_id");
        Transaction transaction = (Transaction) sef.m35067a(this.f91026b.getIntent(), "core_transaction", Transaction.CREATOR);
        if (!cgwn.m147260j()) {
            return false;
        }
        if (TextUtils.isEmpty(stringExtra) && transaction == null) {
            return false;
        }
        WalletTransactionDetailsChimeraActivity walletTransactionDetailsChimeraActivity = this.f91026b;
        bmxv bmxv = walletTransactionDetailsChimeraActivity.f108944h;
        Boolean valueOf = Boolean.valueOf(alfj.m60866b(walletTransactionDetailsChimeraActivity));
        bmxv.mo66812a(valueOf);
        if (!valueOf.booleanValue()) {
            return false;
        }
        alhv alhv = new alhv();
        alhv.mo40353a(new Account(this.f91026b.f108940d, "com.google"));
        TransactionDetailIntentArgs transactionDetailIntentArgs = alhv.f73521a.f73512a;
        transactionDetailIntentArgs.f81617a = stringExtra;
        transactionDetailIntentArgs.f81619c = transaction;
        transactionDetailIntentArgs.f81620d = 1;
        this.f91026b.startActivity(alhv.mo40351a());
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0313  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0363  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x03ae  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x03cd  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x03d9  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x045a  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x046b  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x049d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x04a5  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x04b1  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x04b7  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x050b  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0512  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0518  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0522  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0526 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0586  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0689  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x06d5  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x0721  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x076e  */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x0810  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x08a4  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x08a8  */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x08bb  */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x08d0  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x08d3  */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x08da  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x0956  */
    /* JADX WARNING: Removed duplicated region for block: B:373:0x095b  */
    /* JADX WARNING: Removed duplicated region for block: B:419:0x0ac7  */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x0aca  */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x0ace  */
    /* JADX WARNING: Removed duplicated region for block: B:430:0x0b0b  */
    /* JADX WARNING: Removed duplicated region for block: B:431:0x0b0d  */
    /* JADX WARNING: Removed duplicated region for block: B:434:0x0b35  */
    /* JADX WARNING: Removed duplicated region for block: B:435:0x0b39  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x029d  */
    /* renamed from: c */
    public final void mo50245c() {
        String str;
        boolean z;
        View findViewById;
        String b;
        String b2;
        int j;
        boolean z2;
        atvv atvv;
        String str2;
        atvv atvv2;
        String str3;
        boolean z3;
        String e;
        boolean z4;
        boolean z5;
        int i;
        int i2;
        String b3;
        atvv atvv3;
        String b4;
        String d;
        Uri uri;
        atvv atvv4;
        String str4;
        atvv atvv5;
        String str5;
        atvv atvv6;
        String str6;
        btqt btqt;
        int a;
        ArrayList arrayList;
        int i3;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        Uri uri2;
        btrb btrb;
        String str12;
        btrb btrb2;
        btmy btmy;
        int i4;
        char c;
        String str13;
        Uri uri3;
        int i5;
        int i6;
        int i7;
        String str14;
        btrd btrd;
        this.f91026b.findViewById(C0126R.C0129id.TransactionCard).setVisibility(8);
        atvv atvv7 = this.f91027c;
        WalletTransactionDetailsChimeraActivity walletTransactionDetailsChimeraActivity = this.f91026b;
        btrb btrb3 = ((btrg) atvv7.f91029a.f164949b).f150095e;
        if (btrb3 == null || (btrd = btrb3.f150063f) == null || btrd.f150072a.isEmpty()) {
            str = walletTransactionDetailsChimeraActivity.getString(C0126R.string.tp_default_store_name);
        } else {
            btrb btrb4 = ((btrg) atvv7.f91029a.f164949b).f150095e;
            if (btrb4 == null) {
                btrb4 = btrb.f150056k;
            }
            btrd btrd2 = btrb4.f150063f;
            if (btrd2 == null) {
                btrd2 = btrd.f150070b;
            }
            str = btrd2.f150072a;
        }
        if (TextUtils.isEmpty(str)) {
            atvv atvv8 = this.f91027c;
            WalletTransactionDetailsChimeraActivity walletTransactionDetailsChimeraActivity2 = this.f91026b;
            bxyk bxyk = ((btrg) atvv8.f91029a.f164949b).f150092b;
            if (TextUtils.isEmpty(DateUtils.formatDateTime(walletTransactionDetailsChimeraActivity2, (bxyk != null ? bxyk.f165097a : 0) * 1000, 65553)) && TextUtils.isEmpty(this.f91027c.mo50252c())) {
                z = false;
                findViewById = this.f91026b.findViewById(C0126R.C0129id.AddressLayout);
                TextView textView = (TextView) this.f91026b.findViewById(C0126R.C0129id.Address);
                TextView textView2 = (TextView) this.f91026b.findViewById(C0126R.C0129id.InferredStoreName);
                b = this.f91027c.mo50250b(this.f91026b);
                b2 = this.f91027c.mo50249b();
                j = this.f91027c.mo50259j();
                if (TextUtils.isEmpty(b) || (!TextUtils.isEmpty(b2) && j == 4)) {
                    findViewById.setVisibility(0);
                    if (TextUtils.isEmpty(b2)) {
                        i5 = 0;
                    } else {
                        i5 = 8;
                    }
                    textView2.setVisibility(i5);
                    textView2.setText(b2);
                    textView.setText(b);
                    if (TextUtils.isEmpty(b)) {
                        i6 = 0;
                    } else {
                        i6 = 8;
                    }
                    textView.setVisibility(i6);
                    View findViewById2 = this.f91026b.findViewById(C0126R.C0129id.ReportWrongAddress);
                    if (j == 4) {
                        i7 = 8;
                    } else {
                        i7 = 0;
                    }
                    findViewById2.setVisibility(i7);
                    this.f91026b.findViewById(C0126R.C0129id.ReportWrongAddress).setOnClickListener(new atvp(this));
                    z2 = true;
                } else {
                    findViewById.setVisibility(8);
                    z2 = false;
                }
                boolean z6 = z | z2;
                atvv = this.f91027c;
                if (atvv.mo50258i() == 4) {
                    btrb btrb5 = ((btrg) atvv.f91029a.f164949b).f150095e;
                    if (btrb5 == null) {
                        btrb5 = btrb.f150056k;
                    }
                    if (!btrb5.f150061d.isEmpty()) {
                        btrb btrb6 = ((btrg) atvv.f91029a.f164949b).f150095e;
                        if (btrb6 == null) {
                            btrb6 = btrb.f150056k;
                        }
                        str2 = btrb6.f150061d;
                        atvv2 = this.f91027c;
                        if (atvv2.mo50258i() == 4) {
                            btrb btrb7 = ((btrg) atvv2.f91029a.f164949b).f150095e;
                            if (btrb7 == null) {
                                btrb7 = btrb.f150056k;
                            }
                            if (!btrb7.f150066i.isEmpty()) {
                                btrb btrb8 = ((btrg) atvv2.f91029a.f164949b).f150095e;
                                if (btrb8 == null) {
                                    btrb8 = btrb.f150056k;
                                }
                                str3 = btrb8.f150066i;
                            } else {
                                str3 = null;
                            }
                        } else {
                            str3 = null;
                        }
                        if (str2 != null) {
                            this.f91026b.findViewById(C0126R.C0129id.UrlLayout).setVisibility(0);
                            TextView textView3 = (TextView) this.f91026b.findViewById(C0126R.C0129id.Url);
                            if (str3 == null) {
                                str3 = str2;
                            }
                            textView3.setText(str3);
                            this.f91026b.findViewById(C0126R.C0129id.UrlLayout).setOnClickListener(new atvq(this, str2));
                            z3 = true;
                        } else {
                            this.f91026b.findViewById(C0126R.C0129id.UrlLayout).setVisibility(8);
                            z3 = false;
                        }
                        boolean z7 = z6 | z3;
                        e = this.f91027c.mo50254e();
                        if (TextUtils.isEmpty(e)) {
                            this.f91026b.findViewById(C0126R.C0129id.PhoneNumberLayout).setVisibility(8);
                            z4 = false;
                        } else {
                            this.f91026b.findViewById(C0126R.C0129id.PhoneNumberLayout).setVisibility(0);
                            ((TextView) this.f91026b.findViewById(C0126R.C0129id.PhoneNumber)).setText(e);
                            String e2 = this.f91027c.mo50254e();
                            if (e2 != null) {
                                uri3 = Uri.parse(String.format("tel:%s", e2));
                            } else {
                                uri3 = null;
                            }
                            if (uri3 != null) {
                                this.f91026b.findViewById(C0126R.C0129id.PhoneNumberLayout).setOnClickListener(new atvr(this, uri3, e));
                            }
                            z4 = true;
                        }
                        z5 = z4 | z7;
                        View findViewById3 = this.f91026b.findViewById(C0126R.C0129id.TransactionCard);
                        if (!z5) {
                            i = 8;
                        } else {
                            i = 0;
                        }
                        findViewById3.setVisibility(i);
                        View findViewById4 = this.f91026b.findViewById(C0126R.C0129id.AdditionalDetailsLayout);
                        if (TextUtils.isEmpty(this.f91026b.f108941e.f108343d)) {
                            this.f91026b.findViewById(C0126R.C0129id.PaymentCardInfo).setVisibility(8);
                            i2 = 8;
                        } else {
                            String string = this.f91026b.getString(C0126R.string.tp_paid_with_title);
                            if (this.f91027c.mo50255f()) {
                                string = this.f91026b.getString(C0126R.string.tp_refunded_with_title);
                            } else if (this.f91027c.mo50256g()) {
                                string = this.f91026b.getString(C0126R.string.tp_attempted_with_title);
                            } else if (this.f91027c.mo50257h()) {
                                string = this.f91026b.getString(C0126R.string.tp_credited_to_title);
                            }
                            String charSequence = this.f91026b.f108941e.f108343d.toString();
                            View findViewById5 = this.f91026b.findViewById(C0126R.C0129id.PaymentCardInfo);
                            ((TextView) findViewById5.findViewById(C0126R.C0129id.Label)).setText(string);
                            ((TextView) findViewById5.findViewById(C0126R.C0129id.Value)).setText(charSequence);
                            findViewById5.setOnClickListener(null);
                            i2 = 0;
                        }
                        findViewById4.setVisibility(i2);
                        NetworkImageView networkImageView = (NetworkImageView) this.f91026b.findViewById(C0126R.C0129id.MapImage);
                        b3 = this.f91027c.mo50249b();
                        if (b3 == null) {
                            networkImageView.setContentDescription(this.f91026b.getResources().getString(C0126R.string.tp_map_button_name_no_merchant));
                        } else {
                            networkImageView.setContentDescription(String.format(this.f91026b.getResources().getString(C0126R.string.tp_map_button_name), b3));
                        }
                        networkImageView.setImageUrl(null, atyg.m76548a());
                        networkImageView.setImageDrawable(null);
                        atvv3 = this.f91027c;
                        b4 = atvv3.mo50250b(this.f91026b);
                        d = atvv3.mo50253d();
                        if (b4 == null || d != null) {
                            if (d != null) {
                                b4 = d;
                            }
                            btrb = ((btrg) atvv3.f91029a.f164949b).f150095e;
                            if (btrb == null) {
                                btrb = btrb.f150056k;
                            }
                            if (btrb.f150065h != null) {
                                btrb btrb9 = ((btrg) atvv3.f91029a.f164949b).f150095e;
                                if (btrb9 == null) {
                                    btrb9 = btrb.f150056k;
                                }
                                btqk btqk = btrb9.f150065h;
                                if (btqk == null) {
                                    btqk = btqk.f149964e;
                                }
                                if (!btqk.f149968c.isEmpty()) {
                                    btrb btrb10 = ((btrg) atvv3.f91029a.f164949b).f150095e;
                                    if (btrb10 == null) {
                                        btrb10 = btrb.f150056k;
                                    }
                                    btqk btqk2 = btrb10.f150065h;
                                    if (btqk2 == null) {
                                        btqk2 = btqk.f149964e;
                                    }
                                    str12 = String.format("scale:2|icon:%s|%s", String.valueOf(btqk2.f149968c).concat("=n-w64-h64"), b4);
                                    uri = new Uri.Builder().scheme("https").authority("maps.googleapis.com").path("/maps/api/staticmap").appendQueryParameter("center", b4).appendQueryParameter("zoom", "16").appendQueryParameter("markers", str12).appendQueryParameter("language", Locale.getDefault().getLanguage()).appendQueryParameter("region", Locale.getDefault().getCountry()).build();
                                }
                            }
                            btrb2 = ((btrg) atvv3.f91029a.f164949b).f150095e;
                            if (btrb2 == null) {
                                btrb2 = btrb.f150056k;
                            }
                            btmy = btrb2.f150059b;
                            if (btmy == null) {
                                btmy = btmy.f149577g;
                            }
                            i4 = btmy.f149584f;
                            if (i4 != 0) {
                                c = i4 != 1 ? i4 != 2 ? (char) 0 : 4 : 3;
                            } else {
                                c = 2;
                            }
                            if (c != 0 && c == 4) {
                                str13 = "blue";
                            } else {
                                str13 = "red";
                            }
                            str12 = String.format("color:%s|%s", str13, b4);
                            uri = new Uri.Builder().scheme("https").authority("maps.googleapis.com").path("/maps/api/staticmap").appendQueryParameter("center", b4).appendQueryParameter("zoom", "16").appendQueryParameter("markers", str12).appendQueryParameter("language", Locale.getDefault().getLanguage()).appendQueryParameter("region", Locale.getDefault().getCountry()).build();
                        } else {
                            uri = null;
                        }
                        if (uri != null) {
                            int i8 = this.f91026b.getResources().getDisplayMetrics().widthPixels;
                            int dimensionPixelSize = this.f91026b.getResources().getDimensionPixelSize(C0126R.dimen.tp_narrow_spacing);
                            int min = Math.min(i8 - (dimensionPixelSize + dimensionPixelSize), 1280);
                            int i9 = (int) (((float) min) * (this.f91026b.getResources().getConfiguration().orientation == 2 ? 0.25f : 0.33f));
                            if (this.f91026b.getResources().getDisplayMetrics().density >= 2.0f) {
                                uri = uri.buildUpon().appendQueryParameter("scale", "2").build();
                                min /= 2;
                                i9 /= 2;
                            }
                            Uri.Builder buildUpon = uri.buildUpon();
                            StringBuilder sb = new StringBuilder(23);
                            sb.append(min);
                            sb.append("x");
                            sb.append(i9);
                            networkImageView.setImageUrl(buildUpon.appendQueryParameter("size", sb.toString()).build().toString(), atyg.m76548a());
                            this.f91026b.findViewById(C0126R.C0129id.TransactionCard).setVisibility(0);
                            atvv atvv9 = this.f91027c;
                            WalletTransactionDetailsChimeraActivity walletTransactionDetailsChimeraActivity3 = this.f91026b;
                            String b5 = atvv9.mo50250b(walletTransactionDetailsChimeraActivity3);
                            String d2 = atvv9.mo50253d();
                            if (b5 == null && d2 == null) {
                                uri2 = null;
                            } else if (b5 == null) {
                                try {
                                    uri2 = Uri.parse(String.format("geo:0,0?q=%s()", URLEncoder.encode(d2, "utf-8")));
                                } catch (UnsupportedEncodingException e3) {
                                    uri2 = null;
                                }
                            } else {
                                String b6 = atvv9.mo50249b();
                                if (b6 != null) {
                                    b5 = String.format(walletTransactionDetailsChimeraActivity3.getString(C0126R.string.tp_store_address), b6, b5);
                                }
                                uri2 = Uri.parse(String.format("geo:0,0?q=%s", URLEncoder.encode(b5, "utf-8")));
                            }
                            if (uri2 != null) {
                                networkImageView.setOnClickListener(new atvs(this, uri2));
                            }
                        }
                        atvv4 = this.f91027c;
                        if (atvv4.mo50258i() == 4) {
                            btrb btrb11 = ((btrg) atvv4.f91029a.f164949b).f150095e;
                            if (btrb11 == null) {
                                btrb11 = btrb.f150056k;
                            }
                            if (btrb11.f150065h != null) {
                                btrb btrb12 = ((btrg) atvv4.f91029a.f164949b).f150095e;
                                if (btrb12 == null) {
                                    btrb12 = btrb.f150056k;
                                }
                                btqk btqk3 = btrb12.f150065h;
                                if (btqk3 == null) {
                                    btqk3 = btqk.f149964e;
                                }
                                if (!btqk3.f149966a.isEmpty()) {
                                    btrb btrb13 = ((btrg) atvv4.f91029a.f164949b).f150095e;
                                    if (btrb13 == null) {
                                        btrb13 = btrb.f150056k;
                                    }
                                    btqk btqk4 = btrb13.f150065h;
                                    if (btqk4 == null) {
                                        btqk4 = btqk.f149964e;
                                    }
                                    str4 = btqk4.f149966a;
                                    atvv5 = this.f91027c;
                                    if (atvv5.mo50258i() == 4) {
                                        btrb btrb14 = ((btrg) atvv5.f91029a.f164949b).f150095e;
                                        if (btrb14 == null) {
                                            btrb14 = btrb.f150056k;
                                        }
                                        if (btrb14.f150065h != null) {
                                            btrb btrb15 = ((btrg) atvv5.f91029a.f164949b).f150095e;
                                            if (btrb15 == null) {
                                                btrb15 = btrb.f150056k;
                                            }
                                            btqk btqk5 = btrb15.f150065h;
                                            if (btqk5 == null) {
                                                btqk5 = btqk.f149964e;
                                            }
                                            if (!btqk5.f149967b.isEmpty()) {
                                                btrb btrb16 = ((btrg) atvv5.f91029a.f164949b).f150095e;
                                                if (btrb16 == null) {
                                                    btrb16 = btrb.f150056k;
                                                }
                                                btqk btqk6 = btrb16.f150065h;
                                                if (btqk6 == null) {
                                                    btqk6 = btqk.f149964e;
                                                }
                                                str5 = btqk6.f149967b;
                                                atvv6 = this.f91027c;
                                                if (atvv6.mo50258i() == 4) {
                                                    btrb btrb17 = ((btrg) atvv6.f91029a.f164949b).f150095e;
                                                    if (btrb17 == null) {
                                                        btrb17 = btrb.f150056k;
                                                    }
                                                    if (btrb17.f150065h != null) {
                                                        btrb btrb18 = ((btrg) atvv6.f91029a.f164949b).f150095e;
                                                        if (btrb18 == null) {
                                                            btrb18 = btrb.f150056k;
                                                        }
                                                        btqk btqk7 = btrb18.f150065h;
                                                        if (btqk7 == null) {
                                                            btqk7 = btqk.f149964e;
                                                        }
                                                        if (!btqk7.f149969d.isEmpty()) {
                                                            btrb btrb19 = ((btrg) atvv6.f91029a.f164949b).f150095e;
                                                            if (btrb19 == null) {
                                                                btrb19 = btrb.f150056k;
                                                            }
                                                            btqk btqk8 = btrb19.f150065h;
                                                            if (btqk8 == null) {
                                                                btqk8 = btqk.f149964e;
                                                            }
                                                            str6 = btqk8.f149969d;
                                                            if (!TextUtils.isEmpty(str4) || TextUtils.isEmpty(str5) || TextUtils.isEmpty(str6)) {
                                                                this.f91026b.findViewById(C0126R.C0129id.MerchantApp).setVisibility(8);
                                                            } else {
                                                                this.f91026b.findViewById(C0126R.C0129id.MerchantApp).setVisibility(0);
                                                                ((TextView) this.f91026b.findViewById(C0126R.C0129id.AppName)).setText(str4);
                                                                ((TextView) this.f91026b.findViewById(C0126R.C0129id.AppDeveloperName)).setText(str5);
                                                                atvv atvv10 = this.f91027c;
                                                                if (atvv10.mo50258i() == 4) {
                                                                    btrb btrb20 = ((btrg) atvv10.f91029a.f164949b).f150095e;
                                                                    if (btrb20 == null) {
                                                                        btrb20 = btrb.f150056k;
                                                                    }
                                                                    if (btrb20.f150065h != null) {
                                                                        btrb btrb21 = ((btrg) atvv10.f91029a.f164949b).f150095e;
                                                                        if (btrb21 == null) {
                                                                            btrb21 = btrb.f150056k;
                                                                        }
                                                                        btqk btqk9 = btrb21.f150065h;
                                                                        if (btqk9 == null) {
                                                                            btqk9 = btqk.f149964e;
                                                                        }
                                                                        if (!btqk9.f149968c.isEmpty()) {
                                                                            btrb btrb22 = ((btrg) atvv10.f91029a.f164949b).f150095e;
                                                                            if (btrb22 == null) {
                                                                                btrb22 = btrb.f150056k;
                                                                            }
                                                                            btqk btqk10 = btrb22.f150065h;
                                                                            if (btqk10 == null) {
                                                                                btqk10 = btqk.f149964e;
                                                                            }
                                                                            str10 = btqk10.f149968c;
                                                                        } else {
                                                                            str10 = null;
                                                                        }
                                                                        NetworkImageView networkImageView2 = (NetworkImageView) this.f91026b.findViewById(C0126R.C0129id.AppIcon);
                                                                        networkImageView2.setImageUrl(null, atyg.m76548a());
                                                                        networkImageView2.setImageDrawable(null);
                                                                        networkImageView2.setDefaultImageResId(C0126R.C0127drawable.quantum_ic_add_grey600_24);
                                                                        if (!TextUtils.isEmpty(str10)) {
                                                                            int dimension = (int) this.f91026b.getResources().getDimension(C0126R.dimen.tp_app_icon_size);
                                                                            int dimension2 = (int) this.f91026b.getResources().getDimension(C0126R.dimen.tp_app_icon_size);
                                                                            if (bmyx.m108640a('=').mo66925c((CharSequence) str10).size() == 1) {
                                                                                StringBuilder sb2 = new StringBuilder(String.valueOf(str10).length() + 26);
                                                                                sb2.append(str10);
                                                                                sb2.append("=w");
                                                                                sb2.append(dimension);
                                                                                sb2.append("-h");
                                                                                sb2.append(dimension2);
                                                                                str11 = sb2.toString();
                                                                            } else {
                                                                                StringBuilder sb3 = new StringBuilder(String.valueOf(str10).length() + 26);
                                                                                sb3.append(str10);
                                                                                sb3.append("-w");
                                                                                sb3.append(dimension);
                                                                                sb3.append("-h");
                                                                                sb3.append(dimension2);
                                                                                str11 = sb3.toString();
                                                                            }
                                                                            networkImageView2.setImageUrl(str11, atyg.m76548a());
                                                                        }
                                                                        ((TextView) this.f91026b.findViewById(C0126R.C0129id.IsAppInstalled)).setText(atxl.m76501a(this.f91026b.findViewById(C0126R.C0129id.MerchantApp), str6) ? C0126R.string.common_install : C0126R.string.common_open);
                                                                    }
                                                                }
                                                                str10 = null;
                                                                NetworkImageView networkImageView22 = (NetworkImageView) this.f91026b.findViewById(C0126R.C0129id.AppIcon);
                                                                networkImageView22.setImageUrl(null, atyg.m76548a());
                                                                networkImageView22.setImageDrawable(null);
                                                                networkImageView22.setDefaultImageResId(C0126R.C0127drawable.quantum_ic_add_grey600_24);
                                                                if (!TextUtils.isEmpty(str10)) {
                                                                }
                                                                ((TextView) this.f91026b.findViewById(C0126R.C0129id.IsAppInstalled)).setText(atxl.m76501a(this.f91026b.findViewById(C0126R.C0129id.MerchantApp), str6) ? C0126R.string.common_install : C0126R.string.common_open);
                                                            }
                                                            if (z5) {
                                                                this.f91026b.findViewById(C0126R.C0129id.TransactionCard).setVisibility(0);
                                                            }
                                                            btqt = ((btrg) this.f91027c.f91029a.f164949b).f150096f;
                                                            String str15 = btqt != null ? btqt.f150042c : null;
                                                            WalletTransactionDetailsChimeraActivity walletTransactionDetailsChimeraActivity4 = this.f91026b;
                                                            String str16 = "";
                                                            if (btqt != null) {
                                                                int a2 = btjl.m116841a(btqt.f150041b);
                                                                if (a2 == 0) {
                                                                    a2 = 1;
                                                                }
                                                                switch (a2 - 2) {
                                                                    case 1:
                                                                        str16 = walletTransactionDetailsChimeraActivity4.getString(C0126R.string.tp_transaction_visa);
                                                                        break;
                                                                    case 2:
                                                                        str16 = walletTransactionDetailsChimeraActivity4.getString(C0126R.string.tp_transaction_mastercard);
                                                                        break;
                                                                    case 3:
                                                                        str16 = walletTransactionDetailsChimeraActivity4.getString(C0126R.string.tp_transaction_amex);
                                                                        break;
                                                                    case 4:
                                                                        str16 = walletTransactionDetailsChimeraActivity4.getString(C0126R.string.tp_transaction_discover);
                                                                        break;
                                                                    case 5:
                                                                        str16 = walletTransactionDetailsChimeraActivity4.getString(C0126R.string.tp_transaction_interac);
                                                                        break;
                                                                    case 7:
                                                                        str16 = walletTransactionDetailsChimeraActivity4.getString(C0126R.string.tp_transaction_eftpos);
                                                                        break;
                                                                    case 8:
                                                                        str16 = walletTransactionDetailsChimeraActivity4.getString(C0126R.string.tp_transaction_maestro);
                                                                        break;
                                                                    case 9:
                                                                        str16 = walletTransactionDetailsChimeraActivity4.getString(C0126R.string.tp_transaction_elo);
                                                                        break;
                                                                    case 10:
                                                                        str16 = walletTransactionDetailsChimeraActivity4.getString(C0126R.string.tp_transaction_id);
                                                                        break;
                                                                    case 11:
                                                                        str16 = walletTransactionDetailsChimeraActivity4.getString(C0126R.string.tp_transaction_quicpay);
                                                                        break;
                                                                    case 12:
                                                                        str16 = walletTransactionDetailsChimeraActivity4.getString(C0126R.string.tp_transaction_jcb);
                                                                        break;
                                                                }
                                                            }
                                                            TextView textView4 = (TextView) this.f91026b.findViewById(C0126R.C0129id.PaidWithExplanation);
                                                            if (this.f91027c.mo50256g()) {
                                                                textView4.setVisibility(8);
                                                            } else if (!this.f91027c.mo50257h()) {
                                                                int a3 = btrf.m117063a(((btrg) this.f91027c.f91029a.f164949b).f150098h);
                                                                if (a3 != 0 && a3 == 8) {
                                                                    if (this.f91027c.mo50255f()) {
                                                                        str9 = atyj.m76564a(this.f91026b.f108941e) ? this.f91026b.getString(C0126R.string.tp_account_number_refund_explanation_non_android_pay_paypal) : this.f91026b.getString(C0126R.string.tp_account_number_refund_explanation_non_android_pay);
                                                                    } else {
                                                                        str9 = atyj.m76564a(this.f91026b.f108941e) ? this.f91026b.getString(C0126R.string.tp_account_number_explanation_non_android_pay_paypal) : this.f91026b.getString(C0126R.string.tp_account_number_explanation_non_android_pay);
                                                                    }
                                                                    textView4.setText(str9);
                                                                    textView4.setContentDescription(str9);
                                                                } else if (TextUtils.isEmpty(str15)) {
                                                                    textView4.setVisibility(0);
                                                                    if (this.f91027c.mo50255f()) {
                                                                        str8 = atyj.m76564a(this.f91026b.f108941e) ? this.f91026b.getString(C0126R.string.tp_account_number_refund_explanation_no_last_digits_paypal) : this.f91026b.getString(C0126R.string.tp_account_number_refund_explanation_no_last_digits);
                                                                    } else {
                                                                        str8 = atyj.m76564a(this.f91026b.f108941e) ? this.f91026b.getString(C0126R.string.tp_account_number_explanation_no_last_digits_paypal) : this.f91026b.getString(C0126R.string.tp_account_number_explanation_no_last_digits);
                                                                    }
                                                                    textView4.setText(String.format(str8, str16));
                                                                } else {
                                                                    textView4.setVisibility(0);
                                                                    String join = TextUtils.join(" ", bqcg.m112564a(str15.toCharArray()));
                                                                    if (this.f91027c.mo50255f()) {
                                                                        str7 = atyj.m76564a(this.f91026b.f108941e) ? this.f91026b.getString(C0126R.string.tp_account_number_refund_explanation_paypal) : this.f91026b.getString(C0126R.string.tp_account_number_refund_explanation);
                                                                    } else {
                                                                        str7 = atyj.m76564a(this.f91026b.f108941e) ? this.f91026b.getString(C0126R.string.tp_account_number_explanation_paypal) : this.f91026b.getString(C0126R.string.tp_account_number_explanation);
                                                                    }
                                                                    textView4.setText(String.format(str7, str16, str15));
                                                                    textView4.setContentDescription(String.format(str7, str16, join));
                                                                }
                                                            } else if (TextUtils.isEmpty(this.f91026b.f108942f)) {
                                                                textView4.setVisibility(8);
                                                            } else {
                                                                WalletTransactionDetailsChimeraActivity walletTransactionDetailsChimeraActivity5 = this.f91026b;
                                                                textView4.setText(walletTransactionDetailsChimeraActivity5.getString(C0126R.string.tp_account_number_credit_explanation, new Object[]{walletTransactionDetailsChimeraActivity5.f108942f}));
                                                            }
                                                            TextView textView5 = (TextView) this.f91026b.findViewById(C0126R.C0129id.Disclaimer);
                                                            a = btrf.m117063a(((btrg) this.f91027c.f91029a.f164949b).f150098h);
                                                            if (a == 0) {
                                                                a = 1;
                                                            }
                                                            textView5.setText(a == 5 ? C0126R.string.tp_transaction_legal_disclaimer_in_app : C0126R.string.tp_transaction_legal_disclaimer_nfc);
                                                            View findViewById6 = this.f91026b.findViewById(C0126R.C0129id.TransactionQuestionsButton);
                                                            findViewById6.setOnClickListener(new atvt(this));
                                                            arrayList = new ArrayList();
                                                            if (!TextUtils.isEmpty(this.f91026b.f108942f) && !TextUtils.isEmpty(this.f91026b.f108943g)) {
                                                                arrayList.add(0);
                                                            }
                                                            if (!arrayList.isEmpty()) {
                                                                i3 = 0;
                                                            } else {
                                                                i3 = 8;
                                                            }
                                                            findViewById6.setVisibility(i3);
                                                            Intent intent = new Intent("android.intent.action.VIEW");
                                                            intent.setData(Uri.parse("https://support.google.com/androidpay/?p=transaction_details"));
                                                            TextView textView6 = (TextView) this.f91026b.findViewById(C0126R.C0129id.PendingTransactionsDisclaimer);
                                                            if (this.f91027c.mo50256g()) {
                                                                textView6.setVisibility(8);
                                                            } else {
                                                                textView6.setVisibility(0);
                                                                atyg.m76550a(this.f91026b, textView6, atyj.m76564a(this.f91026b.f108941e) ? this.f91026b.getString(C0126R.string.tp_pending_transactions_paypal_disclaimer) : this.f91026b.getString(C0126R.string.tp_pending_transactions_disclaimer), intent);
                                                                textView6.setLinkTextColor(C1133kh.m17843b(this.f91026b, C0126R.color.tp_action_color));
                                                            }
                                                            TextView textView7 = (TextView) this.f91026b.findViewById(C0126R.C0129id.GetTheApp);
                                                            Intent a4 = new atxm().mo50304a();
                                                            WalletTransactionDetailsChimeraActivity walletTransactionDetailsChimeraActivity6 = this.f91026b;
                                                            atyg.m76550a(walletTransactionDetailsChimeraActivity6, textView7, walletTransactionDetailsChimeraActivity6.getString(C0126R.string.tp_transaction_get_app_to_see_purchase_history), a4);
                                                            textView7.setLinkTextColor(C1133kh.m17843b(this.f91026b, C0126R.color.tp_action_color));
                                                        }
                                                    }
                                                }
                                                str6 = null;
                                                if (!TextUtils.isEmpty(str4)) {
                                                }
                                                this.f91026b.findViewById(C0126R.C0129id.MerchantApp).setVisibility(8);
                                                if (z5) {
                                                }
                                                btqt = ((btrg) this.f91027c.f91029a.f164949b).f150096f;
                                                if (btqt != null) {
                                                }
                                                WalletTransactionDetailsChimeraActivity walletTransactionDetailsChimeraActivity42 = this.f91026b;
                                                String str162 = "";
                                                if (btqt != null) {
                                                }
                                                TextView textView42 = (TextView) this.f91026b.findViewById(C0126R.C0129id.PaidWithExplanation);
                                                if (this.f91027c.mo50256g()) {
                                                }
                                                TextView textView52 = (TextView) this.f91026b.findViewById(C0126R.C0129id.Disclaimer);
                                                a = btrf.m117063a(((btrg) this.f91027c.f91029a.f164949b).f150098h);
                                                if (a == 0) {
                                                }
                                                textView52.setText(a == 5 ? C0126R.string.tp_transaction_legal_disclaimer_in_app : C0126R.string.tp_transaction_legal_disclaimer_nfc);
                                                View findViewById62 = this.f91026b.findViewById(C0126R.C0129id.TransactionQuestionsButton);
                                                findViewById62.setOnClickListener(new atvt(this));
                                                arrayList = new ArrayList();
                                                arrayList.add(0);
                                                if (!arrayList.isEmpty()) {
                                                }
                                                findViewById62.setVisibility(i3);
                                                Intent intent2 = new Intent("android.intent.action.VIEW");
                                                intent2.setData(Uri.parse("https://support.google.com/androidpay/?p=transaction_details"));
                                                TextView textView62 = (TextView) this.f91026b.findViewById(C0126R.C0129id.PendingTransactionsDisclaimer);
                                                if (this.f91027c.mo50256g()) {
                                                }
                                                TextView textView72 = (TextView) this.f91026b.findViewById(C0126R.C0129id.GetTheApp);
                                                Intent a42 = new atxm().mo50304a();
                                                WalletTransactionDetailsChimeraActivity walletTransactionDetailsChimeraActivity62 = this.f91026b;
                                                atyg.m76550a(walletTransactionDetailsChimeraActivity62, textView72, walletTransactionDetailsChimeraActivity62.getString(C0126R.string.tp_transaction_get_app_to_see_purchase_history), a42);
                                                textView72.setLinkTextColor(C1133kh.m17843b(this.f91026b, C0126R.color.tp_action_color));
                                            }
                                        }
                                    }
                                    str5 = null;
                                    atvv6 = this.f91027c;
                                    if (atvv6.mo50258i() == 4) {
                                    }
                                    str6 = null;
                                    if (!TextUtils.isEmpty(str4)) {
                                    }
                                    this.f91026b.findViewById(C0126R.C0129id.MerchantApp).setVisibility(8);
                                    if (z5) {
                                    }
                                    btqt = ((btrg) this.f91027c.f91029a.f164949b).f150096f;
                                    if (btqt != null) {
                                    }
                                    WalletTransactionDetailsChimeraActivity walletTransactionDetailsChimeraActivity422 = this.f91026b;
                                    String str1622 = "";
                                    if (btqt != null) {
                                    }
                                    TextView textView422 = (TextView) this.f91026b.findViewById(C0126R.C0129id.PaidWithExplanation);
                                    if (this.f91027c.mo50256g()) {
                                    }
                                    TextView textView522 = (TextView) this.f91026b.findViewById(C0126R.C0129id.Disclaimer);
                                    a = btrf.m117063a(((btrg) this.f91027c.f91029a.f164949b).f150098h);
                                    if (a == 0) {
                                    }
                                    textView522.setText(a == 5 ? C0126R.string.tp_transaction_legal_disclaimer_in_app : C0126R.string.tp_transaction_legal_disclaimer_nfc);
                                    View findViewById622 = this.f91026b.findViewById(C0126R.C0129id.TransactionQuestionsButton);
                                    findViewById622.setOnClickListener(new atvt(this));
                                    arrayList = new ArrayList();
                                    arrayList.add(0);
                                    if (!arrayList.isEmpty()) {
                                    }
                                    findViewById622.setVisibility(i3);
                                    Intent intent22 = new Intent("android.intent.action.VIEW");
                                    intent22.setData(Uri.parse("https://support.google.com/androidpay/?p=transaction_details"));
                                    TextView textView622 = (TextView) this.f91026b.findViewById(C0126R.C0129id.PendingTransactionsDisclaimer);
                                    if (this.f91027c.mo50256g()) {
                                    }
                                    TextView textView722 = (TextView) this.f91026b.findViewById(C0126R.C0129id.GetTheApp);
                                    Intent a422 = new atxm().mo50304a();
                                    WalletTransactionDetailsChimeraActivity walletTransactionDetailsChimeraActivity622 = this.f91026b;
                                    atyg.m76550a(walletTransactionDetailsChimeraActivity622, textView722, walletTransactionDetailsChimeraActivity622.getString(C0126R.string.tp_transaction_get_app_to_see_purchase_history), a422);
                                    textView722.setLinkTextColor(C1133kh.m17843b(this.f91026b, C0126R.color.tp_action_color));
                                }
                            }
                        }
                        str4 = null;
                        atvv5 = this.f91027c;
                        if (atvv5.mo50258i() == 4) {
                        }
                        str5 = null;
                        atvv6 = this.f91027c;
                        if (atvv6.mo50258i() == 4) {
                        }
                        str6 = null;
                        if (!TextUtils.isEmpty(str4)) {
                        }
                        this.f91026b.findViewById(C0126R.C0129id.MerchantApp).setVisibility(8);
                        if (z5) {
                        }
                        btqt = ((btrg) this.f91027c.f91029a.f164949b).f150096f;
                        if (btqt != null) {
                        }
                        WalletTransactionDetailsChimeraActivity walletTransactionDetailsChimeraActivity4222 = this.f91026b;
                        String str16222 = "";
                        if (btqt != null) {
                        }
                        TextView textView4222 = (TextView) this.f91026b.findViewById(C0126R.C0129id.PaidWithExplanation);
                        if (this.f91027c.mo50256g()) {
                        }
                        TextView textView5222 = (TextView) this.f91026b.findViewById(C0126R.C0129id.Disclaimer);
                        a = btrf.m117063a(((btrg) this.f91027c.f91029a.f164949b).f150098h);
                        if (a == 0) {
                        }
                        textView5222.setText(a == 5 ? C0126R.string.tp_transaction_legal_disclaimer_in_app : C0126R.string.tp_transaction_legal_disclaimer_nfc);
                        View findViewById6222 = this.f91026b.findViewById(C0126R.C0129id.TransactionQuestionsButton);
                        findViewById6222.setOnClickListener(new atvt(this));
                        arrayList = new ArrayList();
                        arrayList.add(0);
                        if (!arrayList.isEmpty()) {
                        }
                        findViewById6222.setVisibility(i3);
                        Intent intent222 = new Intent("android.intent.action.VIEW");
                        intent222.setData(Uri.parse("https://support.google.com/androidpay/?p=transaction_details"));
                        TextView textView6222 = (TextView) this.f91026b.findViewById(C0126R.C0129id.PendingTransactionsDisclaimer);
                        if (this.f91027c.mo50256g()) {
                        }
                        TextView textView7222 = (TextView) this.f91026b.findViewById(C0126R.C0129id.GetTheApp);
                        Intent a4222 = new atxm().mo50304a();
                        WalletTransactionDetailsChimeraActivity walletTransactionDetailsChimeraActivity6222 = this.f91026b;
                        atyg.m76550a(walletTransactionDetailsChimeraActivity6222, textView7222, walletTransactionDetailsChimeraActivity6222.getString(C0126R.string.tp_transaction_get_app_to_see_purchase_history), a4222);
                        textView7222.setLinkTextColor(C1133kh.m17843b(this.f91026b, C0126R.color.tp_action_color));
                    }
                }
                str2 = null;
                atvv2 = this.f91027c;
                if (atvv2.mo50258i() == 4) {
                }
                if (str2 != null) {
                }
                boolean z72 = z6 | z3;
                e = this.f91027c.mo50254e();
                if (TextUtils.isEmpty(e)) {
                }
                z5 = z4 | z72;
                View findViewById32 = this.f91026b.findViewById(C0126R.C0129id.TransactionCard);
                if (!z5) {
                }
                findViewById32.setVisibility(i);
                View findViewById42 = this.f91026b.findViewById(C0126R.C0129id.AdditionalDetailsLayout);
                if (TextUtils.isEmpty(this.f91026b.f108941e.f108343d)) {
                }
                findViewById42.setVisibility(i2);
                NetworkImageView networkImageView3 = (NetworkImageView) this.f91026b.findViewById(C0126R.C0129id.MapImage);
                b3 = this.f91027c.mo50249b();
                if (b3 == null) {
                }
                networkImageView3.setImageUrl(null, atyg.m76548a());
                networkImageView3.setImageDrawable(null);
                atvv3 = this.f91027c;
                b4 = atvv3.mo50250b(this.f91026b);
                d = atvv3.mo50253d();
                if (b4 == null) {
                }
                if (d != null) {
                }
                btrb = ((btrg) atvv3.f91029a.f164949b).f150095e;
                if (btrb == null) {
                }
                if (btrb.f150065h != null) {
                }
                btrb2 = ((btrg) atvv3.f91029a.f164949b).f150095e;
                if (btrb2 == null) {
                }
                btmy = btrb2.f150059b;
                if (btmy == null) {
                }
                i4 = btmy.f149584f;
                if (i4 != 0) {
                }
                if (c != 0) {
                    str13 = "blue";
                    str12 = String.format("color:%s|%s", str13, b4);
                    uri = new Uri.Builder().scheme("https").authority("maps.googleapis.com").path("/maps/api/staticmap").appendQueryParameter("center", b4).appendQueryParameter("zoom", "16").appendQueryParameter("markers", str12).appendQueryParameter("language", Locale.getDefault().getLanguage()).appendQueryParameter("region", Locale.getDefault().getCountry()).build();
                    if (uri != null) {
                    }
                    atvv4 = this.f91027c;
                    if (atvv4.mo50258i() == 4) {
                    }
                    str4 = null;
                    atvv5 = this.f91027c;
                    if (atvv5.mo50258i() == 4) {
                    }
                    str5 = null;
                    atvv6 = this.f91027c;
                    if (atvv6.mo50258i() == 4) {
                    }
                    str6 = null;
                    if (!TextUtils.isEmpty(str4)) {
                    }
                    this.f91026b.findViewById(C0126R.C0129id.MerchantApp).setVisibility(8);
                    if (z5) {
                    }
                    btqt = ((btrg) this.f91027c.f91029a.f164949b).f150096f;
                    if (btqt != null) {
                    }
                    WalletTransactionDetailsChimeraActivity walletTransactionDetailsChimeraActivity42222 = this.f91026b;
                    String str162222 = "";
                    if (btqt != null) {
                    }
                    TextView textView42222 = (TextView) this.f91026b.findViewById(C0126R.C0129id.PaidWithExplanation);
                    if (this.f91027c.mo50256g()) {
                    }
                    TextView textView52222 = (TextView) this.f91026b.findViewById(C0126R.C0129id.Disclaimer);
                    a = btrf.m117063a(((btrg) this.f91027c.f91029a.f164949b).f150098h);
                    if (a == 0) {
                    }
                    textView52222.setText(a == 5 ? C0126R.string.tp_transaction_legal_disclaimer_in_app : C0126R.string.tp_transaction_legal_disclaimer_nfc);
                    View findViewById62222 = this.f91026b.findViewById(C0126R.C0129id.TransactionQuestionsButton);
                    findViewById62222.setOnClickListener(new atvt(this));
                    arrayList = new ArrayList();
                    arrayList.add(0);
                    if (!arrayList.isEmpty()) {
                    }
                    findViewById62222.setVisibility(i3);
                    Intent intent2222 = new Intent("android.intent.action.VIEW");
                    intent2222.setData(Uri.parse("https://support.google.com/androidpay/?p=transaction_details"));
                    TextView textView62222 = (TextView) this.f91026b.findViewById(C0126R.C0129id.PendingTransactionsDisclaimer);
                    if (this.f91027c.mo50256g()) {
                    }
                    TextView textView72222 = (TextView) this.f91026b.findViewById(C0126R.C0129id.GetTheApp);
                    Intent a42222 = new atxm().mo50304a();
                    WalletTransactionDetailsChimeraActivity walletTransactionDetailsChimeraActivity62222 = this.f91026b;
                    atyg.m76550a(walletTransactionDetailsChimeraActivity62222, textView72222, walletTransactionDetailsChimeraActivity62222.getString(C0126R.string.tp_transaction_get_app_to_see_purchase_history), a42222);
                    textView72222.setLinkTextColor(C1133kh.m17843b(this.f91026b, C0126R.color.tp_action_color));
                }
                str13 = "red";
                str12 = String.format("color:%s|%s", str13, b4);
                uri = new Uri.Builder().scheme("https").authority("maps.googleapis.com").path("/maps/api/staticmap").appendQueryParameter("center", b4).appendQueryParameter("zoom", "16").appendQueryParameter("markers", str12).appendQueryParameter("language", Locale.getDefault().getLanguage()).appendQueryParameter("region", Locale.getDefault().getCountry()).build();
                if (uri != null) {
                }
                atvv4 = this.f91027c;
                if (atvv4.mo50258i() == 4) {
                }
                str4 = null;
                atvv5 = this.f91027c;
                if (atvv5.mo50258i() == 4) {
                }
                str5 = null;
                atvv6 = this.f91027c;
                if (atvv6.mo50258i() == 4) {
                }
                str6 = null;
                if (!TextUtils.isEmpty(str4)) {
                }
                this.f91026b.findViewById(C0126R.C0129id.MerchantApp).setVisibility(8);
                if (z5) {
                }
                btqt = ((btrg) this.f91027c.f91029a.f164949b).f150096f;
                if (btqt != null) {
                }
                WalletTransactionDetailsChimeraActivity walletTransactionDetailsChimeraActivity422222 = this.f91026b;
                String str1622222 = "";
                if (btqt != null) {
                }
                TextView textView422222 = (TextView) this.f91026b.findViewById(C0126R.C0129id.PaidWithExplanation);
                if (this.f91027c.mo50256g()) {
                }
                TextView textView522222 = (TextView) this.f91026b.findViewById(C0126R.C0129id.Disclaimer);
                a = btrf.m117063a(((btrg) this.f91027c.f91029a.f164949b).f150098h);
                if (a == 0) {
                }
                textView522222.setText(a == 5 ? C0126R.string.tp_transaction_legal_disclaimer_in_app : C0126R.string.tp_transaction_legal_disclaimer_nfc);
                View findViewById622222 = this.f91026b.findViewById(C0126R.C0129id.TransactionQuestionsButton);
                findViewById622222.setOnClickListener(new atvt(this));
                arrayList = new ArrayList();
                arrayList.add(0);
                if (!arrayList.isEmpty()) {
                }
                findViewById622222.setVisibility(i3);
                Intent intent22222 = new Intent("android.intent.action.VIEW");
                intent22222.setData(Uri.parse("https://support.google.com/androidpay/?p=transaction_details"));
                TextView textView622222 = (TextView) this.f91026b.findViewById(C0126R.C0129id.PendingTransactionsDisclaimer);
                if (this.f91027c.mo50256g()) {
                }
                TextView textView722222 = (TextView) this.f91026b.findViewById(C0126R.C0129id.GetTheApp);
                Intent a422222 = new atxm().mo50304a();
                WalletTransactionDetailsChimeraActivity walletTransactionDetailsChimeraActivity622222 = this.f91026b;
                atyg.m76550a(walletTransactionDetailsChimeraActivity622222, textView722222, walletTransactionDetailsChimeraActivity622222.getString(C0126R.string.tp_transaction_get_app_to_see_purchase_history), a422222);
                textView722222.setLinkTextColor(C1133kh.m17843b(this.f91026b, C0126R.color.tp_action_color));
            }
        }
        ((TextView) this.f91026b.findViewById(C0126R.C0129id.Title)).setText(str);
        TextView textView8 = (TextView) this.f91026b.findViewById(C0126R.C0129id.Date);
        atvv atvv11 = this.f91027c;
        WalletTransactionDetailsChimeraActivity walletTransactionDetailsChimeraActivity7 = this.f91026b;
        bxyk bxyk2 = ((btrg) atvv11.f91029a.f164949b).f150092b;
        textView8.setText(DateUtils.formatDateTime(walletTransactionDetailsChimeraActivity7, 1000 * (bxyk2 != null ? bxyk2.f165097a : 0), AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS));
        ((TextView) this.f91026b.findViewById(C0126R.C0129id.Timestamp)).setText(this.f91027c.mo50247a(this.f91026b));
        this.f91026b.findViewById(C0126R.C0129id.Timestamp).setVisibility(this.f91027c.mo50247a(this.f91026b) != null ? 0 : 8);
        this.f91026b.findViewById(C0126R.C0129id.TimestampTitle).setVisibility(this.f91027c.mo50247a(this.f91026b) != null ? 0 : 8);
        TextView textView9 = (TextView) this.f91026b.findViewById(C0126R.C0129id.Amount);
        textView9.setText(this.f91027c.mo50252c());
        int a5 = btrl.m117069a(((btrg) this.f91027c.f91029a.f164949b).f150094d);
        if ((a5 != 0 && a5 == 5) || this.f91027c.mo50256g()) {
            textView9.setTextColor(this.f91026b.getResources().getColor(C0126R.color.quantum_black_hint_text));
        }
        if (this.f91027c.mo50257h() || this.f91027c.mo50255f()) {
            textView9.setTypeface(null, 1);
        }
        atvv atvv12 = this.f91027c;
        WalletTransactionDetailsChimeraActivity walletTransactionDetailsChimeraActivity8 = this.f91026b;
        int a6 = btrl.m117069a(((btrg) atvv12.f91029a.f164949b).f150094d);
        if (a6 == 0) {
            a6 = 1;
        }
        int i10 = a6 - 2;
        if (i10 == 3) {
            str14 = walletTransactionDetailsChimeraActivity8.getString(C0126R.string.tp_status_disputed);
        } else if (i10 == 5) {
            str14 = walletTransactionDetailsChimeraActivity8.getString(C0126R.string.tp_status_refunded);
        } else if (i10 == 6) {
            str14 = walletTransactionDetailsChimeraActivity8.getString(C0126R.string.tp_status_declined);
        } else if (i10 != 7) {
            str14 = null;
        } else {
            str14 = walletTransactionDetailsChimeraActivity8.getString(C0126R.string.tp_status_credit);
        }
        if (str14 != null) {
            this.f91026b.findViewById(C0126R.C0129id.TransactionStatus).setVisibility(0);
            ((TextView) this.f91026b.findViewById(C0126R.C0129id.TransactionStatus)).setText(str14);
            if (this.f91027c.mo50256g()) {
                ((TextView) this.f91026b.findViewById(C0126R.C0129id.TransactionStatus)).setTextColor(azxe.m86324a(this.f91026b, C0126R.attr.colorError));
            }
        } else {
            this.f91026b.findViewById(C0126R.C0129id.TransactionStatus).setVisibility(8);
        }
        int j2 = this.f91027c.mo50259j();
        this.f91026b.findViewById(C0126R.C0129id.InferredDetailsLayout).setVisibility(j2 == 5 ? 8 : 0);
        this.f91026b.findViewById(C0126R.C0129id.FeedbackAcknowledgementLayout).setVisibility(j2 == 5 ? 0 : 8);
        if (j2 == 5) {
            this.f91026b.findViewById(C0126R.C0129id.TransactionCard).setVisibility(0);
        }
        this.f91026b.findViewById(C0126R.C0129id.UndoFeedbackButton).setOnClickListener(new atvo(this));
        z = true;
        findViewById = this.f91026b.findViewById(C0126R.C0129id.AddressLayout);
        TextView textView10 = (TextView) this.f91026b.findViewById(C0126R.C0129id.Address);
        TextView textView22 = (TextView) this.f91026b.findViewById(C0126R.C0129id.InferredStoreName);
        b = this.f91027c.mo50250b(this.f91026b);
        b2 = this.f91027c.mo50249b();
        j = this.f91027c.mo50259j();
        if (TextUtils.isEmpty(b)) {
        }
        findViewById.setVisibility(0);
        if (TextUtils.isEmpty(b2)) {
        }
        textView22.setVisibility(i5);
        textView22.setText(b2);
        textView10.setText(b);
        if (TextUtils.isEmpty(b)) {
        }
        textView10.setVisibility(i6);
        View findViewById22 = this.f91026b.findViewById(C0126R.C0129id.ReportWrongAddress);
        if (j == 4) {
        }
        findViewById22.setVisibility(i7);
        this.f91026b.findViewById(C0126R.C0129id.ReportWrongAddress).setOnClickListener(new atvp(this));
        z2 = true;
        boolean z62 = z | z2;
        atvv = this.f91027c;
        if (atvv.mo50258i() == 4) {
        }
        str2 = null;
        atvv2 = this.f91027c;
        if (atvv2.mo50258i() == 4) {
        }
        if (str2 != null) {
        }
        boolean z722 = z62 | z3;
        e = this.f91027c.mo50254e();
        if (TextUtils.isEmpty(e)) {
        }
        z5 = z4 | z722;
        View findViewById322 = this.f91026b.findViewById(C0126R.C0129id.TransactionCard);
        if (!z5) {
        }
        findViewById322.setVisibility(i);
        View findViewById422 = this.f91026b.findViewById(C0126R.C0129id.AdditionalDetailsLayout);
        if (TextUtils.isEmpty(this.f91026b.f108941e.f108343d)) {
        }
        findViewById422.setVisibility(i2);
        NetworkImageView networkImageView32 = (NetworkImageView) this.f91026b.findViewById(C0126R.C0129id.MapImage);
        b3 = this.f91027c.mo50249b();
        if (b3 == null) {
        }
        networkImageView32.setImageUrl(null, atyg.m76548a());
        networkImageView32.setImageDrawable(null);
        atvv3 = this.f91027c;
        b4 = atvv3.mo50250b(this.f91026b);
        d = atvv3.mo50253d();
        if (b4 == null) {
        }
        if (d != null) {
        }
        btrb = ((btrg) atvv3.f91029a.f164949b).f150095e;
        if (btrb == null) {
        }
        if (btrb.f150065h != null) {
        }
        btrb2 = ((btrg) atvv3.f91029a.f164949b).f150095e;
        if (btrb2 == null) {
        }
        btmy = btrb2.f150059b;
        if (btmy == null) {
        }
        i4 = btmy.f149584f;
        if (i4 != 0) {
        }
        if (c != 0) {
        }
        str13 = "red";
        str12 = String.format("color:%s|%s", str13, b4);
        uri = new Uri.Builder().scheme("https").authority("maps.googleapis.com").path("/maps/api/staticmap").appendQueryParameter("center", b4).appendQueryParameter("zoom", "16").appendQueryParameter("markers", str12).appendQueryParameter("language", Locale.getDefault().getLanguage()).appendQueryParameter("region", Locale.getDefault().getCountry()).build();
        if (uri != null) {
        }
        atvv4 = this.f91027c;
        if (atvv4.mo50258i() == 4) {
        }
        str4 = null;
        atvv5 = this.f91027c;
        if (atvv5.mo50258i() == 4) {
        }
        str5 = null;
        atvv6 = this.f91027c;
        if (atvv6.mo50258i() == 4) {
        }
        str6 = null;
        if (!TextUtils.isEmpty(str4)) {
        }
        this.f91026b.findViewById(C0126R.C0129id.MerchantApp).setVisibility(8);
        if (z5) {
        }
        btqt = ((btrg) this.f91027c.f91029a.f164949b).f150096f;
        if (btqt != null) {
        }
        WalletTransactionDetailsChimeraActivity walletTransactionDetailsChimeraActivity4222222 = this.f91026b;
        String str16222222 = "";
        if (btqt != null) {
        }
        TextView textView4222222 = (TextView) this.f91026b.findViewById(C0126R.C0129id.PaidWithExplanation);
        if (this.f91027c.mo50256g()) {
        }
        TextView textView5222222 = (TextView) this.f91026b.findViewById(C0126R.C0129id.Disclaimer);
        a = btrf.m117063a(((btrg) this.f91027c.f91029a.f164949b).f150098h);
        if (a == 0) {
        }
        textView5222222.setText(a == 5 ? C0126R.string.tp_transaction_legal_disclaimer_in_app : C0126R.string.tp_transaction_legal_disclaimer_nfc);
        View findViewById6222222 = this.f91026b.findViewById(C0126R.C0129id.TransactionQuestionsButton);
        findViewById6222222.setOnClickListener(new atvt(this));
        arrayList = new ArrayList();
        arrayList.add(0);
        if (!arrayList.isEmpty()) {
        }
        findViewById6222222.setVisibility(i3);
        Intent intent222222 = new Intent("android.intent.action.VIEW");
        intent222222.setData(Uri.parse("https://support.google.com/androidpay/?p=transaction_details"));
        TextView textView6222222 = (TextView) this.f91026b.findViewById(C0126R.C0129id.PendingTransactionsDisclaimer);
        if (this.f91027c.mo50256g()) {
        }
        TextView textView7222222 = (TextView) this.f91026b.findViewById(C0126R.C0129id.GetTheApp);
        Intent a4222222 = new atxm().mo50304a();
        WalletTransactionDetailsChimeraActivity walletTransactionDetailsChimeraActivity6222222 = this.f91026b;
        atyg.m76550a(walletTransactionDetailsChimeraActivity6222222, textView7222222, walletTransactionDetailsChimeraActivity6222222.getString(C0126R.string.tp_transaction_get_app_to_see_purchase_history), a4222222);
        textView7222222.setLinkTextColor(C1133kh.m17843b(this.f91026b, C0126R.color.tp_action_color));
    }

    /* renamed from: a */
    public final void mo50241a(btrj btrj) {
        WalletTransactionDetailsChimeraActivity walletTransactionDetailsChimeraActivity = this.f91026b;
        atff.m75765a(new askf(walletTransactionDetailsChimeraActivity.f108939c, walletTransactionDetailsChimeraActivity.f108940d, askc.m74272b(), this.f91026b), "t/transaction/editgeomerchant", btrj, btrk.f150112a, new atwm("Error calling TRANSACTION_FEEDBACK_RPC, ignoring it."), "LegacyTxnDetailsHelper");
    }

    /* renamed from: a */
    public final boolean mo50243a(String str, String str2) {
        if (this.f91027c.mo50256g()) {
            str = str2;
        }
        Intent putExtra = new Intent(str).putExtra("account_name", this.f91026b.getIntent().getStringExtra("account_name")).putExtra("payment_card", this.f91026b.f108941e);
        putExtra.putExtra("transaction", ((btrg) this.f91027c.f91029a.mo74062i()).serializeToBytes());
        if (!atxn.m76506a(this.f91026b, putExtra)) {
            return false;
        }
        this.f91026b.startActivity(putExtra);
        return true;
    }
}
