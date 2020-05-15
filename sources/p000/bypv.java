package p000;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* renamed from: bypv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bypv extends bypx {

    /* renamed from: a */
    public final String f167363a;

    public bypv(String str) {
        bmxy.m108581a(str);
        this.f167363a = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo74417a(byqc byqc) {
        try {
            String str = this.f167363a;
            byqc.f167375a.mo74458a(-2);
            byqc.mo74466a((byte) 96, str.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new bypr("Error while encoding CborTextString", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo74418b() {
        return m125078a((byte) 96);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        bypx bypx = (bypx) obj;
        if (mo74418b() != bypx.mo74418b()) {
            return mo74418b() - bypx.mo74418b();
        }
        bypv bypv = (bypv) bypx;
        if (this.f167363a.length() != bypv.f167363a.length()) {
            return this.f167363a.length() - bypv.f167363a.length();
        }
        return this.f167363a.compareTo(bypv.f167363a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f167363a.equals(((bypv) obj).f167363a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(mo74418b()), this.f167363a});
    }

    public final String toString() {
        String str = this.f167363a;
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append("\"");
        sb.append(str);
        sb.append("\"");
        return sb.toString();
    }
}
