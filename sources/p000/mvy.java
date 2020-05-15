package p000;

import android.accounts.Account;
import android.text.TextUtils;
import com.google.android.gms.backup.settings.p033ui.ContactsBackupPreference;

/* renamed from: mvy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mvy implements mvt {

    /* renamed from: a */
    final /* synthetic */ Account f34827a;

    /* renamed from: b */
    final /* synthetic */ ContactsBackupPreference f34828b;

    public mvy(ContactsBackupPreference contactsBackupPreference, Account account) {
        this.f34828b = contactsBackupPreference;
        this.f34827a = account;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo20271a() {
        Account account = this.f34827a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20272a(Object obj) {
        Account account;
        mvp mvp;
        String str = (String) obj;
        this.f34828b.mo17255a(mvp.f34817d);
        ContactsBackupPreference contactsBackupPreference = this.f34828b;
        if ((contactsBackupPreference.f29119c == null && !TextUtils.isEmpty(str)) || ((account = contactsBackupPreference.f29119c) != null && !TextUtils.equals(account.name, str))) {
            ContactsBackupPreference.f29117a.mo25412b("Backup account was changed in the middle", new Object[0]);
        } else if (TextUtils.isEmpty(str)) {
            ContactsBackupPreference.f29117a.mo25412b("Empty account", new Object[0]);
            if (ccod.m130983d()) {
                mvp = mvp.f34816c;
            } else {
                mvp = mvp.f34815b;
            }
            contactsBackupPreference.mo17255a(mvp);
        } else {
            aucb a = contactsBackupPreference.f29118b.mo46972a(str, "");
            a.mo50373a(new mwa(contactsBackupPreference, str));
            a.mo50372a(new mvz(contactsBackupPreference));
        }
    }
}
