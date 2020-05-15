package p000;

import android.util.Log;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.zip.CRC32;

/* renamed from: stb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class stb {
    /* renamed from: a */
    public static bxxc m36275a(byte[] bArr, int i, int i2, Class cls, bxxk bxxk) {
        try {
            return (bxxc) bxxk.mo73658a(bArr, i, i2);
        } catch (bxwf e) {
            String valueOf = String.valueOf(cls);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("Cannot deserialize message of type ");
            sb.append(valueOf);
            Log.e("ProtoLiteUtils", sb.toString(), e);
            return null;
        }
    }

    /* renamed from: a */
    public static ByteBuffer m36276a(Iterable iterable, boolean z) {
        String str;
        long j = !z ? 0 : 8;
        int i = !z ? 12 : 4;
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            j += (long) (((bxxc) it.next()).mo74145db() + i);
            i2++;
        }
        if (i2 == 0) {
            return ByteBuffer.allocate(0);
        }
        try {
            ByteBuffer allocate = ByteBuffer.allocate((int) j);
            byte[] array = allocate.array();
            Iterator it2 = iterable.iterator();
            int i3 = 0;
            while (it2.hasNext()) {
                bxxc bxxc = (bxxc) it2.next();
                int db = bxxc.mo74145db();
                try {
                    allocate.putInt(db);
                    int i4 = i3 + 4;
                    try {
                        bxxc.mo73644a(bxuk.m123644c(array, i4, db));
                    } catch (IOException e) {
                        Log.e("ProtoLiteUtils", "Exception while writing to buffer.", e);
                    }
                    try {
                        allocate.put(array, i4, db);
                        i3 = i4 + db;
                        if (!z) {
                            m36279a(allocate, array, i3 - db, db);
                            i3 += 8;
                        }
                    } catch (BufferOverflowException e2) {
                        m36278a(e2);
                        return null;
                    }
                } catch (BufferOverflowException e3) {
                    m36278a(e3);
                    return null;
                }
            }
            if (z) {
                try {
                    m36279a(allocate, array, 0, i3);
                } catch (BufferOverflowException e4) {
                    m36278a(e4);
                    return null;
                }
            }
            allocate.rewind();
            return allocate;
        } catch (IllegalArgumentException e5) {
            Object[] objArr = new Object[1];
            if (j > 1073741824) {
                Locale locale = Locale.US;
                double d = (double) j;
                Double.isNaN(d);
                str = String.format(locale, "%.2fGB", Double.valueOf(d / 1.073741824E9d));
            } else if (j > 1048576) {
                Locale locale2 = Locale.US;
                double d2 = (double) j;
                Double.isNaN(d2);
                str = String.format(locale2, "%.2fMB", Double.valueOf(d2 / 1048576.0d));
            } else if (j > 1024) {
                Locale locale3 = Locale.US;
                double d3 = (double) j;
                Double.isNaN(d3);
                str = String.format(locale3, "%.2fKB", Double.valueOf(d3 / 1024.0d));
            } else {
                str = String.format(Locale.US, "%d Bytes", Long.valueOf(j));
            }
            objArr[0] = str;
            Log.e("ProtoLiteUtils", String.format("Too big to serialize, %s", objArr), e5);
            return null;
        }
    }

    /* renamed from: a */
    public static List m36277a(ByteBuffer byteBuffer, Class cls, bxxk bxxk, boolean z) {
        String cls2 = cls.toString();
        if (z) {
            int limit = byteBuffer.limit() - 8;
            if (limit < 0) {
                Log.e("ProtoLiteUtils", "Protobuf data too short to be valid");
                return null;
            }
            if (!m36280a(byteBuffer.array(), byteBuffer.arrayOffset(), limit, byteBuffer.getLong(limit))) {
                Log.e("ProtoLiteUtils", "Ignoring corrupt protobuf data");
                return null;
            } else if (limit == 0) {
                return new ArrayList(0);
            }
        }
        int limit2 = z ? byteBuffer.limit() - 8 : byteBuffer.limit();
        ArrayList arrayList = new ArrayList((byteBuffer.limit() / 1000) + 1);
        while (byteBuffer.position() < limit2) {
            try {
                int i = byteBuffer.getInt();
                if (i < 0) {
                    Log.e("ProtoLiteUtils", String.format("Invalid message size: %d. May have given the wrong message type: %s", Integer.valueOf(i), cls2));
                    return null;
                }
                int i2 = 8;
                if (!z) {
                    if (limit2 >= byteBuffer.position() + i + 8) {
                        if (!m36280a(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), i, byteBuffer.getLong(byteBuffer.position() + i))) {
                            return arrayList;
                        }
                    } else {
                        Log.e("ProtoLiteUtils", String.format("Invalid message size: %d (buffer end is %d)", Integer.valueOf(i), Integer.valueOf(limit2)));
                        return arrayList;
                    }
                }
                bxxc a = m36275a(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), i, cls, bxxk);
                if (a == null) {
                    return null;
                }
                arrayList.add(a);
                int position = byteBuffer.position() + i;
                if (z) {
                    i2 = 0;
                }
                byteBuffer.position(position + i2);
            } catch (BufferUnderflowException e) {
                Log.e("ProtoLiteUtils", String.format("Buffer underflow. May have given the wrong message type: %s", cls2), e);
                return null;
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m36278a(BufferOverflowException bufferOverflowException) {
        Log.e("ProtoLiteUtils", "Buffer underflow. A message may have an invalid serialized form or has been concurrently modified.", bufferOverflowException);
    }

    /* renamed from: a */
    private static void m36279a(ByteBuffer byteBuffer, byte[] bArr, int i, int i2) {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr, i, i2);
        byteBuffer.putLong(crc32.getValue());
    }

    /* renamed from: a */
    public static boolean m36280a(byte[] bArr, int i, int i2, long j) {
        boolean z;
        CRC32 crc32 = new CRC32();
        crc32.update(bArr, i, i2);
        long value = crc32.getValue();
        if (value == j) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Log.e("ProtoLiteUtils", String.format("Corrupt protobuf data, expected CRC: %d computed CRC: %d", Long.valueOf(j), Long.valueOf(value)));
        }
        return z;
    }
}
