package p000;

/* renamed from: bhxa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bhxa {

    /* renamed from: d */
    private static final C1245ok f119769d;

    /* renamed from: a */
    public bhuc f119770a;

    /* renamed from: b */
    protected bhxb f119771b;

    /* renamed from: c */
    protected final bicy f119772c;

    /* renamed from: e */
    private final bhuk f119773e;

    static {
        C1245ok okVar = new C1245ok();
        okVar.put(bpol.AT_PLACE, 0);
        okVar.put(bpol.IN_TRANSIT, 0);
        C1245ok okVar2 = new C1245ok();
        okVar2.put(bpol.AT_PLACE, 1);
        okVar2.put(bpol.IN_TRANSIT, 0);
        C1245ok okVar3 = new C1245ok();
        okVar3.put(bpol.AT_PLACE, 0);
        okVar3.put(bpol.IN_TRANSIT, 1);
        C1245ok okVar4 = new C1245ok();
        okVar4.put(null, okVar);
        okVar4.put(bpol.AT_PLACE, okVar2);
        okVar4.put(bpol.IN_TRANSIT, okVar3);
        f119769d = okVar4;
    }

    public bhxa(bhuk bhuk, bicy bicy) {
        this.f119772c = bicy;
        this.f119773e = bhuk;
        mo64355a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo64374a(bpol bpol) {
        C1245ok okVar = f119769d;
        bhxb bhxb = this.f119771b;
        return ((Integer) ((C1245ok) okVar.get(bhxb != null ? bhxb.f119775b.f119765a : null)).get(bpol)).intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract bhxb mo64354a(bhtx bhtx);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo64356a(bhuk bhuk, bhtx bhtx, bhxb bhxb);

    /* renamed from: b */
    public final bhxb mo64376b(bhtx bhtx) {
        bhxb a = mo64354a(bhtx);
        mo64356a(this.f119773e, bhtx, a);
        bhuc bhuc = this.f119770a;
        if (bhuc.f119612a.size() == 10) {
            bhuc.f119612a.removeFirst();
        }
        bhuc.f119612a.addLast(bhuc.f119613b.toString());
        bhuc.f119613b = new StringBuilder();
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bhxb mo64375a(int i, bpol bpol, long j, bhub bhub, bhts bhts) {
        bhwz bhwz;
        long j2;
        bhwz bhwz2;
        bhwz bhwz3;
        bhxb bhxb = this.f119771b;
        if (bhxb != null) {
            bhwz = bhxb.f119775b;
        } else {
            bhwz = null;
        }
        if (bhwz != null) {
            j2 = bhwz.f119766b;
        } else {
            j2 = 0;
        }
        if (i != 0) {
            if (bpol == bpol.AT_PLACE) {
                bhwz3 = bhwz.m101680a(j2, bhub, bhts);
            } else {
                bhwz3 = bhwz.m101679a(j2);
            }
            this.f119771b = new bhxb(1, bhwz3, null);
        } else {
            if (bpol == bpol.AT_PLACE) {
                bhwz2 = bhwz.m101680a(j, bhub, bhts);
            } else {
                bhwz2 = bhwz.m101679a(j);
            }
            this.f119771b = new bhxb(0, bhwz2, bhwz);
        }
        return this.f119771b;
    }

    /* renamed from: a */
    public void mo64355a() {
        this.f119770a = new bhuc();
        this.f119771b = null;
    }
}
