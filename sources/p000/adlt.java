package p000;

import android.accounts.Account;
import android.view.View;
import java.util.ArrayList;

/* renamed from: adlt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class adlt implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ adma f62135a;

    public adlt(adma adma) {
        this.f62135a = adma;
    }

    public void onClick(View view) {
        Account account;
        this.f62135a.f62173f.mo33659a("OptInFragment.accountPickerClicked");
        adma adma = this.f62135a;
        ArrayList arrayList = adma.f62144b;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                account = null;
                break;
            }
            account = (Account) arrayList.get(i);
            i++;
            if (account.name.equals(adma.f62143a)) {
                break;
            }
        }
        this.f62135a.startActivityForResult(adyd.m51364a(account, this.f62135a.f62144b, new String[]{"com.google"}), 0);
    }
}
