package p000;

import android.app.backup.SelectBackupTransportCallback;
import android.content.ComponentName;
import android.content.Context;
import java.util.Locale;

/* renamed from: maj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class maj implements mag {

    /* renamed from: a */
    public static final lvn f33333a = new lvn("SwitchTransportTaskO");

    /* renamed from: b */
    public final String f33334b;

    /* renamed from: c */
    private final Context f33335c;

    /* renamed from: d */
    private final lvp f33336d;

    /* renamed from: e */
    private final String f33337e;

    /* renamed from: f */
    private boolean f33338f;

    /* renamed from: g */
    private final SelectBackupTransportCallback f33339g = new mai(this);

    /* renamed from: h */
    private final maf f33340h;

    public maj(Context context, lvp lvp, maf maf, String str, String str2) {
        sdo.m34959a(context);
        this.f33335c = context;
        sdo.m34959a(lvp);
        this.f33336d = lvp;
        sdo.m34959a(maf);
        this.f33340h = maf;
        sdo.m34959a((Object) str);
        this.f33337e = str;
        sdo.m34959a((Object) str2);
        this.f33334b = str2;
    }

    /* renamed from: a */
    public final synchronized void mo19801a() {
        if (!this.f33338f) {
            ComponentName componentName = new ComponentName(this.f33335c, this.f33337e);
            lvp lvp = this.f33336d;
            SelectBackupTransportCallback selectBackupTransportCallback = this.f33339g;
            if (lvp.mo19648f()) {
                lvp.f33054a.selectBackupTransport(componentName, selectBackupTransportCallback);
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo19802b() {
        this.f33338f = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        return;
     */
    /* renamed from: c */
    public final synchronized void mo19806c() {
        int i;
        if (!this.f33338f) {
            String c = this.f33336d.mo19645c();
            if (!"com.google.android.gms/.backup.BackupTransportService".equals(c)) {
                i = "com.google.android.gms/.backup.migrate.service.D2dTransport".equals(c) ? 2 : 0;
            } else {
                i = 1;
            }
            maf maf = this.f33340h;
            if (i != maf.f33326a) {
                maf.mo69136a((Throwable) new map(String.format(Locale.US, "Tried to set transport to %d but set it to %d", Integer.valueOf(maf.f33326a), Integer.valueOf(i))));
                return;
            }
            maf.mo69138b((Object) null);
        }
    }
}
