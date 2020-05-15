package p000;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bun extends bwz {

    /* renamed from: a */
    public static final byte[] f5669a = {-114};

    /* renamed from: b */
    public static final bzu f5670b;

    /* renamed from: c */
    public static final bzx f5671c = bzx.BOTH;

    /* renamed from: d */
    public static final int f5672d = 3;

    /* renamed from: e */
    public static final int f5673e = 1;

    /* renamed from: f */
    public static final int f5674f = 1;

    /* renamed from: g */
    public static final int f5675g = 1;

    static {
        bzv bzv = new bzv();
        bzv.f6286a = "CVM List";
        bzv.f6287b = "Identifies methods of verification supported";
        bzv.f6293h = f5672d;
        bzv.f6292g = 10;
        bzv.f6294i = f5673e;
        bzv.f6290e = f5671c;
        bzv.f6288c = f5669a;
        bzv.f6295j = f5674f;
        bzv.f6298m = f5675g;
        f5670b = bzv.mo3629a();
    }

    public bun(byte[] bArr) {
        super(bArr, f5670b);
    }

    /* renamed from: a */
    public final List mo3521a() {
        try {
            ArrayList arrayList = new ArrayList();
            if ((mo3563i().length & 1) == 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(mo3563i());
                byteArrayInputStream.read(new byte[8]);
                while (byteArrayInputStream.available() > 0) {
                    byte[] bArr = new byte[2];
                    if (byteArrayInputStream.read(bArr) == 2) {
                        arrayList.add(new bup(bArr));
                    } else {
                        throw new IllegalStateException("Invalid amount of bytes was read from the inputstream");
                    }
                }
                return arrayList;
            }
            throw new IllegalStateException("Invalid length of bytes not dividable by 2");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final boolean mo3522a(buo buo) {
        try {
            for (bup bup : mo3521a()) {
                byte b = bup.mo3563i()[0];
                buo[] values = buo.values();
                int length = values.length;
                int i = 0;
                while (i < length) {
                    buo buo2 = values[i];
                    if (buo2.f5680d != b) {
                        i++;
                    } else if (buo2.equals(buo)) {
                        return true;
                    }
                }
                throw new IllegalArgumentException("Unsupported CVM option");
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }
}
