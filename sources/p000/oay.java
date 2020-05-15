package p000;

import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;

/* renamed from: oay */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class oay {

    /* renamed from: b */
    public static final /* synthetic */ int f37110b = 0;

    /* renamed from: c */
    private static final char[] f37111c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public long f37112a;

    /* renamed from: d */
    private final ThreadLocal f37113d = new oax();

    /* renamed from: a */
    public static ByteBuffer m28320a(ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        allocate.put(byteBuffer);
        allocate.flip();
        return allocate;
    }

    /* renamed from: a */
    public abstract int mo21912a();

    /* renamed from: b */
    public abstract ByteBuffer mo21913b();

    /* renamed from: c */
    public abstract int mo21914c();

    /* renamed from: d */
    public abstract boolean mo21915d();

    /* renamed from: e */
    public abstract boolean mo21916e();

    /* renamed from: f */
    public abstract long mo21918f();

    /* renamed from: g */
    public final String mo21931g() {
        return ((SimpleDateFormat) this.f37113d.get()).format(Long.valueOf(mo21918f()));
    }

    public final String toString() {
        String g = mo21931g();
        int a = mo21912a();
        long j = this.f37112a;
        int c = mo21914c();
        boolean d = mo21915d();
        boolean e = mo21916e();
        byte[] array = mo21913b().array();
        int length = array.length;
        char[] cArr = new char[(length + length)];
        int i = 0;
        for (byte b : array) {
            byte b2 = b & 255;
            int i2 = i + 1;
            char[] cArr2 = f37111c;
            cArr[i] = cArr2[b2 >>> 4];
            i = i2 + 1;
            cArr[i2] = cArr2[b2 & 15];
        }
        String str = new String(cArr);
        StringBuilder sb = new StringBuilder(String.valueOf(g).length() + 137 + str.length());
        sb.append(g);
        sb.append("  channelId: ");
        sb.append(a);
        sb.append(", sequenceNumber: ");
        sb.append(j);
        sb.append(", size: ");
        sb.append(c);
        sb.append(", isControlMessage: ");
        sb.append(d);
        sb.append(", isTxMessage: ");
        sb.append(e);
        sb.append(", message: ");
        sb.append(str);
        return sb.toString();
    }
}
