package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: bypn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bypn extends bypx {

    /* renamed from: a */
    public final bngx f167354a;

    /* renamed from: b */
    private final int f167355b;

    public bypn(bngx bngx) {
        bmxy.m108581a(bngx);
        this.f167354a = bngx;
        int i = 0;
        for (int i2 = 0; i2 < this.f167354a.size(); i2++) {
            int a = ((bypx) this.f167354a.get(i2)).mo74416a();
            if (i < a) {
                i = a;
            }
        }
        int i3 = i + 1;
        this.f167355b = i3;
        if (i3 > 4) {
            throw new bypm("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo74416a() {
        return this.f167355b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo74418b() {
        return m125078a(Byte.MIN_VALUE);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        bypx bypx = (bypx) obj;
        if (mo74418b() != bypx.mo74418b()) {
            return mo74418b() - bypx.mo74418b();
        }
        bypn bypn = (bypn) bypx;
        if (this.f167354a.size() != bypn.f167354a.size()) {
            return this.f167354a.size() - bypn.f167354a.size();
        }
        for (int i = 0; i < this.f167354a.size(); i++) {
            int compareTo = ((bypx) this.f167354a.get(i)).compareTo((bypx) bypn.f167354a.get(i));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return bnkn.m109669a(this.f167354a, ((bypn) obj).f167354a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(mo74418b()), this.f167354a});
    }

    public final String toString() {
        if (this.f167354a.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        bnre i = this.f167354a.listIterator();
        while (i.hasNext()) {
            arrayList.add(((bypx) i.next()).toString().replace("\n", "\n  "));
        }
        bmxr a = bmxr.m108544a(",\n  ");
        StringBuilder sb = new StringBuilder("[\n  ");
        a.mo66877a(sb, arrayList);
        sb.append("\n]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo74417a(byqc byqc) {
        try {
            long size = (long) this.f167354a.size();
            if (size >= 0) {
                byqc.f167375a.mo74461b();
                byqc.mo74465a(Byte.MIN_VALUE, size);
                if (size > 0) {
                    byqc.f167375a.mo74462b(size);
                }
                bnre i = this.f167354a.listIterator();
                while (i.hasNext()) {
                    ((bypx) i.next()).mo74417a(byqc);
                }
                return;
            }
            throw new IllegalArgumentException("array length must be positive");
        } catch (IOException e) {
            throw new bypr("Error while encoding CborArray", e);
        }
    }
}
