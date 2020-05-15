package p000;

import android.net.Uri;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/* renamed from: behz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class behz implements behy {
    /* renamed from: a */
    public final void mo36260a(Uri uri, Uri uri2) {
        mo60654c().mo36260a(mo60655l(uri), mo60655l(uri2));
    }

    /* renamed from: a */
    public void mo36261a(Uri uri, begn begn) {
        throw null;
    }

    /* renamed from: a */
    public boolean mo36262a(Uri uri) {
        throw null;
    }

    /* renamed from: b */
    public final begs mo36263b() {
        return mo60654c().mo36263b();
    }

    /* renamed from: b */
    public InputStream mo36264b(Uri uri) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract behy mo60654c();

    /* renamed from: c */
    public final OutputStream mo36265c(Uri uri) {
        return mo60654c().mo36265c(mo60655l(uri));
    }

    /* renamed from: d */
    public final void mo36266d(Uri uri) {
        mo60654c().mo36266d(mo60655l(uri));
    }

    /* renamed from: e */
    public final OutputStream mo36267e(Uri uri) {
        return mo60654c().mo36267e(mo60655l(uri));
    }

    /* renamed from: f */
    public final void mo36268f(Uri uri) {
        mo60654c().mo36268f(mo60655l(uri));
    }

    /* renamed from: g */
    public final boolean mo36269g(Uri uri) {
        return mo60654c().mo36269g(mo60655l(uri));
    }

    /* renamed from: h */
    public final void mo36270h(Uri uri) {
        mo60654c().mo36270h(mo60655l(uri));
    }

    /* renamed from: i */
    public final long mo36271i(Uri uri) {
        return mo60654c().mo36271i(mo60655l(uri));
    }

    /* renamed from: j */
    public final Iterable mo36272j(Uri uri) {
        ArrayList arrayList = new ArrayList();
        for (Uri uri2 : mo60654c().mo36272j(mo60655l(uri))) {
            arrayList.add(mo60656m(uri2));
        }
        return arrayList;
    }

    /* renamed from: k */
    public File mo36273k(Uri uri) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public Uri mo60655l(Uri uri) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public Uri mo60656m(Uri uri) {
        throw null;
    }
}
