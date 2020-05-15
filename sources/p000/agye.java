package p000;

import com.felicanetworks.mfc.C0126R;

/* renamed from: agye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agye implements agya {

    /* renamed from: a */
    private final String f66851a;

    /* renamed from: b */
    private final String f66852b;

    /* renamed from: c */
    private agwt f66853c;

    /* renamed from: d */
    private final int f66854d;

    public agye(String str, String str2, int i) {
        this.f66851a = str;
        this.f66852b = str2;
        this.f66854d = i;
    }

    /* renamed from: a */
    public final int mo36175a() {
        return C0126R.C0128layout.purchase_dialog_title_item;
    }

    /* renamed from: a */
    public final void mo36176a(acm acm) {
        agwt agwt = (agwt) acm;
        this.f66853c = agwt;
        int i = this.f66854d;
        if (agqg.m54838E().booleanValue()) {
            agwt.f66753u.setTextColor(C1133kh.m17843b(agwt.f66751s, i));
        }
        agwt agwt2 = this.f66853c;
        String str = this.f66851a;
        String str2 = this.f66852b;
        agwt2.f66752t.setText(str);
        agwt2.f66753u.setText(str2);
    }
}
