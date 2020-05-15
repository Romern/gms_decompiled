package p000;

/* renamed from: bvcu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bvcu {

    /* renamed from: a */
    bvac f155608a = bvac.OPERATION_STATUS_PENDING;

    /* renamed from: b */
    private final String f155609b;

    /* renamed from: c */
    private final Runnable f155610c;

    public bvcu(String str, Runnable runnable) {
        this.f155609b = str;
        this.f155610c = runnable;
        srn srn = bvcm.f155598a;
    }

    /* renamed from: a */
    private final void m120924a(bvac bvac, bvac... bvacArr) {
        bvac bvac2 = this.f155608a;
        if (bvacArr != null) {
            int length = bvacArr.length;
            int i = 0;
            while (i < length) {
                if (bvacArr[i] != bvac2) {
                    i++;
                } else {
                    this.f155608a = bvac;
                    this.f155610c.run();
                    return;
                }
            }
        }
        bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
        bnsl.mo68437a(new IllegalStateException());
        bnsl.mo68432a("bvcu", "a", 69, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68424a("Invalid state transition from %s to %s", this.f155608a, bvac);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo73318b() {
        m120924a(bvac.OPERATION_STATUS_ACTIVE, bvac.OPERATION_STATUS_STARTING);
        srn srn = bvcm.f155598a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo73319c() {
        m120924a(bvac.OPERATION_STATUS_CANCELLED, bvac.OPERATION_STATUS_PENDING, bvac.OPERATION_STATUS_STARTING, bvac.OPERATION_STATUS_ACTIVE);
        srn srn = bvcm.f155598a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo73320d() {
        m120924a(bvac.OPERATION_STATUS_FINISHED, bvac.OPERATION_STATUS_CANCELLED, bvac.OPERATION_STATUS_ACTIVE);
        srn srn = bvcm.f155598a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo73321e() {
        if (this.f155608a == bvac.OPERATION_STATUS_FAILED || this.f155608a == bvac.OPERATION_STATUS_FINISHED) {
            bnsl bnsl = (bnsl) bvcm.f155598a.mo68388c();
            bnsl.mo68432a("bvcu", "e", 53, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68424a("%s cannot fail, in status: %s", this.f155609b, this.f155608a);
            return;
        }
        m120924a(bvac.OPERATION_STATUS_FAILED, bvac.OPERATION_STATUS_PENDING, bvac.OPERATION_STATUS_STARTING, bvac.OPERATION_STATUS_ACTIVE, bvac.OPERATION_STATUS_MISSING, bvac.OPERATION_STATUS_CANCELLED);
        srn srn = bvcm.f155598a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo73322f() {
        return this.f155608a == bvac.OPERATION_STATUS_PENDING;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo73323g() {
        return this.f155608a == bvac.OPERATION_STATUS_PENDING;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo73324h() {
        return this.f155608a == bvac.OPERATION_STATUS_PENDING || this.f155608a == bvac.OPERATION_STATUS_STARTING || this.f155608a == bvac.OPERATION_STATUS_ACTIVE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final boolean mo73325i() {
        return this.f155608a == bvac.OPERATION_STATUS_PENDING || this.f155608a == bvac.OPERATION_STATUS_ACTIVE || this.f155608a == bvac.OPERATION_STATUS_CANCELLED;
    }

    public final String toString() {
        bvac bvac = bvac.OPERATION_STATUS_UNKNOWN;
        switch (this.f155608a.ordinal()) {
            case 1:
                return "OPERATION_STATUS_ACTIVE";
            case 2:
                return "OPERATION_STATUS_CANCELLED";
            case 3:
                return "OPERATION_STATUS_FINISHED";
            case 4:
                return "OPERATION_STATUS_FAILED";
            case 5:
                return "OPERATION_STATUS_MISSING";
            case 6:
                return "OPERATION_STATUS_PENDING";
            case 7:
                return "OPERATION_STATUS_STARTING";
            case 8:
                return "OPERATION_STATUS_UPDATE_FAILED";
            default:
                return "OPERATION_STATUS_UNKNOWN";
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo73317a() {
        m120924a(bvac.OPERATION_STATUS_STARTING, bvac.OPERATION_STATUS_PENDING);
        srn srn = bvcm.f155598a;
    }
}
