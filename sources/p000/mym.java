package p000;

import android.content.Context;

/* renamed from: mym */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mym extends bjr {

    /* renamed from: b */
    public static final lvn f34944b = new lvn("BackupScheduler");

    /* renamed from: c */
    public final Context f34945c;

    /* renamed from: d */
    public int f34946d = 0;

    public mym(Context context) {
        super(context.getSharedPreferences("GmsBackupTransport.backupScheduler", 0));
        this.f34945c = context;
    }
}
