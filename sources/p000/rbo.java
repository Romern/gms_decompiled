package p000;

import java.util.Arrays;

/* renamed from: rbo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rbo implements rbp {
    /* renamed from: a */
    public final void mo24439a() {
    }

    /* renamed from: a */
    public final void mo24440a(int i) {
    }

    /* renamed from: a */
    public final void mo24443a(caik caik) {
    }

    /* renamed from: a */
    public final void mo24444a(caik caik, int i) {
    }

    /* renamed from: a */
    public final void mo24445a(caik caik, long j) {
    }

    /* renamed from: a */
    public final void mo24448a(rdp rdp) {
    }

    /* renamed from: b */
    public final void mo24449b(caik caik, int i) {
    }

    /* renamed from: b */
    public final void mo24450b(caik caik, long j) {
    }

    /* renamed from: c */
    public final void mo24453c(caik caik, long j) {
    }

    public final void close() {
    }

    /* renamed from: a */
    public final void mo24441a(int i, String str) {
        StringBuilder sb = new StringBuilder(38);
        sb.append("Get auth token with status ");
        sb.append(i);
        sb.toString();
    }

    /* renamed from: a */
    public final void mo24442a(int i, byte[] bArr) {
        String arrays = Arrays.toString(bArr);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 69);
        sb.append("Failed to parse LogResponse with status code: ");
        sb.append(i);
        sb.append(" and bytes: ");
        sb.append(arrays);
        sb.toString();
    }

    /* renamed from: a */
    public final void mo24446a(String str) {
        if (str.length() == 0) {
            new String("Increment counter of ");
        } else {
            "Increment counter of ".concat(str);
        }
    }

    /* renamed from: a */
    public final void mo24447a(rdj rdj) {
        if (rdj != null) {
            rdj.toString();
        }
    }
}
