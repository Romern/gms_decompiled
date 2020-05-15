package p000;

import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;

/* renamed from: ips */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ips {
    /* renamed from: a */
    public static final byte[] m15855a(List list) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((bxxc) it.next()).mo73641b(byteArrayOutputStream);
        }
        return byteArrayOutputStream.toByteArray();
    }
}
