package p000;

import android.content.Context;
import com.felicanetworks.mfc.C0126R;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/* renamed from: lyw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lyw {

    /* renamed from: a */
    private static final lvn f33224a = new lvn("LoadBlacklist");

    /* renamed from: b */
    private final Context f33225b;

    public lyw(Context context) {
        this.f33225b = context;
    }

    /* renamed from: a */
    public final Set mo19768a() {
        BufferedReader bufferedReader;
        IOException e;
        HashSet hashSet = new HashSet();
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(this.f33225b.getResources().openRawResource(C0126R.raw.romanesco_backup_contacts_blacklist_account_types)));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    } else if (!"com.google".equals(readLine)) {
                        hashSet.add(readLine);
                    }
                } catch (IOException e2) {
                    e = e2;
                    try {
                        f33224a.mo25417e("Failed to read blacklist from file ", e, new Object[0]);
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
            f33224a.mo25412b("Contacts blacklist loaded", new Object[0]);
        } catch (IOException e3) {
            bufferedReader = null;
            e = e3;
            f33224a.mo25417e("Failed to read blacklist from file ", e, new Object[0]);
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
