package p000;

/* renamed from: thj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class thj extends thi {

    /* renamed from: a */
    private final bmxv f46014a;

    /* renamed from: b */
    private final bmxv f46015b;

    /* renamed from: c */
    private final bmxv f46016c;

    /* renamed from: d */
    private final bngx f46017d;

    /* renamed from: e */
    private final bngx f46018e;

    /* renamed from: f */
    private final bngx f46019f;

    /* renamed from: g */
    private final bngx f46020g;

    /* renamed from: h */
    private final bngx f46021h;

    /* renamed from: i */
    private final bngx f46022i;

    /* renamed from: j */
    private final bmxv f46023j;

    public thj(bmxv bmxv, bmxv bmxv2, bmxv bmxv3, bngx bngx, bngx bngx2, bngx bngx3, bngx bngx4, bngx bngx5, bngx bngx6, bmxv bmxv4) {
        this.f46014a = bmxv;
        this.f46015b = bmxv2;
        this.f46016c = bmxv3;
        if (bngx != null) {
            this.f46017d = bngx;
            if (bngx2 != null) {
                this.f46018e = bngx2;
                if (bngx3 != null) {
                    this.f46019f = bngx3;
                    if (bngx4 != null) {
                        this.f46020g = bngx4;
                        if (bngx5 != null) {
                            this.f46021h = bngx5;
                            if (bngx6 != null) {
                                this.f46022i = bngx6;
                                this.f46023j = bmxv4;
                                return;
                            }
                            throw new NullPointerException("Null userDefined");
                        }
                        throw new NullPointerException("Null sipAddress");
                    }
                    throw new NullPointerException("Null instantMessaging");
                }
                throw new NullPointerException("Null relations");
            }
            throw new NullPointerException("Null links");
        }
        throw new NullPointerException("Null events");
    }

    /* renamed from: a */
    public final bmxv mo26510a() {
        return this.f46014a;
    }

    /* renamed from: b */
    public final bmxv mo26511b() {
        return this.f46015b;
    }

    /* renamed from: c */
    public final bmxv mo26512c() {
        return this.f46016c;
    }

    /* renamed from: d */
    public final bngx mo26513d() {
        return this.f46017d;
    }

    /* renamed from: e */
    public final bngx mo26514e() {
        return this.f46018e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof thi) {
            thi thi = (thi) obj;
            return this.f46014a.equals(thi.mo26510a()) && this.f46015b.equals(thi.mo26511b()) && this.f46016c.equals(thi.mo26512c()) && bnkn.m109669a(this.f46017d, thi.mo26513d()) && bnkn.m109669a(this.f46018e, thi.mo26514e()) && bnkn.m109669a(this.f46019f, thi.mo26515f()) && bnkn.m109669a(this.f46020g, thi.mo26516g()) && bnkn.m109669a(this.f46021h, thi.mo26517h()) && bnkn.m109669a(this.f46022i, thi.mo26518i()) && this.f46023j.equals(thi.mo26519j());
        }
    }

    /* renamed from: f */
    public final bngx mo26515f() {
        return this.f46019f;
    }

    /* renamed from: g */
    public final bngx mo26516g() {
        return this.f46020g;
    }

    /* renamed from: h */
    public final bngx mo26517h() {
        return this.f46021h;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f46014a.hashCode() ^ 1000003) * 1000003) ^ this.f46015b.hashCode()) * 1000003) ^ this.f46016c.hashCode()) * 1000003) ^ this.f46017d.hashCode()) * 1000003) ^ this.f46018e.hashCode()) * 1000003) ^ this.f46019f.hashCode()) * 1000003) ^ this.f46020g.hashCode()) * 1000003) ^ this.f46021h.hashCode()) * 1000003) ^ this.f46022i.hashCode()) * 1000003) ^ this.f46023j.hashCode();
    }

    /* renamed from: i */
    public final bngx mo26518i() {
        return this.f46022i;
    }

    /* renamed from: j */
    public final bmxv mo26519j() {
        return this.f46023j;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f46014a);
        String valueOf2 = String.valueOf(this.f46015b);
        String valueOf3 = String.valueOf(this.f46016c);
        String valueOf4 = String.valueOf(this.f46017d);
        String valueOf5 = String.valueOf(this.f46018e);
        String valueOf6 = String.valueOf(this.f46019f);
        String valueOf7 = String.valueOf(this.f46020g);
        String valueOf8 = String.valueOf(this.f46021h);
        String valueOf9 = String.valueOf(this.f46022i);
        String valueOf10 = String.valueOf(this.f46023j);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        int length7 = String.valueOf(valueOf7).length();
        int length8 = String.valueOf(valueOf8).length();
        StringBuilder sb = new StringBuilder(length + 130 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + String.valueOf(valueOf9).length() + String.valueOf(valueOf10).length());
        sb.append("AboutCardData{introduction=");
        sb.append(valueOf);
        sb.append(", birthday=");
        sb.append(valueOf2);
        sb.append(", gender=");
        sb.append(valueOf3);
        sb.append(", events=");
        sb.append(valueOf4);
        sb.append(", links=");
        sb.append(valueOf5);
        sb.append(", relations=");
        sb.append(valueOf6);
        sb.append(", instantMessaging=");
        sb.append(valueOf7);
        sb.append(", sipAddress=");
        sb.append(valueOf8);
        sb.append(", userDefined=");
        sb.append(valueOf9);
        sb.append(", note=");
        sb.append(valueOf10);
        sb.append("}");
        return sb.toString();
    }
}
