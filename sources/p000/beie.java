package p000;

import android.net.Uri;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

/* renamed from: beie */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beie implements beid {
    /* renamed from: a */
    public final InputStream mo60716a(Uri uri, InputStream inputStream) {
        return new InflaterInputStream(inputStream);
    }

    /* renamed from: a */
    public final OutputStream mo60718a(OutputStream outputStream) {
        return beic.m95112a(this, outputStream);
    }

    /* renamed from: a */
    public final String mo60719a() {
        return "compress";
    }

    /* renamed from: b */
    public final void mo60720b() {
    }

    /* renamed from: c */
    public final void mo60721c() {
    }

    /* renamed from: a */
    public final OutputStream mo60717a(Uri uri, OutputStream outputStream) {
        return new DeflaterOutputStream(outputStream);
    }
}
