package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: eu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0971eu extends ViewGroup.MarginLayoutParams {

    /* renamed from: A */
    public float f15700A = 0.0f;

    /* renamed from: B */
    public float f15701B = 0.0f;

    /* renamed from: C */
    public int f15702C = 0;

    /* renamed from: D */
    public int f15703D = 0;

    /* renamed from: E */
    public int f15704E = 0;

    /* renamed from: F */
    public int f15705F = 0;

    /* renamed from: G */
    public int f15706G = 0;

    /* renamed from: H */
    public int f15707H = 0;

    /* renamed from: I */
    public int f15708I = 0;

    /* renamed from: J */
    public int f15709J = 0;

    /* renamed from: K */
    public int f15710K = -1;

    /* renamed from: L */
    public int f15711L = -1;

    /* renamed from: M */
    public int f15712M = -1;

    /* renamed from: N */
    public boolean f15713N = true;

    /* renamed from: O */
    public boolean f15714O = true;

    /* renamed from: P */
    public boolean f15715P = false;

    /* renamed from: Q */
    public boolean f15716Q = false;

    /* renamed from: R */
    public int f15717R = -1;

    /* renamed from: S */
    public int f15718S = -1;

    /* renamed from: T */
    public int f15719T = -1;

    /* renamed from: U */
    public int f15720U = -1;

    /* renamed from: V */
    public int f15721V = -1;

    /* renamed from: W */
    public int f15722W = -1;

    /* renamed from: X */
    public float f15723X = 0.5f;

    /* renamed from: Y */
    public C0986fh f15724Y = new C0986fh();

    /* renamed from: a */
    public int f15725a = -1;

    /* renamed from: b */
    public int f15726b = -1;

    /* renamed from: c */
    public float f15727c = -1.0f;

    /* renamed from: d */
    public int f15728d = -1;

    /* renamed from: e */
    public int f15729e = -1;

    /* renamed from: f */
    public int f15730f = -1;

    /* renamed from: g */
    public int f15731g = -1;

    /* renamed from: h */
    public int f15732h = -1;

    /* renamed from: i */
    public int f15733i = -1;

    /* renamed from: j */
    public int f15734j = -1;

    /* renamed from: k */
    public int f15735k = -1;

    /* renamed from: l */
    public int f15736l = -1;

    /* renamed from: m */
    public int f15737m = -1;

    /* renamed from: n */
    public int f15738n = -1;

    /* renamed from: o */
    public int f15739o = -1;

    /* renamed from: p */
    public int f15740p = -1;

    /* renamed from: q */
    public int f15741q = -1;

    /* renamed from: r */
    public int f15742r = -1;

    /* renamed from: s */
    public int f15743s = -1;

    /* renamed from: t */
    public int f15744t = -1;

    /* renamed from: u */
    public int f15745u = -1;

    /* renamed from: v */
    public int f15746v = -1;

    /* renamed from: w */
    public float f15747w = 0.5f;

    /* renamed from: x */
    public float f15748x = 0.5f;

    /* renamed from: y */
    public String f15749y = null;

    /* renamed from: z */
    int f15750z = 1;

    public C0971eu() {
        super(-2, -2);
    }

    /* renamed from: a */
    public final void mo10512a() {
        this.f15716Q = false;
        this.f15713N = true;
        this.f15714O = true;
        if (this.width == 0 || this.width == -1) {
            this.f15713N = false;
        }
        if (this.height == 0 || this.height == -1) {
            this.f15714O = false;
        }
        if (this.f15727c != -1.0f || this.f15725a != -1 || this.f15726b != -1) {
            this.f15716Q = true;
            this.f15713N = true;
            this.f15714O = true;
            if (!(this.f15724Y instanceof C0988fj)) {
                this.f15724Y = new C0988fj();
            }
            ((C0988fj) this.f15724Y).mo10880h(this.f15712M);
        }
    }

    public final void resolveLayoutDirection(int i) {
        super.resolveLayoutDirection(i);
        this.f15719T = -1;
        this.f15720U = -1;
        this.f15717R = -1;
        this.f15718S = -1;
        this.f15721V = this.f15741q;
        this.f15722W = this.f15743s;
        this.f15723X = this.f15747w;
        if (getLayoutDirection() == 1) {
            int i2 = this.f15737m;
            if (i2 == -1) {
                int i3 = this.f15738n;
                if (i3 != -1) {
                    this.f15720U = i3;
                }
            } else {
                this.f15719T = i2;
            }
            int i4 = this.f15739o;
            if (i4 != -1) {
                this.f15718S = i4;
            }
            int i5 = this.f15740p;
            if (i5 != -1) {
                this.f15717R = i5;
            }
            int i6 = this.f15745u;
            if (i6 != -1) {
                this.f15722W = i6;
            }
            int i7 = this.f15746v;
            if (i7 != -1) {
                this.f15721V = i7;
            }
            this.f15723X = 1.0f - this.f15747w;
        } else {
            int i8 = this.f15737m;
            if (i8 != -1) {
                this.f15718S = i8;
            }
            int i9 = this.f15738n;
            if (i9 != -1) {
                this.f15717R = i9;
            }
            int i10 = this.f15739o;
            if (i10 != -1) {
                this.f15719T = i10;
            }
            int i11 = this.f15740p;
            if (i11 != -1) {
                this.f15720U = i11;
            }
            int i12 = this.f15745u;
            if (i12 != -1) {
                this.f15721V = i12;
            }
            int i13 = this.f15746v;
            if (i13 != -1) {
                this.f15722W = i13;
            }
        }
        if (this.f15739o == -1 && this.f15740p == -1) {
            int i14 = this.f15730f;
            if (i14 == -1) {
                int i15 = this.f15731g;
                if (i15 != -1) {
                    this.f15720U = i15;
                }
            } else {
                this.f15719T = i14;
            }
        }
        if (this.f15738n == -1 && this.f15737m == -1) {
            int i16 = this.f15728d;
            if (i16 == -1) {
                int i17 = this.f15729e;
                if (i17 != -1) {
                    this.f15718S = i17;
                    return;
                }
                return;
            }
            this.f15717R = i16;
        }
    }

    public C0971eu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0974ex.f15960a);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 59) {
                int resourceId = obtainStyledAttributes.getResourceId(59, this.f15728d);
                this.f15728d = resourceId;
                if (resourceId == -1) {
                    this.f15728d = obtainStyledAttributes.getInt(59, -1);
                }
            } else if (index == 60) {
                int resourceId2 = obtainStyledAttributes.getResourceId(60, this.f15729e);
                this.f15729e = resourceId2;
                if (resourceId2 == -1) {
                    this.f15729e = obtainStyledAttributes.getInt(60, -1);
                }
            } else if (index == 62) {
                int resourceId3 = obtainStyledAttributes.getResourceId(62, this.f15730f);
                this.f15730f = resourceId3;
                if (resourceId3 == -1) {
                    this.f15730f = obtainStyledAttributes.getInt(62, -1);
                }
            } else if (index == 63) {
                int resourceId4 = obtainStyledAttributes.getResourceId(63, this.f15731g);
                this.f15731g = resourceId4;
                if (resourceId4 == -1) {
                    this.f15731g = obtainStyledAttributes.getInt(63, -1);
                }
            } else if (index == 69) {
                int resourceId5 = obtainStyledAttributes.getResourceId(69, this.f15732h);
                this.f15732h = resourceId5;
                if (resourceId5 == -1) {
                    this.f15732h = obtainStyledAttributes.getInt(69, -1);
                }
            } else if (index == 68) {
                int resourceId6 = obtainStyledAttributes.getResourceId(68, this.f15733i);
                this.f15733i = resourceId6;
                if (resourceId6 == -1) {
                    this.f15733i = obtainStyledAttributes.getInt(68, -1);
                }
            } else if (index == 41) {
                int resourceId7 = obtainStyledAttributes.getResourceId(41, this.f15734j);
                this.f15734j = resourceId7;
                if (resourceId7 == -1) {
                    this.f15734j = obtainStyledAttributes.getInt(41, -1);
                }
            } else if (index == 40) {
                int resourceId8 = obtainStyledAttributes.getResourceId(40, this.f15735k);
                this.f15735k = resourceId8;
                if (resourceId8 == -1) {
                    this.f15735k = obtainStyledAttributes.getInt(40, -1);
                }
            } else if (index == 38) {
                int resourceId9 = obtainStyledAttributes.getResourceId(38, this.f15736l);
                this.f15736l = resourceId9;
                if (resourceId9 == -1) {
                    this.f15736l = obtainStyledAttributes.getInt(38, -1);
                }
            } else if (index == 77) {
                this.f15710K = obtainStyledAttributes.getDimensionPixelOffset(77, this.f15710K);
            } else if (index == 78) {
                this.f15711L = obtainStyledAttributes.getDimensionPixelOffset(78, this.f15711L);
            } else if (index == 48) {
                this.f15725a = obtainStyledAttributes.getDimensionPixelOffset(48, this.f15725a);
            } else if (index == 49) {
                this.f15726b = obtainStyledAttributes.getDimensionPixelOffset(49, this.f15726b);
            } else if (index == 50) {
                this.f15727c = obtainStyledAttributes.getFloat(50, this.f15727c);
            } else if (index == 0) {
                this.f15712M = obtainStyledAttributes.getInt(0, this.f15712M);
            } else if (index == 64) {
                int resourceId10 = obtainStyledAttributes.getResourceId(64, this.f15737m);
                this.f15737m = resourceId10;
                if (resourceId10 == -1) {
                    this.f15737m = obtainStyledAttributes.getInt(64, -1);
                }
            } else if (index == 65) {
                int resourceId11 = obtainStyledAttributes.getResourceId(65, this.f15738n);
                this.f15738n = resourceId11;
                if (resourceId11 == -1) {
                    this.f15738n = obtainStyledAttributes.getInt(65, -1);
                }
            } else if (index == 47) {
                int resourceId12 = obtainStyledAttributes.getResourceId(47, this.f15739o);
                this.f15739o = resourceId12;
                if (resourceId12 == -1) {
                    this.f15739o = obtainStyledAttributes.getInt(47, -1);
                }
            } else if (index == 46) {
                int resourceId13 = obtainStyledAttributes.getResourceId(46, this.f15740p);
                this.f15740p = resourceId13;
                if (resourceId13 == -1) {
                    this.f15740p = obtainStyledAttributes.getInt(46, -1);
                }
            } else if (index == 81) {
                this.f15741q = obtainStyledAttributes.getDimensionPixelSize(81, this.f15741q);
            } else if (index == 84) {
                this.f15742r = obtainStyledAttributes.getDimensionPixelSize(84, this.f15742r);
            } else if (index == 82) {
                this.f15743s = obtainStyledAttributes.getDimensionPixelSize(82, this.f15743s);
            } else if (index == 79) {
                this.f15744t = obtainStyledAttributes.getDimensionPixelSize(79, this.f15744t);
            } else if (index == 83) {
                this.f15745u = obtainStyledAttributes.getDimensionPixelSize(83, this.f15745u);
            } else if (index == 80) {
                this.f15746v = obtainStyledAttributes.getDimensionPixelSize(80, this.f15746v);
            } else if (index == 55) {
                this.f15747w = obtainStyledAttributes.getFloat(55, this.f15747w);
            } else if (index == 70) {
                this.f15748x = obtainStyledAttributes.getFloat(70, this.f15748x);
            } else if (index == 45) {
                String string = obtainStyledAttributes.getString(45);
                this.f15749y = string;
                this.f15750z = -1;
                if (string != null) {
                    int length = string.length();
                    int indexOf = this.f15749y.indexOf(44);
                    if (indexOf <= 0 || indexOf >= length - 1) {
                        i = 0;
                    } else {
                        String substring = this.f15749y.substring(0, indexOf);
                        if (substring.equalsIgnoreCase("W")) {
                            this.f15750z = 0;
                        } else if (substring.equalsIgnoreCase("H")) {
                            this.f15750z = 1;
                        }
                        i = indexOf + 1;
                    }
                    int indexOf2 = this.f15749y.indexOf(58);
                    if (indexOf2 >= 0 && indexOf2 < length - 1) {
                        String substring2 = this.f15749y.substring(i, indexOf2);
                        String substring3 = this.f15749y.substring(indexOf2 + 1);
                        if (substring2.length() > 0 && substring3.length() > 0) {
                            try {
                                float parseFloat = Float.parseFloat(substring2);
                                float parseFloat2 = Float.parseFloat(substring3);
                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                    if (this.f15750z != 1) {
                                        Math.abs(parseFloat / parseFloat2);
                                    } else {
                                        Math.abs(parseFloat2 / parseFloat);
                                    }
                                }
                            } catch (NumberFormatException e) {
                            }
                        }
                    } else {
                        String substring4 = this.f15749y.substring(i);
                        if (substring4.length() > 0) {
                            Float.parseFloat(substring4);
                        }
                    }
                }
            } else if (index == 57) {
                this.f15700A = obtainStyledAttributes.getFloat(57, 0.0f);
            } else if (index == 72) {
                this.f15701B = obtainStyledAttributes.getFloat(72, 0.0f);
            } else if (index == 56) {
                this.f15702C = obtainStyledAttributes.getInt(56, 0);
            } else if (index == 71) {
                this.f15703D = obtainStyledAttributes.getInt(71, 0);
            } else if (index == 73) {
                this.f15704E = obtainStyledAttributes.getInt(73, 0);
            } else if (index == 51) {
                this.f15705F = obtainStyledAttributes.getInt(51, 0);
            } else if (index == 75) {
                this.f15706G = obtainStyledAttributes.getDimensionPixelSize(75, this.f15706G);
            } else if (index == 74) {
                this.f15708I = obtainStyledAttributes.getDimensionPixelSize(74, this.f15708I);
            } else if (index == 53) {
                this.f15707H = obtainStyledAttributes.getDimensionPixelSize(53, this.f15707H);
            } else if (index == 52) {
                this.f15709J = obtainStyledAttributes.getDimensionPixelSize(52, this.f15709J);
            }
        }
        obtainStyledAttributes.recycle();
        mo10512a();
    }

    public C0971eu(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }
}
