package com.google.android.gms.carsetup;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CarErrorDisplayActivityImpl extends Activity {

    /* renamed from: a */
    private static final bnsn f29538a = odk.m28481a("CAR.SETUP.ERROR");

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, ?[OBJECT, ARRAY], int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0146  */
    /* renamed from: a */
    private final void m22106a(bpdn bpdn, int i, String str) {
        String str2;
        bpdn bpdn2 = bpdn;
        View inflate = getLayoutInflater().inflate((int) C0126R.C0128layout.car_frx_error, (ViewGroup) null, false);
        owl.m29905a(getLayoutInflater(), (ViewGroup) inflate);
        setContentView(inflate);
        TextView textView = (TextView) findViewById(C0126R.C0129id.body);
        Button button = (Button) findViewById(C0126R.C0129id.right_button);
        ((ImageView) findViewById(C0126R.C0129id.illustration)).setImageResource(C0126R.C0127drawable.car_error_illustration);
        ((TextView) findViewById(C0126R.C0129id.title)).setText(getText(C0126R.string.car_error_title));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        bpdn bpdn3 = bpdn.UNKNOWN_CODE;
        String str3 = "";
        switch (bpdn.ordinal()) {
            case 0:
            case 9:
            case 10:
            case 11:
            case 12:
            case 17:
            case 18:
            case 20:
                str3 = i != 2 ? getResources().getString(C0126R.string.car_simple_fallback_message) : getResources().getString(C0126R.string.car_fallback_message);
                str2 = str3;
                break;
            case 1:
            case 2:
                str3 = getResources().getString(C0126R.string.car_incompatible_software);
                str2 = str3;
                break;
            case 3:
            case 4:
            case 5:
                bnsi b = f29538a.mo68387b();
                b.mo68432a("com.google.android.gms.carsetup.CarErrorDisplayActivityImpl", "a", 111, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68409a("Error not filtered: %s", bpdn2.f136282v);
                str3 = i != 2 ? getResources().getString(C0126R.string.car_simple_fallback_message) : getResources().getString(C0126R.string.car_fallback_message);
                str2 = str3;
                break;
            case 6:
                str3 = getResources().getString(C0126R.string.car_out_of_date_hu);
                str2 = getResources().getString(C0126R.string.car_solution_contact_manufacturer);
                break;
            case 7:
                str3 = getResources().getString(C0126R.string.car_auth_failed_message);
                str2 = getResources().getString(C0126R.string.car_solution_contact_manufacturer);
                break;
            case 8:
            case 14:
                str3 = getResources().getString(C0126R.string.car_auth_failed_message);
                str2 = getResources().getString(C0126R.string.car_solution_check_time_update_gcore, getResources().getString(C0126R.string.common_app_name));
                break;
            case 13:
                str3 = getResources().getString(C0126R.string.car_auth_failed_message);
                str2 = getResources().getString(C0126R.string.car_solution_check_time);
                break;
            case 15:
                str3 = getResources().getString(C0126R.string.car_usb_connection_error_message);
                str2 = getResources().getString(C0126R.string.car_usb_connection_cable_check, owl.m29904a(this, "answer/6348190#usb"));
                break;
            case 16:
                str3 = getResources().getString(C0126R.string.car_fallback_message);
                str2 = str3;
                break;
            case 19:
                str3 = getString(C0126R.string.usb_charge_only);
                str2 = getString(C0126R.string.car_startup_charge_only_detected);
                break;
            default:
                str2 = str3;
                break;
        }
        textView.setText(Html.fromHtml(getResources().getString(C0126R.string.car_error_message_solution, Integer.valueOf(bpdn2.f136282v), str3, bmxx.m108578b(str), str2)), TextView.BufferType.SPANNABLE);
        button.setVisibility(0);
        button.setText(getText(C0126R.string.car_setup_exit));
        button.setOnClickListener(new C1584org(this));
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, ?[OBJECT, ARRAY], int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0176  */
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setTheme(C0126R.style.CarFrx);
        bpdn a = bpdn.m111806a(getIntent().getIntExtra("error_code", 0));
        int intExtra = getIntent().getIntExtra("connection_type", 0);
        String stringExtra = getIntent().getStringExtra("error_details");
        if (a != null && a != bpdn.UNKNOWN_CODE) {
            View inflate = getLayoutInflater().inflate((int) C0126R.C0128layout.car_frx_error, (ViewGroup) null, false);
            owl.m29905a(getLayoutInflater(), (ViewGroup) inflate);
            setContentView(inflate);
            TextView textView = (TextView) findViewById(C0126R.C0129id.body);
            Button button = (Button) findViewById(C0126R.C0129id.right_button);
            ((ImageView) findViewById(C0126R.C0129id.illustration)).setImageResource(C0126R.C0127drawable.car_error_illustration);
            ((TextView) findViewById(C0126R.C0129id.title)).setText(getText(C0126R.string.car_error_title));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            String str2 = "";
            switch (a.ordinal()) {
                case 0:
                case 9:
                case 10:
                case 11:
                case 12:
                case 17:
                case 18:
                case 20:
                    str2 = intExtra != 2 ? getResources().getString(C0126R.string.car_simple_fallback_message) : getResources().getString(C0126R.string.car_fallback_message);
                    str = str2;
                    break;
                case 1:
                case 2:
                    str2 = getResources().getString(C0126R.string.car_incompatible_software);
                    str = str2;
                    break;
                case 3:
                case 4:
                case 5:
                    bnsi b = f29538a.mo68387b();
                    b.mo68432a("com.google.android.gms.carsetup.CarErrorDisplayActivityImpl", "a", 111, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b.mo68409a("Error not filtered: %s", a.f136282v);
                    str2 = intExtra != 2 ? getResources().getString(C0126R.string.car_simple_fallback_message) : getResources().getString(C0126R.string.car_fallback_message);
                    str = str2;
                    break;
                case 6:
                    str2 = getResources().getString(C0126R.string.car_out_of_date_hu);
                    str = getResources().getString(C0126R.string.car_solution_contact_manufacturer);
                    break;
                case 7:
                    str2 = getResources().getString(C0126R.string.car_auth_failed_message);
                    str = getResources().getString(C0126R.string.car_solution_contact_manufacturer);
                    break;
                case 8:
                case 14:
                    str2 = getResources().getString(C0126R.string.car_auth_failed_message);
                    str = getResources().getString(C0126R.string.car_solution_check_time_update_gcore, getResources().getString(C0126R.string.common_app_name));
                    break;
                case 13:
                    str2 = getResources().getString(C0126R.string.car_auth_failed_message);
                    str = getResources().getString(C0126R.string.car_solution_check_time);
                    break;
                case 15:
                    str2 = getResources().getString(C0126R.string.car_usb_connection_error_message);
                    str = getResources().getString(C0126R.string.car_usb_connection_cable_check, owl.m29904a(this, "answer/6348190#usb"));
                    break;
                case 16:
                    str2 = getResources().getString(C0126R.string.car_fallback_message);
                    str = str2;
                    break;
                case 19:
                    str2 = getString(C0126R.string.usb_charge_only);
                    str = getString(C0126R.string.car_startup_charge_only_detected);
                    break;
                default:
                    str = str2;
                    break;
            }
            textView.setText(Html.fromHtml(getResources().getString(C0126R.string.car_error_message_solution, Integer.valueOf(a.f136282v), str2, bmxx.m108578b(stringExtra), str)), TextView.BufferType.SPANNABLE);
            button.setVisibility(0);
            button.setText(getText(C0126R.string.car_setup_exit));
            button.setOnClickListener(new C1584org(this));
        } else if (!isFinishing()) {
            finish();
        }
    }
}
