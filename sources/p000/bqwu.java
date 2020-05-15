package p000;

import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: bqwu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bqwu {

    /* renamed from: a */
    public final bqwu f141786a;

    /* renamed from: b */
    protected final int f141787b;

    /* renamed from: c */
    protected final int f141788c;

    /* renamed from: d */
    protected final int f141789d;

    protected bqwu(ByteBuffer byteBuffer, bqwu bqwu) {
        this.f141786a = bqwu;
        this.f141789d = byteBuffer.position() - 2;
        this.f141787b = (char) byteBuffer.getShort();
        this.f141788c = byteBuffer.getInt();
    }

    /* renamed from: a */
    protected static int m113573a(DataOutput dataOutput, int i) {
        while (i % 4 != 0) {
            dataOutput.write(0);
            i++;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo69396a(DataOutput dataOutput, ByteBuffer byteBuffer) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo69397a(ByteBuffer byteBuffer) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public short mo69398b() {
        return mo69400h().f141785q;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public final byte[] mo69399c() {
        ByteBuffer order = ByteBuffer.allocate(this.f141787b).order(ByteOrder.LITTLE_ENDIAN);
        int position = order.position();
        order.putShort(mo69398b());
        order.putShort((short) this.f141787b);
        boolean z = false;
        order.putInt(0);
        mo69397a(order);
        int position2 = order.position() - position;
        int i = this.f141787b;
        if (position2 == i) {
            z = true;
        }
        bmxy.m108603b(z, "Written header is wrong size. Got %s, want %s", position2, i);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bobm bobm = new bobm(byteArrayOutputStream);
        try {
            mo69396a(bobm, order);
            boax.m111028a(bobm);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            int length = this.f141787b + byteArray.length;
            order.putInt(4, length);
            ByteBuffer order2 = ByteBuffer.allocate(length).order(ByteOrder.LITTLE_ENDIAN);
            order2.put(order.array());
            order2.put(byteArray);
            return order2.array();
        } catch (Throwable th) {
            boax.m111028a(bobm);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract bqwt mo69400h();
}
