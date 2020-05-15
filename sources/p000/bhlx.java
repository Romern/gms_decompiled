package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* renamed from: bhlx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhlx {

    /* renamed from: a */
    public static final bhlk f119029a = new bhlu(0.5f);

    /* renamed from: b */
    public final bhll f119030b;

    /* renamed from: c */
    public final bhll f119031c;

    /* renamed from: d */
    public final bhll f119032d;

    /* renamed from: e */
    public final bhll f119033e;

    /* renamed from: f */
    public final bhlk f119034f;

    /* renamed from: g */
    final bhlk f119035g;

    /* renamed from: h */
    final bhlk f119036h;

    /* renamed from: i */
    final bhlk f119037i;

    /* renamed from: j */
    final bhln f119038j;

    /* renamed from: k */
    final bhln f119039k;

    /* renamed from: l */
    final bhln f119040l;

    /* renamed from: m */
    final bhln f119041m;

    public bhlx() {
        this.f119030b = bhls.m101139a();
        this.f119031c = bhls.m101139a();
        this.f119032d = bhls.m101139a();
        this.f119033e = bhls.m101139a();
        this.f119034f = new bhli(0.0f);
        this.f119035g = new bhli(0.0f);
        this.f119036h = new bhli(0.0f);
        this.f119037i = new bhli(0.0f);
        this.f119038j = bhls.m101144b();
        this.f119039k = bhls.m101144b();
        this.f119040l = bhls.m101144b();
        this.f119041m = bhls.m101144b();
    }

    /* renamed from: a */
    private static bhlk m101154a(TypedArray typedArray, int i, bhlk bhlk) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue != null) {
            if (peekValue.type == 5) {
                return new bhli((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (peekValue.type == 6) {
                return new bhlu(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return bhlk;
    }

    /* renamed from: b */
    public final bhlw mo63980b() {
        return new bhlw(this);
    }

    public bhlx(bhlw bhlw) {
        this.f119030b = bhlw.f119017a;
        this.f119031c = bhlw.f119018b;
        this.f119032d = bhlw.f119019c;
        this.f119033e = bhlw.f119020d;
        this.f119034f = bhlw.f119021e;
        this.f119035g = bhlw.f119022f;
        this.f119036h = bhlw.f119023g;
        this.f119037i = bhlw.f119024h;
        this.f119038j = bhlw.f119025i;
        this.f119039k = bhlw.f119026j;
        this.f119040l = bhlw.f119027k;
        this.f119041m = bhlw.f119028l;
    }

    /* renamed from: a */
    public static bhlw m101155a() {
        return new bhlw();
    }

    /* renamed from: a */
    public static bhlw m101156a(Context context, int i, int i2) {
        return m101157a(context, i, i2, new bhli(0.0f));
    }

    /* renamed from: a */
    private static bhlw m101157a(Context context, int i, int i2, bhlk bhlk) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, bhlt.f119014b);
        try {
            int i3 = obtainStyledAttributes.getInt(0, 0);
            int i4 = obtainStyledAttributes.getInt(3, i3);
            int i5 = obtainStyledAttributes.getInt(4, i3);
            int i6 = obtainStyledAttributes.getInt(2, i3);
            int i7 = obtainStyledAttributes.getInt(1, i3);
            bhlk a = m101154a(obtainStyledAttributes, 5, bhlk);
            bhlk a2 = m101154a(obtainStyledAttributes, 8, a);
            bhlk a3 = m101154a(obtainStyledAttributes, 9, a);
            bhlk a4 = m101154a(obtainStyledAttributes, 7, a);
            bhlk a5 = m101154a(obtainStyledAttributes, 6, a);
            bhlw bhlw = new bhlw();
            bhll a6 = bhls.m101140a(i4);
            bhlw.f119017a = a6;
            bhlw.m101147a(a6);
            bhlw.f119021e = a2;
            bhll a7 = bhls.m101140a(i5);
            bhlw.f119018b = a7;
            bhlw.m101147a(a7);
            bhlw.f119022f = a3;
            bhll a8 = bhls.m101140a(i6);
            bhlw.f119019c = a8;
            bhlw.m101147a(a8);
            bhlw.f119023g = a4;
            bhll a9 = bhls.m101140a(i7);
            bhlw.f119020d = a9;
            bhlw.m101147a(a9);
            bhlw.f119024h = a5;
            return bhlw;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    public static bhlw m101158a(Context context, AttributeSet attributeSet, int i, int i2) {
        return m101159a(context, attributeSet, i, i2, new bhli(0.0f));
    }

    /* renamed from: a */
    public static bhlw m101159a(Context context, AttributeSet attributeSet, int i, int i2, bhlk bhlk) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bhlt.f119013a, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return m101157a(context, resourceId, resourceId2, bhlk);
    }

    /* renamed from: a */
    public final bhlx mo63978a(float f) {
        bhlw b = mo63980b();
        b.mo63977e(f);
        return b.mo63972a();
    }

    /* renamed from: a */
    public final boolean mo63979a(RectF rectF) {
        boolean z;
        boolean z2;
        if (!this.f119041m.getClass().equals(bhln.class) || !this.f119039k.getClass().equals(bhln.class) || !this.f119038j.getClass().equals(bhln.class) || !this.f119040l.getClass().equals(bhln.class)) {
            z = false;
        } else {
            z = true;
        }
        float a = this.f119034f.mo63930a(rectF);
        if (this.f119035g.mo63930a(rectF) == a && this.f119037i.mo63930a(rectF) == a && this.f119036h.mo63930a(rectF) == a) {
            z2 = true;
        } else {
            z2 = false;
        }
        return z && z2 && ((this.f119031c instanceof bhlv) && (this.f119030b instanceof bhlv) && (this.f119032d instanceof bhlv) && (this.f119033e instanceof bhlv));
    }
}
