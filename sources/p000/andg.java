package p000;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/* renamed from: andg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class andg {

    /* renamed from: a */
    private final Context f76668a;

    public andg(Context context) {
        this.f76668a = context;
    }

    /* renamed from: a */
    public final Set mo41730a() {
        BufferedReader bufferedReader;
        Throwable e;
        HashSet hashSet = new HashSet();
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(this.f76668a.getResources().openRawResource(C0126R.raw.romanesco_backup_contacts_blacklist_account_types)));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    hashSet.add(readLine);
                } catch (Resources.NotFoundException | IOException e2) {
                    e = e2;
                    try {
                        Log.e("LoadBlacklist", "Failed to read blacklist from file.", e);
                        srz.m36171a(bufferedReader);
                        return hashSet;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader2 = bufferedReader;
                        srz.m36171a(bufferedReader2);
                        throw th;
                    }
                }
            }
        } catch (Resources.NotFoundException | IOException e3) {
            bufferedReader = null;
            e = e3;
            Log.e("LoadBlacklist", "Failed to read blacklist from file.", e);
            srz.m36171a(bufferedReader);
            return hashSet;
        } catch (Throwable th2) {
            th = th2;
            srz.m36171a(bufferedReader2);
            throw th;
        }
        srz.m36171a(bufferedReader);
        return hashSet;
    }
}
