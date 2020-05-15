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

/* renamed from: bbfg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbfg {
    /* renamed from: a */
    public static ByteBuffer m87925a(Iterable iterable) {
        String str;
        Iterator it = iterable.iterator();
        int i = 0;
        long j = 0;
        int i2 = 0;
        while (it.hasNext()) {
            j += (long) (((bxxc) it.next()).mo74145db() + 12);
            i2++;
        }
        if (i2 == 0) {
            return ByteBuffer.allocate(0);
        }
        try {
            ByteBuffer allocate = ByteBuffer.allocate((int) j);
            byte[] array = allocate.array();
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                bxxc bxxc = (bxxc) it2.next();
                int db = bxxc.mo74145db();
                try {
                    allocate.putInt(db);
                    int i3 = i + 4;
                    try {
                        bxxc.mo73644a(bxuk.m123644c(array, i3, db));
                    } catch (IOException e) {
                        Log.e("ProtoLiteUtil", "Exception while writing to buffer.", e);
                    }
                    try {
                        allocate.put(array, i3, db);
                        int i4 = i3 + db;
                        CRC32 crc32 = new CRC32();
                        crc32.update(array, i4 - db, db);
                        allocate.putLong(crc32.getValue());
                        i = i4 + 8;
                    } catch (BufferOverflowException e2) {
                        m87927a(e2);
                        return null;
                    }
                } catch (BufferOverflowException e3) {
                    m87927a(e3);
                    return null;
                }
            }
            allocate.rewind();
            return allocate;
        } catch (IllegalArgumentException e4) {
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
            Log.e("ProtoLiteUtil", String.format("Too big to serialize, %s", objArr), e4);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00af A[LOOP:0: B:1:0x0019->B:25:0x00af, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00be A[SYNTHETIC] */
    /* renamed from: a */
    public static List m87926a(ByteBuffer byteBuffer, Class cls, bxxk bxxk) {
        bxxc bxxc;
        ByteBuffer byteBuffer2 = byteBuffer;
        String cls2 = cls.toString();
        int limit = byteBuffer.limit();
        ArrayList arrayList = new ArrayList((byteBuffer.limit() / 1000) + 1);
        while (byteBuffer.position() < limit) {
            try {
                int i = byteBuffer.getInt();
                if (i < 0) {
                    Log.e("ProtoLiteUtil", String.format("Invalid message size: %d. May have given the wrong message type: %s", Integer.valueOf(i), cls2));
                    return null;
                } else if (limit >= byteBuffer.position() + i + 8) {
                    long j = byteBuffer2.getLong(byteBuffer.position() + i);
                    byte[] array = byteBuffer.array();
                    int arrayOffset = byteBuffer.arrayOffset();
                    int position = byteBuffer.position();
                    CRC32 crc32 = new CRC32();
                    crc32.update(array, arrayOffset + position, i);
                    long value = crc32.getValue();
                    if (value == j) {
                        try {
                            try {
                                bxxc = (bxxc) bxxk.mo73664c(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), i, bxus.m123743b());
                            } catch (bxwf e) {
                                e = e;
                            }
                        } catch (bxwf e2) {
                            e = e2;
                            String valueOf = String.valueOf(cls);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
                            sb.append("Cannot deserialize message of type ");
                            sb.append(valueOf);
                            Log.e("ProtoLiteUtil", sb.toString(), e);
                            bxxc = null;
                            if (bxxc != null) {
                            }
                        }
                        if (bxxc != null) {
                            return null;
                        }
                        arrayList.add(bxxc);
                        byteBuffer2.position(byteBuffer.position() + i + 8);
                    } else {
                        Log.e("ProtoLiteUtil", String.format("Corrupt protobuf data, expected CRC: %d computed CRC: %d", Long.valueOf(j), Long.valueOf(value)));
                        return arrayList;
                    }
                } else {
                    Log.e("ProtoLiteUtil", String.format("Invalid message size: %d (buffer end is %d)", Integer.valueOf(i), Integer.valueOf(limit)));
                    return arrayList;
                }
            } catch (BufferUnderflowException e3) {
                Log.e("ProtoLiteUtil", String.format("Buffer underflow. May have given the wrong message type: %s", cls2), e3);
                return null;
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m87927a(BufferOverflowException bufferOverflowException) {
        Log.e("ProtoLiteUtil", "Buffer underflow. A message may have an invalid serialized form or has been concurrently modified.", bufferOverflowException);
    }
}
