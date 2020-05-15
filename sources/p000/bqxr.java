package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: bqxr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bqxr extends bqwu {

    /* renamed from: e */
    protected final int f141907e;

    /* renamed from: f */
    protected final int f141908f;

    /* renamed from: g */
    protected final List f141909g = new ArrayList();

    /* renamed from: h */
    protected List f141910h = new ArrayList();

    /* renamed from: i */
    private final int f141911i;

    protected bqxr(ByteBuffer byteBuffer, bqwu bqwu) {
        super(byteBuffer, bqwu);
        this.f141907e = byteBuffer.getInt();
        this.f141908f = byteBuffer.getInt();
        this.f141911i = byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
    }

    /* renamed from: e */
    private final int m113691e() {
        return (this.f141909g.size() + this.f141910h.size()) * 4;
    }

    /* renamed from: a */
    public final String mo69443a(int i) {
        return (String) this.f141909g.get(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo69406b(DataOutput dataOutput, ByteBuffer byteBuffer) {
        HashMap hashMap = new HashMap();
        List list = this.f141909g;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            String str = (String) list.get(i2);
            bqxj d = mo69444d();
            byte[] bytes = str.getBytes(d.f141882c);
            int length = bytes.length;
            boat a = boav.m111015a(length + 5);
            bqxk.m113669a(a, str.length(), d);
            if (d == bqxj.UTF8) {
                bqxk.m113669a(a, length, d);
            }
            a.write(bytes);
            if (d == bqxj.UTF8) {
                a.write(0);
            } else {
                a.writeShort(0);
            }
            byte[] a2 = a.mo68819a();
            dataOutput.write(a2);
            hashMap.put(str, Integer.valueOf(i));
            byteBuffer.putInt(i);
            i += a2.length;
        }
        return bqwu.m113573a(dataOutput, i);
    }

    /* renamed from: d */
    public final bqxj mo69444d() {
        return (this.f141911i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? bqxj.UTF8 : bqxj.UTF16;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final bqwt mo69400h() {
        return bqwt.STRING_POOL;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo69396a(DataOutput dataOutput, ByteBuffer byteBuffer) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteBuffer allocate = ByteBuffer.allocate(m113691e());
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        bobm bobm = new bobm(byteArrayOutputStream);
        try {
            int b = mo69406b(bobm, allocate);
            if (this.f141910h.size() > 0) {
                HashMap hashMap = new HashMap();
                int i = 0;
                for (bqxq bqxq : this.f141910h) {
                    byte[] b2 = bqxq.mo69441b();
                    bobm.write(b2);
                    hashMap.put(bqxq, Integer.valueOf(i));
                    allocate.putInt(i);
                    i += b2.length;
                }
                bobm.writeInt(-1);
                bobm.writeInt(-1);
                bqwu.m113573a(bobm, i + 8);
            }
            boax.m111028a(bobm);
            dataOutput.write(allocate.array());
            dataOutput.write(byteArrayOutputStream.toByteArray());
            if (!this.f141910h.isEmpty()) {
                byteBuffer.putInt(24, this.f141787b + m113691e() + b);
            }
        } catch (Throwable th) {
            boax.m111028a(bobm);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69397a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.f141909g.size());
        byteBuffer.putInt(this.f141910h.size());
        byteBuffer.putInt(this.f141911i);
        byteBuffer.putInt(this.f141787b + m113691e());
        byteBuffer.putInt(0);
    }
}
