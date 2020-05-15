package p000;

import android.content.SyncResult;
import java.util.Locale;
import java.util.Set;

/* renamed from: vck */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vck implements vcn {

    /* renamed from: a */
    public final Set f49032a;

    /* renamed from: b */
    private final uhn f49033b;

    /* renamed from: c */
    private final uih f49034c;

    /* renamed from: d */
    private final int f49035d;

    public vck(vpu vpu, uih uih, int i) {
        this.f49033b = vpu.f49757d;
        sdo.m34959a(uih);
        this.f49034c = uih;
        this.f49035d = i;
        this.f49032a = this.f49033b.mo27431d(uih);
        for (uli uli : this.f49033b.mo27391a(uih, uzz.APPDATA)) {
            if (uli.mo27691c() || uli.mo27692d() >= ((long) i)) {
                this.f49032a.removeAll(((uzu) uli.mo27690b()).f48783a);
            }
        }
    }

    /* renamed from: a */
    public final void mo28162a(SyncResult syncResult) {
    }

    /* renamed from: a */
    public final boolean mo28164a() {
        return false;
    }

    /* renamed from: b */
    public final String mo28165b() {
        return String.format(Locale.US, "FullAppDataOnlySyncAlgorithm[%s]", bnjd.m109578a(this.f49032a));
    }

    /* renamed from: a */
    public final void mo28163a(vbi vbi, vks vks, SyncResult syncResult) {
        for (String str : this.f49032a) {
            uli a = this.f49033b.mo27405a(this.f49034c, new uzu(bnic.m109489a(str)), Long.MAX_VALUE);
            vbi.mo28197a(a.f48118a, Long.valueOf(a.f48366m), this.f49034c, this.f49035d, new vbs(a, vbj.m39935a(vbj.m39934a(syncResult), Long.MAX_VALUE)), vks);
        }
    }
}
