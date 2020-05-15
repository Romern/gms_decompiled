package p000;

/* renamed from: bnrx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnrx extends bnta {

    /* renamed from: a */
    public Object[] f132051a = new Object[8];

    /* renamed from: b */
    public int f132052b = 0;

    /* renamed from: a */
    public final int mo68393a() {
        return this.f132052b;
    }

    /* renamed from: b */
    public final Object mo68396b(int i) {
        if (i < this.f132052b) {
            return this.f132051a[i + i + 1];
        }
        throw new IndexOutOfBoundsException();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata{");
        for (int i = 0; i < this.f132052b; i++) {
            sb.append(" '");
            sb.append(mo68395a(i));
            sb.append("': ");
            sb.append(mo68396b(i));
        }
        sb.append(" }");
        return sb.toString();
    }

    /* renamed from: a */
    public final int mo68394a(bnsj bnsj) {
        for (int i = 0; i < this.f132052b; i++) {
            if (this.f132051a[i + i].equals(bnsj)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final bnsj mo68395a(int i) {
        if (i < this.f132052b) {
            return (bnsj) this.f132051a[i + i];
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: b */
    public final Object mo68397b(bnsj bnsj) {
        int a = mo68394a(bnsj);
        if (a != -1) {
            return bnsj.mo68460a(this.f132051a[a + a + 1]);
        }
        return null;
    }
}
