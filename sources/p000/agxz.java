package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.mobiledataplan.MdpFlexTimeWindow;

/* renamed from: agxz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agxz implements agya {

    /* renamed from: a */
    private final MdpFlexTimeWindow f66834a;

    /* renamed from: b */
    private final String f66835b;

    /* renamed from: c */
    private final String f66836c;

    /* renamed from: d */
    private final boolean f66837d;

    /* renamed from: e */
    private final String f66838e;

    /* renamed from: f */
    private agwi f66839f;

    public agxz(MdpFlexTimeWindow mdpFlexTimeWindow, String str, String str2, boolean z, String str3) {
        this.f66834a = mdpFlexTimeWindow;
        this.f66835b = str;
        this.f66836c = str2;
        this.f66837d = z;
        this.f66838e = str3;
    }

    /* renamed from: a */
    public final int mo36175a() {
        return C0126R.C0128layout.flex_win_item;
    }

    /* renamed from: a */
    public final void mo36176a(acm acm) {
        agwi agwi = (agwi) acm;
        this.f66839f = agwi;
        agwi.f66714v = this.f66837d;
        agwi.mo36162a(this.f66834a, this.f66835b, this.f66836c, this.f66838e);
    }
}
