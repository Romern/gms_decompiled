package p000;

import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: aypf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aypf {

    /* renamed from: a */
    public byte[] f98159a;

    /* renamed from: b */
    private String f98160b;

    public aypf(ayri ayri) {
        ayrh c = ayri.mo54316c(ayod.f98113a, ayoa.f98107a);
        aype aype = new aype(this);
        synchronized (c.f98331a) {
            c.f98332b = aype;
            while (true) {
                byte[] bArr = (byte[]) c.f98331a.poll();
                if (bArr != null) {
                    aype.mo54187a(bArr);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized String mo54188a(byte[] bArr) {
        Object obj;
        int length;
        String str = this.f98160b;
        if (str != null) {
            return str;
        }
        byte[] bArr2 = this.f98159a;
        if (bArr2 != null) {
            if (bArr != null) {
                try {
                    if (bArr.length == 16) {
                        int length2 = bArr2.length;
                        if (length2 <= 8 || length2 > 64) {
                            String valueOf = String.valueOf(Integer.valueOf(length2));
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 56);
                            sb.append("Naming packet size is incorrect, namingPacket.length is ");
                            sb.append(valueOf);
                            throw new GeneralSecurityException(sb.toString());
                        }
                        byte[] copyOfRange = Arrays.copyOfRange(bArr2, 0, 8);
                        byte[] copyOf = Arrays.copyOf(ayqa.m84481a(bArr, Arrays.copyOfRange(bArr2, 8, length2)), 8);
                        if (!(copyOfRange == null || copyOf == null || copyOfRange.length != copyOf.length)) {
                            byte b = 0;
                            for (int i = 0; i < copyOfRange.length; i++) {
                                b |= copyOfRange[i] ^ copyOf[i];
                            }
                            if (b == 0) {
                                byte[] copyOfRange2 = Arrays.copyOfRange(bArr2, 8, bArr2.length);
                                if (copyOfRange2 == null || (length = copyOfRange2.length) <= 8) {
                                    String valueOf2 = String.valueOf(copyOfRange2 != null ? Integer.valueOf(copyOfRange2.length) : "NULL");
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 65);
                                    sb2.append("Incorrect data length ");
                                    sb2.append(valueOf2);
                                    sb2.append(" to decrypt, the data should contain nonce.");
                                    throw new GeneralSecurityException(sb2.toString());
                                }
                                this.f98160b = new String(ayne.m84290a(bArr, Arrays.copyOfRange(copyOfRange2, 8, length), Arrays.copyOf(copyOfRange2, 8)), StandardCharsets.UTF_8);
                                bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
                                bnsl.mo68432a("aypf", "a", 1718, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl.mo68420a("DeviceNameReceiver: decrypted provider's name from naming response, name = %s.", this.f98160b);
                                return this.f98160b;
                            }
                        }
                        throw new GeneralSecurityException("Verify HMAC failed, could be incorrect key or naming packet.");
                    }
                } catch (GeneralSecurityException e) {
                    bnsl bnsl2 = (bnsl) aypn.f98194a.mo68388c();
                    bnsl2.mo68437a(e);
                    bnsl2.mo68432a("aypf", "a", 1722, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("DeviceNameReceiver: fail to parse the NameCharacteristic from provider.");
                    return null;
                }
            }
            if (bArr != null) {
                obj = Integer.valueOf(bArr.length);
            } else {
                obj = "NULL";
            }
            String valueOf3 = String.valueOf(obj);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 59);
            sb3.append("Incorrect secret for decoding name packet, secret.length = ");
            sb3.append(valueOf3);
            throw new GeneralSecurityException(sb3.toString());
        }
        bnsl bnsl3 = (bnsl) aypn.f98194a.mo68390d();
        bnsl3.mo68432a("aypf", "a", 1713, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl3.mo68405a("DeviceNameReceiver: no device name sent from the Provider.");
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo54189b(byte[] bArr) {
        synchronized (this) {
            bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
            bnsl.mo68432a("aypf", "b", 1691, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68409a("DeviceNameReceiver: device name response size = %d", bArr.length);
            this.f98159a = bArr;
        }
    }
}
