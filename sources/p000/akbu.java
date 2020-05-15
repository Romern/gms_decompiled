package p000;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;

/* renamed from: akbu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akbu {

    /* renamed from: a */
    private final Context f71562a;

    /* renamed from: b */
    private final String f71563b;

    /* renamed from: c */
    private String f71564c;

    /* renamed from: d */
    private akbt f71565d;

    public akbu(Context context, String str) {
        this.f71562a = context;
        this.f71563b = str;
    }

    /* renamed from: a */
    private final boolean m59305a(Account account, ajhg ajhg) {
        FileOutputStream fileOutputStream;
        File a = akhu.m59725a(this.f71562a, account, "nearby_sharing_account_metadata");
        if (!a.exists()) {
            try {
                if (!a.createNewFile()) {
                    bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
                    bnsl.mo68432a("akbu", "a", 238, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Failed to save account metadata to disk.");
                    return false;
                }
            } catch (IOException e) {
                bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
                bnsl2.mo68437a(e);
                bnsl2.mo68432a("akbu", "a", 242, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Failed to save account metadata to disk.");
                return false;
            }
        }
        try {
            fileOutputStream = new FileOutputStream(a);
            ajhg.mo73638a(fileOutputStream);
            fileOutputStream.close();
            return true;
        } catch (IOException e2) {
            bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl3.mo68437a(e2);
            bnsl3.mo68432a("akbu", "a", 251, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Failed to save account metadata to disk.");
            return false;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    private final ajhg m59307b(Account account) {
        FileInputStream fileInputStream;
        File a = akhu.m59725a(this.f71562a, account, "nearby_sharing_account_metadata");
        if (!a.exists()) {
            return ajhg.f70622e;
        }
        try {
            fileInputStream = new FileInputStream(a);
            ajhg ajhg = (ajhg) bxvk.m124011a(ajhg.f70622e, fileInputStream, bxus.m123744c());
            fileInputStream.close();
            return ajhg;
        } catch (IOException e) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("akbu", "b", 222, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Failed to load metadata for %s", account);
            return ajhg.f70622e;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final synchronized String mo39167a() {
        return this.f71563b;
    }

    /* renamed from: b */
    public final synchronized Account mo39171b() {
        akbt akbt = this.f71565d;
        if (akbt == null) {
            return null;
        }
        return ((akbx) akbt).f71569a;
    }

    /* renamed from: c */
    public final synchronized String mo39173c() {
        akbt akbt = this.f71565d;
        if (akbt == null) {
            return null;
        }
        return ((akbx) akbt).f71570b;
    }

    /* renamed from: c */
    public final synchronized void mo39174c(String str) {
        this.f71564c = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        return null;
     */
    /* renamed from: d */
    public final synchronized String mo39175d() {
        Account b = mo39171b();
        if (b != null) {
            ajhg b2 = m59307b(b);
            if (!TextUtils.isEmpty(b2.f70626c)) {
                return b2.f70626c;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        return null;
     */
    /* renamed from: e */
    public final synchronized String mo39176e() {
        Account b = mo39171b();
        if (b != null) {
            ajhg b2 = m59307b(b);
            if (!TextUtils.isEmpty(b2.f70627d)) {
                return b2.f70627d;
            }
        }
    }

    /* renamed from: f */
    public final synchronized String mo39177f() {
        return this.f71564c;
    }

    /* renamed from: g */
    public final synchronized void mo39178g() {
        mo39170a((Account) null);
        this.f71564c = null;
        akhu.m59735b(this.f71562a, "nearby_sharing_account_metadata");
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        bnsl.mo68432a("akbu", "g", 204, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Reset AccountManager.");
    }

    /* renamed from: a */
    static boolean m59306a(Context context, Account account, ajhg ajhg) {
        FileOutputStream fileOutputStream;
        File a = akhu.m59725a(context, account, "nearby_sharing_account_metadata");
        if (!a.exists()) {
            try {
                if (!a.createNewFile()) {
                    bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
                    bnsl.mo68432a("akbu", "a", 238, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Failed to save account metadata to disk.");
                    return false;
                }
            } catch (IOException e) {
                bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
                bnsl2.mo68437a(e);
                bnsl2.mo68432a("akbu", "a", 242, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Failed to save account metadata to disk.");
                return false;
            }
        }
        try {
            fileOutputStream = new FileOutputStream(a);
            ajhg.mo73638a(fileOutputStream);
            fileOutputStream.close();
            return true;
        } catch (IOException e2) {
            bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl3.mo68437a(e2);
            bnsl3.mo68432a("akbu", "a", 251, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Failed to save account metadata to disk.");
            return false;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        return;
     */
    /* renamed from: b */
    public final synchronized void mo39172b(String str) {
        Account b = mo39171b();
        if (b != null) {
            ajhg b2 = m59307b(b);
            if (!str.equals(b2.f70627d)) {
                bxvd bxvd = (bxvd) b2.mo74142c(5);
                bxvd.mo73625a((bxvk) b2);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                ajhg ajhg = (ajhg) bxvd.f164949b;
                ajhg ajhg2 = ajhg.f70622e;
                str.getClass();
                ajhg.f70624a |= 4;
                ajhg.f70627d = str;
                m59305a(b, (ajhg) bxvd.mo74062i());
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo39168a(PrintWriter printWriter) {
        String str;
        printWriter.write(String.format("%s\n", "com.google.android.gms.nearby.sharing.provider.AccountManager"));
        printWriter.write(String.format("  Device Id: %s\n", this.f71563b));
        Object[] objArr = new Object[1];
        akbt akbt = this.f71565d;
        if (akbt != null) {
            str = ((akbx) akbt).f71569a.name;
        } else {
            str = null;
        }
        objArr[0] = str;
        printWriter.write(String.format("  Account Name: %s\n", objArr));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo39169a(String str) {
        Account b = mo39171b();
        if (b != null) {
            ajhg b2 = m59307b(b);
            if (!str.equals(b2.f70626c)) {
                bxvd bxvd = (bxvd) b2.mo74142c(5);
                bxvd.mo73625a((bxvk) b2);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                ajhg ajhg = (ajhg) bxvd.f164949b;
                ajhg ajhg2 = ajhg.f70622e;
                str.getClass();
                ajhg.f70624a |= 2;
                ajhg.f70626c = str;
                m59305a(b, (ajhg) bxvd.mo74062i());
            }
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo39170a(Account account) {
        String str;
        String str2 = null;
        if (account == null) {
            this.f71565d = null;
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("akbu", "a", 76, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Removed active account");
            return true;
        } else if (account.equals(mo39171b())) {
            return true;
        } else {
            ajhg b = m59307b(account);
            if ((b.f70624a & 1) != 0) {
                str = b.f70625b;
            } else {
                try {
                    str2 = gie.m13198c(this.f71562a, account.name);
                } catch (gid | IOException e) {
                    bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68387b();
                    bnsl2.mo68437a(e);
                    bnsl2.mo68432a("akhu", "a", 96, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68409a("Failed to find obfuscated Gaia id for %s.", Objects.hashCode(account));
                }
                if (!TextUtils.isEmpty(str2)) {
                    bxvd bxvd = (bxvd) b.mo74142c(5);
                    bxvd.mo73625a((bxvk) b);
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    ajhg ajhg = (ajhg) bxvd.f164949b;
                    ajhg ajhg2 = ajhg.f70622e;
                    str2.getClass();
                    ajhg.f70624a |= 1;
                    ajhg.f70625b = str2;
                    if (!m59305a(account, (ajhg) bxvd.mo74062i())) {
                        bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68390d();
                        bnsl3.mo68432a("akbu", "a", 97, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl3.mo68420a("Failed to set account %s", account);
                        return false;
                    }
                    str = str2;
                } else {
                    bnsl bnsl4 = (bnsl) ajvp.f71371a.mo68390d();
                    bnsl4.mo68432a("akbu", "a", 91, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl4.mo68420a("Account %s does not have account id, Failed to set as active account", account);
                    return false;
                }
            }
            akbs akbs = new akbs();
            akbs.f71560a = account;
            if (str != null) {
                akbs.f71561b = str;
                String str3 = "";
                if (akbs.f71560a == null) {
                    str3 = " account";
                }
                if (akbs.f71561b == null) {
                    str3 = str3.concat(" accountId");
                }
                if (!str3.isEmpty()) {
                    String valueOf = String.valueOf(str3);
                    throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
                }
                this.f71565d = new akbx(akbs.f71560a, akbs.f71561b);
                srn srn = ajvp.f71371a;
                return true;
            }
            throw new NullPointerException("Null accountId");
        }
    }
}
