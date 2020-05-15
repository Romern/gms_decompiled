package p000;

import android.accounts.Account;
import android.content.ContentValues;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: hnx */
final /* synthetic */ class hnx implements bmxj {

    /* renamed from: a */
    private final hnz f20095a;

    public hnx(hnz hnz) {
        this.f20095a = hnz;
    }

    public final Object apply(Object obj) {
        hnz hnz = this.f20095a;
        alky alky = (alky) obj;
        if (alky.mo12459b() != null && alky.mo12459b().mo24660a() > 0) {
            return alky;
        }
        rtu a = DataHolder.m22537a(new String[]{"account_name", "display_name", "given_name", "family_name", "avatar"});
        bnre i = hnz.f20097a.listIterator();
        while (i.hasNext()) {
            Account account = (Account) i.next();
            ContentValues contentValues = new ContentValues();
            contentValues.put("account_name", account.name);
            contentValues.put("display_name", account.name);
            contentValues.putNull("given_name");
            contentValues.putNull("family_name");
            contentValues.putNull("avatar");
            a.mo25160a(contentValues);
        }
        return new hny(a);
    }
}
