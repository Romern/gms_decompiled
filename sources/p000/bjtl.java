package p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.FelicaException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.UnknownFormatConversionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: bjtl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjtl {

    /* renamed from: a */
    public static final SparseArray f123281a;

    /* renamed from: b */
    public static final Pattern f123282b = Pattern.compile("[_-]");

    /* renamed from: c */
    public static final bmbm[] f123283c = {bmbm.COUNTRY, bmbm.RECIPIENT, bmbm.ADDRESS_LINE_1, bmbm.ADDRESS_LINE_2, bmbm.LOCALITY, bmbm.ADMIN_AREA, bmbm.POSTAL_CODE, bmbm.PHONE_NUMBER, bmbm.SORTING_CODE, bmbm.DEPENDENT_LOCALITY, bmbm.ORGANIZATION};

    /* renamed from: d */
    private static final Pattern f123284d = Pattern.compile("/");

    /* renamed from: e */
    private static final Pattern f123285e = Pattern.compile("--");

    /* renamed from: f */
    private static final char[] f123286f = bjtf.m104554a();

    /* renamed from: g */
    private static final Pattern f123287g = Pattern.compile("(\\\\d|\\d|[^\\^\\w])");

    /* renamed from: h */
    private static final Pattern f123288h = Pattern.compile("^[\\w \\-]+$");

    static {
        SparseArray sparseArray = new SparseArray(10);
        f123281a = sparseArray;
        sparseArray.put(82, bmbm.COUNTRY);
        f123281a.put(78, bmbm.RECIPIENT);
        f123281a.put(49, bmbm.ADDRESS_LINE_1);
        f123281a.put(50, bmbm.ADDRESS_LINE_2);
        f123281a.put(67, bmbm.LOCALITY);
        f123281a.put(83, bmbm.ADMIN_AREA);
        f123281a.put(90, bmbm.POSTAL_CODE);
        f123281a.put(88, bmbm.SORTING_CODE);
        f123281a.put(68, bmbm.DEPENDENT_LOCALITY);
        f123281a.put(79, bmbm.ORGANIZATION);
    }

    /* renamed from: a */
    public static int m104562a(char c) {
        if (c == 'A') {
            return C0126R.C0129id.address_field_address_line_1;
        }
        if (c == 'X') {
            return C0126R.C0129id.address_field_sorting_code;
        }
        if (c == 'Z') {
            return C0126R.C0129id.address_field_postal_code;
        }
        if (c == 'C') {
            return C0126R.C0129id.address_field_locality;
        }
        if (c == 'D') {
            return C0126R.C0129id.address_field_dependent_locality;
        }
        if (c == 'N') {
            return C0126R.C0129id.address_field_recipient;
        }
        if (c == 'O') {
            return C0126R.C0129id.address_field_organization;
        }
        if (c == 'R') {
            return C0126R.C0129id.address_field_country;
        }
        if (c == 'S') {
            return C0126R.C0129id.address_field_admin_area;
        }
        switch (c) {
            case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                return C0126R.C0129id.address_field_address_line_1;
            case '2':
                return C0126R.C0129id.address_field_address_line_2;
            case '3':
                return C0126R.C0129id.address_field_address_line_3;
            default:
                return 0;
        }
    }

    /* renamed from: b */
    public static String m104573b(int i) {
        return m104578c(bjtv.m104615a(i));
    }

    /* renamed from: c */
    public static String m104578c(String str) {
        Locale locale = Locale.getDefault();
        return new Locale(locale.getLanguage(), str, locale.getVariant()).getDisplayCountry();
    }

    /* renamed from: d */
    public static boolean m104581d(JSONObject jSONObject) {
        if (jSONObject != null) {
            String a = m104566a(jSONObject, "zip");
            if (TextUtils.isEmpty(a) || f123287g.matcher(a).replaceAll("").length() != 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static String m104583e(JSONObject jSONObject) {
        if (jSONObject != null) {
            String a = m104566a(jSONObject, "zip");
            if (TextUtils.isEmpty(a) || !f123288h.matcher(a).matches()) {
                return null;
            }
            return a;
        }
        return null;
    }

    /* renamed from: a */
    public static int m104563a(int i) {
        switch (i) {
            case 1:
                return C0126R.C0129id.address_field_country;
            case 2:
                return C0126R.C0129id.address_field_recipient;
            case 3:
                return C0126R.C0129id.address_field_address_line_1;
            case 4:
                return C0126R.C0129id.address_field_address_line_2;
            case 5:
                return C0126R.C0129id.address_field_locality;
            case 6:
                return C0126R.C0129id.address_field_admin_area;
            case 7:
                return C0126R.C0129id.address_field_postal_code;
            case 8:
                return C0126R.C0129id.address_field_phone_number;
            case 9:
                return C0126R.C0129id.address_field_sorting_code;
            case 10:
                return C0126R.C0129id.address_field_dependent_locality;
            case 11:
                return C0126R.C0129id.address_field_organization;
            default:
                StringBuilder sb = new StringBuilder(40);
                sb.append("Unexpected addressFormField: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: b */
    public static ArrayList m104574b(List list) {
        if (list == null) {
            return null;
        }
        SparseArray sparseArray = new SparseArray(274);
        sparseArray.put(858, "");
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int intValue = ((Integer) list.get(i)).intValue();
            if (!(intValue == 0 || intValue == 858)) {
                arrayList.add(Integer.valueOf(intValue));
            }
        }
        int size2 = arrayList.size();
        int size3 = arrayList.size();
        for (int i2 = 0; i2 < size3; i2++) {
            int intValue2 = ((Integer) arrayList.get(i2)).intValue();
            String b = m104573b(intValue2);
            if (TextUtils.isEmpty(b)) {
                StringBuilder sb = new StringBuilder(39);
                sb.append("Region code '");
                sb.append(intValue2);
                sb.append("' without label");
                Log.w("AddressUtils", sb.toString());
                b = "";
            }
            sparseArray.put(intValue2, b);
        }
        Collections.sort(arrayList, new bjtk(Collator.getInstance(Locale.getDefault()), sparseArray));
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        for (int i4 = 0; i4 < size2; i4++) {
            int intValue3 = ((Integer) arrayList.get(i4)).intValue();
            if (intValue3 != i3) {
                arrayList2.add(Integer.valueOf(intValue3));
                i3 = intValue3;
            }
        }
        return arrayList2;
    }

    /* renamed from: c */
    public static String m104579c(JSONObject jSONObject, String str) {
        String[] b;
        int length;
        String[] b2;
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArr = {str};
        String[] strArr2 = new String[1];
        Pattern b3 = m104576b(jSONObject);
        if (!(b3 == null || (b = m104577b(jSONObject, "sub_zips")) == null || (length = b.length) == 0)) {
            String str2 = strArr[0];
            if (!TextUtils.isEmpty(str2) && b3.matcher(str2).matches()) {
                int i = -1;
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    Matcher matcher = m104575b(b[i3]).matcher(str2);
                    if (matcher.matches()) {
                        int length2 = matcher.group(1).length();
                        if (i == -1 || length2 > i2) {
                            i = i3;
                            i2 = length2;
                        }
                    }
                }
                if (i >= 0 && (b2 = m104577b(jSONObject, "sub_keys")) != null && i < b2.length) {
                    strArr2[0] = b2[i];
                }
            }
        }
        return strArr2[0];
    }

    /* renamed from: a */
    public static int m104564a(JSONObject jSONObject) {
        String a;
        if (jSONObject == null || (a = m104566a(jSONObject, "id")) == null) {
            return 0;
        }
        String[] split = f123284d.split(a);
        int length = split.length;
        if (length == 2 || length == 3) {
            return bjtv.m104616b(f123285e.split(split[1])[0]);
        }
        throw new IllegalArgumentException(a.length() == 0 ? new String("Invalid address data id: ") : "Invalid address data id: ".concat(a));
    }

    /* renamed from: d */
    public static boolean m104582d(JSONObject jSONObject, String str) {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return false;
        }
        if (!jSONObject.has("lname") && !jSONObject.has("sub_lnames") && !jSONObject.has("lfmt")) {
            return false;
        }
        String a = m104566a(jSONObject, "lang");
        if (TextUtils.isEmpty(a)) {
            return m104570a(m104564a(jSONObject), str);
        }
        if (m104571a(a, Locale.ENGLISH.getLanguage()) || !m104571a(a, str)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static String m104584e(JSONObject jSONObject, String str) {
        String[] b = m104577b(jSONObject, "languages");
        if (b != null && (r2 = b.length) > 1) {
            String a = m104566a(jSONObject, "lang");
            if (!TextUtils.isEmpty(a) && !m104571a(a, str)) {
                for (String str2 : b) {
                    if (m104571a(str2, str)) {
                        return str2;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m104565a(Context context, char c, JSONObject jSONObject) {
        if (c == 'A') {
            return context.getString(C0126R.string.wallet_uic_address_field_address_line_1);
        }
        if (c == 'X') {
            return context.getString(C0126R.string.wallet_uic_address_field_sorting_code);
        }
        if (c == 'Z') {
            String a = m104566a(jSONObject, "zip_name_type");
            if ("zip".equals(a)) {
                return context.getString(C0126R.string.wallet_uic_address_field_zip_code);
            }
            if ("pin".equals(a)) {
                return context.getString(C0126R.string.wallet_uic_address_field_pin_code);
            }
            if ("eircode".equals(a)) {
                return context.getString(C0126R.string.wallet_uic_address_field_eircode);
            }
            return context.getString(C0126R.string.wallet_uic_address_field_postal_code);
        } else if (c == 'C') {
            String a2 = m104566a(jSONObject, "locality_name_type");
            if ("district".equals(a2)) {
                return context.getString(C0126R.string.wallet_uic_address_field_admin_area_district);
            }
            if ("post_town".equals(a2)) {
                return context.getString(C0126R.string.wallet_uic_address_field_post_town);
            }
            if ("suburb".equals(a2)) {
                return context.getString(C0126R.string.wallet_uic_address_field_suburb);
            }
            return context.getString(C0126R.string.wallet_uic_address_field_locality);
        } else if (c == 'D') {
            return context.getString(C0126R.string.wallet_uic_address_field_dependent_locality);
        } else {
            if (c == 'N') {
                return context.getString(C0126R.string.wallet_uic_address_field_recipient);
            }
            if (c == 'O') {
                return context.getString(C0126R.string.wallet_uic_address_field_organization);
            }
            if (c == 'R') {
                return context.getString(C0126R.string.wallet_uic_address_field_country);
            }
            if (c != 'S') {
                switch (c) {
                    case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                        return context.getString(C0126R.string.wallet_uic_address_field_address_line_1);
                    case '2':
                        return context.getString(C0126R.string.wallet_uic_address_field_address_line_2);
                    case '3':
                        return context.getString(C0126R.string.wallet_uic_address_field_address_line_3);
                    default:
                        return null;
                }
            } else {
                String a3 = m104566a(jSONObject, "state_name_type");
                if ("state".equals(a3)) {
                    return context.getString(C0126R.string.wallet_uic_address_field_admin_area_state);
                }
                if ("area".equals(a3)) {
                    return context.getString(C0126R.string.wallet_uic_address_field_admin_area_area);
                }
                if ("county".equals(a3)) {
                    return context.getString(C0126R.string.wallet_uic_address_field_admin_area_county);
                }
                if ("department".equals(a3)) {
                    return context.getString(C0126R.string.wallet_uic_address_field_admin_area_department);
                }
                if ("district".equals(a3)) {
                    return context.getString(C0126R.string.wallet_uic_address_field_admin_area_district);
                }
                if ("do_si".equals(a3)) {
                    return context.getString(C0126R.string.wallet_uic_address_field_admin_area_do_si);
                }
                if ("emirate".equals(a3)) {
                    return context.getString(C0126R.string.wallet_uic_address_field_admin_area_emirate);
                }
                if ("island".equals(a3)) {
                    return context.getString(C0126R.string.wallet_uic_address_field_admin_area_island);
                }
                if ("oblast".equals(a3)) {
                    return context.getString(C0126R.string.wallet_uic_address_field_admin_area_oblast);
                }
                if ("parish".equals(a3)) {
                    return context.getString(C0126R.string.wallet_uic_address_field_admin_area_parish);
                }
                if ("prefecture".equals(a3)) {
                    return context.getString(C0126R.string.wallet_uic_address_field_admin_area_prefecture);
                }
                if ("region".equals(a3)) {
                    return context.getString(C0126R.string.wallet_uic_address_field_admin_area_region);
                }
                return context.getString(C0126R.string.wallet_uic_address_field_admin_area_province);
            }
        }
    }

    /* renamed from: c */
    public static Pattern m104580c(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String a = m104566a(jSONObject, "sub_zips");
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        String replace = a.replace("~", "|");
        StringBuilder sb = new StringBuilder(String.valueOf(replace).length() + 4);
        sb.append("(");
        sb.append(replace);
        sb.append(").*");
        return Pattern.compile(sb.toString(), 2);
    }

    /* renamed from: b */
    public static Pattern m104575b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4);
        sb.append("(");
        sb.append(str);
        sb.append(").*");
        return Pattern.compile(sb.toString(), 2);
    }

    /* renamed from: b */
    public static Pattern m104576b(JSONObject jSONObject) {
        if (jSONObject != null) {
            String a = m104566a(jSONObject, "zip");
            if (!TextUtils.isEmpty(a)) {
                String a2 = m104566a(jSONObject, "id");
                if (!TextUtils.isEmpty(a2)) {
                    int length = f123284d.split(a2).length;
                    if (length == 2) {
                        return Pattern.compile(a, 2);
                    }
                    if (length != 3) {
                        return null;
                    }
                    return m104575b(a);
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String[] m104577b(JSONObject jSONObject, String str) {
        String a = m104566a(jSONObject, str);
        if (a != null) {
            return a.split("~");
        }
        return null;
    }

    /* renamed from: a */
    public static String m104566a(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optString(str, null);
        }
        return null;
    }

    /* renamed from: a */
    public static ArrayList m104567a(Collection collection, char[] cArr) {
        if (collection == null) {
            return null;
        }
        if (cArr == null) {
            cArr = f123286f;
        } else {
            for (int i = 0; i < cArr.length; i++) {
                if (!bjtf.m104553a(cArr[i])) {
                    cArr[i] = 0;
                }
            }
        }
        ArrayList arrayList = new ArrayList(collection);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            int size2 = arrayList.size() - 1;
            while (true) {
                if (size2 < 0) {
                    break;
                }
                if (size != size2) {
                    btwp btwp = (btwp) arrayList.get(size);
                    btwp btwp2 = (btwp) arrayList.get(size2);
                    if (btwp != null && btwp2 != null && cArr != null) {
                        int length = cArr.length;
                        int i2 = 0;
                        boolean z = false;
                        while (true) {
                            if (i2 < length) {
                                char c = cArr[i2];
                                if (c != 0) {
                                    String a = bjtg.m104555a(btwp, c);
                                    if (!TextUtils.isEmpty(a)) {
                                        if (!a.equals(bjtg.m104555a(btwp2, c))) {
                                            break;
                                        }
                                        z = true;
                                    } else {
                                        continue;
                                    }
                                }
                                i2++;
                            } else if (z) {
                                arrayList.remove(size);
                                break;
                            }
                        }
                    }
                }
                size2--;
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List m104568a(List list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            arrayList.add(Integer.valueOf(bjtv.m104616b((String) list.get(i))));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m104569a(char c, JSONObject jSONObject) {
        if (c == 'N') {
            return true;
        }
        String a = m104566a(jSONObject, "require");
        if (TextUtils.isEmpty(a)) {
            return false;
        }
        if (c == '1') {
            c = 'A';
        }
        return a.contains(String.valueOf(c));
    }

    /* renamed from: a */
    public static boolean m104570a(int i, String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            switch (i) {
                case FelicaException.TYPE_NOT_CLOSED:
                case 167:
                    str2 = "ar";
                    break;
                case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                    str2 = "hy";
                    break;
                case 110:
                case 267:
                case 431:
                case 663:
                    str2 = "zh";
                    break;
                case 336:
                    str2 = "ja";
                    break;
                case 368:
                case 370:
                    str2 = "ko";
                    break;
                case 597:
                    str2 = "ru";
                    break;
                case 648:
                    str2 = "th";
                    break;
                case 673:
                    str2 = "uk";
                    break;
                case 718:
                    str2 = "vi";
                    break;
                default:
                    str2 = null;
                    break;
            }
            if (TextUtils.isEmpty(str2) || m104571a(str2, str)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m104571a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return f123282b.split(str)[0].equalsIgnoreCase(f123282b.split(str2)[0]);
    }

    /* renamed from: a */
    public static char[] m104572a(String str) {
        if (!TextUtils.isEmpty(str)) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            char[] charArray = str.toCharArray();
            boolean z = false;
            for (char c : charArray) {
                if (z) {
                    StringBuilder sb = new StringBuilder(2);
                    sb.append("%");
                    sb.append(c);
                    if ("%n".equals(sb.toString())) {
                        arrayList2.add("%n");
                        z = false;
                    } else if (bjtf.m104553a(c)) {
                        StringBuilder sb2 = new StringBuilder(2);
                        sb2.append("%");
                        sb2.append(c);
                        arrayList2.add(sb2.toString());
                        z = false;
                    } else {
                        StringBuilder sb3 = new StringBuilder(37);
                        sb3.append("Cannot determine AddressField for '");
                        sb3.append(c);
                        sb3.append("'");
                        throw new UnknownFormatConversionException(sb3.toString());
                    }
                } else if (c != '%') {
                    arrayList2.add(Character.toString(c));
                } else {
                    z = true;
                }
            }
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                String str2 = (String) arrayList2.get(i);
                if (str2.matches("%.") && !str2.equals("%n")) {
                    arrayList.add(Character.valueOf(str2.charAt(1)));
                }
            }
            ArrayList arrayList3 = new ArrayList();
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                char charValue = ((Character) arrayList.get(i2)).charValue();
                if (charValue == 'A') {
                    arrayList3.add('1');
                    arrayList3.add('2');
                    arrayList3.add('3');
                } else {
                    arrayList3.add(Character.valueOf(charValue));
                }
            }
            int size3 = arrayList3.size();
            char[] cArr = new char[size3];
            for (int i3 = 0; i3 < size3; i3++) {
                cArr[i3] = ((Character) arrayList3.get(i3)).charValue();
            }
            return cArr;
        }
        throw new UnknownFormatConversionException("Cannot convert null/empty formats");
    }
}
