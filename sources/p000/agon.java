package p000;

import com.google.android.gms.mobiledataplan.MdpDataPlanStatus;
import com.google.android.gms.mobiledataplan.MdpFlexTimeWindow;

/* renamed from: agon */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agon {

    /* renamed from: a */
    public final MdpDataPlanStatus f66186a = new MdpDataPlanStatus();

    /* renamed from: a */
    public final void mo35781a(int i) {
        if (MdpDataPlanStatus.f80161a.containsKey(Integer.valueOf(i))) {
            this.f66186a.f80169h = i;
            return;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Illegal overusage policy: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final void mo35782a(long j) {
        this.f66186a.f80166e = j;
    }

    /* renamed from: a */
    public final void mo35783a(String str) {
        this.f66186a.f80180s = str;
    }

    /* renamed from: a */
    public final void mo35784a(MdpFlexTimeWindow[] mdpFlexTimeWindowArr) {
        this.f66186a.f80168g = mdpFlexTimeWindowArr;
    }

    /* renamed from: b */
    public final void mo35785b(long j) {
        this.f66186a.f80167f = j;
    }

    /* renamed from: b */
    public final void mo35786b(String str) {
        this.f66186a.f80179r = str;
    }

    /* renamed from: c */
    public final void mo35787c(long j) {
        this.f66186a.f80177p = j;
    }

    /* renamed from: c */
    public final void mo35788c(String str) {
        this.f66186a.f80164c = str;
    }

    /* renamed from: d */
    public final void mo35789d(long j) {
        this.f66186a.f80178q = j;
    }

    /* renamed from: d */
    public final void mo35790d(String str) {
        this.f66186a.f80171j = str;
    }

    /* renamed from: e */
    public final void mo35791e(long j) {
        this.f66186a.f80176o = j;
    }

    /* renamed from: e */
    public final void mo35792e(String str) {
        this.f66186a.f80170i = str;
    }

    /* renamed from: f */
    public final void mo35793f(String str) {
        this.f66186a.f80163b = str;
    }

    /* renamed from: g */
    public final void mo35794g(String str) {
        this.f66186a.f80165d = str;
    }
}
