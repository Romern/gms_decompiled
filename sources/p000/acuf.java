package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;

/* renamed from: acuf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acuf extends AsyncTask {
    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        boolean z;
        if (objArr.length == 2) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        SharedPreferences.Editor edit = new rtj((Context) objArr[0], "3pErrorCachePreferences", true).edit();
        edit.putBoolean("LoggingEnabled", ((Boolean) objArr[1]).booleanValue());
        edit.apply();
        return null;
    }
}
