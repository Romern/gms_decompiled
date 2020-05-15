package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: bqxt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bqxt {
    /* renamed from: a */
    public static bqxt m113704a(ByteBuffer byteBuffer, int i, bqxu bqxu, int i2) {
        bqxo bqxo;
        int i3;
        int position = byteBuffer.position();
        byteBuffer.position(i);
        char c = (char) byteBuffer.getShort();
        char c2 = (char) byteBuffer.getShort();
        int i4 = byteBuffer.getInt();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if ((c2 & 1) != 0) {
            i3 = byteBuffer.getInt();
            int i5 = byteBuffer.getInt();
            for (int i6 = 0; i6 < i5; i6++) {
                linkedHashMap.put(Integer.valueOf(byteBuffer.getInt()), bqxo.m113676a(byteBuffer));
            }
            bqxo = null;
        } else {
            bqxo = bqxo.m113676a(byteBuffer);
            i3 = 0;
        }
        bqxs i7 = m113705i();
        i7.mo69447b(c);
        i7.mo69446a(c2);
        i7.mo69448c(i4);
        i7.f141912a = bqxo;
        i7.f141913b = linkedHashMap;
        i7.mo69449d(i3);
        i7.f141914c = bqxu;
        i7.mo69450e(i2);
        bqxt a = i7.mo69445a();
        byteBuffer.position(position);
        return a;
    }

    /* renamed from: i */
    public static bqxs m113705i() {
        return new bqxs();
    }

    /* renamed from: a */
    public abstract int mo69386a();

    /* renamed from: b */
    public abstract int mo69387b();

    /* renamed from: c */
    public abstract int mo69388c();

    /* renamed from: d */
    public abstract bqxo mo69389d();

    /* renamed from: e */
    public abstract Map mo69390e();

    /* renamed from: f */
    public abstract int mo69392f();

    /* renamed from: g */
    public abstract bqxu mo69393g();

    /* renamed from: h */
    public abstract int mo69394h();

    /* renamed from: j */
    public final boolean mo69451j() {
        return (mo69387b() & 1) != 0;
    }

    public final String toString() {
        bqxu g = mo69393g();
        int c = mo69388c();
        bqxf f = g.mo69456f();
        bmxy.m108587a(f, "%s has no parent package.", g.getClass());
        bqxr e = f.mo69403e();
        bmxy.m108587a(e, "%s's parent package has no key pool.", g.getClass());
        return String.format("Entry{key=%s,value=%s,values=%s}", e.mo69443a(c), mo69389d(), mo69390e());
    }

    /* renamed from: k */
    public final byte[] mo69452k() {
        int i;
        int a = mo69386a();
        if (mo69451j()) {
            i = mo69390e().size() * 12;
        } else {
            i = 8;
        }
        ByteBuffer allocate = ByteBuffer.allocate(a + i);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putShort((short) mo69386a());
        allocate.putShort((short) mo69387b());
        allocate.putInt(mo69388c());
        if (mo69451j()) {
            allocate.putInt(mo69392f());
            allocate.putInt(mo69390e().size());
            for (Map.Entry entry : mo69390e().entrySet()) {
                allocate.putInt(((Integer) entry.getKey()).intValue());
                allocate.put(((bqxo) entry.getValue()).mo69438e());
            }
        } else {
            bqxo d = mo69389d();
            bmxy.m108582a(d, "A non-complex TypeChunk entry must have a value.");
            allocate.put(d.mo69438e());
        }
        return allocate.array();
    }
}
