package p000;

import android.widget.ImageView;

/* renamed from: bdct */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdct extends bdda {

    /* renamed from: a */
    public final bmxv f105342a;

    /* renamed from: b */
    public final ImageView f105343b;

    /* renamed from: c */
    private final int f105344c;

    /* renamed from: d */
    private final bmxv f105345d;

    public bdct(bmxv bmxv, int i, bmxv bmxv2, ImageView imageView) {
        this.f105342a = bmxv;
        this.f105344c = i;
        this.f105345d = bmxv2;
        this.f105343b = imageView;
    }

    /* renamed from: a */
    public final bmxv mo57881a() {
        return this.f105342a;
    }

    /* renamed from: b */
    public final int mo57882b() {
        return this.f105344c;
    }

    /* renamed from: c */
    public final bmxv mo57883c() {
        return this.f105345d;
    }

    /* renamed from: d */
    public final ImageView mo57884d() {
        return this.f105343b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdda) {
            bdda bdda = (bdda) obj;
            return this.f105342a.equals(bdda.mo57881a()) && this.f105344c == bdda.mo57882b() && this.f105345d.equals(bdda.mo57883c()) && this.f105343b.equals(bdda.mo57884d());
        }
    }

    public final int hashCode() {
        return ((((((this.f105342a.hashCode() ^ 1000003) * 1000003) ^ this.f105344c) * 1000003) ^ this.f105345d.hashCode()) * 1000003) ^ this.f105343b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f105342a);
        int i = this.f105344c;
        String valueOf2 = String.valueOf(this.f105345d);
        String valueOf3 = String.valueOf(this.f105343b);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 77 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("LoadAvatarRequest{account=");
        sb.append(valueOf);
        sb.append(", avatarSize=");
        sb.append(i);
        sb.append(", borderColor=");
        sb.append(valueOf2);
        sb.append(", imageView=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
