package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: catj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class catj {

    /* renamed from: a */
    private List f175825a;

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, byte], vars: [r3v3 ?, r3v2 ?, r3v4 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    private catj(byte[] r12) {
        /*
            r11 = this;
            r11.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.f175825a = r0
            r0 = 0
            r1 = 0
        L_0x000c:
            int r2 = r12.length
            if (r1 >= r2) goto L_0x00b3
            if (r12 != 0) goto L_0x0013
            goto L_0x0093
        L_0x0013:
            if (r1 < 0) goto L_0x0093
            if (r1 >= r2) goto L_0x0093
            java.lang.String r3 = "Invalid offset or data"
            if (r1 >= r2) goto L_0x008d
            byte r2 = r12[r1]
            r4 = 31
            r2 = r2 & r4
            r5 = 1
            if (r2 != r4) goto L_0x0037
            r2 = 1
            r4 = 1
        L_0x0025:
            int r6 = r12.length
            if (r2 < r6) goto L_0x0029
            goto L_0x0038
        L_0x0029:
            int r4 = r4 + 1
            int r6 = r1 + r2
            byte r6 = r12[r6]
            r7 = 128(0x80, float:1.794E-43)
            r6 = r6 & r7
            if (r6 != r7) goto L_0x0038
            int r2 = r2 + 1
            goto L_0x0025
        L_0x0037:
            r4 = 1
        L_0x0038:
            byte[] r2 = new byte[r4]
            java.lang.System.arraycopy(r12, r1, r2, r0, r4)
            int r6 = r1 + r4
            int r7 = m127171a(r12, r6)
            if (r6 < 0) goto L_0x0087
            int r8 = r12.length
            if (r6 >= r8) goto L_0x0087
            int r3 = m127171a(r12, r6)
            int r9 = r6 + r3
            if (r8 < r9) goto L_0x007f
            if (r3 != r5) goto L_0x0055
            byte r3 = r12[r6]
            goto L_0x006b
        L_0x0055:
            r5 = 0
            r8 = 1
        L_0x0057:
            if (r8 >= r3) goto L_0x006a
            int r9 = r8 + r6
            byte r9 = r12[r9]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r10 = r3 - r8
            int r10 = r10 + -1
            int r10 = r10 * 8
            int r9 = r9 << r10
            int r5 = r5 + r9
            int r8 = r8 + 1
            goto L_0x0057
        L_0x006a:
            r3 = r5
        L_0x006b:
            byte[] r5 = new byte[r3]
            int r6 = r6 + r7
            java.lang.System.arraycopy(r12, r6, r5, r0, r3)
            java.util.List r6 = r11.f175825a
            cati r8 = new cati
            r8.<init>(r2, r5)
            r6.add(r8)
            int r4 = r4 + r7
            int r4 = r4 + r3
            int r1 = r1 + r4
            goto L_0x000c
        L_0x007f:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid length"
            r12.<init>(r0)
            throw r12
        L_0x0087:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>(r3)
            throw r12
        L_0x008d:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>(r3)
            throw r12
        L_0x0093:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r12 = p000.catg.m127164b(r12)
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.String r1 = "Invalid TLV: "
            int r2 = r12.length()
            if (r2 != 0) goto L_0x00ab
            java.lang.String r12 = new java.lang.String
            r12.<init>(r1)
            goto L_0x00af
        L_0x00ab:
            java.lang.String r12 = r1.concat(r12)
        L_0x00af:
            r0.<init>(r12)
            throw r0
        L_0x00b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.catj.<init>(byte[]):void");
    }

    /* renamed from: a */
    private static int m127171a(byte[] bArr, int i) {
        if (i < 0 || i >= bArr.length) {
            throw new IllegalArgumentException("Invalid offset or data");
        }
        byte b = bArr[i];
        return ((b & 128) == 128 ? b & Byte.MAX_VALUE : 0) + 1;
    }

    /* renamed from: b */
    public final byte[] mo74844b(byte[] bArr) {
        cati cati;
        List list = this.f175825a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                cati = null;
                break;
            }
            cati = (cati) list.get(i);
            i++;
            if (Arrays.equals(bArr, cati.f175823a)) {
                break;
            }
        }
        if (cati != null) {
            return cati.f175824b;
        }
        return null;
    }

    /* renamed from: a */
    public static catj m127172a(byte[] bArr) {
        try {
            return new catj(bArr);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            bqye.m113758a(e);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo74841a(byte[] bArr, byte[] bArr2) {
        int i = 0;
        while (true) {
            if (i < this.f175825a.size()) {
                if (Arrays.equals(((cati) this.f175825a.get(i)).f175823a, bArr)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i == -1) {
            this.f175825a.add(new cati(bArr, bArr2));
        } else {
            this.f175825a.set(i, new cati(bArr, bArr2));
        }
    }

    /* renamed from: a */
    public final byte[] mo74842a() {
        ArrayList arrayList = new ArrayList();
        List list = this.f175825a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            cati cati = (cati) list.get(i);
            arrayList.add(cath.m127170a(cati.f175823a, cati.f175824b));
        }
        int size2 = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size2; i3++) {
            i2 += ((byte[]) arrayList.get(i3)).length;
        }
        byte[] bArr = new byte[i2];
        int size3 = arrayList.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size3; i5++) {
            byte[] bArr2 = (byte[]) arrayList.get(i5);
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    /* renamed from: a */
    public final byte[] mo74843a(String str) {
        return mo74844b(catg.m127160a(str));
    }
}
