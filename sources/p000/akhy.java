package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* renamed from: akhy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akhy {

    /* renamed from: a */
    public Drawable f72038a;

    /* renamed from: b */
    private Context f72039b;

    /* renamed from: c */
    private Integer f72040c;

    /* renamed from: d */
    private Integer f72041d;

    /* renamed from: e */
    private Integer f72042e;

    /* renamed from: f */
    private Integer f72043f;

    /* renamed from: g */
    private Integer f72044g;

    /* renamed from: h */
    private Integer f72045h;

    /* renamed from: i */
    private Integer f72046i;

    /* renamed from: j */
    private Integer f72047j;

    /* renamed from: a */
    public final akhz mo39479a() {
        bmxv bmxv;
        bmxv bmxv2;
        bmxv bmxv3;
        bmxv bmxv4;
        bmxv bmxv5;
        bmxv bmxv6;
        Integer num = this.f72042e;
        if (num == null) {
            bmxv = bmvz.f131120a;
        } else {
            bmxv = bmxv.m108566b(num);
        }
        if (!bmxv.mo66813a()) {
            mo39485e(0);
        }
        Integer num2 = this.f72043f;
        if (num2 == null) {
            bmxv2 = bmvz.f131120a;
        } else {
            bmxv2 = bmxv.m108566b(num2);
        }
        if (!bmxv2.mo66813a()) {
            mo39483c(0);
        }
        Integer num3 = this.f72044g;
        if (num3 == null) {
            bmxv3 = bmvz.f131120a;
        } else {
            bmxv3 = bmxv.m108566b(num3);
        }
        if (!bmxv3.mo66813a()) {
            mo39484d(0);
        }
        Integer num4 = this.f72045h;
        if (num4 == null) {
            bmxv4 = bmvz.f131120a;
        } else {
            bmxv4 = bmxv.m108566b(num4);
        }
        if (!bmxv4.mo66813a()) {
            mo39487g(0);
        }
        Integer num5 = this.f72046i;
        if (num5 == null) {
            bmxv5 = bmvz.f131120a;
        } else {
            bmxv5 = bmxv.m108566b(num5);
        }
        if (!bmxv5.mo66813a()) {
            this.f72046i = 0;
        }
        Integer num6 = this.f72047j;
        if (num6 == null) {
            bmxv6 = bmvz.f131120a;
        } else {
            bmxv6 = bmxv.m108566b(num6);
        }
        if (!bmxv6.mo66813a()) {
            mo39486f(0);
        }
        String str = this.f72039b == null ? " context" : "";
        if (this.f72038a == null) {
            str = str.concat(" drawable");
        }
        if (this.f72040c == null) {
            str = String.valueOf(str).concat(" imageWidth");
        }
        if (this.f72041d == null) {
            str = String.valueOf(str).concat(" imageHeight");
        }
        if (this.f72042e == null) {
            str = String.valueOf(str).concat(" padding");
        }
        if (this.f72043f == null) {
            str = String.valueOf(str).concat(" offsetX");
        }
        if (this.f72044g == null) {
            str = String.valueOf(str).concat(" offsetY");
        }
        if (this.f72045h == null) {
            str = String.valueOf(str).concat(" shadowRadius");
        }
        if (this.f72046i == null) {
            str = String.valueOf(str).concat(" shadowOffsetX");
        }
        if (this.f72047j == null) {
            str = String.valueOf(str).concat(" shadowOffsetY");
        }
        if (str.isEmpty()) {
            return new akhx(this.f72039b, this.f72038a, this.f72040c.intValue(), this.f72041d.intValue(), this.f72042e.intValue(), this.f72043f.intValue(), this.f72044g.intValue(), this.f72045h.intValue(), this.f72046i.intValue(), this.f72047j.intValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo39482b(int i) {
        this.f72040c = Integer.valueOf(i);
    }

    /* renamed from: c */
    public final void mo39483c(int i) {
        this.f72043f = Integer.valueOf(i);
    }

    /* renamed from: d */
    public final void mo39484d(int i) {
        this.f72044g = Integer.valueOf(i);
    }

    /* renamed from: e */
    public final void mo39485e(int i) {
        this.f72042e = Integer.valueOf(i);
    }

    /* renamed from: f */
    public final void mo39486f(int i) {
        this.f72047j = Integer.valueOf(i);
    }

    /* renamed from: g */
    public final void mo39487g(int i) {
        this.f72045h = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo39480a(int i) {
        this.f72041d = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo39481a(Context context) {
        if (context != null) {
            this.f72039b = context;
            return;
        }
        throw new NullPointerException("Null context");
    }
}
