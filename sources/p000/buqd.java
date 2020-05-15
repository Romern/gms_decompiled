package p000;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.BitSet;

/* renamed from: buqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buqd {

    /* renamed from: a */
    public static final Charset f154699a = StandardCharsets.UTF_8;

    /* renamed from: b */
    private final BitSet f154700b;

    /* renamed from: c */
    private final int f154701c;

    /* renamed from: d */
    private final buqc f154702d;

    public buqd(byte[] bArr, buqc buqc) {
        this.f154700b = BitSet.valueOf(bArr);
        this.f154701c = bArr.length * 8;
        this.f154702d = buqc;
    }

    /* renamed from: a */
    public final void mo72978a(String str) {
        for (int i : this.f154702d.mo37862a(str.getBytes(f154699a))) {
            this.f154700b.set(bqcx.m112608a(i, this.f154701c));
        }
    }

    /* renamed from: a */
    public final boolean mo72979a(byte[] bArr) {
        for (int i : this.f154702d.mo37862a(bArr)) {
            if (!this.f154700b.get(bqcx.m112608a(i, this.f154701c))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final byte[] mo72980a() {
        byte[] byteArray = this.f154700b.toByteArray();
        int length = byteArray.length;
        int i = this.f154701c / 8;
        return length != i ? Arrays.copyOf(byteArray, i) : byteArray;
    }
}
