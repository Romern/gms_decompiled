package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: bqxo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bqxo {
    /* renamed from: a */
    public static bqxo m113676a(ByteBuffer byteBuffer) {
        short s = byteBuffer.getShort();
        byteBuffer.get();
        byte b = byteBuffer.get();
        bqxn bqxn = (bqxn) bqxn.f141904r.get(Byte.valueOf(b));
        bmxy.m108586a(bqxn, "Unknown resource type: %s", b);
        int i = byteBuffer.getInt();
        bqxm d = m113677d();
        d.mo69437b((char) s);
        d.mo69436a(bqxn);
        d.mo69435a(i);
        return d.mo69434a();
    }

    /* renamed from: d */
    public static bqxm m113677d() {
        return new bqxm();
    }

    /* renamed from: f */
    private final String m113678f() {
        return String.format("0x%08x", Integer.valueOf(mo69374c()));
    }

    /* renamed from: a */
    public abstract int mo69372a();

    /* renamed from: b */
    public abstract bqxn mo69373b();

    /* renamed from: c */
    public abstract int mo69374c();

    /* renamed from: e */
    public final byte[] mo69438e() {
        ByteBuffer order = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        order.putShort((short) mo69372a());
        order.put((byte) 0);
        order.put(mo69373b().f141906q);
        order.putInt(mo69374c());
        return order.array();
    }

    public final String toString() {
        bqxn bqxn = bqxn.NULL;
        switch (mo69373b().ordinal()) {
            case 0:
                return mo69374c() != 0 ? "empty" : "null";
            case 1:
                String f = m113678f();
                StringBuilder sb = new StringBuilder(String.valueOf(f).length() + 5);
                sb.append("ref(");
                sb.append(f);
                sb.append(")");
                return sb.toString();
            case 2:
                String f2 = m113678f();
                StringBuilder sb2 = new StringBuilder(String.valueOf(f2).length() + 6);
                sb2.append("attr(");
                sb2.append(f2);
                sb2.append(")");
                return sb2.toString();
            case 3:
                String f3 = m113678f();
                StringBuilder sb3 = new StringBuilder(String.valueOf(f3).length() + 8);
                sb3.append("string(");
                sb3.append(f3);
                sb3.append(")");
                return sb3.toString();
            case 4:
                int c = mo69374c();
                StringBuilder sb4 = new StringBuilder(18);
                sb4.append("float(");
                sb4.append(c);
                sb4.append(")");
                return sb4.toString();
            case 5:
                int c2 = mo69374c();
                StringBuilder sb5 = new StringBuilder(18);
                sb5.append("dimen(");
                sb5.append(c2);
                sb5.append(")");
                return sb5.toString();
            case 6:
                int c3 = mo69374c();
                StringBuilder sb6 = new StringBuilder(17);
                sb6.append("frac(");
                sb6.append(c3);
                sb6.append(")");
                return sb6.toString();
            case 7:
                String f4 = m113678f();
                StringBuilder sb7 = new StringBuilder(String.valueOf(f4).length() + 8);
                sb7.append("dynref(");
                sb7.append(f4);
                sb7.append(")");
                return sb7.toString();
            case 8:
                String f5 = m113678f();
                StringBuilder sb8 = new StringBuilder(String.valueOf(f5).length() + 9);
                sb8.append("dynattr(");
                sb8.append(f5);
                sb8.append(")");
                return sb8.toString();
            case 9:
                int c4 = mo69374c();
                StringBuilder sb9 = new StringBuilder(16);
                sb9.append("dec(");
                sb9.append(c4);
                sb9.append(")");
                return sb9.toString();
            case 10:
                String f6 = m113678f();
                StringBuilder sb10 = new StringBuilder(String.valueOf(f6).length() + 5);
                sb10.append("hex(");
                sb10.append(f6);
                sb10.append(")");
                return sb10.toString();
            case 11:
                int c5 = mo69374c();
                StringBuilder sb11 = new StringBuilder(17);
                sb11.append("bool(");
                sb11.append(c5);
                sb11.append(")");
                return sb11.toString();
            case 12:
                String f7 = m113678f();
                StringBuilder sb12 = new StringBuilder(String.valueOf(f7).length() + 7);
                sb12.append("argb8(");
                sb12.append(f7);
                sb12.append(")");
                return sb12.toString();
            case 13:
                String f8 = m113678f();
                StringBuilder sb13 = new StringBuilder(String.valueOf(f8).length() + 6);
                sb13.append("rgb8(");
                sb13.append(f8);
                sb13.append(")");
                return sb13.toString();
            case 14:
                String f9 = m113678f();
                StringBuilder sb14 = new StringBuilder(String.valueOf(f9).length() + 7);
                sb14.append("argb4(");
                sb14.append(f9);
                sb14.append(")");
                return sb14.toString();
            case 15:
                String f10 = m113678f();
                StringBuilder sb15 = new StringBuilder(String.valueOf(f10).length() + 6);
                sb15.append("rgb4(");
                sb15.append(f10);
                sb15.append(")");
                return sb15.toString();
            default:
                return "<invalid value>";
        }
    }
}
