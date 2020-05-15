package p000;

import java.util.ArrayList;

/* renamed from: bhxc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhxc {

    /* renamed from: a */
    public final bhuc f119777a;

    /* renamed from: b */
    public final ArrayList f119778b = new ArrayList();

    /* renamed from: c */
    public bhxf f119779c = new bhxf();

    /* renamed from: d */
    public bhxf f119780d = new bhxf();

    /* renamed from: e */
    public bhxf f119781e = new bhxf();

    /* renamed from: f */
    public bhxf f119782f = new bhxf();

    /* renamed from: g */
    public final bicy f119783g;

    public bhxc(bicy bicy, bhuc bhuc) {
        this.f119783g = bicy;
        this.f119777a = bhuc;
    }

    /* renamed from: a */
    public final String mo64378a() {
        long c = this.f119779c.mo64386c();
        int size = this.f119778b.size();
        StringBuilder sb = new StringBuilder(64);
        sb.append(", last at place time ");
        sb.append(c);
        sb.append(",  ");
        sb.append(size);
        sb.append(" clusters");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo64379a(bhxf bhxf) {
        if (this.f119778b.size() == ((int) cggg.f186820a.mo6606a().mo83686d())) {
            int i = -1;
            long j = Long.MAX_VALUE;
            int i2 = 0;
            while (i2 < this.f119778b.size()) {
                long c = ((bhxf) this.f119778b.get(i2)).mo64386c();
                long j2 = c < j ? c : j;
                if (c < j) {
                    i = i2;
                }
                i2++;
                j = j2;
            }
            if (i >= 0) {
                this.f119778b.remove(i);
            }
        }
        this.f119778b.add(bhxf);
    }
}
