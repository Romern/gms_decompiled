package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.backup.settings.p033ui.ContactsBackupPreference;

/* renamed from: mvz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class mvz implements aubt {

    /* renamed from: a */
    private final ContactsBackupPreference f34829a;

    public mvz(ContactsBackupPreference contactsBackupPreference) {
        this.f34829a = contactsBackupPreference;
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        ContactsBackupPreference.f29117a.mo25418e("Failed to get contacts backup status", new Object[0]);
        ContactsBackupPreference contactsBackupPreference = this.f34829a;
        contactsBackupPreference.mo1966a((CharSequence) contactsBackupPreference.f1595k.getString(C0126R.string.common_something_went_wrong));
    }
}
