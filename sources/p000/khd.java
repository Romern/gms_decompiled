package p000;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.autofill.data.PaymentCard;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.wallet.firstparty.saveinstrument.Card;
import com.google.android.gms.wallet.firstparty.saveinstrument.SaveInstrumentRequest;
import java.time.YearMonth;
import java.util.ArrayList;

/* renamed from: khd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class khd extends keo implements khn {

    /* renamed from: a */
    public final Context f24120a;

    /* renamed from: b */
    public final kfe f24121b;

    /* renamed from: c */
    public final kbe f24122c;

    /* renamed from: d */
    public final Account f24123d;

    /* renamed from: e */
    public final int f24124e;

    /* renamed from: f */
    public final boolean f24125f;

    /* renamed from: g */
    private final awkh f24126g;

    public khd(Context context, kfe kfe, awkh awkh, kbe kbe, Account account, int i, boolean z) {
        this.f24120a = context;
        this.f24121b = kfe;
        this.f24126g = awkh;
        this.f24122c = kbe;
        this.f24123d = account;
        this.f24124e = i;
        this.f24125f = z;
    }

    /* renamed from: a */
    public final bqgg mo14429a(kej kej) {
        kel kel = kej.f23934a;
        khf b = khl.m17863b();
        b.mo14470a(kel.f23937a);
        b.mo14469a(bmxv.m108566b(kel.f23938b.f23817a));
        b.mo14473b(kel.f23939c);
        b.mo14472a(this.f24125f);
        b.mo14471a(this);
        return kfg.m17752a(bqdx.m112673a(b.mo14468a().mo14467a(), kha.f24118a, bqfb.INSTANCE));
    }

    /* renamed from: a */
    public final bqgg mo14430a(kem kem) {
        ArrayList arrayList;
        Object obj = kem.f23944b;
        if (!(obj instanceof PaymentCard)) {
            return bqga.m112777a((Throwable) new IllegalArgumentException());
        }
        PaymentCard paymentCard = (PaymentCard) obj;
        byte[] bArr = kem.f23943a.f23940d;
        if (bArr.length == 0) {
            return bqga.m112777a((Throwable) new IllegalArgumentException());
        }
        kdj kdj = paymentCard.f11613a;
        if (kdj == null) {
            return bqga.m112777a((Throwable) new IllegalArgumentException());
        }
        awlk awlk = new awlk(new Card());
        String str = kdj.f23889a;
        sdo.m34975b(!TextUtils.isEmpty(str), "Empty PAN not allowed.");
        awlk.f94595a.f110178a = str.replaceAll("[\\s\\-]", "");
        kdj kdj2 = paymentCard.f11614b;
        if (kdj2 != null) {
            String str2 = kdj2.f23889a;
            if (!TextUtils.isEmpty(str2)) {
                awlk.f94595a.f110179b = str2.replaceAll("[\\s\\-]", "");
            }
        }
        YearMonth yearMonth = paymentCard.f11616d;
        if (yearMonth != null) {
            awlk.f94595a.f110181d = yearMonth.getYear();
            awlk.f94595a.f110180c = yearMonth.getMonthValue();
        }
        sdo.m34975b(!TextUtils.isEmpty(awlk.f94595a.f110178a), "PAN is required.");
        Card card = awlk.f94595a;
        String str3 = paymentCard.f11615c;
        kdg kdg = paymentCard.f11617e;
        adda a = UserAddress.m66752a();
        if (str3 == null && kdg == null) {
            arrayList = new ArrayList(0);
        } else {
            if (str3 != null) {
                a.mo33333k(str3);
            }
            if (kdg != null) {
                if (kdg.f23880h.size() > 0) {
                    a.mo33323a((String) kdg.f23880h.get(0));
                }
                if (kdg.f23880h.size() >= 2) {
                    a.mo33324b((String) kdg.f23880h.get(1));
                }
                if ((kdg.f23873a & 32) != 0) {
                    a.mo33332j(kdg.f23879g);
                }
                if ((kdg.f23873a & 16) != 0) {
                    a.mo33328f(kdg.f23878f);
                }
                if ((kdg.f23873a & 4) != 0) {
                    a.mo33335m(kdg.f23876d);
                }
                if ((kdg.f23873a & 2) != 0) {
                    a.mo33330h(kdg.f23875c);
                }
            }
            arrayList = new ArrayList(1);
            arrayList.add(a.f61429a);
        }
        awkh awkh = this.f24126g;
        return kfg.m17752a(bqdx.m112673a(lqv.m19545a(awkh.mo24732b(new awke(awkh, new SaveInstrumentRequest(card, arrayList, bArr)))), khb.f24119a, bqfb.INSTANCE));
    }
}
