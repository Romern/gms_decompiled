package p000;

/* renamed from: best */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class best extends beti {
    public best(berb berb) {
        super(berb);
    }

    /* renamed from: a */
    private final void m95726a(boolean z, boolean z2) {
        long j;
        Object[] objArr = {Boolean.valueOf(z), Boolean.valueOf(z2)};
        if (this.f112401i.mo62795a() && this.f112397e.mo62767cv() && this.f112396d.mo60999o() != Long.MAX_VALUE) {
            if (!z) {
                if (!z2) {
                    j = 0;
                } else {
                    j = 20000;
                }
                mo61107a(new betd(this.f112396d, false, j));
                return;
            }
            mo61132c(39);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: best.a(boolean, boolean):void
     arg types: [int, int]
     candidates:
      beti.a(berw, berx):void
      beti.a(long, berx):boolean
      beti.a(bfnp, bfnp):void
      best.a(boolean, boolean):void */
    /* renamed from: A */
    public final void mo61106A() {
        m95726a(false, false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: berb.a(boolean, boolean):void
     arg types: [int, int]
     candidates:
      berb.a(com.google.android.gms.location.ActivityRecognitionResult, int):com.google.android.gms.location.ActivityRecognitionResult
      berb.a(long, boolean):void
      berb.a(java.util.List, int[]):void
      bglw.a(long, boolean):void
      bgmq.a(java.util.List, int[]):void
      berb.a(boolean, boolean):void */
    /* renamed from: g */
    public final void mo61083g() {
        super.mo61083g();
        this.f112396d.mo60974a(false, true);
        this.f112396d.mo60972a(false);
        if (this.f112396d.f112114B.mo62860d()) {
            this.f112396d.f112114B.mo62859c();
        }
        this.f112396d.f112198y.mo61073b();
    }

    /* renamed from: p */
    public final String mo61093p() {
        return "OffState";
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo61108s() {
        if (this.f112396d.f112114B.mo62860d()) {
            this.f112396d.f112114B.mo62859c();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: best.a(boolean, boolean):void
     arg types: [int, int]
     candidates:
      beti.a(berw, berx):void
      beti.a(long, berx):boolean
      beti.a(bfnp, bfnp):void
      best.a(boolean, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo61109u() {
        m95726a(false, false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: best.a(boolean, boolean):void
     arg types: [int, int]
     candidates:
      beti.a(berw, berx):void
      beti.a(long, berx):boolean
      beti.a(bfnp, bfnp):void
      best.a(boolean, boolean):void */
    /* renamed from: w */
    public final void mo61110w() {
        m95726a(false, true);
    }

    /* renamed from: x */
    public final void mo61111x() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61107a(beti beti) {
        if (!(beti instanceof best)) {
            super.mo61107a(beti);
            return;
        }
        throw new IllegalArgumentException("OffState cannot go to itself.");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: best.a(boolean, boolean):void
     arg types: [boolean, int]
     candidates:
      beti.a(berw, berx):void
      beti.a(long, berx):boolean
      beti.a(bfnp, bfnp):void
      best.a(boolean, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61094a(boolean z) {
        m95726a(z, false);
    }
}
