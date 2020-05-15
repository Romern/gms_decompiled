package p000;

import com.google.android.libraries.messaging.lighter.model.ContactId;

/* renamed from: bcrk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcrk extends bcsj {

    /* renamed from: a */
    public final ContactId f104708a;

    /* renamed from: b */
    public final bmxv f104709b;

    /* renamed from: c */
    public final bmxv f104710c;

    /* renamed from: d */
    public final bmxv f104711d;

    /* renamed from: e */
    public final bmxv f104712e;

    /* renamed from: f */
    public final boolean f104713f;

    /* renamed from: g */
    public final Long f104714g;

    /* renamed from: h */
    public final bngx f104715h;

    /* renamed from: i */
    public final bngx f104716i;

    /* renamed from: j */
    public final bmxv f104717j;

    /* renamed from: k */
    public final bmxv f104718k;

    public bcrk(ContactId contactId, bmxv bmxv, bmxv bmxv2, bmxv bmxv3, bmxv bmxv4, boolean z, Long l, bngx bngx, bngx bngx2, bmxv bmxv5, bmxv bmxv6) {
        this.f104708a = contactId;
        this.f104709b = bmxv;
        this.f104710c = bmxv2;
        this.f104711d = bmxv3;
        this.f104712e = bmxv4;
        this.f104713f = z;
        this.f104714g = l;
        this.f104715h = bngx;
        this.f104716i = bngx2;
        this.f104717j = bmxv5;
        this.f104718k = bmxv6;
    }

    /* renamed from: a */
    public final ContactId mo57302a() {
        return this.f104708a;
    }

    /* renamed from: b */
    public final bmxv mo57303b() {
        return this.f104709b;
    }

    /* renamed from: c */
    public final bmxv mo57304c() {
        return this.f104710c;
    }

    /* renamed from: d */
    public final bmxv mo57305d() {
        return this.f104711d;
    }

    /* renamed from: e */
    public final bmxv mo57306e() {
        return this.f104712e;
    }

    /* renamed from: f */
    public final boolean mo57307f() {
        return this.f104713f;
    }

    /* renamed from: g */
    public final Long mo57308g() {
        return this.f104714g;
    }

    /* renamed from: h */
    public final bngx mo57309h() {
        return this.f104715h;
    }

    /* renamed from: i */
    public final bngx mo57310i() {
        return this.f104716i;
    }

    /* renamed from: j */
    public final bmxv mo57311j() {
        return this.f104717j;
    }

    /* renamed from: k */
    public final bmxv mo57312k() {
        return this.f104718k;
    }

    /* renamed from: l */
    public final bcsi mo57313l() {
        return new bcsi(this);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104708a);
        String valueOf2 = String.valueOf(this.f104709b);
        String valueOf3 = String.valueOf(this.f104710c);
        String valueOf4 = String.valueOf(this.f104711d);
        String valueOf5 = String.valueOf(this.f104712e);
        boolean z = this.f104713f;
        String valueOf6 = String.valueOf(this.f104714g);
        String valueOf7 = String.valueOf(this.f104715h);
        String valueOf8 = String.valueOf(this.f104716i);
        String valueOf9 = String.valueOf(this.f104717j);
        String valueOf10 = String.valueOf(this.f104718k);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        int length7 = String.valueOf(valueOf7).length();
        int length8 = String.valueOf(valueOf8).length();
        StringBuilder sb = new StringBuilder(length + 179 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + String.valueOf(valueOf9).length() + String.valueOf(valueOf10).length());
        sb.append("Contact{contactId=");
        sb.append(valueOf);
        sb.append(", name=");
        sb.append(valueOf2);
        sb.append(", a11yName=");
        sb.append(valueOf3);
        sb.append(", imageUrl=");
        sb.append(valueOf4);
        sb.append(", image=");
        sb.append(valueOf5);
        sb.append(", isImageStale=");
        sb.append(z);
        sb.append(", expirationTimeMillis=");
        sb.append(valueOf6);
        sb.append(", menuItems=");
        sb.append(valueOf7);
        sb.append(", toolbarButtons=");
        sb.append(valueOf8);
        sb.append(", customViewContentModel=");
        sb.append(valueOf9);
        sb.append(", lighterUiConfigurations=");
        sb.append(valueOf10);
        sb.append("}");
        return sb.toString();
    }
}
