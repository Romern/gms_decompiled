package p000;

import com.felicanetworks.cmnctrl.net.DataParser;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;

/* renamed from: bwdc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwdc extends bwdi {

    /* renamed from: f */
    private static final byte[] f158882f = {0, 0};

    /* renamed from: g */
    private bwcg f158883g;

    /* renamed from: h */
    private byte[] f158884h;

    public bwdc(String str, byte[] bArr) {
        super(str);
        mo73516n();
        mo73501a(bArr);
    }

    /* renamed from: o */
    private final void m121819o() {
        if (this.f158884h == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeShort(mo73499c());
            dataOutputStream.writeUTF(mo73514k());
            dataOutputStream.writeShort(bwdi.m121843m());
            dataOutputStream.writeUTF(DataParser.CONNECT_TYPE_POST);
            dataOutputStream.writeShort(28018);
            dataOutputStream.writeUTF("");
            dataOutputStream.writeUTF("ROOT");
            dataOutputStream.writeByte(0);
            bwcg bwcg = this.f158883g;
            if (bwcg == null || bwcg.mo73458a() <= 0) {
                dataOutputStream.writeInt(0);
            } else {
                dataOutputStream.writeInt(this.f158883g.mo73458a());
                dataOutputStream.writeUTF("g");
            }
            dataOutputStream.close();
            byteArrayOutputStream.close();
            this.f158884h = byteArrayOutputStream.toByteArray();
        }
    }

    /* renamed from: a */
    public final synchronized void mo73498a(int i) {
        super.mo73498a(i);
        this.f158884h = null;
    }

    /* renamed from: d */
    public final synchronized void mo73500d() {
        super.mo73500d();
        this.f158884h = null;
        this.f158883g = null;
    }

    /* renamed from: e */
    public final synchronized InputStream mo73502e() {
        m121819o();
        bwcg bwcg = this.f158883g;
        if (bwcg != null) {
            if (bwcg.mo73458a() != 0) {
                return new SequenceInputStream(new SequenceInputStream(new ByteArrayInputStream(this.f158884h), this.f158883g.mo73459b()), new ByteArrayInputStream(f158882f));
            }
        }
        return new SequenceInputStream(new ByteArrayInputStream(this.f158884h), new ByteArrayInputStream(f158882f));
    }

    /* renamed from: f */
    public final synchronized int mo73503f() {
        int length;
        m121819o();
        length = this.f158884h.length + f158882f.length;
        bwcg bwcg = this.f158883g;
        if (bwcg != null) {
            length += bwcg.mo73458a();
        }
        return length;
    }

    /* renamed from: a */
    public final synchronized void mo73501a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length > 0) {
                this.f158883g = new bwdb(bArr);
            }
        }
        this.f158883g = null;
    }
}
