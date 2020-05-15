package p000;

import java.io.IOException;

/* renamed from: cipo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cipo implements ciqq {

    /* renamed from: a */
    final /* synthetic */ ciqq f191199a;

    /* renamed from: b */
    final /* synthetic */ cipr f191200b;

    public cipo(cipr cipr, ciqq ciqq) {
        this.f191200b = cipr;
        this.f191199a = ciqq;
    }

    /* renamed from: a */
    public final void mo74930a(cipu cipu, long j) {
        ciqu.m150905a(cipu.f191213b, 0, j);
        while (true) {
            long j2 = 0;
            if (j > 0) {
                ciqn ciqn = cipu.f191212a;
                while (true) {
                    if (j2 >= 65536) {
                        break;
                    }
                    j2 += (long) (ciqn.f191252c - ciqn.f191251b);
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    }
                    ciqn = ciqn.f191255f;
                }
                this.f191200b.mo86273c();
                try {
                    this.f191199a.mo74930a(cipu, j2);
                    j -= j2;
                    this.f191200b.mo86271a(true);
                } catch (IOException e) {
                    throw this.f191200b.mo86272b(e);
                } catch (Throwable th) {
                    this.f191200b.mo86271a(false);
                    throw th;
                }
            } else {
                return;
            }
        }
    }

    public final void close() {
        this.f191200b.mo86273c();
        try {
            this.f191199a.close();
            this.f191200b.mo86271a(true);
        } catch (IOException e) {
            throw this.f191200b.mo86272b(e);
        } catch (Throwable th) {
            this.f191200b.mo86271a(false);
            throw th;
        }
    }

    /* renamed from: df */
    public final ciqt mo74932df() {
        return this.f191200b;
    }

    public final void flush() {
        this.f191200b.mo86273c();
        try {
            this.f191199a.flush();
            this.f191200b.mo86271a(true);
        } catch (IOException e) {
            throw this.f191200b.mo86272b(e);
        } catch (Throwable th) {
            this.f191200b.mo86271a(false);
            throw th;
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f191199a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
        sb.append("AsyncTimeout.sink(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
