package p000;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.util.Arrays;

/* renamed from: xcv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xcv {

    /* renamed from: a */
    public final xmq f51972a;

    /* renamed from: b */
    private final byte[] f51973b;

    /* renamed from: c */
    private final String f51974c;

    /* renamed from: d */
    private final byte[] f51975d;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    public xcv(String str, PublicKey publicKey) {
        sdo.m34969a(str, (Object) "keyStorageIdentifier cannot be empty");
        sdo.checkIfNull(publicKey, "publicKey cannot be null");
        String substring = str.substring(2);
        try {
            this.f51972a = xmq.m43182a(Character.getNumericValue(str.charAt(0)));
            this.f51973b = boan.f132470d.mo68796b(substring.substring(0, substring.indexOf(".") - 1));
            String substring2 = substring.substring(substring.indexOf(".") + 1);
            this.f51974c = substring2;
            this.f51975d = m42683a(substring2, publicKey);
        } catch (IllegalArgumentException e) {
            adbd a = adbe.m50105a();
            a.f61234c = 8;
            a.f61233b = e;
            a.f61232a = "Unable to extract valid keyStorageType from keyStorageIdentifier";
            throw a.mo33301a();
        }
    }

    /* renamed from: a */
    private static final byte[] m42683a(String str, PublicKey publicKey) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA256");
            instance.update(str.getBytes("UTF-8"));
            instance.update(publicKey.getEncoded());
            return instance.digest();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            adbd a = adbe.m50105a();
            a.f61234c = 8;
            a.f61233b = e;
            a.f61232a = "Error creating rpId and public key hash";
            throw a.mo33301a();
        }
    }

    /* renamed from: b */
    public final byte[] mo29646b() {
        ByteBuffer allocate = ByteBuffer.allocate(this.f51973b.length + 1 + this.f51975d.length);
        allocate.put((byte) this.f51972a.f52779d);
        allocate.put(this.f51973b);
        allocate.put(this.f51975d);
        return allocate.array();
    }

    /* renamed from: a */
    public final String mo29645a() {
        return bmxr.m108543a('.').mo66875a(Integer.valueOf(this.f51972a.f52779d), boan.f132470d.mo68794a(this.f51973b), this.f51974c);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    public xcv(String str, byte[] bArr) {
        sdo.m34969a(str, (Object) "rpId cannot be empty");
        sdo.checkIfNull(bArr, "keyHandle cannot be null");
        try {
            this.f51972a = xmq.m43182a(bArr[0]);
            this.f51973b = Arrays.copyOfRange(bArr, 1, 33);
            this.f51974c = str;
            this.f51975d = Arrays.copyOfRange(bArr, 33, bArr.length);
        } catch (IllegalArgumentException e) {
            adbd a = adbe.m50105a();
            a.f61234c = 8;
            a.f61233b = e;
            a.f61232a = "Unable to extract valid keyStorageType from keyHandle";
            throw a.mo33301a();
        }
    }
}
