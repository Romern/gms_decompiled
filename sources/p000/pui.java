package p000;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.images.WebImage;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: pui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pui {

    /* renamed from: a */
    private static final ptx f40259a = new ptx("MetadataUtils");

    /* renamed from: b */
    private static final String[] f40260b;

    /* renamed from: c */
    private static final String f40261c;

    static {
        String[] strArr = {"Z", "+hh", "+hhmm", "+hh:mm"};
        f40260b = strArr;
        String valueOf = String.valueOf(strArr[0]);
        f40261c = valueOf.length() == 0 ? new String("yyyyMMdd'T'HHmmss") : "yyyyMMdd'T'HHmmss".concat(valueOf);
    }

    /* renamed from: a */
    public static String m31375a(Calendar calendar) {
        if (calendar != null) {
            String str = f40261c;
            if (calendar.get(11) == 0 && calendar.get(12) == 0 && calendar.get(13) == 0) {
                str = "yyyyMMdd";
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
            simpleDateFormat.setTimeZone(calendar.getTimeZone());
            String format = simpleDateFormat.format(calendar.getTime());
            return format.endsWith("+0000") ? format.replace("+0000", f40260b[0]) : format;
        }
        f40259a.mo23670a("Calendar object cannot be null", new Object[0]);
        return null;
    }

    /* renamed from: b */
    private static String m31379b(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return str.substring(0, 8);
            } catch (IndexOutOfBoundsException e) {
                f40259a.mo23673b("Error extracting the date: %s", e.getMessage());
                return null;
            }
        } else {
            f40259a.mo23670a("Input string is empty or null", new Object[0]);
            return null;
        }
    }

    /* renamed from: c */
    private static String m31380c(String str) {
        if (TextUtils.isEmpty(str)) {
            f40259a.mo23670a("string is empty or null", new Object[0]);
            return null;
        }
        int indexOf = str.indexOf(84);
        int i = indexOf + 1;
        if (indexOf != 8) {
            f40259a.mo23670a("T delimeter is not found", new Object[0]);
            return null;
        }
        try {
            String substring = str.substring(i);
            if (substring.length() == 6) {
                return substring;
            }
            char charAt = substring.charAt(6);
            if (charAt == '+' || charAt == '-') {
                int length = substring.length();
                if (length == f40260b[1].length() + 6 || length == f40260b[2].length() + 6 || length == f40260b[3].length() + 6) {
                    return substring.replaceAll("([\\+\\-]\\d\\d):(\\d\\d)", "$1$2");
                }
            } else if (charAt == 'Z' && substring.length() == f40260b[0].length() + 6) {
                return String.valueOf(substring.substring(0, substring.length() - 1)).concat("+0000");
            } else {
                return null;
            }
            return null;
        } catch (IndexOutOfBoundsException e) {
            f40259a.mo23670a("Error extracting the time substring: %s", e.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public static Calendar m31376a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            f40259a.mo23670a("Input string is empty or null", new Object[0]);
            return null;
        }
        String b = m31379b(str);
        if (TextUtils.isEmpty(b)) {
            f40259a.mo23670a("Invalid date format", new Object[0]);
            return null;
        }
        String c = m31380c(str);
        if (!TextUtils.isEmpty(c)) {
            String valueOf = String.valueOf(b);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(c).length());
            sb.append(valueOf);
            sb.append("T");
            sb.append(c);
            b = sb.toString();
            str2 = c.length() != 6 ? f40261c : "yyyyMMdd'T'HHmmss";
        } else {
            str2 = "yyyyMMdd";
        }
        Calendar instance = GregorianCalendar.getInstance();
        try {
            instance.setTime(new SimpleDateFormat(str2).parse(b));
            return instance;
        } catch (ParseException e) {
            f40259a.mo23670a("Error parsing string: %s", e.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public static JSONArray m31377a(List list) {
        if (list != null) {
            JSONArray jSONArray = new JSONArray();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                WebImage webImage = (WebImage) list.get(i);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", webImage.f30201b.toString());
                    jSONObject.put("width", webImage.f30202c);
                    jSONObject.put("height", webImage.f30203d);
                } catch (JSONException e) {
                }
                jSONArray.put(jSONObject);
            }
            return jSONArray;
        }
        throw null;
    }

    /* renamed from: a */
    public static void m31378a(List list, JSONArray jSONArray) {
        try {
            list.clear();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                try {
                    Uri uri = null;
                    if (jSONObject.has("url")) {
                        try {
                            uri = Uri.parse(jSONObject.getString("url"));
                        } catch (JSONException e) {
                        }
                    }
                    list.add(new WebImage(uri, jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
                } catch (IllegalArgumentException e2) {
                }
            }
        } catch (JSONException e3) {
        }
    }
}
