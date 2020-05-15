package p000;

import com.felicanetworks.mfc.FelicaException;
import java.util.ArrayList;

/* renamed from: lq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1170lq {
    /* renamed from: a */
    private static void m19509a(ArrayList arrayList, char c, float[] fArr) {
        arrayList.add(new C1169lp(c, fArr));
    }

    /* renamed from: a */
    static float[] m19510a(float[] fArr, int i) {
        if (i >= 0) {
            int min = Math.min(i, fArr.length);
            float[] fArr2 = new float[i];
            System.arraycopy(fArr, 0, fArr2, 0, min);
            return fArr2;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a6 A[Catch:{ NumberFormatException -> 0x00c4 }, LOOP:3: B:23:0x007a->B:41:0x00a6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ac A[Catch:{ NumberFormatException -> 0x00c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ad A[Catch:{ NumberFormatException -> 0x00c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ec A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00aa A[SYNTHETIC] */
    /* renamed from: a */
    public static C1169lp[] m19511a(String str) {
        String trim;
        float[] fArr;
        int i;
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        int i2 = 1;
        int i3 = 0;
        while (i2 < str.length()) {
            while (i2 < str.length()) {
                char charAt = str2.charAt(i2);
                if (((charAt - 'A') * (charAt - 'Z') > 0 && (charAt - 'a') * (charAt - 'z') > 0) || charAt == 'e' || charAt == 'E') {
                    i2++;
                } else {
                    trim = str2.substring(i3, i2).trim();
                    if (trim.length() > 0) {
                        if (trim.charAt(z ? 1 : 0) == 'z' || trim.charAt(z) == 'Z') {
                            i = 0;
                            fArr = new float[0];
                        } else {
                            try {
                                float[] fArr2 = new float[trim.length()];
                                C1167lo loVar = new C1167lo();
                                int length = trim.length();
                                int i4 = 1;
                                int i5 = 0;
                                while (i4 < length) {
                                    loVar.f26487a = z;
                                    int i6 = i4;
                                    boolean z2 = false;
                                    boolean z3 = false;
                                    boolean z4 = false;
                                    while (i6 < trim.length()) {
                                        char charAt2 = trim.charAt(i6);
                                        if (charAt2 != ' ') {
                                            if (charAt2 == 'E' || charAt2 == 'e') {
                                                z3 = true;
                                                if (!z4) {
                                                    i6++;
                                                } else {
                                                    if (i4 >= i6) {
                                                        fArr2[i5] = Float.parseFloat(trim.substring(i4, i6));
                                                        i5++;
                                                    }
                                                    i4 = loVar.f26487a ? i6 + 1 : i6;
                                                    z = false;
                                                }
                                            } else {
                                                switch (charAt2) {
                                                    case FelicaException.TYPE_RESET_FAILED:
                                                        break;
                                                    case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                                                        if (i6 != i4) {
                                                            if (z3) {
                                                            }
                                                            loVar.f26487a = true;
                                                            break;
                                                        }
                                                        z3 = false;
                                                        break;
                                                    case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                                                        if (!z2) {
                                                            z2 = true;
                                                            z3 = false;
                                                            break;
                                                        }
                                                        loVar.f26487a = true;
                                                        break;
                                                    default:
                                                        z3 = false;
                                                        break;
                                                }
                                                if (!z4) {
                                                }
                                            }
                                        }
                                        z3 = false;
                                        z4 = true;
                                        if (!z4) {
                                        }
                                    }
                                    if (i4 >= i6) {
                                    }
                                    if (loVar.f26487a) {
                                    }
                                    z = false;
                                }
                                fArr = m19510a(fArr2, i5);
                                i = 0;
                            } catch (NumberFormatException e) {
                                throw new RuntimeException("error in parsing \"" + trim + "\"", e);
                            }
                        }
                        m19509a(arrayList, trim.charAt(i), fArr);
                    }
                    i3 = i2;
                    z = false;
                    i2++;
                }
            }
            trim = str2.substring(i3, i2).trim();
            if (trim.length() > 0) {
            }
            i3 = i2;
            z = false;
            i2++;
        }
        if (i2 - i3 == 1 && i3 < str.length()) {
            m19509a(arrayList, str2.charAt(i3), new float[0]);
        }
        return (C1169lp[]) arrayList.toArray(new C1169lp[arrayList.size()]);
    }

    /* renamed from: a */
    public static C1169lp[] m19512a(C1169lp[] lpVarArr) {
        if (lpVarArr == null) {
            return null;
        }
        C1169lp[] lpVarArr2 = new C1169lp[lpVarArr.length];
        for (int i = 0; i < lpVarArr.length; i++) {
            lpVarArr2[i] = new C1169lp(lpVarArr[i]);
        }
        return lpVarArr2;
    }
}
