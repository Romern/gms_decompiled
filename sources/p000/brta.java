package p000;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: brta */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brta {

    /* renamed from: a */
    public final Bundle f143310a;

    public brta(Bundle bundle) {
        this.f143310a = new Bundle(bundle);
    }

    /* renamed from: e */
    public static String m114545e(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    /* renamed from: a */
    public final Bundle mo69843a() {
        Bundle bundle = new Bundle(this.f143310a);
        for (String str : this.f143310a.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    /* renamed from: b */
    public final String mo69846b(Resources resources, String str, String str2) {
        String a = mo69845a(str2);
        return TextUtils.isEmpty(a) ? mo69844a(resources, str, str2) : a;
    }

    /* renamed from: c */
    public final Integer mo69848c(String str) {
        String a = mo69845a(str);
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(a));
        } catch (NumberFormatException e) {
            String e2 = m114545e(str);
            StringBuilder sb = new StringBuilder(String.valueOf(e2).length() + 38 + String.valueOf(a).length());
            sb.append("Couldn't parse value of ");
            sb.append(e2);
            sb.append("(");
            sb.append(a);
            sb.append(") into an int");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    /* renamed from: d */
    public final JSONArray mo69849d(String str) {
        String a = mo69845a(str);
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        try {
            return new JSONArray(a);
        } catch (JSONException e) {
            String e2 = m114545e(str);
            StringBuilder sb = new StringBuilder(String.valueOf(e2).length() + 50 + String.valueOf(a).length());
            sb.append("Malformed JSON for key ");
            sb.append(e2);
            sb.append(": ");
            sb.append(a);
            sb.append(", falling back to default");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    /* renamed from: b */
    public final boolean mo69847b(String str) {
        String a = mo69845a(str);
        return "1".equals(a) || Boolean.parseBoolean(a);
    }

    /* renamed from: a */
    public final String mo69844a(Resources resources, String str, String str2) {
        String[] strArr;
        String a = mo69845a(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        int identifier = resources.getIdentifier(a, "string", str);
        if (identifier == 0) {
            String e = m114545e(str2.concat("_loc_key"));
            StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 49 + str2.length());
            sb.append(e);
            sb.append(" resource not found: ");
            sb.append(str2);
            sb.append(" Default value will be used.");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
        JSONArray d = mo69849d(str2.concat("_loc_args"));
        if (d != null) {
            int length = d.length();
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = d.optString(i);
            }
        } else {
            strArr = null;
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e2) {
            String e3 = m114545e(str2);
            String arrays = Arrays.toString(strArr);
            StringBuilder sb2 = new StringBuilder(String.valueOf(e3).length() + 58 + String.valueOf(arrays).length());
            sb2.append("Missing format argument for ");
            sb2.append(e3);
            sb2.append(": ");
            sb2.append(arrays);
            sb2.append(" Default value will be used.");
            Log.w("NotificationParams", sb2.toString(), e2);
            return null;
        }
    }

    /* renamed from: a */
    public final String mo69845a(String str) {
        String str2;
        Bundle bundle = this.f143310a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            if (str.startsWith("gcm.n.")) {
                str2 = str.replace("gcm.n.", "gcm.notification.");
            } else {
                str2 = str;
            }
            if (this.f143310a.containsKey(str2)) {
                str = str2;
            }
        }
        return bundle.getString(str);
    }
}
