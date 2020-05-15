package p000;

import android.content.Context;

/* renamed from: bdtv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdtv extends bdug {

    /* renamed from: a */
    public final Context f106429a;

    /* renamed from: b */
    public final String f106430b;

    /* renamed from: c */
    public final ayte f106431c;

    /* renamed from: d */
    public final bdrl f106432d;

    /* renamed from: e */
    private final bdue f106433e;

    /* renamed from: f */
    private final bdts f106434f;

    public bdtv(Context context, String str, ayte ayte, bdrl bdrl, bdue bdue, bdts bdts) {
        this.f106429a = context;
        this.f106430b = str;
        this.f106431c = ayte;
        this.f106432d = bdrl;
        this.f106433e = bdue;
        this.f106434f = bdts;
    }

    /* renamed from: a */
    public final Context mo58367a() {
        return this.f106429a;
    }

    /* renamed from: b */
    public final String mo58368b() {
        return this.f106430b;
    }

    /* renamed from: c */
    public final ayte mo58369c() {
        return this.f106431c;
    }

    /* renamed from: d */
    public final bdrl mo58370d() {
        return this.f106432d;
    }

    /* renamed from: e */
    public final bdue mo58371e() {
        return this.f106433e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdug) {
            bdug bdug = (bdug) obj;
            return this.f106429a.equals(bdug.mo58367a()) && this.f106430b.equals(bdug.mo58368b()) && this.f106431c.equals(bdug.mo58369c()) && this.f106432d.equals(bdug.mo58370d()) && this.f106433e.equals(bdug.mo58371e()) && this.f106434f.equals(bdug.mo58373f());
        }
    }

    /* renamed from: f */
    public final bdts mo58373f() {
        return this.f106434f;
    }

    public final int hashCode() {
        return ((((((((((this.f106429a.hashCode() ^ 1000003) * 1000003) ^ this.f106430b.hashCode()) * 1000003) ^ this.f106431c.hashCode()) * 1000003) ^ this.f106432d.hashCode()) * 1000003) ^ this.f106433e.hashCode()) * 1000003) ^ this.f106434f.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f106429a);
        String str = this.f106430b;
        String valueOf2 = String.valueOf(this.f106431c);
        String valueOf3 = String.valueOf(this.f106432d);
        String valueOf4 = String.valueOf(this.f106433e);
        String valueOf5 = String.valueOf(this.f106434f);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 79 + length2 + length3 + length4 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("Deps{context=");
        sb.append(valueOf);
        sb.append(", instanceId=");
        sb.append(str);
        sb.append(", clock=");
        sb.append(valueOf2);
        sb.append(", loggerFactory=");
        sb.append(valueOf3);
        sb.append(", facsClientFactory=");
        sb.append(valueOf4);
        sb.append(", flags=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
