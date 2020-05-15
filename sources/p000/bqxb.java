package p000;

import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: bqxb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqxb extends bqxr implements bqww {

    /* renamed from: i */
    private boolean f141799i = true;

    protected bqxb(bobl bobl, bqwu bqwu) {
        super(bqwx.m113586b(bobl), bqwu);
    }

    /* renamed from: b */
    private static int m113597b(DataOutput dataOutput, int i) {
        if (i > 127) {
            dataOutput.write(((i & 32512) >> 8) | 128);
        }
        dataOutput.write(i & 255);
        return i > 127 ? 2 : 1;
    }

    /* renamed from: a */
    public final void mo69401a() {
        this.f141799i = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69396a(DataOutput dataOutput, ByteBuffer byteBuffer) {
        int i;
        if (this.f141799i) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < this.f141909g.size()) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bobm bobm = new bobm(byteArrayOutputStream);
                int i4 = 0;
                while (i4 < 2097152 && i2 < this.f141909g.size()) {
                    byte[] bytes = ((String) this.f141909g.get(i2)).getBytes(mo69444d().f141882c);
                    int length = bytes.length;
                    bmxy.m108600b(((short) length) == length);
                    bobm.writeShort(length);
                    bobm.write(bytes);
                    i4 += length + 2;
                    i2++;
                }
                dataOutput.writeInt(i4);
                dataOutput.write(byteArrayOutputStream.toByteArray());
                i3 += i4 + 4;
            }
            dataOutput.writeInt(0);
            int i5 = i3 + 4;
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            bobm bobm2 = new bobm(byteArrayOutputStream2);
            List list = this.f141910h;
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                bobm2.write(((bqxq) list.get(i6)).mo69441b());
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            int length2 = byteArray.length;
            int i7 = (length2 + i5) % 4;
            if (i7 != 0) {
                i = (4 - i7) + length2;
            } else {
                i = length2;
            }
            dataOutput.writeInt(i);
            dataOutput.write(byteArray);
            bqwu.m113573a(dataOutput, i5 + 4 + length2);
            return;
        }
        super.mo69396a(dataOutput, byteBuffer);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo69406b(DataOutput dataOutput, ByteBuffer byteBuffer) {
        if (mo69444d() != bqxj.UTF8) {
            return super.mo69406b(dataOutput, byteBuffer);
        }
        List list = this.f141909g;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            String str = (String) list.get(i2);
            byte[] bytes = str.getBytes(bmwy.f131158c);
            int b = m113597b(dataOutput, str.length());
            int length = bytes.length;
            int b2 = m113597b(dataOutput, length);
            dataOutput.write(bytes);
            dataOutput.write(0);
            byteBuffer.putInt(i);
            i += b + b2 + length + 1;
        }
        return bqwu.m113573a(dataOutput, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final short mo69398b() {
        return (short) (this.f141799i ? bqwt.STRING_POOL.f141785q | 4096 : bqwt.STRING_POOL.f141785q);
    }
}
