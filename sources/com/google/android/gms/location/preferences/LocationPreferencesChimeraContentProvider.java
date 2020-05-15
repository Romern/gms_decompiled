package com.google.android.gms.location.preferences;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.ContentProvider;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LocationPreferencesChimeraContentProvider extends ContentProvider {

    /* renamed from: a */
    private SharedPreferences f79592a;

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public final Bundle call(String str, String str2, Bundle bundle) {
        char c;
        String str3;
        int i = 0;
        switch (str.hashCode()) {
            case -934610812:
                if (str.equals("remove")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3496342:
                if (str.equals("read")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 113399775:
                if (str.equals("write")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1181639041:
                if (str.equals("DrivingModePreferenceSummary")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        String str4 = null;
        if (c == 0) {
            if (bundle != null) {
                i = bundle.getInt("valueType", 0);
                str4 = bundle.getString("defaultValue", null);
            }
            Bundle bundle2 = new Bundle();
            try {
                str3 = this.f79592a.getString(str2, str4);
            } catch (ClassCastException e) {
                if (i == 1) {
                    str3 = Boolean.toString(this.f79592a.getBoolean(str2, Boolean.parseBoolean(str4)));
                } else if (i == 2) {
                    str3 = Integer.toString(this.f79592a.getInt(str2, Integer.parseInt(str4)));
                } else if (i == 3) {
                    str3 = Long.toString(this.f79592a.getLong(str2, Long.parseLong(str4)));
                } else if (i == 4) {
                    str3 = Float.toString(this.f79592a.getFloat(str2, Float.parseFloat(str4)));
                } else {
                    StringBuilder sb = new StringBuilder(33);
                    sb.append("unknown fallback type ");
                    sb.append(i);
                    throw new ClassCastException(sb.toString());
                }
            } catch (ClassCastException e2) {
                try {
                    str3 = this.f79592a.getString(str2, str4);
                } catch (ClassCastException e3) {
                    throw e2;
                }
            }
            bundle2.putString("value", str3);
            return bundle2;
        } else if (c == 1) {
            this.f79592a.edit().putString(str2, bundle.getString("value")).apply();
            getContext().getContentResolver().notifyChange(aepq.m52364a(str2), null);
            return null;
        } else if (c == 2) {
            this.f79592a.edit().remove(str2).apply();
            getContext().getContentResolver().notifyChange(aepq.m52364a(str2), null);
            return null;
        } else if (c != 3) {
            return null;
        } else {
            Bundle bundle3 = new Bundle();
            vuk.m41322a();
            if (new vup(getContext()).mo28870a()) {
                bundle3.putString("com.android.settings.summary", getContext().getString(C0126R.string.common_on));
            } else {
                bundle3.putString("com.android.settings.summary", getContext().getString(C0126R.string.common_off));
            }
            return bundle3;
        }
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final boolean onCreate() {
        this.f79592a = getContext().getSharedPreferences("nlp-prefs", 0);
        return true;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
