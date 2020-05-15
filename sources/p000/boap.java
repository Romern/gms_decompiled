package p000;

import java.nio.charset.Charset;

/* renamed from: boap */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boap extends boaw {

    /* renamed from: a */
    public final Charset f132473a;

    /* renamed from: b */
    public final /* synthetic */ boaq f132474b;

    public boap(boaq boaq, Charset charset) {
        this.f132474b = boaq;
        bmxy.m108581a(charset);
        this.f132473a = charset;
    }

    /* renamed from: a */
    public final String mo68797a() {
        return new String(this.f132474b.mo68799a(), this.f132473a);
    }

    public final String toString() {
        String obj = this.f132474b.toString();
        String valueOf = String.valueOf(this.f132473a);
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 15 + String.valueOf(valueOf).length());
        sb.append(obj);
        sb.append(".asCharSource(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
