package com.google.android.gms.ocr.credit.processors;

import com.google.android.gms.ocr.credit.base.ExpDateResult;
import com.google.android.gms.ocr.credit.base.NameResult;
import com.google.android.gms.ocr.credit.base.PanResult;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CreditCardRecognizer {

    /* renamed from: a */
    public final akvk f81311a;

    /* renamed from: b */
    public final float[] f81312b;

    /* renamed from: c */
    public final int[] f81313c;

    /* renamed from: d */
    public final boolean[] f81314d;

    /* renamed from: e */
    public final boolean f81315e;

    /* renamed from: f */
    public final boolean f81316f;

    public CreditCardRecognizer(akvk akvk, bsas bsas, boolean z, boolean z2) {
        int i;
        this.f81311a = akvk;
        this.f81315e = z;
        this.f81316f = z2;
        if (bsas != null) {
            i = bsas.f143902a.size();
        } else {
            i = 0;
        }
        this.f81312b = new float[(i * 19)];
        this.f81313c = new int[i];
        this.f81314d = new boolean[i];
        for (int i2 = 0; i2 < i; i2++) {
            bsar bsar = (bsar) bsas.f143902a.get(i2);
            int size = bsar.f143896a.size();
            int i3 = 1;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                int b = bsar.f143896a.mo74151b(i5);
                for (int i6 = 0; i6 < b; i6++) {
                    this.f81312b[(i2 * 19) + i4 + i6] = (float) (i3 + i6);
                }
                i3 += b;
                i4 += b;
                if (i5 < size - 1) {
                    i3 += bsar.f143897b.mo74151b(i5);
                }
            }
            this.f81313c[i2] = i4;
            this.f81314d[i2] = bsar.f143898c;
        }
    }

    public native NameResult nativeGetCardHolderName(byte[] bArr, String str, byte[] bArr2, int i);

    public native PanResult nativeGetCreditCardNumbers(byte[] bArr, float[] fArr, int[] iArr, boolean[] zArr, boolean z, boolean z2);

    public native ExpDateResult nativeGetExpirationDate(byte[] bArr, byte[] bArr2, int i);
}
