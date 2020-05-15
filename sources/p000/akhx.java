package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;

/* renamed from: akhx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akhx extends akhz {

    /* renamed from: a */
    public final Context f72028a;

    /* renamed from: b */
    public final Drawable f72029b;

    /* renamed from: c */
    public final int f72030c;

    /* renamed from: d */
    public final int f72031d;

    /* renamed from: e */
    public final int f72032e;

    /* renamed from: f */
    public final int f72033f;

    /* renamed from: g */
    public final int f72034g;

    /* renamed from: h */
    public final int f72035h;

    /* renamed from: i */
    public final int f72036i;

    /* renamed from: j */
    public final int f72037j;

    public akhx(Context context, Drawable drawable, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f72028a = context;
        this.f72029b = drawable;
        this.f72030c = i;
        this.f72031d = i2;
        this.f72032e = i3;
        this.f72033f = i4;
        this.f72034g = i5;
        this.f72035h = i6;
        this.f72036i = i7;
        this.f72037j = i8;
    }

    /* renamed from: a */
    public final Context mo39466a() {
        return this.f72028a;
    }

    /* renamed from: b */
    public final Drawable mo39467b() {
        return this.f72029b;
    }

    /* renamed from: c */
    public final int mo39468c() {
        return this.f72030c;
    }

    /* renamed from: d */
    public final int mo39469d() {
        return this.f72031d;
    }

    /* renamed from: e */
    public final int mo39470e() {
        return this.f72032e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akhz) {
            akhz akhz = (akhz) obj;
            return this.f72028a.equals(akhz.mo39466a()) && this.f72029b.equals(akhz.mo39467b()) && this.f72030c == akhz.mo39468c() && this.f72031d == akhz.mo39469d() && this.f72032e == akhz.mo39470e() && this.f72033f == akhz.mo39472f() && this.f72034g == akhz.mo39473g() && this.f72035h == akhz.mo39474h() && this.f72036i == akhz.mo39476i() && this.f72037j == akhz.mo39477j();
        }
    }

    /* renamed from: f */
    public final int mo39472f() {
        return this.f72033f;
    }

    /* renamed from: g */
    public final int mo39473g() {
        return this.f72034g;
    }

    /* renamed from: h */
    public final int mo39474h() {
        return this.f72035h;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f72028a.hashCode() ^ 1000003) * 1000003) ^ this.f72029b.hashCode()) * 1000003) ^ this.f72030c) * 1000003) ^ this.f72031d) * 1000003) ^ this.f72032e) * 1000003) ^ this.f72033f) * 1000003) ^ this.f72034g) * 1000003) ^ this.f72035h) * 1000003) ^ this.f72036i) * 1000003) ^ this.f72037j;
    }

    /* renamed from: i */
    public final int mo39476i() {
        return this.f72036i;
    }

    /* renamed from: j */
    public final int mo39477j() {
        return this.f72037j;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f72028a);
        String valueOf2 = String.valueOf(this.f72029b);
        int i = this.f72030c;
        int i2 = this.f72031d;
        int i3 = this.f72032e;
        int i4 = this.f72033f;
        int i5 = this.f72034g;
        int i6 = this.f72035h;
        int i7 = this.f72036i;
        int i8 = this.f72037j;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + BaseMfiEventCallback.TYPE_AGREEMENT_NOT_ACCEPT + String.valueOf(valueOf2).length());
        sb.append("Badge{context=");
        sb.append(valueOf);
        sb.append(", drawable=");
        sb.append(valueOf2);
        sb.append(", imageWidth=");
        sb.append(i);
        sb.append(", imageHeight=");
        sb.append(i2);
        sb.append(", padding=");
        sb.append(i3);
        sb.append(", offsetX=");
        sb.append(i4);
        sb.append(", offsetY=");
        sb.append(i5);
        sb.append(", shadowRadius=");
        sb.append(i6);
        sb.append(", shadowOffsetX=");
        sb.append(i7);
        sb.append(", shadowOffsetY=");
        sb.append(i8);
        sb.append("}");
        return sb.toString();
    }
}
