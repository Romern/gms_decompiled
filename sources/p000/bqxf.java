package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.DataOutput;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.HashMap;

/* renamed from: bqxf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bqxf extends bqwv {

    /* renamed from: f */
    private int f141804f;

    /* renamed from: g */
    private final int f141805g;

    /* renamed from: h */
    public String f141806h;

    /* renamed from: i */
    protected final int f141807i;

    /* renamed from: j */
    protected final int f141808j;

    /* renamed from: k */
    private final int f141809k;

    /* renamed from: l */
    private final int f141810l;

    protected bqxf(ByteBuffer byteBuffer, bqwu bqwu) {
        super(byteBuffer, bqwu);
        int i;
        new HashMap();
        new HashMap();
        this.f141804f = byteBuffer.getInt();
        int position = byteBuffer.position();
        byte[] array = byteBuffer.array();
        int i2 = position;
        while (true) {
            i = 0;
            if (i2 >= array.length || i2 >= position + PSKKeyManager.MAX_KEY_LENGTH_BYTES) {
                break;
            } else if (array[i2] == 0 && array[i2 + 1] == 0) {
                i = i2 - position;
                break;
            } else {
                i2 += 2;
            }
        }
        String str = new String(array, position, i, Charset.forName("UTF-16LE"));
        byteBuffer.position(position + PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        this.f141806h = str;
        this.f141807i = byteBuffer.getInt();
        this.f141805g = byteBuffer.getInt();
        this.f141808j = byteBuffer.getInt();
        this.f141809k = byteBuffer.getInt();
        this.f141810l = byteBuffer.getInt();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo69396a(DataOutput dataOutput, ByteBuffer byteBuffer) {
        int i = this.f141807i;
        int i2 = this.f141808j;
        int i3 = 0;
        for (bqwu bqwu : this.f141790e.values()) {
            if (bqwu == mo69402d()) {
                i = i3 + this.f141787b;
            } else if (bqwu == mo69403e()) {
                i2 = i3 + this.f141787b;
            }
            byte[] c = bqwu.mo69399c();
            dataOutput.write(c);
            i3 = bqwu.m113573a(dataOutput, c.length);
        }
        byteBuffer.putInt(268, i);
        byteBuffer.putInt(276, i2);
    }

    /* renamed from: d */
    public bqxr mo69402d() {
        bqwu bqwu = (bqwu) this.f141790e.get(Integer.valueOf(this.f141807i + this.f141789d));
        bmxy.m108581a(bqwu);
        bmxy.m108601b(bqwu instanceof bqxr, "Type string pool not found.");
        return (bqxr) bqwu;
    }

    /* renamed from: e */
    public bqxr mo69403e() {
        bqwu bqwu = (bqwu) this.f141790e.get(Integer.valueOf(this.f141808j + this.f141789d));
        bmxy.m108581a(bqwu);
        bmxy.m108601b(bqwu instanceof bqxr, "Key string pool not found.");
        return (bqxr) bqwu;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final bqwt mo69400h() {
        return bqwt.TABLE_PACKAGE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69397a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.f141804f);
        byte[] bytes = this.f141806h.getBytes(Charset.forName("UTF-16LE"));
        int length = bytes.length;
        byteBuffer.put(bytes, 0, Math.min(length, (int) PSKKeyManager.MAX_KEY_LENGTH_BYTES));
        if (length < 256) {
            byteBuffer.put(new byte[(PSKKeyManager.MAX_KEY_LENGTH_BYTES - length)]);
        }
        byteBuffer.putInt(0);
        byteBuffer.putInt(this.f141805g);
        byteBuffer.putInt(0);
        byteBuffer.putInt(this.f141809k);
        byteBuffer.putInt(this.f141810l);
    }
}
