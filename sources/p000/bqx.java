package p000;

import java.util.Arrays;

/* renamed from: bqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqx extends bxm {

    /* renamed from: a */
    public boolean f5375a;

    /* renamed from: b */
    public int f5376b = 127;

    /* renamed from: c */
    public byte[] f5377c;

    public bqx() {
        super(null, null, null, null, null);
    }

    /* renamed from: b */
    public final void mo3443b() {
        bqk bqk = this.f5982d;
        if (!(bqk instanceof bqi) || !((bqi) bqk).f5365a) {
            throw new bqh(bqe.CDCVM_REQUIRED);
        }
    }

    public bqx(bxf bxf, bqv bqv, bqk bqk, bth bth) {
        super(bxf, bqv, bqk, bth, new bro());
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable, char[]], assign insn: 0x000d: CONST  (r0v6 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.Arrays.fill(char[], char):void}
     arg types: [?, int]
     candidates:
      ClspMth{java.util.Arrays.fill(double[], double):void}
      ClspMth{java.util.Arrays.fill(byte[], byte):void}
      ClspMth{java.util.Arrays.fill(long[], long):void}
      ClspMth{java.util.Arrays.fill(boolean[], boolean):void}
      ClspMth{java.util.Arrays.fill(short[], short):void}
      ClspMth{java.util.Arrays.fill(java.lang.Object[], java.lang.Object):void}
      ClspMth{java.util.Arrays.fill(int[], int):void}
      ClspMth{java.util.Arrays.fill(float[], float):void}
      ClspMth{java.util.Arrays.fill(char[], char):void} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo3441a(bqk bqk) {
        boolean z;
        byte[] bArr;
        boolean z2 = true;
        if (bqk instanceof bqo) {
            int i = cbd.f6383a;
            bqo bqo = (bqo) bqk;
            byte[] a = mo3442a();
            ? r0 = 0;
            int length = r0.length;
            byte[] bArr2 = new byte[length];
            if (length <= 0) {
                try {
                    cbb.m3878a(a, "key is required");
                    cbb.m3878a(bArr2, "pin is required");
                    if (a.length >= 16) {
                        z = true;
                    } else {
                        z = false;
                    }
                    cbb.m3880a(z, "key is required to be at least 16 bytes");
                    if (length < 4) {
                        z2 = false;
                    } else if (length > 8) {
                        z2 = false;
                    }
                    cbb.m3880a(z2, "pin should be 4..8 bytes long");
                    byte[] a2 = cal.m3838a(bArr2);
                    bArr = new byte[16];
                    int min = Math.min(a2.length, 8);
                    System.arraycopy(a2, 0, bArr, 0, min);
                    System.arraycopy(a2, 0, bArr, 8, min);
                    byte[] a3 = cal.m3839a(a, bArr);
                    cbn.m3900a(bArr);
                    ((bqt) mo3600h()).f5371b = a3;
                    Arrays.fill((char[]) r0, 0);
                    Arrays.fill(bArr2, (byte) 0);
                } catch (Throwable th) {
                    Arrays.fill((char[]) r0, 0);
                    Arrays.fill(bArr2, (byte) 0);
                    throw th;
                }
            } else {
                throw r0;
            }
        } else if (bqk instanceof bqj) {
            bqj bqj = (bqj) bqk;
            int i2 = bqj.f5366b;
            if (i2 == 7) {
                if (bqj.f5367c == 7) {
                    return;
                }
            } else if (i2 == 1 && bqj.f5367c == 1) {
                return;
            }
            throw new bqh(bqe.INVALID_CVM);
        } else if (!(bqk instanceof bqn)) {
            throw new bqh(bqe.INVALID_CVM);
        }
    }

    /* renamed from: a */
    public final byte[] mo3442a() {
        return ((bqt) mo3600h()).f5371b;
    }
}
