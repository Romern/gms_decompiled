package p000;

import com.felicanetworks.mfc.C0126R;

/* renamed from: agxw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agxw implements agya {

    /* renamed from: a */
    private final String f66823a;

    /* renamed from: b */
    private agwz f66824b;

    public agxw(String str) {
        this.f66823a = str;
    }

    /* renamed from: a */
    public final int mo36175a() {
        return C0126R.C0128layout.separator_line_item;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: agwz.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      acm.a(int, int):void
      acm.a(int, boolean):void
      acm.a(acc, boolean):void
      agwz.a(java.lang.String, boolean):void */
    /* renamed from: a */
    public final void mo36176a(acm acm) {
        agwz agwz = (agwz) acm;
        this.f66824b = agwz;
        agwz.mo36177a(this.f66823a, true);
    }
}
