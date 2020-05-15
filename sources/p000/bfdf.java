package p000;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: bfdf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfdf {

    /* renamed from: a */
    private final String f113470a;

    /* renamed from: b */
    private long f113471b = -1;

    /* renamed from: c */
    private DataInputStream f113472c;

    /* renamed from: d */
    private int f113473d = 0;

    /* renamed from: e */
    private boolean f113474e = false;

    /* renamed from: f */
    private Integer f113475f;

    /* renamed from: g */
    private final bfmf f113476g;

    public bfdf(String str, bfmf bfmf) {
        this.f113470a = str;
        this.f113476g = bfmf;
    }

    /* renamed from: c */
    private final void m96430c() {
        try {
            mo61461b();
        } catch (IOException e) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        if (r0.intValue() != 3) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009a, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b0, code lost:
        m96430c();
        r1 = java.lang.String.valueOf(r8.f113470a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c1, code lost:
        if (r1.length() == 0) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c3, code lost:
        r1 = new java.lang.String("Unexpected end of file ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c9, code lost:
        r1 = "Unexpected end of file ".concat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d0, code lost:
        throw new p000.bfde(r1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00af A[Catch:{ EOFException -> 0x00af }, ExcHandler: EOFException (e java.io.EOFException), Splitter:B:12:0x0049] */
    /* renamed from: a */
    public final synchronized byte[] mo61460a() {
        if (this.f113471b == -1) {
            File file = new File(this.f113470a);
            if (file.exists()) {
                this.f113472c = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
                this.f113474e = false;
                this.f113471b = file.length();
            } else {
                throw new FileNotFoundException(String.format("Could not found file %s.", this.f113470a));
            }
        }
        if (this.f113474e) {
            return null;
        }
        try {
            Integer num = this.f113475f;
            if (num == null) {
            }
            Integer valueOf = Integer.valueOf(this.f113472c.readInt());
            this.f113475f = valueOf;
            int i = this.f113473d + 4;
            this.f113473d = i;
            if (((long) i) == this.f113471b || valueOf.intValue() < 3) {
                m96430c();
                return null;
            }
            bfme a = this.f113476g.mo61917a(this.f113472c);
            byte[] bArr = a.f114390b;
            int i2 = a.f114389a;
            byte[] b = bfib.m96844b(bArr);
            int i3 = this.f113473d + i2;
            this.f113473d = i3;
            if (((long) i3) == this.f113471b) {
                m96430c();
            }
        } catch (IOException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            throw new bfde(message);
        } catch (EOFException e2) {
        } catch (IOException e3) {
            m96430c();
            throw e3;
        }
    }

    /* renamed from: b */
    public final void mo61461b() {
        DataInputStream dataInputStream;
        if (!this.f113474e && (dataInputStream = this.f113472c) != null) {
            dataInputStream.close();
            this.f113474e = true;
        }
    }
}
