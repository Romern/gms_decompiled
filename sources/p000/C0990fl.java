package p000;

import java.util.ArrayList;

/* renamed from: fl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0990fl {

    /* renamed from: a */
    public int f16829a;

    /* renamed from: b */
    public int f16830b;

    /* renamed from: c */
    public int f16831c;

    /* renamed from: d */
    public int f16832d;

    /* renamed from: e */
    public ArrayList f16833e = new ArrayList();

    public C0990fl(C0986fh fhVar) {
        this.f16829a = fhVar.f16589w;
        this.f16830b = fhVar.f16590x;
        this.f16831c = fhVar.mo10816c();
        this.f16832d = fhVar.mo10823f();
        ArrayList arrayList = fhVar.f16583q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f16833e.add(new C0989fk((C0985fg) arrayList.get(i)));
        }
    }
}
