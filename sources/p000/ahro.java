package p000;

import android.net.nsd.NsdServiceInfo;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: ahro */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahro {

    /* renamed from: a */
    static final Charset f67888a = Charset.forName("UTF-8");

    /* renamed from: b */
    public final int f67889b;

    /* renamed from: c */
    public final String f67890c;

    /* renamed from: d */
    public final byte[] f67891d;

    /* renamed from: e */
    public final byte[] f67892e;

    public ahro(int i, String str, byte[] bArr, byte[] bArr2) {
        this.f67889b = i;
        this.f67890c = str;
        this.f67891d = bArr;
        this.f67892e = bArr2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, int):void
     arg types: [java.lang.String, byte]
     candidates:
      bnsi.a(java.lang.String, byte):void
      bnsi.a(java.lang.String, long):void
      bnsi.a(java.lang.String, java.lang.Object):void
      bnsi.a(java.lang.String, short):void
      bnsi.a(java.lang.String, java.lang.Object[]):void
      bnsi.a(java.lang.String, int):void */
    /* renamed from: a */
    public static ahro m56437a(NsdServiceInfo nsdServiceInfo) {
        byte[] bArr;
        byte[] bArr2;
        String serviceName = nsdServiceInfo.getServiceName();
        try {
            bArr = sqd.m35971c(serviceName);
        } catch (IllegalArgumentException e) {
            bArr = null;
        }
        if (bArr == null) {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68420a("Cannot deserialize WifiLanServiceInfo: failed Base64 decoding of %s", serviceName);
            return null;
        }
        int length = bArr.length;
        if (length > 47) {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68411a("Cannot deserialize WifiLanServiceInfo: expecting max %d raw bytes, got %d", 47, length);
            return null;
        } else if (length >= 9) {
            int i = (bArr[0] & 224) >> 5;
            if (i != 1) {
                ((bnsl) ahkm.f67363a.mo68390d()).mo68409a("Cannot deserialize WifiLanServiceInfo: unsupported Version %d", i);
                return null;
            }
            try {
                bArr2 = sqd.m35967a(nsdServiceInfo.getAttributes().get("n"));
            } catch (IllegalArgumentException e2) {
                bnsl bnsl = (bnsl) ahkm.f67363a.mo68388c();
                bnsl.mo68437a(e2);
                bnsl.mo68405a("Failed to decode Wifi LAN endpoint name");
                bArr2 = null;
            }
            if (bArr2 == null) {
                return null;
            }
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            byte b = wrap.get() & 31;
            if (b == 1 || b == 2 || b == 3) {
                byte[] bArr3 = new byte[4];
                wrap.get(bArr3);
                String str = new String(bArr3, f67888a);
                byte[] bArr4 = new byte[3];
                wrap.get(bArr4);
                return new ahro(b, str, bArr4, bArr2);
            }
            ((bnsl) ahkm.f67363a.mo68390d()).mo68409a("Cannot deserialize WifiLanServiceInfo: unsupported V1 PCP %d", (int) b);
            return null;
        } else {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68411a("Cannot deserialize WifiLanServiceInfo: expecting min %d raw bytes, got %d", 9, length);
            return null;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String, java.lang.Integer, int]
     candidates:
      bnsi.a(java.lang.String, java.lang.String, int, java.lang.String):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object):void */
    /* renamed from: a */
    public static NsdServiceInfo m56438a(int i, String str, byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        int length = bArr2.length;
        if (length > 131) {
            ((bnsl) ahkm.f67363a.mo68388c()).mo68425a("While serializing Advertisement, truncating Endpoint Info %s (%d bytes) down to %d bytes", (Object) ahkm.m55981a(bArr2), (Object) Integer.valueOf(length), (Object) 131);
            bArr2 = Arrays.copyOf(bArr2, 131);
        }
        ByteBuffer allocate = ByteBuffer.allocate(9);
        allocate.put((byte) ((i & 31) | 32));
        if (i != 1 && i != 2 && i != 3) {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68409a("Cannot serialize WifiLanServiceInfo: unsupported V1 PCP %d", i);
            bArr3 = null;
        } else if (str.length() != 4) {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68425a("Cannot serialize WifiLanServiceInfo: V1 Endpoint ID %s (%d bytes) should be exactly %d bytes", (Object) str, (Object) Integer.valueOf(str.length()), (Object) 4);
            bArr3 = null;
        } else {
            allocate.put(str.getBytes(f67888a));
            int length2 = bArr.length;
            if (length2 != 3) {
                ((bnsl) ahkm.f67363a.mo68390d()).mo68411a("Cannot serialize WifiLanServiceInfo: V1 ServiceID hash (%d bytes) should be exactly %d bytes", length2, 3);
                bArr3 = null;
            } else {
                allocate.put(bArr);
                bArr3 = allocate.array();
            }
        }
        if (bArr3 == null) {
            return null;
        }
        String d = sqd.m35972d(bArr3);
        String d2 = sqd.m35972d(bArr2);
        NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
        nsdServiceInfo.setServiceName(d);
        nsdServiceInfo.setAttribute("n", d2);
        return nsdServiceInfo;
    }
}
