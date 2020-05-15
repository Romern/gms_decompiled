package p000;

import android.util.Pair;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: amui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amui extends wvd {

    /* renamed from: a */
    private final alsl f75946a;

    /* renamed from: b */
    private final int f75947b;

    public amui(int i, alsl alsl) {
        this.f75947b = i;
        this.f75946a = alsl;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0054, code lost:
        if (p000.cfus.m143109g() == false) goto L_0x005f;
     */
    /* renamed from: b */
    public final List mo29442b() {
        String str;
        String str2 = "sheepdogNotAvailable";
        ArrayList arrayList = new ArrayList();
        int i = this.f75947b;
        if (i != 1) {
            str = i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "BACKUP_AND_SYNC" : "ACCOUNT_SYNC" : "HOME_SCREEN" : "MAIN_ACTIVITY";
        } else {
            str = "UNKNOWN_SCREEN_TYPE";
        }
        if (i != 0) {
            arrayList.add(new Pair("ScreenType", str));
            try {
                BackupAndSyncOptInState backupAndSyncOptInState = (BackupAndSyncOptInState) aucu.m76782a(this.f75946a.mo40712a());
                if (!amup.m63317a(backupAndSyncOptInState)) {
                    if (amup.m63319b(backupAndSyncOptInState)) {
                    }
                    arrayList.add(new Pair("SheepdogAvailability", str2));
                    return arrayList;
                }
                str2 = "sheepdogAvailable";
            } catch (InterruptedException | ExecutionException e) {
                str2 = "sheepdogUnknown";
            }
            arrayList.add(new Pair("SheepdogAvailability", str2));
            return arrayList;
        }
        throw null;
    }
}
