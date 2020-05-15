package p000;

import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: bqxu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bqxu extends bqwu {

    /* renamed from: e */
    public final int f141920e;

    /* renamed from: f */
    public final int f141921f;

    /* renamed from: g */
    protected final Map f141922g = new TreeMap();

    /* renamed from: h */
    private final int f141923h;

    /* renamed from: i */
    private final int f141924i;

    /* renamed from: j */
    private final bqxi f141925j;

    protected bqxu(ByteBuffer byteBuffer, bqwu bqwu) {
        super(byteBuffer, bqwu);
        this.f141923h = bqcw.m112606a(byteBuffer.get());
        this.f141924i = bqcw.m112606a(byteBuffer.get());
        byteBuffer.position(byteBuffer.position() + 2);
        this.f141920e = byteBuffer.getInt();
        this.f141921f = byteBuffer.getInt();
        this.f141925j = bqxi.m113637a(byteBuffer);
    }

    /* renamed from: g */
    private final int m113716g() {
        return this.f141920e * 4;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo69396a(DataOutput dataOutput, ByteBuffer byteBuffer) {
        int i;
        boolean z;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteBuffer order = ByteBuffer.allocate(m113716g()).order(ByteOrder.LITTLE_ENDIAN);
        bobm bobm = new bobm(byteArrayOutputStream);
        try {
            if (mo69454d()) {
                i = 0;
                for (Map.Entry entry : this.f141922g.entrySet()) {
                    byte[] k = ((bqxt) entry.getValue()).mo69452k();
                    bobm.write(k);
                    order.putShort((short) ((char) ((Integer) entry.getKey()).intValue()));
                    order.putShort((short) (i / 4));
                    i += k.length;
                    if (i % 4 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bmxy.m108600b(z);
                }
            } else {
                int i2 = 0;
                for (int i3 = 0; i3 < this.f141920e; i3++) {
                    bqxt bqxt = (bqxt) this.f141922g.get(Integer.valueOf(i3));
                    if (bqxt != null) {
                        byte[] k2 = bqxt.mo69452k();
                        bobm.write(k2);
                        order.putInt(i2);
                        i2 += k2.length;
                    } else {
                        order.putInt(-1);
                    }
                }
                i = i2;
            }
            bqwu.m113573a(bobm, i);
            boax.m111028a(bobm);
            dataOutput.write(order.array());
            dataOutput.write(byteArrayOutputStream.toByteArray());
        } catch (Throwable th) {
            boax.m111028a(bobm);
            throw th;
        }
    }

    /* renamed from: d */
    public final boolean mo69454d() {
        return (this.f141924i & 1) != 0;
    }

    /* renamed from: e */
    public final String mo69455e() {
        bqxf f = mo69456f();
        bmxy.m108587a(f, "%s has no parent package.", getClass());
        int i = this.f141923h;
        bqxr d = f.mo69402d();
        bmxy.m108582a(d, "Package has no type pool.");
        boolean z = d.f141909g.size() >= i;
        StringBuilder sb = new StringBuilder(27);
        sb.append("No type for id: ");
        sb.append(i);
        bmxy.m108601b(z, sb.toString());
        return d.mo69443a(i - 1);
    }

    /* renamed from: f */
    public final bqxf mo69456f() {
        bqwu bqwu = this.f141786a;
        while (bqwu != null && !(bqwu instanceof bqxf)) {
            bqwu = bqwu.f141786a;
        }
        if (bqwu == null || !(bqwu instanceof bqxf)) {
            return null;
        }
        return (bqxf) bqwu;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final bqwt mo69400h() {
        return bqwt.TABLE_TYPE;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TypeChunk[id:");
        sb.append(this.f141923h);
        sb.append(", typeName:");
        sb.append(mo69455e());
        sb.append(", configuration:");
        sb.append(this.f141925j);
        sb.append(", originalEntryCount:");
        sb.append(this.f141920e);
        sb.append(", entries:");
        for (Map.Entry entry : this.f141922g.entrySet()) {
            sb.append("<");
            sb.append(entry.getKey());
            sb.append("->");
            sb.append(entry.getValue());
            sb.append("> ");
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69397a(ByteBuffer byteBuffer) {
        int i = this.f141787b;
        int g = m113716g();
        byteBuffer.put(bqcw.m112604a((long) this.f141923h));
        byteBuffer.put(bqcw.m112604a((long) this.f141924i));
        byteBuffer.putShort(0);
        byteBuffer.putInt(this.f141920e);
        byteBuffer.putInt(i + g);
        bqxi bqxi = this.f141925j;
        ByteBuffer order = ByteBuffer.allocate(bqxi.mo69345a()).order(ByteOrder.LITTLE_ENDIAN);
        order.putInt(bqxi.mo69345a());
        order.putShort((short) bqxi.mo69346b());
        order.putShort((short) bqxi.mo69347c());
        order.put(bqxi.mo69348d());
        order.put(bqxi.mo69349e());
        order.put((byte) bqxi.mo69351f());
        order.put((byte) bqxi.mo69352g());
        order.putShort((short) bqxi.mo69353h());
        order.put((byte) bqxi.mo69355i());
        order.put((byte) bqxi.mo69356j());
        order.put((byte) bqxi.mo69357k());
        order.put((byte) 0);
        order.putShort((short) bqxi.mo69358l());
        order.putShort((short) bqxi.mo69359m());
        order.putShort((short) bqxi.mo69360n());
        order.putShort((short) bqxi.mo69361o());
        if (bqxi.mo69345a() >= 32) {
            order.put((byte) bqxi.mo69362p());
            order.put((byte) bqxi.mo69363q());
            order.putShort((short) bqxi.mo69364r());
        }
        if (bqxi.mo69345a() >= 36) {
            order.putShort((short) bqxi.mo69365s());
            order.putShort((short) bqxi.mo69366t());
        }
        if (bqxi.mo69345a() >= 48) {
            order.put(bqxi.mo69367u());
            order.put(bqxi.mo69368v());
        }
        if (bqxi.mo69345a() >= 52) {
            order.put((byte) bqxi.mo69369w());
            order.put((byte) bqxi.mo69370x());
            order.putShort(0);
        }
        order.put(bqxi.mo69371y());
        byteBuffer.put(order.array());
    }
}
