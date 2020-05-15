package p000;

import com.google.compression.brotli.dec.Dictionary;

/* renamed from: bqio */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqio {

    /* renamed from: a */
    static final boolean f140821a;

    static {
        boolean z;
        try {
            Class.forName(String.valueOf(Dictionary.class.getPackage().getName()).concat(".DictionaryData"));
            z = true;
        } catch (Throwable th) {
            z = false;
        }
        f140821a = z;
    }
}
