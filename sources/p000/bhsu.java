package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Arrays;

/* renamed from: bhsu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhsu {

    /* renamed from: a */
    public final bvoa f119498a;

    /* renamed from: b */
    public final bvnw f119499b;

    /* renamed from: c */
    public final String f119500c;

    public bhsu(bvoa bvoa, bvnw bvnw, String str) {
        this.f119498a = bvoa;
        this.f119499b = bvnw;
        this.f119500c = str;
    }

    /* renamed from: a */
    public static bhsu m101471a(bvoa bvoa) {
        return m101472a(bvoa, (bvnw) null);
    }

    /* renamed from: b */
    public final int mo64227b() {
        return this.f119498a.f156999d;
    }

    /* renamed from: c */
    public final int mo64228c() {
        return this.f119498a.f157000e;
    }

    /* renamed from: d */
    public final boolean mo64229d() {
        return mo64226a(2, 3);
    }

    /* renamed from: e */
    public final boolean mo64230e() {
        return mo64226a(3, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bhsu) {
            bhsu bhsu = (bhsu) obj;
            return bhxi.m101705a(this.f119500c, bhsu.f119500c) && bhxi.m101705a(this.f119499b, bhsu.f119499b);
        }
    }

    /* renamed from: f */
    public final boolean mo64232f() {
        return mo64226a(2, 2);
    }

    /* renamed from: g */
    public final boolean mo64233g() {
        return mo64226a(3, 2);
    }

    /* renamed from: h */
    public final long mo64234h() {
        bvni bvni = this.f119498a.f156997b;
        if (bvni == null) {
            bvni = bvni.f156861b;
        }
        return bvni.f156863a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f119500c});
    }

    /* renamed from: i */
    public final bvni mo64236i() {
        bvoa bvoa = this.f119498a;
        if ((bvoa.f156996a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) == 0) {
            return null;
        }
        bvni bvni = bvoa.f157007l;
        if (bvni == null) {
            bvni = bvni.f156861b;
        }
        if (bvni.f156863a == 0) {
            return null;
        }
        bvni bvni2 = this.f119498a.f157007l;
        return bvni2 == null ? bvni.f156861b : bvni2;
    }

    public final String toString() {
        String str = this.f119500c;
        String str2 = this.f119498a.f157001f;
        int b = mo64227b();
        int c = mo64228c();
        boolean z = this.f119499b != null;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 106 + String.valueOf(str2).length());
        sb.append("PlaceCandidate{ id=");
        sb.append(str);
        sb.append(" prominentCategory=");
        sb.append(str2);
        sb.append(" latE7=");
        sb.append(b);
        sb.append(" lngE7=");
        sb.append(c);
        sb.append(" hasPersonalizedPlaceInfo=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public static bhsu m101472a(bvoa bvoa, bvnw bvnw) {
        String str;
        int i = bvoa.f156996a;
        if ((i & 1) != 0) {
            if ((i & AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE) != 0) {
                bvnx bvnx = bvoa.f157009n;
                if (bvnx == null) {
                    bvnx = bvnx.f156978c;
                }
                str = bhxh.m101703a(bvnx);
            } else {
                bvni bvni = bvoa.f156997b;
                if (bvni == null) {
                    bvni = bvni.f156861b;
                }
                str = bhxh.m101702a(bvni);
            }
            return new bhsu(bvoa, bvnw, str);
        }
        bhuj.m101555a().mo64361c("Invalid PlaceInfo without feature ID");
        return null;
    }

    /* renamed from: a */
    public final String mo64225a() {
        bvoa bvoa = this.f119498a;
        if ((bvoa.f156996a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) == 0) {
            return null;
        }
        bvni bvni = bvoa.f157007l;
        if (bvni == null) {
            bvni = bvni.f156861b;
        }
        return bhxh.m101702a(bvni);
    }

    /* renamed from: a */
    public final boolean mo64226a(int i, int i2) {
        bvnw bvnw = this.f119499b;
        if (bvnw != null) {
            bxwc bxwc = bvnw.f156975c;
            int size = bxwc.size();
            for (int i3 = 0; i3 < size; i3++) {
                bvnv bvnv = (bvnv) bxwc.get(i3);
                int a = bvnu.m121300a(bvnv.f156968a);
                if (a == 0) {
                    a = 1;
                }
                if (a == i) {
                    int a2 = bvns.m121298a(bvnv.f156969b);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    if (a2 == i2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
