package p000;

import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.romanesco.protomodel.SourceStatsEntity;
import com.google.android.gms.romanesco.restoresettings.ContactsRestoreSettingsChimeraActivity;
import java.util.List;

/* renamed from: apdl */
public final /* synthetic */ class apdl implements aubw {

    /* renamed from: a */
    private final ContactsRestoreSettingsChimeraActivity f84175a;

    /* renamed from: b */
    private final ltn f84176b;

    public apdl(ContactsRestoreSettingsChimeraActivity contactsRestoreSettingsChimeraActivity, ltn ltn) {
        this.f84175a = contactsRestoreSettingsChimeraActivity;
        this.f84176b = ltn;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        ContactsRestoreSettingsChimeraActivity contactsRestoreSettingsChimeraActivity = this.f84175a;
        ltn ltn = this.f84176b;
        List<SourceStatsEntity> list = (List) obj;
        aoyj.m69819a().mo47002c(3);
        if (list == null) {
            contactsRestoreSettingsChimeraActivity.f107294f.mo46985d("fetchGmsBackupStats failed to get any source stats");
            contactsRestoreSettingsChimeraActivity.mo58848a(false);
            contactsRestoreSettingsChimeraActivity.mo58853j();
            contactsRestoreSettingsChimeraActivity.mo58852i();
            return;
        }
        apei apei = new apei(null, ltn.f32965d);
        apei.f84219b = Long.valueOf(ltn.f32963b);
        apei.f84228k = ltn;
        apei.f84221d = ltn.f32964c;
        for (SourceStatsEntity sourceStatsEntity : list) {
            apei.mo47136a(sourceStatsEntity);
        }
        apej a = apei.mo47135a();
        if (a.f84236h <= 0 && a.f84235g <= 0) {
            contactsRestoreSettingsChimeraActivity.f107294f.mo46985d("No device or sim contact fond in backup.");
            contactsRestoreSettingsChimeraActivity.mo58848a(false);
            Toast.makeText(contactsRestoreSettingsChimeraActivity, (int) C0126R.string.romanesco_no_contacts_in_backup_error, 1).show();
            return;
        }
        contactsRestoreSettingsChimeraActivity.mo58848a(false);
        contactsRestoreSettingsChimeraActivity.mo58845a(contactsRestoreSettingsChimeraActivity.f107291c.f84164d, apei.mo47135a());
        contactsRestoreSettingsChimeraActivity.mo58852i();
    }
}
