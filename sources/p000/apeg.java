package p000;

import com.google.android.gms.romanesco.restoresettings.ContactsRestoreSettingsChimeraActivity;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: apeg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apeg implements aubw {

    /* renamed from: a */
    private final WeakReference f84207a;

    /* renamed from: b */
    private final apeh f84208b;

    /* renamed from: c */
    private final String f84209c;

    public apeg(ContactsRestoreSettingsChimeraActivity contactsRestoreSettingsChimeraActivity, apeh apeh, String str) {
        this.f84207a = new WeakReference(contactsRestoreSettingsChimeraActivity);
        this.f84208b = apeh;
        this.f84209c = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10462a(Object obj) {
        ContactsRestoreSettingsChimeraActivity contactsRestoreSettingsChimeraActivity;
        List list = (List) obj;
        if (!cgkf.m145856c() && (contactsRestoreSettingsChimeraActivity = (ContactsRestoreSettingsChimeraActivity) this.f84207a.get()) != null) {
            aoyh aoyh = apeh.f84210c;
            this.f84208b.mo47133a(this.f84209c, list, null);
            aoyj.m69819a().mo46988a(9);
            contactsRestoreSettingsChimeraActivity.mo58848a(false);
        }
    }
}
