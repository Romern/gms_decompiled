package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.chimera.Activity;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* renamed from: akhu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akhu {
    /* renamed from: a */
    public static Account m59724a(Intent intent) {
        String stringExtra;
        if (intent == null || (stringExtra = intent.getStringExtra("authAccount")) == null) {
            return null;
        }
        return new Account(stringExtra, "com.google");
    }

    /* renamed from: b */
    public static aucb m59733b(Context context, Account account) {
        Context applicationContext = context.getApplicationContext();
        allp allp = new allp();
        allp.f73626a = 80;
        rjx d = allr.m61237d(applicationContext, allp.mo40491a());
        soc soc = new soc(1, 9);
        akhm akhm = new akhm(d, account);
        if (!cfov.f185185a.mo6606a().mo82337at()) {
            return aucu.m76780a(soc, akhm);
        }
        return aucu.m76780a(soc, new akhn(akhm, account));
    }

    /* renamed from: c */
    public static aucb m59736c(Context context) {
        if (!cfov.m142061n() || !sre.m36082b(context)) {
            return aucu.m76780a(new soc(1, 9), new akhr(context));
        }
        return aucu.m76777a(new Exception("AccountUtils#getSupportedAccounts: current device is a latchsky device."));
    }

    /* renamed from: d */
    static final /* synthetic */ ArrayList m59738d(Context context) {
        ArrayList arrayList = new ArrayList(m59727a(context));
        if (!cfov.f185185a.mo6606a().mo82364bl()) {
            try {
                arrayList.removeAll(Arrays.asList(gie.m13193a(context, "com.google", new String[]{aymh.m84252a("usm")})));
            } catch (gid | IOException e) {
                bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("akhu", "d", 394, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Failed to remove unicorn accounts.");
                return new ArrayList();
            }
        }
        if (!cfov.m142042R()) {
            try {
                ArrayList arrayList2 = new ArrayList();
                Account[] accountArr = (Account[]) adyd.m51363a(context).mo33907a("com.google", new String[]{"service_HOSTED"}).getResult();
                for (Account account : accountArr) {
                    if (!cfov.m142042R()) {
                        if (!cfov.f185185a.mo6606a().mo82351bG() || !account.name.endsWith("@google.com")) {
                            arrayList2.add(account);
                        }
                    }
                }
                arrayList.removeAll(arrayList2);
            } catch (IOException e2) {
                bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
                bnsl2.mo68437a(e2);
                bnsl2.mo68432a("akhu", "d", 420, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Failed to remove dasher accounts.");
                return new ArrayList();
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static File m59725a(Context context, Account account, String str) {
        Object[] objArr = new Object[2];
        File file = new File(String.format("%s/%s", m59734b(context).getAbsolutePath(), account.name));
        if (!file.exists()) {
            file.mkdirs();
        }
        objArr[0] = file.getAbsolutePath();
        objArr[1] = str;
        return new File(String.format("%s/%s", objArr));
    }

    /* renamed from: c */
    public static aucb m59737c(Context context, Account account) {
        allp allp = new allp();
        allp.f73626a = 80;
        return aucu.m76780a(new soc(1, 9), new akho(allr.m61234a(context, allp.mo40491a()), account, context));
    }

    /* renamed from: a */
    public static String m59726a(Context context, Account account) {
        try {
            return gie.m13198c(context, account.name);
        } catch (gid | IOException e) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("akhu", "a", 96, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68409a("Failed to find obfuscated Gaia id for %s.", Objects.hashCode(account));
            return null;
        }
    }

    /* renamed from: a */
    public static List m59727a(Context context) {
        return soz.m35801d(context, context.getPackageName());
    }

    /* renamed from: b */
    public static File m59734b(Context context) {
        File file = new File(String.format("%s/%s", context.getFilesDir(), "nearby/sharing"));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: a */
    public static List m59728a(Context context, String... strArr) {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = m59734b(context).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                File[] listFiles2 = file.listFiles();
                if (listFiles2 != null) {
                    for (File file2 : listFiles2) {
                        if (file2.exists()) {
                            int length = strArr.length;
                            int i = 0;
                            while (true) {
                                if (i < length) {
                                    if (strArr[i].equals(file2.getName())) {
                                        arrayList.add(file2);
                                        break;
                                    }
                                    i++;
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static void m59735b(Context context, String... strArr) {
        File[] listFiles;
        List a = m59728a(context, strArr);
        int size = a.size();
        for (int i = 0; i < size; i++) {
            File file = (File) a.get(i);
            file.delete();
            File parentFile = file.getParentFile();
            if (!(parentFile == null || (listFiles = parentFile.listFiles()) == null || listFiles.length > 0)) {
                parentFile.delete();
            }
        }
    }

    /* renamed from: a */
    public static List m59729a(Parcelable[] parcelableArr) {
        int length;
        if (parcelableArr == null || (length = parcelableArr.length) == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(length);
        for (Parcelable parcelable : parcelableArr) {
            Account account = (Account) parcelable;
            if ("com.google".equals(account.type)) {
                arrayList.add(account);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m59730a(Account account, Activity activity) {
        aucb c = m59736c(activity);
        c.mo50373a(new akhp(account, activity));
        c.mo50372a(akhq.f72022a);
    }

    /* renamed from: a */
    public static void m59731a(Activity activity) {
        m59730a((Account) null, activity);
    }

    /* renamed from: a */
    static final /* synthetic */ void m59732a(Exception exc) {
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
        bnsl.mo68437a(exc);
        bnsl.mo68432a("akhu", "a", 367, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a(" AccountPicker Activity failed to launch.");
    }
}
