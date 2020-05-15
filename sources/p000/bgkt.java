package p000;

import android.telephony.TelephonyManager;
import java.util.List;

/* renamed from: bgkt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgkt extends TelephonyManager.CellInfoCallback {

    /* renamed from: a */
    final /* synthetic */ bgkw f116721a;

    /* renamed from: b */
    private final long f116722b;

    /* renamed from: c */
    private final bghx f116723c;

    public bgkt(bgkw bgkw, bghx bghx, long j) {
        this.f116721a = bgkw;
        this.f116723c = bghx;
        this.f116722b = j;
    }

    public final void onCellInfo(List list) {
        bfmn a = this.f116721a.mo62942a(list, this.f116722b, bfmn.f114411a);
        if (a == null) {
            this.f116723c.mo62834a(null, -1);
            return;
        }
        this.f116723c.mo62834a(new bfmn[]{a}, 0);
    }

    public final void onError(int i, Throwable th) {
        if (th != null) {
            StringBuilder sb = new StringBuilder(33);
            sb.append("CellInfo errorCode is ");
            sb.append(i);
            sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder(33);
            sb2.append("CellInfo errorCode is ");
            sb2.append(i);
            sb2.toString();
        }
        if (ceze.f183524a.mo6606a().enableTelephonyOnError()) {
            this.f116723c.mo62834a(new bfmn[0], i);
        }
    }
}
