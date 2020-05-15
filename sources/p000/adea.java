package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* renamed from: adea */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adea {

    /* renamed from: a */
    final SharedPreferences f61475a;

    /* renamed from: b */
    final Context f61476b;

    /* renamed from: c */
    private final addm f61477c;

    /* renamed from: d */
    private final Map f61478d = new C1223np();

    public adea(Context context) {
        addm addm = new addm();
        this.f61476b = context;
        this.f61475a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f61477c = addm;
        File file = new File(C1133kh.m17845c(this.f61476b), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !this.f61475a.getAll().isEmpty()) {
                    Log.i("InstanceID/Store", "App restored, clearing state");
                    addj.m50213a(this.f61476b, this);
                }
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: a */
    static String m50242a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + str2.length());
        sb.append(str);
        sb.append("|S|");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: c */
    private static final String m50244c(String str, String str2, String str3) {
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: d */
    private static final String m50245d(String str, String str2, String str3) {
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 14 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T-timestamp|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized long mo33381b(String str, String str2, String str3) {
        return this.f61475a.getLong(m50245d(str, str2, str3), -1);
    }

    /* renamed from: a */
    static String m50243a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* renamed from: b */
    public final synchronized addk mo33382b(String str) {
        addk addk;
        addk addk2 = (addk) this.f61478d.get(str);
        if (addk2 != null) {
            return addk2;
        }
        try {
            addm addm = this.f61477c;
            Context context = this.f61476b;
            addk = addm.mo33353b(context, str);
            if (addk == null) {
                addk = addm.mo33352a(context, str);
            }
        } catch (addl e) {
            Log.w("InstanceID/Store", "Stored data is corrupt, generating new identity");
            addj.m50213a(this.f61476b, this);
            addk = this.f61477c.mo33352a(this.f61476b, str);
        }
        this.f61478d.put(str, addk);
        return addk;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized String mo33377a(String str) {
        return this.f61475a.getString(str, null);
    }

    /* renamed from: a */
    public final synchronized String mo33378a(String str, String str2, String str3) {
        return this.f61475a.getString(m50244c(str, str2, str3), null);
    }

    /* renamed from: a */
    public final synchronized void mo33379a() {
        this.f61478d.clear();
        File[] listFiles = addm.m50218a(this.f61476b).listFiles();
        for (File file : listFiles) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
        this.f61475a.edit().clear().commit();
    }

    /* renamed from: a */
    public final synchronized void mo33380a(String str, String str2, String str3, String str4, String str5) {
        String c = m50244c(str, str2, str3);
        String d = m50245d(str, str2, str3);
        SharedPreferences.Editor edit = this.f61475a.edit();
        edit.putString(c, str4);
        edit.putLong(d, System.currentTimeMillis());
        edit.putString("appVersion", str5);
        edit.commit();
    }
}
