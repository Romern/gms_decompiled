package p000;

/* renamed from: bcyx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcyx extends bdad {

    /* renamed from: a */
    private final bdaa f105157a;

    /* renamed from: b */
    private final int f105158b;

    /* renamed from: c */
    private final int f105159c;

    /* renamed from: d */
    private final int f105160d;

    /* renamed from: e */
    private final int f105161e;

    public bcyx(bdaa bdaa, int i, int i2, int i3, int i4) {
        this.f105157a = bdaa;
        this.f105158b = i;
        this.f105159c = i2;
        this.f105160d = i3;
        this.f105161e = i4;
    }

    /* renamed from: a */
    public final bdaa mo57758a() {
        return this.f105157a;
    }

    /* renamed from: b */
    public final int mo57759b() {
        return this.f105158b;
    }

    /* renamed from: c */
    public final int mo57760c() {
        return this.f105159c;
    }

    /* renamed from: d */
    public final int mo57761d() {
        return this.f105160d;
    }

    /* renamed from: e */
    public final int mo57762e() {
        return this.f105161e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdad) {
            bdad bdad = (bdad) obj;
            return this.f105157a.equals(bdad.mo57758a()) && this.f105158b == bdad.mo57759b() && this.f105159c == bdad.mo57760c() && this.f105160d == bdad.mo57761d() && this.f105161e == bdad.mo57762e();
        }
    }

    public final int hashCode() {
        return ((((((((this.f105157a.hashCode() ^ 1000003) * 1000003) ^ this.f105158b) * 1000003) ^ this.f105159c) * 1000003) ^ this.f105160d) * 1000003) ^ this.f105161e;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f105157a);
        int i = this.f105158b;
        int i2 = this.f105159c;
        int i3 = this.f105160d;
        int i4 = this.f105161e;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 120);
        sb.append("UiElement{element=");
        sb.append(valueOf);
        sb.append(", paddingStart=");
        sb.append(i);
        sb.append(", paddingTop=");
        sb.append(i2);
        sb.append(", paddingEnd=");
        sb.append(i3);
        sb.append(", paddingBottom=");
        sb.append(i4);
        sb.append("}");
        return sb.toString();
    }
}
