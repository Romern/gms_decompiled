package p000;

import android.net.Uri;

/* renamed from: aclf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aclf extends aclg {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract ftv mo32834a();

    /* renamed from: a */
    public final String mo32835a(String str) {
        String valueOf = String.valueOf(Uri.encode(str));
        return valueOf.length() == 0 ? new String("appdatasearch/") : "appdatasearch/".concat(valueOf);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final ftv mo32836b() {
        return mo32834a();
    }
}
