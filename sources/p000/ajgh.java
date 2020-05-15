package p000;

import android.content.Context;
import com.google.android.gms.nearby.messages.settings.ButtonLayout;

/* renamed from: ajgh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajgh {

    /* renamed from: a */
    public final int f70573a;

    /* renamed from: b */
    public final int f70574b;

    /* renamed from: c */
    private final int f70575c;

    /* renamed from: d */
    private final int f70576d;

    /* renamed from: e */
    private final int f70577e;

    /* renamed from: f */
    private final int f70578f;

    /* renamed from: g */
    private final int f70579g;

    /* renamed from: h */
    private final float f70580h;

    /* renamed from: i */
    private final boolean f70581i;

    public ajgh(Context context, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f70575c = i;
        this.f70573a = i2;
        this.f70574b = i3;
        this.f70576d = i4;
        this.f70577e = i5;
        this.f70578f = i6;
        this.f70579g = i7;
        this.f70580h = context.getResources().getDisplayMetrics().density;
        this.f70581i = ButtonLayout.m67428a(context);
    }

    /* renamed from: a */
    public final int mo38601a() {
        return (int) (((float) this.f70575c) * this.f70580h);
    }

    /* renamed from: b */
    public final int mo38602b() {
        return (int) (((float) this.f70576d) * this.f70580h);
    }

    /* renamed from: c */
    public final int mo38603c() {
        return (int) (((float) this.f70577e) * this.f70580h);
    }

    /* renamed from: d */
    public final int mo38604d() {
        return (int) (((float) (!this.f70581i ? this.f70578f : this.f70579g)) * this.f70580h);
    }

    /* renamed from: e */
    public final int mo38605e() {
        return (int) (((float) (!this.f70581i ? this.f70579g : this.f70578f)) * this.f70580h);
    }
}
