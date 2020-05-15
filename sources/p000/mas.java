package p000;

import android.app.backup.RestoreObserver;
import android.app.backup.RestoreSession;
import android.content.Context;
import java.io.File;

/* renamed from: mas */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mas {

    /* renamed from: a */
    public static final lvn f33358a = new lvn("AppDataRestoreHelper");

    /* renamed from: b */
    public Runnable f33359b;

    /* renamed from: c */
    public RestoreSession f33360c;

    /* renamed from: d */
    public String f33361d;

    /* renamed from: e */
    public final RestoreObserver f33362e = new mar(this);

    /* renamed from: f */
    private final Context f33363f;

    /* renamed from: g */
    private final lvp f33364g;

    /* renamed from: h */
    private boolean f33365h = false;

    public mas(Context context, String str, lvp lvp) {
        bmxy.m108581a(context);
        this.f33363f = context;
        bmxy.m108581a(str);
        this.f33361d = str;
        bmxy.m108581a(lvp);
        this.f33364g = lvp;
    }

    /* renamed from: a */
    public static boolean m24774a(String str, File file) {
        File file2 = new File(file, str);
        return file2.exists() && file2.isFile();
    }

    /* renamed from: a */
    public final void mo19813a(Runnable runnable) {
        RestoreSession restoreSession;
        if (new mcb(this.f33363f).mo19847b("restore_token_file").exists()) {
            f33358a.mo25412b("Starting app data restore.", new Object[0]);
            this.f33359b = runnable;
            try {
                RestoreSession a = this.f33364g.mo19640a();
                this.f33360c = a;
                if (a == null) {
                    f33358a.mo25418e("No restore session", new Object[0]);
                } else if (a.getAvailableRestoreSets(this.f33362e) != 0) {
                    f33358a.mo25418e("Couldn't find restore set.", new Object[0]);
                } else {
                    this.f33365h = true;
                    runnable = null;
                }
            } finally {
                if (runnable != null) {
                    runnable.run();
                }
                if (!this.f33365h && (restoreSession = this.f33360c) != null) {
                    restoreSession.endRestoreSession();
                }
            }
        } else {
            f33358a.mo25414c("Skipping system restore.", new Object[0]);
            runnable.run();
        }
    }

    public mas(Context context, lvp lvp) {
        bmxy.m108581a(context);
        this.f33363f = context;
        bmxy.m108581a(lvp);
        this.f33364g = lvp;
    }
}
