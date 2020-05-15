package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Shader;
import com.felicanetworks.mfc.KeyInformation;
import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: auu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class auu {

    /* renamed from: a */
    public static final Matrix f2310a = new Matrix();

    /* renamed from: b */
    Paint f2311b;

    /* renamed from: c */
    Paint f2312c;

    /* renamed from: d */
    final aur f2313d;

    /* renamed from: e */
    float f2314e;

    /* renamed from: f */
    float f2315f;

    /* renamed from: g */
    float f2316g;

    /* renamed from: h */
    float f2317h;

    /* renamed from: i */
    int f2318i;

    /* renamed from: j */
    String f2319j;

    /* renamed from: k */
    Boolean f2320k;

    /* renamed from: l */
    final C1223np f2321l;

    /* renamed from: m */
    private final Path f2322m;

    /* renamed from: n */
    private final Path f2323n;

    /* renamed from: o */
    private final Matrix f2324o;

    /* renamed from: p */
    private PathMeasure f2325p;

    /* renamed from: q */
    private int f2326q;

    public auu() {
        this.f2324o = new Matrix();
        this.f2314e = 0.0f;
        this.f2315f = 0.0f;
        this.f2316g = 0.0f;
        this.f2317h = 0.0f;
        this.f2318i = 255;
        this.f2319j = null;
        this.f2320k = null;
        this.f2321l = new C1223np();
        this.f2313d = new aur();
        this.f2322m = new Path();
        this.f2323n = new Path();
    }

    /* JADX WARN: Type inference failed for: r38v4, assign insn: 0x0420: MOVE  (r38v4 ? I:?[OBJECT, ARRAY]) = (r14v8 float[]) */
    /* JADX WARN: Type inference failed for: r38v5, assign insn: 0x040d: MOVE  (r38v5 ? I:?[OBJECT, ARRAY]) = (r14v8 float[]) */
    /* JADX WARN: Type inference failed for: r38v6, assign insn: 0x03bb: MOVE  (r38v6 ? I:?[OBJECT, ARRAY]) = (r14v8 float[]) */
    /* JADX WARN: Type inference failed for: r38v7, assign insn: 0x0382: MOVE  (r38v7 ? I:?[OBJECT, ARRAY]) = (r14v8 float[]) */
    /* JADX WARN: Type inference failed for: r38v8, assign insn: 0x036d: MOVE  (r38v8 ? I:?[OBJECT, ARRAY]) = (r14v8 float[]) */
    /* JADX WARN: Type inference failed for: r38v9, assign insn: 0x034a: MOVE  (r38v9 ? I:?[OBJECT, ARRAY]) = (r14v8 float[]) */
    /* JADX WARN: Type inference failed for: r38v10, assign insn: 0x0332: MOVE  (r38v10 ? I:?[OBJECT, ARRAY]) = (r14v8 float[]) */
    /* JADX WARN: Type inference failed for: r38v11, assign insn: 0x031d: MOVE  (r38v11 ? I:?[OBJECT, ARRAY]) = (r14v8 float[]) */
    /* JADX WARN: Type inference failed for: r38v12, assign insn: 0x0304: MOVE  (r38v12 ? I:?[OBJECT, ARRAY]) = (r14v8 float[]) */
    /* JADX WARN: Type inference failed for: r38v13, assign insn: 0x02f5: MOVE  (r38v13 ? I:?[OBJECT, ARRAY]) = (r14v8 float[]) */
    /* JADX WARN: Type inference failed for: r38v14, assign insn: 0x02db: MOVE  (r38v14 ? I:?[OBJECT, ARRAY]) = (r14v8 float[]) */
    /* JADX WARN: Type inference failed for: r38v15, assign insn: 0x028c: MOVE  (r38v15 ? I:?[OBJECT, ARRAY]) = (r14v8 float[]) */
    /* JADX WARN: Type inference failed for: r38v16, assign insn: 0x0257: MOVE  (r38v16 ? I:?[OBJECT, ARRAY]) = (r14v8 float[]) */
    /* JADX WARN: Type inference failed for: r38v17, assign insn: 0x023c: MOVE  (r38v17 ? I:?[OBJECT, ARRAY]) = (r14v8 float[]) */
    /* JADX WARN: Type inference failed for: r38v18, assign insn: 0x022d: MOVE  (r38v18 ? I:?[OBJECT, ARRAY]) = (r14v8 float[]) */
    /* JADX WARN: Type inference failed for: r38v19, assign insn: 0x0212: MOVE  (r38v19 ? I:?[OBJECT, ARRAY]) = (r14v8 float[]) */
    /* JADX WARN: Type inference failed for: r38v20, assign insn: 0x01c3: MOVE  (r38v20 ? I:?[OBJECT, ARRAY]) = (r14v8 float[]) */
    /* JADX WARN: Type inference failed for: r38v21, assign insn: 0x018a: MOVE  (r38v21 ? I:?[OBJECT, ARRAY]) = (r14v8 float[]) */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo2622a(aur aur, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        float f;
        float f2;
        float f3;
        int i4;
        float[] fArr;
        int i5;
        C1169lp[] lpVarArr;
        char c;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        aur aur2 = aur;
        Canvas canvas2 = canvas;
        aur2.f2293a.set(matrix);
        aur2.f2293a.preConcat(aur2.f2302j);
        canvas.save();
        char c2 = 0;
        int i6 = 0;
        while (i6 < aur2.f2294b.size()) {
            aus aus = (aus) aur2.f2294b.get(i6);
            if (aus instanceof aur) {
                mo2622a((aur) aus, aur2.f2293a, canvas, i, i2);
                i3 = i6;
            } else if (aus instanceof aut) {
                aut aut = (aut) aus;
                float f10 = ((float) i) / this.f2316g;
                float f11 = ((float) i2) / this.f2317h;
                float min = Math.min(f10, f11);
                Matrix matrix2 = aur2.f2293a;
                this.f2324o.set(matrix2);
                this.f2324o.postScale(f10, f11);
                float[] fArr2 = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix2.mapVectors(fArr2);
                double hypot = Math.hypot((double) fArr2[c2], (double) fArr2[1]);
                double hypot2 = Math.hypot((double) fArr2[2], (double) fArr2[3]);
                float f12 = (fArr2[c2] * fArr2[3]) - (fArr2[1] * fArr2[2]);
                float max = Math.max((float) hypot, (float) hypot2);
                float abs = max > 0.0f ? Math.abs(f12) / max : 0.0f;
                if (abs != 0.0f) {
                    Path path = this.f2322m;
                    path.reset();
                    C1169lp[] lpVarArr2 = aut.f2306m;
                    if (lpVarArr2 != null) {
                        float[] fArr3 = new float[6];
                        int i7 = 0;
                        char c3 = 'm';
                        while (i7 < lpVarArr2.length) {
                            C1169lp lpVar = lpVarArr2[i7];
                            char c4 = lpVar.f26522a;
                            float[] fArr4 = lpVar.f26523b;
                            float f13 = fArr3[c2];
                            float f14 = fArr3[1];
                            float f15 = fArr3[2];
                            float f16 = fArr3[3];
                            float f17 = fArr3[4];
                            float f18 = fArr3[5];
                            switch (c4) {
                                case KeyInformation.AES128_DES56 /*65*/:
                                case 'a':
                                    i4 = 7;
                                    break;
                                case KeyInformation.AES128_DES112 /*67*/:
                                case 'c':
                                    i4 = 6;
                                    break;
                                case 'H':
                                case 'V':
                                case ErrorInfo.TYPE_SDU_FAILED /*104*/:
                                case 'v':
                                    i4 = 1;
                                    break;
                                case 'L':
                                case 'M':
                                case 'T':
                                case 'l':
                                case 'm':
                                case 't':
                                    i4 = 2;
                                    break;
                                case 'Q':
                                case 'S':
                                case 'q':
                                case 's':
                                    i4 = 4;
                                    break;
                                case 'Z':
                                case 'z':
                                    path.close();
                                    path.moveTo(f17, f18);
                                    f14 = f18;
                                    f16 = f14;
                                    f13 = f17;
                                    f15 = f13;
                                    i4 = 2;
                                    break;
                                default:
                                    i4 = 2;
                                    break;
                            }
                            float f19 = abs;
                            int i8 = i6;
                            char c5 = c3;
                            float f20 = f13;
                            float f21 = f14;
                            int i9 = 0;
                            while (true) {
                                float f22 = min;
                                if (i9 >= fArr4.length) {
                                    fArr3[0] = f20;
                                    fArr3[1] = f21;
                                    fArr3[2] = f15;
                                    fArr3[3] = f16;
                                    fArr3[4] = f17;
                                    fArr3[5] = f18;
                                    i7++;
                                    c3 = lpVarArr2[i7].f26522a;
                                    i6 = i8;
                                    abs = f19;
                                    min = f22;
                                    c2 = 0;
                                } else {
                                    if (c4 == 'A') {
                                        c = c4;
                                        float f23 = f18;
                                        lpVarArr = lpVarArr2;
                                        i5 = i7;
                                        fArr = fArr3;
                                        int i10 = i9 + 5;
                                        float f24 = fArr4[i10];
                                        int i11 = i9 + 6;
                                        float f25 = fArr4[i11];
                                        float f26 = fArr4[i9];
                                        float f27 = fArr4[i9 + 1];
                                        float f28 = fArr4[i9 + 2];
                                        if (fArr4[i9 + 3] != 0.0f) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (fArr4[i9 + 4] != 0.0f) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        C1169lp.m19467a(path, f20, f21, f24, f25, f26, f27, f28, z, z2);
                                        f20 = fArr4[i10];
                                        f21 = fArr4[i11];
                                        f15 = f20;
                                        f16 = f21;
                                        f18 = f23;
                                    } else if (c4 == 'C') {
                                        c = c4;
                                        lpVarArr = lpVarArr2;
                                        i5 = i7;
                                        fArr = fArr3;
                                        int i12 = i9 + 2;
                                        int i13 = i9 + 3;
                                        int i14 = i9 + 4;
                                        int i15 = i9 + 5;
                                        path.cubicTo(fArr4[i9], fArr4[i9 + 1], fArr4[i12], fArr4[i13], fArr4[i14], fArr4[i15]);
                                        float f29 = fArr4[i14];
                                        f21 = fArr4[i15];
                                        f15 = fArr4[i12];
                                        f16 = fArr4[i13];
                                        f20 = f29;
                                        f18 = f18;
                                    } else if (c4 == 'H') {
                                        c = c4;
                                        lpVarArr = lpVarArr2;
                                        i5 = i7;
                                        fArr = fArr3;
                                        path.lineTo(fArr4[i9], f21);
                                        f20 = fArr4[i9];
                                    } else if (c4 == 'Q') {
                                        c = c4;
                                        lpVarArr = lpVarArr2;
                                        i5 = i7;
                                        fArr = fArr3;
                                        int i16 = i9 + 1;
                                        int i17 = i9 + 2;
                                        int i18 = i9 + 3;
                                        path.quadTo(fArr4[i9], fArr4[i16], fArr4[i17], fArr4[i18]);
                                        float f30 = fArr4[i9];
                                        float f31 = fArr4[i16];
                                        float f32 = fArr4[i17];
                                        f21 = fArr4[i18];
                                        f16 = f31;
                                        f15 = f30;
                                        f18 = f18;
                                        f20 = f32;
                                    } else if (c4 == 'V') {
                                        c = c4;
                                        lpVarArr = lpVarArr2;
                                        i5 = i7;
                                        fArr = fArr3;
                                        path.lineTo(f20, fArr4[i9]);
                                        f21 = fArr4[i9];
                                    } else if (c4 == 'a') {
                                        c = c4;
                                        float f33 = f18;
                                        lpVarArr = lpVarArr2;
                                        i5 = i7;
                                        fArr = fArr3;
                                        int i19 = i9 + 5;
                                        float f34 = fArr4[i19] + f20;
                                        int i20 = i9 + 6;
                                        float f35 = fArr4[i20] + f21;
                                        float f36 = fArr4[i9];
                                        float f37 = fArr4[i9 + 1];
                                        float f38 = fArr4[i9 + 2];
                                        if (fArr4[i9 + 3] != 0.0f) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        if (fArr4[i9 + 4] != 0.0f) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        C1169lp.m19467a(path, f20, f21, f34, f35, f36, f37, f38, z3, z4);
                                        f20 += fArr4[i19];
                                        f21 += fArr4[i20];
                                        f15 = f20;
                                        f16 = f21;
                                        f18 = f33;
                                    } else if (c4 == 'c') {
                                        c = c4;
                                        lpVarArr = lpVarArr2;
                                        i5 = i7;
                                        fArr = fArr3;
                                        int i21 = i9 + 2;
                                        int i22 = i9 + 3;
                                        int i23 = i9 + 4;
                                        int i24 = i9 + 5;
                                        path.rCubicTo(fArr4[i9], fArr4[i9 + 1], fArr4[i21], fArr4[i22], fArr4[i23], fArr4[i24]);
                                        float f39 = fArr4[i21] + f20;
                                        float f40 = fArr4[i22] + f21;
                                        f20 += fArr4[i23];
                                        f21 += fArr4[i24];
                                        f15 = f39;
                                        f16 = f40;
                                        f18 = f18;
                                    } else if (c4 == 'h') {
                                        c = c4;
                                        lpVarArr = lpVarArr2;
                                        i5 = i7;
                                        fArr = fArr3;
                                        path.rLineTo(fArr4[i9], 0.0f);
                                        f20 += fArr4[i9];
                                    } else if (c4 == 'q') {
                                        c = c4;
                                        int i25 = i9 + 1;
                                        int i26 = i9 + 2;
                                        int i27 = i9 + 3;
                                        lpVarArr = lpVarArr2;
                                        i5 = i7;
                                        fArr = fArr3;
                                        path.rQuadTo(fArr4[i9], fArr4[i25], fArr4[i26], fArr4[i27]);
                                        float f41 = fArr4[i9] + f20;
                                        float f42 = fArr4[i25] + f21;
                                        f20 += fArr4[i26];
                                        f21 += fArr4[i27];
                                        f16 = f42;
                                        f15 = f41;
                                        f18 = f18;
                                    } else if (c4 == 'v') {
                                        c = c4;
                                        path.rLineTo(0.0f, fArr4[i9]);
                                        f21 += fArr4[i9];
                                        lpVarArr = lpVarArr2;
                                        i5 = i7;
                                        fArr = fArr3;
                                    } else if (c4 == 'L') {
                                        c = c4;
                                        int i28 = i9 + 1;
                                        path.lineTo(fArr4[i9], fArr4[i28]);
                                        f20 = fArr4[i9];
                                        f21 = fArr4[i28];
                                        lpVarArr = lpVarArr2;
                                        i5 = i7;
                                        fArr = fArr3;
                                    } else if (c4 == 'M') {
                                        c = c4;
                                        float f43 = f18;
                                        f20 = fArr4[i9];
                                        f21 = fArr4[i9 + 1];
                                        if (i9 > 0) {
                                            path.lineTo(f20, f21);
                                            lpVarArr = lpVarArr2;
                                            i5 = i7;
                                            fArr = fArr3;
                                            f18 = f43;
                                        } else {
                                            path.moveTo(f20, f21);
                                            f17 = f20;
                                            f18 = f21;
                                            lpVarArr = lpVarArr2;
                                            i5 = i7;
                                            fArr = fArr3;
                                        }
                                    } else if (c4 == 'S') {
                                        c = c4;
                                        float f44 = f18;
                                        if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                            f5 = (f20 + f20) - f15;
                                            f4 = (f21 + f21) - f16;
                                        } else {
                                            f5 = f20;
                                            f4 = f21;
                                        }
                                        int i29 = i9 + 1;
                                        int i30 = i9 + 2;
                                        int i31 = i9 + 3;
                                        path.cubicTo(f5, f4, fArr4[i9], fArr4[i29], fArr4[i30], fArr4[i31]);
                                        float f45 = fArr4[i9];
                                        float f46 = fArr4[i29];
                                        float f47 = fArr4[i30];
                                        f21 = fArr4[i31];
                                        f16 = f46;
                                        f15 = f45;
                                        lpVarArr = lpVarArr2;
                                        i5 = i7;
                                        fArr = fArr3;
                                        f18 = f44;
                                        f20 = f47;
                                    } else if (c4 == 'T') {
                                        c = c4;
                                        float f48 = f18;
                                        if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                            f20 = (f20 + f20) - f15;
                                            f21 = (f21 + f21) - f16;
                                        }
                                        int i32 = i9 + 1;
                                        path.quadTo(f20, f21, fArr4[i9], fArr4[i32]);
                                        float f49 = fArr4[i9];
                                        f15 = f20;
                                        f16 = f21;
                                        lpVarArr = lpVarArr2;
                                        i5 = i7;
                                        fArr = fArr3;
                                        f18 = f48;
                                        f21 = fArr4[i32];
                                        f20 = f49;
                                    } else if (c4 == 'l') {
                                        c = c4;
                                        int i33 = i9 + 1;
                                        path.rLineTo(fArr4[i9], fArr4[i33]);
                                        f20 += fArr4[i9];
                                        f21 += fArr4[i33];
                                        lpVarArr = lpVarArr2;
                                        i5 = i7;
                                        fArr = fArr3;
                                    } else if (c4 == 'm') {
                                        c = c4;
                                        float f50 = f18;
                                        float f51 = fArr4[i9];
                                        f20 += f51;
                                        float f52 = fArr4[i9 + 1];
                                        f21 += f52;
                                        if (i9 > 0) {
                                            path.rLineTo(f51, f52);
                                            lpVarArr = lpVarArr2;
                                            i5 = i7;
                                            fArr = fArr3;
                                            f18 = f50;
                                        } else {
                                            path.rMoveTo(f51, f52);
                                            f17 = f20;
                                            f18 = f21;
                                            lpVarArr = lpVarArr2;
                                            i5 = i7;
                                            fArr = fArr3;
                                        }
                                    } else if (c4 == 's') {
                                        c = c4;
                                        float f53 = f18;
                                        if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                            f7 = f20 - f15;
                                            f6 = f21 - f16;
                                        } else {
                                            f7 = 0.0f;
                                            f6 = 0.0f;
                                        }
                                        int i34 = i9 + 1;
                                        int i35 = i9 + 2;
                                        int i36 = i9 + 3;
                                        path.rCubicTo(f7, f6, fArr4[i9], fArr4[i34], fArr4[i35], fArr4[i36]);
                                        float f54 = fArr4[i9] + f20;
                                        float f55 = fArr4[i34] + f21;
                                        f20 += fArr4[i35];
                                        f21 += fArr4[i36];
                                        f16 = f55;
                                        f15 = f54;
                                        lpVarArr = lpVarArr2;
                                        i5 = i7;
                                        fArr = fArr3;
                                        f18 = f53;
                                    } else if (c4 != 't') {
                                        c = c4;
                                        lpVarArr = lpVarArr2;
                                        i5 = i7;
                                        fArr = fArr3;
                                    } else {
                                        if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                            f9 = f20 - f15;
                                            f8 = f21 - f16;
                                        } else {
                                            f9 = 0.0f;
                                            f8 = 0.0f;
                                        }
                                        int i37 = i9 + 1;
                                        c = c4;
                                        path.rQuadTo(f9, f8, fArr4[i9], fArr4[i37]);
                                        float f56 = f9 + f20;
                                        float f57 = f8 + f21;
                                        f20 += fArr4[i9];
                                        f21 += fArr4[i37];
                                        f15 = f56;
                                        f16 = f57;
                                        lpVarArr = lpVarArr2;
                                        i5 = i7;
                                        fArr = fArr3;
                                        f18 = f18;
                                    }
                                    i9 += i4;
                                    min = f22;
                                    c5 = c;
                                    c4 = c5;
                                    lpVarArr2 = lpVarArr;
                                    i7 = i5;
                                    fArr3 = fArr;
                                }
                            }
                        }
                        f2 = abs;
                        f = min;
                        i3 = i6;
                    } else {
                        f2 = abs;
                        f = min;
                        i3 = i6;
                    }
                    Path path2 = this.f2322m;
                    this.f2323n.reset();
                    if (aut.mo2583a()) {
                        this.f2323n.setFillType(aut.f2308o == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        this.f2323n.addPath(path2, this.f2324o);
                        canvas2.clipPath(this.f2323n);
                    } else {
                        auq auq = (auq) aut;
                        float f58 = auq.f2287g;
                        if (f58 != 0.0f || auq.f2288h != 1.0f) {
                            float f59 = auq.f2289i;
                            float f60 = (f58 + f59) % 1.0f;
                            float f61 = (auq.f2288h + f59) % 1.0f;
                            if (this.f2325p == null) {
                                this.f2325p = new PathMeasure();
                            }
                            this.f2325p.setPath(this.f2322m, false);
                            float length = this.f2325p.getLength();
                            float f62 = f60 * length;
                            float f63 = f61 * length;
                            path2.reset();
                            if (f62 > f63) {
                                this.f2325p.getSegment(f62, length, path2, true);
                                f3 = 0.0f;
                                this.f2325p.getSegment(0.0f, f63, path2, true);
                            } else {
                                f3 = 0.0f;
                                this.f2325p.getSegment(f62, f63, path2, true);
                            }
                            path2.rLineTo(f3, f3);
                        }
                        this.f2323n.addPath(path2, this.f2324o);
                        if (auq.f2284d.mo14929c()) {
                            C1149kx kxVar = auq.f2284d;
                            if (this.f2312c == null) {
                                Paint paint = new Paint(1);
                                this.f2312c = paint;
                                paint.setStyle(Paint.Style.FILL);
                            }
                            Paint paint2 = this.f2312c;
                            if (kxVar.mo14926a()) {
                                Shader shader = kxVar.f25335a;
                                shader.setLocalMatrix(this.f2324o);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(auq.f2286f * 255.0f));
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                paint2.setColor(aux.m2148a(kxVar.f25336b, auq.f2286f));
                            }
                            paint2.setColorFilter(null);
                            this.f2323n.setFillType(auq.f2308o == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas2.drawPath(this.f2323n, paint2);
                        }
                        if (auq.f2282b.mo14929c()) {
                            C1149kx kxVar2 = auq.f2282b;
                            if (this.f2311b == null) {
                                Paint paint3 = new Paint(1);
                                this.f2311b = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.f2311b;
                            Paint.Join join = auq.f2291k;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = auq.f2290j;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(auq.f2292l);
                            if (kxVar2.mo14926a()) {
                                Shader shader2 = kxVar2.f25335a;
                                shader2.setLocalMatrix(this.f2324o);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(auq.f2285e * 255.0f));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                paint4.setColor(aux.m2148a(kxVar2.f25336b, auq.f2285e));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(auq.f2283c * f * f2);
                            canvas2.drawPath(this.f2323n, paint4);
                        }
                    }
                } else {
                    i3 = i6;
                }
            } else {
                i3 = i6;
            }
            i6 = i3 + 1;
            aur2 = aur;
            c2 = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return ((float) getRootAlpha()) / 255.0f;
    }

    public int getRootAlpha() {
        return this.f2318i;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f2318i = i;
    }

    public auu(auu auu) {
        this.f2324o = new Matrix();
        this.f2314e = 0.0f;
        this.f2315f = 0.0f;
        this.f2316g = 0.0f;
        this.f2317h = 0.0f;
        this.f2318i = 255;
        this.f2319j = null;
        this.f2320k = null;
        this.f2321l = new C1223np();
        this.f2313d = new aur(auu.f2313d, this.f2321l);
        this.f2322m = new Path(auu.f2322m);
        this.f2323n = new Path(auu.f2323n);
        this.f2314e = auu.f2314e;
        this.f2315f = auu.f2315f;
        this.f2316g = auu.f2316g;
        this.f2317h = auu.f2317h;
        int i = auu.f2326q;
        this.f2326q = 0;
        this.f2318i = auu.f2318i;
        this.f2319j = auu.f2319j;
        String str = auu.f2319j;
        if (str != null) {
            this.f2321l.put(str, this);
        }
        this.f2320k = auu.f2320k;
    }
}
