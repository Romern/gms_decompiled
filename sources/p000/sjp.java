package p000;

import android.os.Parcel;
import com.google.android.gms.common.account.AccountBoundService;

/* renamed from: sjp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sjp extends dck implements sjq {

    /* renamed from: a */
    final /* synthetic */ AccountBoundService f44589a;

    public sjp() {
        super("com.google.android.gms.common.service.IAccountService");
    }

    /* renamed from: a */
    public final String mo25650a(String str, String str2) {
        return soz.m35794b(this.f44589a, str, str2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sjp(AccountBoundService accountBoundService) {
        super("com.google.android.gms.common.service.IAccountService");
        this.f44589a = accountBoundService;
    }

    /* renamed from: a */
    public final void mo25651a(String str) {
        soz.m35799c(this.f44589a, str);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            String a = mo25650a(parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            parcel2.writeString(a);
        } else if (i != 2) {
            return false;
        } else {
            mo25651a(parcel.readString());
            parcel2.writeNoException();
        }
        return true;
    }
}
