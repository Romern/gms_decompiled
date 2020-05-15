package p000;

import com.google.android.gms.phenotype.ExperimentTokens;

/* renamed from: anhh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anhh extends C1231nx {
    public anhh() {
        super((int) cgcy.f186581a.mo6606a().mo83504a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ int mo15551b(Object obj, Object obj2) {
        ExperimentTokens experimentTokens = (ExperimentTokens) obj2;
        int length = ((String) obj).length();
        int i = length + length;
        int length2 = experimentTokens.f82088b.length();
        int i2 = length2 + length2;
        byte[] bArr = experimentTokens.f82089c;
        int i3 = 0;
        int length3 = i2 + (bArr != null ? bArr.length : 0) + ExperimentTokens.m68217a(experimentTokens.f82090d) + ExperimentTokens.m68217a(experimentTokens.f82091e) + ExperimentTokens.m68217a(experimentTokens.f82092f) + ExperimentTokens.m68217a(experimentTokens.f82093g) + ExperimentTokens.m68217a(experimentTokens.f82095i);
        int[] iArr = experimentTokens.f82094h;
        int length4 = length3 + ((iArr != null ? iArr.length : 0) * 4);
        int[] iArr2 = experimentTokens.f82096j;
        if (iArr2 != null) {
            i3 = iArr2.length;
        }
        return i + length4 + (i3 * 4);
    }
}
