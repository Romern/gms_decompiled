package org.webrtc;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class JniHelper {
    JniHelper() {
    }

    static Object getKey(Map.Entry entry) {
        return entry.getKey();
    }

    static byte[] getStringBytes(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("ISO-8859-1 is unsupported");
        }
    }

    static Object getStringClass() {
        return String.class;
    }

    static Object getValue(Map.Entry entry) {
        return entry.getValue();
    }
}
