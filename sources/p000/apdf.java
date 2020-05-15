package p000;

import android.accounts.Account;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.romanesco.restoresettings.ContactsRestoreSettingsChimeraActivity;

/* renamed from: apdf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class apdf extends acm implements View.OnClickListener {

    /* renamed from: s */
    final TextView f84159s;

    /* renamed from: t */
    final TextView f84160t;

    /* renamed from: u */
    final apdh f84161u;

    public apdf(apdh apdh, View view) {
        super(view);
        this.f84161u = apdh;
        this.f84159s = (TextView) view.findViewById(16908310);
        this.f84160t = (TextView) view.findViewById(16908304);
        view.setFocusable(true);
        view.setOnClickListener(this);
        View findViewById = view.findViewById(C0126R.C0129id.icon_frame);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        View findViewById2 = view.findViewById(16908294);
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        View findViewById3 = view.findViewById(16908312);
        if (findViewById3 != null) {
            findViewById3.setVisibility(8);
        }
    }

    public void onClick(View view) {
        int d = mo323d();
        if (d != -1 && d != 2) {
            if (d == 4 && this.f84161u.f84166f.isEmpty()) {
                return;
            }
            if (d != 0) {
                apej apej = (apej) this.f84161u.f84166f.get(d - 4);
                if (!apej.mo47137a() || !cgkf.m145856c()) {
                    apdh apdh = this.f84161u;
                    apdh.f84163a.mo58845a(apdh.f84164d, apej);
                    return;
                }
                this.f84161u.f84163a.f107295g = apej.f84240l.serializeToBytes();
                apdh apdh2 = this.f84161u;
                if (apdh2.f84164d.equals(apdh2.f84165e)) {
                    apdh apdh3 = this.f84161u;
                    ContactsRestoreSettingsChimeraActivity contactsRestoreSettingsChimeraActivity = apdh3.f84163a;
                    String str = apdh3.f84164d;
                    if (apej.m70093a(apej.f84240l)) {
                        Account account = new Account(str, "com.google");
                        byte[] k = apej.f84240l.serializeToBytes();
                        if (k != null) {
                            contactsRestoreSettingsChimeraActivity.startActivityForResult(new Intent().setClassName(mpv.m25497a(contactsRestoreSettingsChimeraActivity), "com.google.android.apps.pixelmigrate.cloudrestore.component.KeyRecoveryLockScreenEntryActivity").putExtra("KeyRecoveryLockScreenEntryActivity.account", account).putExtra("KeyRecoveryLockScreenEntryActivity.device", k), 4);
                            return;
                        }
                        throw new IllegalArgumentException("Required arguments cannot be null.");
                    }
                    contactsRestoreSettingsChimeraActivity.mo58848a(true);
                    contactsRestoreSettingsChimeraActivity.mo58847a(ltu.m24388a(contactsRestoreSettingsChimeraActivity), aoxb.m69771a(contactsRestoreSettingsChimeraActivity), contactsRestoreSettingsChimeraActivity.f107291c.f84164d);
                    return;
                }
                apdh apdh4 = this.f84161u;
                ContactsRestoreSettingsChimeraActivity contactsRestoreSettingsChimeraActivity2 = apdh4.f84163a;
                String str2 = apdh4.f84164d;
                apck apck = new apck();
                apck.f84129a = str2;
                apck.show(contactsRestoreSettingsChimeraActivity2.getSupportFragmentManager(), apck.class.getSimpleName());
                return;
            }
            apeh apeh = this.f84161u.f84163a.f107290b;
            String str3 = apeh.f84212b.f84187b;
            Account account2 = null;
            if (str3 == null) {
                apeh.f84211a.mo58843a((Account) null);
                return;
            }
            Account[] a = aoxs.m69789a(apeh.f84211a);
            int length = a.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Account account3 = a[i];
                if (TextUtils.equals(str3, account3.name)) {
                    account2 = account3;
                    break;
                }
                i++;
            }
            apeh.f84211a.mo58843a(account2);
            if (account2 != null && !account2.name.equals(apeh.f84213d.f84135e)) {
                apeh.f84213d.mo47111b();
                apeh.f84213d.f84135e = account2.name;
            }
        }
    }
}
