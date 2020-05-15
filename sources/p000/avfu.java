package p000;

import android.accounts.Account;
import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: avfu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avfu implements avgn {

    /* renamed from: a */
    public final Context f93108a;

    /* renamed from: b */
    public final beju f93109b;

    /* renamed from: c */
    private final Map f93110c = new ConcurrentHashMap();

    public avfu(Context context, beju beju) {
        this.f93108a = context;
        this.f93109b = beju;
    }

    /* renamed from: a */
    public static final String m78447a() {
        return String.format("%s/%s", "udc", "sc");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        if (r5 != false) goto L_0x0025;
     */
    /* renamed from: a */
    private static boolean m78448a(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            boolean z = true;
            for (File file2 : listFiles) {
                z = z && m78448a(file2);
            }
        }
        return file.delete();
    }

    /* renamed from: a */
    public final bqgg mo51196a(Account account, bqgj bqgj) {
        bqgg bqgg = (bqgg) this.f93110c.get(account);
        if (bqgg == null) {
            synchronized (this) {
                bqgg = (bqgg) this.f93110c.get(account);
                if (bqgg == null) {
                    bqgg b = bqgj.mo25819b(new avft(this, account));
                    this.f93110c.put(account, b);
                    bqgg = b;
                }
            }
        }
        return bqgg;
    }

    /* renamed from: a */
    public final void mo51197a(List list) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                hashSet.add(gik.m13218f(this.f93108a, ((Account) it.next()).name));
            } catch (gid | IOException e) {
                bnsi c = avex.m78395a().mo68388c();
                c.mo68402a((int) chbh.m148013k());
                c.mo68437a(e);
                c.mo68432a("avfu", "a", 101, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68405a("Failed to resolve account ID during wipeout.");
            }
        }
        File[] listFiles = new File(this.f93108a.getFilesDir(), m78447a()).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!hashSet.contains(file.getName()) && !m78448a(file)) {
                    bnsi c2 = avex.m78395a().mo68388c();
                    c2.mo68402a((int) chbh.m148013k());
                    c2.mo68432a("avfu", "a", 115, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c2.mo68405a("Failure during wipeout.");
                }
            }
        }
    }
}
