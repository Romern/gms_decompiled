package com.google.android.gms.accountsettings.content;

import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.provider.SearchIndexablesContract;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.chimera.ContentProvider;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SettingsSearchChimeraContentProvider extends ContentProvider {

    /* renamed from: a */
    private UriMatcher f7749a;

    /* renamed from: b */
    private eov f7750b;

    /* renamed from: a */
    private final eov m4959a() {
        if (this.f7750b == null) {
            this.f7750b = new eov(getContext());
        }
        return this.f7750b;
    }

    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        String str = providerInfo.authority;
        UriMatcher uriMatcher = new UriMatcher(-1);
        this.f7749a = uriMatcher;
        uriMatcher.addURI(str, "settings/indexables_raw", 2);
        this.f7749a.addURI(str, "settings/non_indexables_key", 3);
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("Delete not supported");
    }

    public final String getType(Uri uri) {
        int match = this.f7749a.match(uri);
        if (match == 2) {
            return "vnd.android.cursor.dir/indexables_raw";
        }
        if (match != 3) {
            return null;
        }
        return "vnd.android.cursor.dir/non_indexables_key";
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("Insert not supported");
    }

    public final boolean onCreate() {
        return true;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String str3;
        int match = this.f7749a.match(uri);
        if (match == 2) {
            MatrixCursor matrixCursor = new MatrixCursor(SearchIndexablesContract.INDEXABLES_RAW_COLUMNS);
            eov a = m4959a();
            bnre i = bngx.m109367a(a.mo10378a(10003, C0126R.string.as_settings_search_personal_info), a.mo10380a(10004, C0126R.string.as_settings_search_data_and_personalization, 0, C0126R.string.as_settings_search_privacy), a.mo10378a(10006, C0126R.string.as_settings_search_security), a.mo10378a(10007, C0126R.string.as_settings_search_payments_and_subscriptions), a.mo10379a(400, C0126R.string.as_settings_search_security_checkup, C0126R.string.as_settings_search_security), a.mo10379a(10003, C0126R.string.as_settings_search_photo, C0126R.string.as_settings_search_personal_info), a.mo10380a(BaseMfiEventCallback.TYPE_OPSRV_REQUIRED_LIB_UNAVAILABLE, C0126R.string.as_settings_search_google_activity, C0126R.string.as_settings_search_data_and_personalization, C0126R.string.as_settings_search_my_activity), a.mo10379a(ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE, C0126R.string.as_settings_search_password, C0126R.string.as_settings_search_security), a.mo10380a(403, C0126R.string.as_settings_search_two_step_verification, C0126R.string.as_settings_search_security, C0126R.string.as_settings_search_two_keyword), a.mo10379a(203, C0126R.string.as_settings_search_email, C0126R.string.as_settings_search_personal_info), a.mo10379a(BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, C0126R.string.as_settings_search_privacy_checkup, C0126R.string.as_settings_search_data_and_personalization), a.mo10379a(BaseMfiEventCallback.TYPE_EXIST_UNKNOWN_CARD, C0126R.string.as_settings_search_activity_controls, C0126R.string.as_settings_search_data_and_personalization), a.mo10379a(410, C0126R.string.as_settings_search_your_devices, C0126R.string.as_settings_search_security), a.mo10379a(303, C0126R.string.as_settings_search_delete_your_google_account, C0126R.string.as_settings_search_data_and_personalization), a.mo10379a(204, C0126R.string.as_settings_search_phone_number, C0126R.string.as_settings_search_personal_info)).listIterator();
            while (i.hasNext()) {
                eox eox = (eox) i.next();
                Object[] objArr = new Object[SearchIndexablesContract.INDEXABLES_RAW_COLUMNS.length];
                objArr[1] = eox.mo10366a();
                objArr[2] = eox.mo10367b();
                bngx c = eox.mo10368c();
                if (c == null || c.isEmpty()) {
                    str3 = null;
                } else {
                    str3 = TextUtils.join(", ", eox.mo10368c());
                }
                objArr[5] = str3;
                objArr[6] = eox.mo10369d();
                objArr[12] = eox.mo10370e();
                objArr[9] = eox.mo10372f();
                objArr[10] = eox.mo10373g();
                objArr[11] = eox.mo10374h();
                objArr[8] = eox.mo10376i();
                matrixCursor.addRow(objArr);
            }
            return matrixCursor;
        } else if (match != 3) {
            return null;
        } else {
            MatrixCursor matrixCursor2 = new MatrixCursor(SearchIndexablesContract.NON_INDEXABLES_KEYS_COLUMNS);
            m4959a();
            bnre i2 = bngx.m109376e().listIterator();
            while (i2.hasNext()) {
                Object[] objArr2 = new Object[SearchIndexablesContract.NON_INDEXABLES_KEYS_COLUMNS.length];
                objArr2[0] = (String) i2.next();
                matrixCursor2.addRow(objArr2);
            }
            return matrixCursor2;
        }
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("Update not supported");
    }
}
