package p000;

import android.accounts.Account;
import android.app.backup.BackupManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Set;

/* renamed from: apam */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apam {

    /* renamed from: a */
    public static final boolean f84036a = true;

    /* renamed from: b */
    private static final aoyh f84037b = aoyh.m69805a("ContactsLoggerDecision");

    static {
        int i = apaa.f83970a;
    }

    /* renamed from: a */
    public static void m69966a(apal apal) {
        apal.f84033d = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01a1 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01b1  */
    /* renamed from: a */
    public static boolean m69967a(Context context, apbe apbe, lsp lsp, apal apal) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (!cgij.m145544b() && !cgij.m145558p() && !cgij.m145545c()) {
            return false;
        }
        if (cgij.m145544b()) {
            z = Settings.Secure.getInt(context.getContentResolver(), "user_full_data_backup_aware", 0) != 0;
        } else {
            z = false;
        }
        if (!cgij.m145545c()) {
            z2 = false;
        } else if (Settings.Secure.getInt(context.getContentResolver(), "backup_enabled:com.android.calllogbackup", 0) == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        aoyj a = aoyj.m69819a();
        boolean c = cgij.m145545c();
        bxvd da = bzel.f169667p.mo74144da();
        bxvd da2 = bzdw.f169590d.mo74144da();
        bxvd da3 = bzdx.f169595q.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bzdw bzdw = (bzdw) da2.f164949b;
        bzdw.f169592a = z;
        bzdw.f169593b = z2;
        bzdw.f169594c = c;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bzdw bzdw2 = (bzdw) da2.mo74062i();
        bzdw2.getClass();
        ((bzdx) da3.f164949b).f169609m = bzdw2;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzdx bzdx = (bzdx) da3.mo74062i();
        bzdx.getClass();
        ((bzel) da.f164949b).f169675g = bzdx;
        a.mo46992a(da);
        if (z || z2) {
            int i = Build.VERSION.SDK_INT;
            try {
                z3 = new BackupManager(context).isBackupEnabled();
            } catch (SecurityException e) {
                f84037b.mo46985d("SecurityException: Unable to verify if backup is enabled.");
                aoyp.m69851a(context).mo47009a(e, cgjy.m145765l());
                z3 = false;
            }
            if (z3) {
                Account a2 = lsp.mo19591a();
                if (a2 != null && !TextUtils.isEmpty(a2.name)) {
                    apal.f84030a = a2.name;
                }
            }
            if (cgij.m145558p()) {
                bmxv a3 = apbe.mo47076a();
                if (a3.mo66813a()) {
                    if (cgij.f186992a.mo6606a().mo83863N()) {
                        Set<String> b = apbe.mo47078b((String) a3.mo66814b());
                        if (!b.isEmpty()) {
                            apal.f84031b.clear();
                            for (String str : b) {
                                if (!TextUtils.isEmpty(str)) {
                                    apal.f84031b.add(str);
                                }
                            }
                            z4 = true;
                        }
                    } else if (apbe.mo47077a((String) a3.mo66814b())) {
                        String str2 = (String) a3.mo66814b();
                        if (!TextUtils.isEmpty(str2)) {
                            apal.f84031b.clear();
                            apal.f84031b.add(str2);
                        }
                        String str3 = (String) a3.mo66814b();
                        if (cgij.f186992a.mo6606a().mo83859J()) {
                            SharedPreferences a4 = aozj.m69902a(context);
                            if (!str3.equals(a4.getString("romanesco-contacts-logger-full-upload-account", ""))) {
                                a4.edit().putString("romanesco-contacts-logger-full-upload-account", str3).putLong("romanesco-contacts-logger-full-upload-timestamp", 0).putLong("romanesco-contacts-grpc-full-upload-timestamp", 0).apply();
                                z4 = true;
                            }
                        }
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z3 && !z4) {
                        return false;
                    }
                    new Object[1][0] = z3 ? apal.f84030a : "Empty";
                    if (z4) {
                        Iterator it = apal.f84031b.iterator();
                        while (it.hasNext()) {
                            Object[] objArr = {(String) it.next()};
                        }
                    }
                    return true;
                }
            }
            z4 = false;
            if (!z3) {
                return false;
            }
            new Object[1][0] = z3 ? apal.f84030a : "Empty";
            if (z4) {
            }
            return true;
        }
        z3 = false;
        if (cgij.m145558p()) {
        }
        z4 = false;
        if (!z3) {
        }
        new Object[1][0] = z3 ? apal.f84030a : "Empty";
        if (z4) {
        }
        return true;
    }
}
