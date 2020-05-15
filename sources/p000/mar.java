package p000;

import android.app.backup.RestoreObserver;
import android.app.backup.RestoreSet;

/* renamed from: mar */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class mar extends RestoreObserver {

    /* renamed from: a */
    final /* synthetic */ mas f33357a;

    public mar(mas mas) {
        this.f33357a = mas;
    }

    public final void onUpdate(int i, String str) {
        lvn lvn = mas.f33358a;
        String valueOf = String.valueOf(str);
        lvn.mo25412b(valueOf.length() == 0 ? new String("Restoring ") : "Restoring ".concat(valueOf), new Object[0]);
    }

    public final void restoreFinished(int i) {
        mas.f33358a.mo25412b("Restore finished.", new Object[0]);
        this.f33357a.f33360c.endRestoreSession();
        this.f33357a.f33359b.run();
    }

    public final void restoreSetsAvailable(RestoreSet[] restoreSetArr) {
        int i;
        if (restoreSetArr != null && restoreSetArr.length > 0) {
            long j = restoreSetArr[0].token;
            mas mas = this.f33357a;
            lvn lvn = mas.f33358a;
            String str = mas.f33361d;
            if (str != null) {
                i = mas.f33360c.restorePackage(str, mas.f33362e);
            } else {
                i = mas.f33360c.restoreAll(j, mas.f33362e);
            }
            if (i != 0) {
                lvn lvn2 = mas.f33358a;
                StringBuilder sb = new StringBuilder(36);
                sb.append("Unable to start restore, ");
                sb.append(i);
                lvn2.mo25412b(sb.toString(), new Object[0]);
                this.f33357a.f33360c.endRestoreSession();
                this.f33357a.f33359b.run();
                return;
            }
            return;
        }
        mas.f33358a.mo25412b("No restore set found.", new Object[0]);
        this.f33357a.f33360c.endRestoreSession();
        this.f33357a.f33359b.run();
    }

    public final void restoreStarting(int i) {
        lvn lvn = mas.f33358a;
        StringBuilder sb = new StringBuilder(30);
        sb.append("Restoring ");
        sb.append(i);
        sb.append(" packages");
        lvn.mo25412b(sb.toString(), new Object[0]);
    }
}
