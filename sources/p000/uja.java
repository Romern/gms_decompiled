package p000;

import android.content.ContentValues;

/* renamed from: uja */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uja extends unq {

    /* renamed from: a */
    private final String f47751a;

    public uja(uno uno, String str) {
        super(uno, ujd.f47755a, false);
        sdo.m34977c(str);
        this.f47751a = str;
    }

    /* renamed from: a */
    public final uog mo27514a() {
        return ujc.FILENAME.f47754b.mo27708b(this.f47751a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo27515b(ContentValues contentValues) {
        contentValues.put(ujc.FILENAME.f47754b.mo27700a(), this.f47751a);
    }

    public final String toString() {
        String str = this.f47751a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37);
        sb.append("ContentFileDeletionLock [filename='");
        sb.append(str);
        sb.append("']");
        return sb.toString();
    }
}
