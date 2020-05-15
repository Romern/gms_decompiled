package p000;

import android.app.Notification;
import android.app.backup.BackupObserver;

/* renamed from: mue */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class mue extends BackupObserver {

    /* renamed from: a */
    final /* synthetic */ mud f34751a;

    /* renamed from: b */
    final /* synthetic */ mug f34752b;

    public mue(mug mug, mud mud) {
        this.f34752b = mug;
        this.f34751a = mud;
    }

    public final void backupFinished(int i) {
        mug mug = this.f34752b;
        lvn lvn = mug.f34754a;
        mug.f34757d.mo69138b(Integer.valueOf(i));
    }

    public final void onResult(String str, int i) {
        mqn mqn;
        if (!"@pm@".equals(str)) {
            mug.f34754a.logVerbose("Backup done for %s, success: %d", str, Integer.valueOf(i));
            muc muc = this.f34752b.f34756c;
            if (i == -1005) {
                mqn = mqn.ERROR_TRANSPORT_QUOTA_EXCEEDED;
            } else if (i == -1000) {
                mqn = mqn.ERROR_TRANSPORT_ABORTED;
            } else if (i == 0) {
                mqn = mqn.SUCCESS;
            } else if (i == -1003) {
                mqn = mqn.ERROR_AGENT_FAILURE;
            } else if (i != -1002) {
                switch (i) {
                    case -2003:
                        mqn = mqn.ERROR_BACKUP_CANCELLED;
                        break;
                    case -2002:
                        mqn = mqn.ERROR_PACKAGE_NOT_FOUND;
                        break;
                    case -2001:
                        mqn = mqn.ERROR_BACKUP_NOT_ALLOWED;
                        break;
                    default:
                        mqn = mqn.BACKUP_OBSERVER_RESULT_UNSPECIFIED;
                        break;
                }
            } else {
                mqn = mqn.ERROR_TRANSPORT_PACKAGE_REJECTED;
            }
            muc.f34740a.logVerbose("Logging backup result for package: %s, backupObserverResult: %s", str, mqn);
            mub a = muc.mo20243a(str);
            a.f34738a = mqn;
            muc.f34741b.put(str, a);
            mud mud = this.f34751a;
            int i2 = mud.f34747d;
            if (i2 <= 0) {
                mud.f34744a.mo25416d("The total number of packages was not updated, cannot set progress.", new Object[0]);
            } else {
                int i3 = mud.f34748e;
                if (i3 < i2) {
                    Notification.Builder builder = mud.f34746c;
                    int i4 = i3 + 1;
                    mud.f34748e = i4;
                    builder.setProgress(i2, i4, false);
                    mud.mo20246a();
                } else {
                    mud.f34744a.mo25416d("The counter of backed up packages is already max, cannot set progress", new Object[0]);
                }
            }
            mug mug = this.f34752b;
            int i5 = mug.f34759f + 1;
            mug.f34759f = i5;
            mug.f34755b.mo20252a(mug.f34758e, i5);
        }
    }
}
