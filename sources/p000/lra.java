package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;

/* renamed from: lra */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lra {
    /* renamed from: a */
    public static int m19561a() {
        return !ccip.m129872l() ? 1 : 0;
    }

    /* renamed from: b */
    public static kcz m19566b(Context context, int i) {
        Integer num;
        if (i == 1) {
            num = Integer.valueOf((int) C0126R.C0127drawable.wallet_uic_card_amex);
        } else if (i == 2) {
            num = Integer.valueOf((int) C0126R.C0127drawable.wallet_uic_card_diners);
        } else if (i == 3) {
            num = Integer.valueOf((int) C0126R.C0127drawable.wallet_uic_card_discover);
        } else if (i == 4) {
            num = Integer.valueOf((int) C0126R.C0127drawable.wallet_uic_card_jcb);
        } else if (i == 5) {
            num = Integer.valueOf((int) C0126R.C0127drawable.wallet_uic_card_mastercard);
        } else if (i == 8) {
            num = Integer.valueOf((int) C0126R.C0127drawable.wallet_uic_card_visa);
        } else if (i != 9) {
            num = Integer.valueOf((int) C0126R.C0127drawable.quantum_ic_credit_card_black_24);
        } else {
            num = Integer.valueOf((int) C0126R.C0127drawable.wallet_uic_card_elo);
        }
        return kcz.m17657a("com.google.android.gms", num.intValue(), m19564a(context, i));
    }

    /* renamed from: a */
    public static Intent m19562a(Context context, Account account, bmxv bmxv, int i) {
        bxvd da = bwem.f159003c.mo74144da();
        bweh a = m19563a(((Long) bmxv.mo66812a((Object) 0L)).longValue(), i);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwem bwem = (bwem) da.f164949b;
        a.getClass();
        bwem.f159006b = a;
        bwem.f159005a |= 1;
        awlg awlg = new awlg(context);
        awlg.mo52187a(m19561a());
        awlg.mo52188a(account);
        awlg.f94574a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS", ((bwem) da.mo74062i()).serializeToBytes());
        m19565a(awlg);
        return awlg.mo52186a();
    }

    /* renamed from: a */
    public static bweh m19563a(long j, int i) {
        bxvd da = bweh.f158979f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bweh bweh = (bweh) da.f164949b;
        bweh.f158981a |= 2;
        bweh.f158984d = 70213;
        bxvd da2 = blxb.f128033c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        blxb blxb = (blxb) da2.f164949b;
        blxb.f128035a = 4;
        blxb.f128036b = Long.valueOf(j);
        blxb blxb2 = (blxb) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bweh bweh2 = (bweh) da.f164949b;
        blxb2.getClass();
        bweh2.f158983c = blxb2;
        bweh2.f158982b = 1;
        bxvd da3 = blxe.f128043c.mo74144da();
        long j2 = (long) i;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        blxe blxe = (blxe) da3.f164949b;
        blxe.f128045a = 1 | blxe.f128045a;
        blxe.f128046b = j2;
        blxe blxe2 = (blxe) da3.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bweh bweh3 = (bweh) da.f164949b;
        blxe2.getClass();
        bweh3.f158985e = blxe2;
        bweh3.f158981a |= 4;
        return (bweh) da.mo74062i();
    }

    /* renamed from: a */
    public static CharSequence m19564a(Context context, int i) {
        switch (i) {
            case 1:
                return "Amex";
            case 2:
                return "DinersClub";
            case 3:
                return "Discover";
            case 4:
                return "JCB";
            case 5:
                return "MasterCard";
            case 6:
            case 12:
            default:
                return context.getText(C0126R.string.common_card);
            case 7:
                return "Solo";
            case 8:
                return "Visa";
            case 9:
                return "Elo";
            case 10:
                return "Interac";
            case 11:
                return "EFTPOS";
            case 13:
                return "Maestro";
            case 14:
                return "UnionPay";
        }
    }

    /* renamed from: a */
    public static void m19565a(awjx awjx) {
        WalletCustomTheme walletCustomTheme = new WalletCustomTheme();
        walletCustomTheme.mo59914a();
        awjx.mo52190a(walletCustomTheme);
        awjx.mo52192b(3);
    }
}
