package p000;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.romanesco.restoresettings.ContactsRestoreSettingsChimeraActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: apdh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apdh extends abh {

    /* renamed from: a */
    public final ContactsRestoreSettingsChimeraActivity f84163a;

    /* renamed from: d */
    public String f84164d;

    /* renamed from: e */
    public String f84165e;

    /* renamed from: f */
    public final List f84166f = new ArrayList();

    /* renamed from: g */
    public boolean f84167g;

    public apdh(ContactsRestoreSettingsChimeraActivity contactsRestoreSettingsChimeraActivity) {
        aoyh.m69805a("CRSAdapter");
        this.f84163a = contactsRestoreSettingsChimeraActivity;
    }

    /* renamed from: a */
    public final int mo161a() {
        if (TextUtils.isEmpty(this.f84164d)) {
            return 1;
        }
        if (!this.f84166f.isEmpty()) {
            return this.f84166f.size() + 4;
        }
        return 5;
    }

    /* renamed from: a */
    public final int mo162a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 4;
        }
        if (i == 2) {
            return 5;
        }
        if (i != 3) {
            return (i != 4 || !this.f84166f.isEmpty()) ? 0 : 3;
        }
        return 2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final acm mo163a(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 2 || i == 4) {
            return new apdg(from.inflate((int) C0126R.C0128layout.romanesco_contacts_restore_settings_text, viewGroup, false));
        }
        View inflate = from.inflate((int) C0126R.C0128layout.common_settings_item, viewGroup, false);
        if (i == 3 || i == 5) {
            return new apde(this, inflate);
        }
        apdf apdf = new apdf(this, inflate);
        if (i == 1 && (viewGroup2 = (ViewGroup) inflate.findViewById(16908312)) != null) {
            viewGroup2.addView(from.inflate((int) C0126R.C0128layout.romanesco_account_selection_dropdown, viewGroup2, false));
            viewGroup2.setVisibility(0);
        }
        return apdf;
    }

    /* renamed from: a */
    public final void mo168a(acm acm, int i) {
        String str;
        Long l;
        if (i == 0) {
            apdf apdf = (apdf) acm;
            apdf.f84159s.setText((int) C0126R.string.romanesco_from_account);
            if (TextUtils.isEmpty(this.f84164d)) {
                apdf.f84160t.setText((int) C0126R.string.romanesco_no_account);
            } else {
                apdf.f84160t.setText(this.f84164d);
            }
        } else if (i == 1) {
            ((apdg) acm).f84162s.setText((int) C0126R.string.romanesco_google_contacts_settings_title);
        } else if (i == 2) {
            ((apde) acm).f84160t.setText((int) C0126R.string.romanesco_google_contacts_settings_summary);
        } else if (i == 3) {
            ((apdg) acm).f84162s.setText((int) C0126R.string.romanesco_title_has_backup);
        } else if (i == 4 && this.f84166f.isEmpty()) {
            apde apde = (apde) acm;
            if (this.f84167g || TextUtils.isEmpty(this.f84164d)) {
                apde.f84160t.setText("");
            } else {
                apde.f84160t.setText((int) C0126R.string.romanesco_contacts_device_section_title_no_backup);
            }
        } else {
            apdf apdf2 = (apdf) acm;
            apej apej = (apej) this.f84166f.get(i - 4);
            apdf2.f84159s.setText(apej.f84239k);
            int i2 = apej.f84232d;
            if (!cgkf.m145856c() || !apej.mo47137a()) {
                Resources resources = this.f84163a.getResources();
                Integer valueOf = Integer.valueOf(i2);
                str = resources.getString(C0126R.string.romanesco_contacts_count, valueOf, valueOf);
            } else if (apej.mo47138b()) {
                str = this.f84163a.getResources().getString(C0126R.string.romanesco_encrypted_gms_contacts_description);
            } else {
                str = this.f84163a.getResources().getString(C0126R.string.romanesco_gms_contacts_description);
            }
            if (apej.mo47137a() || cgkf.m145858e()) {
                String str2 = this.f84164d;
                String a = apel.m70098a(apej);
                ContactsRestoreSettingsChimeraActivity contactsRestoreSettingsChimeraActivity = this.f84163a;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 14 + String.valueOf(a).length());
                sb.append("restore_time__");
                sb.append(str2);
                sb.append(a);
                l = Long.valueOf(apel.m70102b(contactsRestoreSettingsChimeraActivity.getApplicationContext()).getLong(sb.toString(), 0));
            } else {
                l = Long.valueOf(apej.f84241m);
            }
            if (l.longValue() > 0) {
                String b = apel.m70103b(this.f84163a, l.longValue());
                String valueOf2 = String.valueOf(str);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 1 + String.valueOf(b).length());
                sb2.append(valueOf2);
                sb2.append("\n");
                sb2.append(b);
                str = sb2.toString();
            } else {
                long j = apej.f84231c;
                if (j > 0) {
                    String a2 = apel.m70097a(this.f84163a, j);
                    String valueOf3 = String.valueOf(str);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 1 + String.valueOf(a2).length());
                    sb3.append(valueOf3);
                    sb3.append("\n");
                    sb3.append(a2);
                    str = sb3.toString();
                }
            }
            apdf2.f84160t.setText(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo47122a(String str) {
        TextUtils.isEmpty(str);
        this.f84165e = str;
    }
}
