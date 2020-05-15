package p000;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: teb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class teb {

    /* renamed from: a */
    public static final Logger f45717a = tea.m36798a("phone_formatting_util");

    /* renamed from: b */
    public final beao f45718b;

    /* renamed from: c */
    private final TelephonyManager f45719c;

    /* renamed from: d */
    private final tds f45720d;

    public teb(TelephonyManager telephonyManager, beao beao, tds tds) {
        this.f45719c = telephonyManager;
        this.f45718b = beao;
        this.f45720d = tds;
    }

    /* renamed from: a */
    static String m36799a(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            str2 = str.toUpperCase(Locale.ENGLISH);
        } else {
            str2 = null;
        }
        return str2 == null ? m36801b() : str2;
    }

    /* renamed from: b */
    private static String m36801b() {
        String country = Locale.getDefault().getCountry();
        if (!TextUtils.isEmpty(country)) {
            return country.toUpperCase(Locale.ENGLISH);
        }
        return null;
    }

    /* renamed from: a */
    public static teb m36800a(Context context) {
        return new teb((TelephonyManager) context.getSystemService("phone"), beao.m91670a(), tds.m36774a(context));
    }

    /* renamed from: a */
    public final String mo26416a() {
        String str;
        String simCountryIso = this.f45719c.getSimCountryIso();
        if (!TextUtils.isEmpty(simCountryIso)) {
            str = simCountryIso.toUpperCase(Locale.ENGLISH);
        } else {
            str = null;
        }
        return str == null ? m36801b() : str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo26417a(tdx tdx, String str, String str2) {
        beat beat;
        if (!TextUtils.isEmpty(str)) {
            try {
                beat = this.f45718b.mo58483a(str, str2);
                if (!this.f45718b.mo58492b(beat)) {
                    this.f45720d.mo26408a(tdx, 16, 25, str);
                    f45717a.mo25412b("getParsedPhoneNumber(): %s is not a valid phone number for country: %s", str, str2);
                    beat = null;
                }
            } catch (bean e) {
                this.f45720d.mo26410a(tdx, 16, e);
                f45717a.mo25417e("Couldn't parse number", e, new Object[0]);
                beat = null;
            } catch (IllegalStateException e2) {
                this.f45720d.mo26410a(tdx, 16, e2);
                f45717a.mo25418e("Failed to parse phone number.", new Object[0]);
                beat = null;
            }
            if (beat != null) {
                return this.f45718b.mo58486a(beat, 1);
            }
        }
        return null;
    }
}
