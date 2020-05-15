package p000;

import java.io.IOException;

/* renamed from: cipp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cipp implements ciqr {

    /* renamed from: a */
    final /* synthetic */ ciqr f191201a;

    /* renamed from: b */
    final /* synthetic */ cipr f191202b;

    public cipp(cipr cipr, ciqr ciqr) {
        this.f191202b = cipr;
        this.f191201a = ciqr;
    }

    /* renamed from: c */
    public final long mo74995c(cipu cipu, long j) {
        this.f191202b.mo86273c();
        try {
            long c = this.f191201a.mo74995c(cipu, j);
            this.f191202b.mo86271a(true);
            return c;
        } catch (IOException e) {
            throw this.f191202b.mo86272b(e);
        } catch (Throwable th) {
            this.f191202b.mo86271a(false);
            throw th;
        }
    }

    public final void close() {
        this.f191202b.mo86273c();
        try {
            this.f191201a.close();
            this.f191202b.mo86271a(true);
        } catch (IOException e) {
            throw this.f191202b.mo86272b(e);
        } catch (Throwable th) {
            this.f191202b.mo86271a(false);
            throw th;
        }
    }

    /* renamed from: df */
    public final ciqt mo74997df() {
        return this.f191202b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f191201a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append("AsyncTimeout.source(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
