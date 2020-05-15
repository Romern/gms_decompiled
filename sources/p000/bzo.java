package p000;

import java.io.ByteArrayInputStream;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: bzo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzo extends bys {

    /* renamed from: a */
    public static final bze f6260a = new bze((byte) -1, (byte) -102);

    /* renamed from: b */
    public static final bzc f6261b = new bzc(3);

    /* renamed from: f */
    public final SortedMap f6262f = new TreeMap();

    static {
        bzx bzx = bzx.MSD;
    }

    public bzo(bze bze, byte[] bArr, bzg bzg) {
        super(bze, bArr, f6261b);
        for (bpc bpc : new bpn().mo3376b(new ByteArrayInputStream(bArr))) {
            if (bpc.mo3349a().equals(bpk.m3440c(byc.f6102a))) {
                byc byc = new byc(bpc.mo3355b(), bzg);
                this.f6262f.put(cbm.m3893a(byc.f6112e), byc.f6113f);
            } else {
                throw new RuntimeException("Expected DGI_CONTAINER_IDENTIFIER");
            }
        }
    }

    /* renamed from: a */
    public final boolean mo3615a(bpo bpo) {
        throw new UnsupportedOperationException("Not supported.");
    }
}
