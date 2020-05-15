package p000;

import android.content.Context;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/* renamed from: aoys */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoys {

    /* renamed from: a */
    private final Context f83867a;

    public aoys(Context context) {
        this.f83867a = context;
    }

    /* renamed from: a */
    public final Set mo47021a() {
        BufferedReader bufferedReader;
        IOException e;
        HashSet hashSet = new HashSet();
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(this.f83867a.getResources().openRawResource(C0126R.raw.romanesco_backup_contacts_blacklist_account_types)));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    hashSet.add(readLine);
                } catch (IOException e2) {
                    e = e2;
                    try {
                        String valueOf = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
                        sb.append("Failed to read blacklist from file ");
                        sb.append(valueOf);
                        Log.e("LoadBlacklist", sb.toString());
                        srz.m36171a(bufferedReader);
                        return hashSet;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader2 = bufferedReader;
                    }
                }
            }
        } catch (IOException e3) {
            bufferedReader = null;
            e = e3;
            String valueOf2 = String.valueOf(e);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 35);
            sb2.append("Failed to read blacklist from file ");
            sb2.append(valueOf2);
            Log.e("LoadBlacklist", sb2.toString());
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
