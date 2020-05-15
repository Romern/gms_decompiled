package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;

/* renamed from: sau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sau {

    /* renamed from: a */
    private static final C1245ok f43971a = new C1245ok();

    /* renamed from: a */
    public static String m34803a(Context context) {
        String packageName = context.getPackageName();
        try {
            return svr.m36484b(context).mo26177b(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            String str = context.getApplicationInfo().name;
            return !TextUtils.isEmpty(str) ? str : packageName;
        }
    }

    /* renamed from: b */
    public static String m34807b(Context context) {
        return context.getResources().getString(C0126R.string.common_google_play_services_notification_channel_name);
    }

    /* renamed from: c */
    public static String m34809c(Context context, int i) {
        Resources resources = context.getResources();
        String a = m34803a(context);
        if (i == 1) {
            return resources.getString(C0126R.string.common_google_play_services_install_text, a);
        } else if (i == 2) {
            sre.m36090j(context);
            return resources.getString(C0126R.string.common_google_play_services_update_text, a);
        } else if (i == 3) {
            return resources.getString(C0126R.string.common_google_play_services_enable_text, a);
        } else if (i == 5) {
            return m34806a(context, "common_google_play_services_invalid_account_text", a);
        } else {
            if (i == 7) {
                return m34806a(context, "common_google_play_services_network_error_text", a);
            }
            if (i == 9) {
                return resources.getString(C0126R.string.common_google_play_services_unsupported_text, a);
            } else if (i == 20) {
                return m34806a(context, "common_google_play_services_restricted_profile_text", a);
            } else {
                switch (i) {
                    case 16:
                        return m34806a(context, "common_google_play_services_api_unavailable_text", a);
                    case 17:
                        return m34806a(context, "common_google_play_services_sign_in_failed_text", a);
                    case 18:
                        return resources.getString(C0126R.string.common_google_play_services_updating_text, a);
                    default:
                        return resources.getString(C0126R.string.common_google_play_services_unknown_issue, a);
                }
            }
        }
    }

    /* renamed from: d */
    public static String m34810d(Context context, int i) {
        if (i == 6 || i == 19) {
            return m34806a(context, "common_google_play_services_resolution_required_text", m34803a(context));
        }
        return m34809c(context, i);
    }

    /* renamed from: e */
    public static String m34811e(Context context, int i) {
        Resources resources = context.getResources();
        if (i == 1) {
            return resources.getString(C0126R.string.common_google_play_services_install_button);
        }
        if (i == 2) {
            return resources.getString(C0126R.string.common_google_play_services_update_button);
        }
        if (i != 3) {
            return resources.getString(17039370);
        }
        return resources.getString(C0126R.string.common_google_play_services_enable_button);
    }

    /* renamed from: b */
    public static String m34808b(Context context, int i) {
        String str;
        if (i == 6) {
            str = m34805a(context, "common_google_play_services_resolution_required_title");
        } else {
            str = m34804a(context, i);
        }
        return str == null ? context.getResources().getString(C0126R.string.common_google_play_services_notification_ticker) : str;
    }

    /* renamed from: a */
    public static String m34804a(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(C0126R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(C0126R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(C0126R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return m34805a(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m34805a(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                Log.e("GoogleApiAvailability", sb.toString());
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return m34805a(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m34805a(context, "common_google_play_services_restricted_profile_title");
        }
    }

    /* renamed from: a */
    private static String m34805a(Context context, String str) {
        synchronized (f43971a) {
            String str2 = (String) f43971a.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources b = rfx.m33538b(context);
            if (b == null) {
                return null;
            }
            int identifier = b.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                Log.w("GoogleApiAvailability", str.length() == 0 ? new String("Missing resource: ") : "Missing resource: ".concat(str));
                return null;
            }
            String string = b.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                Log.w("GoogleApiAvailability", str.length() == 0 ? new String("Got empty resource: ") : "Got empty resource: ".concat(str));
                return null;
            }
            f43971a.put(str, string);
            return string;
        }
    }

    /* renamed from: a */
    private static String m34806a(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String a = m34805a(context, str);
        if (a == null) {
            a = resources.getString(C0126R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, a, str2);
    }
}
