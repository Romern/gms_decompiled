package p000;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: cef */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class cef implements cdt {

    /* renamed from: a */
    private final Uri f6608a;

    /* renamed from: b */
    private final ContentResolver f6609b;

    /* renamed from: c */
    private Object f6610c;

    public cef(ContentResolver contentResolver, Uri uri) {
        this.f6609b = contentResolver;
        this.f6608a = uri;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo3748a(Uri uri, ContentResolver contentResolver);

    /* renamed from: a */
    public final void mo3751a(cbs cbs, cds cds) {
        try {
            Object a = mo3748a(this.f6608a, this.f6609b);
            this.f6610c = a;
            cds.mo3762a(a);
        } catch (FileNotFoundException e) {
            cds.mo3761a((Exception) e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo3749a(Object obj);

    /* renamed from: b */
    public final void mo3753b() {
        Object obj = this.f6610c;
        if (obj != null) {
            try {
                mo3749a(obj);
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: c */
    public final void mo3754c() {
    }

    /* renamed from: d */
    public final int mo3755d() {
        return 1;
    }
}
