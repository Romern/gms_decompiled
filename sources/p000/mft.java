package p000;

import android.app.backup.BackupManagerMonitor;
import android.content.Context;
import android.os.ConditionVariable;

/* renamed from: mft */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mft extends mfr {

    /* renamed from: c */
    public static final lvn f33602c = new lvn("D2dTransportDriverO");

    /* renamed from: d */
    public final ConditionVariable f33603d = new ConditionVariable();

    /* renamed from: e */
    public final BackupManagerMonitor f33604e = new mfs(this);

    /* renamed from: f */
    public boolean f33605f;

    protected mft(Context context, met met) {
        super(context, met);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: lvr.b(android.content.Context, boolean):void
     arg types: [android.content.Context, int]
     candidates:
      lvr.b(android.content.Context, int):void
      lvr.b(android.content.Context, boolean):void */
    /* renamed from: a */
    public final synchronized void mo19945a() {
        meu meu = new meu(this.f33598b);
        synchronized (meu.f33545a) {
            meu.f33548d.mo19653b(meu.f33546b, meu.f33547c.mo19644b() ? 1 : 0);
        }
        synchronized (meu.f33545a) {
            if (!meu.f33547c.mo19644b()) {
                meu.f33547c.mo19642a(true);
            }
        }
        synchronized (meu.f33545a) {
            meu.f33548d.mo19649a(meu.f33546b, meu.f33548d.mo19660e(meu.f33546b) ? 1 : 0);
        }
        synchronized (meu.f33545a) {
            meu.f33548d.mo19654b(meu.f33546b, true);
        }
        this.f33603d.open();
    }

    /* renamed from: b */
    public final void mo19947b() {
        if (!mo19948c()) {
            return;
        }
        if (!this.f33605f) {
            this.f33603d.close();
            f33602c.mo25414c("Shutting down D2dDriver.", new Object[0]);
            mo19949d();
            return;
        }
        f33602c.mo25414c("Shutdown requested while O backup is in progress.", new Object[0]);
    }
}
