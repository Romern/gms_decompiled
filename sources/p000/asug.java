package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: asug */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asug {

    /* renamed from: a */
    private static final srn f89748a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    private final TreeMap f89749b = new TreeMap();

    /* renamed from: c */
    private Map.Entry f89750c;

    public asug(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            asqr asqr = (asqr) it.next();
            for (astc astc : asqr.mo49386a()) {
                this.f89749b.put(astc, asqr);
            }
        }
    }

    /* renamed from: a */
    public final asqr mo49508a() {
        Map.Entry entry = this.f89750c;
        if (entry != null) {
            return (asqr) entry.getValue();
        }
        return null;
    }

    /* renamed from: a */
    public final astf mo49509a(byte[] bArr) {
        Map.Entry entry;
        try {
            if (bqct.m112601a(bArr) == 164) {
                astc b = astc.m74748b(bArr);
                Map.Entry entry2 = null;
                if (b != null) {
                    byte b2 = bArr[3];
                    byte[] bArr2 = new byte[16];
                    Arrays.fill(bArr2, (byte) -1);
                    byte[] bArr3 = b.f89685k;
                    System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
                    NavigableMap subMap = this.f89749b.subMap(b, true, astc.m74747a(bArr2), true);
                    Map.Entry entry3 = this.f89750c;
                    if (entry3 == null && (b2 & 2) != 0) {
                        b2 &= -3;
                    }
                    if (b2 == 0) {
                        entry = subMap.firstEntry();
                    } else if (b2 == 1) {
                        entry = subMap.lastEntry();
                    } else if (b2 == 2) {
                        entry = subMap.higherEntry((astc) entry3.getKey());
                    } else if (b2 == 3) {
                        entry = subMap.lowerEntry((astc) entry3.getKey());
                    } else {
                        StringBuilder sb = new StringBuilder(27);
                        sb.append("unsupported p2: ");
                        sb.append((int) b2);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    if (entry != null) {
                        f89748a.mo26019b(aske.m74275a()).mo68424a("Selecting HCE applet: %s (%s)", entry.getValue(), entry.getKey());
                        entry2 = entry;
                    } else {
                        ((bnsl) f89748a.mo68388c()).mo68420a("No HCE applet available for AID %s", b);
                    }
                }
                this.f89750c = entry2;
                if (entry2 != null) {
                    astc astc = (astc) entry2.getKey();
                    byte b3 = bArr[4];
                    int a = astc.mo49453a() - b3;
                    if (a > 0) {
                        byte b4 = bArr[b3 + 5];
                        bArr = Arrays.copyOf(bArr, bArr.length + a);
                        bArr[3] = 0;
                        bArr[4] = (byte) astc.mo49453a();
                        System.arraycopy(astc.f89685k, 0, bArr, 5, astc.mo49453a());
                        bArr[astc.mo49453a() + 5] = b4;
                    }
                }
            }
            Map.Entry entry4 = this.f89750c;
            if (entry4 != null) {
                return ((asqr) entry4.getValue()).mo49385a(bArr);
            }
            return astf.m74754a(27266);
        } catch (ArrayIndexOutOfBoundsException e) {
            return astf.m74754a(26368);
        } catch (RuntimeException e2) {
            return astf.m74754a(28416);
        }
    }
}
