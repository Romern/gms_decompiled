package p000;

import android.accounts.Account;
import com.google.android.gms.romanesco.restoresettings.ContactsRestoreSettingsChimeraActivity;
import java.lang.ref.WeakReference;

/* renamed from: apdo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apdo implements aubw {

    /* renamed from: a */
    final WeakReference f84181a;

    public apdo(ContactsRestoreSettingsChimeraActivity contactsRestoreSettingsChimeraActivity) {
        this.f84181a = new WeakReference(contactsRestoreSettingsChimeraActivity);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10462a(Object obj) {
        Account account = (Account) obj;
        ContactsRestoreSettingsChimeraActivity contactsRestoreSettingsChimeraActivity = (ContactsRestoreSettingsChimeraActivity) this.f84181a.get();
        contactsRestoreSettingsChimeraActivity.f107291c.mo47122a(account != null ? account.name : null);
        contactsRestoreSettingsChimeraActivity.mo58848a(false);
    }
}
