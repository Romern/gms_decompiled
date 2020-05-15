package p000;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.Flag;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: anfa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class anfa {

    /* renamed from: a */
    protected final aney f76754a;

    /* renamed from: b */
    protected final String f76755b;

    /* renamed from: c */
    protected final long f76756c;

    /* renamed from: d */
    private final rtc f76757d = rtc.m34377a("gms:phenotype:commit:timeout", (Long) 2000L);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: rtc.a(java.lang.String, java.lang.Long):rtc
     arg types: [java.lang.String, long]
     candidates:
      rtc.a(java.lang.String, java.lang.Float):rtc
      rtc.a(java.lang.String, java.lang.Integer):rtc
      rtc.a(java.lang.String, java.lang.String):rtc
      rtc.a(java.lang.String, boolean):rtc
      rtc.a(android.content.Context, java.util.Set):void
      rtc.a(java.lang.String, java.lang.Long):rtc */
    public anfa(aney aney, String str) {
        long j = 2000;
        this.f76754a = aney;
        this.f76755b = str;
        this.f76756c = rtc.m34382b() ? ((Long) this.f76757d.mo25081c()).longValue() : j;
    }

    /* renamed from: a */
    private static void m64129a(SharedPreferences.Editor editor, Configuration configuration) {
        if (configuration != null) {
            for (String str : configuration.f82072c) {
                editor.remove(str);
            }
            Flag[] flagArr = configuration.f82071b;
            for (Flag flag : flagArr) {
                int i = flag.f82105g;
                if (i == 1) {
                    editor.putLong(flag.f82099a, flag.mo46497a());
                } else if (i == 2) {
                    editor.putBoolean(flag.f82099a, flag.mo46499b());
                } else if (i == 3) {
                    editor.putFloat(flag.f82099a, (float) flag.mo46500c());
                } else if (i == 4) {
                    editor.putString(flag.f82099a, flag.mo46502d());
                } else if (i == 5) {
                    editor.putString(flag.f82099a, Base64.encodeToString(flag.mo46503e(), 3));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo41768a() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo41769b(Configurations configurations) {
        mo25082a(configurations);
        return true;
    }

    /* renamed from: a */
    public static void m64130a(SharedPreferences sharedPreferences, Configuration... configurationArr) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (Configuration configuration : configurationArr) {
            m64129a(edit, configuration);
        }
        if (!edit.commit()) {
            Log.w("PhenotypeFlagCommitter", "Failed to commit Phenotype configs to SharedPreferences!");
        }
    }

    /* renamed from: a */
    public static boolean m64131a(SharedPreferences sharedPreferences, Configurations configurations) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (!configurations.f82079f) {
            edit.clear();
        }
        for (Configuration configuration : configurations.f82077d) {
            m64129a(edit, configuration);
        }
        edit.putString("__phenotype_server_token", configurations.f82076c);
        edit.putLong("__phenotype_configuration_version", configurations.f82080g);
        edit.putString("__phenotype_snapshot_token", configurations.f82074a);
        if (edit.commit()) {
            return true;
        }
        Log.w("PhenotypeFlagCommitter", "Failed to commit Phenotype configs to SharedPreferences!");
        return false;
    }

    /* renamed from: a */
    private boolean m64132a(String str, int i) {
        if (i <= 0) {
            String valueOf = String.valueOf(this.f76755b);
            Log.w("PhenotypeFlagCommitter", valueOf.length() == 0 ? new String("No more attempts remaining, giving up for ") : "No more attempts remaining, giving up for ".concat(valueOf));
            return false;
        }
        Configurations a = mo41767a(this.f76755b, str, mo41768a());
        if (a == null || !mo41769b(a)) {
            return false;
        }
        String str2 = a.f82074a;
        if (str2 == null || str2.isEmpty()) {
            return true;
        }
        try {
            aucu.m76783a(this.f76754a.mo25233a(a.f82074a), this.f76756c, TimeUnit.MILLISECONDS);
            bdxy.m91564a(bdyj.m91581a(this.f76755b));
            return true;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            String str3 = this.f76755b;
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 41);
            sb.append("Committing snapshot for ");
            sb.append(str3);
            sb.append(" failed, retrying");
            Log.w("PhenotypeFlagCommitter", sb.toString(), e);
            return m64132a(str, i - 1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Configurations mo41767a(String str, String str2, String str3) {
        try {
            return (Configurations) aucu.m76783a(this.f76754a.mo25236a(str, str2, str3), this.f76756c, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 31);
            sb.append("Retrieving snapshot for ");
            sb.append(str);
            sb.append(" failed");
            Log.e("PhenotypeFlagCommitter", sb.toString(), e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: a */
    public void mo25082a(Configurations configurations) {
        throw new IllegalStateException("Requires implementation");
    }

    /* renamed from: a */
    public boolean mo25219a(String str) {
        sdo.m34959a((Object) str);
        return m64132a(str, 3);
    }
}
