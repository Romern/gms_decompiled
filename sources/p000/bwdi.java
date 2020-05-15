package p000;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;

/* renamed from: bwdi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bwdi extends bwdg {

    /* renamed from: f */
    private String f158897f;

    /* renamed from: g */
    private int f158898g;

    /* renamed from: h */
    private byte[] f158899h;

    protected bwdi(String str) {
        mo73513a(str);
    }

    /* renamed from: m */
    public static final synchronized int m121843m() {
        synchronized (bwdi.class) {
        }
        return 0;
    }

    /* renamed from: a */
    public final synchronized int mo73458a() {
        mo73515l();
        return this.f158899h.length + mo73503f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized void mo73513a(String str) {
        this.f158897f = str;
    }

    /* renamed from: b */
    public final synchronized InputStream mo73459b() {
        mo73515l();
        return new SequenceInputStream(new ByteArrayInputStream(this.f158899h), mo73502e());
    }

    /* renamed from: d */
    public synchronized void mo73500d() {
        this.f158899h = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract InputStream mo73502e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract int mo73503f();

    /* renamed from: k */
    public final synchronized String mo73514k() {
        return this.f158897f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo73515l() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(7);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeInt(mo73503f());
        dataOutputStream.writeByte(0);
        dataOutputStream.writeShort(this.f158898g);
        dataOutputStream.close();
        byteArrayOutputStream.close();
        this.f158899h = byteArrayOutputStream.toByteArray();
    }

    /* renamed from: n */
    public final synchronized void mo73516n() {
        this.f158898g = 257;
    }
}
