package p000;

import android.graphics.Rect;
import android.view.animation.Animation;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;

/* renamed from: oow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oow {

    /* renamed from: a */
    public final int f38138a;

    /* renamed from: b */
    public final int f38139b;

    /* renamed from: c */
    public final int f38140c;

    /* renamed from: d */
    public final int f38141d;

    /* renamed from: e */
    public final int f38142e;

    /* renamed from: f */
    public final int f38143f;

    /* renamed from: g */
    public final int f38144g;

    /* renamed from: h */
    public final int f38145h;

    /* renamed from: i */
    public final Rect f38146i;

    /* renamed from: j */
    public final Animation f38147j;

    /* renamed from: k */
    public final Animation f38148k;

    /* renamed from: l */
    public final int f38149l;

    public oow(int i, int i2, int i3, int i4, int i5, int i6, Rect rect, Animation animation, Animation animation2, int i7) {
        this.f38138a = i;
        this.f38139b = i2;
        this.f38140c = i3;
        this.f38141d = i4;
        this.f38144g = i5;
        this.f38145h = i6;
        this.f38142e = i + i3;
        this.f38143f = i2 + i4;
        this.f38146i = rect;
        this.f38147j = animation;
        this.f38148k = animation2;
        this.f38149l = i7;
    }

    public final String toString() {
        int i = this.f38138a;
        int i2 = this.f38139b;
        int i3 = this.f38140c;
        int i4 = this.f38141d;
        int i5 = this.f38142e;
        int i6 = this.f38143f;
        int i7 = this.f38144g;
        int i8 = this.f38145h;
        String valueOf = String.valueOf(this.f38146i);
        String valueOf2 = String.valueOf(this.f38147j);
        String valueOf3 = String.valueOf(this.f38148k);
        int i9 = this.f38149l;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + BaseMfiEventCallback.TYPE_ILLEGAL_LINKAGE_DATA + length2 + String.valueOf(valueOf3).length());
        sb.append("{blX=");
        sb.append(i);
        sb.append(",blY=");
        sb.append(i2);
        sb.append(",trX=");
        sb.append(i3);
        sb.append(",width=");
        sb.append(i4);
        sb.append(",height=");
        sb.append(i5);
        sb.append(",trY=");
        sb.append(i6);
        sb.append(",zLayer=");
        sb.append(i7);
        sb.append(",z=");
        sb.append(i8);
        sb.append(",systemWindowInsets=");
        sb.append(valueOf);
        sb.append(",enterAnimation=");
        sb.append(valueOf2);
        sb.append(",exitAnimation=");
        sb.append(valueOf3);
        sb.append(",focusFlags=");
        sb.append(i9);
        sb.append("}");
        return sb.toString();
    }
}
