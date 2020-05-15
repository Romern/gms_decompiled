package p000;

import android.accounts.Account;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: befm */
final /* synthetic */ class befm implements bmxj {

    /* renamed from: a */
    private final Account f111507a;

    /* renamed from: b */
    private final AtomicInteger f111508b;

    public befm(Account account, AtomicInteger atomicInteger) {
        this.f111507a = account;
        this.f111508b = atomicInteger;
    }

    public final Object apply(Object obj) {
        Account account = this.f111507a;
        AtomicInteger atomicInteger = this.f111508b;
        byeg byeg = (byeg) obj;
        bxvd bxvd = (bxvd) byeg.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) byeg);
        Integer a = befc.m94934a(byeg, account);
        if (a == null) {
            a = Integer.valueOf(byeg.f165902b);
            bxvd da = byee.f165893d.mo74144da();
            String str = account.name;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byee byee = (byee) da.f164949b;
            str.getClass();
            byee.f165895a |= 1;
            byee.f165896b = str;
            String str2 = account.type;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byee byee2 = (byee) da.f164949b;
            str2.getClass();
            byee2.f165895a |= 2;
            byee2.f165897c = str2;
            byee byee3 = (byee) da.mo74062i();
            int intValue = a.intValue() + 1;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            byeg byeg2 = (byeg) bxvd.f164949b;
            byeg byeg3 = byeg.f165899d;
            byeg2.f165901a |= 1;
            byeg2.f165902b = intValue;
            int intValue2 = a.intValue();
            byee3.getClass();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            byeg byeg4 = (byeg) bxvd.f164949b;
            bxww bxww = byeg4.f165903c;
            if (!bxww.f165014a) {
                byeg4.f165903c = bxww.mo74203a();
            }
            byeg4.f165903c.put(Integer.valueOf(intValue2), byee3);
        }
        atomicInteger.set(a.intValue());
        return (byeg) bxvd.mo74062i();
    }
}
