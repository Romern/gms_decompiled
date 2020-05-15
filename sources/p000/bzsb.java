package p000;

import java.io.InputStream;

/* renamed from: bzsb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzsb {

    /* renamed from: a */
    public final int f171220a;

    /* renamed from: b */
    public final bzsa f171221b;

    /* renamed from: c */
    public final InputStream f171222c;

    public bzsb(int i, bzsa bzsa, InputStream inputStream) {
        this.f171220a = i;
        this.f171221b = bzsa;
        this.f171222c = inputStream;
    }

    /* renamed from: a */
    public final String mo74565a() {
        String c = this.f171221b.mo74563c("X-GUploader-UploadID");
        int i = this.f171220a;
        String valueOf = String.valueOf(this.f171221b);
        String str = c != null ? c.length() == 0 ? new String("\n Upload id: ") : "\n Upload id: ".concat(c) : "\n No upload id.";
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30 + String.valueOf(str).length());
        sb.append("HttpResponse:\n   ");
        sb.append(i);
        sb.append("  ");
        sb.append(valueOf);
        sb.append(str);
        return sb.toString();
    }
}
