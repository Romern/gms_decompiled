package p000;

/* renamed from: bkoo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkoo implements bkou {

    /* renamed from: a */
    final /* synthetic */ bkok f125027a;

    public bkoo(bkok bkok) {
        this.f125027a = bkok;
    }

    /* renamed from: a */
    public final void mo66151a() {
        this.f125027a.mo66167a(6);
    }

    /* renamed from: a */
    public final void mo66152a(bkos bkos) {
        this.f125027a.mo66168a(1, bkos.f125032a, -1);
    }

    /* renamed from: a */
    public final void mo66153a(bkot bkot) {
        int i = bkot.f125034b;
        if (i != 200) {
            StringBuilder sb = new StringBuilder(49);
            sb.append("Server returned non-OK response code: ");
            sb.append(i);
            this.f125027a.mo66168a(2, new IllegalStateException(sb.toString()), bkot.f125034b);
            return;
        }
        this.f125027a.mo66167a(3);
    }

    /* renamed from: a */
    public final void mo66154a(CharSequence charSequence, int i, int i2) {
        synchronized (this.f125027a) {
            while (i < i2) {
                char charAt = charSequence.charAt(i);
                if (charAt == '1') {
                    bkok bkok = this.f125027a;
                    int i3 = bkok.f125011a + 1;
                    bkok.f125011a = i3;
                    if (i3 == 1) {
                        bkok.f125012b = System.currentTimeMillis();
                    }
                    bkok bkok2 = this.f125027a;
                    long j = (long) bkok2.f125011a;
                    if (j == 5) {
                        bkok2.mo66167a(4);
                    } else if (j > 5) {
                        bkok2.mo66168a(4, new IllegalStateException("Too many stage one responses received."), -1);
                    }
                } else if (charAt != '2') {
                    String valueOf = String.valueOf(charSequence);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
                    sb.append("Unexpected response from server: ");
                    sb.append(valueOf);
                    this.f125027a.mo66168a(4, new IllegalStateException(sb.toString()), -1);
                } else {
                    this.f125027a.mo66167a(5);
                    this.f125027a.f125013c = System.currentTimeMillis();
                }
                i++;
            }
        }
    }
}
