package p000;

import java.util.LinkedList;
import java.util.List;

/* renamed from: aqsv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqsv {

    /* renamed from: a */
    public final List f86722a;

    /* renamed from: b */
    protected int f86723b;

    /* renamed from: c */
    public List f86724c;

    public aqsv() {
        this.f86722a = new LinkedList();
    }

    /* renamed from: a */
    public final void mo48133a(List list) {
        this.f86723b = 2;
        this.f86724c = list;
        for (aqso aqso : this.f86722a) {
            aqso.mo48132a();
        }
    }

    public aqsv(byte[] bArr) {
        this.f86722a = new LinkedList();
        this.f86723b = 1;
    }
}
