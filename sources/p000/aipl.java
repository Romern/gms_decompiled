package p000;

import android.text.TextUtils;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.nio.ByteBuffer;

/* renamed from: aipl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aipl {

    /* renamed from: a */
    public final int f69438a;

    /* renamed from: b */
    public final byte[] f69439b;

    /* renamed from: c */
    public final byte[] f69440c;

    private aipl(int i, byte[] bArr, byte[] bArr2) {
        this.f69438a = i;
        this.f69439b = bArr;
        this.f69440c = bArr2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, int, int):void
     arg types: [java.lang.String, byte, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, int, int):void */
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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, int, int, java.lang.Integer]
     candidates:
      bnsi.a(java.lang.String, java.lang.String, int, java.lang.String):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object):void */
    /* renamed from: a */
    public static aipl m57663a(byte[] bArr) {
        if (bArr.length <= 0) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aipl", "a", 126, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68411a("Cannot deserialize BleL2capPacket: expected at least %d bytes, but got %d.", 1, 0);
            return null;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        byte b = wrap.get();
        if (b == 2 || b == 3 || b == 22 || b == 23 || b == 24) {
            return new aipl(b, null, null);
        }
        if (wrap.remaining() <= 2) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
            bnsl2.mo68432a("aipl", "a", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68411a("Cannot deserialize BleL2capPacket for command %d : expected two bytes length field but remaining %d bytes", (int) b, wrap.remaining());
            return null;
        }
        int i = wrap.getShort();
        if (i < wrap.remaining()) {
            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68390d();
            bnsl3.mo68432a("aipl", "a", (int) MfiClientException.TYPE_MFICLIENT_STARTED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68411a("Cannot deserialize BleL2capPacket: expected data length %d bytes but remaining %d", i, wrap.remaining());
            return null;
        } else if (b != 1) {
            if (b != 21) {
                bnsl bnsl4 = (bnsl) ailf.f69111a.mo68390d();
                bnsl4.mo68432a("aipl", "a", 183, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68409a("Cannot deserialize BleL2capPacket with unknown command %d", (int) b);
                return null;
            } else if (i > 512) {
                bnsl bnsl5 = (bnsl) ailf.f69111a.mo68390d();
                bnsl5.mo68432a("aipl", "a", 172, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl5.mo68411a("Cannot deserialize BleL2capPacket: expected total advertisement length of at most %d bytes but got %d.", 512, i);
                return null;
            } else {
                byte[] bArr2 = new byte[i];
                wrap.get(bArr2);
                return new aipl(21, null, bArr2);
            }
        } else if (i < 3) {
            bnsl bnsl6 = (bnsl) ailf.f69111a.mo68390d();
            bnsl6.mo68432a("aipl", "a", 161, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl6.mo68425a("Cannot deserialize BleL2capPacket for command %d : expected serviceIdHash length is %d but got %d.", (Object) 1, (Object) 3, (Object) Integer.valueOf(i));
            return null;
        } else {
            byte[] bArr3 = new byte[i];
            wrap.get(bArr3);
            return new aipl(1, bArr3, null);
        }
    }

    /* renamed from: a */
    public static boolean m57664a(int i) {
        return i > 0 && i < 515;
    }

    /* renamed from: b */
    public static byte[] m57668b() {
        return m57666a(23, null);
    }

    /* renamed from: c */
    public static byte[] m57671c() {
        return m57666a(24, null);
    }

    /* renamed from: b */
    public static byte[] m57669b(String str) {
        return ails.m57446a(str.getBytes(), 3);
    }

    /* renamed from: b */
    public static byte[] m57670b(byte[] bArr) {
        int length = bArr.length;
        if (length >= 8) {
            return m57666a(21, bArr);
        }
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68432a("aipl", "b", (int) ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68411a("Cannot serialize BleL2capPacket for RESPONSE_ADVERTISEMENT : expected min %d advertisement raw bytes, but got %d", 8, length);
        return null;
    }

    /* renamed from: a */
    public static byte[] m57665a() {
        return m57666a(22, null);
    }

    /* renamed from: a */
    public static byte[] m57666a(int i, byte[] bArr) {
        int i2;
        if (bArr != null) {
            i2 = bArr.length + 3;
        } else {
            i2 = 1;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i2);
        allocate.put((byte) (i & 255));
        if (bArr != null) {
            allocate.putShort((short) bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    /* renamed from: a */
    public static byte[] m57667a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return m57666a(1, m57669b(str));
        }
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68432a("aipl", "a", 190, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Cannot serialize BleL2capPacket for REQUEST_ADVERTISEMENT without serviceId");
        return null;
    }
}
