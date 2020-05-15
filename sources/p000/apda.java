package p000;

import android.net.Uri;
import android.view.View;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.romanesco.restoresettings.ContactsRestoreDialogChimeraActivity;

/* renamed from: apda */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apda implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ContactsRestoreDialogChimeraActivity f84151a;

    public apda(ContactsRestoreDialogChimeraActivity contactsRestoreDialogChimeraActivity) {
        this.f84151a = contactsRestoreDialogChimeraActivity;
    }

    public void onClick(View view) {
        GoogleHelp googleHelp;
        ContactsRestoreDialogChimeraActivity contactsRestoreDialogChimeraActivity = this.f84151a;
        Uri parse = Uri.parse("https://support.google.com/nexus?p=contacts_restore");
        ThemeSettings themeSettings = new ThemeSettings();
        themeSettings.f31623a = 1;
        if (cgkf.m145859f()) {
            googleHelp = new GoogleHelp("contacts_restore");
            googleHelp.f78774q = parse;
            wwu wwu = new wwu(contactsRestoreDialogChimeraActivity);
            wwu.f51499d = "com.google.android.gms.contacts_restore.USER_INITIATED_FEEDBACK_REPORT";
            wwu.mo29497b(wwr.m42392a(contactsRestoreDialogChimeraActivity.getContainerActivity()));
            googleHelp.mo43196a(wwu.mo29490a(), contactsRestoreDialogChimeraActivity.getCacheDir());
            googleHelp.f78776s = themeSettings;
        } else {
            googleHelp = new GoogleHelp("contacts_restore");
            googleHelp.f78774q = parse;
            googleHelp.f78776s = themeSettings;
        }
        new aarh(contactsRestoreDialogChimeraActivity).mo31646a(googleHelp.mo43194a());
    }
}
