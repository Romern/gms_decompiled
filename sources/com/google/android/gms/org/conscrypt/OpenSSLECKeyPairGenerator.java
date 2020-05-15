package com.google.android.gms.org.conscrypt;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class OpenSSLECKeyPairGenerator extends KeyPairGenerator {
    private static final String ALGORITHM = "EC";
    private static final int DEFAULT_KEY_SIZE = 256;
    private static final Map SIZE_TO_CURVE_NAME;
    private OpenSSLECGroupContext group;

    static {
        HashMap hashMap = new HashMap();
        SIZE_TO_CURVE_NAME = hashMap;
        hashMap.put(Integer.valueOf((int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD), "secp224r1");
        SIZE_TO_CURVE_NAME.put(256, "prime256v1");
        SIZE_TO_CURVE_NAME.put(384, "secp384r1");
        SIZE_TO_CURVE_NAME.put(521, "secp521r1");
    }

    public OpenSSLECKeyPairGenerator() {
        super(ALGORITHM);
    }

    public static void assertCurvesAreValid() {
        ArrayList arrayList = new ArrayList();
        for (String str : SIZE_TO_CURVE_NAME.values()) {
            if (OpenSSLECGroupContext.getCurveByName(str) == null) {
                arrayList.add(str);
            }
        }
        if (arrayList.size() > 0) {
            String valueOf = String.valueOf(Arrays.toString(arrayList.toArray()));
            throw new AssertionError(valueOf.length() == 0 ? new String("Invalid curve names: ") : "Invalid curve names: ".concat(valueOf));
        }
    }

    public KeyPair generateKeyPair() {
        OpenSSLECGroupContext openSSLECGroupContext = this.group;
        if (openSSLECGroupContext == null) {
            String str = (String) SIZE_TO_CURVE_NAME.get(256);
            OpenSSLECGroupContext curveByName = OpenSSLECGroupContext.getCurveByName(str);
            this.group = curveByName;
            if (curveByName == null) {
                String valueOf = String.valueOf(str);
                throw new RuntimeException(valueOf.length() == 0 ? new String("Curve not recognized: ") : "Curve not recognized: ".concat(valueOf));
            }
            openSSLECGroupContext = curveByName;
        }
        OpenSSLKey openSSLKey = new OpenSSLKey(NativeCrypto.EC_KEY_generate_key(openSSLECGroupContext.getNativeRef()));
        return new KeyPair(new OpenSSLECPublicKey(this.group, openSSLKey), new OpenSSLECPrivateKey(this.group, openSSLKey));
    }

    public void initialize(int i, SecureRandom secureRandom) {
        String str = (String) SIZE_TO_CURVE_NAME.get(Integer.valueOf(i));
        if (str != null) {
            OpenSSLECGroupContext curveByName = OpenSSLECGroupContext.getCurveByName(str);
            if (curveByName == null) {
                throw new InvalidParameterException(str.length() == 0 ? new String("unknown curve ") : "unknown curve ".concat(str));
            }
            this.group = curveByName;
            return;
        }
        StringBuilder sb = new StringBuilder(28);
        sb.append("unknown key size ");
        sb.append(i);
        throw new InvalidParameterException(sb.toString());
    }

    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        if (algorithmParameterSpec instanceof ECParameterSpec) {
            this.group = OpenSSLECGroupContext.getInstance((ECParameterSpec) algorithmParameterSpec);
        } else if (algorithmParameterSpec instanceof ECGenParameterSpec) {
            String name = ((ECGenParameterSpec) algorithmParameterSpec).getName();
            OpenSSLECGroupContext curveByName = OpenSSLECGroupContext.getCurveByName(name);
            if (curveByName == null) {
                String valueOf = String.valueOf(name);
                throw new InvalidAlgorithmParameterException(valueOf.length() == 0 ? new String("unknown curve name: ") : "unknown curve name: ".concat(valueOf));
            } else {
                this.group = curveByName;
            }
        } else {
            throw new InvalidAlgorithmParameterException("parameter must be ECParameterSpec or ECGenParameterSpec");
        }
    }
}
