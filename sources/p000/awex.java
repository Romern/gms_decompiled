package p000;

import android.util.Log;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: awex */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awex {
    /* renamed from: a */
    private static String m79832a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj.toString();
    }

    /* renamed from: a */
    private static HashSet m79833a(String str) {
        try {
            return m79834a(new JSONArray(str));
        } catch (JSONException e) {
            Log.e("JsonMatchUtils", "Failed to create JSONArray with given jsonArrayString!");
            return null;
        }
    }

    /* renamed from: a */
    private static HashSet m79834a(JSONArray jSONArray) {
        try {
            HashSet hashSet = new HashSet();
            for (int i = 0; i < jSONArray.length(); i++) {
                hashSet.add(m79832a(jSONArray.get(i)));
            }
            return hashSet;
        } catch (JSONException e) {
            Log.e("JsonMatchUtils", "Failed to convert the given json array string into set of strings!");
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m79835a(Object obj, String str) {
        if (!(obj instanceof JSONArray)) {
            return str.equals(m79832a(obj));
        }
        HashSet a = m79833a(str);
        HashSet a2 = m79834a((JSONArray) obj);
        if (a == null || a2 == null) {
            return false;
        }
        return a.equals(a2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b4, code lost:
        r9 = null;
     */
    /* renamed from: a */
    public static boolean m79836a(JSONObject jSONObject, List list) {
        JSONObject jSONObject2;
        boolean z;
        int size = list.size();
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= size) {
                return true;
            }
            blyh blyh = (blyh) list.get(i);
            if (blyh.f128205b.size() == 0 && blyh.f128206c.size() == 0) {
                Log.e("JsonMatchUtils", "Invalid json match rule! At least one of child or leaf node must exist!");
                z2 = false;
            } else {
                bxwc bxwc = blyh.f128204a;
                if (jSONObject == null || bxwc.isEmpty()) {
                    jSONObject2 = jSONObject;
                } else {
                    int size2 = bxwc.size();
                    Object obj = jSONObject;
                    int i2 = 0;
                    while (true) {
                        if (i2 < size2) {
                            blyb blyb = (blyb) bxwc.get(i2);
                            if (obj == null) {
                                break;
                            }
                            int i3 = blyb.f128191a;
                            if (i3 == 1) {
                                if (!(obj instanceof JSONObject)) {
                                    Log.e("JsonMatchUtils", "The parent field must be a JSONObject when tries to get its child field by field name!");
                                    break;
                                }
                                obj = ((JSONObject) obj).opt((String) blyb.f128192b);
                            } else if (i3 == 2) {
                                if (!(obj instanceof JSONArray)) {
                                    Log.e("JsonMatchUtils", "The parent field must be a JSONArray when tries to get its child json object by child key value pair!");
                                    jSONObject2 = null;
                                    break;
                                }
                                JSONArray jSONArray = (JSONArray) obj;
                                blya blya = (blya) blyb.f128192b;
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= jSONArray.length()) {
                                        obj = null;
                                        break;
                                    }
                                    try {
                                        JSONObject jSONObject3 = jSONArray.getJSONObject(i4);
                                        if (jSONObject3.has(blya.f128186a) && m79835a(jSONObject3.opt(blya.f128186a), blya.f128187b)) {
                                            obj = jSONObject3;
                                            break;
                                        }
                                        i4++;
                                    } catch (JSONException e) {
                                        throw new RuntimeException("Failed to get JSONObject in JSONArray!");
                                    }
                                }
                            } else {
                                Log.e("JsonMatchUtils", "Either field name or child key value pair identifier must be provided to find a json field!");
                                jSONObject2 = null;
                                break;
                            }
                            i2++;
                        } else if (!(obj instanceof JSONObject)) {
                            Log.e("JsonMatchUtils", "The last json field found by path should be a JSONObject!");
                            jSONObject2 = null;
                        } else {
                            jSONObject2 = (JSONObject) obj;
                        }
                    }
                }
                bxwc bxwc2 = blyh.f128205b;
                int size3 = bxwc2.size();
                int i5 = 0;
                while (true) {
                    if (i5 < size3) {
                        blyg blyg = (blyg) bxwc2.get(i5);
                        if (jSONObject2 != null) {
                            Object opt = jSONObject2.opt(blyg.f128198b);
                            if (opt != null) {
                                int a = blyd.m107769a(blyg.f128200d);
                                if (a == 0) {
                                    a = 1;
                                }
                                int i6 = a - 1;
                                if (i6 == 1) {
                                    z = m79835a(opt, blyg.f128199c);
                                } else if (i6 == 2) {
                                    String str = blyg.f128199c;
                                    if (opt instanceof JSONArray) {
                                        HashSet a2 = m79833a(str);
                                        HashSet a3 = m79834a((JSONArray) opt);
                                        if (a2 == null) {
                                            z = false;
                                        } else if (a3 != null) {
                                            z = a3.containsAll(a2);
                                        }
                                    }
                                    z = false;
                                } else if (i6 != 3) {
                                    Locale locale = Locale.US;
                                    Object[] objArr = new Object[1];
                                    int a4 = blyd.m107769a(blyg.f128200d);
                                    if (a4 == 0) {
                                        a4 = 1;
                                    }
                                    objArr[0] = Integer.valueOf(a4 - 1);
                                    Log.e("JsonMatchUtils", String.format(locale, "unknown compare method %d!", objArr));
                                    z = false;
                                } else {
                                    String str2 = blyg.f128199c;
                                    if (opt instanceof JSONArray) {
                                        try {
                                            if (((JSONArray) opt).length() == Integer.parseInt(str2)) {
                                                z = true;
                                            }
                                        } catch (NumberFormatException e2) {
                                            Log.e("JsonMatchUtils", "Failed to convert expectedValue to an integer when trying to compare JSONArray's size!");
                                            z = false;
                                        }
                                    }
                                    z = false;
                                }
                            } else {
                                int a5 = blyf.m107771a(blyg.f128197a);
                                z = a5 != 0 && a5 == 3;
                            }
                        } else {
                            int a6 = blyf.m107771a(blyg.f128197a);
                            z = a6 != 0 && a6 == 3;
                        }
                        i5++;
                        if (!z) {
                            z2 = false;
                            break;
                        }
                    } else if (!m79836a(jSONObject2, blyh.f128206c)) {
                        z2 = false;
                    }
                }
            }
            i++;
            if (!z2) {
                return false;
            }
        }
    }
}
