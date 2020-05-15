package p000;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.preference.PreferenceManager;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: scv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class scv extends dck implements scw {

    /* renamed from: a */
    private final Context f44050a;

    public scv() {
        super("com.google.android.gms.common.internal.ISharedPreferencesService");
    }

    /* renamed from: a */
    private final void m34928a(String str, String str2) {
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        intent.setAction("com.google.android.gms.common.internal.SHARED_PREFERENCES_CHANGED");
        String valueOf = String.valueOf(str);
        intent.addCategory(valueOf.length() == 0 ? new String("com.google.android.gms.common.internal.SHARED_PREFERENCES:") : "com.google.android.gms.common.internal.SHARED_PREFERENCES:".concat(valueOf));
        intent.putExtra("KEY_NAME", str2);
        this.f44050a.sendBroadcast(intent, "com.google.android.gms.common.internal.SHARED_PREFERENCES_PERMISSION");
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final Bundle mo25388a(String str, int i, Bundle bundle) {
        Context context;
        rth rth;
        char c;
        String str2;
        String str3;
        boolean z;
        String str4;
        Set set;
        String str5 = str;
        Bundle bundle2 = bundle;
        try {
            String string = bundle2.getString("FUNCTION_NAME");
            String string2 = bundle2.getString("KEY_NAME");
            boolean z2 = bundle2.getBoolean("isDirectBoot", false);
            if (z2) {
                context = aytw.m84817d(this.f44050a);
            } else {
                context = this.f44050a;
            }
            if (str5 != null) {
                rth = context.getSharedPreferences(str5, i);
            } else {
                rth = PreferenceManager.getDefaultSharedPreferences(context);
            }
            if (cdjz.m133768c()) {
                rth = new rth(rth);
            }
            String str6 = string2;
            SharedPreferences sharedPreferences = rth;
            boolean z3 = true;
            z3 = true;
            z3 = true;
            z3 = true;
            z3 = true;
            z3 = true;
            z3 = true;
            switch (string.hashCode()) {
                case -2018571198:
                    if (string.equals("putStringSet")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case -1354815177:
                    if (string.equals("commit")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -1249367445:
                    if (string.equals("getAll")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1249359687:
                    if (string.equals("getInt")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -976920992:
                    if (string.equals("putInt")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case -934610812:
                    if (string.equals("remove")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case -567445985:
                    if (string.equals("contains")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -462997504:
                    if (string.equals("putString")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case -219689429:
                    if (string.equals("putLong")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case -198897701:
                    if (string.equals("getStringSet")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -75354382:
                    if (string.equals("getLong")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 3108362:
                    if (string.equals("edit")) {
                        c = 8;
                        break;
                    }
                    c = 65535;
                    break;
                case 93029230:
                    if (string.equals("apply")) {
                        c = 10;
                        break;
                    }
                    c = 65535;
                    break;
                case 94746189:
                    if (string.equals("clear")) {
                        c = 9;
                        break;
                    }
                    c = 65535;
                    break;
                case 219124812:
                    if (string.equals("moveSharedPreferencesFrom")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case 478450201:
                    if (string.equals("putBoolean")) {
                        c = 12;
                        break;
                    }
                    c = 65535;
                    break;
                case 804029191:
                    if (string.equals("getString")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1101572082:
                    if (string.equals("getBoolean")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1773932685:
                    if (string.equals("putFloat")) {
                        c = 13;
                        break;
                    }
                    c = 65535;
                    break;
                case 1953351846:
                    if (string.equals("getFloat")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            String str7 = "contains";
            Bundle bundle3 = null;
            r2 = null;
            r2 = null;
            r2 = null;
            r2 = null;
            r2 = null;
            r2 = null;
            r2 = null;
            r2 = null;
            r2 = null;
            Bundle bundle4 = null;
            r2 = null;
            Set<String> set2 = null;
            Bundle bundle5 = null;
            Bundle bundle6 = null;
            Bundle bundle7 = null;
            Bundle bundle8 = null;
            Bundle bundle9 = null;
            Bundle bundle10 = null;
            switch (c) {
                case 0:
                    str3 = str;
                    str2 = str6;
                    bundle4 = new Bundle();
                    bundle4.putBoolean(str7, sharedPreferences.contains(str2));
                    z3 = false;
                    break;
                case 1:
                    str3 = str;
                    str2 = str6;
                    Map<String, ?> all = sharedPreferences.getAll();
                    HashMap hashMap = new HashMap(all);
                    if (all.size() > 0) {
                        bundle3 = new Bundle();
                        bundle3.putSerializable("getAll", hashMap);
                    }
                    z3 = false;
                    break;
                case 2:
                    str3 = str;
                    SharedPreferences sharedPreferences2 = sharedPreferences;
                    str2 = str6;
                    if (sharedPreferences2.contains(str2)) {
                        bundle10 = new Bundle();
                        bundle10.putBoolean("getBoolean", sharedPreferences2.getBoolean(str2, false));
                    }
                    z3 = false;
                    break;
                case 3:
                    str3 = str;
                    SharedPreferences sharedPreferences3 = sharedPreferences;
                    str2 = str6;
                    if (sharedPreferences3.contains(str2)) {
                        bundle9 = new Bundle();
                        bundle9.putFloat("getFloat", sharedPreferences3.getFloat(str2, 0.0f));
                    }
                    z3 = false;
                    break;
                case 4:
                    str3 = str;
                    SharedPreferences sharedPreferences4 = sharedPreferences;
                    str2 = str6;
                    if (sharedPreferences4.contains(str2)) {
                        bundle8 = new Bundle();
                        bundle8.putInt("getInt", sharedPreferences4.getInt(str2, 0));
                    }
                    z3 = false;
                    break;
                case 5:
                    str3 = str;
                    SharedPreferences sharedPreferences5 = sharedPreferences;
                    str2 = str6;
                    if (sharedPreferences5.contains(str2)) {
                        bundle7 = new Bundle();
                        bundle7.putLong("getLong", sharedPreferences5.getLong(str2, 0));
                    }
                    z3 = false;
                    break;
                case 6:
                    str3 = str;
                    SharedPreferences sharedPreferences6 = sharedPreferences;
                    str2 = str6;
                    if (sharedPreferences6.contains(str2)) {
                        Bundle bundle11 = new Bundle();
                        bundle11.putString("getString", sharedPreferences6.getString(str2, null));
                        bundle6 = bundle11;
                    }
                    z3 = false;
                    break;
                case 7:
                    str3 = str;
                    str2 = str6;
                    SharedPreferences sharedPreferences7 = sharedPreferences;
                    if (sharedPreferences7.contains(str2)) {
                        bundle5 = new Bundle();
                        Set<String> stringSet = sharedPreferences7.getStringSet(str2, Collections.emptySet());
                        bundle5.putStringArray("getStringSet", (String[]) stringSet.toArray(new String[stringSet.size()]));
                    }
                    z3 = false;
                    break;
                case 8:
                    str3 = str;
                    str2 = str6;
                    boolean z4 = bundle.getBoolean("KEY_COMMIT", false);
                    Bundle bundle12 = bundle.getBundle("KEY_VALUES");
                    Bundle bundle13 = bundle.getBundle("KEY_TYPES");
                    boolean z5 = bundle.getBoolean("KEY_CLEAR", false);
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    if (z5) {
                        edit.clear();
                    }
                    if (bundle13 != null) {
                        if (bundle12 != null) {
                            for (String str8 : bundle13.keySet()) {
                                int i2 = bundle13.getInt(str8, -1);
                                switch (i2) {
                                    case 0:
                                        edit.putString(str8, bundle12.getString(str8));
                                        break;
                                    case 1:
                                        C1225nr nrVar = new C1225nr();
                                        Collections.addAll(nrVar, bundle12.getStringArray(str8));
                                        edit.putStringSet(str8, nrVar);
                                        break;
                                    case 2:
                                        edit.putInt(str8, bundle12.getInt(str8));
                                        break;
                                    case 3:
                                        edit.putLong(str8, bundle12.getLong(str8));
                                        break;
                                    case 4:
                                        edit.putFloat(str8, bundle12.getFloat(str8));
                                        break;
                                    case 5:
                                        edit.putBoolean(str8, bundle12.getBoolean(str8));
                                        break;
                                    case 6:
                                        edit.remove(str8);
                                        break;
                                    default:
                                        StringBuilder sb = new StringBuilder(String.valueOf(str8).length() + 39);
                                        sb.append("Key ");
                                        sb.append(str8);
                                        sb.append(" has unknown value type ");
                                        sb.append(i2);
                                        throw new IllegalArgumentException(sb.toString());
                                }
                            }
                            set2 = bundle13.keySet();
                        }
                    }
                    if (z4) {
                        z = edit.commit();
                    } else {
                        edit.apply();
                        z = true;
                    }
                    if (z) {
                        if (set2 != null) {
                            for (String str9 : set2) {
                                m34928a(str3, str9);
                            }
                        }
                    }
                    bundle4 = new Bundle();
                    bundle4.putBoolean("edit", z);
                    z3 = false;
                    break;
                case 9:
                    str3 = str;
                    str2 = str6;
                    sharedPreferences.edit().clear().apply();
                    z3 = false;
                    break;
                case 10:
                case 11:
                    str4 = str;
                    str2 = str6;
                    z3 = false;
                    break;
                case 12:
                    str3 = str;
                    str2 = str6;
                    sharedPreferences.edit().putBoolean(str2, bundle.getBoolean("value")).apply();
                    break;
                case 13:
                    str3 = str;
                    str2 = str6;
                    sharedPreferences.edit().putFloat(str2, bundle.getFloat("value")).apply();
                    break;
                case 14:
                    str3 = str;
                    str2 = str6;
                    sharedPreferences.edit().putInt(str2, bundle.getInt("value")).apply();
                    break;
                case 15:
                    str3 = str;
                    str2 = str6;
                    sharedPreferences.edit().putLong(str2, bundle.getLong("value")).apply();
                    break;
                case 16:
                    str3 = str;
                    str2 = str6;
                    sharedPreferences.edit().putString(str2, bundle.getString("value")).apply();
                    break;
                case 17:
                    str3 = str;
                    str2 = str6;
                    String[] stringArray = bundle.getStringArray("value");
                    if (stringArray == null || stringArray.length <= 0) {
                        set = Collections.emptySet();
                    } else {
                        set = new C1225nr();
                        Collections.addAll(set, stringArray);
                    }
                    sharedPreferences.edit().putStringSet(str2, set).apply();
                    break;
                case 18:
                    str3 = str;
                    str2 = str6;
                    sharedPreferences.edit().remove(str2).apply();
                    break;
                case 19:
                    aytw.m84814b();
                    if (!z2 || !aytw.m84815b(this.f44050a) || this.f44050a.isDeviceProtectedStorage()) {
                        str3 = str;
                    } else {
                        bundle4 = new Bundle();
                        str3 = str;
                        bundle4.putBoolean("moveSharedPreferencesFrom", context.moveSharedPreferencesFrom(this.f44050a, str3));
                    }
                    str2 = str6;
                    z3 = false;
                    break;
                default:
                    str4 = str;
                    str2 = str6;
                    String valueOf = String.valueOf(string);
                    Log.e("SharedPrefsSvc", valueOf.length() == 0 ? new String("Unknown function name: ") : "Unknown function name: ".concat(valueOf));
                    z3 = false;
                    break;
            }
            if (z3) {
                m34928a(str3, str2);
            }
            return bundle4;
        } catch (Exception e) {
            sqx.m36054a(this.f44050a, e, 0);
            throw e;
        }
    }

    public scv(Context context) {
        super("com.google.android.gms.common.internal.ISharedPreferencesService");
        this.f44050a = context;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Bundle a = mo25388a(parcel.readString(), parcel.readInt(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        dcl.m8169b(parcel2, a);
        return true;
    }
}
