package p000;

import android.accounts.Account;
import android.net.Uri;
import android.os.Build;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import com.google.android.gms.nearby.sharing.Contact;
import com.google.android.gms.nearby.sharing.ContactInfo;
import java.util.Locale;

/* renamed from: akcm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akcm {

    /* renamed from: a */
    public final akhb f71602a;

    /* renamed from: b */
    public final akcv f71603b;

    /* renamed from: c */
    public final akbu f71604c;

    public akcm(akhb akhb, akcv akcv, akbu akbu) {
        this.f71602a = akhb;
        this.f71603b = akcv;
        this.f71604c = akbu;
    }

    /* renamed from: a */
    public static Contact m59393a(ajif ajif) {
        ContactInfo contactInfo;
        ajid ajid = new ajid();
        ajii ajii = ajif.f70697b;
        if (ajii == null) {
            ajii = ajii.f70710d;
        }
        ajid.f70686a = Long.valueOf(ajii.f70713b);
        ajii ajii2 = ajif.f70697b;
        if (ajii2 == null) {
            ajii2 = ajii.f70710d;
        }
        ajid.f70687b = ajii2.f70714c;
        ajid.f70688c = ajif.f70698c;
        String str = null;
        ajid.f70689d = !ajif.f70699d.isEmpty() ? Uri.parse(ajif.f70699d) : null;
        ajid.f70690e = Boolean.valueOf(ajif.f70702g);
        boolean z = false;
        if (ajif.f70701f.size() == 0 && ajif.f70700e.size() == 0) {
            contactInfo = new ajim().mo38682a();
        } else {
            if (ajif.f70701f.size() > 0) {
                str = (String) ajif.f70701f.get(0);
            }
            if (str == null) {
                ajim ajim = new ajim();
                ajim.f70716a = 2;
                ajim.f70717b = (String) ajif.f70700e.get(0);
                contactInfo = ajim.mo38682a();
            } else {
                int i = Build.VERSION.SDK_INT;
                String formatNumber = PhoneNumberUtils.formatNumber(str, Locale.getDefault().getCountry());
                if (formatNumber != null) {
                    str = formatNumber;
                }
                ajim ajim2 = new ajim();
                ajim2.f70716a = 1;
                ajim2.f70717b = str;
                contactInfo = ajim2.mo38682a();
            }
        }
        ajid.f70691f = contactInfo;
        ajid.f70692g = Boolean.valueOf(ajif.f70703h);
        if (ajif.f70704i || (cfov.m142033I() && ajif.f70706k)) {
            z = true;
        }
        ajid.f70693h = Boolean.valueOf(z);
        sdo.m34966a(ajid.f70686a, "Contact's id must not be null.");
        sdo.m34975b(!TextUtils.isEmpty(ajid.f70687b), "Contact's lookupKey must not be null or empty.");
        sdo.m34975b(!TextUtils.isEmpty(ajid.f70688c), "Contact's displayName must not be null or empty.");
        sdo.m34966a(ajid.f70691f, "Contact's contactInfo must not be null or empty.");
        sdo.m34966a(ajid.f70690e, "Contact's isSelected must not be null.");
        sdo.m34966a(ajid.f70692g, "Contact's isReachable must not be null.");
        sdo.m34966a(ajid.f70693h, "Contact's isRecommended must not be null.");
        return new Contact(ajid.f70686a.longValue(), ajid.f70687b, ajid.f70688c, ajid.f70689d, ajid.f70690e.booleanValue(), ajid.f70691f, ajid.f70692g.booleanValue(), ajid.f70693h.booleanValue());
    }

    /* renamed from: b */
    public final int mo39219b(Contact contact) {
        Account b = this.f71604c.mo39171b();
        if (b == null) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68432a("akcm", "b", 120, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68415a("Unable to unmark contact %s: account is null.", contact.f80844a);
            return 35505;
        }
        akhb akhb = this.f71602a;
        bxvd da = ajii.f70710d.mo74144da();
        long j = contact.f80844a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ajii ajii = (ajii) da.f164949b;
        int i = ajii.f70712a | 1;
        ajii.f70712a = i;
        ajii.f70713b = j;
        String str = contact.f80845b;
        str.getClass();
        ajii.f70712a = i | 2;
        ajii.f70714c = str;
        int b2 = akhb.mo39435b(b, (ajii) da.mo74062i());
        if (b2 == 0) {
            if (contact.f80850g) {
                this.f71603b.mo39231b();
            }
            this.f71603b.mo39233c();
        }
        return b2;
    }

    /* renamed from: a */
    public final int mo39217a(Contact contact) {
        Account b = this.f71604c.mo39171b();
        if (b == null) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68432a("akcm", "a", 100, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68415a("Unable to mark contact %s: account is null.", contact.f80844a);
            return 35505;
        }
        akhb akhb = this.f71602a;
        bxvd da = ajii.f70710d.mo74144da();
        long j = contact.f80844a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ajii ajii = (ajii) da.f164949b;
        int i = ajii.f70712a | 1;
        ajii.f70712a = i;
        ajii.f70713b = j;
        String str = contact.f80845b;
        str.getClass();
        ajii.f70712a = i | 2;
        ajii.f70714c = str;
        int a = akhb.mo39431a(b, (ajii) da.mo74062i());
        if (a != 0) {
            return a;
        }
        this.f71603b.mo39233c();
        return 0;
    }

    /* renamed from: a */
    public final void mo39218a() {
        this.f71602a.mo39433a();
        this.f71603b.mo39236f().edit().clear().apply();
    }
}
