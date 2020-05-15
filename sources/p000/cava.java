package p000;

import java.io.IOException;

/* renamed from: cava */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class cava extends cipz {

    /* renamed from: a */
    private boolean f176114a;

    public cava(ciqq ciqq) {
        super(ciqq);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo74929a() {
    }

    public final void close() {
        if (!this.f176114a) {
            try {
                this.f191222b.close();
            } catch (IOException e) {
                this.f176114a = true;
                mo74929a();
            }
        }
    }

    public final void flush() {
        if (!this.f176114a) {
            try {
                this.f191222b.flush();
            } catch (IOException e) {
                this.f176114a = true;
                mo74929a();
            }
        }
    }

    /* renamed from: a */
    public final void mo74930a(cipu cipu, long j) {
        if (!this.f176114a) {
            try {
                this.f191222b.mo74930a(cipu, j);
            } catch (IOException e) {
                this.f176114a = true;
                mo74929a();
            }
        } else {
            cipu.mo86317h(j);
        }
    }
}
