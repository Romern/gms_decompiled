package com.google.android.gms.googlehelp.helpactivities;

import android.content.Context;
import android.database.Cursor;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ClickToCallChimeraActivity extends abbi implements abaf {

    /* renamed from: b */
    public EditText f78925b;

    /* renamed from: c */
    private bqgj f78926c;

    /* renamed from: d */
    private View f78927d;

    /* renamed from: e */
    private EditText f78928e;

    /* renamed from: f */
    private EditText f78929f;

    /* renamed from: g */
    private TextView f78930g;

    /* renamed from: h */
    private aasv f78931h;

    /* renamed from: i */
    private ProgressBar f78932i;

    /* renamed from: j */
    private MenuItem f78933j;

    /* renamed from: a */
    public static Bundle m66510a(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString("phone_number", str);
        bundle.putString("name", str2);
        bundle.putString("problem_description", str3);
        return bundle;
    }

    /* renamed from: b */
    private final void m66511b(String str, String str2, String str3) {
        mo43313a(true);
        HelpConfig helpConfig = this.f56986y;
        abcr abcr = this.f56987z;
        abah abah = new abah(this);
        abai abai = new abai(this, str, str2, str3);
        if (this.f78926c == null) {
            this.f78926c = snp.m35702a(9);
        }
        this.f78926c.execute(new aatl(this, helpConfig, abcr, str2, str, str3, abah, abai));
        abcx.m47469a(this, 57, bzps.C2C);
    }

    /* renamed from: i */
    public final aaxx mo18628i() {
        throw null;
    }

    /* renamed from: j */
    public final aatc mo18629j() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0166, code lost:
        if (r0 == null) goto L_0x017f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0169, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0179, code lost:
        if (r0 != null) goto L_0x0169;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0174  */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean a = aayi.m47267a();
        int i = C0126R.style.gh_DarkActivityStyle;
        if (a) {
            aayi.m47266a(this, this.f56986y, (int) C0126R.style.gh_LightActivityStyle, (int) C0126R.style.gh_DarkActivityStyle, (int) C0126R.style.gh_DayNightActivityStyle);
        } else {
            if (!aayi.m47269a(this.f56986y)) {
                i = C0126R.style.gh_LightActivityStyle;
            }
            setTheme(i);
        }
        aarq.m46801a(this, true);
        if (!aaya.m47228a(cefe.m136708b())) {
            aatj.m46985a(this);
        } else {
            setRequestedOrientation(1);
        }
        aazt.m47336a(this);
        String string = getString(C0126R.string.gh_c2c_form_title);
        setTitle(string);
        mo8628aW().mo15845a(string);
        if (aaya.m47229b(cein.f182721a.mo6606a().mo79170a())) {
            setContentView((int) C0126R.C0128layout.gh_click_to_call_activity_b141906466);
        } else {
            setContentView((int) C0126R.C0128layout.gh_click_to_call_activity);
        }
        this.f78927d = findViewById(C0126R.C0129id.gh_click_to_call_form);
        this.f78925b = (EditText) findViewById(C0126R.C0129id.gh_user_phone_number);
        this.f78928e = (EditText) findViewById(C0126R.C0129id.gh_user_name);
        this.f78929f = (EditText) findViewById(C0126R.C0129id.gh_problem_description);
        HelpConfig helpConfig = this.f56986y;
        ((TextView) findViewById(C0126R.C0129id.gh_c2c_account_email)).setText(helpConfig.f78829d.name);
        TextView textView = (TextView) findViewById(C0126R.C0129id.gh_application_info_and_privacy_policy);
        this.f78930g = textView;
        aatj.m46983a(textView, this, bzps.C2C);
        this.f78931h = new aasv(this, (Spinner) findViewById(C0126R.C0129id.gh_user_country_spinner), aasb.m46831a(this, helpConfig, "display_country", Locale.getDefault().getDisplayCountry()));
        EditText editText = this.f78925b;
        Context applicationContext = getApplicationContext();
        String str = "";
        String a2 = aasb.m46831a(applicationContext, helpConfig, "phone_number", str);
        if (TextUtils.isEmpty(a2) && aatw.m47003a(applicationContext).mo25481a("android.permission.READ_PHONE_STATE") == 0) {
            a2 = ((TelephonyManager) applicationContext.getSystemService("phone")).getLine1Number();
        }
        if (!PhoneNumberUtils.isGlobalPhoneNumber(PhoneNumberUtils.stripSeparators(a2))) {
            a2 = str;
        }
        editText.setText(a2);
        this.f78925b.addTextChangedListener(new PhoneNumberFormattingTextWatcher());
        EditText editText2 = this.f78928e;
        Context applicationContext2 = getApplicationContext();
        String a3 = aasb.m46831a(applicationContext2, helpConfig, "name", str);
        if (!TextUtils.isEmpty(a3)) {
            str = a3;
        } else if (aatw.m47003a(applicationContext2).mo25481a("android.permission.READ_CONTACTS") == 0) {
            Cursor cursor = null;
            try {
                cursor = applicationContext2.getContentResolver().query(Uri.withAppendedPath(ContactsContract.Profile.CONTENT_URI, "data"), aatw.f56574a, "mimetype = ?", aatw.f56575b, "is_primary DESC");
                try {
                    if (cursor.moveToNext()) {
                        str = cursor.getString(0);
                    }
                } catch (Exception e) {
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                    }
                    throw th;
                }
            } catch (Exception e2) {
            } catch (Throwable th2) {
                th = th2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }
        editText2.setText(str);
        this.f78932i = (ProgressBar) findViewById(C0126R.C0129id.gh_progress_help_spinner_fragment);
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0126R.C0130menu.gh_click_to_call_activity_actions, menu);
        MenuItem findItem = menu.findItem(C0126R.C0129id.gh_click_to_call_action_submit);
        this.f78933j = findItem;
        findItem.setIcon(aayh.m47232a(this, aayi.m47270b() ? aayi.m47263a(this, C0126R.attr.gh_primaryBlueColor) : C1133kh.m17843b(this, C0126R.color.google_blue600)));
        new aavd(Arrays.asList(this.f78928e, this.f78925b), this.f78933j).mo31820a();
        return super.onCreateOptionsMenu(menu);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        NetworkInfo c;
        if (menuItem.getItemId() != C0126R.C0129id.gh_click_to_call_action_submit) {
            return super.onOptionsItemSelected(menuItem);
        }
        String convertKeypadLettersToDigits = PhoneNumberUtils.convertKeypadLettersToDigits(this.f78925b.getText().toString());
        if (TextUtils.isEmpty(convertKeypadLettersToDigits) || PhoneNumberUtils.isEmergencyNumber(convertKeypadLettersToDigits) || !PhoneNumberUtils.isGlobalPhoneNumber(PhoneNumberUtils.stripSeparators(convertKeypadLettersToDigits))) {
            mo43312a(this.f78925b, C0126R.string.gh_c2c_invalid_phone_number_error);
        } else {
            String obj = this.f78928e.getText().toString();
            if (obj.length() < 2) {
                mo43312a(this.f78928e, C0126R.string.gh_c2c_empty_name_error);
            } else {
                String stripSeparators = PhoneNumberUtils.stripSeparators(convertKeypadLettersToDigits);
                if (stripSeparators.startsWith("+")) {
                    stripSeparators = stripSeparators.substring(1);
                }
                String trim = this.f78931h.mo31753a().getCountry().trim();
                C1245ok okVar = new C1245ok(ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR);
                okVar.put("AF", "93");
                okVar.put("AL", "355");
                okVar.put("DZ", "213");
                okVar.put("AD", "376");
                okVar.put("AO", "244");
                okVar.put("AQ", "672");
                okVar.put("AR", "54");
                okVar.put("AM", "374");
                okVar.put("AW", "297");
                okVar.put("AU", "61");
                okVar.put("AT", "43");
                okVar.put("AZ", "994");
                okVar.put("BH", "973");
                okVar.put("BD", "880");
                okVar.put("BY", "375");
                okVar.put("BE", "32");
                okVar.put("BZ", "501");
                okVar.put("BJ", "229");
                okVar.put("BT", "975");
                okVar.put("BO", "591");
                okVar.put("BA", "387");
                okVar.put("BW", "267");
                okVar.put("BR", "55");
                okVar.put("BN", "673");
                okVar.put("BG", "359");
                okVar.put("BF", "226");
                okVar.put("MM", "95");
                okVar.put("BI", "257");
                okVar.put("KH", "855");
                okVar.put("CM", "237");
                okVar.put("CA", "1");
                okVar.put("CV", "238");
                okVar.put("CF", "236");
                okVar.put("TD", "235");
                okVar.put("CL", "56");
                okVar.put("CN", "86");
                okVar.put("CX", "61");
                okVar.put("CC", "61");
                okVar.put("CO", "57");
                okVar.put("KM", "269");
                okVar.put("CG", "242");
                okVar.put("CD", "243");
                okVar.put("CK", "682");
                okVar.put("CR", "506");
                okVar.put("HR", "385");
                okVar.put("CY", "357");
                okVar.put("CZ", "420");
                okVar.put("DK", "45");
                okVar.put("DJ", "253");
                okVar.put("TL", "670");
                okVar.put("EC", "593");
                okVar.put("EG", "20");
                okVar.put("SV", "503");
                okVar.put("GQ", "240");
                okVar.put("ER", "291");
                okVar.put("EE", "372");
                okVar.put("ET", "251");
                okVar.put("FK", "500");
                okVar.put("FO", "298");
                okVar.put("FJ", "679");
                okVar.put("FI", "358");
                okVar.put("FR", "33");
                okVar.put("PF", "689");
                okVar.put("GA", "241");
                okVar.put("GM", "220");
                okVar.put("GE", "995");
                okVar.put("DE", "49");
                okVar.put("GH", "233");
                okVar.put("GI", "350");
                okVar.put("GR", "30");
                okVar.put("GL", "299");
                okVar.put("GT", "502");
                okVar.put("GN", "224");
                okVar.put("GW", "245");
                okVar.put("GY", "592");
                okVar.put("HT", "509");
                okVar.put("HN", "504");
                okVar.put("HK", "852");
                okVar.put("HU", "36");
                okVar.put("IN", "91");
                okVar.put("ID", "62");
                okVar.put("IQ", "964");
                okVar.put("IE", "353");
                okVar.put("IM", "44");
                okVar.put("IL", "972");
                okVar.put("IT", "39");
                okVar.put("CI", "225");
                okVar.put("JP", "81");
                okVar.put("JO", "962");
                okVar.put("KZ", "7");
                okVar.put("KE", "254");
                okVar.put("KI", "686");
                okVar.put("KW", "965");
                okVar.put("KG", "996");
                okVar.put("LA", "856");
                okVar.put("LV", "371");
                okVar.put("LB", "961");
                okVar.put("LS", "266");
                okVar.put("LR", "231");
                okVar.put("LY", "218");
                okVar.put("LI", "423");
                okVar.put("LT", "370");
                okVar.put("LU", "352");
                okVar.put("MO", "853");
                okVar.put("MK", "389");
                okVar.put("MG", "261");
                okVar.put("MW", "265");
                okVar.put("MY", "60");
                okVar.put("MV", "960");
                okVar.put("ML", "223");
                okVar.put("MT", "356");
                okVar.put("MH", "692");
                okVar.put("MR", "222");
                okVar.put("MU", "230");
                okVar.put("YT", "262");
                okVar.put("MX", "52");
                okVar.put("FM", "691");
                okVar.put("MD", "373");
                okVar.put("MC", "377");
                okVar.put("MN", "976");
                okVar.put("ME", "382");
                okVar.put("MA", "212");
                okVar.put("MZ", "258");
                okVar.put("NA", "264");
                okVar.put("NR", "674");
                okVar.put("NP", "977");
                okVar.put("NL", "31");
                okVar.put("AN", "599");
                okVar.put("NC", "687");
                okVar.put("NZ", "64");
                okVar.put("NI", "505");
                okVar.put("NE", "227");
                okVar.put("NG", "234");
                okVar.put("NU", "683");
                okVar.put("NO", "47");
                okVar.put("OM", "968");
                okVar.put("PK", "92");
                okVar.put("PW", "680");
                okVar.put("PA", "507");
                okVar.put("PG", "675");
                okVar.put("PY", "595");
                okVar.put("PE", "51");
                okVar.put("PH", "63");
                okVar.put("PN", "870");
                okVar.put("PL", "48");
                okVar.put("PT", "351");
                okVar.put("PR", "1");
                okVar.put("QA", "974");
                okVar.put("RO", "40");
                okVar.put("RU", "7");
                okVar.put("RW", "250");
                okVar.put("BL", "590");
                okVar.put("WS", "685");
                okVar.put("SM", "378");
                okVar.put("ST", "239");
                okVar.put("SA", "966");
                okVar.put("SN", "221");
                okVar.put("RS", "381");
                okVar.put("SC", "248");
                okVar.put("SL", "232");
                okVar.put("SG", "65");
                okVar.put("SK", "421");
                okVar.put("SI", "386");
                okVar.put("SB", "677");
                okVar.put("SO", "252");
                okVar.put("ZA", "27");
                okVar.put("KR", "82");
                okVar.put("ES", "34");
                okVar.put("LK", "94");
                okVar.put("SH", "290");
                okVar.put("PM", "508");
                okVar.put("SR", "597");
                okVar.put("SZ", "268");
                okVar.put("SE", "46");
                okVar.put("CH", "41");
                okVar.put("TW", "886");
                okVar.put("TJ", "992");
                okVar.put("TZ", "255");
                okVar.put("TH", "66");
                okVar.put("TG", "228");
                okVar.put("TK", "690");
                okVar.put("TO", "676");
                okVar.put("TN", "216");
                okVar.put("TR", "90");
                okVar.put("TM", "993");
                okVar.put("TV", "688");
                okVar.put("AE", "971");
                okVar.put("UG", "256");
                okVar.put("GB", "44");
                okVar.put("UA", "380");
                okVar.put("UY", "598");
                okVar.put("US", "1");
                okVar.put("UZ", "998");
                okVar.put("VU", "678");
                okVar.put("VA", "39");
                okVar.put("VE", "58");
                okVar.put("VN", "84");
                okVar.put("WF", "681");
                okVar.put("YE", "967");
                okVar.put("ZM", "260");
                okVar.put("ZW", "263");
                String str = (String) okVar.get(trim);
                if (str != null && !stripSeparators.startsWith(str)) {
                    String valueOf = String.valueOf(stripSeparators);
                    stripSeparators = valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
                }
                String valueOf2 = String.valueOf(stripSeparators);
                String str2 = valueOf2.length() == 0 ? new String("+") : "+".concat(valueOf2);
                String displayCountry = this.f78931h.mo31753a().getDisplayCountry();
                HelpConfig helpConfig = this.f56986y;
                String[] strArr = aatw.f56574a;
                aasa a = new aasc(this, helpConfig).mo31695a();
                a.mo31689a("name", obj);
                a.mo31689a("display_country", displayCountry);
                a.mo31689a("phone_number", convertKeypadLettersToDigits);
                a.mo31685a();
                String obj2 = this.f78929f.getText().toString();
                int i = ssk.f45087a;
                TelephonyManager telephonyManager = (TelephonyManager) getSystemService("phone");
                if (telephonyManager == null || !telephonyManager.isNetworkRoaming() || (c = ssk.m36239c(this)) == null || !c.isRoaming()) {
                    m66511b(str2, obj, obj2);
                } else {
                    abae a2 = abag.m47347a();
                    a2.f56925a = C0126R.string.gh_c2c_roaming_title;
                    a2.f56926b = C0126R.string.gh_c2c_roaming_message;
                    a2.f56927c = C0126R.string.gh_c2c_action_text;
                    a2.f56928d = 17039360;
                    a2.f56929e = m66510a(str2, obj, obj2);
                    a2.mo31968a().show(getSupportFragmentManager(), "roaming_handler_dialog");
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo31969a(Bundle bundle) {
        String string = bundle.getString("phone_number");
        if (!TextUtils.isEmpty(string)) {
            m66511b(string, bundle.getString("name"), bundle.getString("problem_description"));
        }
    }

    /* renamed from: a */
    public final void mo43312a(EditText editText, int i) {
        if (editText != null && editText.requestFocus()) {
            editText.setError(getString(i));
            getWindow().setSoftInputMode(4);
            return;
        }
        Toast.makeText(this, i, 1).show();
    }

    /* renamed from: a */
    public final void mo43313a(boolean z) {
        if (!z) {
            this.f78927d.setVisibility(0);
            this.f78930g.setVisibility(0);
            this.f78932i.setVisibility(8);
        } else {
            this.f78927d.setVisibility(8);
            this.f78930g.setVisibility(8);
            this.f78932i.setVisibility(0);
        }
        this.f78933j.setEnabled(!z);
    }
}
