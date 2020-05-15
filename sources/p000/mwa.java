package p000;

import android.text.TextUtils;
import com.google.android.gms.backup.settings.p033ui.ContactsBackupPreference;
import com.google.android.gms.romanesco.protomodel.BackedUpContactsPerDeviceEntity;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* renamed from: mwa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class mwa implements aubw {

    /* renamed from: a */
    private final ContactsBackupPreference f34830a;

    /* renamed from: b */
    private final String f34831b;

    public mwa(ContactsBackupPreference contactsBackupPreference, String str) {
        this.f34830a = contactsBackupPreference;
        this.f34831b = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10462a(Object obj) {
        BackedUpContactsPerDeviceEntity backedUpContactsPerDeviceEntity;
        String a = mby.m24844a(this.f34830a.f1595k, this.f34831b);
        Iterator it = ((List) obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                backedUpContactsPerDeviceEntity = null;
                break;
            }
            backedUpContactsPerDeviceEntity = (BackedUpContactsPerDeviceEntity) it.next();
            if (TextUtils.equals(backedUpContactsPerDeviceEntity.f107230a, a)) {
                break;
            }
        }
        if (backedUpContactsPerDeviceEntity != null) {
            this.f34830a.mo17255a(mvp.m25668a(new Date(backedUpContactsPerDeviceEntity.f107233d.longValue())));
            return;
        }
        this.f34830a.mo17255a(mvp.f34814a);
    }
}
