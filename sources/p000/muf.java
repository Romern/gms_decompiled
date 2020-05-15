package p000;

import android.app.backup.BackupManagerMonitor;
import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: muf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class muf extends BackupManagerMonitor {

    /* renamed from: a */
    final /* synthetic */ mug f34753a;

    public muf(mug mug) {
        this.f34753a = mug;
    }

    public final void onEvent(Bundle bundle) {
        mug.f34754a.mo25409a("Backup monitor event", new Object[0]);
        muc muc = this.f34753a.f34756c;
        if (!ccli.f179330a.mo6606a().mo76271d()) {
            muc.f34740a.mo25409a("Backup manager monitor logs disabled, not logging", new Object[0]);
            return;
        }
        msz a = lyu.m24686a(bundle);
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((bxvk) a);
        if (bxvd == null) {
            muc.f34740a.mo25418e("Error logging monitor event", new Object[0]);
            return;
        }
        msz msz = (msz) bxvd.f164949b;
        String str = msz.f34612e;
        if ((msz.f34608a & 8) == 0) {
            str = "MISC_MONITOR_EVENTS";
        }
        mub a2 = muc.mo20243a(str);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        msz msz2 = (msz) bxvd.f164949b;
        msz msz3 = msz.f34606j;
        msz2.f34608a &= -9;
        msz2.f34612e = msz.f34606j.f34612e;
        msz msz4 = (msz) bxvd.mo74062i();
        if (a2.f34739b == null) {
            a2.f34739b = new ArrayList();
        }
        a2.f34739b.add(msz4);
        muc.f34741b.put(str, a2);
    }
}
