package p000;

/* renamed from: ds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class C0942ds extends C0958eh {
    public C0942ds(C0953ec ecVar) {
        super(ecVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo9522a(C0939dp dpVar, Object obj);

    /* renamed from: a */
    public final void mo9523a(Iterable iterable) {
        C0939dp b = mo10124b();
        try {
            for (Object obj : iterable) {
                mo9522a(b, obj);
                b.mo9362a();
            }
        } finally {
            mo10123a(b);
        }
    }

    /* renamed from: a */
    public final void mo9524a(Object[] objArr) {
        C0939dp b = mo10124b();
        try {
            mo9522a(b, objArr[0]);
            b.mo9362a();
        } finally {
            mo10123a(b);
        }
    }
}
