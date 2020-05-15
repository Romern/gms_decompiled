package p000;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* renamed from: ciic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciic extends InputStream implements chsj {

    /* renamed from: a */
    public bxxc f190395a;

    /* renamed from: b */
    public final bxxk f190396b;

    /* renamed from: c */
    public ByteArrayInputStream f190397c;

    public ciic(bxxc bxxc, bxxk bxxk) {
        this.f190395a = bxxc;
        this.f190396b = bxxk;
    }

    public final int available() {
        bxxc bxxc = this.f190395a;
        if (bxxc != null) {
            return bxxc.mo74145db();
        }
        ByteArrayInputStream byteArrayInputStream = this.f190397c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    public final int read() {
        bxxc bxxc = this.f190395a;
        if (bxxc != null) {
            this.f190397c = new ByteArrayInputStream(bxxc.serializeToBytes());
            this.f190395a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f190397c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    public final int read(byte[] bArr, int i, int i2) {
        bxxc bxxc = this.f190395a;
        if (bxxc != null) {
            int db = bxxc.mo74145db();
            if (db == 0) {
                this.f190395a = null;
                this.f190397c = null;
                return -1;
            } else if (i2 < db) {
                this.f190397c = new ByteArrayInputStream(this.f190395a.serializeToBytes());
                this.f190395a = null;
            } else {
                bxuk c = bxuk.m123644c(bArr, i, db);
                this.f190395a.mo73644a(c);
                c.mo73868d();
                this.f190395a = null;
                this.f190397c = null;
                return db;
            }
        }
        ByteArrayInputStream byteArrayInputStream = this.f190397c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i, i2);
        }
        return -1;
    }
}
