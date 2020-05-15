package p000;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: bfib */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfib {

    /* renamed from: a */
    static final bhdb f113997a = new bhdb("CollectionLib");

    /* renamed from: b */
    public static final /* synthetic */ int f113998b = 0;

    /* renamed from: a */
    public static bhdb m96837a(bhdb bhdb) {
        return bhdb == null ? f113997a : bhdb;
    }

    /* renamed from: b */
    static String m96842b(String str) {
        return String.format("%s/%s", "sglclt", str);
    }

    /* renamed from: a */
    public static bsax m96838a(bsax bsax) {
        try {
            bsax bsax2 = new bsax(bsax.f143914b);
            bsax2.mo70111a(bsax.mo70120b());
            if (bsax2.mo70112a()) {
                return bsax2;
            }
            throw new IOException("isValid returned after parsing proto");
        } catch (IOException e) {
            throw new RuntimeException("Could not serialize and parse ProtoBuf.");
        }
    }

    /* renamed from: b */
    static Map m96843b() {
        return Collections.synchronizedMap(new HashMap());
    }

    /* renamed from: b */
    static byte[] m96844b(byte[] bArr) {
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr2 = new byte[1024];
        while (true) {
            int read = gZIPInputStream.read(bArr2);
            if (read != -1) {
                byteArrayOutputStream.write(bArr2, 0, read);
            } else {
                byteArrayOutputStream.close();
                gZIPInputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    /* renamed from: a */
    static List m96839a() {
        return Collections.synchronizedList(new ArrayList());
    }

    /* renamed from: a */
    public static boolean m96840a(String str) {
        return str == null || str.trim().equals("");
    }

    /* renamed from: a */
    static byte[] m96841a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        byteArrayOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }
}
