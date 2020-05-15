package p000;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: ahbh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahbh implements behy {

    /* renamed from: a */
    public final rjx f66959a;

    /* renamed from: b */
    private final begs f66960b;

    public ahbh(Context context) {
        begs begs = new begs();
        this.f66959a = ahbp.m55426a(context.getApplicationContext());
        this.f66960b = begs;
    }

    /* renamed from: a */
    private final ParcelFileDescriptor m55391a(Uri uri, int i) {
        return (ParcelFileDescriptor) m55392a("open file", new ahbe(this, uri, i));
    }

    /* renamed from: a */
    public final String mo36259a() {
        return "android";
    }

    /* renamed from: a */
    public final void mo36261a(Uri uri, begn begn) {
        behx.m95075a(this);
    }

    /* renamed from: b */
    public final begs mo36263b() {
        return this.f66960b;
    }

    /* renamed from: c */
    public final OutputStream mo36265c(Uri uri) {
        return new ahbg(m55391a(uri, 1));
    }

    /* renamed from: d */
    public final void mo36266d(Uri uri) {
        m55392a("delete file", new ahbc(this, uri));
    }

    /* renamed from: e */
    public final OutputStream mo36267e(Uri uri) {
        throw new begy("openForAppend not supported by android");
    }

    /* renamed from: f */
    public final void mo36268f(Uri uri) {
        throw new begy("deleteDirectory not supported by android");
    }

    /* renamed from: g */
    public final boolean mo36269g(Uri uri) {
        throw new begy("isDirectory not supported by android");
    }

    /* renamed from: h */
    public final void mo36270h(Uri uri) {
        throw new begy("createDirectory not supported by android");
    }

    /* renamed from: i */
    public final long mo36271i(Uri uri) {
        throw new begy("fileSize not supported by android");
    }

    /* renamed from: j */
    public final Iterable mo36272j(Uri uri) {
        throw new begy("children not supported by android");
    }

    /* renamed from: k */
    public final File mo36273k(Uri uri) {
        String valueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
        sb.append("Cannot convert uri to file android ");
        sb.append(valueOf);
        throw new begy(sb.toString());
    }

    /* renamed from: a */
    private static final Object m55392a(String str, Callable callable) {
        try {
            return callable.call();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException(str.length() == 0 ? new String("Unable to ") : "Unable to ".concat(str), e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof rjp) {
                rjp rjp = (rjp) cause;
                if (rjp.mo24655a() == 33500) {
                    String b = rjp.mo24656b();
                    StringBuilder sb = new StringBuilder(str.length() + 19 + String.valueOf(b).length());
                    sb.append("Unable to ");
                    sb.append(str);
                    sb.append(" because ");
                    sb.append(b);
                    throw new FileNotFoundException(sb.toString());
                } else if (rjp.mo24655a() == 10 && !TextUtils.isEmpty(rjp.mo24656b()) && rjp.mo24656b().startsWith("File not found:")) {
                    String b2 = rjp.mo24656b();
                    StringBuilder sb2 = new StringBuilder(str.length() + 19 + String.valueOf(b2).length());
                    sb2.append("Unable to ");
                    sb2.append(str);
                    sb2.append(" because ");
                    sb2.append(b2);
                    throw new FileNotFoundException(sb2.toString());
                }
            }
            throw new IOException(str.length() == 0 ? new String("Unable to ") : "Unable to ".concat(str), e2);
        } catch (Exception e3) {
            throw new IOException(str.length() == 0 ? new String("Unable to ") : "Unable to ".concat(str), e3);
        }
    }

    /* renamed from: b */
    public final InputStream mo36264b(Uri uri) {
        return new ahbf(m55391a(uri, 0));
    }

    /* renamed from: a */
    public final void mo36260a(Uri uri, Uri uri2) {
        m55392a("rename file", new ahbd(this, uri, uri2));
    }

    /* renamed from: a */
    public final boolean mo36262a(Uri uri) {
        try {
            ParcelFileDescriptor a = m55391a(uri, 0);
            if (a == null) {
                return true;
            }
            a.close();
            return true;
        } catch (FileNotFoundException e) {
            return false;
        }
    }
}
