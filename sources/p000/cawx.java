package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: cawx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cawx {

    /* renamed from: a */
    public int f176290a;

    /* renamed from: b */
    public int f176291b;

    /* renamed from: c */
    public int f176292c;

    /* renamed from: d */
    public final int[] f176293d = new int[10];

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo75031a() {
        return Integer.bitCount(this.f176290a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo75033a(int i) {
        return ((1 << i) & this.f176290a) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo75034b() {
        if ((this.f176290a & 2) != 0) {
            return this.f176293d[1];
        }
        return -1;
    }

    /* renamed from: c */
    public final int mo75036c() {
        return (this.f176290a & 128) != 0 ? this.f176293d[7] : AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo75037c(int i) {
        int i2 = 1 << i;
        int i3 = (this.f176292c & i2) == 0 ? 0 : 2;
        return (i2 & this.f176291b) != 0 ? i3 | 1 : i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo75032a(int i, int i2, int i3) {
        int[] iArr = this.f176293d;
        if (i < iArr.length) {
            int i4 = 1 << i;
            this.f176290a |= i4;
            if ((i2 & 1) == 0) {
                this.f176291b &= i4 ^ -1;
            } else {
                this.f176291b |= i4;
            }
            if ((i2 & 2) == 0) {
                this.f176292c &= i4 ^ -1;
            } else {
                this.f176292c |= i4;
            }
            iArr[i] = i3;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo75035b(int i) {
        return this.f176293d[i];
    }
}
