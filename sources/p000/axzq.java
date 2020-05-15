package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.wearable.node.PairingService$1;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;

/* renamed from: axzq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axzq implements axxg, ayjm {

    /* renamed from: d */
    public static final /* synthetic */ int f96845d = 0;

    /* renamed from: i */
    private static final IntentFilter f96846i = new IntentFilter("com.google.android.checkin.CHECKIN_COMPLETE");

    /* renamed from: a */
    public axwi f96847a;

    /* renamed from: b */
    public axxv f96848b;

    /* renamed from: c */
    public final axzt f96849c;

    /* renamed from: e */
    private final SharedPreferences f96850e;

    /* renamed from: f */
    private final boolean f96851f;

    /* renamed from: g */
    private final bmzi f96852g;

    /* renamed from: h */
    private final bmzi f96853h;

    /* renamed from: j */
    private final BroadcastReceiver f96854j;

    public axzq(Context context, SharedPreferences sharedPreferences, bmzi bmzi, bmzi bmzi2, axzt axzt, boolean z) {
        PairingService$1 pairingService$1 = new PairingService$1(this, "wearable");
        this.f96854j = pairingService$1;
        this.f96850e = sharedPreferences;
        this.f96852g = bmzi;
        this.f96853h = bmzi2;
        this.f96849c = axzt;
        this.f96851f = z;
        context.registerReceiver(pairingService$1, f96846i);
    }

    /* renamed from: a */
    public static String m83630a(byte[] bArr) {
        return Base64.encodeToString(bArr, 3);
    }

    /* renamed from: d */
    private final KeyPair m83631d() {
        try {
            SharedPreferences sharedPreferences = this.f96850e;
            String string = sharedPreferences.getString("private_key", null);
            String string2 = sharedPreferences.getString("public_key", null);
            String string3 = sharedPreferences.getString("algorithm", null);
            if (string == null || string2 == null || string3 == null) {
                return null;
            }
            byte[] decode = Base64.decode(string, 3);
            byte[] decode2 = Base64.decode(string2, 3);
            KeyFactory instance = KeyFactory.getInstance(string3);
            return new KeyPair(instance.generatePublic(new X509EncodedKeySpec(decode2)), instance.generatePrivate(new PKCS8EncodedKeySpec(decode)));
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            Log.e("pairingservice", "loadKeyPair: failed loading and parsing the keys");
            return null;
        }
    }

    /* renamed from: b */
    public final KeyPair mo53804b() {
        try {
            KeyPair d = m83631d();
            if (d != null) {
                return d;
            }
            KeyPairGenerator instance = KeyPairGenerator.getInstance("EC");
            instance.initialize(new ECGenParameterSpec("secp256r1"));
            KeyPair generateKeyPair = instance.generateKeyPair();
            byte[] encoded = generateKeyPair.getPrivate().getEncoded();
            byte[] encoded2 = generateKeyPair.getPublic().getEncoded();
            this.f96850e.edit().putString("private_key", new String(Base64.encode(encoded, 3))).putString("public_key", new String(Base64.encode(encoded2, 3))).putString("algorithm", generateKeyPair.getPrivate().getAlgorithm()).commit();
            return generateKeyPair;
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException e) {
            throw new IllegalStateException("error while creating keypair", e);
        }
    }

    /* renamed from: c */
    public final String mo53805c() {
        if (this.f96850e.getBoolean("network_server_assigned", false)) {
            return this.f96850e.getString("network_id", null);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo53799a() {
        if (this.f96851f) {
            long longValue = ((axwc) this.f96852g).mo6606a().longValue();
            if (longValue != 0) {
                String b = ((axwb) this.f96853h).mo6606a();
                if (!TextUtils.isEmpty(b)) {
                    String str = this.f96849c.mo53808b().f96814a;
                    axos a = axxj.m83471a(this.f96848b, str, "/pairing/public_key");
                    if (a != null && (!a.mo53332a("androidId") || !b.equals(a.mo53337c(b)))) {
                        a = null;
                    }
                    if (a == null) {
                        axos axos = new axos();
                        PublicKey publicKey = mo53804b().getPublic();
                        axos.mo53326a("androidId", longValue);
                        axos.mo53328a("registrationId", b);
                        axos.mo53331a("encodedPublicKey", publicKey.getEncoded());
                        axos.mo53328a("algorithm", publicKey.getAlgorithm());
                        axxj.m83474a(this.f96848b, str, "/pairing/public_key", axos);
                        if (Log.isLoggable("pairingservice", 2)) {
                            String valueOf = String.valueOf(axos);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
                            sb.append("ensurePublicKeyDataItemWritten: wrote ");
                            sb.append(valueOf);
                            Log.v("pairingservice", sb.toString());
                        }
                    } else if (Log.isLoggable("pairingservice", 2)) {
                        Log.v("pairingservice", "ensurePublicKeyDataItemWritten: already written");
                    }
                } else if (Log.isLoggable("pairingservice", 3)) {
                    StringBuilder sb2 = new StringBuilder(116);
                    sb2.append("ensurePublicKeyDataItemWritten: not writing because GcmRegistrationId is not set for AndroidId: ");
                    sb2.append(longValue);
                    Log.d("pairingservice", sb2.toString());
                }
            } else if (Log.isLoggable("pairingservice", 3)) {
                Log.d("pairingservice", "ensurePublicKeyDataItemWritten: not writing because AndroidId is not set");
            }
        } else if (Log.isLoggable("pairingservice", 2)) {
            Log.v("pairingservice", "ensurePublicKeyDataItemWritten: not writing since this is not a watch");
        }
    }

    /* renamed from: a */
    public final void mo53800a(abop abop) {
        mo53801a((apto) abop.mo32249a());
    }

    /* renamed from: a */
    public final void mo53801a(apto apto) {
        apto.f84862d = mo53804b().getPrivate();
    }

    /* renamed from: a */
    public final void mo53802a(axos axos) {
        String c = axos.mo53337c("networkId");
        if (Log.isLoggable("pairingservice", 2)) {
            String valueOf = String.valueOf(c);
            Log.v("pairingservice", valueOf.length() == 0 ? new String("handleEnrolled: found enrolled dataItem for network ") : "handleEnrolled: found enrolled dataItem for network ".concat(valueOf));
        }
        String c2 = mo53805c();
        if (bmxx.m108577a(c2)) {
            if (Log.isLoggable("pairingservice", 2)) {
                String valueOf2 = String.valueOf(c);
                Log.v("pairingservice", valueOf2.length() == 0 ? new String("handleEnrolled: now enrolled to network ") : "handleEnrolled: now enrolled to network ".concat(valueOf2));
            }
            mo53803a(c);
            axwi axwi = this.f96847a;
            axwi.f96585j.mo53669a(4);
            axwi.f96595t.mo54035a();
            axwi.f96585j.mo53669a(2);
        } else if (Log.isLoggable("pairingservice", 2)) {
            StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + 62);
            sb.append("handleEnrolled: already paired to network ");
            sb.append(c2);
            sb.append(", not doing anything");
            Log.v("pairingservice", sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo53803a(String str) {
        if (Log.isLoggable("pairingservice", 3)) {
            String valueOf = String.valueOf(str);
            Log.d("pairingservice", valueOf.length() == 0 ? new String("setIsPaired: paired to network ") : "setIsPaired: paired to network ".concat(valueOf));
        }
        this.f96850e.edit().putString("network_id", str).apply();
        this.f96850e.edit().putString("network_secret", str).apply();
        this.f96850e.edit().putBoolean("network_server_assigned", true).apply();
    }

    /* renamed from: a */
    public final void mo53557a(ArrayList arrayList) {
        String str = this.f96849c.mo53808b().f96814a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            axxi axxi = (axxi) arrayList.get(i);
            axos axos = null;
            if (axxi.f96646a.equals(ayha.f97559a) && !axxi.f96648c && axxi.f96647b.f96639a.equals(str) && axxi.f96647b.f96640b.equals("/enrolled")) {
                axos = axos.m82822a(axxi.f96647b.f96642d);
            }
            if (axos != null) {
                mo53802a(axos);
            } else if (axxi.f96646a.equals(ayha.f97559a) && !axxi.f96648c && axxi.f96647b.f96640b.equals("/pairing/public_key")) {
                if (Log.isLoggable("pairingservice", 3)) {
                    String valueOf = String.valueOf(axxi.f96647b.f96639a);
                    Log.d("pairingservice", valueOf.length() == 0 ? new String("onDataItemChanged: public key received for node ") : "onDataItemChanged: public key received for node ".concat(valueOf));
                }
                axwi axwi = this.f96847a;
                axwi.f96595t.mo54035a();
                axwi.f96585j.mo53669a(2);
            }
        }
    }

    /* renamed from: a */
    public final void mo53558a(ssb ssb, boolean z, boolean z2) {
        String valueOf = String.valueOf(mo53805c());
        ssb.println(valueOf.length() == 0 ? new String("network id: ") : "network id: ".concat(valueOf));
    }
}
