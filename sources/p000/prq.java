package p000;

import android.content.Context;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.cast.firstparty.CastReceiver;
import com.google.android.gms.cast.firstparty.WifiRequestInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;

/* renamed from: prq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class prq extends aaab {

    /* renamed from: a */
    private static final byte[] f40108a = {48, -126, 0, -97, 48, 13, 6, 9, 42, -122, 72, -122, -9, 13, 1, 1, 1, 5, 0, 3, -126, 0, -115, 0};

    /* renamed from: b */
    private final qav f40109b = new qav("GetEncryptedWifiPasswordOperation");

    /* renamed from: c */
    private final WifiRequestInfo f40110c;

    /* renamed from: d */
    private final CastReceiver f40111d;

    /* renamed from: e */
    private final WifiManager f40112e;

    /* renamed from: f */
    private final phy f40113f;

    /* renamed from: g */
    private final prg f40114g;

    public prq(prg prg, WifiRequestInfo wifiRequestInfo, CastReceiver castReceiver, WifiManager wifiManager, phy phy) {
        super(122, "GetEncryptedWifiPasswordOperation");
        this.f40114g = prg;
        this.f40110c = wifiRequestInfo;
        this.f40111d = castReceiver;
        this.f40112e = wifiManager;
        this.f40113f = phy;
    }

    /* renamed from: a */
    static String m31089a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int length = str.length();
        if (length <= 1 || str.charAt(0) != '\"') {
            return str;
        }
        int i = length - 1;
        return str.charAt(i) == '\"' ? str.substring(1, i) : str;
    }

    /* renamed from: a */
    private final X509Certificate m31090a(String str, List list) {
        ArrayList arrayList = new ArrayList();
        try {
            byte[] bytes = str.getBytes("UTF-8");
            arrayList.add(bytes);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((String) it.next()).getBytes("UTF-8"));
            }
            try {
                X509Certificate a = pqz.m31044a().mo23569a(bytes);
                pqu a2 = pra.m31049a();
                a2.f40077b = false;
                a2.f40078c = ccyw.f180285a.mo6606a().mo77089c();
                if (!a2.mo23565a().mo23572a(arrayList, TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()))) {
                    return null;
                }
                return a;
            } catch (CertificateException e) {
                this.f40109b.mo23856a("Failed to generate X509Certificate for device certificate due to %s.", e);
                return null;
            }
        } catch (UnsupportedEncodingException e2) {
            this.f40109b.mo23856a("Failed to convert certificate from string to bytes due to %s.", e2);
            return null;
        }
    }

    /* renamed from: a */
    private final void m31091a(int i, Integer num, int i2) {
        String str = this.f40110c.f29884a;
        if (str != null && !qay.m31783a(m31089a(str))) {
            this.f40113f.mo23106a(i, num, i2);
        }
    }

    /* renamed from: a */
    private final void m31092a(Status status, String str) {
        try {
            prg prg = this.f40114g;
            Parcel bj = prg.mo8529bj();
            dcl.m8165a(bj, status);
            bj.writeString(str);
            prg.mo8530c(1, bj);
        } catch (RemoteException e) {
        }
    }

    /* renamed from: a */
    static void m31093a(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 / PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        bArr[i + 1] = (byte) (i2 % PSKKeyManager.MAX_KEY_LENGTH_BYTES);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        pqr pqr;
        int i;
        boolean z;
        boolean z2;
        int i2 = Build.VERSION.SDK_INT;
        String str = null;
        if (!TextUtils.isEmpty(this.f40111d.f29880a)) {
            CastReceiver castReceiver = this.f40111d;
            X509Certificate a = m31090a(castReceiver.f29880a, castReceiver.mo17584a());
            if (a != null) {
                pqr = pqs.m31035a(this.f40111d, a);
                int i3 = 3;
                boolean z3 = false;
                if (pqr != null) {
                    m31092a(new Status(2000, "No certificate validator or device cert is empty"), (String) null);
                    m31091a(3, (Integer) null, 0);
                    return;
                } else if (!pqr.f40073a) {
                    m31092a(new Status(2000, pqr.f40075c), (String) null);
                    m31091a(4, (Integer) null, 0);
                    return;
                } else if (this.f40112e != null) {
                    Status status = new Status(2100, "WiFi credentials not found");
                    int i4 = this.f40110c.f29886c;
                    int i5 = Build.VERSION.SDK_INT;
                    List privilegedConfiguredNetworks = this.f40112e.getPrivilegedConfiguredNetworks();
                    int i6 = 1;
                    if (i4 != 1) {
                        i3 = i4 == 0 ? 2 : 1;
                    }
                    if (privilegedConfiguredNetworks != null) {
                        i = privilegedConfiguredNetworks.size();
                    } else {
                        i = 0;
                    }
                    if (privilegedConfiguredNetworks != null) {
                        qav qav = this.f40109b;
                        int size = privilegedConfiguredNetworks.size();
                        StringBuilder sb = new StringBuilder(44);
                        sb.append("# of Privileged Config Networks: ");
                        sb.append(size);
                        qav.mo23673b(sb.toString(), new Object[0]);
                        Iterator it = privilegedConfiguredNetworks.iterator();
                        boolean z4 = false;
                        while (true) {
                            if (!it.hasNext()) {
                                z3 = z4;
                                break;
                            }
                            WifiConfiguration wifiConfiguration = (WifiConfiguration) it.next();
                            if (TextUtils.isEmpty(this.f40110c.f29884a) || !this.f40110c.f29884a.equals(wifiConfiguration.SSID)) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (TextUtils.isEmpty(this.f40110c.f29885b) || !this.f40110c.f29884a.equals(wifiConfiguration.BSSID)) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (z || z2) {
                                if ((i4 != 1 || wifiConfiguration.preSharedKey == null) && (i4 != 0 || wifiConfiguration.wepTxKeyIndex >= wifiConfiguration.wepKeys.length || wifiConfiguration.wepTxKeyIndex < 0 || wifiConfiguration.wepKeys[wifiConfiguration.wepTxKeyIndex] == null)) {
                                    z4 = true;
                                } else {
                                    try {
                                        this.f40109b.mo23673b("Matching credentials found.", new Object[0]);
                                        String str2 = wifiConfiguration.preSharedKey;
                                        if (this.f40110c.f29886c == 0) {
                                            str2 = wifiConfiguration.wepKeys[wifiConfiguration.wepTxKeyIndex];
                                        }
                                        String a2 = m31089a(str2);
                                        String str3 = pqr.f40074b;
                                        if (!TextUtils.isEmpty(a2)) {
                                            if (!TextUtils.isEmpty(str3)) {
                                                byte[] decode = Base64.decode(str3, 0);
                                                byte[] bArr = f40108a;
                                                int length = decode.length;
                                                int length2 = bArr.length + length;
                                                byte[] bArr2 = new byte[length2];
                                                System.arraycopy(f40108a, 0, bArr2, 0, f40108a.length);
                                                System.arraycopy(decode, 0, bArr2, f40108a.length, length);
                                                m31093a(bArr2, 2, length2 - 4);
                                                m31093a(bArr2, 21, length + 1);
                                                PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArr2));
                                                Cipher instance = Cipher.getInstance("RSA/None/PKCS1Padding");
                                                instance.init(1, generatePublic);
                                                a2 = Base64.encodeToString(instance.doFinal(a2.getBytes(StandardCharsets.UTF_8)), 2);
                                            } else {
                                                throw new GeneralSecurityException("No public key available from Chromecast");
                                            }
                                        }
                                        str = a2;
                                        z3 = true;
                                        status = Status.f30107a;
                                    } catch (GeneralSecurityException e) {
                                        m31092a(new Status(2001, e.getMessage()), (String) null);
                                        m31091a(5, Integer.valueOf(i), i3);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    m31092a(status, str);
                    if (!z3) {
                        i6 = 8;
                    } else if (TextUtils.isEmpty(str)) {
                        i6 = 9;
                    }
                    m31091a(i6, Integer.valueOf(i), i3);
                    return;
                } else {
                    m31092a(new Status(2100, "Unable to obtain the WiFiManager"), (String) null);
                    m31091a(6, (Integer) null, 0);
                    return;
                }
            }
        }
        pqr = null;
        int i32 = 3;
        boolean z32 = false;
        if (pqr != null) {
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        m31092a(status, (String) null);
    }
}
