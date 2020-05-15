package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: beoq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beoq implements beop {

    /* renamed from: d */
    public static final beoq f111948d = new beoq("");

    /* renamed from: f */
    private static final Charset f111949f = Charset.forName("UTF-8");

    /* renamed from: g */
    private static final List f111950g = new ArrayList();

    /* renamed from: a */
    public final Map f111951a = new HashMap(10);

    /* renamed from: b */
    public final Object f111952b = new Object();

    /* renamed from: c */
    public volatile beoo f111953c;

    /* renamed from: e */
    private final String f111954e;

    private beoq(String str) {
        this.f111954e = str;
    }

    /* renamed from: a */
    public static synchronized beoq m95364a(String str) {
        synchronized (beoq.class) {
            List list = f111950g;
            int size = list.size();
            int i = 0;
            while (i < size) {
                beoq beoq = (beoq) list.get(i);
                i++;
                if (beoq.f111954e.equals(str)) {
                    return beoq;
                }
            }
            beoq beoq2 = new beoq(str);
            f111950g.add(beoq2);
            return beoq2;
        }
    }

    /* renamed from: b */
    public static long m95365b(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes(f111949f));
            return ByteBuffer.wrap(instance.digest()).getLong();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Deprecated
    /* renamed from: a */
    public final beoh mo60862a(String str, beol beol) {
        return (beoh) mo60864a(new beoh(str, this, beol));
    }

    /* renamed from: b */
    public final beon mo60865b(String str, beol... beolArr) {
        synchronized (this.f111952b) {
            beon beon = (beon) this.f111951a.get(str);
            if (beon == null) {
                beon beon2 = new beon(str, this, beolArr);
                this.f111951a.put(beon2.f111942b, beon2);
                return beon2;
            }
            beon.mo60858a(beolArr);
            return beon;
        }
    }

    /* renamed from: a */
    public final beoj mo60863a(String str, beol... beolArr) {
        synchronized (this.f111952b) {
            beoj beoj = (beoj) this.f111951a.get(str);
            if (beoj == null) {
                beoj beoj2 = new beoj(str, this, beolArr);
                this.f111951a.put(beoj2.f111942b, beoj2);
                return beoj2;
            }
            beoj.mo60858a(beolArr);
            return beoj;
        }
    }

    @Deprecated
    /* renamed from: a */
    public final beon mo60864a(beon beon) {
        synchronized (this.f111952b) {
            beon beon2 = (beon) this.f111951a.get(beon.f111942b);
            if (beon2 == null) {
                this.f111951a.put(beon.f111942b, beon);
                return beon;
            } else if (beon2.getClass() == beon.getClass()) {
                beon2.mo60858a(beon.f111943c);
                return beon2;
            } else {
                String str = beon2.f111942b;
                StringBuilder sb = new StringBuilder(str.length() + 36);
                sb.append("Streamz ");
                sb.append(str);
                sb.append(" with a different class name");
                throw new beot(sb.toString());
            }
        }
    }
}
