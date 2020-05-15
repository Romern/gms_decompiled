package p000;

import android.content.Context;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: jaz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jaz {

    /* renamed from: a */
    private static final sek f22064a = jdh.m16547a("VaultHandleHelper");

    /* renamed from: b */
    public static long m16449b(byte[] bArr) {
        boolean z;
        ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        if (order.get() == 1) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108591a(z, "The version number of the vaultHandle should be %s.", 1);
        order.getLong();
        return order.getLong();
    }

    /* renamed from: a */
    static bxtx m16446a(Context context) {
        return m16447a(addi.m50206a(context).mo33346b(), m16450b(context).longValue());
    }

    /* renamed from: a */
    static bxtx m16447a(String str, long j) {
        try {
            f22064a.mo25412b("Building vaultHandle(version=%d, instanceId=%s, deviceId=%d)", (byte) 1, str, Long.valueOf(j));
            return bxtx.m123261a(ByteBuffer.allocate(17).order(ByteOrder.LITTLE_ENDIAN).put((byte) 1).putLong(ByteBuffer.wrap(boan.f132471e.mo68796b(str)).getLong()).putLong(j).array());
        } catch (IllegalArgumentException | BufferUnderflowException e) {
            throw new RuntimeException("Failed to build vault handle", e);
        }
    }

    /* renamed from: b */
    public static Long m16450b(Context context) {
        return Long.valueOf(ryv.m34679a(context), 16);
    }

    /* renamed from: a */
    public static String m16448a(byte[] bArr) {
        boolean z;
        ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        if (order.get() == 1) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108591a(z, "The version number of the vaultHandle should be %s.", 1);
        return boan.f132471e.mo68783a().mo68794a(ByteBuffer.allocate(8).putLong(order.getLong()).array());
    }
}
