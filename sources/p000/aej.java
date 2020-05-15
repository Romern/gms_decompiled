package p000;

/* renamed from: aej */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aej {

    /* renamed from: a */
    public final C1245ok f337a = new C1245ok();

    /* renamed from: b */
    public final C1230nw f338b = new C1230nw();

    /* renamed from: a */
    public final abo mo527a(acm acm, int i) {
        aeh aeh;
        abo abo;
        int a = this.f337a.mo15616a(acm);
        if (a >= 0 && (aeh = (aeh) this.f337a.mo15621c(a)) != null) {
            int i2 = aeh.f334a;
            if ((i2 & i) != 0) {
                int i3 = (i ^ -1) & i2;
                aeh.f334a = i3;
                if (i == 4) {
                    abo = aeh.f335b;
                } else if (i == 8) {
                    abo = aeh.f336c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    this.f337a.mo8152d(a);
                    aeh.m609a(aeh);
                }
                return abo;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo532b(acm acm) {
        aeh aeh = (aeh) this.f337a.get(acm);
        if (aeh == null) {
            aeh = aeh.m608a();
            this.f337a.put(acm, aeh);
        }
        aeh.f334a |= 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo534c(acm acm) {
        aeh aeh = (aeh) this.f337a.get(acm);
        if (aeh != null) {
            aeh.f334a &= -2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo535d(acm acm) {
        int b = this.f338b.mo15537b() - 1;
        while (true) {
            if (b < 0) {
                break;
            } else if (acm == this.f338b.mo15538b(b)) {
                C1230nw nwVar = this.f338b;
                if (nwVar.f26772c[b] != C1230nw.f26770a) {
                    nwVar.f26772c[b] = C1230nw.f26770a;
                    nwVar.f26771b = true;
                }
            } else {
                b--;
            }
        }
        aeh aeh = (aeh) this.f337a.remove(acm);
        if (aeh != null) {
            aeh.m609a(aeh);
        }
    }

    /* renamed from: b */
    public final void mo533b(acm acm, abo abo) {
        aeh aeh = (aeh) this.f337a.get(acm);
        if (aeh == null) {
            aeh = aeh.m608a();
            this.f337a.put(acm, aeh);
        }
        aeh.f336c = abo;
        aeh.f334a |= 8;
    }

    /* renamed from: a */
    public final void mo528a() {
        this.f337a.clear();
        this.f338b.mo15542c();
    }

    /* renamed from: a */
    public final void mo529a(long j, acm acm) {
        this.f338b.mo15540b(j, acm);
    }

    /* renamed from: a */
    public final void mo530a(acm acm, abo abo) {
        aeh aeh = (aeh) this.f337a.get(acm);
        if (aeh == null) {
            aeh = aeh.m608a();
            this.f337a.put(acm, aeh);
        }
        aeh.f335b = abo;
        aeh.f334a |= 4;
    }

    /* renamed from: a */
    public final boolean mo531a(acm acm) {
        aeh aeh = (aeh) this.f337a.get(acm);
        return (aeh == null || (aeh.f334a & 1) == 0) ? false : true;
    }
}
