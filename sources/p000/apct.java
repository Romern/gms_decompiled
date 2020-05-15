package p000;

import com.google.android.gms.romanesco.restoresettings.ContactsRestoreContactsChimeraActivity;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: apct */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apct implements aubw {

    /* renamed from: a */
    private final WeakReference f84144a;

    public apct(ContactsRestoreContactsChimeraActivity contactsRestoreContactsChimeraActivity) {
        this.f84144a = new WeakReference(contactsRestoreContactsChimeraActivity);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aoyj.a(boolean, int, int, int, boolean):void
     arg types: [int, int, int, int, int]
     candidates:
      aoyj.a(boolean, boolean, int, boolean, boolean):void
      aoyj.a(boolean, int, int, int, boolean):void */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10462a(Object obj) {
        List list = (List) obj;
        ContactsRestoreContactsChimeraActivity contactsRestoreContactsChimeraActivity = (ContactsRestoreContactsChimeraActivity) this.f84144a.get();
        if (contactsRestoreContactsChimeraActivity != null) {
            if (contactsRestoreContactsChimeraActivity.f107265q == 3) {
                apcm apcm = contactsRestoreContactsChimeraActivity.f107252d;
                apcm.f84134d = true;
                apcm.f84132b = list;
            } else {
                apcm apcm2 = contactsRestoreContactsChimeraActivity.f107252d;
                apcm2.f84133c = true;
                apcm2.f84131a = list;
            }
            contactsRestoreContactsChimeraActivity.mo58838e();
            contactsRestoreContactsChimeraActivity.mo58837a(list);
            contactsRestoreContactsChimeraActivity.f107250b.mo46998a(false, list.size(), 2, contactsRestoreContactsChimeraActivity.f107265q, false);
            contactsRestoreContactsChimeraActivity.f107250b.mo46997a(true);
            if (contactsRestoreContactsChimeraActivity.f107264p) {
                contactsRestoreContactsChimeraActivity.f107255g.mo47008a(true);
            }
        }
    }
}
